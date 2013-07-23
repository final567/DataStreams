import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.dom4j.Document;
import org.dom4j.Element;
//import org.dom4j.Node;
import org.dom4j.io.SAXReader;



public class SelectAB {
	
	static HashMap<String, String> map = new HashMap<String, String>();
	
	// 대상 Element추출
	public void getListAll(Document doc) {
        @SuppressWarnings("rawtypes")
		List list = doc.getRootElement().elements();
        for (int i = 0; i < list.size(); i++)
        {
            Element element = (Element) list.get(i);
            
            map.put(element.attributeValue("key"), ((Element)element.elements().get(0)).getText());
            System.out.print("CLASS_NAME : " + element.attributeValue("key"));
            System.out.println(" || METHOD : " + ((Element)element.elements().get(0)).getText());
        }
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
    	Scanner scan = new Scanner(System.in);
    	
    	SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Documents and Settings\\Administrator\\workspace\\SelectTest\\Select.xml"));
    
        SelectAB selectAB = new SelectAB();
         
    	selectAB.getListAll(document);
    	

    	String type="";
    	while(!type.equals("Q")) {
    		System.out.println("A~E 사이의 문자를 입력하세요.");
    		type = scan.next();
    		
    		try {
    			
    			Class<?> c = Class.forName(type);
    			
    			Object o = c.newInstance();
    			Method m = o.getClass().getDeclaredMethod(map.get(type));
    			m.invoke(o);
   
    		} catch(Exception e) {}

    		//map 에 키 값을 주면 메소드를 불러오는 것이아니라 클래스를 불러와야 함.
    		//A~E 클래스는 인터페이스로 구현해야함.
    	}
    	System.out.println("프로그램이 종료되었습니다.");
    	
    }
    
    void invoke(Object o, String method){
    	
    }

}
