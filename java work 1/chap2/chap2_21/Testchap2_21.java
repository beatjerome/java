package homework;


import java.lang.reflect.Method;
import homework.chap2_21.interC;
	public class Testchap2_21 extends inherit implements interC{
		public void a(){
			System.out.println("1");
		}
		
		public String b(){
			return "¿§à¬gigi";
		}
		
		public void  c(){
			System.out.println("3");
		}
		
		public String d(){
			return "¿§à¬gigi";
		}
		
		public void e(){
			System.out.println("5");
			}


		public static void main(String[] args)throws Exception {
			Class<Testchap2_21> invokertester = Testchap2_21.class;
			Object newInstan = invokertester.newInstance();
			Method[] methods = invokertester.getDeclaredMethods();
			for(Method m:methods) {
			if(!"main".equals(m.getName())){
			if(m.getReturnType()==String.class) {
			System.out.println(m.invoke(newInstan,new Object[]{}));
			}
			else {
			m.invoke(newInstan,new Object[]{});
			}
		  }
	    }
	  }
	}


