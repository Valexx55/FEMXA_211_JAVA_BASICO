package edu.femxa.val.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibroXML extends DefaultHandler
{
	private Libro libro;
	private String valor_actual;
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("INICIO DEL DOCUMENTO");
		this.libro = new Libro();
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("FIN DEL DOCUMENTO");
		System.out.println("INFO LIBRO");
		System.out.println("ISBN = " + libro.getIsbn());
		System.out.println("AUTOR = " + libro.getAutor());
		System.out.println("AÑO = "+ libro.getAnyo() );
		System.out.println("EDITORIAL = " + libro.getEditorial());
		System.out.println("TITULO = " + libro.getTitulo());
		
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("StartElement = " + localName);
		if (localName.equals("libro"))
		{
			String valor_isbn = attributes.getValue("isbn");
			this.libro.setIsbn(valor_isbn);
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("EndElement = " + localName);
		if (localName.equals("titulo"))
		{
			libro.setTitulo(valor_actual);
		} else if(localName.equals("autor"))
		{
			libro.setAutor(valor_actual);
		} else if (localName.equals("anyo"))
		{
			libro.setAnyo(valor_actual);
		} else if (localName.equals("editorial"))
		{
			libro.setEditorial(valor_actual);
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("Start =" + start);
		System.out.println("Length =" + length);
		String str = new String(ch, start, length);
		System.out.println("String =" + str);
		valor_actual = str;
		
	}
}
