package chap5_18;

import chap5_18.TicketWindow;

class TicketWindow implements Runnable{
	private int TicketSum=100;
	@Override
	public void run(){
		while(true){
			synchronized(new Object()){
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			if(TicketSum>0){
				System.out.println(Thread.currentThread().getName()+
						"正在发售第"+TicketSum--+"张票");
				}
			else break;
			}}
		}
}


public class Chap5_17 {
	public static void main(String[] args){
		TicketWindow task=new TicketWindow();
		new Thread(task,"窗口1").start();
		new Thread(task,"窗口2").start();
		new Thread(task,"窗口3").start();
		new Thread(task,"窗口4").start();
	}
}	
	