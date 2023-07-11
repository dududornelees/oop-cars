public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("BMW", "X6", 2023, 125000);
        System.out.println("O veículo é uma: " + firstCar.getBrand() + " " + firstCar.getModel() + " " + firstCar.getYear() + " e o preço é: R$" + firstCar.getPrice());
    }
}