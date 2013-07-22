import java.util.*;

public class SelectMap {
	private Map<String, SelectInterface> selectMap;
	
	public SelectInterface getSelect(String scan) {
		return selectMap.get(scan);
	}
	public Map<String, SelectInterface> getSelectMap() {
        return selectMap;
    }
	public void setSelectMap(Map<String, SelectInterface> selectMap) {
        this.selectMap = selectMap;
    }
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		String selectScan="";
		while(!selectScan.equals("q")) {
			System.out.println("1~5사이의 숫자를 입력하세요. (q:종료)");
			selectScan = scan.next();	
			
			SelectInterface selectInterface = getSelect(selectScan);
			if(selectInterface != null)
				selectInterface.printTest();
			else
				System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}
}