package com.test.userTable;
import java.util.*;

public class UserTable {
	static ArrayList<User> userTable = new ArrayList<User>();

	private UserTable(){
		System.out.println("created");
	}
	/*
    private volatile static UserTable single;
    public static UserTable getInstance(){
        if (single == null) {
            synchronized(UserTable.class) {
                if (single == null) {
                    single = new UserTable();
                }
            }
        }
        return single;
    }
    */
	
	public void setUserTable(String name, int age, String phoneNumber) {
		User user = new User();
		user.setUser(name, age, phoneNumber);
		userTable.add(user);
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList getUserTable() {
		return userTable;
	}

	/*
	public ArrayList getUserNameList(int num) {
		ArrayList<String> userNameList = new ArrayList<String>();
		Iterator it = userTable.iterator();
		while(it.hasNext()) {
			userNameList.add(userTable.get((int) it.next()).getName());
		}
		return userNameList;
	}
	public int getUserAge(int num) {
		return userTable.get(num).getAge();
	}
	public int getUserPhoneNumber(int num) {
		return userTable.get(num).getPhoneNumber();
	}
	//*/

}
