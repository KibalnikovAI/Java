public class Home_work1
{
    public static void main (String[] args)
    {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign()
    {
        int a = 1;
        int b = -2;
        int sum = a + b;
        if (sum >= 0)
        {
            System.out.println("Сумма положительная");
        }
        else if (sum < 0)
        {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor()
    {
        int value = 101;
        if (value <= 0)
        {
            System.out.println("Красный");
        }
        else if (0 < value && value  <= 100)
        {
            System.out.println("Жёлтый");
        }
        else if (value > 100)
        {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers()
    {
        int a = 25;
        int b = 338;
        if (a >= b)
        {
            System.out.println("a>=b");
        }
        else if (a < b)
        {
            System.out.println("a<b");
        }
    }

}
