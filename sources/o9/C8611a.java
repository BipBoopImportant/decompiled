package o9;

import ic.C9836d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l9.m;

/* renamed from: o9.a  reason: case insensitive filesystem */
public final class C8611a {

    /* renamed from: e  reason: collision with root package name */
    private static final C8611a f55295e = new C0887a().b();

    /* renamed from: a  reason: collision with root package name */
    private final C8616f f55296a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C8614d> f55297b;

    /* renamed from: c  reason: collision with root package name */
    private final C8612b f55298c;

    /* renamed from: d  reason: collision with root package name */
    private final String f55299d;

    /* renamed from: o9.a$a  reason: collision with other inner class name */
    public static final class C0887a {

        /* renamed from: a  reason: collision with root package name */
        private C8616f f55300a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<C8614d> f55301b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private C8612b f55302c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f55303d = "";

        C0887a() {
        }

        public C0887a a(C8614d dVar) {
            this.f55301b.add(dVar);
            return this;
        }

        public C8611a b() {
            return new C8611a(this.f55300a, Collections.unmodifiableList(this.f55301b), this.f55302c, this.f55303d);
        }

        public C0887a c(String str) {
            this.f55303d = str;
            return this;
        }

        public C0887a d(C8612b bVar) {
            this.f55302c = bVar;
            return this;
        }

        public C0887a e(C8616f fVar) {
            this.f55300a = fVar;
            return this;
        }
    }

    C8611a(C8616f fVar, List<C8614d> list, C8612b bVar, String str) {
        this.f55296a = fVar;
        this.f55297b = list;
        this.f55298c = bVar;
        this.f55299d = str;
    }

    public static C0887a e() {
        return new C0887a();
    }

    @C9836d(tag = 4)
    public String a() {
        return this.f55299d;
    }

    @C9836d(tag = 3)
    public C8612b b() {
        return this.f55298c;
    }

    @C9836d(tag = 2)
    public List<C8614d> c() {
        return this.f55297b;
    }

    @C9836d(tag = 1)
    public C8616f d() {
        return this.f55296a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
