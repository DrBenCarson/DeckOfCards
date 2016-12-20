import java.util.ArrayList;


public class Tester {

	public static void main(String[] args) {
		String z="spades";
		String zz="hearts";
		String zzz="diamonds";
		String zzzz="clubs";
		ArrayList<Type> deck=new ArrayList<Type>();
		ArrayList<Type> player1=new ArrayList<Type>();
		ArrayList<Type> player2=new ArrayList<Type>();
		Type cardThing;
		int g=0;
		for (int y=1; y<14; y++)
		{
			cardThing=new Type(z,y);
			deck.add(g,cardThing);
			g++;
		}
		for (int x=1; x<14; x++)
		{
			cardThing =new Type(zz,x);
			deck.add(g,cardThing);
			g++;
		}
		for (int w=1; w<14; w++)
		{
			cardThing=new Type(zzz,w);
			deck.add(g,cardThing);
			g++;
		}
		for (int v=1; v<14; v++)
		{
			cardThing=new Type(zzzz,v);
			deck.add(g,cardThing);
			g++;
		}
		//player1 shit. Second time through
		/*int hh=0;
		for (int yc=1; yc<14; yc++)
		{
			cardThing=new Type(z,yc);
			player1.add(hh,cardThing);
			hh++;
		}
		for (int xc=1; xc<14; xc++)
		{
			cardThing =new Type(zz,xc);
			player1.add(hh,cardThing);
			hh++;
		}
		for (int wc=1; wc<14; wc++)
		{
			cardThing=new Type(zzz,wc);
			player1.add(hh,cardThing);
			hh++;
		}
		for (int vc=1; vc<14; vc++)
		{
			cardThing=new Type(zzzz,vc);
			player1.add(hh,cardThing);
			hh++;
		}
		
		int hhh=0;
		for (int ycc=1; ycc<14; ycc++)
		{
			cardThing=new Type(z,ycc);
			player2.add(hhh,cardThing);
			hhh++;
		}
		for (int xcc=1; xcc<14; xcc++)
		{
			cardThing =new Type(zz,xcc);
			player2.add(hhh,cardThing);
			hhh++;
		}
		for (int wcc=1; wcc<14; wcc++)
		{
			cardThing=new Type(zzz,wcc);
			player2.add(hhh,cardThing);
			hhh++;
		}
		for (int vcc=1; vcc<14; vcc++)
		{
			cardThing=new Type(zzzz,vcc);
			player2.add(hhh,cardThing);
			hhh++;
		}*/
		
		Card bicycle=new Card(deck);
		//bicycle.shuffle();
		//bicycle.driver1();
		/*for(int u=0;u<52;u++)
		{
			bicycle.driver1();
		}
		Type vax=new Type("hearts", 13);
		//bicycle.addCard(vax);
		for (int stst=0;stst<bicycle.getArrayL().size();stst++)
		{
			bicycle.dealCard();
		}*/
		
		
		Card firstPlayer=new Card(player1);
		Card secondPlayer=new Card(player2);
		bicycle.shuffle();
		int arraySize=bicycle.returnArraySize(deck)/2;
		
		for(int ghg=0; ghg<7; ghg++){
		bicycle.dealToDeck(player1);
		bicycle.dealToDeck(player2);}
		int turning=0;
		boolean bbbb=true;
		while(bbbb)
		{
			if (bicycle.returnArraySize(player1)==0)
			{
				System.out.println(turning+": Player Two has won the contest. GAME OVER");
				break;
			}
			else if (bicycle.returnArraySize(player2)==0)
			{
				System.out.println(turning+ ": Player One has won the contest. GAME OVER");
				break;
			}
			else
			{
			if (bicycle.letUsMakeaDeal(player1)>bicycle.letUsMakeaDeal(player2))
			{
				turning++;
				System.out.println(turning+": Player One has won this trick. "+player1.get(0).getCard1()+" beats "+ player2.get(0).getCard1());
				bicycle.playWar(player2, player1);
				continue;
			}
			if(bicycle.letUsMakeaDeal(player2)>bicycle.letUsMakeaDeal(player1))
			{
				turning++;
				System.out.println(turning+": Player Two has won this trick. "+player2.get(0).getCard1()+ " beats "+ player1.get(0).getCard1());
				bicycle.playWar(player2,player1);
				continue;
			}
			else if(bicycle.letUsMakeaDeal(player2)==bicycle.letUsMakeaDeal(player1))
			{
				bicycle.tie(player1,player2);
			}
			}
		}
		/*for (int num=0; num<player1.size();num++)
		{
			System.out.println("The hand of Player 1 is: " +player1.get(num).getCard1());}
		System.out.println();
		for (int mun=0; mun<7;mun++)
		{
			System.out.println("The hand of Player 2 is: "+player2.get(mun).getCard1());
		}*/
		System.out.println("The deck has "+bicycle.returnArraySize(deck)+ "cards remaining.");
		
		
		
	}

}
