/*Team Something Important Minus One :: Joshua Yagupsky, Jonathan Song
APCS
LAB08 -- Data
2022-04-05
time spent: 3.0 hr*/
public class Cereal {
	String name;
	String type;
	int calories;
	int protein;
	int fat;
	int sodium;
	double fiber;
	double carbs;
	int sugar;
	int potassium;
	int vitamins;
	int shelf;
	double weight;
	double cups;
	public Cereal(String name, String type, int calories, int protein, int fat, int sodium, double fiber, double carbs, int sugar, int potassium, int vitamins, int shelf, double weight, double cups){
	this.name = name;
	this.type = type;
	this.calories = calories;
	this.protein = protein;
	this.fat = fat;
	this.sodium = sodium;
	this.fiber = fiber;
	this.carbs = carbs;
	this.sugar = sugar;
	this.potassium = potassium;
	this.vitamins = vitamins;
	this.shelf = shelf;
	this.weight = weight;
	this.cups = cups;
	}
	public String name(){return name;}public String type(){return type;}public int calories(){return calories;}public int protein(){return protein;}public int fat(){return fat;}public int sodium(){return sodium;}
  public double fiber(){return fiber;}public double carbs(){return carbs;}public int sugar(){return sugar;}public int potassium(){return potassium;}public int vitamins(){return vitamins;} public int shelf(){return shelf;}public double weight(){return weight;}public double cups(){return cups;}
  public String toString(){
    String ret = "";
    ret += "Name: " + name();
    ret += ", Type: " + type();
    ret += ", Calories: " + calories();
    ret += ", Protein: " + protein();
    ret += ", Fat: " + fat();
    ret += ", Sodium: " + sodium();
    ret += ", Fiber: " + fiber();
    ret += ", Carbs: " + carbs();
    ret += ", Sugar: " + sugar();
    ret += ", Potassium: " + potassium();
    ret += ", Vitamins: " + vitamins();
    ret += ", Shelf life: " + shelf();
    ret += ", Weight: " + weight();
    ret += ", Cups: " + cups();
    return ret;
  }
  public static void main(String[] args) {
    Cereal fullBran = new Cereal("100% Bran","C",70,4,1,130,10,5,6,280,25,3,1,0.33);
    Cereal coWheat = new Cereal("Cream of Wheat (Quick)","H",100,3,0,80,1,21,0,-1,0,2,1,1);
    System.out.println(fullBran);
    System.out.println(coWheat.name());
    System.out.println(coWheat.type());
    System.out.println(coWheat.calories());
    System.out.println(coWheat.protein());
    System.out.println(coWheat.fat());
    System.out.println(coWheat.sodium());
    System.out.println(coWheat.fiber());
    System.out.println(coWheat.carbs());
    System.out.println(coWheat.sugar());
    System.out.println(coWheat.potassium());
    System.out.println(coWheat.vitamins());
    System.out.println(coWheat.shelf());
    System.out.println(coWheat.weight());
    System.out.println(coWheat.cups());
  }
}
