package Constructor;

public class DogTest {

    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.setName("lucas");
        myDog.setAge(4);
        myDog.setWeight(75);

        System.out.println(myDog.getAge() + " my Dog Age");
        System.out.println(myDog.getWeight() + " my Dog weight");
        System.out.println(myDog.getName() + " my Dog name");
    }
}
