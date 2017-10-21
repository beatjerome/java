package homework;

import java.io.*;
public class chap4_8 {
	 public static boolean checkEmail(String email)
	  {// 验证邮箱的正则表达式 
	   String format = "\\w{2,15}[@][a-z0-9]{2,}[.]\\p{Lower}{2,}";
	   //p{Alpha}:内容是必选的，和字母字符[\p{Lower}\p{Upper}]等价。如：200896@163.com不是合法的。
	   //w{2,15}: 2~15个[a-zA-Z_0-9]字符；w{}内容是必选的。 如：dyh@152.com是合法的。
	   //[a-z0-9]{3,}：至少三个[a-z0-9]字符,[]内的是必选的；如：dyh200896@16.com是不合法的。
	   //[.]:'.'号时必选的； 如：dyh200896@163com是不合法的。
	   //p{Lower}{2,}小写字母，两个以上。如：dyh200896@163.c是不合法的。
	   if (email.matches(format))
	    { 
	     return true;// 邮箱名合法，返回true 
	    }
	   else
	    {
	     return false;// 邮箱名不合法，返回false
	    }
	  } 
	 public static void main(String[] args) throws Exception
	 {
		
		 String email = "1003160184@qq.com"; // 需要进行验证的邮箱
		 while(true)
		 {
			 System.out.println("请输入要验证的邮箱:");
			 email = new BufferedReader(new InputStreamReader(System.in)).readLine();
			 if (chap4_8.checkEmail(email))// 验证邮箱
			 {   
				 System.out.println(email+"是合法的邮箱名。");
			 }
			 else
			 {
				 System.out.println(email+"不是合法的邮箱名。");
			 }
		 }
	 }
}
