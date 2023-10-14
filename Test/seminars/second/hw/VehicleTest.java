import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    static Car car;
    static Motorcycle motorcycle;

    /*
*Задание 1.
    Проект Vehicle. Написать следующие тесты с использованием JUnit5:

            - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор
            *  instanceof).

   */
    @BeforeAll
    public static void SetUp() {
        car = new Car("Dodge", "Ram", 2010);
        motorcycle = new Motorcycle("Иж", "Юпитер-5-03", 1991);

    }

    /*
     */
    @Test
    public void testCarIsInstanceOfVehicle() {
        // Arrange (Подготовка)

        // Act (Выполнение)

        // Assert (Проверка утверждения)
        assertTrue(car instanceof Vehicle);
    }

    /*
                - Проверить, что объект Car создается с 4-мя колесами.
      */
    @Test
    public void testMotorcycleCreateWithFoureWheels() {
        // Arrange (Подготовка)
        int expectedWheels = 4;
        // Act (Выполнение)

        // Assert (Проверка утверждения)
        assertThat(car.getNumWheels()).isEqualTo(expectedWheels);
    }

    /*
                - Проверить, что объект Motorcycle создается с 2-мя колесами.
      */
    @Test
    public void testCarCreateWithTwoWheels() {
        // Arrange (Подготовка)
        int expectedWheels = 2;
        // Act (Выполнение)

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getNumWheels()).isEqualTo(expectedWheels);
    }

    /*
                - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
         */
    @Test
    public void testCarObjectReachesASpeedOf60InTestDrivingMode() {
        // Arrange (Подготовка)
        int expectedWheels = 60;

        // Act (Выполнение)
        car.testDrive();

        // Assert (Проверка утверждения)
        assertThat(car.getSpeed()).isEqualTo(expectedWheels);
    }

    /*
            - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
            * (используя метод testDrive()).
         */
    @Test
    public void testMotorcycleObjectReachesASpeedOf75InTestDrivingMode() {
        // Arrange (Подготовка)
        int expectedWheels = 75;

        // Act (Выполнение)
        motorcycle.testDrive();

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getSpeed()).isEqualTo(expectedWheels);
    }

    /*
            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
            * машина останавливается (speed = 0).
       */
    @Test
    public void testCarObjectParkingModeSpeedOfZeroInParkMode() {
        // Arrange (Подготовка)
        int expectedWheels = 0;

        // Act (Выполнение)
        car.testDrive();
        car.park();

        // Assert (Проверка утверждения)
        assertThat(car.getSpeed()).isEqualTo(expectedWheels);
    }

    /*
            - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
            *  мотоцикл останавливается (speed = 0).
  */
    @Test
    public void testMotorcycleObjectParkingModeSpeedOfZeroInParkMode() {
        // Arrange (Подготовка)
        int expectedWheels = 0;

        // Act (Выполнение)
        motorcycle.testDrive();
        motorcycle.park();

        // Assert (Проверка утверждения)
        assertThat(motorcycle.getSpeed()).isEqualTo(expectedWheels);
    }

    /*

    В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов,
    * включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".

    Базовый класс ""Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля
    * ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".

    Класс ""Car"" расширяет ""Vehicle"" и реализует его абстрактные методы.
    * При создании объекта ""Car"", число колес устанавливается в 4, а скорость в 0.
    *  В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.

    Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы.
    * При создании объекта ""Motorcycle"", число колес устанавливается в 2,
    * а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.

     */
}