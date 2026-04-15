class Task1 extends Thread
{
    public void run()
    {
        System.out.println(currentThread().getName() + " Started");
        for(int i=1;i<=5;i++)
        {
            if(i == 2)
            {
                  //yield();
            }
            System.out.println(currentThread().getName() + " I : " + i);
        }

        System.out.println(currentThread().getName() + " Is Executed..");
    }
}

class Task2 extends Thread{
    public void run()
    {
        System.out.println(currentThread().getName() + " Is Started");
        for(int j=1;j<=5;j++)
        {
            if(j==3)
            {
                stop();
            }
            System.out.println(currentThread().getName() + " J : " + j);
        }
        System.out.println(currentThread().getName() + " Is Executed...");
    }
}

class Task3 extends Thread{
    public void run()
    {
        System.out.println(currentThread().getName() + " Is Started");

        for(int k=1;k<=5;k++)
        {
            if(k==4)
            {
                try{
                    sleep(3000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println(currentThread().getName() + " K : "+k);
        }

        System.out.println(currentThread().getName() + " Is Executed");
    }
}

class ThreadPractice1{
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        t1.setName("Task-1");
        t1.start();
        t2.setName("Task-2");
        t2.start();
        t3.setName("Task-3");
        t3.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());
    }
}