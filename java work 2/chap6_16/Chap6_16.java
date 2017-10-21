package chap6_16;
import java.io.*;
import java.util.*;

public class Chap6_16{
	public static void main(String[] args)throws Exception{
		System.out.println("请输入你要新建文件的文件名:(默认包含在F盘,包含.txt");
		Scanner sc=new Scanner(System.in);
		FileWriter writer=new FileWriter("F:\\"+sc.nextLine()+".txt");
		
		BufferedWriter bw=new BufferedWriter(writer);
		String line;
		while((line=sc.nextLine()).endsWith("over")==false)
		{
			bw.write(line);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
	

}
