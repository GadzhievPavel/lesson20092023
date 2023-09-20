package zoo;

import zoo.animals.Animal;

public class Doctor<T extends Animal, T1>  {
    private T animal;

    private T1 tabletMark;
    public void setAnimal(T animal){
        this.animal = animal;
    }

    public void setTabletMark(T1 tabletMark) {
        this.tabletMark = tabletMark;
    }

    public void vet(){
        System.out.println("лечит "+ animal.getClass().getName() +"  "+ tabletMark);
        animal.isLive();
    }

    public void feed(){
        System.out.println("кормить "+animal.getClass().getName());
    }
}
