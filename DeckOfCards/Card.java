import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Card implements Comparable{
	ArrayList<Type> decky;
	//ArrayList<Type> decky1;
	//ArrayList<Type> decky2;
	int k=0;
	public Card(ArrayList<Type> n)
	{
		decky=n;
		//decky1=n;
		//decky2=n;
		
	}
	
	public void shuffle() 
	{
		Random rndm=new Random();
		for (int r=0; r<decky.size();r++)
		{
		int s=rndm.nextInt(decky.size());
		int q=rndm.nextInt(decky.size());
		Collections.swap(decky,s,q);
		}
		k=0;
		System.out.println();
	}

	//@Override
	public void dealCard() {
		String rrr=(decky.get(k).getValue()+" "+decky.get(k).getSuit());
		if(rrr.substring(0,2).equals("11")){
			rrr="J "+decky.get(k).getSuit();
		}
		if(rrr.substring(0,2).equals("12")){
			rrr="Q "+decky.get(k).getSuit();
		}
		if(rrr.substring(0,2).equals("13")){
			rrr="K "+decky.get(k).getSuit();
		}
		if(rrr.substring(0,2).equals("1 ")){
			rrr="A "+decky.get(k).getSuit();
		}
		System.out.println(rrr);
		k++;
		
	}
	public void driver1()
	{
		Random rndm=new Random();
		for (int r=0; r<52;r++)
		{
		int s=rndm.nextInt(52);
		int q=rndm.nextInt(52);
		Collections.swap(decky,s,q);
		}
		k=0;
		System.out.println();
		
		Scanner kbReader=new Scanner(System.in);
		System.out.println("How many cards should be dealt? ");
		int ttt=kbReader.nextInt();
		for(int jk=0;jk<ttt;jk++)
		{
		String rrr=(decky.get(k).getValue()+" "+decky.get(k).getSuit());
		if(rrr.substring(0,2).equals("11")){
			rrr="J "+decky.get(k).getSuit();
		}
		if(rrr.substring(0,2).equals("12")){
			rrr="Q "+decky.get(k).getSuit();
		}
		if(rrr.substring(0,2).equals("13")){
			rrr="K "+decky.get(k).getSuit();
		}
		if(rrr.substring(0,2).equals("1 ")){
			rrr="A "+decky.get(k).getSuit();
		}
		System.out.println(rrr);
		k++;
		}
	}
	
	public void addCard(Type E)
	{
		decky.add(0,E);
	}
	public void removeCar(int rem)
	{
		decky.remove(rem);
	}
	public ArrayList<Type> getArrayL()
	{
		return decky;
	}
	public void dealToDeck(ArrayList<Type> A)
	{
		Type B=decky.get(0);
		decky.remove(0);
		A.add(0,B);
	}
	public int returnArraySize(ArrayList<Type>R)
	{
		return R.size();
	}
	public int letUsMakeaDeal(ArrayList<Type>sir)
	{
		int abcd=sir.get(0).getValue();
		return abcd;
	}
	public void tie(ArrayList<Type> gn, ArrayList<Type> ng)
	{
		System.out.println("There is a tie; the cards are the same. Both card are now moved ot the bottom of the respective decks.");
		Type fjfj=gn.get(0);
		Type jfjf=ng.get(0);
		gn.remove(0);
		ng.remove(0);
		if(gn.size()>0)
		{
			gn.add(gn.size()-1,fjfj);
		}
		if(ng.size()>0)
		{
			ng.add(ng.size()-1,jfjf);
		}
	}
	public void playWar(ArrayList<Type> numberOne, ArrayList<Type> numberTwo)
	{
		Type tyty=numberTwo.get(0);
		numberTwo.remove(0);
		if(numberTwo.size()>0)
		{
			numberTwo.remove(numberTwo.size()-1);
		}
		numberOne.add(numberOne.size()-1,tyty);
		Type ytyt=numberOne.get(0);
		numberOne.remove(0);
		numberOne.add(numberOne.size()-1,ytyt);
	
	}	

}
