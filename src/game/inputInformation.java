package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputInformation {
	public static void main(String[] args) {
	System.out.println("==========�ູ�� rpg=========");
	String result = "";
	charactor tor = null;
	String name = null;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		System.out.print("ĳ���� �̸��� �Է��ϼ��� : ");
		name = in.readLine();
	}
	catch(Exception e) {
		System.out.println("�Է� ����");
	}
	
	tor = new information(name);
	result += tor.resultStr();
	System.out.println(result);
	}
}
