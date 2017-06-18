package tk.fmmc.nose.registration;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Discoverer {
	
	private File[] files = null;
	private DocumentBuilder builder;
	
	public Discoverer() throws ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		this.builder = factory.newDocumentBuilder();
	}
	
	public void run() throws Exception {	
		//Document document = builder.parse("resources/test.xml");
		
		discoverFiles("dynamic");
		parseAndRegisterAll();
	}
	
	private void discoverFiles(String dirStr) throws Exception {
		File dir = new File(dirStr);
		
		files = dir.listFiles();
		if(files == null) {
			throw new Exception("Could not index " + dirStr);
		}
	}
	
	private void parseAndRegisterAll() throws Exception {
		for(File i : files) {
			if(i.getName().endsWith(".xml")) {
				CombinedSpecification spec = Parser.parse(i, builder);
				spec.selfRegister();
			}
		}
	}
	
}