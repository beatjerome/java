package homework;

public class chap4_6 {
	public String StringTest(){
		int i=0;
		String s1="abcdefg";
		long l1 = System.currentTimeMillis();
		for(i=0;i<10000;i++){
			s1=s1+"abcdefg";
		}
		long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
		return s1;
	}
	
	public String StringBufferTest(){
		 StringBuffer s2 = new StringBuffer();
		 long l1 = System.currentTimeMillis();
		 for (int i = 0; i < 10000; i++) {
		      s2.append("abcdefg");
		     }
		  long l2 = System.currentTimeMillis();
		  System.out.println(l2-l1);
		  return s2.toString();
		}
	
	public void StringBuilderTest() {
        StringBuilder s3 = new StringBuilder();
        long l1 = System.currentTimeMillis();
        for (int i=0;i<100000;i++) {
            s3.append("abcdefg");
        	}
        long l2 = System.currentTimeMillis();
		System.out.println(l2-l1);
        s3.toString();
    }
	
}
