package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    /*
    проверка того, объект Car создается с 4-мя колесами
     */
    @Test
    public void testCarHas4Wheels() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /*
     проверка того, объект Motorcycle создается с 2-мя колесами
     */
    @Test
    public void testMotoHas2Wheels() {
        Motorcycle harley = new Motorcycle("Harley-Davidson", "First", 2010);
        assertThat(harley.getNumWheels()).isEqualTo(2);
    }

    /*
    проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testCarReach60InDrive() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /*
    проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     */
    @Test
    public void testMotoReach60InDrive() {
        Motorcycle harley = new Motorcycle("Harley-Davidson", "First", 2010);
        harley.testDrive();
        assertThat(harley.getSpeed()).isEqualTo(75);
    }

    /*
    проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта)
    машина останавливается (speed = 0)
     */
    @Test
    public void testCarReach0AfterPart() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /*
    проверить, что в режиме парковки (сначала testDrive, потом park т.е эмуляция движения транспорта)
    мотоцикл останавливается (speed = 0)
     */
    @Test
    public void testMotoReach0AfterPart() {
        Motorcycle harley = new Motorcycle("Harley-Davidson", "First", 2010);
        harley.testDrive();
        harley.park();
        assertThat(harley.getSpeed()).isEqualTo(0);
    }
}