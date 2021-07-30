package com.lti.app.ems;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="ems")
	public class Ems {
		@Id
		@Column(name="empid")
			private int empid;
		@Column(name="name")
			private String name;
		@Column(name="city")
			private String city;
		@Column(name="age")
			private int age;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Ems(int empid, String name, String city, int age) {
			super();
			this.empid = empid;
			this.name = name;
			this.city = city;
			this.age = age;
		}
		public Ems() {
			super();
			// TODO Auto-generated constructor stub
		}
			
		@Override
		public String toString() {
			return "Employee [id=" + empid + ", name=" + name + ", age=" + age + ", city=" + city + "]";
		}
		
}

