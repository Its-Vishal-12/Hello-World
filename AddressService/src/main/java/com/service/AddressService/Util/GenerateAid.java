package com.service.AddressService.Util;

import java.util.Random;

public class GenerateAid {
	
	public static  String generateAid() {
		Random random=new Random();
		int ran=random.nextInt(1111, 9999);
		String aid =String.valueOf(ran);
		return aid;
	}

}
