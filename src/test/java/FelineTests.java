import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

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
    assertEquals(1, feline.getKittens());
  }

  @Test
  public void testGetKittensMoreThanOne() {
    Feline feline = new Feline();
    assertEquals(5, feline.getKittens(5));
  }
}
