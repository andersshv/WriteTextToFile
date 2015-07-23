import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class TextWriter {

	public static void main(String[] args) {
		BufferedWriter writer = null;
        try {
            //create a temporary file
            String fileName = args[0];
            String fileContent = args[1];
            new File("TextFiles").mkdir();
            File file = new File("TextFiles/" + fileName);
            System.out.println("asdfasfasf");
            
        	// This will output the full path where the file will be written to...
        	// System.out.println(file.getCanonicalPath());
            
            if(file.exists()){    
            	writer = new BufferedWriter(new FileWriter(file, true));
            	writer.newLine();
            	writer.write(fileContent);
            } else {
            	writer = new BufferedWriter(new FileWriter(file));
            	writer.write(fileContent);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }

	}

}
