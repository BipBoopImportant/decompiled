package w3;

import java.io.IOException;

public class h extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final int f31426a;

    public h(int i10) {
        this.f31426a = i10;
    }

    public static boolean a(IOException iOException) {
        Throwable th2;
        while (th2 != null) {
            if ((th2 instanceof h) && ((h) th2).f31426a == 2008) {
                return true;
            }
            Throwable cause = th2.getCause();
            th2 = iOException;
            th2 = cause;
        }
        return false;
    }

    public h(Throwable th2, int i10) {
        super(th2);
        this.f31426a = i10;
    }

    public h(String str, int i10) {
        super(str);
        this.f31426a = i10;
    }

    public h(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f31426a = i10;
    }
}
