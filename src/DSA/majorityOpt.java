package DSA;

public class majorityOpt {
    public static int majorityElement(int[] var0) {
        int var1 = var0.length;
        int var2 = 0;
        int var3 = 0;

        for(int var4 = 0; var4 < var1; ++var4) {
            if (var2 == 0) {
                var2 = 1;
                var3 = var0[var4];
            } else if (var3 == var0[var4]) {
                ++var2;
            } else {
                --var2;
            }
        }

        int var6 = 0;

        for(int var5 = 0; var5 < var1; ++var5) {
            if (var0[var5] == var3) {
                ++var6;
            }
        }

        if (var6 > var1 / 2) {
            return var3;
        } else {
            return -1;
        }
    }

    public static void main(String[] var0) {
        int[] var1 = new int[]{2, 2, 1, 1, 1, 2, 2};
        int var2 = majorityElement(var1);
        System.out.println("The majority element is: " + var2);
    }
}
