// Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
//APCS pd7
//HW75 -- node
//2022-03-13
//time spent: 0.4hr + class time

public class LLNode {
  private String value;
  private LLNode node;

  public LLNode() {
    this.value = null;
    this.node = null;
  }
  public String toString(){
    return this.getValue();
  }
  public LLNode(String value, LLNode node) {
    this.value = value;
    this.node = node;
  }

  public void setValue(String value) {
    if (value != null) {
      this.value = value;
    }
  }

  public String getValue() {
    return this.value;
  }

  public void setSubNode(LLNode node) {
    if(value != null){
      this.node = node;
    }
  }
  public LLNode getSubNode() {
    return this.node;
  }

  public static void main(String[] args) {
    LLNode Null = new LLNode();
    System.out.println(Null.getValue());
    System.out.println(Null.getSubNode());
    LLNode prongs = new LLNode("Prongs", Null);
    System.out.println(prongs.getValue());
    System.out.println(prongs.getSubNode());
    prongs.setValue("Sprongs");
    prongs.setSubNode(prongs);
    System.out.println(prongs.getValue());
    System.out.println(prongs.getSubNode());
  }
}
