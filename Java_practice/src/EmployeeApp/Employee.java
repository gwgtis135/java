package EmployeeApp;

import java.util.Scanner;

public class Employee{

	
	  int employeeId;         // ���
	   String name;         // �̸�
	   int departmenId;      // �μ���ȣ 10:�λ� 20:���� 30:����(�⺻��)
	   String departmenName;   // �μ��̸� 
	   int salary;            // �޿�
	   String email;         // �̸���
	   
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
	            this.departmenName = "�λ�";
	         } else if (departmenId == 20) {
	            this.departmenName = "����";
	         } else if (departmenId == 30) {
	            this.departmenName = "����";
	        }
	       */
	      this.departmenId = departmenId;
	      if (this.departmenId == 0) { 
	         this.departmenId = 30; 
	      }
	      
	      if (this.departmenId == 10) {
	         this.departmenName = "�λ�";
	      } else if (this.departmenId == 20) {
	         this.departmenName = "����";
	      } else if (this.departmenId == 30) {
	         this.departmenName = "����";
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