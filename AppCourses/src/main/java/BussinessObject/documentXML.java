package BussinessObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class documentXML {

    private Document document;

    public void GenerarDOM() throws ParserConfigurationException {
        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder constructor = fabrica.newDocumentBuilder();
        document = constructor.newDocument();

    }

    public void generarDocumento(ArrayList<Course> courses) {
        Element element = document.createElement("courses");
        document.appendChild(element);
        Element course = document.createElement("course");
        element.appendChild(course);

        for (int i = 0; i < courses.size(); i++) {
            Element id = document.createElement("ID");
            id.appendChild(document.createTextNode(courses.get(i).getId()));
            element.appendChild(id);

            Element materia = document.createElement("Materia");
            materia.appendChild(document.createTextNode(courses.get(i).getName()));
            element.appendChild(materia);

            Element semestre = document.createElement("Semester");
            semestre.appendChild(document.createTextNode(String.valueOf(courses.get(i).getSemester())));
            element.appendChild(semestre);

            Element hours = document.createElement("Hours");
            hours.appendChild(document.createTextNode(String.valueOf(courses.get(i).getHours())));
            element.appendChild(hours);

            Element points = document.createElement("Points");
            points.appendChild(document.createTextNode(String.valueOf(courses.get(i).getPoints())));
            element.appendChild(points);
        }
    }

    public void generarXml() throws TransformerConfigurationException, IOException, TransformerException {
        TransformerFactory factoria = TransformerFactory.newInstance();
        Transformer transformer = factoria.newTransformer();

        Source source = new DOMSource(document);
        File file = new File("courses.xml");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        Result result = new StreamResult(pw);

        transformer.transform(source, result);
    }
}
