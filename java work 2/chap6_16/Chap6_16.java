package chap6_16;
import java.io.*;
import java.util.*;

public class Chap6_16{
	public static void main(String[] args)throws Exception{
		System.out.println("��������Ҫ�½��ļ����ļ���:(Ĭ�ϰ�����F��,����.txt");
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
