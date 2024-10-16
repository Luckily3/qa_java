import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
  private final Feline feline;
  private final String sex;
  private final boolean hasMane;
  private final String noSex = "Используйте допустимые значения пола животного - самец или самка";

  public LionParameterizedTest(String sex, final boolean hasMane) {
    this.sex = sex;
    this.hasMane = hasMane;
    this.feline = new Feline();
  }

  @Parameterized.Parameters
  public static Object[][] getCredentials() {
    return new Object[][]{
            {"Самец", true},
            {"Самка", false},
            {"Оно", false},
    };
  }

  @Test
  public void testDoesHaveMane() throws Exception {
    try {
      Lion lion = new Lion(sex, feline);
      Assert.assertEquals(hasMane, lion.doesHaveMane());
    } catch (Exception e) {
      Assert.assertEquals(noSex, e.getMessage());
    }
  }
}
