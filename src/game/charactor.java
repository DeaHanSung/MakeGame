package game;

import java.util.ArrayList;

public class charactor {
	private String name;
	private int level = 1;
	private int stat;
	
	private ArrayList<Item> items;
	public charactor() {}
	public charactor(String name,int level) {
		this.name = name;
		this.level = level;
	}
	
	public String getname() {return name;}
	public void setname(String name) {this.name = name;}
	
	public String resultStr() {
		System.out.println("===========================");
		
		String result = "";
		result += "ĳ���� �̸� : " + name + "\n";
		result += "���� : " + level + "(�Z��)" + "\n";
		
		return result;
	}
}
