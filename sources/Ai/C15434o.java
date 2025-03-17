package AI;

import AI.C15435p;
import CJ.C15519a;
import DI.C15538I;
import DI.C15543N;
import DI.C15558e;
import DI.C15561h;
import DI.C15578y;
import DI.n0;
import LI.d;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17069f;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nJ.C17656k;
import uI.C18064m;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18127m0;
import uJ.u0;

/* renamed from: AI.o  reason: case insensitive filesystem */
public final class C15434o {

    /* renamed from: k  reason: collision with root package name */
    public static final b f133002k = new b((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f133003l;

    /* renamed from: a  reason: collision with root package name */
    private final C15543N f133004a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f133005b;

    /* renamed from: c  reason: collision with root package name */
    private final a f133006c = new a(1);

    /* renamed from: d  reason: collision with root package name */
    private final a f133007d = new a(1);

    /* renamed from: e  reason: collision with root package name */
    private final a f133008e = new a(1);

    /* renamed from: f  reason: collision with root package name */
    private final a f133009f = new a(2);

    /* renamed from: g  reason: collision with root package name */
    private final a f133010g = new a(3);

    /* renamed from: h  reason: collision with root package name */
    private final a f133011h = new a(1);

    /* renamed from: i  reason: collision with root package name */
    private final a f133012i = new a(2);

    /* renamed from: j  reason: collision with root package name */
    private final a f133013j = new a(3);

    /* renamed from: AI.o$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f133014a;

        public a(int i10) {
            this.f133014a = i10;
        }

        public final C15558e a(C15434o oVar, C18064m<?> mVar) {
            C17542s.j(oVar, "types");
            C17542s.j(mVar, "property");
            return oVar.c(C15519a.a(mVar.getName()), this.f133014a);
        }
    }

    /* renamed from: AI.o$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C18096U a(C15538I i10) {
            C17542s.j(i10, "module");
            C15558e b10 = C15578y.b(i10, C15435p.a.f133135w0);
            if (b10 == null) {
                return null;
            }
            u0 k10 = u0.f147932b.k();
            List<n0> parameters = b10.k().getParameters();
            C17542s.i(parameters, "getParameters(...)");
            Object b12 = C16877v.b1(parameters);
            C17542s.i(b12, "single(...)");
            return C18099X.h(k10, b10, C16877v.e(new C18127m0((n0) b12)));
        }

        private b() {
        }
    }

    static {
        Class<C15434o> cls = C15434o.class;
        f133003l = new C18064m[]{P.h(new G(cls, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};
    }

    public C15434o(C15538I i10, C15543N n10) {
        C17542s.j(i10, "module");
        C17542s.j(n10, "notFoundClasses");
        this.f133004a = n10;
        this.f133005b = C16825p.a(s.PUBLICATION, new C15433n(i10));
    }

    /* access modifiers changed from: private */
    public final C15558e c(String str, int i10) {
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        C15561h e10 = e().e(v10, d.FROM_REFLECTION);
        C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
        return eVar == null ? this.f133004a.d(new C17065b(C15435p.f133046x, v10), C16877v.e(Integer.valueOf(i10))) : eVar;
    }

    private final C17656k e() {
        return (C17656k) this.f133005b.getValue();
    }

    /* access modifiers changed from: private */
    public static final C17656k f(C15538I i10) {
        return i10.v0(C15435p.f133046x).q();
    }

    public final C15558e d() {
        return this.f133006c.a(this, f133003l[0]);
    }
}
