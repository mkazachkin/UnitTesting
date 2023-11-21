package Seminar2;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    Car car = new Car("TestCompany", "TestModel", 2000);
    Motorcycle moto = new Motorcycle("TestCompany", "TestModel", 2001);
    final Integer DEFAULT_CAR_TEST_SPEED = 60;
    final Integer DEFAULT_MOTO_TEST_SPEED = 75;
    @BeforeAll
    public static void setUp() {

    }

    @AfterAll
    public static void cleanUp () {

    }
    @BeforeEach
    public void eachSetUp () {
        car.testDrive();
        moto.testDrive();
    }

    @AfterEach
    public void eachCleanUp () {
        car.park();
        moto.park();
    }
    @Test
    @DisplayName("Экземпляр объекта Car также является экземпляром транспортного средства")
    void carTest() {
        assertThat( car instanceof Vehicle );
    }
    @Test
    @DisplayName("Объект Car создается с 4-мя колесами")
    void carWheelsTest() {
        assertEquals(4, car.getNumWheels());
    }
    @Test
    @DisplayName("Объект Motorcycle создается с 2-мя колесами")
    void motoWheelsTest() {
        assertEquals(2, moto.getNumWheels());
    }
    @Test
    @DisplayName("Объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()")
    void carTestSpeedTest() {
        assertEquals(DEFAULT_CAR_TEST_SPEED, car.getSpeed());
    }
    @Test
    @DisplayName("Объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()")
    void motoTestSpeedTest() {
        assertEquals(DEFAULT_MOTO_TEST_SPEED, moto.getSpeed());
    }
    @Test
    @DisplayName("В режиме парковки машина останавливается (speed = 0)")
    void carParkSpeedTest() {
        car.park();
        assertEquals(0, car.getSpeed());
    }
    @Test
    @DisplayName("В режиме парковки мотоцикл останавливается (speed = 0)")
    void motoParkSpeedTest() {
        moto.park();
        assertEquals(0, moto.getSpeed());
    }
}
