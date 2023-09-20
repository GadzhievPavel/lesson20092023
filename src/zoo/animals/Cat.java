package zoo.animals;

import zoo.OnSayed;

public class Cat extends Animal implements OnSayed {
    @Override
    public void say() {
        System.out.println("сказала по-кошачьи");
    }
}
