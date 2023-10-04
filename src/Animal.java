public class Animal {
        private final String name;
        private final int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("Animal makes a generic sound.");
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }

        public static class Mammal extends Animal {
            String furcolour;

            public Mammal(String name, int age, String furcolour) {
                super(name, age);
                this.furcolour = furcolour;
            }

            public void makeSound() {
                System.out.println("Mammal makes a mammal-specific sound.");
            }

            @Override
            public String toString() {
                return super.toString() + ", Fur Color: " + furcolour;
            }
        }

        public static class Bird extends Animal {
            double wingspan;

            public Bird(String name, int age, double wingspan) {
                super(name, age);
                this.wingspan = wingspan;
            }

            public void makeSound() {
                System.out.println("Bird makes a bird-specific sound.");
            }

            @Override
            public String toString() {
                return super.toString() + " Wing Span: " + wingspan;
            }
        }

        public static class Dog extends Animal {
            String breed;

            public Dog(String name, int age, String breed) {
                super(name, age);
                this.breed = breed;
            }

            public void makeSound() {
                System.out.println("Dog makes a dog-specific sound.");
            }

            @Override
            public String toString() {
                return super.toString() + ", Breed: " + breed;
            }
        }

        public static class Main {
            public static void main(String[] args) {
                Animal animal = new Animal("Animal", 5);
                Mammal raccoon = new Mammal("Raccoon", 3, "gray- brown");
                Bird macaw = new Bird("Scarlet Macaw", 40, 3.5);
                Dog boxer = new Dog("Tuffy", 12, "Boxer");

                animal.makeSound();
                raccoon.makeSound();
                macaw.makeSound();
                boxer.makeSound();

                System.out.println(animal);
                System.out.println(raccoon);
                System.out.println(macaw);
                System.out.println(boxer);
            }
       }
}