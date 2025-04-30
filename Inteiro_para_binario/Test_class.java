package Inteiro_para_binario;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test_class {
    @Test
    public void case9(){
        assertEquals(2, new BinaryGap().solution(9));
    }

    @Test
    public void case529(){
        assertEquals(4, new BinaryGap().solution(529));
    }
    @Test
    public void case20(){
        assertEquals(1, new BinaryGap().solution(20));
    }
    @Test
    public void case15(){
        assertEquals(0, new BinaryGap().solution(15));
    }
}
