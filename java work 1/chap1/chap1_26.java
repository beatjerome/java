package homework;
import java.util.Random;
public class chap1_26 {
	public static void main(String[] args){
		int num=0;
		Random random = new Random();
		while(num!=50){
			num= (random.nextInt(100)) * (random.nextInt(2)==0 ? -1 : 1);
			System.out.println(num);
			
		}
		
	}
}
