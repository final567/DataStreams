import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainTest {
		
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("springTestXml.xml");
		
		SelectMap select = (SelectMap)context.getBean("aa");
		select.run();
		
		/*
		String selectScan="";
		while(!selectScan.equals("q")) {
			System.out.println("1~5������ ���ڸ� �Է��ϼ���. (q:����)");
			selectScan = scan.nextLine();	
			
		
			try {
				SelectInterface select = (SelectInterface) context.getBean(selectScan);
				select.printTest();
			} catch (Exception e) {
				if(!selectScan.equals("q"))
					System.out.println("�߸��� �����Դϴ�.");
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		*/
		
		
		
		
		
	}

}
