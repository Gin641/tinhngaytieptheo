import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;
public class test {
    @Test
    @Disabled("1/1/2019 - 2/1/2019")
    void tomorrow(){
        String tomorrow = tinhngaytieptheo.tomorrow(1,1,2019);
        String expected = "2/1/2019";
        assertEquals(expected,tomorrow);
    }
    @Test
    @Disabled("31/1/2019 - 1/2/2019")
    void tomorrow1(){
        String tomorrow = tinhngaytieptheo.tomorrow(31,1,2019);
        String expected = "1/2/2019";
        assertEquals(expected,tomorrow);
    }
    @Test
    @Disabled("30/6/2019 - 1/7/2019")
    void tomorrow2(){
        String tomorrow = tinhngaytieptheo.tomorrow(30,6,2019);
        String expected = "1/7/2019";
        assertEquals(expected,tomorrow);
    }
    @Test
    @Disabled("28/2/2019 - 1/3/2019")
    void tomorrow3(){
        String tomorrow = tinhngaytieptheo.tomorrow(28,2,2019);
        String expected = "1/3/2019";
        assertEquals(expected,tomorrow);
    }
    @Test
    @Disabled("29/2/2020 - 1/3/2020")
    void tomorrow4(){
        String tomorrow = tinhngaytieptheo.tomorrow(29,2,2020);
        String expected = "1/3/2020";
        assertEquals(expected,tomorrow);
    }
    @Test
    @Disabled("31/12/2019 - 1/1/2020")
    void tomorrow5(){
        String tomorrow = tinhngaytieptheo.tomorrow(31,12,2019);
        String expected = "1/1/2020";
        assertEquals(expected,tomorrow);
    }
}
