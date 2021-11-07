/*
Team Lonely Person  Joshua Yagupsky
APCS
HW 24 Get It While You Can
2021-10-28
Time Spent: 0.3 hours
DISCO
QCC
*/
public class Coin{
	public int value;
	public String upFace;
	public String name;
	public int flipCtr;
	public int headsCtr;
	public int tailsCtr;
	public double bias;
	public Coin() {
		value = 0;
		upFace = "heads";
		name = "null";
		flipCtr = 0;
		headsCtr = 0;
		tailsCtr = 0;
		bias = 0.5;
	}
	public Coin(String pname){
		upFace = "heads";
		name = pname;
		flipCtr = 0;
		headsCtr = 0;
		tailsCtr = 0;
		bias = 0.5;
		assignValue();
	}
	public Coin(String pname, String face){
		upFace = face;
		name = pname;
		flipCtr = 0;
		headsCtr = 0;
		tailsCtr = 0;
		bias = 0.5;
		assignValue();
	}
	public void assignValue(){
		if(name.equals("quarter")){
			value = 25;
		}
		else if(name.equals("dime")){
			value = 10;
		}
		else if(name.equals("nickel")){
			value = 5;
		}
		else if(name.equals("dollar")){
			value = 100;
		}
		else if(name.equals("half dollar")){
			value = 50;
		}
		else if(name.equals("penny")){
			value = 1;
		}
		else{
			value = 0;
		}
	}
	public String flip(){
		flipCtr++;
		if(Math.random()>bias){
			upFace = "tails";
		}
		else {
			upFace = "heads";
		}
		return upFace;
	}
	public boolean equals(Object o){
		Coin other = (Coin) o;
		return upFace.equals(other.upFace);
	}
	public String toString(){
		return "" + name + " -- " + upFace;
	}
	public String getFace(){
		return upFace;
	}
}
