import devices.Car;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("owczarek");
        for(int i = 0; i < 5; i++) {
            animal.feed();
            animal.takeForAWalk();

        }
        Car nissan = new Car("Juke", "nissan", 2022.0, 10000.0);
        Car nissan2 = new Car("Juke", "nissan", 2022.0, 10000.0);

        Human Jedrzej = new Human();
        Jedrzej.name = "Jedrzej";
        Jedrzej.surname = "Juskowiak";
        Jedrzej.car = nissan;
        System.out.println(Jedrzej.car.model);
        Jedrzej.setSalary(10000.0);
        Jedrzej.getSalary();
        Jedrzej.setCar(nissan);

        if (nissan.equals(nissan2)){
            System.out.println("Samochody są takie same");
        } else {
            System.out.println("Samochody różnią się od siebie");

        }System.out.println(nissan);
        System.out.println(nissan2);

    }
}