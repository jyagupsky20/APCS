public class xyzThere{
  public boolean xyzThere(String str) {
		for(int i = 1; i<str.length()-2; i++){
			if(str.substring(i,i+3).equals("xyz") && ! str.substring(i-1,i).equals(".")){
				return true;
			}
		}
		if(str.length() >2 ){
      return str.substring(0,3).equals("xyz");
    }
		return false;
  }
}
