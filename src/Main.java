public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 1) {System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача №2
        System.out.println("Задача 2");
        int clientOS2 = 1;
            int clientDeviceYear = 2015;
            if (clientOS2 == 0)
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
            if (clientOS2 == 1)
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
        }

        // Задача №3
        System.out.println("Задача 3");
            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный");}
            else {System.out.println( year + " не високосный");}

        // Задача №4
        System.out.println("Задача 4");
            int deliveryDistance = 95;
            int deliveryDay = 1;
            if (deliveryDistance > 20) {
                deliveryDay++;
            }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);

        // Задача №5
        System.out.println("Задача 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого дня не существует");
        }

    }
    }