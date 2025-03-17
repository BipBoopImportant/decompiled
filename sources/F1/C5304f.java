package f1;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import YH.X;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000  2\u00020\u0001:\u0002\u0012 B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0016R\u00020\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R$\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lf1/f;", "Lf1/e;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "h", "()Ljava/util/Map;", "key", "Lkotlin/Function0;", "LXH/N;", "content", "f", "(Ljava/lang/Object;LnI/p;LU0/m;I)V", "c", "(Ljava/lang/Object;)V", "a", "Ljava/util/Map;", "Lf1/f$d;", "b", "registryHolders", "Lf1/h;", "Lf1/h;", "g", "()Lf1/h;", "i", "(Lf1/h;)V", "parentSaveableStateRegistry", "d", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f1.f  reason: case insensitive filesystem */
final class C5304f implements C5303e {

    /* renamed from: d  reason: collision with root package name */
    public static final c f23259d = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C5309k<C5304f, ?> f23260e = C5310l.a(a.f23264c, b.f23265c);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<Object, Map<String, List<Object>>> f23261a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Object, d> f23262b;

    /* renamed from: c  reason: collision with root package name */
    private C5306h f23263c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lf1/m;", "Lf1/f;", "it", "", "", "", "", "", "a", "(Lf1/m;Lf1/f;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.f$a */
    static final class a extends C17544u implements p<m, C5304f, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f23264c = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Map<Object, Map<String, List<Object>>> invoke(m mVar, C5304f fVar) {
            return fVar.h();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "", "", "it", "Lf1/f;", "a", "(Ljava/util/Map;)Lf1/f;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.f$b */
    static final class b extends C17544u implements C17642l<Map<Object, Map<String, ? extends List<? extends Object>>>, C5304f> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f23265c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C5304f invoke(Map<Object, Map<String, List<Object>>> map) {
            return new C5304f(map);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf1/f$c;", "", "<init>", "()V", "Lf1/k;", "Lf1/f;", "Saver", "Lf1/k;", "a", "()Lf1/k;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f1.f$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5309k<C5304f, ?> a() {
            return C5304f.f23260e;
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000b\u001a\u00020\n2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\r\u0010\u001a¨\u0006\u001c"}, d2 = {"Lf1/f$d;", "", "key", "<init>", "(Lf1/f;Ljava/lang/Object;)V", "", "", "", "", "map", "LXH/N;", "b", "(Ljava/util/Map;)V", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "Z", "getShouldSave", "()Z", "c", "(Z)V", "shouldSave", "Lf1/h;", "Lf1/h;", "()Lf1/h;", "registry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f1.f$d */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        private final Object f23266a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f23267b = true;

        /* renamed from: c  reason: collision with root package name */
        private final C5306h f23268c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: f1.f$d$a */
        static final class a extends C17544u implements C17642l<Object, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5304f f23270c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5304f fVar) {
                super(1);
                this.f23270c = fVar;
            }

            /* renamed from: a */
            public final Boolean invoke(Object obj) {
                C5306h g10 = this.f23270c.g();
                return Boolean.valueOf(g10 != null ? g10.a(obj) : true);
            }
        }

        public d(Object obj) {
            this.f23266a = obj;
            this.f23268c = C5308j.a((Map) C5304f.this.f23261a.get(obj), new a(C5304f.this));
        }

        public final C5306h a() {
            return this.f23268c;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            if (this.f23267b) {
                Map<String, List<Object>> d10 = this.f23268c.d();
                if (d10.isEmpty()) {
                    map.remove(this.f23266a);
                } else {
                    map.put(this.f23266a, d10);
                }
            }
        }

        public final void c(boolean z10) {
            this.f23267b = z10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.f$e */
    static final class e extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5304f f23271c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f23272d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f23273e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f1/f$e$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: f1.f$e$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f23274a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5304f f23275b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f23276c;

            public a(d dVar, C5304f fVar, Object obj) {
                this.f23274a = dVar;
                this.f23275b = fVar;
                this.f23276c = obj;
            }

            public void b() {
                this.f23274a.b(this.f23275b.f23261a);
                this.f23275b.f23262b.remove(this.f23276c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5304f fVar, Object obj, d dVar) {
            super(1);
            this.f23271c = fVar;
            this.f23272d = obj;
            this.f23273e = dVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            boolean containsKey = this.f23271c.f23262b.containsKey(this.f23272d);
            Object obj = this.f23272d;
            if (!containsKey) {
                this.f23271c.f23261a.remove(this.f23272d);
                this.f23271c.f23262b.put(this.f23272d, this.f23273e);
                return new a(this.f23273e, this.f23271c, this.f23272d);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: f1.f$f  reason: collision with other inner class name */
    static final class C0376f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5304f f23277c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f23278d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f23279e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f23280f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0376f(C5304f fVar, Object obj, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f23277c = fVar;
            this.f23278d = obj;
            this.f23279e = pVar;
            this.f23280f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f23277c.f(this.f23278d, this.f23279e, mVar, M0.a(this.f23280f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public C5304f() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> z10 = X.z(this.f23261a);
        for (d b10 : this.f23262b.values()) {
            b10.b(z10);
        }
        if (z10.isEmpty()) {
            return null;
        }
        return z10;
    }

    public void c(Object obj) {
        d dVar = this.f23262b.get(obj);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.f23261a.remove(obj);
        }
    }

    public void f(Object obj, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1198538093);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(this) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1198538093, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            k10.J(207, obj);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                C5306h hVar = this.f23263c;
                if (hVar != null ? hVar.a(obj) : true) {
                    D10 = new d(obj);
                    k10.u(D10);
                } else {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
            }
            d dVar = (d) D10;
            C4910x.a(C5308j.d().d(dVar.a()), pVar, k10, (i11 & 112) | J0.f13770i);
            C16807N n10 = C16807N.f139792a;
            boolean F10 = k10.F(this) | k10.F(obj) | k10.F(dVar);
            Object D11 = k10.D();
            if (F10 || D11 == aVar.a()) {
                D11 = new e(this, obj, dVar);
                k10.u(D11);
            }
            P.c(n10, (C17642l) D11, k10, 6);
            k10.B();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C0376f(this, obj, pVar, i10));
        }
    }

    public final C5306h g() {
        return this.f23263c;
    }

    public final void i(C5306h hVar) {
        this.f23263c = hVar;
    }

    public C5304f(Map<Object, Map<String, List<Object>>> map) {
        this.f23261a = map;
        this.f23262b = new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5304f(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
