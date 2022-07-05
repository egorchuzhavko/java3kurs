package com.mkyong.xml.dom;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class CreateXmlFile {
    public static void main(String[] args) throws ParserConfigurationException,
            TransformerException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Candy");
        doc.appendChild(rootElement);

        Element candy=doc.createElement("candy");
        Element ingredients=doc.createElement("ingredients");
        Element energy=doc.createElement("energy");
        energy.setTextContent("44");
        Element type=doc.createElement("type");
        type.setTextContent("chocolate");
        Element name=doc.createElement("name");
        name.setTextContent("kitKat");
        candy.appendChild(name);
        candy.appendChild(energy);
        candy.appendChild(type);
        Element water=doc.createElement("water");
        water.setTextContent("5");
        Element sugar=doc.createElement("sugar");
        sugar.setTextContent("5");
        Element fruktoza=doc.createElement("fruktoza");
        fruktoza.setTextContent("5");
        Element typechocholate=doc.createElement("typechocolate");
        typechocholate.setTextContent("chocolate");
        Element vanilin=doc.createElement("vanilin");
        vanilin.setTextContent("5");
        ingredients.appendChild(water);
        ingredients.appendChild(sugar);
        ingredients.appendChild(fruktoza);
        ingredients.appendChild(typechocholate);
        ingredients.appendChild(vanilin);
        candy.appendChild(ingredients);
        Element value=doc.createElement("value");
        Element belki=doc.createElement("belki");
        belki.setTextContent("5");
        Element jiri=doc.createElement("jiri");
        jiri.setTextContent("31");
        Element uglevodi=doc.createElement("uglevodi");
        uglevodi.setTextContent("61");
        value.appendChild(belki);
        value.appendChild(jiri);
        value.appendChild(uglevodi);
        Element production=doc.createElement("production");
        production.setTextContent("Nestle");
        candy.appendChild(value);
        candy.appendChild(production);
        rootElement.appendChild(candy);


        Element candy2=doc.createElement("candy");
        Element ingredients2=doc.createElement("ingredients");
        Element energy2=doc.createElement("energy");
        energy2.setTextContent("44");
        Element type2=doc.createElement("type");
        type2.setTextContent("chocolate");
        Element name2=doc.createElement("name");
        name2.setTextContent("Red shapka");
        candy2.appendChild(name2);
        candy2.appendChild(energy2);
        candy2.appendChild(type2);
        Element water2=doc.createElement("water");
        water2.setTextContent("6");
        Element sugar2=doc.createElement("sugar");
        sugar2.setTextContent("6");
        Element fruktoza2=doc.createElement("fruktoza");
        fruktoza2.setTextContent("6");
        Element typechocholate2=doc.createElement("typechocolate");
        typechocholate2.setTextContent("milk");
        Element vanilin2=doc.createElement("vanilin");
        vanilin2.setTextContent("6");
        ingredients2.appendChild(water2);
        ingredients2.appendChild(sugar2);
        ingredients2.appendChild(fruktoza2);
        ingredients2.appendChild(typechocholate2);
        ingredients2.appendChild(vanilin2);
        candy2.appendChild(ingredients2);
        Element value2=doc.createElement("value");
        Element belki2=doc.createElement("belki");
        belki2.setTextContent("10");
        Element jiri2=doc.createElement("jiri");
        jiri2.setTextContent("35");
        Element uglevodi2=doc.createElement("uglevodi");
        uglevodi2.setTextContent("50");
        value2.appendChild(belki2);
        value2.appendChild(jiri2);
        value2.appendChild(uglevodi2);
        Element production2=doc.createElement("production");
        production2.setTextContent("communarka");
        candy2.appendChild(value2);
        candy2.appendChild(production2);
        rootElement.appendChild(candy2);



        DOMSource source = new DOMSource(doc);
        StreamResult file=new StreamResult(new File("CandyCode.xml"));
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(source, file);

        writeXml(doc,System.out);


    }

    private static void writeXml(Document doc,
                                 OutputStream output)
            throws TransformerException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // pretty print
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);

        transformer.transform(source, result);

    }}
