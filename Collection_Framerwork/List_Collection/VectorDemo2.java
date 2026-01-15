package Collection_Framerwork.List_Collection;
import java.util.Iterator;
import java.util.Vector;
//IPL auction retain or release players based on base price
public class VectorDemo2 {
    public static void main(String[] args) {
		
		IPlAuction ipl=new IPlAuction("srh");
		ipl.add(new Player(121,"abhish",2000d));
		ipl.add(new Player(122,"head",3000d));
		ipl.add(new Player(123,"virat",8000d));
		ipl.add(new Player(124,"klasen",4000d));
		ipl.add(new Player(125,"abhish",2000d));
		ipl.add(new Player(126,"bhuvi",10000d));
		ipl.add(new Player(127,"absh",12000d));
		ipl.retainOrRelease();
		ipl.displayAllPlayer();
	}

}


record Player(Integer id,String name,Double basePrice)
{
	
}

class IPlAuction
{
	private String iplTeam;
	private Vector <Player>listOfPlayer;
	
	public IPlAuction(String iplTem)
	{
		this.iplTeam=iplTem;
		listOfPlayer=new Vector<>(15);
		
	}
	public void add(Player player)
	{
		listOfPlayer.add(player);
	}
	
	public void retainOrRelease()
	{
		Iterator<Player>iterator =listOfPlayer.iterator();
		
		while (iterator.hasNext()) {
			Player player =iterator.next();
			
			if(player.basePrice()>5000)
			{
				iterator.remove();
			}
		}
		
	}
	public void displayAllPlayer()
	{
		for(Player player :listOfPlayer)
		{
			IO.println(player);
		}
	}
}
