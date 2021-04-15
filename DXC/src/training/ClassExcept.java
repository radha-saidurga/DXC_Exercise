package training;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ClassExcept {
	public static void main(String [] args) {
		File file1 = new File("E:\\java.txt");
		File dir=new File("E;//");
		File file_dir =new File(dir,"textfile.txt");
		System.out.println("file ready");
		try {
			FileInputStream fi = new FileInputStream(file1);
			int num=fi.available();
			System.out.println("number of bytes ready to read"+num);
			byte b[]=new byte[num];
			int c;
			if((c=fi.read(b))!=-1)
				
				System.out.println("number of bytes is +c" +c);
			String s = new String(b);
			System.out.println(s);
	fi.close();
	}catch (IOException e) {
		//TODO:handle excepton
	}finally {
	}
}
}
