package a9;

import E8.c;
import F8.g;
import kotlin.jvm.internal.C17542s;

public final class P6 implements C6816e2 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42210a;

    /* renamed from: b  reason: collision with root package name */
    public final g f42211b;

    public P6(c cVar, g gVar) {
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(gVar, "deviceInfo");
        this.f42210a = cVar;
        this.f42211b = gVar;
    }

    public final int a() {
        return c().getType();
    }

    public final boolean b() {
        return !C17542s.e(c(), C6967x2.f42938a);
    }

    public final C6904p2 c() {
        c cVar = this.f42210a;
        C17542s.j(cVar, "preferencesStore");
        J2 j22 = new J2(cVar);
        c cVar2 = this.f42210a;
        g gVar = this.f42211b;
        C17542s.j(cVar2, "preferencesStore");
        C17542s.j(gVar, "deviceInfo");
        Q2 q22 = new Q2(cVar2, gVar);
        C17542s.j(j22, "<this>");
        C17542s.j(q22, "other");
        boolean a10 = j22.a();
        C6904p2 p2Var = j22;
        if (!a10) {
            p2Var = q22.a() ? q22 : C6967x2.f42938a;
        }
        c cVar3 = this.f42210a;
        C17542s.j(cVar3, "preferencesStore");
        C6793b3 b3Var = new C6793b3(cVar3);
        C17542s.j(p2Var, "<this>");
        C17542s.j(b3Var, "other");
        boolean a11 = p2Var.a();
        C6904p2 p2Var2 = p2Var;
        if (!a11) {
            p2Var2 = b3Var.a() ? b3Var : C6967x2.f42938a;
        }
        c cVar4 = this.f42210a;
        C17542s.j(cVar4, "preferencesStore");
        V2 v22 = new V2(cVar4);
        C17542s.j(p2Var2, "<this>");
        C17542s.j(v22, "other");
        return (!p2Var2.a() || !v22.a()) ? C6967x2.f42938a : p2Var2;
    }
}
