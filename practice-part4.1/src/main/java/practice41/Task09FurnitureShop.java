package practice41;
import java.util.List;
public class Task09FurnitureShop {
 static abstract class Furniture {private final String name;private final double price;Furniture(String name,double price){if(price<0)throw new IllegalArgumentException("Цена не может быть отрицательной");this.name=name;this.price=price;}abstract String category();public String toString(){return category()+": "+name+", "+price+" руб.";}}
 static class Chair extends Furniture {Chair(String n,double p){super(n,p);}String category(){return "Стул";}}
 static class Table extends Furniture {Table(String n,double p){super(n,p);}String category(){return "Стол";}}
 static class Sofa extends Furniture {Sofa(String n,double p){super(n,p);}String category(){return "Диван";}}
 static class Wardrobe extends Furniture {Wardrobe(String n,double p){super(n,p);}String category(){return "Шкаф";}}
 static class FurnitureShop {private final List<Furniture> items;FurnitureShop(List<Furniture> items){this.items=List.copyOf(items);}void showCatalog(){System.out.println("Каталог мебельного магазина:");items.forEach(System.out::println);}}
 public static void main(String[] args){new FurnitureShop(List.of(new Chair("Стул деревянный",4500),new Table("Стол письменный",12900),new Sofa("Диван угловой",56000),new Wardrobe("Шкаф трёхстворчатый",32000))).showCatalog();}
}
