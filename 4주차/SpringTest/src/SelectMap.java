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
			System.out.println("1~5������ ���ڸ� �Է��ϼ���. (q:����)");
			selectScan = scan.next();	
			
			SelectInterface selectInterface = getSelect(selectScan);
			if(selectInterface != null)
				selectInterface.printTest();
			else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
}