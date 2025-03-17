package UI;

import UI.n0;
import VI.C16664F;
import XH.C16807N;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lJ.C17558e;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final C16587h f139022a = new C16587h(C16590k.NULLABLE, (C16588i) null, false, false, 8, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final C16587h f139023b;

    /* renamed from: c  reason: collision with root package name */
    private static final C16587h f139024c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, g0> f139025d;

    static {
        C16590k kVar = C16590k.NOT_NULL;
        f139023b = new C16587h(kVar, (C16588i) null, false, false, 8, (DefaultConstructorMarker) null);
        f139024c = new C16587h(kVar, (C16588i) null, true, false, 8, (DefaultConstructorMarker) null);
        C16664F f10 = C16664F.f139318a;
        String h10 = f10.h("Object");
        String g10 = f10.g("Predicate");
        String g11 = f10.g("Function");
        String g12 = f10.g("Consumer");
        String g13 = f10.g("BiFunction");
        String g14 = f10.g("BiConsumer");
        String g15 = f10.g("UnaryOperator");
        String i10 = f10.i("stream/Stream");
        String i11 = f10.i("Optional");
        n0 n0Var = new n0();
        n0.a.b(new n0.a(n0Var, f10.i("Iterator")), "forEachRemaining", (String) null, new C16592m(g12), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, f10.h("Iterable")), "spliterator", (String) null, new C16602x(f10), 2, (Object) null);
        n0.a aVar = new n0.a(n0Var, f10.i("Collection"));
        n0.a.b(aVar, "removeIf", (String) null, new C16579I(g10), 2, (Object) null);
        n0.a aVar2 = aVar;
        n0.a.b(aVar2, "stream", (String) null, new U(i10), 2, (Object) null);
        n0.a.b(aVar2, "parallelStream", (String) null, new Z(i10), 2, (Object) null);
        n0.a aVar3 = new n0.a(n0Var, f10.i("List"));
        n0.a aVar4 = aVar3;
        n0.a.b(aVar3, "replaceAll", (String) null, new a0(g15), 2, (Object) null);
        aVar4.a("addFirst", "2.1", new b0(h10));
        aVar4.a("addLast", "2.1", new c0(h10));
        aVar4.a("removeFirst", "2.1", new d0(h10));
        aVar4.a("removeLast", "2.1", new e0(h10));
        n0.a aVar5 = new n0.a(n0Var, f10.i("LinkedList"));
        aVar5.a("addFirst", "2.1", new C16593n(h10));
        aVar5.a("addLast", "2.1", new C16594o(h10));
        aVar5.a("removeFirst", "2.1", new C16595p(h10));
        aVar5.a("removeLast", "2.1", new C16596q(h10));
        n0.a aVar6 = new n0.a(n0Var, f10.i("LinkedHashSet"));
        aVar6.a("addFirst", "2.2", new r(h10));
        aVar6.a("addLast", "2.2", new C16597s(h10));
        aVar6.a("removeFirst", "2.2", new C16598t(h10));
        aVar6.a("removeLast", "2.2", new C16599u(h10));
        aVar6.a("getFirst", "2.2", new C16600v(h10));
        aVar6.a("getLast", "2.2", new C16601w(h10));
        n0.a aVar7 = new n0.a(n0Var, f10.i("Map"));
        n0.a.b(aVar7, "forEach", (String) null, new C16603y(g14), 2, (Object) null);
        n0.a.b(aVar7, "putIfAbsent", (String) null, new C16604z(h10), 2, (Object) null);
        n0.a.b(aVar7, "replace", (String) null, new C16571A(h10), 2, (Object) null);
        n0.a.b(aVar7, "replace", (String) null, new C16572B(h10), 2, (Object) null);
        n0.a.b(aVar7, "replaceAll", (String) null, new C16573C(g13), 2, (Object) null);
        n0.a.b(aVar7, "compute", (String) null, new C16574D(h10, g13), 2, (Object) null);
        n0.a.b(aVar7, "computeIfAbsent", (String) null, new C16575E(h10, g11), 2, (Object) null);
        n0.a.b(aVar7, "computeIfPresent", (String) null, new C16576F(h10, g13), 2, (Object) null);
        n0.a.b(aVar7, "merge", (String) null, new C16577G(h10, g13), 2, (Object) null);
        n0.a aVar8 = new n0.a(n0Var, f10.i("LinkedHashMap"));
        aVar8.a("putFirst", "2.2", new C16578H(h10));
        aVar8.a("putLast", "2.2", new J(h10));
        n0.a aVar9 = new n0.a(n0Var, i11);
        n0.a.b(aVar9, "empty", (String) null, new K(i11), 2, (Object) null);
        n0.a.b(aVar9, "of", (String) null, new L(h10, i11), 2, (Object) null);
        n0.a.b(aVar9, "ofNullable", (String) null, new M(h10, i11), 2, (Object) null);
        n0.a.b(aVar9, "get", (String) null, new N(h10), 2, (Object) null);
        n0.a.b(aVar9, "ifPresent", (String) null, new O(g12), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, f10.h("ref/Reference")), "get", (String) null, new P(h10), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, g10), "test", (String) null, new Q(h10), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, f10.g("BiPredicate")), "test", (String) null, new S(h10), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, g12), "accept", (String) null, new T(h10), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, g14), "accept", (String) null, new V(h10), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, g11), "apply", (String) null, new W(h10), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, g13), "apply", (String) null, new X(h10), 2, (Object) null);
        n0.a.b(new n0.a(n0Var, f10.g("Supplier")), "get", (String) null, new Y(h10), 2, (Object) null);
        f139025d = n0Var.b();
    }

    /* access modifiers changed from: private */
    public static final C16807N A(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, f139022a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, f139022a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b, f139024c);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(String str, String str2, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139024c;
        aVar.b(str, hVar);
        aVar.c(str2, f139023b, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(String str, String str2, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139022a);
        aVar.c(str2, f139023b, f139024c);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139024c);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b, f139024c);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139022a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        aVar.d(C17558e.BOOLEAN);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.d(C17558e.BOOLEAN);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        return C16807N.f139792a;
    }

    public static final Map<String, g0> K0() {
        return f139025d;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.c(str, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar, hVar);
        aVar.d(C17558e.BOOLEAN);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.c(str, hVar, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.c(str, hVar, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.b(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        aVar.c(str, f139023b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C16664F f10, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        String i10 = f10.i("Spliterator");
        C16587h hVar = f139023b;
        aVar.c(i10, hVar, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar, hVar, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, f139022a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.c(str, f139022a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.b(str, hVar);
        aVar.d(C17558e.BOOLEAN);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(String str, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar, hVar, hVar, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(String str, String str2, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        C16587h hVar2 = f139022a;
        aVar.b(str2, hVar, hVar, hVar2, hVar2);
        aVar.c(str, hVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(String str, String str2, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        aVar.b(str2, hVar, hVar, hVar);
        aVar.c(str, hVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(String str, String str2, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        C16587h hVar2 = f139024c;
        C16587h hVar3 = f139022a;
        aVar.b(str2, hVar, hVar, hVar2, hVar3);
        aVar.c(str, hVar3);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(String str, String str2, n0.a.C3401a aVar) {
        C17542s.j(aVar, "$this$function");
        C16587h hVar = f139023b;
        aVar.b(str, hVar);
        C16587h hVar2 = f139024c;
        aVar.b(str, hVar2);
        C16587h hVar3 = f139022a;
        aVar.b(str2, hVar, hVar2, hVar2, hVar3);
        aVar.c(str, hVar3);
        return C16807N.f139792a;
    }
}
