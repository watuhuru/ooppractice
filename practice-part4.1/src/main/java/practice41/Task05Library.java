package practice41;
import java.time.LocalDate;import java.util.Arrays;
public class Task05Library {
 static class Book {private final String title,author;Book(String title,String author){this.title=title;this.author=author;}public String toString(){return "\""+title+"\" — "+author;}}
 static class Reader {
  private final String fullName,faculty,phone;private final int cardNumber;private final LocalDate birthDate;
  Reader(String fullName,int cardNumber,String faculty,LocalDate birthDate,String phone){this.fullName=fullName;this.cardNumber=cardNumber;this.faculty=faculty;this.birthDate=birthDate;this.phone=phone;}
  void takeBook(int n){System.out.println(fullName+" взял книг: "+n);}
  void takeBook(String... titles){System.out.println(fullName+" взял книги: "+String.join(", ",titles));}
  void takeBook(Book... books){System.out.println(fullName+" взял книги: "+Arrays.toString(books));}
  void returnBook(int n){System.out.println(fullName+" вернул книг: "+n);}
  void returnBook(String... titles){System.out.println(fullName+" вернул книги: "+String.join(", ",titles));}
  void returnBook(Book... books){System.out.println(fullName+" вернул книги: "+Arrays.toString(books));}
  public String toString(){return fullName+", билет №"+cardNumber+", факультет "+faculty+", дата рождения "+birthDate+", телефон "+phone;}
 }
 public static void main(String[] args){Reader r=new Reader("Иван Иванов",12345,"Информатика",LocalDate.of(2005,4,12),"+7-900-000-00-00");Book a=new Book("Дюна","Фрэнк Герберт"),b=new Book("Java для начинающих","Герберт Шилдт");System.out.println(r);r.takeBook(2);r.takeBook("Дюна","Java для начинающих");r.takeBook(a,b);r.returnBook(a);}
}
