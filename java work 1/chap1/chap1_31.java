package homework;

import java.util.*;
public class chap1_31 {
	//对4*4数组进行排序（先行后列）
	public static void main(String[] args){
		int i,j;
		int temp,counter=0;
		int a=0;
		int [] num =new int[16];
			
		Scanner s=new Scanner(System.in);
		System.out.println("请依次输入元素：");
		for(i=0;i<=15;i++){			//读入数组
			num[i]=s.nextInt();		
			}
		
		for(i=0;i<16;i++){		//一维数组排序
			for(j=0;j<15;j++){
				if(num[j]<num[i]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		for(i=0;i<16;i++){		//一维转换回二维并输出
				if((i+1)%4!=0){
					System.out.print(num[i]+" ");
				}
				else{
					System.out.println(num[i]);
				}
			}
		}
		
	
	}

