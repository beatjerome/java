package chap5_17;


public class Chap5_17 {
	public static void main(String[] args){
			System.out.println("��������һ���ף�׼����ʼ��");
			Thread rabbit=new Thread(new Task(),"����");
			Thread tortoise=new Thread(new Task(),"�ڹ�");
			rabbit.setPriority(Thread.MAX_PRIORITY);
			tortoise.setPriority(Thread.MIN_PRIORITY);
			rabbit.start();
			tortoise.start();
}
}

class Task implements Runnable{
	@Override
	public void run(){
		for(int i=1;i<=100;i++)
		{
			try{
				if(i==50&&Thread.currentThread().getName().equals("����"))
				{
					System.out.println("�����ڰ�·˯����.");
					Thread.sleep(3000);
					System.out.println("���������������ڹ곬Խ���Լ�,׷���ڹ�");
				}
				}catch(Exception e){
					e.printStackTrace();
				}
		System.out.println(Thread.currentThread().getName()+"�Ѿ�����"+i);
		}
	}
	}

	