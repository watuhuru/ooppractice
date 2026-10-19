package practice41;
import java.util.Arrays;
public class Task02Phone {
 static class Phone {
  private String number,model; private double weight;
  Phone(){this("не указан","не указана",0);} Phone(String number,String model){this(number,model,0);}
  Phone(String number,String model,double weight){this.number=number;this.model=model;this.weight=weight;}
  String getNumber(){return number;}
  void receiveCall(String callerName){System.out.println("Звонит "+callerName);}
  void receiveCall(String callerName,String callerNumber){System.out.println("Звонит "+callerName+" ("+callerNumber+")");}
  void sendMessage(String... numbers){System.out.println("Сообщение отправлено на номера: "+Arrays.toString(numbers));}
  public String toString(){return "Phone{number='"+number+"', model='"+model+"', weight="+weight+"}";}
 }
 public static void main(String[] args){
  Phone a=new Phone("+7-900-111-22-33","Model A",180),b=new Phone("+7-900-222-33-44","Model B"),c=new Phone();
  for(Phone p:new Phone[]{a,b,c}){System.out.println(p);p.receiveCall("Алексей");System.out.println("Номер: "+p.getNumber());}
  a.receiveCall("Мария","+7-900-555-66-77");b.sendMessage(a.getNumber(),c.getNumber());
 }
}
