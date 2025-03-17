package JL;

import org.maplibre.android.a;
import org.maplibre.android.b;

/* renamed from: JL.a  reason: case insensitive filesystem */
public class C15976a implements b {

    /* renamed from: JL.a$a  reason: collision with other inner class name */
    private static class C3342a extends a {
        public void b(String str) {
            System.loadLibrary(str);
        }

        private C3342a() {
        }
    }

    public a a() {
        return new C3342a();
    }
}
