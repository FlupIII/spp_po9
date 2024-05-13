package com.labrab6.task2;

/**
 * Реализовать фрагмент программной системы, используя выбранный паттерн (Компоновщик).
 * Реализовать все необходимые дополнительные классы.
 * <p>
 * Проект «Файловая система». Реализуйте модель работы файловой системы.
 * Должна поддерживаться иерархичность ФС на уровне директорий и отдельных файлов. Файлы могут иметь
 * все основные присущие им атрибуты (размер, расширение, дата создания и т.д.).
 */
public class Main
{
    public static void main(String[] args)
    {
        // Создаем файлы
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 150);

        // Создаем директории
        Directory directory1 = new Directory("Directory 1");
        Directory directory2 = new Directory("Directory 2");

        // Добавляем файлы в первую директорию
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        // Добавляем файлы во вторую директорию
        directory2.addComponent(file3);

        // Добавляем вторую директорию в первую
        directory1.addComponent(directory2);

        // Выводим информацию о файловой системе
        directory1.displayInfo();
    }
}
