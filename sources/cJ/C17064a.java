package cJ;

import HJ.C15854t;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: cJ.a  reason: case insensitive filesystem */
public final class C17064a {

    /* renamed from: f  reason: collision with root package name */
    public static final C3462a f141233f = new C3462a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final C17069f f141234g;

    /* renamed from: h  reason: collision with root package name */
    private static final C17066c f141235h;

    /* renamed from: a  reason: collision with root package name */
    private final C17066c f141236a;

    /* renamed from: b  reason: collision with root package name */
    private final C17066c f141237b;

    /* renamed from: c  reason: collision with root package name */
    private final C17069f f141238c;

    /* renamed from: d  reason: collision with root package name */
    private final C17065b f141239d;

    /* renamed from: e  reason: collision with root package name */
    private final C17066c f141240e;

    /* renamed from: cJ.a$a  reason: collision with other inner class name */
    public static final class C3462a {
        public /* synthetic */ C3462a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3462a() {
        }
    }

    static {
        C17069f fVar = C17071h.f141274m;
        f141234g = fVar;
        f141235h = C17066c.f141245c.a(fVar);
    }

    private C17064a(C17066c cVar, C17066c cVar2, C17069f fVar, C17065b bVar, C17066c cVar3) {
        this.f141236a = cVar;
        this.f141237b = cVar2;
        this.f141238c = fVar;
        this.f141239d = bVar;
        this.f141240e = cVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17064a) {
            C17064a aVar = (C17064a) obj;
            if (C17542s.e(this.f141236a, aVar.f141236a) && C17542s.e(this.f141237b, aVar.f141237b) && C17542s.e(this.f141238c, aVar.f141238c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (527 + this.f141236a.hashCode()) * 31;
        C17066c cVar = this.f141237b;
        return ((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f141238c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C15854t.P(this.f141236a.a(), '.', '/', false, 4, (Object) null));
        sb2.append("/");
        C17066c cVar = this.f141237b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f141238c);
        return sb2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17064a(C17066c cVar, C17069f fVar) {
        this(cVar, (C17066c) null, fVar, (C17065b) null, (C17066c) null);
        C17542s.j(cVar, "packageName");
        C17542s.j(fVar, "callableName");
    }
}
