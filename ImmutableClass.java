import java.util.HashMap;
import java.util.Iterator;

final class ImmutableClass{
  //Class cannot be extended - Final
  private final int id;
  private final String name;
  private final HashMap<String, String> hm;


  //Constructor that performs Deep Copy
  ImmutableClass(int id, String name, HashMap<String, String> hm){
    this.id = id;
    this.name = name;
    HashMap<String, String> tempMap = new HashMap<>();
    hm.forEach((key, value) -> tempMap.put(key, value));
    this.hm = tempMap;
  }

  public Object getMap(){
    return this.hm.clone();
  }

}