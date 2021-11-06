package introjunit;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {
    @Test
    public void testSayHello(){
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String greeting = gentleman.sayHello("John Doe");

        //Then
        assertThat(greeting, equalTo("Hello John Doe"));
    }

    @Test
    public void testSayHelloAnon(){
        //Given
        Gentleman gentleman = new Gentleman();

        //When
        String greeting = gentleman.sayHello(null);

        //Then
        assertThat(greeting, equalTo("Hello Anonymous"));
    }

}
