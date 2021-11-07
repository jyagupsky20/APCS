public class endOther{
  public boolean endOther(String a, String b) {
    String c;
    String d;
    if(a.length()>=b.length()){
      c = a.toLowerCase();
      d = b.toLowerCase();
    }
    else{
      d = a.toLowerCase();
      c = b.toLowerCase();
    }
    if(c.substring(c.length()-d.length(),c.length()).equals(d)){
      return true;
    }
    else{
      return false;
    }
  }
}
