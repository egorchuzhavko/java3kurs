import model.*;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file=new File("Candy.xml");
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        Document doc=null;
        try{
            doc= dbf.newDocumentBuilder().parse(file);
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
        Node qwe=doc.getFirstChild();
        Node candyNode=null;
        NodeList rootChilds=qwe.getChildNodes();
        for(int i = 0; i < rootChilds.getLength(); i++){
            System.out.println(rootChilds.item(i).getNodeName());
            if(rootChilds.item(i).getNodeType()!=Node.ELEMENT_NODE){
                continue;
            }
            candyNode=rootChilds.item(i);
            break;
        }
        if(candyNode==null){
            return;
        }
        List<Candy> candyList=new ArrayList<>();
        NodeList candyChilds = candyNode.getChildNodes();



        for(int i =0; i< rootChilds.getLength(); i++){
            if(rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            if(!rootChilds.item(i).getNodeName().equals("candy")){
                continue;
            }
            String name="";
            int energy=0;
            String type="";
            Ingredients ingredients=new Ingredients();
            Value value=new Value();
            String production="";
            NodeList elementChild = rootChilds.item(i).getChildNodes();
            for(int j = 0; j < elementChild.getLength(); j++){
                if(elementChild.item(j).getNodeType() != Node.ELEMENT_NODE){
                    continue;
                }
                switch (elementChild.item(j).getNodeName()){
                    case "name":{
                        name=elementChild.item(j).getTextContent();
                        break;
                    }
                    case "energy":{
                        energy=Integer.valueOf(elementChild.item(j).getTextContent());
                        break;
                    }
                    case "type":{
                        type=elementChild.item(j).getTextContent();
                        break;
                    }
                    case "ingredients":{
                        NodeList cqw=elementChild.item(j).getChildNodes();
                        int water=0;
                        int sugar=0;
                        int fruktoza=0;
                        String typechocolate="";
                        int vanilin=0;
                        for(int k=0;k<cqw.getLength();k++){
                            if(cqw.item(k).getNodeType() != Node.ELEMENT_NODE){
                                continue;
                            }
                            switch (cqw.item(k).getNodeName()){
                                case "water":{
                                    water=Integer.valueOf(cqw.item(k).getTextContent());
                                    break;
                                }
                                case "sugar":{
                                    sugar=Integer.valueOf(cqw.item(k).getTextContent());
                                    break;
                                }
                                case "fruktoza":{
                                    fruktoza=Integer.valueOf(cqw.item(k).getTextContent());
                                    break;
                                }
                                case "typechocolate":{
                                    typechocolate=cqw.item(k).getTextContent();
                                    break;
                                }
                                case "vanilin":{
                                    vanilin=Integer.valueOf(cqw.item(k).getTextContent());
                                    break;
                                }
                                default:{
                                    break;
                                }
                            }
                        }
                        ingredients=new Ingredients(water,sugar,fruktoza,typechocolate,vanilin);
                    }
                    case "value":{
                        NodeList cqw=elementChild.item(j).getChildNodes();
                        int belki=0;
                        int jiri=0;
                        int uglevodi=0;
                        for(int k=0;k<cqw.getLength();k++){
                            if(cqw.item(k).getNodeType() != Node.ELEMENT_NODE){
                                continue;
                            }
                            switch (cqw.item(k).getNodeName()){
                                case "belki":{
                                    belki=Integer.valueOf(cqw.item(k).getTextContent());
                                    break;
                                }
                                case "jiri":{
                                    jiri=Integer.valueOf(cqw.item(k).getTextContent());
                                    break;
                                }
                                case "uglevodi":{
                                    uglevodi=Integer.valueOf(cqw.item(k).getTextContent());
                                    break;
                                }
                            }
                        }
                        value=new Value(belki,jiri,uglevodi);
                    }
                    case "production":{
                        production=elementChild.item(j).getTextContent();
                        break;
                    }
                }
            }
            Candy candy=new Candy(name,energy,type,ingredients,value,production);
            candyList.add(candy);
        }
        System.out.println("Список конфет не отсортированных по названию:");
        System.out.println(candyList);
        Comparator<Candy> sortbyproduction=new Comparator<Candy>() {
            @Override
            public int compare(Candy o1, Candy o2) {
                return o2.getProduction().compareTo(o1.getProduction());
            }
        };
        Collections.sort(candyList,sortbyproduction);
        System.out.println("\n\nСписок конфет после сортировки:");
        System.out.println(candyList);
    }
}
