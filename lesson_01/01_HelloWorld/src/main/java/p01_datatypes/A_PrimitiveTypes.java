package p01_datatypes;

// Примитивные типы данных
// -----------------------
public class A_PrimitiveTypes {
    public static void main(String args[]) {
        /*
          Многострочный...
            ...комментарий
        */
        System.out.println("Hello, group!");

        // Целочисленные типы:
        //--------------------
        //  1. 8 битное целое - **byte** -128..127
        byte varWithoutValue;
        varWithoutValue = 3; // Значение присваиваем позже

        byte b = -128; // -128..127 для положительных чисел
        System.out.println("b = " + b);
        //
        // | Двоичное  |Дополнительный код | Байт |
        // |-----------|:-----------------:|:----:|
        // | 00000000  |    0              |   0  |
        // | 00000001  |    1              |   1  |
        // | 00000010  |    2              |   2  |
        // | 00000011  |    3              |   3  |
        // | 00000100  |    4              |   4  |
        // |  ...      |   ...             | ...  |
        // | 01111111  |   127             | 127  |
        // | 10000000  |   -128            | 128  |
        // |  ...      |   ...             | ...  |
        // | 11111111  |   -1              | 255  |
        //
        // Подробнее: http://ru.wikipedia.org/wiki/Дополнительный_код_(представление_числа)

        // 2. 16-битное целое
        short sh = 32767; // -32768..32767

        // 3. 32-битное целое
        int integerBinary = 0b10101010; // Начиная с Java7
        // Java6
        int intBin = Integer.parseInt("1011", 2);

        int integerHex = 0xFFA9; // Шестнадцатеричная система счисления
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F

        int i = 10; // 32-битное целое

        // 4. 64-битное целое long
        long l = 12L; // 64-битное целое

        byte b1 = (byte) 0xff;
        System.out.println("b1 = " + b1);
        int bb = 0xff & b1; // & - побитовое И
        System.out.println("bb = " + bb);
        // | - побитовое ИЛИ
        // ~ - побитовое НЕ
        // ^ - XOR - исключающее ИЛИ

        // Вещественные типы (действительные)
        // 5. float
        float floatValue = 1.0f;
        // 6. double
        double doubleValue = 1123.22 * 1.0 / 2.3;
        System.out.println(Double.MIN_VALUE + ".." +
                Double.MAX_VALUE);

        // 7. Логический тип
        boolean bool = true;
        boolean bool2 = false;
        boolean bool3 = bool && bool2; // && - И
        // || - ИЛИ
        boolean bool4 = !bool; // НЕ

        // 8. Символьный тип
        char c1 = 'П', c2 = 'Р', c3 = 'И';
        // Переменные, методы, классы можно называть по-русски, имена в кодировке Unicode
        char мояСимвольнаяПеременная = 'Д';
        System.out.println(мояСимвольнаяПеременная);

        int moyaPremennaya = 10;

        int a;
        a = 2;
        if (a > 1) { // Когда условие истинно
            System.out.println("a большая :)");
        } else { // в противоположном случае
            System.out.println("a маленькая :)");
        }

        // Цикл с предусловием - While
        while (a > 1/* условие */) { // Пока выполняется условие
            a = a - 2;
        }

        // Цикл с постусловием - Repeat Until
        do {
            a = a * 3;
        } while (a < 3);

        // Цикл for
        for (int j = 0; j < 10; j++)
            System.out.println("j = " + j);
        // Вывод аргументов командной строки
        for (String s : args) {
            System.out.println(s);
        }

        // == Сокращённая форма ==
        // Сложение
        a = a + 10;
        a += 10;
        // Вычитание
        a = a - 11;
        a -= 11;
        // Умножение
        a = a * 3;
        a *= 3;
        // Деление
        a = a / 2;
        a /= 2;
        // Инкремент
        a = a + 1;
        a++; // Постфиксная форма
        ++a; // Префиксная форма
        // Декремент
        a = a - 1;
        a--;
        --a;

        String s = "String1";


    }
}
