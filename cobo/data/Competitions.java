/*Team Something Important Minus One :: Joshua Yagupsky, Jonathan Song
APCS
LAB08 -- Data
2022-04-05
time spent: 3.0 hr*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
/*

*/
public class Competitions{
  public static void main(String[] args) {
    ArrayList<Competition> clist = new ArrayList<Competition>();
    List<String> currentLine = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in); //Uses redirection
    scanner.nextLine(); //Ignores the initial line
    while (scanner.hasNextLine()){
      currentLine = Arrays.asList(scanner.nextLine().toString().split("\t"));
      clist.add(new Competition(currentLine.get(1),currentLine.get(3),Integer.parseInt(currentLine.get(5)),currentLine.get(11), Integer.parseInt(currentLine.get(19)),Integer.parseInt(currentLine.get(20))));
    }
    Competition southernMost = clist.get(0);
    for (Competition c: clist ) {
      if(c.latitude() < southernMost.latitude()){
        southernMost = c;
      }
    }
    System.out.println(southernMost);
  }
}

class Competition {
  String name;
  String country;
  int year;
  String events;
  int latitude;
  int longitude;
  public Competition (String name, String country, int year, String events, int latitude, int longitude){
    this.name = name;
    this.country = country;
    this.events = events;
    this.latitude = latitude;
    this.longitude = longitude;
    this.year = year;
  }
  public String toString(){
    return name + " in " + country + " took place in " + year + " with events " + events + " at location " + latitude + " " + longitude + ".";
  }
  public String name(){return name;}public String country(){return country;}public int year(){return year;}public String events(){return events;}public int latitude(){return latitude;}public int longitude(){return longitude;}
}
