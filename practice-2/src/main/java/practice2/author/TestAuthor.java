package practice2.author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahteck@example.com", 'M');

        System.out.println("Имя: " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
        System.out.println(author);

        author.setEmail("tan.ah.teck@example.com");
        System.out.println("После изменения почты: " + author);
    }
}
