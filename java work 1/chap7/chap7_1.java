package homework;
import java.util.*;
public class chap7_1 {
	class Student { // ����ѧ����
		
	    String id;
		String name;
		String gender;
		int birtdh;
		
		Student(String id,String name,String gender,int birtdh){
			this.id=id;
			this.name=name;
			this.gender=gender;
			this.birtdh=birtdh;
			}
		
		public boolean equals(Object a){ //��дequals����
			if (id==null||a==null) {
	            return false;
	        }
	        if (a instanceof Student) {
	            Student b = (Student) a;
	            return id.equals(b.id);
	        }
	        return false;
	    }
	}
public static void main(String[] args) {
	chap7_1 c=new chap7_1();
	Scanner s = new Scanner(System.in);
	Student[] stu = new Student[4];
	ArrayList<Student> stus = new ArrayList<Student>();                              
	System.out.println("����4��ѧ����id ���� �Ա� ������ݣ�");
	
	for (int i = 0; i < 4; i++) {
		stu[i] = c.new Student(s.next(),s.next(),s.next(),s.nextInt());
		stus.add(stu[i]);
	}
	System.out.println("�б��л���" + stus.size() + "��ѧ����");
	
	for (int i = 0; i < stus.size(); i++) { // �����������Ԫ����ѧ��������
		System.out.println("��" + i + "��ѧ��: " + stus.get(i).name);
	}
	
	System.out.println("����Ҫ���ҵ�ѧ����id ���� �Ա� ������ݣ�");
	Student d = c.new Student(s.next(),s.nextLine(),s.next(),s.nextInt());
	if (stus.contains(d)) {
		System.out.println("�ҵ�" + d.name + "���±�Ϊ" + stus.indexOf(d));// ����±�
		stus.remove(d); // ���б����Ƴ���ѧ��
		System.out.println("ɾ��" + d.name + "��,����" + stus.size() + "��ѧ����");
		for (int i = 0; i < stus.size(); i++) { // �����������Ԫ����ѧ��������
			System.out.println("��" + i + "��ѧ��: " + stus.get(i).name);
		}
	}else{
		System.out.println("�б����Ҳ���" + d.name); 
	    	}
	
}


}
