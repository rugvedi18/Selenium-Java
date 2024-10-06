package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		// location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");

		// Loading properties file
		Properties prop = new Properties();
		prop.load(file);

		// Reading data from properties file

		String url = prop.getProperty("appurl");
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
		String orid = prop.getProperty("orderid");
		String custid = prop.getProperty("customerid");

		System.out.println(url + " " + email + "  " + pwd + "  " + orid + " " + custid);

		// Reading all the keys from properties file

		// Set<String> keys=prop.stringPropertyNames();
		// System.out.println(keys); //[password, orderid, customerid, appurl, email]

		Set<Object> keys = prop.keySet();
		System.out.println(keys); // [password, orderid, customerid, appurl, email]

		// Reading all teh values from properties file
		Collection<Object> values = prop.values();
		System.out.println(values); // [abcxyz, 123, 234, https://demo.opencart.com/, abc@gmail.com]

		file.close();

	}

}
