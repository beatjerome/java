package chap5_19;
import java.lang.reflect.*;

public class Chap5_19 {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Class<Chap5_19> c=Chap5_19.class;
		System.out.println(c.getName());
		System.out.println(c.getSuperclass());
		System.out.println(Modifier.toString(c.getModifiers()));
		Type[] ifs=c.getInterfaces();
		if(ifs.length!=0)
		{
			for(Type inf :ifs)
				System.out.println(inf.toString());
		}else{
			System.out.println("No Interfaces");
		}
		
		Member[] mes=c.getMethods();
		if((mes.length!=0)){
			for(Member mef:mes){
				System.out.println(mef.toString());
			}
		}
			else{
				System.out.println("No Member");
			}
		}
	}


