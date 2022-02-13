package BussinessObject;

import java.util.ArrayList;

/**
 * @author orlandocamacho
 */
public class Courses {
    
    private static Courses instance;
    private final ArrayList<Course> courses = new ArrayList<>();
    
    /**
     * Singleton constructor that generate all the courses of ISW
     */
    private Courses(){
        firstSemester();
        secondSemester();
        thirdSemester();
        fourthSemester();
        fifthSemester();
        sixthSemester();
        seventhSemester();
        eighthSemester();
    }
    
    /**
     * Get instance of courses
     * @return instance
     */
    public static Courses getInstance(){
        if (instance == null){
            instance = new Courses();
        }
        return instance;
    }

    /**
     * Get the courses list
     * @return Courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    /**
     * Create the courses of the first semester and add them to the general list
     */
    private void firstSemester(){
        courses.add(new Course("Emprendimiento", "001", 1, 3, 5.62));
        courses.add(new Course("Fundamentos de matematicas", "002", 1, 5, 9.37));
        courses.add(new Course("Matematicas discretas", "003", 1, 5, 9.37));
        courses.add(new Course("Programacian I con laboratorio", "004", 1, 6, 11.25));
        courses.add(new Course("Tutoria I", "005", 1, 1, 0.0));
        courses.add(new Course("Ingenieria de software", "006", 1, 3, 5.62));
        courses.add(new Course("Arquitectura de computadoras", "007", 1, 3, 5.62));
        courses.add(new Course("Ingles introductorio", "008", 1, 3, 5.62));
    }
    
    
    /**
     * Create the courses of the second semester and add them to the general list
     */
    private void secondSemester(){
        courses.add(new Course("Comunicacion efectiva", "009", 2, 3, 5.62));
        courses.add(new Course("Calculo", "010", 2, 5, 9.37));
        courses.add(new Course("Matematicas computacionales", "011", 2, 5, 9.37));
        courses.add(new Course("Programacion II con laboratorio", "012", 2, 6, 11.25));
        courses.add(new Course("Estructura de datos", "013", 2, 3, 5.62));
        courses.add(new Course("Tutoria II", "014", 2, 1, 0));
        courses.add(new Course("Sistemas operativos", "015", 2, 3, 5.62));
        courses.add(new Course("Ingles universitario A1", "016", 2, 5, 9.37));
    }
    
    /**
     * Create the courses of the third semester and add them to the general list
     */
    private void thirdSemester(){
        courses.add(new Course("Solucion de problemas", "017", 3, 3, 5.62));
        courses.add(new Course("Álgebra lineal", "018", 3, 3, 5.62));
        courses.add(new Course("Probabilidad y estadistica", "019", 3, 3, 5.62));
        courses.add(new Course("Programacion III", "020", 3, 3, 5.62));
        courses.add(new Course("Bases de datos", "021", 3, 3, 5.62));
        courses.add(new Course("Fundamentos de administracion", "022", 3, 3, 5.62));
        courses.add(new Course("Redes", "023", 3, 3, 5.62));
        courses.add(new Course("Ingles universitario A2", "024", 3, 5, 9.37));
    }
    
    /**
     * Create the courses of the fourth semester and add them to the general list
     */
    private void fourthSemester(){
        courses.add(new Course("Optativa de formacion general I", "025", 4, 3, 5.62));
        courses.add(new Course("Estadistica aplicada", "026", 4, 3, 5.62));
        courses.add(new Course("Seguridad informatica", "027", 4, 3, 5.62));
        courses.add(new Course("Base de datos avanzada", "028", 4, 3, 5.62));
        courses.add(new Course("Administracion de proyectos", "029", 4, 3, 5.62));
        courses.add(new Course("Modelado de procesos", "030", 4, 3, 5.62));
        courses.add(new Course("Diseno de software", "031", 4, 3, 5.62));
        courses.add(new Course("Ingle universitario B1 I", "032", 4, 5, 9.37));
    }
    
    /**
     * Create the courses of the fifth semester and add them to the general list
     */
    private void fifthSemester(){
        courses.add(new Course("Optativa de formacion general II", "033", 5, 3, 5.62));
        courses.add(new Course("Metodos numericos computacionales", "034", 5, 3, 5.62));
        courses.add(new Course("Pruebas de software", "035", 5, 3, 5.62));
        courses.add(new Course("Aplicaciones web", "036", 5, 3, 5.62));
        courses.add(new Course("Administracion de proyectos de software", "037", 5, 3, 5.62));
        courses.add(new Course("Ingenieria de requisitos", "038", 5, 3, 5.62));
        courses.add(new Course("Arquitectura de software", "039", 5, 3, 5.62));
        courses.add(new Course("Ingles universitario B1 II", "040", 5, 5, 9.37));
    }
    
    /**
     * Create the courses of the sixth semester and add them to the general list
     */
    private void sixthSemester(){
        courses.add(new Course("Innovacion tecnologica", "041", 6, 3, 5.62));
        courses.add(new Course("Sistemas distribuidos", "042", 6, 3, 5.62));
        courses.add(new Course("Aplicaciones moviles", "043", 6, 3, 5.62));
        courses.add(new Course("Sistemas empotrados", "044", 6, 3, 5.62));
        courses.add(new Course("Proyecto de software integrador", "045", 6, 3, 5.62));
        courses.add(new Course("Diseno de sistemas interactivos", "046", 6, 3, 5.62));
        courses.add(new Course("Arquitecturas empresariales", "047", 6, 3, 5.62));
        courses.add(new Course("Ingles universitario B1 III", "048", 6, 5, 9.37));
    }
    
    /**
     * Create the courses of the seventh semester and add them to the general list
     */
    private void seventhSemester(){
        courses.add(new Course("Implementacion de prototipos", "049", 7, 3, 5.62));
        courses.add(new Course("Topico de formacion general", "050", 7, 3, 5.62));
        courses.add(new Course("Calidad de software", "051", 7, 3, 5.62));
        courses.add(new Course("Metodos agiles de desarrollo", "052", 7, 3, 5.62));
        courses.add(new Course("Topico I", "053", 7, 3, 5.62));
        courses.add(new Course("Topico II", "054", 7, 3, 5.62));
        courses.add(new Course("Optativa de acentuacion", "055", 7, 3, 5.62));
    }
    
    /**
     * Create the courses of the eighth semester and add them to the general list
     */
    private void eighthSemester(){
        courses.add(new Course("Seminario de titulacion", "056", 8, 3, 5.62));
        courses.add(new Course("Practica profesional", "057", 8, 9, 16.86));
        courses.add(new Course("Evalucaion de software", "058", 8, 3, 5.62));
        courses.add(new Course("Tecnologias de informacion para los negocios", "059", 8, 3, 5.62));
    }
    
    /**
     * Returns a list of courses for the given semester 
     * @param semester Semester
     * @return list of courses
     */
    public ArrayList<Course> getSemesterCourses(int semester){
        ArrayList<Course> semesterCourses = new ArrayList<>();
        for (int i = 0; i < courses.size(); i++) {
            if (semester == courses.get(i).getSemester()) {
                semesterCourses.add(courses.get(i));
            }
        }
        return semesterCourses;
    }
}
