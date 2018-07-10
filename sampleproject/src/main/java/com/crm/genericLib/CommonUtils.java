package com.crm.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommonUtils {

	public Properties getPropertiesObj() throws Throwable
	{
		String path="D:/Nikita/sampleproject/src/test/resources/common.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
	}
}
