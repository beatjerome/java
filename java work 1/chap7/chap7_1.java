package homework;
import java.util.*;
public class chap7_1 {
	class Student { // 定义学生类
		
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
		
		public boolean equals(Object a){ //重写equals方法
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
	System.out.println("输入4个学生的id 姓名 性别 出生年份：");
	
	for (int i = 0; i < 4; i++) {
		stu[i] = c.new Student(s.next(),s.next(),s.next(),s.nextInt());
		stus.add(stu[i]);
	}
	System.out.println("列表中还有" + stus.size() + "个学生：");
	
	for (int i = 0; i < stus.size(); i++) { // 遍历输出所有元素中学生的姓名
		System.out.println("第" + i + "个学生: " + stus.get(i).name);
	}
	
	System.out.println("输入要查找的学生的id 姓名 性别 出生年份：");
	Student d = c.new Student(s.next(),s.nextLine(),s.next(),s.nextInt());
	if (stus.contains(d)) {
		System.out.println("找到" + d.name + "，下标为" + stus.indexOf(d));// 输出下标
		stus.remove(d); // 从列表中移除该学生
		System.out.println("删除" + d.name + "后,还有" + stus.size() + "个学生：");
		for (int i = 0; i < stus.size(); i++) { // 遍历输出所有元素中学生的姓名
			System.out.println("第" + i + "个学生: " + stus.get(i).name);
		}
	}else{
		System.out.println("列表中找不到" + d.name); 
	    	}
	
}


}
