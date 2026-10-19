package practice41;
public class Task06Employer {
 static class Employer {
  private final String firstName,lastName;private final double monthlySalary;
  Employer(String firstName,String lastName,double monthlySalary){this.firstName=firstName;this.lastName=lastName;this.monthlySalary=monthlySalary;}
  double getIncome(){return monthlySalary*12;}public String toString(){return firstName+" "+lastName;}
 }
 static class Manager extends Employer {
  private final double averageSalesBonus;
  Manager(String firstName,String lastName,double monthlySalary,double averageSalesBonus){super(firstName,lastName,monthlySalary);this.averageSalesBonus=averageSalesBonus;}
  @Override double getIncome(){return super.getIncome()+averageSalesBonus;}
 }
 public static void main(String[] args){Employer[] staff={new Employer("Анна","Петрова",80000),new Manager("Иван","Сидоров",100000,250000),new Employer("Мария","Смирнова",75000)};for(Employer e:staff)System.out.printf("%s — годовой доход: %.2f руб.%n",e,e.getIncome());}
}
