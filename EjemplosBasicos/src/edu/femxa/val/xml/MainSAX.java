package edu.femxa.val.xml;

import java.io.FileInputStream;
import java.io.FileReader;

import javax.imageio.stream.FileImageInputStream;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainSAX {
	
	public static void main(String[] args) throws Throwable {
		
		XMLReader reader = 
		XMLReaderFactory.createXMLReader();
		
		ParserLibroXML parserLibro = null;
		parserLibro = new ParserLibroXML();
		
		reader.setContentHandler(parserLibro);
		
		reader.parse
		(new InputSource
				(new FileInputStream("libro.xml")));
	
		
		
	}

}
