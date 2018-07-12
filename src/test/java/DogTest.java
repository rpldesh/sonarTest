import static org.junit.Assert.*;

public class DogTest {

    @org.junit.Test
    public void run() {
        Dog dog= new Dog("Terry","Jhon");
        dog.dorun();
        assertEquals(true, dog.run);
    }

    @org.junit.Test
    public void stop() {
        Dog dog= new Dog("Terry","Jhon");
        dog.dostop();
        assertEquals(false, dog.run);
    }

    @org.junit.Test
    public void eat() {
        Dog dog= new Dog("Terry","Jhon");
        dog.doeat();
        assertEquals(true, dog.eat);
    }
}