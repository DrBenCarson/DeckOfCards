
public class Type {
private String aa;
private int bb;

public Type(String a, int b)
{
	aa=a;
	bb=b;
}
	public String getSuit()
	{
		return aa;
	}
	public int getValue()
	{
		return bb;
	}
	public String getCard1()
	{
		String cardy=Integer.toString(bb)+" ";
		
		//String rrr=(decky.get(k).getValue()+" "+decky.get(k).getSuit());
		if(cardy.substring(0,2).equals("11")){
			cardy="J "+aa;
		}
		if(cardy.substring(0,2).equals("12")){
			cardy="Q "+aa;
		}
		if(cardy.substring(0,2).equals("13")){
			cardy="K "+aa;
		}
		if(cardy.substring(0,2).equals("1 ")){
			cardy="A "+aa;
		}
		return cardy;
	}



}
