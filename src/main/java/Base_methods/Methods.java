package Base_methods;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import utility.Player_List;

public class Methods extends Player_List {
	
	public int foreignPlayer() throws EncryptedDocumentException, IOException 
	{
	  String excelValue;
	  int cell = 1;
	 int count=0;
	 for(int i=1;i<=11;i++)
	{
	    excelValue = readExcelfile(i,cell);
	  
	    if(excelValue.equalsIgnoreCase("India")) 
	    { 
	     }
	   else 
	    {
	 count ++;
	 
	     }
	}
	 return count;
	 
	}
	


public String wicketKeeper() throws EncryptedDocumentException, IOException 
{
	String wk="";
	String value = "";
	int cell=2;
	for(int a=1;a<=11;a++) {
		
		wk=readExcelfile(a, cell);
		
		if(wk.equalsIgnoreCase("Wicket-Keeper")) {
			 value = wk;
		}
		
	}
	return value;
}


}