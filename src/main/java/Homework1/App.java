package Homework1;

import java.io.*;
import java.lang.reflect.Field;

public class App {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        File file = new File("Notebook.txt");

        System.out.println("Введите произвоителя ноутбука");
        String prodcer = Notebook.writer(reader);
        System.out.println("Введите модель ноутбука");
        String model = Notebook.writer(reader);
        System.out.println("Введите цену");
        int price = Integer.parseInt(Notebook.writer(reader));


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(prodcer + "," + model + "," + price);

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fr = new FileReader(file);
        BufferedReader readFile = new BufferedReader(fr);
        String line = readFile.readLine();
        System.out.println("Вы ввели этот ноутбук: " + line);

        String[] readedLine  = line.split(",");



        Notebook notebook = new Notebook(readedLine[0], readedLine[1], readedLine[2]);


        Class notebookClass = notebook.getClass();

        Field rProducer = notebookClass.getDeclaredField("producer");
        rProducer.setAccessible(true);
        rProducer.set(notebook, "Asus");

        Field rModel = notebookClass.getDeclaredField("model");
        rModel.setAccessible(true);
        rModel.set(notebook, "K70IO");

        Field rPrice = notebookClass.getDeclaredField("price");
        rPrice.setAccessible(true);
        rPrice.set(notebook, "605");


        System.out.print("Но рефлексия исправила изменила ноутбук, на этот: ");
        notebook.showNotebook();

    }
}



