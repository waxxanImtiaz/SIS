/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlFileWriter {

	public static void writeTableName(String tableName) {
            try {
		String filepath = "C:\\Users\\waxxan\\Documents\\NetBeansProjects\\MyMIS\\src\\java\\xmlFiles\\StudentPersonalInfo.hbm.xml";
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);

		// Get the root element
		Node company = doc.getFirstChild();

	
		// Get the staff element by tag name directly
		Node staff = doc.getElementsByTagName("class").item(0);
                 System.out.println(staff.getNodeValue());
		// update staff attribute
		NamedNodeMap attr = staff.getAttributes();
		Node nodeAttr = attr.getNamedItem("table");
		nodeAttr.setTextContent(tableName);

		// write the content into xml file
		
                  TransformerFactory transformerFactory = TransformerFactory.newInstance();
                  Transformer transformer = transformerFactory.newTransformer();
                  transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                  transformer.setOutputProperty(
                        "{http://xml.apache.org/xslt}indent-amount", "4");
                  DOMSource source = new DOMSource(doc);
                  StreamResult result = new StreamResult(new File(filepath));
		  transformer.transform(source, result);
		//transformer.transform(source, result);

		System.out.println("Done");
//                return true;
	   } catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	   }
            catch (TransformerException tfe) {
		tfe.printStackTrace();
	   }
            catch (IOException ioe) {
		ioe.printStackTrace();
	   } catch (SAXException sae) {
		sae.printStackTrace();
	   }
//           return false;
	}//end of writeTableName method

}
