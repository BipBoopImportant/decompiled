package v;

public class B1 {
    public static int a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + i10 + " can not be recognized.");
    }
}
