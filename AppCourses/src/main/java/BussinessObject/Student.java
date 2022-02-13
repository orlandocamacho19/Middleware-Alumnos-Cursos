package BussinessObject;

import java.util.Objects;

/**
 * @author orlandocamacho
 */
public class Student {
    
    private String name;
    private String id;
    private int semester;

    /**
     * Student class constructor
     * @param name Student name
     * @param id Student id
     * @param semester Student semester
     */
    public Student(String name, String id, int semester) {
        this.name = name;
        this.id = id;
        this.semester = semester;
    }

    /**
     * Get the name of the student
     * @return Student name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the student
     * @param name Student name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the id of the student
     * @return Student id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the id of the student
     * @param id Student id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the semester of the student
     * @return Student semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Set the smester of the student
     * @param semester Student semester
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * Hash method
     * @return Hash code of the student object
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Check equality between 2 objects of the same type
     * @param obj object to compare
     * @return True if they are equals, false in the opposite case
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * String of the student attributes
     * @return String
     */
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", semester=" + semester + '}';
    } 
}
