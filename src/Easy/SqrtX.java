package Easy;

public class SqrtX {
    public static int sqrtMethod(double num) {
        if (num <= 0) System.out.println("Корень не должен равнятся 0 или быть отрицательным!");

        int c = 1;
        int c1 = 0;
        double val = num;
        do {
            val = val - c;
            c+=2;
            c1++;
        } while (val > 0);

        if (val < 0) c1--;


        return c1;
    }

    public static void main(String[] args) {
        sqrtMethod(8);
    }
}
