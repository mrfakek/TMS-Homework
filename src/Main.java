public class Main {
    public static void main(String[] args) {
        int a = 1012310456;
        int b = a;
        int c = a;
        int g = 0;
        int j = 0;
        int n = 0;
        int i = 0;
        int t, y;
        int max = c % 10;
        int min = c % 10;
        System.out.println("Наше число: " + a);


        if (a < 0) {
            System.out.print("Число наоборот: -");
        } else {
            System.out.print("Число наоборот: ");
        }



        while (b != 0) {
            y = b;
            b = b / 10;
            t = b;
            c = c % 10;
            if (a < 0) {
                System.out.print(c * -1);
            } else {
                System.out.print(c);
            }
            while (y != 0) {
                if (t == 0 || j > 0) {
                    break;
                }
                y = y / 10;
                t = t % 10;

                if (c == t) {
                    j = j + 1;
                }

                t = y / 10;
            }

            if (min > c) {
                min = c;
            }

            if (max < c) {
                max = c;
            }

            c = b;
        }
        System.out.println();
        if (j == 0) {
            System.out.println("true");
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.print("Последовательности: ");
        b=a;
        c=a;
        while (b != 0) {
            b = b / 10;
            t = b % 10;
            c = c % 10;
            if (c == t + 1 && b != 0) {

                n++;

                if (n == 1) {
                    g = c;
                }
                g = g * 10 + t;
            } else if (n > 0) {
                System.out.print(" "+g+" ");
                n = 0;
                i++;
            }
            c = b;
        }
        if (i == 0) {
            System.out.print("Последовательностей не найдено");
        }


    }
}

