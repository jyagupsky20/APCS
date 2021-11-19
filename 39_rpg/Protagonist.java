public class Protagonist {
  String name = "";
  boolean alive = true;
  boolean isStrongAttack = false;
  public Protagonist(String name){
    this.name = name;
  }
  public boolean isAlive(){
    return alive;
  }
  public String getName(){
    return name;
  }
  public void specialize(){
    isStrongAttack = true;
  }
  public void normalize(){
    isStrongAttack = false;
  }
  public int attack(Monster enemy){
    return 5;
  }
}
