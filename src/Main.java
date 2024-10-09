public class Main {
    public static void main(String[] args) {
        {
            //Задание № 1

            int myInteger = 10;
            byte smallNumber = 20;
            short mediumNumber = 30000;
            long largeNumber = 1000000000;
            float floatingPointNumber = 3.14f;
            double decimalNumber = 3.14159265359;

            System.out.println("Значение переменной myInteger с типом int равно " + myInteger);
            System.out.println("Значение переменной smallNumber с типом byte равно " + smallNumber);
            System.out.println("Значение переменной mediumNumber с типом short равно " + mediumNumber);
            System.out.println("Значение переменной largeNumber с типом long равно " + largeNumber);
            System.out.println("Значение переменной floatingPointNumber с типом float равно " + floatingPointNumber);
            System.out.println("Значение переменной decimalNumber с типом double равно " + decimalNumber);
        }
        {
            //Задание № 2


            double value1 = 27.12; // double for decimal values
            long value2 = 987678965549L; // long for large integer values
            double value3 = 2.786; // double for decimal values
            int value4 = 569; // int for integer values
            int value5 = -159; // int for integer values
            int value6 = 27897; // int for integer values
            int value7 = 67; // int for integer values

            System.out.println("Value 1: " + value1);
            System.out.println("Value 2: " + value2);
            System.out.println("Value 3: " + value3);
            System.out.println("Value 4: " + value4);
            System.out.println("Value 5: " + value5);
            System.out.println("Value 6: " + value6);
            System.out.println("Value 7: " + value7);
        }
        {
            //Задание № 3

            int totalStudents = 23 + 27 + 30;

            int totalSheets = 480;

            int sheetsPerStudent = totalSheets / totalStudents;

            System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");
        }
        {
            //Задание № 4
            int bottlesPer2Minutes = 16;

            double bottlesPerMinute = (double) bottlesPer2Minutes / 2;

            int productivity20Minutes = (int) (bottlesPerMinute * 20);
            int productivity1Day = (int) (bottlesPerMinute * 60 * 24);
            int productivity3Days = productivity1Day * 3;
            int productivity1Month = productivity1Day * 30;

            System.out.println("За 20 минут машина произвела " + productivity20Minutes + " штук бутылок.");
            System.out.println("За сутки машина произвела " + productivity1Day + " штук бутылок.");
            System.out.println("За 3 дня машина произвела " + productivity3Days + " штук бутылок.");
            System.out.println("За 1 месяц машина произвела " + productivity1Month + " штук бутылок.");
        }
        {
            //Задание № 5
            int numClasses = 3;

            int whitePerClass = 2;
            int brownPerClass = 4;

            int totalWhite = numClasses * whitePerClass;
            int totalBrown = numClasses * brownPerClass;

            System.out.println("В школе, где " + numClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");
        }
        {
            //Задание № 6
            int bananasWeight = 5 * 80; // 5 бананов по 80 грамм каждый
            int milkWeight = 200 * 105 / 100; // 200 мл молока, 100 мл = 105 грамм
            int iceCreamWeight = 2 * 100; // 2 брикета мороженого по 100 грамм каждый
            int eggsWeight = 4 * 70; // 4 яйца по 70 грамм каждое

            int totalWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;

            double totalWeightKilograms = (double) totalWeightGrams / 1000;

            System.out.println("Вес спортзавтрака: " + totalWeightGrams + " грамм или " + totalWeightKilograms + " килограмм.");
        }
        {
            //Задание № 7
            int weightToLose = 7000;

            int daysAt250g = weightToLose / 250;

            int daysAt500g = weightToLose / 500;

            double averageDays = (daysAt250g + daysAt500g) / 2.0;

            System.out.println("If the athlete loses 250g per day, it will take " + daysAt250g + " days to lose 7 kg.");
            System.out.println("If the athlete loses 500g per day, it will take " + daysAt500g + " days to lose 7 kg.");
            System.out.println("On average, it will take " + averageDays + " days to lose 7 kg.");
        }
        {
            //Задание № 8
            int mashaSalary = 67760;
            int denisSalary = 83690;
            int kristinaSalary = 76230;

            double mashaNewSalary = mashaSalary * 1.1;
            double denisNewSalary = denisSalary * 1.1;
            double kristinaNewSalary = kristinaSalary * 1.1;

            double mashaAnnualDifference = (mashaNewSalary - mashaSalary) * 12;
            double denisAnnualDifference = (denisNewSalary - denisSalary) * 12;
            double kristinaAnnualDifference = (kristinaNewSalary - kristinaSalary) * 12;

            System.out.println("Маша теперь получает " + (int) mashaNewSalary + " рублей. Годовой доход вырос на " + (int) mashaAnnualDifference + " рублей.");
            System.out.println("Денис теперь получает " + (int) denisNewSalary + " рублей. Годовой доход вырос на " + (int) denisAnnualDifference + " рублей.");
            System.out.println("Кристина теперь получает " + (int) kristinaNewSalary + " рублей. Годовой доход вырос на " + (int) kristinaAnnualDifference + " рублей.");
        }

    }
}