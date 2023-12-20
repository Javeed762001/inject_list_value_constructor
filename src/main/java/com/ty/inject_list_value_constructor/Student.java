package com.ty.inject_list_value_constructor;

import java.util.List;

public class Student {

	private String name;
	private List<String> subjectName;
	public Student(String name, List<String> subjectName) {
		super();
		this.name = name;
		this.subjectName = subjectName;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println("-----------subjects list------------");
		for(String subject:subjectName)
		{
			System.out.println(subject);
		}
	}
}
