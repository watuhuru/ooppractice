# Практическая работа № 1

Задания по основам Java: массивы, циклы, ввод и вывод, аргументы командной строки и методы.

## Решения

| Задание | Файл | Что делает программа |
| --- | --- | --- |
| 3 | `src/main/java/practice1/InitializedArrayStatistics.java` | Считает сумму и среднее массива, заданного при инициализации. |
| 4 | `src/main/java/practice1/InputArrayStatistics.java` | Считывает массив и считает сумму двумя видами циклов, минимум и максимум. |
| 5 | `src/main/java/practice1/CommandLineArguments.java` | Выводит аргументы запуска в цикле `for`. |
| 6 | `src/main/java/practice1/HarmonicSeries.java` | Выводит первые десять частичных сумм гармонического ряда с форматированием. |
| 7 | `src/main/java/practice1/Factorial.java` | Вычисляет факториал методом и проверяет его на введённом числе. |

## Запуск

Каждый файл содержит собственный метод `main` и запускается независимо. Например, из корня репозитория:

```text
javac -d out practice-1/src/main/java/practice1/InitializedArrayStatistics.java
java -cp out practice1.InitializedArrayStatistics
```

Для остальных заданий замените имя файла и имя класса. Для задания 5 передайте аргументы после имени класса, например:

```text
java -cp out practice1.CommandLineArguments привет Java
```


