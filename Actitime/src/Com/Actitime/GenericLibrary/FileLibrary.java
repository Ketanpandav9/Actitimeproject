package Com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class is a generic class which contains all the methods for data driven testing
 * @author ketan
 *
 */
public class FileLibrary {
		/**
		 * 
		 * @param key
		 * @return
		 * @throws IOException
		 */
 public String ReadDataFromPropertyFile (String key) throws IOException  
 {
 FileInputStream fis= new FileInputStream("./Testdata/commondata.property1");
 Properties p= new Properties();
 p.load(fis);
 String value =p.getProperty(key);
 return value;
 }
 /**
  * 
  * @param sheet
  * @param row
  * @param cell
  * @return
  * @throws EncryptedDocumentException
  * @throws IOException
  */
 public String readdatafromexcalfile(String sheet , int row , int cell ) throws EncryptedDocumentException, IOException   {
		FileInputStream fis1 = new FileInputStream("./Testdata/ActitimeTestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
 }
 
