package homework;

import java.util.*;
public class chap1_31 {
	//��4*4��������������к��У�
	public static void main(String[] args){
		int i,j;
		int temp,counter=0;
		int a=0;
		int [] num =new int[16];
			
		Scanner s=new Scanner(System.in);
		System.out.println("����������Ԫ�أ�");
		for(i=0;i<=15;i++){			//��������
			num[i]=s.nextInt();		
			}
		
		for(i=0;i<16;i++){		//һά��������
			for(j=0;j<15;j++){
				if(num[j]<num[i]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		for(i=0;i<16;i++){		//һάת���ض�ά�����
				if((i+1)%4!=0){
					System.out.print(num[i]+" ");
				}
				else{
					System.out.println(num[i]);
				}
			}
		}
		
	
	}

