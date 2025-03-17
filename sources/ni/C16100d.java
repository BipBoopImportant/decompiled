package NI;

import AI.C15435p;
import EI.C15644c;
import MI.C16048I;
import PI.C16201k;
import QI.C16267j;
import TI.C16497a;
import TI.C16500d;
import XH.C16796C;
import YH.X;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

/* renamed from: NI.d  reason: case insensitive filesystem */
public final class C16100d {

    /* renamed from: a  reason: collision with root package name */
    public static final C16100d f136550a = new C16100d();

    /* renamed from: b  reason: collision with root package name */
    private static final C17069f f136551b;

    /* renamed from: c  reason: collision with root package name */
    private static final C17069f f136552c;

    /* renamed from: d  reason: collision with root package name */
    private static final C17069f f136553d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<C17066c, C17066c> f136554e = X.m(C16796C.a(C15435p.a.f133063H, C16048I.f136292d), C16796C.a(C15435p.a.f133071L, C16048I.f136294f), C16796C.a(C15435p.a.f133079P, C16048I.f136297i));

    static {
        C17069f v10 = C17069f.v("message");
        C17542s.i(v10, "identifier(...)");
        f136551b = v10;
        C17069f v11 = C17069f.v("allowedTargets");
        C17542s.i(v11, "identifier(...)");
        f136552c = v11;
        C17069f v12 = C17069f.v("value");
        C17542s.i(v12, "identifier(...)");
        f136553d = v12;
    }

    private C16100d() {
    }

    public static /* synthetic */ C15644c f(C16100d dVar, C16497a aVar, C16201k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.e(aVar, kVar, z10);
    }

    public final C15644c a(C17066c cVar, C16500d dVar, C16201k kVar) {
        C16497a v10;
        C17542s.j(cVar, "kotlinName");
        C17542s.j(dVar, "annotationOwner");
        C17542s.j(kVar, "c");
        if (C17542s.e(cVar, C15435p.a.f133138y)) {
            C17066c cVar2 = C16048I.f136296h;
            C17542s.i(cVar2, "DEPRECATED_ANNOTATION");
            C16497a v11 = dVar.v(cVar2);
            if (v11 != null || dVar.E()) {
                return new C16104h(v11, kVar);
            }
        }
        C17066c cVar3 = f136554e.get(cVar);
        if (cVar3 == null || (v10 = dVar.v(cVar3)) == null) {
            return null;
        }
        return f(f136550a, v10, kVar, false, 4, (Object) null);
    }

    public final C17069f b() {
        return f136551b;
    }

    public final C17069f c() {
        return f136553d;
    }

    public final C17069f d() {
        return f136552c;
    }

    public final C15644c e(C16497a aVar, C16201k kVar, boolean z10) {
        C17542s.j(aVar, "annotation");
        C17542s.j(kVar, "c");
        C17065b k10 = aVar.k();
        C17065b.a aVar2 = C17065b.f141241d;
        C17066c cVar = C16048I.f136292d;
        C17542s.i(cVar, "TARGET_ANNOTATION");
        if (C17542s.e(k10, aVar2.c(cVar))) {
            return new n(aVar, kVar);
        }
        C17066c cVar2 = C16048I.f136294f;
        C17542s.i(cVar2, "RETENTION_ANNOTATION");
        if (C17542s.e(k10, aVar2.c(cVar2))) {
            return new l(aVar, kVar);
        }
        C17066c cVar3 = C16048I.f136297i;
        C17542s.i(cVar3, "DOCUMENTED_ANNOTATION");
        if (C17542s.e(k10, aVar2.c(cVar3))) {
            return new C16099c(kVar, aVar, C15435p.a.f133079P);
        }
        C17066c cVar4 = C16048I.f136296h;
        C17542s.i(cVar4, "DEPRECATED_ANNOTATION");
        if (C17542s.e(k10, aVar2.c(cVar4))) {
            return null;
        }
        return new C16267j(kVar, aVar, z10);
    }
}
