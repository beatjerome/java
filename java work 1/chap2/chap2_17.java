package homework;

public class chap2_17 {
	public abstract class student{
		private String name;
		private int number;
		private float majorlesson;
		private float math;
		private float english;
	
		public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name=name;
		}
		
		public int getnumber(){
			return number;
		}
		
		public void setnumber(int number){
			this.number=number;
		}
		
		public float getmajorlesson(){
			return majorlesson;
		}
		
		public void setmajorlesson(float majorlesson){
			this.majorlesson=majorlesson;
		}
		
		public float getMath(){
			return math;
		}
		
		public void setMath(float math){
			this.math=math;
		}
		
		public float getEnglish(){
			return english;
		}
		
		public void setEnglish(float english){
			this.english=english;
		}
		

		public float average(float majorlesson,float math,float english){
			float a;
			a=(majorlesson+math+english)/3;
			return a;
		}
		
		public void scholarship(float average){
			
		}	
	}


	public class Undergraduate extends student{
	
		public void scholarship(float average){
		if(average>95)
			System.out.println("��ѧ�����һ�Ƚ�ѧ��");
		else if(average>85)
			System.out.println("��ѧ����ö��Ƚ�ѧ��");
		else if(average>75)
			System.out.println("��ѧ��������Ƚ�ѧ��");
		else {
			System.out.println("��ѧ��û�л�ý�ѧ��");
		}
	}
		

}
	


	public class Postgraduate extends student{
		
		public void scholarship(float average){
			if(average>90)
				System.out.println("��ѧ�����һ�Ƚ�ѧ��");
			else if(average>80)
				System.out.println("��ѧ����ö��Ƚ�ѧ��");
			else if(average>70)
				System.out.println("��ѧ��������Ƚ�ѧ��");
			else {
				System.out.println("��ѧ��û�л�ý�ѧ��");
			}
		}
	}
public  static void main(String[] args) {
		
			chap2_17 c= new chap2_17();
			Undergraduate student1=c.new Undergraduate();
			student1.setName("����");
			student1.setmajorlesson(81);
			student1.setEnglish(88);
			student1.setMath(97);
			student1.setnumber(001);
			System.out.println("������������"+student1.getName());
			System.out.println("ѧ��ѧ�ţ�"+student1.getnumber());
			System.out.println("ѧ��רҵ�γɼ�:"+student1.getmajorlesson());
			System.out.println("ѧ�������ɼ���"+student1.getMath());
			System.out.println("ѧ����Ӣ�ɼ�"+student1.getEnglish());
			System.out.println("ѧ��ƽ���֣�"+student1.average(student1.getmajorlesson(),student1.getEnglish(),student1.getMath()));
			System.out.println("ѧ����ѧ�������");
			student1.scholarship(student1.average(student1.getmajorlesson(),student1.getEnglish(),student1.getMath()));
		
			Postgraduate student2 = c.new Postgraduate();
			student2.setName("����");
			student2.setmajorlesson(88);
			student2.setMath(75);
			student2.setEnglish(80);
			student2.scholarship(91);
			student2.setnumber(007);
			System.out.println("�о���������"+student2.getName());
			System.out.println("ѧ��ѧ�ţ�"+student2.getnumber());
			System.out.println("ѧ��רҵ�γɼ�:"+student2.getmajorlesson());
			System.out.println("ѧ�������ɼ���"+student2.getMath());
			System.out.println("ѧ����Ӣ�ɼ�"+student2.getEnglish());
			System.out.println("ѧ��ƽ���֣�"+student2.average(student2.getmajorlesson(),student2.getEnglish(),student2.getMath()));
			System.out.println("ѧ����ѧ�������");
			student2.scholarship(student2.average(student2.getmajorlesson(),student2.getEnglish(),student2.getMath()));
		}


}
