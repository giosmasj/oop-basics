public class Example2 extends Example1 {

  public void sayName() {
    System.out.println("My Name in Example2!");
  }
  public static void main(String[] args) {
    Example2 e2 = new Example2();
    e2.sayName();
  }
}