
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. " +
                "Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами." +
                "Калькулятор принимает на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми." +
                "Калькулятор умеет работать только с целыми числами." +
                "Калькулятор умеет работать только с арабскими или римскими цифрами одновременно." +
                "При вводе римских чисел, ответ будет в римских цифрах, при вводе арабских -арабскими." +
                "При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу." +
                "При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.\n" +
                "Результатом операции деления является целое число, остаток отбрасывается. " +
                "Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль. Результатом работы калькулятора с римскими числами могут быть только положительные числа." + "Калькулятор работает со строкой без пробелов");
        System.out.println("введите пример");
        Scanner a = new Scanner(System.in);
        String str0 = new String(a.nextLine());
        String str11 = calc(str0);
        System.out.println(str11);
    }


    public static String calc(String str0) {
        String str1 = "/";
        String str2 = "*";
        String str3 = "+";
        String str4 = "-";
        String str5 = "i";
        String str6 = "V";
        String str7 = "X";
        String str8 = "I";
        String str9 = "V";
        String str10 = "X";
        String str11 = " ";
        String str12 = ",";
        String str13 = ".";
        int x = 0;
        int c = 0;
        int v = 0;
        int b = 0;
        int n = 0;
        int m = 0;
        int o = 0;
        int u = 0;
        int q = 0;
        int y = 0;
        int g = 0;
        int gg = 0;
        int k = 0;
        int l = 0;
        int length = str0.length();
        int j = 0;
        for (int i = 0; i < length; i++) {
            char[] w = new char[]{(str0.charAt(i))};
            String f = new String(w);
            if ((str5.equalsIgnoreCase(f) == true) || (((str6.equalsIgnoreCase(f))) == true) || (((str7.equalsIgnoreCase(f))) == true) || (((str8.equalsIgnoreCase(f)) == true)) || (((str9.equalsIgnoreCase(f)) == true)) || (((str10.equalsIgnoreCase(f)) == true))) {
                y = y + 1;
            }
            if ((((str11.equalsIgnoreCase(f)) == true))) {
                k = k + 1;
            }
            if (k > 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("введены пробелы");
                }
                System.exit(0);
            } else {
                str1 = "1";
                str2 = "2";
                str3 = "3";
                str4 = "4";
                str5 = "5";
                str6 = "6";
                str7 = "7";
                str8 = "8";
                str9 = "9";
                str10 = "0";
                if ((((str1.equalsIgnoreCase(f)) == true) || ((str2.equalsIgnoreCase(f)) == true) || ((str3.equalsIgnoreCase(f)) == true) || ((str4.equalsIgnoreCase(f)) == true) || ((str5.equalsIgnoreCase(f)) == true) || ((str6.equalsIgnoreCase(f)) == true) || ((str7.equalsIgnoreCase(f)) == true) || ((str8.equalsIgnoreCase(f)) == true) || ((str9.equalsIgnoreCase(f)) == true) || ((str10.equalsIgnoreCase(f)) == true))) {
                    l = l + 1;
                }
                if (((y > 0) && (l > 0))) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("введены арабские и римские цифры ");
                    }
                    System.exit(0);
                } else {
                    str1 = "/";
                    str2 = "*";
                    str3 = "+";
                    str4 = "-";
                    str5 = "i";
                    str6 = "V";
                    str7 = "X";
                    str8 = "I";
                    str9 = "V";
                    str10 = "X";
                    str11 = " ";
                    c = 0;
                    if ((str1.equalsIgnoreCase(f) == true) || (((str2.equalsIgnoreCase(f))) == true) || (((str3.equalsIgnoreCase(f))) == true) || (((str4.equalsIgnoreCase(f)) == true))) {
                        q = q + 1;
                        x = i;
                        if (q > 1) {
                            try {
                                throw new IOException();
                            } catch (IOException e) {
                                System.out.println("введено много операторов ");
                            }
                            System.exit(0);
                        }
                    }
                }
            }
        }
        if (q < 1) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("введено мало операторов или введены не подходящие операторы");
            }
            System.exit(0);
        }
        for (int i = 0; i < x; i++) {
            char[] w = new char[]{(str0.charAt(i))};
            String f = new String(w);
            if ((l > 0) && ((x > 2) || ((length - 3) > 2))) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("одно из чисел больше 10");
                }
                System.exit(0);
            } else {
                if (l > 0) {
                    int h = Integer.parseInt(f);
                    if ((h > 0) && (c > 0) && (c < 10)) {
                        try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("одно из чисел больше 10");
                        }
                        System.exit(0);
                    }
                    c = h;
                    if ((h == 0) && (c == 1) && (x < 3)) {
                        c = 10;
                    }
                }
            }
        }
        for (int i = x + 1; i < length; i++) {
            char[] w = new char[]{(str0.charAt(i))};
            String f = new String(w);
            if (l > 0) {
                int h = Integer.parseInt(f);
                if ((h > 0) && (v > 0) && (v < 10)) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("одно из чисел больше 10");
                    }
                    System.exit(0);
                }
                v = h;
                if ((h == 0) && (v == 1) && (x < 3)) {
                    v = 10;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            char[] w = new char[]{(str0.charAt(i))};
            String f = new String(w);
            char[] ww = new char[]{(str0.charAt(i + 1))};
            String ff = new String(ww);
            if (i == 0) {
                n = 1;
            } else {
                n = i;
            }
            char[] www = new char[]{(str0.charAt(n - 1))};
            String fff = new String(www);
            if (y > 0) {
                if (((str5.equalsIgnoreCase(f) == true) || (str8.equalsIgnoreCase(f) == true)) && ((str6.equalsIgnoreCase(ff) == false) || (str9.equalsIgnoreCase(ff) == false)) && ((str7.equalsIgnoreCase(ff) == false) || (str10.equalsIgnoreCase(ff) == false))) {
                    b = b + 1;
                }
                if (((str6.equalsIgnoreCase(f) == true) || (str9.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == false) || (str8.equalsIgnoreCase(fff) == false))) {
                    b = b + 5;
                }
                if (((str6.equalsIgnoreCase(f) == true) || (str9.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == true) || (str8.equalsIgnoreCase(fff) == true))) {
                    b = b + 4;
                }
                if (((str7.equalsIgnoreCase(f) == true) || (str10.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == false) || (str8.equalsIgnoreCase(fff) == false))) {
                    b = b + 10;
                }
                if (((str7.equalsIgnoreCase(f) == true) || (str10.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == true) || (str8.equalsIgnoreCase(fff) == true))) {
                    b = b + 9;
                }
            }
        }
        for (int i = x + 1; i < length; i++) {
            char[] w = new char[]{(str0.charAt(i))};
            String f = new String(w);
            char[] www = new char[]{(str0.charAt(i - 1))};
            String fff = new String(www);
            if (y > 0) {
                if (((str5.equalsIgnoreCase(f) == true) || (str8.equalsIgnoreCase(f) == true))) {
                    m = m + 1;
                }
                if (((str6.equalsIgnoreCase(f) == true) || (str9.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == false) || (str8.equalsIgnoreCase(fff) == false))) {
                    m = m + 5;
                }
                if (((str6.equalsIgnoreCase(f) == true) || (str9.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == true) || (str8.equalsIgnoreCase(fff) == true))) {
                    m = m + 3;
                }
                if (((str7.equalsIgnoreCase(f) == true) || (str10.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == false) || (str8.equalsIgnoreCase(fff) == false))) {
                    m = m + 10;
                }
                if (((str7.equalsIgnoreCase(f) == true) || (str10.equalsIgnoreCase(f) == true)) && ((str5.equalsIgnoreCase(fff) == true) || (str8.equalsIgnoreCase(fff) == true))) {
                    m = m + 8;
                }
            }
        }
        for (int i = x + 1; i < length; i++) {
            char[] w = new char[]{(str0.charAt(i))};
            String f = new String(w);
            char[] ww = new char[]{(str0.charAt(0))};
            String ff = new String(ww);
            char[] www = new char[]{(str0.charAt(x + 1))};
            String fff = new String(www);
            if ((str4.equalsIgnoreCase(ff) == true) || (str4.equalsIgnoreCase(fff) == true)) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("ввели отрицательное число");
                }
                System.exit(0);
            }
            if ((str12.equalsIgnoreCase(f) == true) || (str13.equalsIgnoreCase(f) == true)) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("ввели не целое число");
                }
                System.exit(0);
            }
        }
        if ((b > 10) || (m > 10)) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("одно из чисел больше 10");
            }
            System.exit(0);
        }
        char[] w = new char[]{(str0.charAt(x))};
        String f = new String(w);
        if (l > 0) {
            if (str1.equalsIgnoreCase(f) == true) {
                o = c / v;
            }
            if (str2.equalsIgnoreCase(f) == true) {
                o = c * v;
            }
            if (str3.equalsIgnoreCase(f) == true) {
                o = c + v;
            }
            if (str4.equalsIgnoreCase(f) == true) {
                o = c - v;
            }
            str11 = Integer.toString(o);
        }
        if ((b > 10) || (m > 10)) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("одно из чисел больше 10");
            }
            System.exit(0);
        } else {
            if (y > 0) {
                if (str1.equalsIgnoreCase(f) == true) {
                    u = b / m;
                }
                if (str2.equalsIgnoreCase(f) == true) {
                    u = b * m;
                }
                if (str3.equalsIgnoreCase(f) == true) {
                    u = b + m;
                }
                if (str4.equalsIgnoreCase(f) == true) {
                    u = b - m;
                }
            }
            if (y > 0) {
                if (u<1) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("ответ меньше 1 , в римской системе нет цифр меньше 1");
                    }
                    System.exit(0);
                }
                g = u / 100;
                for (int i = 0; i < g; i++) {
                    str11 = str11 + "C";
                }
                gg = u % 100;
                g= gg / 50;
                for (int i = 0; i < g; i++) {
                    str11 = str11 + "L";
                }
                gg = gg % 50;
                g= gg / 40;
                for (int i = 0; i < g; i++) {
                    str11 = str11 + "XL";
                }
            gg = gg % 40;
            g= gg / 10;
            for (int i = 0; i < g; i++) {
                str11=str11+"X";
            }
            gg = gg % 10;
            g = gg / 9;
            for (int i = 0; i < g; i++) {
                str11=str11+"IX";
            }
            gg = gg % 9;
            g = gg / 5;
            for (int i = 0; i < g; i++) {
                str11=str11+"V";
            }
            gg = gg % 5;
            g = gg / 4;
            for (int i = 0; i < g; i++) {
                str11=str11+"IV";
            }
            gg = gg % 4;
            g = gg / 1;
            for (int i = 0; i < g; i++) {
                str11=str11+"I";
            }
            }
        }
        return str11;
    }
}





