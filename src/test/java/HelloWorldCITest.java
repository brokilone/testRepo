import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class HelloWorldCITest {
    private HelloWorldCI helloWorld;

    @BeforeEach
    public void load() {
        helloWorld = new HelloWorldCI();
    }

    @Test
    public void isEvenTestTrue() {
        Assertions.assertTrue(helloWorld.isEven(8));
    }

    @Test
    public void isEvenTestFalse() {
        Assertions.assertFalse(helloWorld.isEven(7));
    }

    @Test
    public void shouldPrintHello() {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        HelloWorldCI.main(null);

        System.setOut(consoleStream);

        String actual = byteArrayOutputStream.toString();
        String expected = "Hello, World of CI" + System.lineSeparator() +
                "true" + System.lineSeparator();

        Assertions.assertEquals(expected, actual);

    }

}