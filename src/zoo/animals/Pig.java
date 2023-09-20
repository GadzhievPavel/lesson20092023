package zoo.animals;

import zoo.OnSayed;

public class Pig extends Animal implements OnSayed {
    @Override
    public void say() {
        System.out.println("сказала по-свински");
    }
}
