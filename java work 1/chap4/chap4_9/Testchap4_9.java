package homework;

import java.util.*;
public class Testchap4_9 {
	public static void main(String[] args){
		System.out.println("��ӭʹ�ü�������");
		while(true){
		System.out.println("1.�ӷ�");
		System.out.println("2.����");
		System.out.println("3.�˷�");
		System.out.println("4.����");
		
		chap4_9 a=new chap4_9();
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		switch(b){
		case 1:{
			System.out.println("���������������(�ո��Էָ�):");
			double x=s.nextDouble();
			double y=s.nextDouble();
			a.add(x,y);
		}
		
		case 2:{
			System.out.println("���������������(�ո��Էָ�):");
			double x=s.nextDouble();
			double y=s.nextDouble();
			a.subtract(x,y);
		}
		
		case 3:{
			System.out.println("���������������(�ո��Էָ�):");
			double x=s.nextDouble();
			double y=s.nextDouble();
			a.multiply(x, y);
		}
		
		case 4:{
			System.out.println("���������������(�ո��Էָ�):");
			double x=s.nextDouble();
			double y=s.nextDouble();
			a.divide(x, y);
		 }
		}
	   }
	}
}
