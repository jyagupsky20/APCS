public class Cereal {
  String name; String type; int cal; int protein; int fat; int sodium; double fiber; double carbs; int sugar; int potassium; int vitamins; int shelf; double weight; double cups;
  public Cereal(String name, String type, int cal, int protein, int fat, int sodium, double fiber, double carbs, int sugar, int potassium, int vitamins, int shelf, double weight, double cups){
    this.name = name;
    this.type = type;
    this.cal = cal;
    this.protein = protein;
    this.fat = fat;
    this.sodium = sodium;
    this.carbs = carbs;
    this.sugar = sugar;
    this.potassium = potassium;
    this.vitamins = vitamins;
    this.shelf = shelf;
    this.weight = weight;
    this.cups = cups;
    this.fiber = fiber;
  }
  public String getName(){
    return name;
  }
  public String getType(){
    return type;
  }
  public int getCal(){
    return cal;
  }
  public int getProtein(){
    return protein;
  }
  public int getFat(){
    return fat;
  }
  public int getSodium(){
    return sodium;
  }
  public double getCarbs(){
    return carbs;
  }
  public double getFiber(){
    return fiber;
  }
  public int getSugar(){
    return sugar;
  }
  public int getPotassium(){
    return potassium;
  }
  public int getVitamins(){
    return vitamins;
  }
  public int getShelf(){
    return shelf;
  }
  public double getWeight(){
    return weight;
  }
  public double getCups(){
    return cups;
  }
  public String toString(){
    return "Name: " + name + ", Type: " + type + ", Calories: " + cal + ", Protein: " + protein + ", Fat: " + fat + ", Sodium: " + sodium + ", Fiber: " + fiber + ", Carbs: " + carbs + ", Sugar: " + sugar + ", Potassium: " + potassium + ", Vitamins: " + vitamins + ", Shelf Life: " + shelf + ", Weight: " + weight + ", Cups: " + cups + ".";
  }
  public static void main(String[] args) {
    Cereal fullBran = new Cereal("100% Bran", "C", 70,4,1,130,10,5,6,280,25,3,1,0.33,68.402973);
    System.out.println(fullBran.getName());
    System.out.println(fullBran.getType());
    System.out.println(fullBran.getCal());
    System.out.println(fullBran.getProtein());
    System.out.println(fullBran.getFat());
    System.out.println(fullBran.getSodium());
    System.out.println(fullBran.getFiber());
    System.out.println(fullBran.getCarbs());
    System.out.println(fullBran.getSugar());
    System.out.println(fullBran.getPotassium());
    System.out.println(fullBran.getVitamins());
    System.out.println(fullBran.getShelf());
    System.out.println(fullBran.getWeight());
    System.out.println(fullBran.getCups());
    System.out.println(fullBran.getRating());
    Cereal naturalBran = new Cereal("100% Natural Bran", "C", 120,3,5,15,2,8,8,135,0,3,1,1,33.983679);
    System.out.println(naturalBran);
  }
}
