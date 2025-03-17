package uc;

import com.google.firebase.messaging.K;
import ic.C9836d;

/* renamed from: uc.b  reason: case insensitive filesystem */
public final class C10262b {

    /* renamed from: b  reason: collision with root package name */
    private static final C10262b f76982b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final C10261a f76983a;

    /* renamed from: uc.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private C10261a f76984a = null;

        a() {
        }

        public C10262b a() {
            return new C10262b(this.f76984a);
        }

        public a b(C10261a aVar) {
            this.f76984a = aVar;
            return this;
        }
    }

    C10262b(C10261a aVar) {
        this.f76983a = aVar;
    }

    public static a b() {
        return new a();
    }

    @C9836d(tag = 1)
    public C10261a a() {
        return this.f76983a;
    }

    public byte[] c() {
        return K.a(this);
    }
}
