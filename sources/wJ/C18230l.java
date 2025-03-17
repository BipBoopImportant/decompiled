package wJ;

import DI.C15538I;
import DI.C15566m;
import DI.a0;
import YH.C16877v;
import YH.g0;
import cJ.C17069f;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.E0;
import uJ.y0;
import zJ.C18755d;

/* renamed from: wJ.l  reason: case insensitive filesystem */
public final class C18230l {

    /* renamed from: a  reason: collision with root package name */
    public static final C18230l f149170a = new C18230l();

    /* renamed from: b  reason: collision with root package name */
    private static final C15538I f149171b = C18223e.f149151a;

    /* renamed from: c  reason: collision with root package name */
    private static final C18219a f149172c;

    /* renamed from: d  reason: collision with root package name */
    private static final C18096U f149173d = d(C18229k.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e  reason: collision with root package name */
    private static final C18096U f149174e = d(C18229k.ERROR_PROPERTY_TYPE, new String[0]);

    /* renamed from: f  reason: collision with root package name */
    private static final a0 f149175f;

    /* renamed from: g  reason: collision with root package name */
    private static final Set<a0> f149176g;

    static {
        String format = String.format(C18220b.ERROR_CLASS.b(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C17542s.i(format, "format(...)");
        C17069f D10 = C17069f.D(format);
        C17542s.i(D10, "special(...)");
        f149172c = new C18219a(D10);
        C18224f fVar = new C18224f();
        f149175f = fVar;
        f149176g = g0.c(fVar);
    }

    private C18230l() {
    }

    public static final C18225g a(C18226h hVar, boolean z10, String... strArr) {
        C17542s.j(hVar, "kind");
        C17542s.j(strArr, "formatParams");
        return z10 ? new C18231m(hVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C18225g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C18225g b(C18226h hVar, String... strArr) {
        C17542s.j(hVar, "kind");
        C17542s.j(strArr, "formatParams");
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C18227i d(C18229k kVar, String... strArr) {
        C17542s.j(kVar, "kind");
        C17542s.j(strArr, "formatParams");
        return f149170a.g(kVar, C16877v.n(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean m(C15566m mVar) {
        if (mVar != null) {
            C18230l lVar = f149170a;
            if (lVar.n(mVar) || lVar.n(mVar.b()) || mVar == f149171b) {
                return true;
            }
        }
        return false;
    }

    private final boolean n(C15566m mVar) {
        return mVar instanceof C18219a;
    }

    public static final boolean o(C18096U u10) {
        if (u10 == null) {
            return false;
        }
        y0 N02 = u10.N0();
        return (N02 instanceof C18228j) && ((C18228j) N02).g() == C18229k.UNINFERRED_TYPE_VARIABLE;
    }

    public final C18227i c(C18229k kVar, y0 y0Var, String... strArr) {
        C17542s.j(kVar, "kind");
        C17542s.j(y0Var, "typeConstructor");
        C17542s.j(strArr, "formatParams");
        return f(kVar, C16877v.n(), y0Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C18228j e(C18229k kVar, String... strArr) {
        C17542s.j(kVar, "kind");
        C17542s.j(strArr, "formatParams");
        return new C18228j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C18227i f(C18229k kVar, List<? extends E0> list, y0 y0Var, String... strArr) {
        C17542s.j(kVar, "kind");
        C17542s.j(list, "arguments");
        C17542s.j(y0Var, "typeConstructor");
        C17542s.j(strArr, "formatParams");
        return new C18227i(y0Var, b(C18226h.ERROR_TYPE_SCOPE, y0Var.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C18227i g(C18229k kVar, List<? extends E0> list, String... strArr) {
        C17542s.j(kVar, "kind");
        C17542s.j(list, "arguments");
        C17542s.j(strArr, "formatParams");
        return f(kVar, list, e(kVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C18219a h() {
        return f149172c;
    }

    public final C15538I i() {
        return f149171b;
    }

    public final Set<a0> j() {
        return f149176g;
    }

    public final C18096U k() {
        return f149174e;
    }

    public final C18096U l() {
        return f149173d;
    }

    public final String p(C18096U u10) {
        C17542s.j(u10, "type");
        C18755d.z(u10);
        y0 N02 = u10.N0();
        C17542s.h(N02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((C18228j) N02).h(0);
    }
}
