package lab;

import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите продукты завтрака:");
        String str = scan.nextLine(); // строка с меню
        Food[] breakfast = new Food[50]; // массив с меню
        String[] str1 = str.split("  "); // разделитель объектов меню в строке, создание подстроки с продуктом меню
        int k = 0;
        int cheese = 0;
        for (String point:str1) {
            if (point.contains("/")) {
                String[] str2=point.split("/"); // подстрока первой подстроки, где выкалываем параметр продукта
                if (str2[0].equals("Яблоко"))
                    breakfast[k] = new Apple(str2[1]);
                if (str2[0].equals("Мясо"))
                    breakfast[k] = new Beef(str2[1]);
            }
            if (point.equals("Сыр")) {
                breakfast[k] = new Cheese();
                cheese++;
            }
            if (point.equals("Слива"))
                System.out.println("Такого продукта в меню нет.");
            k++;
        }

        for (int i=0; i < breakfast.length; i++) { // перебор продуктов массива. Если продукт существует, то он будет съеден
            if(breakfast[i] != null)
                breakfast[i].consume();
        }

        Apple a1 = new Apple("большое"); // объекты класса(продукта)
        int appleBig = 0;
        Apple a2 = new Apple("малое");
        int appleSmall = 0;
        Beef b1 = new Beef("с кровью");
        int beefBlood = 0;
        Beef b2 = new Beef("нормальное");
        int beefNorm = 0;
        Beef b3 = new Beef("прожаренное");
        int beefProzh = 0;

        for (int i = 0; i < breakfast.length; i++) {  // проверка, относятся ли переданный обект к классу Food, к определённому классу наследника, совпадают ли параметры и их количество
            if (breakfast[i] != null) {
                if (breakfast[i].equals(a1))
                    appleBig++;
                else if (breakfast[i].equals(a2))
                    appleSmall++;
                else if (breakfast[i].equals(b1))
                    beefBlood++;
                else if (breakfast[i].equals(b2))
                    beefNorm++;
                else if (breakfast[i].equals(b3))
                    beefProzh++;
            }
            else
                break;
        }

        System.out.println("В завтраке было " + (cheese + appleBig + appleSmall + beefBlood + beefNorm + beefProzh) + " продукта:");
        if (cheese >= 1)
            System.out.println(cheese + " Сыр ");
        if ((appleBig >= 1) || (appleSmall >= 1))
            System.out.println(appleBig + appleSmall + " Яблоко ");
        if ((beefBlood >= 1) || (beefNorm >= 1) || (beefProzh >= 1))
            System.out.println(beefBlood + beefNorm + beefProzh + " Мясо");
    }
}









