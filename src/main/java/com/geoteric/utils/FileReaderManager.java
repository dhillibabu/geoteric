package com.geoteric.utils;

import com.geoteric.utils.ConfigReader;
import com.geoteric.utils.FileReaderManager;

public class FileReaderManager {
	public static ConfigReader cr;
	public static FileReaderManager frm = new FileReaderManager();
	
	public ConfigReader getConfigReader() throws Exception
	{
		if(cr==null)
		{
			cr=new ConfigReader();
		}
		return cr;
	}
	
	private FileReaderManager() {
		
	}

}

