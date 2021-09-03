package com.jobready.threading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         task taskRunner=new task();
         taskRunner.start();
	}

}
class task extends Thread{
	public void run()
	{
	 for(int i=0;i<5;i++)
	 {
		 System.out.println(i);
	 }
	}
}
