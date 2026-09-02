package com.creatio.crm.language.basics;

public class StoragOfStringValue {
	String emp1name="sarfaraj";
	int empid1 = 1;
	String emp2name="ram";
	int empid2 = 2;
	String emp3name="shaam";
	int empid3= 3;
	String[] emps = {"sarfraj","raj","faraj"};
	int [] empid = new int[3];
	
	  {
	        empid[0] = 100;
	        empid[1] = 101;
	        empid[2] = 111;
	    }
	  int[] empis = {22,23,55};
	  String [] name = new String[3];
      
	  { name[0]="ram";
      name[1]="sam";
      name[2]="mohan";
	  }
	  
	  String[][] school= new String[3][2];
	  {  school[0][0] = "pitts";
      school[0][1] = "pith";
      school[1][0] = "kvs";
      school[1][1] = "ifd";
      school[2][0] = "dfd";
      school[2][1] = "pis";}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] empid = new int[3];
		
		  
		        empid[0] = 100;
		        empid[1] = 11;
		        empid[2] = 121;
		
		        String [] name = new String[3];
		        
		        name[0]="ram";
		        name[1]="sam";
		        name[2]="mohn";
		        String[][] school= new String[3][2];
		        school[0][0] = "pitts";
		        school[0][1] = "poll";
		        school[1][0] = "kvs";
		        school[1][1] = "ifd";
		        school[2][0] = "dfd";
		        school[2][1] = "pis";
		StoragOfStringValue obj = new StoragOfStringValue();
		System.out.println(obj.emp2name);
		
		String[] emp = {"sarfaraj","raj","faraj"};
		System.out.println(emp[0]);
		System.out.println(obj.emps[0]);
		System.out.println(obj.empid[2]);
		System.out.println(obj.empis[2]);
		System.out.println(empid[2]);
		System.out.println(name[2]);
		System.out.println(obj.name[2]);
		System.out.println(school[0][1]);
		System.out.println(obj.school[0][1]);

	}
	
	

}
