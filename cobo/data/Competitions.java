import java.util.ArrayList;
import java.util.Arrays
public class Competitions{
ArrayList<Competition> clist = new ArrayList<Competition>();
ArrayList<String> currentLine = new ArrayList<String>();
Scanner scanner = new Scanner("Competitions.csv");
while(scanner.hasNextLine()){
current
clist.add(new Competition())
}
}

class Competition {
  String name;
  String country;
  int year;
  boolean cancelled;
  String events;
  int latitude;
  int longitude;
  public Competition (String name, String country, int year, boolean cancelled, String events, int latitude, int longitude){
    this.name = name;
    this.country = country;
this.cancelled = cancelled;
this.events = events;
this.latitude = latitude;
this.longitude = longitude;
this.year = year;
  }
public String name(){return name;}public String country(){return country;}public int year(){return year;}public boolean cancelled(){return cancelled;}public String events(){return events;}public int latitude(){return latitude;}public int longitude(){return longitude;}
}
