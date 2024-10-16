import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    private Lion lion;


    @Mock
    Feline feline;


    @Test
    public void testGetKittens()  throws Exception {
      Mockito.when(feline.getKittens()).thenReturn(1);
      lion = new Lion("Самец", feline);
      int kittens = lion.getKittens();
      assertEquals(1, kittens);
    }

    @Test
    public void testGetKittensMoreThanOne()  throws Exception {
      Mockito.when(feline.getKittens()).thenReturn(5);
      lion = new Lion("Самка", feline);
      int kittens = lion.getKittens();
      assertEquals(5, kittens);
    }


    @Test
    public void testGetFood() throws Exception {

      List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
      Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
      lion = new Lion("Самец", feline);
      List<String> food = lion.getFood();

      assertEquals(expectedFood, food);
    }
}

