package chap5_17;


public class Chap5_17 {
	public static void main(String[] args){
			System.out.println("龟兔赛跑一百米，准备开始：");
			Thread rabbit=new Thread(new Task(),"兔子");
			Thread tortoise=new Thread(new Task(),"乌龟");
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
				if(i==50&&Thread.currentThread().getName().equals("兔子"))
				{
					System.out.println("兔子在半路睡着了.");
					Thread.sleep(3000);
					System.out.println("兔子醒来，发现乌龟超越了自己,追赶乌龟");
				}
				}catch(Exception e){
					e.printStackTrace();
				}
		System.out.println(Thread.currentThread().getName()+"已经跑了"+i);
		}
	}
	}

	