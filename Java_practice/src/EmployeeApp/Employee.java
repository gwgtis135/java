package EmployeeApp;

import java.util.Scanner;

public class Employee{

	
	  int employeeId;         // 사번
	   String name;         // 이름
	   int departmenId;      // 부서번호 10:인사 20:개발 30:영업(기본값)
	   String departmenName;   // 부서이름 
	   int salary;            // 급여
	   String email;         // 이메일
	   
	   public Employee(int employeeId, String name, int departmenId, int salary, String email) {
	      super();
	      this.employeeId = employeeId;
	      this.name = name;
	      
	      /*
	       * if (departmenId == 0) { departmenId = 30; }
	       * 
	       * this.departmenId = departmenId;
	       * 
	       * if (departmenId == 10) {
	            this.departmenName = "인사";
	         } else if (departmenId == 20) {
	            this.departmenName = "개발";
	         } else if (departmenId == 30) {
	            this.departmenName = "영업";
	        }
	       */
	      this.departmenId = departmenId;
	      if (this.departmenId == 0) { 
	         this.departmenId = 30; 
	      }
	      
	      if (this.departmenId == 10) {
	         this.departmenName = "인사";
	      } else if (this.departmenId == 20) {
	         this.departmenName = "개발";
	      } else if (this.departmenId == 30) {
	         this.departmenName = "영업";
	      }
	      
	      this.salary = salary;
	      this.email = email;
	   }
	   public Employee(){ 
	      this(0,"",0, 0,"");
	   }
	   
	   Employee(int employeeId, String name){
	      this(employeeId, name, 0, 0, "");
	   }
	   
	   Employee(int employeeId, String name, int salary){
	      this(employeeId, name, 0, salary, "");
	   }
	   
	   Employee(int employeeId, String name, String email){
	      this(employeeId, name, 0, 0, email);
	   }
	   @Override
	   public String toString() {
	      return employeeId + "  " + name + "  " + salary;
	   }
	   
	   
	   

	}