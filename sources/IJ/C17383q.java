package iJ;

import AI.C15429j;
import DI.C15538I;
import DI.C15561h;
import DI.n0;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YH.C16877v;
import fI.C17221b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.G0;
import uJ.I0;
import uJ.Q0;
import uJ.u0;
import uJ.y0;
import vJ.g;

/* renamed from: iJ.q  reason: case insensitive filesystem */
public final class C17383q implements y0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f143511f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f143512a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C15538I f143513b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<C18096U> f143514c;

    /* renamed from: d  reason: collision with root package name */
    private final C18113f0 f143515d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f143516e;

    /* renamed from: iJ.q$a */
    public static final class a {

        /* renamed from: iJ.q$a$a  reason: collision with other inner class name */
        private enum C3504a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE;

            static {
                C3504a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        /* renamed from: iJ.q$a$b */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f143517a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    iJ.q$a$a[] r0 = iJ.C17383q.a.C3504a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    iJ.q$a$a r1 = iJ.C17383q.a.C3504a.COMMON_SUPER_TYPE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    iJ.q$a$a r1 = iJ.C17383q.a.C3504a.INTERSECTION_TYPE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f143517a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: iJ.C17383q.a.b.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C18113f0 a(Collection<? extends C18113f0> collection, C3504a aVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    a aVar2 = C17383q.f143511f;
                    next = aVar2.e((C18113f0) next, (C18113f0) it.next(), aVar);
                }
                return (C18113f0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final C18113f0 c(C17383q qVar, C17383q qVar2, C3504a aVar) {
            Set C02;
            int i10 = b.f143517a[aVar.ordinal()];
            if (i10 == 1) {
                C02 = C16877v.C0(qVar.k(), qVar2.k());
            } else if (i10 == 2) {
                C02 = C16877v.z1(qVar.k(), qVar2.k());
            } else {
                throw new t();
            }
            return C18099X.f(u0.f147932b.k(), new C17383q(qVar.f143512a, qVar.f143513b, C02, (DefaultConstructorMarker) null), false);
        }

        private final C18113f0 d(C17383q qVar, C18113f0 f0Var) {
            if (qVar.k().contains(f0Var)) {
                return f0Var;
            }
            return null;
        }

        private final C18113f0 e(C18113f0 f0Var, C18113f0 f0Var2, C3504a aVar) {
            if (f0Var == null || f0Var2 == null) {
                return null;
            }
            y0 N02 = f0Var.N0();
            y0 N03 = f0Var2.N0();
            boolean z10 = N02 instanceof C17383q;
            if (z10 && (N03 instanceof C17383q)) {
                return c((C17383q) N02, (C17383q) N03, aVar);
            }
            if (z10) {
                return d((C17383q) N02, f0Var2);
            }
            if (N03 instanceof C17383q) {
                return d((C17383q) N03, f0Var);
            }
            return null;
        }

        public final C18113f0 b(Collection<? extends C18113f0> collection) {
            C17542s.j(collection, "types");
            return a(collection, C3504a.INTERSECTION_TYPE);
        }

        private a() {
        }
    }

    public /* synthetic */ C17383q(long j10, C15538I i10, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, set);
    }

    private final List<C18096U> l() {
        return (List) this.f143516e.getValue();
    }

    private final boolean m() {
        Iterable<C18096U> a10 = C17389w.a(this.f143513b);
        if ((a10 instanceof Collection) && ((Collection) a10).isEmpty()) {
            return true;
        }
        for (C18096U contains : a10) {
            if (this.f143514c.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final List n(C17383q qVar) {
        C18113f0 r10 = qVar.p().y().r();
        C17542s.i(r10, "getDefaultType(...)");
        List t10 = C16877v.t(I0.f(r10, C16877v.e(new G0(Q0.IN_VARIANCE, qVar.f143515d)), (u0) null, 2, (Object) null));
        if (!qVar.m()) {
            t10.add(qVar.p().M());
        }
        return t10;
    }

    private final String o() {
        return '[' + C16877v.G0(this.f143514c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C17382p.f143510a, 30, (Object) null) + ']';
    }

    /* access modifiers changed from: private */
    public static final CharSequence q(C18096U u10) {
        C17542s.j(u10, "it");
        return u10.toString();
    }

    public Collection<C18096U> a() {
        return l();
    }

    public y0 b(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        return this;
    }

    public C15561h e() {
        return null;
    }

    public boolean f() {
        return false;
    }

    public List<n0> getParameters() {
        return C16877v.n();
    }

    public final Set<C18096U> k() {
        return this.f143514c;
    }

    public C15429j p() {
        return this.f143513b.p();
    }

    public String toString() {
        return "IntegerLiteralType" + o();
    }

    private C17383q(long j10, C15538I i10, Set<? extends C18096U> set) {
        this.f143515d = C18099X.f(u0.f147932b.k(), this, false);
        this.f143516e = C16825p.b(new C17381o(this));
        this.f143512a = j10;
        this.f143513b = i10;
        this.f143514c = set;
    }
}
