package chap6_13;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

public class Chap6_13 {
	public static void main(String[] args)throws Exception{
		System.out.println("�������ļ�λ�ã�");
		Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();
		File file=new File(fileName);
		boolean bl=file.exists();
		if(bl){
			fileDir(file);
		}else 
		{
			System.out.println("�ļ������ڣ����������룺");
	}}
	
	
	public static void fileDir(File dir){
		
		File[] files=dir.listFiles();
		for(File file:files){
			if(file.isDirectory()){
				fileDir(file);
			}
			if(file.getName().endsWith(".java")){
				System.out.println("�ļ�����"+file.getName());
				System.out.println("�ļ��ľ���·��"+file.getAbsolutePath());
				System.out.println("�ļ���С:"+file.length()+"bytes");
			    System.out.println("����޸�ʱ��Ϊ"+file.lastModified());
			}
		}
	}}
