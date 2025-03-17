package k9;

import android.util.SparseArray;
import k9.C8472f;

/* renamed from: k9.p  reason: case insensitive filesystem */
public abstract class C8482p {

    /* renamed from: k9.p$a */
    public static abstract class a {
        public abstract C8482p a();

        public abstract a b(C8485s sVar);

        public abstract a c(b bVar);
    }

    /* renamed from: k9.p$b */
    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);
        
        private static final SparseArray<b> valueMap = null;
        private final int value;

        static {
            b bVar;
            b bVar2;
            SparseArray<b> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        private b(int i10) {
            this.value = i10;
        }
    }

    public static a a() {
        return new C8472f.b();
    }

    public abstract C8485s b();

    public abstract b c();
}
