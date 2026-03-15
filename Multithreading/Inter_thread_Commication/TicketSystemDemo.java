package Multithreading.Inter_thread_Commication;


class TicketSystem
{
	int availableTickets=5;
	
	public synchronized void bookTicket(int numberOfTicket)
	{
		while(availableTickets<numberOfTicket)
		{
			IO.println("Not Enough ticket (Ticket),waiting for  Cancellation");
		}
		try
		{
			wait();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	
	
	
	this.availableTickets=this.availableTickets-numberOfTicket;
	IO.println(numberOfTicket+"Ticket (Ticket) are bokked Avaible  Ticket is "+availableTickets);
	

	}
public synchronized void cancelTicekt(int numberOfTicket)
{
	this.availableTickets=this.availableTickets+numberOfTicket;
	IO.println(numberOfTicket+"ticket (Ticket) are cancelled,Avaible tickets are : "+availableTickets);
	notify();

}
}
public class TicketSystemDemo {
	void main()
	{
		TicketSystem t1=new TicketSystem();
		Thread bookingThread=new Thread()
				{
			public void run()
			{
				int []tickets= {2,4,4};
				for(int ticket:tickets)
				{
					t1.bookTicket(ticket);
					try
					{
						Thread.sleep(2000);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
				};
				bookingThread.start();
				
				Thread cancelThread=new Thread()
						{
					public void run()
					{
						int []tickets= {1,2,3};
						
						for(int ticket:tickets)
						{
						  t1.cancelTicekt(ticket);
						  try
						  {
							  Thread.sleep(20000);
						  }
						  catch(InterruptedException e)
						  {
							  e.printStackTrace();
						  }
						}
					}
						};
		                  cancelThread.start();
		
	}
}


