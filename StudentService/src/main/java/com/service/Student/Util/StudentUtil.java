package com.service.Student.Util;

import java.util.Random;

public class StudentUtil {
	
	public static String createSid() {
		Random ran=new Random();
	int num=ran.nextInt(1001, 9999);
	 String sid=String.valueOf(num);
		return sid;
	}
	
}
