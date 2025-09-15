public class Main {
    public static void main(String[] args) {
        PetService service = new PetService();

        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculate(true));
        System.out.println("Full service: $" + service.calculate(true, true));
        System.out.println("Emergency: $" + service.calculateFee("Injury"));

        System.out.println();

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("==========================");

        Dog buddy = new Dog("Buddy", 3);
        Cat whiskers = new Cat("Whiskers", 2);
        Bird tweety = new Bird("Tweety", 1);

        buddy.displayInfo();
        buddy.makeSound();
        System.out.println();

        whiskers.displayInfo();
        whiskers.makeSound();
        System.out.println();

        tweety.displayInfo();
        tweety.makeSound();
        System.out.println();

        System.out.println("Training Session Started!");
        System.out.println("==========================");

        buddy.performTrick();
        tweety.performTrick();
    }
}
