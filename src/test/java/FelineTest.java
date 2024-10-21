import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

  @Spy
  Feline feline = new Feline();

  @Test
  public void testEatMeat() throws Exception {
    List<String> food = feline.eatMeat();
    Assert.assertNotNull(food);
    Assert.assertFalse(food.isEmpty());
  }



  @Test
  public void testGetFamily()  {
    Feline feline = new Feline();
    assertEquals("Кошачьи",  feline.getFamily());
  }


  @Test
  public void testGetKittens() {
    Feline feline = new Feline();
    int kittens = feline.getKittens();
    assertEquals(1, kittens);
  }

  @Test
  public void testGetKittensMoreThanOne() {
    Feline feline = new Feline();
    int kittens = feline.getKittens(5);
    assertEquals(5, kittens);
  }
}
