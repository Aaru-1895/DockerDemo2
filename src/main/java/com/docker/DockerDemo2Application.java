package com.docker;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DockerDemo2Application {
	
	
	static void printCharacter(String ch, int n) {
		System.out.println("ch..."+ch);
		String strIncremented=new String(); 
		for(int i=0;i<ch.length();i++){ 
			strIncremented+=(char)(ch.charAt(i)+1); 
			}
				 System.out.println(strIncremented);
	}
	
	

	
	public static void main(String[] args) {
		SpringApplication.run(DockerDemo2Application.class, args);
		System.out.println("Here is my demo working....");
		
		/*
		 * int val =2; char ch = 'A'; System.out.println(".."+(int)ch);
		 * System.out.println("<<"+(char)65); for (int i = 65; i <= 90; i++) {
		 * //System.out.println((char)i); if((int)ch == (char)i) { int newVal =
		 * (int)ch+val; System.out.println((char)newVal); } }
		 */
		
		
		/*
		 * String str="A"; String strIncremented=new String(); for(int
		 * i=0;i<str.length();i++){ strIncremented+=(char)(str.charAt(i)+1); }
		 * System.out.println(strIncremented);
		 */
		/*
		 * Scanner sc = new Scanner(System.in); String ch = sc.nextLine(); int n=
		 * sc.nextInt(); DockerDemo2Application.printCharacter("A", 2);
		 */
		
		
		
		
	}


}
