package seminars.second.hw;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car=new Car("Honda","Accord",2015);
    Motorcycle moto = new Motorcycle("HARLEY-DAVIDSON", "CVO TRI GLIDE", 2020);


    //todo проверка того, что экземпляр объекта Car также является экземпляром
    // транспортного средства; (instanceof)
    @Test
    void instanceOf(){
        assertTrue(car instanceof Vehicle);
    }


    //todo проверка того, объект Car создается с 4-мя колесами
    @Test
    void carNumWheels(){
        assertEquals(car.getNumWheels(), 4);
    }


    //todo проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void motoNumWheels(){
        assertEquals(moto.getNumWheels(),2);
    }


    //todo проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testDriveCar() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }


    //todo проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testDriveMoto() {
        moto.testDrive();
        assertEquals(moto.getSpeed(), 75);
    }


    //todo проверить, что в режиме парковки (сначала testDrive, потом park,
    //                т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void parkCar() {
        car.testDrive();
//        System.out.println(car.getSpeed());
        car.park();
        assertEquals(car.getSpeed(), 0);
//        System.out.println(car.getSpeed());
    }


    //todo проверить, что в режиме парковки (сначала testDrive, потом park
    //                т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void parkMoto() {
        moto.testDrive();
//        System.out.println(moto.getSpeed());
        moto.park();
        assertEquals(moto.getSpeed(), 0);
//        System.out.println(moto.getSpeed());
    }
}