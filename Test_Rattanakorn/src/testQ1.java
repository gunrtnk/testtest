import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class testQ1 {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();


    public void setup() {
        System.setOut(new PrintStream(out));
    }


    public void shouldDrawChristmasTree() {
        // given
        Christmastree tree = new Christmastree(4);

        // when
        tree.draw(4);;

        // then
        Assert.assertEquals("          *\r\n" +
                "         ***\r\n" +
                "        *****\r\n" +
                "       *******\r\n", out.toString());
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
        Christmastree tree = new Christmastree(4);
        tree.draw(4);
    }
}
