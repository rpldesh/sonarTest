import static org.junit.Assert.*;

public class DogTest {

    @org.junit.Test
    public void run() {
        Dog dog= new Dog("Terry","Jhon");
        dog.run();
        assertEquals(true, dog.run);
    }

    @org.junit.Test
    public void stop() {
        Dog dog= new Dog("Terry","Jhon");
        dog.stop();
        assertEquals(false, dog.run);
    }

    @org.junit.Test
    public void eat() {
        Dog dog= new Dog("Terry","Jhon");
        dog.eat();
        assertEquals(true, dog.eat);
    }
}