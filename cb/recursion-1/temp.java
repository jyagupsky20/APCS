public int countX(String str){
  if (str.length() == 0){
    return 0;
  }
  else if (str.length() == 1){
    return (str.indexOf("x") + 1);
  }
  return countX(str.substring(0,1)) + countX(str.substring(1));
}

public int countHi(String str) {
  if(str.length() < 2){
    return 0;
  }
  else if (str.substring(0,2).equals("hi")){
    return 1 + countHi(str.substring(2));
  }
  else{
    return countHi(str.substring(1));
  }
}

public String changeXY(String str) {
  if (str.equals("x")){
    return "y";
  }
  else if(str.length() <= 1){
    return str;
  }
  else{
    return changeXY(str.substring(0,1)) + changeXY(str.substring(1));
  }
}
public String changePi(String str) {
  if(str.length() < 2){
    return str;
  }
  else if (str.substring(0,2).equals("pi")){
    return "3.14" + changePi(str.substring(2));
  }
  else{
    return str.substring(0,1) + changePi(str.substring(1));
  }
}

public String noX(String str) {
  if (str.length() == 0){
    return "";
  }
  else if (str.substring(0,1).equals("x")){
    return noX(str.substring(1));
  }
  else {
    return str.substring(0,1) + noX(str.substring(1));
  }
}

public boolean array6(int[] nums, int index) {
  if (index >= nums.length){
    return false;
  }
  else if (nums[index] == 6) {
    return true;
  }
  return array6(nums, index + 1);
}

public int array11(int[] nums, int index) {
  if (index >= nums.length){
    return 0;
  }
  else if (nums[index] == 11) {
    return 1 + array11(nums, index + 1);
  }
  return array11(nums, index + 1);
}

public boolean array220(int[] nums, int index) {
  if (index >= nums.length-1){
    return false;
  }
  else if (10 * nums[index] == nums[index+1]) {
    return true;
  }
  return array220(nums, index + 1);
}

public String allStar(String str) {
  if (str.length() < 2){
    return str;
  }
  return str.substring(0,1) + "*" + allStar(str.substring(1));
}

public String pairStar(String str) {
  if (str.length() < 2){
    return str;
  }
  else if(str.charAt(0) == str.charAt(1)){
    return str.charAt(0) + "*" + pairStar(str.substring(1));
  }
  return str.substring(0,1) + pairStar(str.substring(1));
}

public String endX(String str) {
  if (str.length() == 0){
    return str;
  }
  else if (str.charAt(0) == 'x'){
    return endX(str.substring(1)) + 'x';
  }
  else{
    return str.charAt(0) + endX(str.substring(1));
  }
}
public int countPairs(String str) {
  if (str.length() < 3){
    return 0;
  }
  else if (str.charAt(0) == str.charAt(2)){
    return 1 + countPairs(str.substring(1));
  }
  else{
    return countPairs(str.substring(1));
  }
}

public int countAbc(String str) {
  if (str.length() < 3){
    return 0;
  }
  else if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")){
    return 1 + countAbc(str.substring(1));
  }
  else{
    return countAbc(str.substring(1));
  }
}

public int count11(String str) {
  if (str.length() < 2){
    return 0;
  }
  else if (str.substring(0,2).equals("11")){
    return 1 + count11(str.substring(2));
  }
  else{
    return count11(str.substring(1));
  }
}
public String stringClean(String str) {
  if (str.length() < 2){
    return str;
  }
  else if (str.charAt(0) == str.charAt(1)){
    return stringClean(str.substring(1));
  }
  else {
    return str.charAt(0) + stringClean(str.substring(1));
  }
}
//--------------------------------------//
public int countHi2(String str) {
  if (str.length() < 3){
    if ( str.equals("hi") ){
      return 1;
    }
    return 0;
  }
  else if (str.substring(0,3).equals("xhi")){
    return countHi2(str.substring(3));
  }
  else if (str.substring(0,2).equals("hi")){
    return 1 + countHi2(str.substring(2));
  }
  else{
    return countHi2(str.substring(1));
  }
}

public String parenBit(String str) {
  if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
    return str;
  }
  else if (str.charAt(0) == '('){
    return parenBit(str.substring(0,str.length()-1));
  }
  else{
    return parenBit(str.substring(1));
  }
}


public boolean nestParen(String str) {
  if (str.equals("")){
    return true;
  }
  else if ( str.charAt(0) == '(' && str.charAt(str.length()-1) == ')' ){
    return nestParen(str.substring(1,str.length()-1));
  }
  else{
    return false;
  }
}


public int strCount(String str, String sub) {
  if(str.length() < sub.length()){
    return 0;
  }
  else if (str.substring(0,sub.length()).equals(sub)){
    return 1 + strCount(str.substring(sub.length()), sub);
  }
  else{
    return strCount(str.substring(1), sub);
  }
}

public boolean strCopies(String str, String sub, int n) {
  if (n == 0){
    return true;
  }
  else if (str.length() < sub.length()){
    return false;
  }
  else if (str.substring(0,sub.length()).equals(sub)){
    return strCopies(str.substring(1), sub, n-1);
  }
  else{
    return strCopies(str.substring(1), sub, n);
  }
}

public int strDist(String str, String sub) {
  if (str.length() < sub.length()){
    return 0;
  }
  else if (str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub)){
    return str.length();
  }
  else if (str.substring(0,sub.length()).equals(sub)){
    return strDist(str.substring(0,str.length()-1), sub);
  }
  else {
    return strDist(str.substring(1), sub);
  }
}
