package Seminar1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    Calculator calculator;
    @BeforeAll
    public static void setUp() {

    }

    @AfterAll
    public static void cleanUp () {

    }

    @BeforeEach
    public void eachSetUp () {
        calculator = new Calculator();
    }

    @AfterEach
    public void eachCleanUp () {
        calculator = null;
    }

    @Test
    @DisplayName("Проверка сложения целых")
    void sumIntTest() {
        assertEquals(10, calculator.calculation(5, 5, '+'));
    }
    @Test
    @DisplayName("Проверка сложения десятичных дробей")
    void sumDoubleTest() {
        assertEquals(10.25, calculator.calculation(5.12, 5.13, '+'));
    }
    @Test
    @DisplayName("Проверка вычитания целых")
    void difIntTest() {
        assertEquals(-2, calculator.calculation(5, 7, '-'));
    }
    @Test
    @DisplayName("Проверка вычитания десятичных дробей")
    void difDoubleTest() {
        assertEquals(-2.005, calculator.calculation(5.76, 7.765, '-'));
    }
    @Test
    @DisplayName("Проверка умножения")
    void multiDoubleTest() {
        assertEquals(-640, calculator.calculation(.8, -800, '*'));
    }
    @Test
    @DisplayName("Проверка деления")
    void divDoubleTest() {
        assertEquals(0.8738738738738738, calculator.calculation (48.5, 55.5, '/'));
    }
    @Test
    @DisplayName("Проверка деления на ноль")
    void divByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculator.calculation (658.47, 0, '/'));
    }
    @Test
    @DisplayName("Проверка возведения в степень")
    void degreeDoubleTest() {
        assertEquals(-64, calculator.calculation(-4, 3, '^'));
    }
    @Test
    @DisplayName("Проверка извлечения корня квадратного")
    void rootSquareDoubleTest() {
        assertEquals(2, calculator.calculation (4, 2, 'v'));
    }
    @Test
    @DisplayName("Проверка извлечения корня кубического")
    void rootCubeDoubleTest() {
        assertEquals(3, calculator.calculation (27, 3, 'v'));
    }
    @Test
    @DisplayName("Проверка недопустимого первого операнда при извлечении четного корня")
    void rootExceptionOneTest() {
        assertThrows(ArithmeticException.class, () -> calculator.calculation(-4, 2, 'v'));
    }
    @Test
    @DisplayName("Проверка недопустимого второго операнда")
    void rootExceptionTwoTest() {
        assertThrows(ArithmeticException.class, () -> calculator.calculation(-4, 0, 'v'));
    }
    @Test
    @DisplayName("Проверка рассчета скидки")
    void discountTest() {
        assertEquals(80, calculator.calculation(100, 20, '%'));
    }
    @Test
    @DisplayName("Первая проверка недопустимого операнда при рассчете скидки")
    void discountTestExceptionOne() {
        assertThrows(ArithmeticException.class, () -> calculator.calculation(-20, 20, '%'));
    }
    @Test
    @DisplayName("Вторая проверка недопустимого операнда при рассчете скидки")
    void discountTestExceptionTwo() {
        assertThrows(ArithmeticException.class, () -> calculator.calculation(100, 0, '%'));
    }
    @Test
    @DisplayName("Третья проверка недопустимого операнда при рассчете скидки")
    void discountTestExceptionThree() {
        assertThrows(ArithmeticException.class, () -> calculator.calculation(100, 101, '%'));
    }
}