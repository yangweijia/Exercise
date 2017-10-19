import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f1() {
	  Sentence one=new Sentence("I have a cat"); 
	  System.out.println(one.split(" ",0)); 
  }
  @Test
  public void f2() {
	  Sentence one=new Sentence("Ihaveacat"); 
	  System.out.println(one.split("  ",0));   
  }
  @Test
  public void f3() {
	  Sentence one=new Sentence(" i have a cat ");
	  System.out.println(one.split(" ", 0));
  }
}
