package homework;
import java.util.*;
public class chap1_27 {
//�ж�һ���Ƿ�������
	
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		while(true){
		System.out.println("��������ݣ�");
		int num=s.nextInt();
		if((num%4==0&&num%100!=0)||num%400==0){
			System.out.println(num+"��������");
		}
		else{
			System.out.println(num+"�겻������");
		}
	}
	}
}
