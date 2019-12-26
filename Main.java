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
  }
}

