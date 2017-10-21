package homework;


import homework.chap2_12.Book;
public class Testchap2_12 {
	public static void main(String[] args){
			chap2_12 a=new chap2_12();
			Book b=a.new Book();
			b.setbook("core java","Horstmann", 200);
			b.printbook();
			b.Author="Joshua";
			b.Bookname="effective java";
			b.salevolume=100;
			b.printbook();
		}
		
}
