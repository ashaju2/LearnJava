import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    /*
    Need to instantiate outerclass to instantiate a non static inner class. Inner Class can access both static and non static methods and variables
    */
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    innerClass.printMessage();

    /*
    Only a nested Class can be static. They can be instantiated directly without the Outerclass. Static Inner class can access only static methods and variab
    */
    OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
    staticClass.printMessage();
    
    
    TestClass testClass = new TestClass();
    /*
    Calling a function declared and implemented
    in the interface as default.
    Default function can be overrit 
    */
    testClass.addStringList("a");
    testClass.addStringList("b");
    testClass.addStringList("e");
    testClass.display();


    /*
    Calling a public method in abstract class
    which is extended in the concrete class, TestClass. 
    */
    testClass.setNum(34);
    int num = testClass.getNum();
    System.out.println(num);


    /*
    Gets the Immutable HasMap
    */
    HashMap<String, String> testMap = new HashMap<String, String>(){{
      put("2","Second");
      }};
    ImmutableClass immutableObj = new ImmutableClass(1,
    "First", testMap);

    System.out.println(immutableObj.getMap());
    testMap.put("3","Third");
    System.out.println(immutableObj.getMap());

    HashMap<String, String> immutableMapTest = (HashMap<String, String>) immutableObj.getMap();
    immutableMapTest.put("4", "Four");
    System.out.println(immutableObj.getMap());

  }
}

/*
Day 4 -> Lesson 5: Overloading vs Overridding

1)Overloading is when 2 methods have same name but
different parameters in the same class(ie. method signature is different)

2)Overridding is when 2 methods have the same name with same parameters in different class 
*/


/*
There is no delete in Java. JVM has a reference collector that relies on the reference count. Once there are no more references to the object, the object becomes available for collection by the garbage collector.
*/