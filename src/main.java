public class main {
    class Box<T> {
        private T value;


        public Box(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        // Setter method
        public void setValue(T value) {
            this.value = value;
        }


        public void display() {
            System.out.println("Box contains: " + value);
        }
    }

    public class GenericBoxTest {
        public void main(String[] args) {
            // Box with an Integer
            Box<Integer> intBox = new Box<>(10);
            intBox.display();

            // Box with a String
            Box<String> strBox = new Box<>("Hello, Generics!");
            strBox.display();

            // Box with a Double
            Box<Double> doubleBox = new Box<>(3.14);
            doubleBox.display();

            // Box with a custom Object
            Box<Person> personBox = new Box<>(new Person("Alice", 25));
            personBox.display();
        }
    }

    // Custom class for demonstration
    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (Age: " + age + ")";
        }
    }
}
