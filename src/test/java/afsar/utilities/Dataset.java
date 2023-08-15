package afsar.utilities;

import org.testng.annotations.DataProvider;

public class Dataset {
	
	@DataProvider(name = "loginInValidData")
	public static Object invalidLogin() 
	{
	Object[][] objects ={{"Admin","admin13"},{"Admin0","admin123"},{"Admin023","admin198723"},{" "," "}}; 
		return objects;	
	}
	
	@DataProvider(name = "loginInValidDataExcel")
	public static Object invalidLoginExcel() 
	{
		ExcelReader excelReader = new ExcelReader("src\\Datasheet\\InvalidLogin.xlsx",0);
		return excelReader.getAllDataAsObjects();
	}
}
	

