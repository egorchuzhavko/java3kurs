import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlToHTML {
    public static void main(String[] args) {
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer(new StreamSource("Candy.xsl"));
            transformer.transform(new StreamSource("CandyCode.xml"), new StreamResult("Candy.html"));
        } catch (TransformerConfigurationException e) { e.printStackTrace(); }
        catch (TransformerException e) { e.printStackTrace(); }
    }
}
