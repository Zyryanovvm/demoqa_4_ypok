package guru.qa;

public class HomeWork {
    public static void main(String[] args) {

        // Целые числа
        byte aByte = 100;     // 8 бит    -128 ... 127 (0 относится к положительному диапозону) 2^7
        short aShort = 250;         // 16 бит 2^15
        int aInt = 350;             // 32 бит 2^31
        long aLong = 12800;     // 64 бит 2^63

        // Дробные числа (числа с плавающей точкой)
        float aFloat = 13.54f;    // 32 бит
        double aDouble = 129.123;  // 64 бит

        String aString = "Текстовая переменная";  // по умолчанию null

        System.out.println("");
        System.out.println("Дано:");
        System.out.println("1. Целое число Byte = " + aByte);
        System.out.println("2. Целое число Short = " + aShort);
        System.out.println("3. Целое число Int = " + aInt);
        System.out.println("4. Целое число Long = " + aLong);
        System.out.println("5. Дробное число Float = " + aFloat);
        System.out.println("6. Дробное число Double = " + aDouble);
        System.out.println("7. Строковая переменная String = '" + aString + "'");

        System.out.println("");
        System.out.println("Примеры различных операторов:");
        System.out.println("1. Сложение aByte + aInt = " + (aByte + aInt));
        System.out.println("2. Вычитание aInt - aLong = " + (aInt - aLong));
        System.out.println("3. Умножение aLong * aByte = " + (aLong * aByte));
        System.out.println("4. Целое число от деление aShort/aInt = " + (aShort/aInt));
        System.out.println("5. Остаток от деления aShort%aInt = " + (aShort % aInt));

        System.out.println("");
        System.out.println("Работа с условием if else:");
        if (aInt>=aByte) {
            System.out.println("1. Int больше Byte");
        } else {
            System.out.println("1. Int меньше Byte");
        }
        if (aInt>=aByte) {
            if (aLong>aByte) {
                System.out.println("2. Условие (aInt>=aByte) & (aLong>aByte) выполняется");
            }
        } else {
            System.out.println("2. Условие (aInt>=aByte) & (aLong>aByte) НЕ выполняется");
        }
        if ((aInt + aByte) > 1000 && ((aDouble % aLong) <= 2000000 || (aDouble - aInt) == 800)) {
            System.out.println("3. (aInt+aByte)>1000 && (aDouble%aLong)<=2000000 || (aDouble-aInt)=800 выполняется");
        } else {
            System.out.println("3. (aInt+aByte)>1000 && (aDouble%aLong)<=2000000 || (aDouble-aInt)=800 НЕ выполняется");

        }

        System.out.println("");
        System.out.println("Работа с условием Switch case:");
        switch (aString) {
            case "Текстовая переменная":
                System.out.println("1. Условие Switch case Выполняется");
                break;
        }

        System.out.println("");
        System.out.println("Преобразование переменных Int в Byte, если Int > диапозона Byte происходит вычитание");
        System.out.println(" Int - 256, а если Int < диапозона Byte происходит прибавление Int + 256 до тех пор пока");
        System.out.println("число не окажется в диапозоне Byte");
        aByte = (byte) aInt;
        System.out.println(aByte);
        aByte = (byte) -256;
        System.out.println(aByte);
        System.out.println("При преобразовании дробных переменных происходит отбрасывание дробной части");
        aInt = (int) aFloat;
        System.out.println(aInt);
        aInt = (int) aDouble;
        System.out.println(aInt);

        System.out.println("");
        System.out.println("Создание и работа с одномерным массивом:");
        int[] arr = new int[]{5, 7, 9, 18};
        System.out.println("Создал массив [" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + "]");
        System.out.println("Прибавляем к третьему значению массива 7");
        arr[2] = arr[2] + 7;
        System.out.println("Создал массив [" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + "]");

        System.out.println("");
        System.out.println("Создание и работа с двумерным массивом:");
        int[][] arr2 = new int[][]{{5, 7}, {2, 1}};
        System.out.println("Создал двумерный массив");
        System.out.println("(" + arr2[0][0] + ", " + arr2[0][1] + ")");
        System.out.println("(" + arr2[1][0] + ", " + arr2[1][1] + ")");
        System.out.println("Прибавляем 7 к значению массива второй строки второго столбца");
        arr2[1][1] = arr2[1][1] + 7;
        System.out.println("(" + arr2[0][0] + ", " + arr2[0][1] + ")");
        System.out.println("(" + arr2[1][0] + ", " + arr2[1][1] + ")");


    }
}
