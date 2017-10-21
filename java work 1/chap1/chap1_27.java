package homework;
import java.util.*;
public class chap1_27 {
//判断一年是否是闰年
	
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		while(true){
		System.out.println("请输入年份：");
		int num=s.nextInt();
		if((num%4==0&&num%100!=0)||num%400==0){
			System.out.println(num+"年是闰年");
		}
		else{
			System.out.println(num+"年不是闰年");
		}
	}
	}
}
