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
			System.out.println("1~5사이의 숫자를 입력하세요. (q:종료)");
			selectScan = scan.nextLine();	
			
		
			try {
				SelectInterface select = (SelectInterface) context.getBean(selectScan);
				select.printTest();
			} catch (Exception e) {
				if(!selectScan.equals("q"))
					System.out.println("잘못된 선택입니다.");
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
		*/
		
		
		
		
		
	}

}
