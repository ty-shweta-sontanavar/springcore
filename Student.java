package com.te.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student 
{
	public Student()
	{
		
	}
  private int sid;
  
  private String sname;
  
  private Address add;
  
}
