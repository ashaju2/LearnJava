import java.util.List;
import java.util.ArrayList;

interface TestInterfaceExtend {
  //All methods in an interface is public
  void printInterfaceImplementation();
}


interface TestInterface extends TestInterfaceExtend {
  List<String> giveStringList(); 
  
  default void addStringList(String element){
    giveStringList().add(element);
  }
}

abstract class TestAbstract {
  /*
  Abstract class can also implement an interface
  The variable need not be static or final
  */
  private int num = 12;
  public void setNum(int num){
    this.num = num;
  }
  public int getNum(){
    return this.num;
  }

  static void printFunction(){
    System.out.println("This is Abstract implementation");
  }
}

class TestClass extends TestAbstract implements TestInterface {
  public List<String> stringList = new ArrayList<>();
  
  public List<String> giveStringList(){
    return stringList;
  }

  public void display(){
    System.out.println(this.stringList);
  }

  public void printInterfaceImplementation(){
    System.out.println("An interface can be extended by another interface");
  }

  /*
  Can override default function from interface
  Useful when dealing with same function name from multiple interfaces.
  */
  public void addStringList(String element){
    giveStringList().add(element);
    giveStringList().add(element);
  }
}