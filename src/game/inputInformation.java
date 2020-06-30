package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputInformation {
	public static void main(String[] args) {
	System.out.println("==========행복한 rpg=========");
	String result = "";
	charactor tor = null;
	String name = null;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		System.out.print("캐릭터 이름을 입력하세요 : ");
		name = in.readLine();
	}
	catch(Exception e) {
		System.out.println("입력 오류");
	}
	
	tor = new information(name);
	result += tor.resultStr();
	System.out.println(result);
	}
}
