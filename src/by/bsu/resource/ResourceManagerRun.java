package by.bsu.resource;

import java.util.Locale;

public class ResourceManagerRun {
	public static void main(String [] args) {
		ResourceManager manager = ResourceManager.INSTACE;
		System.out.println(manager.getString("str1"));
		
		manager.changeResource(new Locale("be","BY"));
	System.out.println(manager.getString("str1"));
	}
}
