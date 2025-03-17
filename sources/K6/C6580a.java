package K6;

import android.annotation.SuppressLint;
import android.app.Application;
import com.cyberfend.cyfsecurity.a;

@SuppressLint({"Registered"})
/* renamed from: K6.a  reason: case insensitive filesystem */
public class C6580a {

    /* renamed from: K6.a$a  reason: collision with other inner class name */
    public interface C0597a {
        void a(String str);

        void b();
    }

    public static synchronized String a() {
        String j10;
        synchronized (C6580a.class) {
            j10 = a.j();
        }
        return j10;
    }

    @Deprecated
    public static synchronized void b(Application application) {
        synchronized (C6580a.class) {
            a.k(application);
        }
    }

    public static void c(int i10) {
        a.m(i10);
    }

    public static void d(C0597a aVar) {
        a.n(aVar);
    }
}
