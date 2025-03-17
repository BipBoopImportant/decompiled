package NI;

import AI.C15435p;
import EI.C15658q;
import EI.C15659r;
import TI.C16498b;
import TI.m;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import YH.g0;
import cJ.C17065b;
import cJ.C17069f;
import iJ.C17368b;
import iJ.C17373g;
import iJ.C17377k;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C17542s;

/* renamed from: NI.f  reason: case insensitive filesystem */
public final class C16102f {

    /* renamed from: a  reason: collision with root package name */
    public static final C16102f f136556a = new C16102f();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, EnumSet<C15659r>> f136557b = X.m(C16796C.a("PACKAGE", EnumSet.noneOf(C15659r.class)), C16796C.a("TYPE", EnumSet.of(C15659r.CLASS, C15659r.FILE)), C16796C.a("ANNOTATION_TYPE", EnumSet.of(C15659r.ANNOTATION_CLASS)), C16796C.a("TYPE_PARAMETER", EnumSet.of(C15659r.TYPE_PARAMETER)), C16796C.a("FIELD", EnumSet.of(C15659r.FIELD)), C16796C.a("LOCAL_VARIABLE", EnumSet.of(C15659r.LOCAL_VARIABLE)), C16796C.a("PARAMETER", EnumSet.of(C15659r.VALUE_PARAMETER)), C16796C.a("CONSTRUCTOR", EnumSet.of(C15659r.CONSTRUCTOR)), C16796C.a("METHOD", EnumSet.of(C15659r.FUNCTION, C15659r.PROPERTY_GETTER, C15659r.PROPERTY_SETTER)), C16796C.a("TYPE_USE", EnumSet.of(C15659r.TYPE)));

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, C15658q> f136558c = X.m(C16796C.a("RUNTIME", C15658q.RUNTIME), C16796C.a("CLASS", C15658q.BINARY), C16796C.a("SOURCE", C15658q.SOURCE));

    private C16102f() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
        r2 = r2.getType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final uJ.C18096U e(DI.C15538I r2) {
        /*
            java.lang.String r0 = "module"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            NI.d r0 = NI.C16100d.f136550a
            cJ.f r0 = r0.d()
            AI.j r2 = r2.p()
            cJ.c r1 = AI.C15435p.a.f133063H
            DI.e r2 = r2.p(r1)
            DI.u0 r2 = NI.C16097a.b(r0, r2)
            if (r2 == 0) goto L_0x0021
            uJ.U r2 = r2.getType()
            if (r2 != 0) goto L_0x002a
        L_0x0021:
            wJ.k r2 = wJ.C18229k.UNMAPPED_ANNOTATION_TARGET_TYPE
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            wJ.i r2 = wJ.C18230l.d(r2, r0)
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: NI.C16102f.e(DI.I):uJ.U");
    }

    public final C17373g<?> b(C16498b bVar) {
        m mVar = bVar instanceof m ? (m) bVar : null;
        if (mVar == null) {
            return null;
        }
        Map<String, C15658q> map = f136558c;
        C17069f e10 = mVar.e();
        C15658q qVar = map.get(e10 != null ? e10.b() : null);
        if (qVar == null) {
            return null;
        }
        C17065b c10 = C17065b.f141241d.c(C15435p.a.f133069K);
        C17069f v10 = C17069f.v(qVar.name());
        C17542s.i(v10, "identifier(...)");
        return new C17377k(c10, v10);
    }

    public final Set<C15659r> c(String str) {
        EnumSet enumSet = f136557b.get(str);
        return enumSet != null ? enumSet : g0.d();
    }

    public final C17373g<?> d(List<? extends C16498b> list) {
        C17542s.j(list, "arguments");
        ArrayList<m> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (next instanceof m) {
                arrayList.add(next);
            }
        }
        ArrayList<C15659r> arrayList2 = new ArrayList<>();
        for (m e10 : arrayList) {
            C16102f fVar = f136556a;
            C17069f e11 = e10.e();
            C16877v.E(arrayList2, fVar.c(e11 != null ? e11.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList2, 10));
        for (C15659r name : arrayList2) {
            C17065b c10 = C17065b.f141241d.c(C15435p.a.f133067J);
            C17069f v10 = C17069f.v(name.name());
            C17542s.i(v10, "identifier(...)");
            arrayList3.add(new C17377k(c10, v10));
        }
        return new C17368b(arrayList3, C16101e.f136555a);
    }
}
