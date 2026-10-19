package practice4.task1;

public class SeasonDemo {
    public static void printFavoriteSeasonMessage(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Мне нравится весна!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Мне нравится осень!");
                break;
            case WINTER:
                System.out.println("Мне нравится зима!");
                break;
            default:
                System.out.println("Время года не определено.");
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        printFavoriteSeasonMessage(favoriteSeason);

        for (Season season : Season.values()) {
            System.out.printf("%s: средняя температура %d °C, %s%n",
                season, season.getAverageTemperature(), season.getDescription());
        }
    }
}
