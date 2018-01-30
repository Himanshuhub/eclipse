package com.durgasoft.core;

public class Employee implements java.io.Serializable, Cloneable {
	public String eid;
	public String ename; 
	public float esal;
	public String eaddr;

	public Employee(String eid, String ename, float esal, String eaddr) {
		
	} 
	public Employee(String eid, String ename, float esal) {
		
	}
	public Employee(String eid, String ename) {
		
	}
	public void add(String eid, String ename, float esal, String eaddr) {
		
	}
	public String search(String eid) {
		return "success";
	}
	public void delete(String eid) {		
	}
}
