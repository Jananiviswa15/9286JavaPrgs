package CollectionEg;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileOutput {

	public static void main(String args[]) throws Exception {
		
//		try {
//		FileOutputStream output = new FileOutputStream("E:\\Study");
//		}catch() {
//			
//		}
		
		FileOutputStream output = new FileOutputStream("E:\\Studysample.txt");
		BufferedOutputStream bufferedOutput = new BufferedOutputStream(output);
		String name = "anything";
		byte arr[] = name.getBytes();
		bufferedOutput.write(arr);
		for(byte val : arr)
			System.out.print(val + " ");
		bufferedOutput.close();
		output.close();//finaly 
		
		
	}
}
