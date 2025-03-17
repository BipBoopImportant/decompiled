package k9;

import k9.C8471e;

/* renamed from: k9.o  reason: case insensitive filesystem */
public abstract class C8481o {

    /* renamed from: k9.o$a */
    public static abstract class a {
        public abstract C8481o a();

        public abstract a b(C8467a aVar);

        public abstract a c(b bVar);
    }

    /* renamed from: k9.o$b */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private b(int i10) {
            this.value = i10;
        }
    }

    public static a a() {
        return new C8471e.b();
    }

    public abstract C8467a b();

    public abstract b c();
}
