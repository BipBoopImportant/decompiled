package cJ;

import YH.C16877v;
import YH.X;
import YH.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

/* renamed from: cJ.i  reason: case insensitive filesystem */
public final class C17072i {

    /* renamed from: A  reason: collision with root package name */
    private static final C17065b f141280A;

    /* renamed from: A0  reason: collision with root package name */
    private static final C17065b f141281A0 = C17073j.m("MutableSet");

    /* renamed from: B  reason: collision with root package name */
    private static final C17065b f141282B;

    /* renamed from: B0  reason: collision with root package name */
    private static final C17065b f141283B0;

    /* renamed from: C  reason: collision with root package name */
    private static final C17065b f141284C;

    /* renamed from: C0  reason: collision with root package name */
    private static final C17065b f141285C0;

    /* renamed from: D  reason: collision with root package name */
    private static final C17065b f141286D;

    /* renamed from: D0  reason: collision with root package name */
    private static final C17065b f141287D0;

    /* renamed from: E  reason: collision with root package name */
    private static final C17065b f141288E;

    /* renamed from: E0  reason: collision with root package name */
    private static final C17065b f141289E0 = C17073j.l("Result");

    /* renamed from: F  reason: collision with root package name */
    private static final C17065b f141290F;

    /* renamed from: F0  reason: collision with root package name */
    private static final C17065b f141291F0 = C17073j.r("IntRange");

    /* renamed from: G  reason: collision with root package name */
    private static final C17065b f141292G;

    /* renamed from: G0  reason: collision with root package name */
    private static final C17065b f141293G0 = C17073j.r("LongRange");

    /* renamed from: H  reason: collision with root package name */
    private static final C17065b f141294H;

    /* renamed from: H0  reason: collision with root package name */
    private static final C17065b f141295H0 = C17073j.r("CharRange");

    /* renamed from: I  reason: collision with root package name */
    private static final C17065b f141296I;

    /* renamed from: I0  reason: collision with root package name */
    private static final C17065b f141297I0 = C17073j.k("AnnotationRetention");

    /* renamed from: J  reason: collision with root package name */
    private static final C17065b f141298J;

    /* renamed from: J0  reason: collision with root package name */
    private static final C17065b f141299J0 = C17073j.k("AnnotationTarget");

    /* renamed from: K  reason: collision with root package name */
    private static final C17065b f141300K;

    /* renamed from: K0  reason: collision with root package name */
    private static final C17065b f141301K0 = C17073j.l("DeprecationLevel");

    /* renamed from: L  reason: collision with root package name */
    private static final C17065b f141302L = C17073j.l("CharSequence");

    /* renamed from: L0  reason: collision with root package name */
    private static final C17065b f141303L0 = C17073j.o("EnumEntries");

    /* renamed from: M  reason: collision with root package name */
    private static final C17065b f141304M = C17073j.l("String");

    /* renamed from: M0  reason: collision with root package name */
    private static final Set<C17065b> f141305M0;

    /* renamed from: N  reason: collision with root package name */
    private static final C17065b f141306N = C17073j.l("Throwable");

    /* renamed from: O  reason: collision with root package name */
    private static final C17065b f141307O = C17073j.l("Cloneable");

    /* renamed from: P  reason: collision with root package name */
    private static final C17065b f141308P = C17073j.s("KProperty");

    /* renamed from: Q  reason: collision with root package name */
    private static final C17065b f141309Q = C17073j.s("KMutableProperty");

    /* renamed from: R  reason: collision with root package name */
    private static final C17065b f141310R = C17073j.s("KProperty0");

    /* renamed from: S  reason: collision with root package name */
    private static final C17065b f141311S = C17073j.s("KMutableProperty0");

    /* renamed from: T  reason: collision with root package name */
    private static final C17065b f141312T = C17073j.s("KProperty1");

    /* renamed from: U  reason: collision with root package name */
    private static final C17065b f141313U = C17073j.s("KMutableProperty1");

    /* renamed from: V  reason: collision with root package name */
    private static final C17065b f141314V = C17073j.s("KProperty2");

    /* renamed from: W  reason: collision with root package name */
    private static final C17065b f141315W = C17073j.s("KMutableProperty2");

    /* renamed from: X  reason: collision with root package name */
    private static final C17065b f141316X = C17073j.s("KFunction");

    /* renamed from: Y  reason: collision with root package name */
    private static final C17065b f141317Y = C17073j.s("KClass");

    /* renamed from: Z  reason: collision with root package name */
    private static final C17065b f141318Z = C17073j.s("KCallable");

    /* renamed from: a  reason: collision with root package name */
    public static final C17072i f141319a = new C17072i();

    /* renamed from: a0  reason: collision with root package name */
    private static final C17065b f141320a0 = C17073j.s("KType");

    /* renamed from: b  reason: collision with root package name */
    private static final C17066c f141321b;

    /* renamed from: b0  reason: collision with root package name */
    private static final C17065b f141322b0 = C17073j.l("Comparable");

    /* renamed from: c  reason: collision with root package name */
    private static final C17066c f141323c;

    /* renamed from: c0  reason: collision with root package name */
    private static final C17065b f141324c0 = C17073j.l("Number");

    /* renamed from: d  reason: collision with root package name */
    private static final C17066c f141325d;

    /* renamed from: d0  reason: collision with root package name */
    private static final C17065b f141326d0 = C17073j.l("Function");

    /* renamed from: e  reason: collision with root package name */
    private static final C17066c f141327e;

    /* renamed from: e0  reason: collision with root package name */
    private static final Set<C17065b> f141328e0;

    /* renamed from: f  reason: collision with root package name */
    private static final C17066c f141329f;

    /* renamed from: f0  reason: collision with root package name */
    private static final Set<C17065b> f141330f0;

    /* renamed from: g  reason: collision with root package name */
    private static final C17066c f141331g;

    /* renamed from: g0  reason: collision with root package name */
    private static final Map<C17065b, C17065b> f141332g0;

    /* renamed from: h  reason: collision with root package name */
    private static final C17066c f141333h;

    /* renamed from: h0  reason: collision with root package name */
    private static final Map<C17065b, C17065b> f141334h0;

    /* renamed from: i  reason: collision with root package name */
    private static final C17066c f141335i;

    /* renamed from: i0  reason: collision with root package name */
    private static final Set<C17065b> f141336i0;

    /* renamed from: j  reason: collision with root package name */
    private static final C17066c f141337j;

    /* renamed from: j0  reason: collision with root package name */
    private static final Map<C17065b, C17065b> f141338j0;

    /* renamed from: k  reason: collision with root package name */
    private static final C17066c f141339k;

    /* renamed from: k0  reason: collision with root package name */
    private static final Map<C17065b, C17065b> f141340k0;

    /* renamed from: l  reason: collision with root package name */
    private static final C17066c f141341l;

    /* renamed from: l0  reason: collision with root package name */
    private static final Set<C17065b> f141342l0;

    /* renamed from: m  reason: collision with root package name */
    private static final C17066c f141343m;

    /* renamed from: m0  reason: collision with root package name */
    private static final C17065b f141344m0 = C17073j.n("Continuation");

    /* renamed from: n  reason: collision with root package name */
    private static final C17066c f141345n;

    /* renamed from: n0  reason: collision with root package name */
    private static final C17065b f141346n0 = C17073j.m("Iterator");

    /* renamed from: o  reason: collision with root package name */
    private static final C17066c f141347o;

    /* renamed from: o0  reason: collision with root package name */
    private static final C17065b f141348o0 = C17073j.m("Iterable");

    /* renamed from: p  reason: collision with root package name */
    private static final C17066c f141349p;

    /* renamed from: p0  reason: collision with root package name */
    private static final C17065b f141350p0 = C17073j.m("Collection");

    /* renamed from: q  reason: collision with root package name */
    private static final C17066c f141351q;

    /* renamed from: q0  reason: collision with root package name */
    private static final C17065b f141352q0 = C17073j.m("List");

    /* renamed from: r  reason: collision with root package name */
    private static final Set<C17066c> f141353r;

    /* renamed from: r0  reason: collision with root package name */
    private static final C17065b f141354r0 = C17073j.m("ListIterator");

    /* renamed from: s  reason: collision with root package name */
    private static final Set<C17066c> f141355s;

    /* renamed from: s0  reason: collision with root package name */
    private static final C17065b f141356s0 = C17073j.m("Set");

    /* renamed from: t  reason: collision with root package name */
    private static final C17065b f141357t = C17073j.l("Nothing");

    /* renamed from: t0  reason: collision with root package name */
    private static final C17065b f141358t0;

    /* renamed from: u  reason: collision with root package name */
    private static final C17065b f141359u = C17073j.l("Unit");

    /* renamed from: u0  reason: collision with root package name */
    private static final C17065b f141360u0 = C17073j.m("MutableIterator");

    /* renamed from: v  reason: collision with root package name */
    private static final C17065b f141361v = C17073j.l("Any");

    /* renamed from: v0  reason: collision with root package name */
    private static final C17065b f141362v0 = C17073j.m("CharIterator");

    /* renamed from: w  reason: collision with root package name */
    private static final C17065b f141363w = C17073j.l("Enum");

    /* renamed from: w0  reason: collision with root package name */
    private static final C17065b f141364w0 = C17073j.m("MutableIterable");

    /* renamed from: x  reason: collision with root package name */
    private static final C17065b f141365x = C17073j.l("Annotation");

    /* renamed from: x0  reason: collision with root package name */
    private static final C17065b f141366x0 = C17073j.m("MutableCollection");

    /* renamed from: y  reason: collision with root package name */
    private static final C17065b f141367y = C17073j.l("Array");

    /* renamed from: y0  reason: collision with root package name */
    private static final C17065b f141368y0 = C17073j.m("MutableList");

    /* renamed from: z  reason: collision with root package name */
    private static final C17065b f141369z;

    /* renamed from: z0  reason: collision with root package name */
    private static final C17065b f141370z0 = C17073j.m("MutableListIterator");

    static {
        C17066c cVar = new C17066c("kotlin");
        f141321b = cVar;
        C17069f v10 = C17069f.v("reflect");
        C17542s.i(v10, "identifier(...)");
        C17066c b10 = cVar.b(v10);
        f141323c = b10;
        C17069f v11 = C17069f.v("collections");
        C17542s.i(v11, "identifier(...)");
        C17066c b11 = cVar.b(v11);
        f141325d = b11;
        C17069f v12 = C17069f.v("ranges");
        C17542s.i(v12, "identifier(...)");
        C17066c b12 = cVar.b(v12);
        f141327e = b12;
        C17069f v13 = C17069f.v("jvm");
        C17542s.i(v13, "identifier(...)");
        C17066c b13 = cVar.b(v13);
        f141329f = b13;
        C17069f v14 = C17069f.v("annotations");
        C17542s.i(v14, "identifier(...)");
        C17066c b14 = cVar.b(v14);
        C17069f v15 = C17069f.v("jvm");
        C17542s.i(v15, "identifier(...)");
        f141331g = b14.b(v15);
        C17069f v16 = C17069f.v("internal");
        C17542s.i(v16, "identifier(...)");
        f141333h = b13.b(v16);
        C17069f v17 = C17069f.v("functions");
        C17542s.i(v17, "identifier(...)");
        f141335i = b13.b(v17);
        C17069f v18 = C17069f.v("annotation");
        C17542s.i(v18, "identifier(...)");
        C17066c b15 = cVar.b(v18);
        f141337j = b15;
        C17069f v19 = C17069f.v("internal");
        C17542s.i(v19, "identifier(...)");
        C17066c b16 = cVar.b(v19);
        f141339k = b16;
        C17069f v20 = C17069f.v("ir");
        C17542s.i(v20, "identifier(...)");
        f141341l = b16.b(v20);
        C17069f v21 = C17069f.v("coroutines");
        C17542s.i(v21, "identifier(...)");
        C17066c b17 = cVar.b(v21);
        f141343m = b17;
        C17069f v22 = C17069f.v("enums");
        C17542s.i(v22, "identifier(...)");
        f141345n = cVar.b(v22);
        C17069f v23 = C17069f.v("contracts");
        C17542s.i(v23, "identifier(...)");
        f141347o = cVar.b(v23);
        C17069f v24 = C17069f.v("concurrent");
        C17542s.i(v24, "identifier(...)");
        f141349p = cVar.b(v24);
        C17069f v25 = C17069f.v("test");
        C17542s.i(v25, "identifier(...)");
        f141351q = cVar.b(v25);
        f141353r = g0.h(cVar, b11, b12, b15);
        f141355s = g0.h(cVar, b11, b12, b15, b10, b16, b17);
        C17065b b18 = C17073j.l("Boolean");
        f141369z = b18;
        C17065b b19 = C17073j.l("Char");
        f141280A = b19;
        C17065b b20 = C17073j.l("Byte");
        f141282B = b20;
        C17065b b21 = C17073j.l("Short");
        f141284C = b21;
        C17065b b22 = C17073j.l("Int");
        f141286D = b22;
        C17065b b23 = C17073j.l("Long");
        f141288E = b23;
        C17065b b24 = C17073j.l("Float");
        f141290F = b24;
        C17065b b25 = C17073j.l("Double");
        f141292G = b25;
        f141294H = C17073j.t(b20);
        f141296I = C17073j.t(b21);
        f141298J = C17073j.t(b22);
        f141300K = C17073j.t(b23);
        Set<C17065b> h10 = g0.h(b18, b19, b20, b21, b22, b23, b24, b25);
        f141328e0 = h10;
        f141330f0 = g0.h(b20, b21, b22, b23);
        Iterable iterable = h10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(next, C17073j.q(((C17065b) next).h()));
        }
        f141332g0 = linkedHashMap;
        f141334h0 = C17073j.p(linkedHashMap);
        Set<C17065b> h11 = g0.h(f141294H, f141296I, f141298J, f141300K);
        f141336i0 = h11;
        Iterable iterable2 = h11;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable2, 10)), 16));
        for (Object next2 : iterable2) {
            linkedHashMap2.put(next2, C17073j.q(((C17065b) next2).h()));
        }
        f141338j0 = linkedHashMap2;
        f141340k0 = C17073j.p(linkedHashMap2);
        Set<C17065b> set = f141328e0;
        Set<C17065b> set2 = f141336i0;
        Set<T> k10 = g0.k(set, set2);
        C17065b bVar = f141304M;
        f141342l0 = g0.l(k10, bVar);
        C17065b c10 = C17073j.m("Map");
        f141358t0 = c10;
        C17065b c11 = C17073j.m("MutableMap");
        f141283B0 = c11;
        C17069f v26 = C17069f.v("Entry");
        C17542s.i(v26, "identifier(...)");
        f141285C0 = c10.d(v26);
        C17069f v27 = C17069f.v("MutableEntry");
        C17542s.i(v27, "identifier(...)");
        f141287D0 = c11.d(v27);
        f141305M0 = g0.l(g0.l(g0.l(g0.l(g0.k(set, set2), bVar), f141359u), f141361v), f141363w);
    }

    private C17072i() {
    }

    public final C17065b a() {
        return f141367y;
    }

    public final C17066c b() {
        return f141337j;
    }

    public final C17066c c() {
        return f141325d;
    }

    public final C17066c d() {
        return f141343m;
    }

    public final C17066c e() {
        return f141345n;
    }

    public final C17066c f() {
        return f141321b;
    }

    public final C17066c g() {
        return f141327e;
    }

    public final C17066c h() {
        return f141323c;
    }

    public final C17065b i() {
        return f141303L0;
    }

    public final C17065b j() {
        return f141317Y;
    }

    public final C17065b k() {
        return f141316X;
    }

    public final C17065b l() {
        return f141368y0;
    }

    public final C17065b m() {
        return f141283B0;
    }

    public final C17065b n() {
        return f141281A0;
    }
}
