package zoo.animals;

import zoo.MyException;
import zoo.OnLearning;

public class Dog extends Animal implements OnLearning {

    private int age;
    @Override
    public void say() {
        System.out.println("Сказала по-собачьи");
    }

    @Override
    public void learn() {
        System.out.println("дрессируется");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException, MyException {
        if(age<0){
            throw new MyException();
        }
        this.age = age;
    }

}
