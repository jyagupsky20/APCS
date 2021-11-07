public class doubleChar{
	public String doubleChar(String str){
		String a = "";
		for(int i = 0; i<str.length(); i++){
			a += str.subString(i,i+1);
			a += str.subString(i,i+1);
		}
		return a;
	}
}
