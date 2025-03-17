package iJ;

import AI.C15429j;
import AI.C15435p;
import DI.C15538I;
import DI.C15558e;
import DI.C15561h;
import DI.C15578y;
import DI.n0;
import XH.t;
import YH.C16877v;
import cJ.C17065b;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18100Y;
import uJ.C18113f0;
import uJ.E0;
import uJ.G0;
import uJ.Q0;
import uJ.u0;
import wJ.C18229k;
import wJ.C18230l;
import zJ.C18755d;

/* renamed from: iJ.t  reason: case insensitive filesystem */
public final class C17386t extends C17373g<b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f143521b = new a((DefaultConstructorMarker) null);

    /* renamed from: iJ.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17373g<?> a(C18096U u10) {
            C17542s.j(u10, "argumentType");
            if (C18100Y.a(u10)) {
                return null;
            }
            C18096U u11 = u10;
            int i10 = 0;
            while (C15429j.d0(u11)) {
                u11 = ((E0) C16877v.b1(u11.L0())).getType();
                i10++;
            }
            C15561h e10 = u11.N0().e();
            if (e10 instanceof C15558e) {
                C17065b n10 = C17506e.n(e10);
                return n10 == null ? new C17386t((b) new b.a(u10)) : new C17386t(n10, i10);
            } else if (e10 instanceof n0) {
                return new C17386t(C17065b.f141241d.c(C15435p.a.f133092b.m()), 0);
            } else {
                return null;
            }
        }

        private a() {
        }
    }

    /* renamed from: iJ.t$b */
    public static abstract class b {

        /* renamed from: iJ.t$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C18096U f143522a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C18096U u10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(u10, "type");
                this.f143522a = u10;
            }

            public final C18096U a() {
                return this.f143522a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f143522a, ((a) obj).f143522a);
            }

            public int hashCode() {
                return this.f143522a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f143522a + ')';
            }
        }

        /* renamed from: iJ.t$b$b  reason: collision with other inner class name */
        public static final class C3505b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C17372f f143523a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3505b(C17372f fVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(fVar, "value");
                this.f143523a = fVar;
            }

            public final int a() {
                return this.f143523a.c();
            }

            public final C17065b b() {
                return this.f143523a.d();
            }

            public final C17372f c() {
                return this.f143523a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3505b) && C17542s.e(this.f143523a, ((C3505b) obj).f143523a);
            }

            public int hashCode() {
                return this.f143523a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f143523a + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17386t(b bVar) {
        super(bVar);
        C17542s.j(bVar, "value");
    }

    public C18096U a(C15538I i10) {
        C17542s.j(i10, "module");
        u0 k10 = u0.f147932b.k();
        C15558e F10 = i10.p().F();
        C17542s.i(F10, "getKClass(...)");
        return C18099X.h(k10, F10, C16877v.e(new G0(c(i10))));
    }

    public final C18096U c(C15538I i10) {
        C17542s.j(i10, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (bVar instanceof b.C3505b) {
            C17372f c10 = ((b.C3505b) b()).c();
            C17065b a10 = c10.a();
            int b10 = c10.b();
            C15558e b11 = C15578y.b(i10, a10);
            if (b11 == null) {
                return C18230l.d(C18229k.UNRESOLVED_KCLASS_CONSTANT_VALUE, a10.toString(), String.valueOf(b10));
            }
            C18113f0 r10 = b11.r();
            C17542s.i(r10, "getDefaultType(...)");
            C18096U D10 = C18755d.D(r10);
            for (int i11 = 0; i11 < b10; i11++) {
                D10 = i10.p().m(Q0.INVARIANT, D10);
            }
            return D10;
        }
        throw new t();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17386t(C17372f fVar) {
        this((b) new b.C3505b(fVar));
        C17542s.j(fVar, "value");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17386t(C17065b bVar, int i10) {
        this(new C17372f(bVar, i10));
        C17542s.j(bVar, "classId");
    }
}
