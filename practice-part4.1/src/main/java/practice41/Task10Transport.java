package practice41;
import java.util.List;
public class Task10Transport {
 static abstract class Transport {
  private final String name;private final double speed,pricePerKm,cargoCapacity;private final int passengerCapacity;
  Transport(String name,double speed,double pricePerKm,int passengerCapacity,double cargoCapacity){this.name=name;this.speed=speed;this.pricePerKm=pricePerKm;this.passengerCapacity=passengerCapacity;this.cargoCapacity=cargoCapacity;}
  double travelTime(double distance){if(distance<0)throw new IllegalArgumentException("Расстояние не может быть отрицательным");return distance/speed;}
  double transportCost(double distance,int passengers,double cargoKg){if(distance<0||passengers<0||passengers>passengerCapacity||cargoKg<0||cargoKg>cargoCapacity)throw new IllegalArgumentException("Проверьте расстояние и вместимость транспорта");return distance*pricePerKm;}
  public String toString(){return name;}
 }
 static class Automobile extends Transport {Automobile(){super("Автомобиль",90,18,4,500);}}
 static class Moped extends Transport {Moped(){super("Мопед",45,5,1,20);}}
 static class Train extends Transport {Train(){super("Поезд",100,12,300,20000);}}
 static class Boat extends Transport {Boat(){super("Лодка",35,9,8,1000);}}
 public static void main(String[] args){double distance=120;for(Transport t:List.of(new Automobile(),new Moped(),new Train(),new Boat()))System.out.printf("%s: время %.2f ч., стоимость перевозки двух пассажиров и 100 кг груза %.2f руб.%n",t,t.travelTime(distance),t.transportCost(distance,2,100));}
}
