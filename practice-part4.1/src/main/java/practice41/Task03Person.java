package practice41;
public class Task03Person {
 static class Person {
  private final String fullName; private final int age;
  Person(){this("Неизвестный человек",0);} Person(String fullName,int age){this.fullName=fullName;this.age=age;}
  void move(){System.out.println(fullName+" движется.");} void talk(){System.out.println(fullName+" говорит.");}
  public String toString(){return fullName+", возраст: "+age;}
 }
 public static void main(String[] args){Person a=new Person(),b=new Person("Иван Иванов",20);System.out.println(a);a.move();a.talk();System.out.println(b);b.move();b.talk();}
}
