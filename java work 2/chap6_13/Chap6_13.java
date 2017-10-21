package chap6_13;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

public class Chap6_13 {
	public static void main(String[] args)throws Exception{
		System.out.println("请输入文件位置：");
		Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();
		File file=new File(fileName);
		boolean bl=file.exists();
		if(bl){
			fileDir(file);
		}else 
		{
			System.out.println("文件不存在，请重新输入：");
	}}
	
	
	public static void fileDir(File dir){
		
		File[] files=dir.listFiles();
		for(File file:files){
			if(file.isDirectory()){
				fileDir(file);
			}
			if(file.getName().endsWith(".java")){
				System.out.println("文件名字"+file.getName());
				System.out.println("文件的绝对路径"+file.getAbsolutePath());
				System.out.println("文件大小:"+file.length()+"bytes");
			    System.out.println("最后修改时间为"+file.lastModified());
			}
		}
	}}
