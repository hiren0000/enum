package come.rebel1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/*
 * here is the example of Properties 
 * which mainly use in different framework
 * 
 */

public class PropertiesDemo
{
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("data.properties");
		p.setProperty("url", "Hiren Devmurari");
		p.setProperty("uname", "hdev");
		p.store(os, "here is the first property demo");
		
		InputStream is = new FileInputStream("data.properties");
		p.load(is);
		
		
		p.list(System.out);
	
		

	}

}
