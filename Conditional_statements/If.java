package Conditional_statements;

import java.util.Scanner;

public class If {
	public void test() {
		Scanner scan=new Scanner(System.in);
		String Res=scan.nextLine();
		//if(Res.equals("Yes")) {
			
		if(Res.equalsIgnoreCase("Yes")) {
			System.out.println("Okey sure we'll arrange it");
		}
	}
	

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If obj=new If();
		obj.test();

    }
}
