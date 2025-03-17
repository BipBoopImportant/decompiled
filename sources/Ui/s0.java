package UI;

import CI.C15497d;
import DI.C15558e;
import DI.C15561h;
import EI.C15649h;
import EI.C15656o;
import MI.C16048I;
import YH.C16877v;
import cJ.C17066c;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import vJ.u;

public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final C15649h f139072a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C16585f f139073b;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f139074a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                UI.k[] r0 = UI.C16590k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                UI.k r1 = UI.C16590k.NULLABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                UI.k r1 = UI.C16590k.NOT_NULL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f139074a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: UI.s0.a.<clinit>():void");
        }
    }

    static {
        C17066c cVar = C16048I.f136310v;
        C17542s.i(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        f139072a = new C16585f(cVar);
        C17066c cVar2 = C16048I.f136311w;
        C17542s.i(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f139073b = new C16585f(cVar2);
    }

    /* access modifiers changed from: private */
    public static final C15649h e(List<? extends C15649h> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new C15656o((List<? extends C15649h>) C16877v.t1(list)) : (C15649h) C16877v.b1(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* access modifiers changed from: private */
    public static final C15561h f(C15561h hVar, C16587h hVar2, p0 p0Var) {
        C15497d dVar = C15497d.f133512a;
        if (!q0.a(p0Var) || !(hVar instanceof C15558e)) {
            return null;
        }
        if (hVar2.e() == C16588i.READ_ONLY && p0Var == p0.FLEXIBLE_LOWER) {
            C15558e eVar = (C15558e) hVar;
            if (dVar.c(eVar)) {
                return dVar.a(eVar);
            }
        }
        if (hVar2.e() != C16588i.MUTABLE || p0Var != p0.FLEXIBLE_UPPER) {
            return null;
        }
        C15558e eVar2 = (C15558e) hVar;
        if (dVar.d(eVar2)) {
            return dVar.b(eVar2);
        }
        return null;
    }

    public static final C15649h g() {
        return f139072a;
    }

    /* access modifiers changed from: private */
    public static final Boolean h(C16587h hVar, p0 p0Var) {
        if (!q0.a(p0Var)) {
            return null;
        }
        C16590k f10 = hVar.f();
        int i10 = f10 == null ? -1 : a.f139074a[f10.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(C18096U u10) {
        C17542s.j(u10, "<this>");
        return t0.c(u.f149076a, u10);
    }
}
