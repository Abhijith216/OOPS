import java.io.*;
public class filecopy{
	public static void main(String args[]){
		String sourceFile = "source.txt";
		String destFile = "dest.txt";

			try{
				FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile);
				byte buffer[] = new byte[1024];
				int length;
				while((length = fis.read(buffer)) < 0){
					fos.write(buffer,0,length);}
					fis.close();
					fos.close();
			}

			catch(Exception e){
				System.out.println("Error");
				e.printStackTrace();
			}
	}
}
