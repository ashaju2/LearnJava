class OuterClass{
  private static String testString = "works";
  
  static class StaticClass{
    public void printMessage(){
      System.out.println("Static inner class: " + testString);
    }
  }
  class InnerClass{
    public void printMessage(){
      System.out.println("Non-static inner class: " + testString);
    }
  }
}
