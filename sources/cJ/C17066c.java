package cJ;

import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cJ.c  reason: case insensitive filesystem */
public final class C17066c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f141245c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final C17066c f141246d = new C17066c("");

    /* renamed from: a  reason: collision with root package name */
    private final C17067d f141247a;

    /* renamed from: b  reason: collision with root package name */
    private transient C17066c f141248b;

    /* renamed from: cJ.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17066c a(C17069f fVar) {
            C17542s.j(fVar, "shortName");
            return new C17066c(C17067d.f141249e.a(fVar));
        }

        private a() {
        }
    }

    public C17066c(String str) {
        C17542s.j(str, "fqName");
        this.f141247a = new C17067d(str, this);
    }

    public final String a() {
        return this.f141247a.a();
    }

    public final C17066c b(C17069f fVar) {
        C17542s.j(fVar, "name");
        return new C17066c(this.f141247a.b(fVar), this);
    }

    public final boolean c() {
        return this.f141247a.e();
    }

    public final C17066c d() {
        C17066c cVar = this.f141248b;
        if (cVar != null) {
            return cVar;
        }
        if (!c()) {
            C17066c cVar2 = new C17066c(this.f141247a.g());
            this.f141248b = cVar2;
            return cVar2;
        }
        throw new IllegalStateException("root");
    }

    public final List<C17069f> e() {
        return this.f141247a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17066c) && C17542s.e(this.f141247a, ((C17066c) obj).f141247a);
    }

    public final C17069f f() {
        return this.f141247a.j();
    }

    public final C17069f g() {
        return this.f141247a.k();
    }

    public final boolean h(C17069f fVar) {
        C17542s.j(fVar, "segment");
        return this.f141247a.l(fVar);
    }

    public int hashCode() {
        return this.f141247a.hashCode();
    }

    public final C17067d i() {
        return this.f141247a;
    }

    public String toString() {
        return this.f141247a.toString();
    }

    public C17066c(C17067d dVar) {
        C17542s.j(dVar, "fqName");
        this.f141247a = dVar;
    }

    private C17066c(C17067d dVar, C17066c cVar) {
        this.f141247a = dVar;
        this.f141248b = cVar;
    }
}
