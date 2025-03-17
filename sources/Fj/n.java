package fJ;

import AI.C15429j;
import DI.C15558e;
import DI.C15562i;
import DI.C15566m;
import DI.m0;
import DI.u0;
import EI.C15644c;
import EI.C15646e;
import XH.C16807N;
import XH.t;
import YH.g0;
import cJ.C17067d;
import cJ.C17069f;
import fJ.C17231b;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import uJ.C18096U;
import uJ.E0;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f143173a;

    /* renamed from: b  reason: collision with root package name */
    public static final n f143174b;

    /* renamed from: c  reason: collision with root package name */
    public static final n f143175c;

    /* renamed from: d  reason: collision with root package name */
    public static final n f143176d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f143177e;

    /* renamed from: f  reason: collision with root package name */
    public static final n f143178f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f143179g;

    /* renamed from: h  reason: collision with root package name */
    public static final n f143180h;

    /* renamed from: i  reason: collision with root package name */
    public static final n f143181i;

    /* renamed from: j  reason: collision with root package name */
    public static final n f143182j;

    /* renamed from: k  reason: collision with root package name */
    public static final n f143183k;

    /* renamed from: l  reason: collision with root package name */
    public static final n f143184l;

    public static final class a {

        /* renamed from: fJ.n$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C3492a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f143185a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    DI.f[] r0 = DI.C15559f.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    DI.f r1 = DI.C15559f.CLASS     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    DI.f r1 = DI.C15559f.INTERFACE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    DI.f r1 = DI.C15559f.ENUM_CLASS     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    DI.f r1 = DI.C15559f.OBJECT     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    DI.f r1 = DI.C15559f.ANNOTATION_CLASS     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    DI.f r1 = DI.C15559f.ENUM_ENTRY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f143185a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: fJ.n.a.C3492a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(C15562i iVar) {
            C17542s.j(iVar, "classifier");
            if (iVar instanceof m0) {
                return "typealias";
            }
            if (iVar instanceof C15558e) {
                C15558e eVar = (C15558e) iVar;
                if (eVar.b0()) {
                    return "companion object";
                }
                switch (C3492a.f143185a[eVar.h().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new t();
                }
            } else {
                throw new AssertionError("Unexpected classifier: " + iVar);
            }
        }

        public final n b(C17642l<? super w, C16807N> lVar) {
            C17542s.j(lVar, "changeOptions");
            z zVar = new z();
            lVar.invoke(zVar);
            zVar.q0();
            return new u(zVar);
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f143186a = new a();

            private a() {
            }

            public void a(int i10, StringBuilder sb2) {
                C17542s.j(sb2, "builder");
                sb2.append("(");
            }

            public void b(u0 u0Var, int i10, int i11, StringBuilder sb2) {
                C17542s.j(u0Var, "parameter");
                C17542s.j(sb2, "builder");
            }

            public void c(int i10, StringBuilder sb2) {
                C17542s.j(sb2, "builder");
                sb2.append(")");
            }

            public void d(u0 u0Var, int i10, int i11, StringBuilder sb2) {
                C17542s.j(u0Var, "parameter");
                C17542s.j(sb2, "builder");
                if (i10 != i11 - 1) {
                    sb2.append(", ");
                }
            }
        }

        void a(int i10, StringBuilder sb2);

        void b(u0 u0Var, int i10, int i11, StringBuilder sb2);

        void c(int i10, StringBuilder sb2);

        void d(u0 u0Var, int i10, int i11, StringBuilder sb2);
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f143173a = aVar;
        f143174b = aVar.b(C17232c.f143162a);
        f143175c = aVar.b(C17234e.f143164a);
        f143176d = aVar.b(C17235f.f143165a);
        f143177e = aVar.b(C17236g.f143166a);
        f143178f = aVar.b(C17237h.f143167a);
        f143179g = aVar.b(C17238i.f143168a);
        f143180h = aVar.b(C17239j.f143169a);
        f143181i = aVar.b(C17240k.f143170a);
        f143182j = aVar.b(C17241l.f143171a);
        f143183k = aVar.b(C17242m.f143172a);
        f143184l = aVar.b(C17233d.f143163a);
    }

    /* access modifiers changed from: private */
    public static final C16807N A(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.l(g0.d());
        return C16807N.f139792a;
    }

    public static /* synthetic */ String O(n nVar, C15644c cVar, C15646e eVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                eVar = null;
            }
            return nVar.N(cVar, eVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.c(false);
        wVar.l(g0.d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.c(false);
        wVar.l(g0.d());
        wVar.e(true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.l(g0.d());
        wVar.o(C17231b.C3491b.f143160a);
        wVar.g(C17226D.ONLY_NON_SYNTHESIZED);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.m(true);
        wVar.o(C17231b.a.f143159a);
        wVar.l(v.ALL);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.l(v.ALL_EXCEPT_ANNOTATIONS);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.l(v.ALL);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.a(C17228F.HTML);
        wVar.l(v.ALL);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.c(false);
        wVar.l(g0.d());
        wVar.o(C17231b.C3491b.f143160a);
        wVar.p(true);
        wVar.g(C17226D.NONE);
        wVar.f(true);
        wVar.n(true);
        wVar.e(true);
        wVar.b(true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(w wVar) {
        C17542s.j(wVar, "$this$withOptions");
        wVar.o(C17231b.C3491b.f143160a);
        wVar.g(C17226D.ONLY_NON_SYNTHESIZED);
        return C16807N.f139792a;
    }

    public abstract String M(C15566m mVar);

    public abstract String N(C15644c cVar, C15646e eVar);

    public abstract String P(String str, String str2, C15429j jVar);

    public abstract String Q(C17067d dVar);

    public abstract String R(C17069f fVar, boolean z10);

    public abstract String S(C18096U u10);

    public abstract String T(E0 e02);

    public final n U(C17642l<? super w, C16807N> lVar) {
        C17542s.j(lVar, "changeOptions");
        C17542s.h(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z s10 = ((u) this).K0().s();
        lVar.invoke(s10);
        s10.q0();
        return new u(s10);
    }
}
