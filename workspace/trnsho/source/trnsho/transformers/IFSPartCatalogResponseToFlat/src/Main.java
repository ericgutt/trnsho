import ifs.fnd.base.IfsException;
import ifs.fnd.tc.framework.util.FileUtil;
import ifs.fnd.tc.framework.xml.TransformerFactory;
import java.io.IOException;
import java.io.File;

public class Main
{
   
   /** Creates a new instance of Main */
   public Main()
   {
   }
   
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) throws IOException, IfsException
   {
      TransformerFactory tr = new TransformerFactory(false);
        
      // Copy input file to test folder and set filename here
      File fileIn = new File("test/Input.xml");
      // Set the output filename here
      File fileOut = new File("test/Output.txt");
      // Set path to the transformer file
      File fileTransformer = new File("build/classes/IFSPartCatalogResponseToFlat.class");
        
      // Set the actual encoding of the input file
      byte[] in = FileUtil.readFileToByteArray(fileIn);
      String sIn = new String(in, "UTF-8");
        
      String sResult = tr.transform(sIn, fileTransformer);
        
      // Set the encoding you want for the output file
      byte[] result = sResult.getBytes("UTF-8");
      FileUtil.saveByteArrayToFile(fileOut, result);
        
      System.out.println("Transformation is succesfully done");
   }
   
}
