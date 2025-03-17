package BI;

import DI.C15538I;
import DI.C15558e;
import FI.C15686b;
import HJ.C15854t;
import YH.g0;
import cJ.C17066c;
import cJ.C17069f;
import java.util.Collection;
import kotlin.jvm.internal.C17542s;
import tJ.C17994n;

/* renamed from: BI.a  reason: case insensitive filesystem */
public final class C15463a implements C15686b {

    /* renamed from: a  reason: collision with root package name */
    private final C17994n f133268a;

    /* renamed from: b  reason: collision with root package name */
    private final C15538I f133269b;

    public C15463a(C17994n nVar, C15538I i10) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(i10, "module");
        this.f133268a = nVar;
        this.f133269b = i10;
    }

    public boolean a(C17066c cVar, C17069f fVar) {
        C17542s.j(cVar, "packageFqName");
        C17542s.j(fVar, "name");
        String b10 = fVar.b();
        C17542s.i(b10, "asString(...)");
        return (C15854t.W(b10, "Function", false, 2, (Object) null) || C15854t.W(b10, "KFunction", false, 2, (Object) null) || C15854t.W(b10, "SuspendFunction", false, 2, (Object) null) || C15854t.W(b10, "KSuspendFunction", false, 2, (Object) null)) && g.f133291c.a().c(cVar, b10) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        r7 = r7.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DI.C15558e b(cJ.C17065b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            boolean r0 = r7.i()
            r1 = 0
            if (r0 != 0) goto L_0x0099
            boolean r0 = r7.j()
            if (r0 == 0) goto L_0x0014
            goto L_0x0099
        L_0x0014:
            cJ.c r0 = r7.g()
            java.lang.String r0 = r0.a()
            r2 = 0
            r3 = 2
            java.lang.String r4 = "Function"
            boolean r2 = HJ.C15854t.d0(r0, r4, r2, r3, r1)
            if (r2 != 0) goto L_0x0027
            return r1
        L_0x0027:
            cJ.c r7 = r7.f()
            BI.g$a r2 = BI.g.f133291c
            BI.g r2 = r2.a()
            BI.g$b r0 = r2.c(r7, r0)
            if (r0 != 0) goto L_0x0038
            return r1
        L_0x0038:
            BI.f r1 = r0.a()
            int r0 = r0.b()
            DI.I r2 = r6.f133269b
            DI.W r7 = r2.v0(r7)
            java.util.List r7 = r7.k0()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0055:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0067
            java.lang.Object r3 = r7.next()
            boolean r4 = r3 instanceof AI.C15422c
            if (r4 == 0) goto L_0x0055
            r2.add(r3)
            goto L_0x0055
        L_0x0067:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x0070:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0082
            java.lang.Object r4 = r3.next()
            boolean r5 = r4 instanceof AI.C15427h
            if (r5 == 0) goto L_0x0070
            r7.add(r4)
            goto L_0x0070
        L_0x0082:
            java.lang.Object r7 = YH.C16877v.y0(r7)
            AI.h r7 = (AI.C15427h) r7
            if (r7 == 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            java.lang.Object r7 = YH.C16877v.w0(r2)
            AI.c r7 = (AI.C15422c) r7
        L_0x0091:
            BI.b r2 = new BI.b
            tJ.n r3 = r6.f133268a
            r2.<init>(r3, r7, r1, r0)
            return r2
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: BI.C15463a.b(cJ.b):DI.e");
    }

    public Collection<C15558e> c(C17066c cVar) {
        C17542s.j(cVar, "packageFqName");
        return g0.d();
    }
}
