public class catDog{
  public boolean catDog(String str) {
  int counter = 0;
		for(int i = 0; i<str.length()-2; i++){
			if(str.substring(i,i+3).equals("cat")){
				counter++;
			}
			if(str.substring(i,i+3).equals("dog")){
				counter--;
			}
		}
		if(counter == 0){
		  return true;
		}
		else{
		  return false;
		}
  }
}
