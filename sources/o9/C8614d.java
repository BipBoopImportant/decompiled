package o9;

import ic.C9836d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o9.d  reason: case insensitive filesystem */
public final class C8614d {

    /* renamed from: c  reason: collision with root package name */
    private static final C8614d f55312c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f55313a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C8613c> f55314b;

    /* renamed from: o9.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f55315a = "";

        /* renamed from: b  reason: collision with root package name */
        private List<C8613c> f55316b = new ArrayList();

        a() {
        }

        public C8614d a() {
            return new C8614d(this.f55315a, Collections.unmodifiableList(this.f55316b));
        }

        public a b(List<C8613c> list) {
            this.f55316b = list;
            return this;
        }

        public a c(String str) {
            this.f55315a = str;
            return this;
        }
    }

    C8614d(String str, List<C8613c> list) {
        this.f55313a = str;
        this.f55314b = list;
    }

    public static a c() {
        return new a();
    }

    @C9836d(tag = 2)
    public List<C8613c> a() {
        return this.f55314b;
    }

    @C9836d(tag = 1)
    public String b() {
        return this.f55313a;
    }
}
