import Model.People;
import Model.Root;
import NewModel.Employee;
import NewModel.Employees;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Root root=new Root();
//        File file=new File("test.xml");
//        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
//        Document doc=null;
//        try{
//            doc= dbf.newDocumentBuilder().parse(file);
//        }catch (Exception e){
//            e.printStackTrace();
//            return;
//        }
//        Node rootNode=doc.getFirstChild();
//        String mainName=null;
//        Node peopleNode=null;
//        NodeList rootChilds=rootNode.getChildNodes();
//        for(int i = 0; i < rootChilds.getLength(); i++){
//            System.out.println(rootChilds.item(i).getNodeName());
//            if(rootChilds.item(i).getNodeType()!=Node.ELEMENT_NODE){
//                continue;
//            }
//            switch (rootChilds.item(i).getNodeName()){
//                case "name":{
//                    mainName=rootChilds.item(i).getTextContent();
//                    break;
//                }
//                case "people":{
//                    peopleNode=rootChilds.item(i);
//                    break;
//                }
//            }
//        }
//        root.setName(mainName);
//        if(peopleNode==null){
//            return;
//        }
//        List<People> peopleList=new ArrayList<>();
//        NodeList peopleChilds = peopleNode.getChildNodes();
//        for(int i =0; i< peopleChilds.getLength(); i++){
//            if(peopleChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
//                continue;
//            }
//            if(!peopleChilds.item(i).getNodeName().equals("element")){
//                continue;
//            }
//            String name = "";
//            int age = 0;
//            NodeList elementChild = peopleChilds.item(i).getChildNodes();
//            for(int j = 0; j < elementChild.getLength(); j++){
//                if(elementChild.item(j).getNodeType() != Node.ELEMENT_NODE){
//                    continue;
//                }
//                switch (elementChild.item(j).getNodeName()){
//                    case "name":{
//                        name=elementChild.item(j).getTextContent();
//                        break;
//                    }
//                    case "age":{
//                        age=Integer.valueOf(elementChild.item(j).getTextContent());
//                        break;
//                    }
//                }
//            }
//            People people=new People(name, age);
//            peopleList.add(people);
//
//            root.setPeople(peopleList);
//            System.out.println(root);
//        }

        Employees employees=new Employees();
        File file=new File("Employee.xml");
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        Document doc=null;
        try{
            doc= dbf.newDocumentBuilder().parse(file);
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
        Node rootNode=doc.getFirstChild();
        Node employeeNode=null;
        NodeList rootChilds=doc.getChildNodes();
        for(int i = 0; i < rootChilds.getLength(); i++){
            System.out.println(rootChilds.item(i).getNodeName());
            if(rootChilds.item(i).getNodeType()!=Node.ELEMENT_NODE){
                continue;
            }
            employeeNode=rootChilds.item(i);
            break;
        }
        if(employeeNode==null){
            return;
        }
        List<Employee> employeeList=new ArrayList<>();
        NodeList employeeChilds = employeeNode.getChildNodes();
        for(int i =0; i< employeeChilds.getLength(); i++){
            if(employeeChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            if(!employeeChilds.item(i).getNodeName().equals("Employee")){
                continue;
            }
            int age=0;
            String name="";
            String gender="";
            String role="";
            float salary=0;
            NodeList elementChild = employeeChilds.item(i).getChildNodes();
            for(int j = 0; j < elementChild.getLength(); j++){
                if(elementChild.item(j).getNodeType() != Node.ELEMENT_NODE){
                    continue;
                }
                switch (elementChild.item(j).getNodeName()){
                    case "name":{
                        name=elementChild.item(j).getTextContent();
                        break;
                    }
                    case "age":{
                        age=Integer.valueOf(elementChild.item(j).getTextContent());
                        break;
                    }
                    case "gender":{
                        gender=elementChild.item(j).getTextContent();
                        break;
                    }
                    case "role":{
                        role=elementChild.item(j).getTextContent();
                        break;
                    }
                    case "salary":{
                        salary=Float.parseFloat(elementChild.item(j).getTextContent());
                    }
                }
            }
            Employee employee=new Employee(age,name,gender,role,salary);
            employeeList.add(employee);

            employees.setEmployees(employeeList);
            System.out.println(employees.getEmployees());
        }
    }
}
