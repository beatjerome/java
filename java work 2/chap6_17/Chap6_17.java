package chap6_17;
import java.io.*;
import java.util.Scanner;

public class Chap6_17 {
      private static String message="";    	  
      public static void main(String[] args){
          try {
			editFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      
      private static void editFile()throws Exception{
    	  System.out.println("请需要更改的文本文件：(.txt文件)");
    	  Scanner sc=new Scanner(System.in);
    	  String filename=sc.nextLine();
    	  File file=new File(filename);
    	  if(file!=null&&!(filename.endsWith(".txt")))
    			  {
    		  System.out.println("请输入正确的文件路径");
    		  return;
    			  }
    	  System.out.println("请输入要修改的内容（以\"修改的目标文字:修改之后的文字\"格式),"
    			  +"停止修改请输入\"stop\":");
    	  String inputMessage="";
    	  while(!inputMessage.equals("stop")){
    		   inputMessage=sc.nextLine();
    		   if(inputMessage!=null&&inputMessage.length()>0){
    			   String[] editMessage=inputMessage.split(":");
    			   if(editMessage!=null&&editMessage.length>1){
    				   FileReader in=new FileReader(file);
    			    	  char[] charArray=new char[1024];
    			    	  int len=0;
    			    	  StringBuffer sb=new StringBuffer();
    			    	  while((len=in.read(charArray))!=-1){
    			    		  sb.append(charArray);
    			    	  }
    			    	  message=sb.toString();
    			    	  in.close();
    				   message=message.replace(editMessage[0],editMessage[1]);
    				   System.out.println("修改成功");
    	    			 
    			   }
    			   
    		   }
    	  }
    	 
    	  System.out.println("修改后的内容为:"+message);
      
    	  
      }
}
