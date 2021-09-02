package EmployeeApp;

import java.util.Scanner;

public class EmployeeApp {
	
	 Employee[] employees = new Employee[10];
	   Scanner sc = new Scanner(System.in);
	      
	   int empNum;
	   int cnt = 0;
	      
	   
	   public void init() {
	      System.out.print("����� �Է�>");
	      empNum = sc.nextInt();
	   }
	   
	   public void input() {
	      for(int i=0; i<empNum; i++) {
	         System.out.print(i+"���>");
	         int employeeId = sc.nextInt();
	         System.out.print("�̸�>");
	         String name = sc.next();
	         System.out.print("�޿�>");
	         int salary = sc.nextInt();
	         employees[cnt] = new Employee(employeeId, name, salary);
	         cnt++;
	      }
	   }
	      
	   public void print() {
	      for(int i = 0; i < cnt; i++) {
	         System.out.println(employees[i]);
	      }
	   }
	   
	   String search(int no) {
	      String name2 = "";
	      for(int i=0; i<cnt; i++) {
	         if (no == employees[i].employeeId) {
	            name2 = employees[i].name;
	         }
	      }
	      return name2;
	   }
	   
	   int sum() {
	      int sum = 0;
	      for(int i = 0; i < cnt; i++) {
	         sum += employees[i].salary;
	      }
	      return sum;
	   }
	}