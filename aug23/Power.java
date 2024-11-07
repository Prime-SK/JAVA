package aug23;

public class Power {
    public static int power(int base, int index) {
        int ans = 1;
        for (int i = 0; i < index; i++) {
            ans *= base;
        }
        return ans;
    }
}
