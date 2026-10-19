package practice41;
import java.util.List;
public class Task07Learners {
 static abstract class Learner {private final String fullName;Learner(String fullName){this.fullName=fullName;}abstract String type();public String toString(){return type()+": "+fullName;}}
 static class Schoolboy extends Learner {Schoolboy(String name){super(name);}String type(){return "Школьник";}}
 static class Student extends Learner {Student(String name){super(name);}String type(){return "Студент";}}
 public static void main(String[] args){List<Learner> group=List.of(new Schoolboy("Алексей Орлов"),new Student("Мария Волкова"),new Schoolboy("Дмитрий Соколов"),new Student("Елена Кузнецова"));System.out.println("Школьники:");group.stream().filter(Schoolboy.class::isInstance).forEach(System.out::println);System.out.println("Студенты:");group.stream().filter(Student.class::isInstance).forEach(System.out::println);}
}
