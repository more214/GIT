package TankLearn2.Learn;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ParseProperties {

	private Properties pro = new Properties();
	String value =null;
	
	public ParseProperties(String filepath)
	{
		this.loadProperties(filepath);
	}

	private void loadProperties(String filepath) {
		// TODO Auto-generated method stub
		try
		{
			InputStream is  = new FileInputStream(filepath);
			InputStreamReader ism = new InputStreamReader(is);
			BufferedReader br= new BufferedReader(ism);
			pro.load(br);
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public String getValue(String key)
	{
		value =pro.getProperty(key).trim();
		try
		{
			value = new String(value.getBytes("UTF-8"),"UTF-8");			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParseProperties pp = new ParseProperties("C:\\Users\\jackie\\workspace\\TestNG\\propertiesfile\\test1.properties");
		String ch;
		ch=pp.getValue("name");
		System.out.println(ch);
		
	}

}
