package com.creatio.crm.language.basics;
//import java.util.Arrays;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Class1 obj = new Class1();
    System.out.println(obj.name);
    System.out.println(obj.roll);
//    System.out.println(obj.student);
//    System.out.println(obj.room);
    for (String n : obj.student) {
    	if(n.equals("ram")) {
        System.out.println(n);}
    }
    for (int r : obj.room) {
    	if(r == 1) {
        System.out.println(r);
    }
	}}

}
