package com.project.generic;

import java.io.IOException;

public class DemoGenericLib {

	public static void main(String[] args) throws IOException {
		FileLibrary f=new FileLibrary();
		System.out.println(f.getPropertyData("Url"));
		System.out.println(f.getExcelData("CreateCustomer", 1, 3));
		f.setExcelData("CreateCustomer",1, 5,"invalid");

	}

}
