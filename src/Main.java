import zoo.Doctor;
import zoo.House;
import zoo.MyException;
import zoo.OnLearning;
import zoo.animals.Cat;
import zoo.animals.Dog;
import zoo.animals.Pig;
import zoo.animals.Snake;

import java.awt.print.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayUtils uArray = new ArrayUtils(50);
//        uArray.fill(3);
//        uArray.print();
//        HandlerArray handlerArray = new HandlerArray();
//
//        uArray.sum(new ArrayUtils.OnCalculationListener() {
//            @Override
//            public void getResult(int sum) {
//                System.out.println("Array sum = " + sum);
//            }
//        });
//
//        uArray.sum(handlerArray);
//
//        uArray.findMax(new HandlerFinder(){
//            @Override
//            public void iFined(int i) {
//                System.out.println("я нашел "+i);
//            }
//        });
        final int i = 0;
        Dog dog = new Dog();
        try{
            dog.setAge(10);
            System.out.println(dog.getAge());
            dog.setAge(-2);
            System.out.println(dog.getAge());
        }catch (Exception e){

        }finally {
            System.out.println("собака ушла");
        }

        try {
            dog.setAge(-10);
        } catch (MyException e) {
            
        }


//        OnLearning cow = new OnLearning() {
//            @Override
//            public void learn() {
//
//            }
//
//            @Override
//            public void say() {
//                System.out.println("му-му");
//            }
//        };
//        cow.say();
//        //house.goToHome(cow);
//        //house.goToHome(snake);
//        //house.goToHome(dog);
//        //house.goToHome(cat);
//        //house.goToHome(pig);
    }
}
