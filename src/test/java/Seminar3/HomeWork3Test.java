package Seminar3;
import org.junit.jupiter.api.*;

class HomeWork3Test {
    HomeWork3 hw3;
    @BeforeEach
    void setUp() {
        hw3 = new HomeWork3();
    }
    @AfterEach
    void tearDown() {
        hw3 = null;
    }
    @Test
    @DisplayName("Метод evenOddNumber экземпляра объекта HomeWork3 корректно обрабатывает четные числа")
    void evenOddNumberEvenTest() {
        Assertions.assertTrue (hw3.evenOddNumber(2));
    }
    @Test
    @DisplayName("Метод evenOddNumber экземпляра объекта HomeWork3 корректно обрабатывает нечетные числа")
    void evenOddNumberOddTest() {
        Assertions.assertFalse (hw3.evenOddNumber(3));
    }
    @Test
    @DisplayName("Метод numberInInterval экземпляра объекта HomeWork3 корректно работает ниже границы")
    void numberInIntervalLowTest() {
        Assertions.assertFalse (hw3.numberInInterval(25));
    }
    @Test
    @DisplayName("Метод numberInInterval экземпляра объекта HomeWork3 корректно работает выше границы")
    void numberInIntervalHighTest() {
        Assertions.assertFalse (hw3.numberInInterval(100));
    }
    @Test
    @DisplayName("Метод numberInInterval экземпляра объекта HomeWork3 корректно работает в интервале")
    void numberInIntervalTargetTest() {
        Assertions.assertTrue (hw3.numberInInterval(75));
    }
}