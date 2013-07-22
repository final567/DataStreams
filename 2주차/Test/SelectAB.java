import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;



public class SelectAB {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	// 대상 Element추출
	public void getListAll(Document doc) {
        @SuppressWarnings("rawtypes")
		List list = doc.getRootElement().elements();
        for (int i = 0; i < list.size(); i++)
        {
            Element element = (Element) list.get(i);
            
            map(element.attributeValue("key"), ((Element)element.elements().get(0)).getText());
            System.out.println("NAME : " + element.attributeValue("key"));
            System.out.println(" || VALUE : " + ((Element)element.elements().get(0)).getText());
        }
    }
	private void map(String attributeValue, String text) {
		// TODO Auto-generated method stub
		
	}
	/*
    // Text 추출<br>
    public void getText(Document doc) {
        Node node = doc.selectSingleNode("//foo/bar/author");
        System.out.println(node.getText());
    }
    // 속성값 추출<br>
    public void getAttribute(Document doc) {
        Node node = doc.selectSingleNode("//foo/bar/author");
        System.out.println(node.valueOf("@name"));
    }
    */
    public static void main(String[] args) throws Exception {
    
    	 SAXReader reader = new SAXReader();
         Document document = reader.read(new File("C:\\Documents and Settings\\Administrator\\workspace\\SelectTest\\Select.xml"));
    
         SelectAB selectAB = new SelectAB();
         
    	 selectAB.getListAll(document);
    	
    }

}
