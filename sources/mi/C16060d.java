package MI;

import DI.C15558e;
import EI.C15644c;
import YH.C16877v;
import cJ.C17066c;
import cJ.C17069f;
import iJ.C17368b;
import iJ.C17373g;
import iJ.C17377k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.d  reason: case insensitive filesystem */
public final class C16060d extends C16058b<C15644c> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16060d(C16043D d10) {
        super(d10);
        C17542s.j(d10, "javaTypeEnhancementState");
    }

    private final List<String> B(C17373g<?> gVar) {
        if (!(gVar instanceof C17368b)) {
            return gVar instanceof C17377k ? C16877v.e(((C17377k) gVar).c().m()) : C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        for (C17373g B10 : (Iterable) ((C17368b) gVar).b()) {
            C16877v.E(arrayList, B(B10));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.getAnnotations();
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Iterable<EI.C15644c> m(EI.C15644c r2) {
        /*
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            DI.e r2 = kJ.C17506e.l(r2)
            if (r2 == 0) goto L_0x0012
            EI.h r2 = r2.getAnnotations()
            if (r2 == 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            java.util.List r2 = YH.C16877v.n()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: MI.C16060d.m(EI.c):java.lang.Iterable");
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Iterable<String> c(C15644c cVar, boolean z10) {
        C17542s.j(cVar, "<this>");
        Map<C17069f, C17373g<?>> a10 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : a10.entrySet()) {
            C16877v.E(arrayList, (!z10 || C17542s.e((C17069f) next.getKey(), C16048I.f136291c)) ? B((C17373g) next.getValue()) : C16877v.n());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C17066c k(C15644c cVar) {
        C17542s.j(cVar, "<this>");
        return cVar.f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Object l(C15644c cVar) {
        C17542s.j(cVar, "<this>");
        C15558e l10 = C17506e.l(cVar);
        C17542s.g(l10);
        return l10;
    }
}
