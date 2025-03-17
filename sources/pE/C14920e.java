package pE;

import android.content.Context;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: pE.e  reason: case insensitive filesystem */
public interface C14920e {

    /* renamed from: pE.e$a */
    public static class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private final int f130337a;

        public a(String str, String str2) {
            super(str);
            int i10;
            try {
                i10 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            this.f130337a = i10;
        }

        public int a() {
            return this.f130337a;
        }
    }

    boolean a(Context context, C14919d dVar);

    byte[] b(String str, Map<String, Object> map, SSLSocketFactory sSLSocketFactory);

    void c();
}
