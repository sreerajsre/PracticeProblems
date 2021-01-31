package com.CustomOperationCheck;

import java.util.HashSet;

public class EmployeeHashSet {
	private String name;
	private int id;
	public EmployeeHashSet(String name,int id) {
		this.name  = name;
		this.id = id;
	}


	public static void main (String[] args){
		
		HashSet<EmployeeHashSet> hashSet = new HashSet<EmployeeHashSet>();
		hashSet.add(new EmployeeHashSet("Ram",10));
		hashSet.add(new EmployeeHashSet("Ram",10));
		hashSet.add(new EmployeeHashSet("Ram",10));
		
		hashSet.stream().forEach(e-> System.out.println(e.name + " " + e.id));
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeHashSet other = (EmployeeHashSet) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	

}