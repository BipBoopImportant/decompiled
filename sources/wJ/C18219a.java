package wJ;

import DI.C15558e;
import GI.C15741k;
import kotlin.jvm.internal.C17542s;
import nJ.C17656k;
import uJ.H0;
import uJ.J0;
import vJ.g;

/* renamed from: wJ.a  reason: case insensitive filesystem */
public final class C18219a extends C15741k {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18219a(cJ.C17069f r13) {
        /*
            r12 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            wJ.l r0 = wJ.C18230l.f149170a
            DI.I r2 = r0.i()
            DI.F r4 = DI.C15535F.OPEN
            DI.f r5 = DI.C15559f.CLASS
            java.util.List r1 = YH.C16877v.n()
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6
            DI.i0 r10 = DI.i0.f133841a
            r8 = 0
            tJ.n r9 = tJ.C17986f.f147352e
            r1 = r12
            r3 = r13
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            EI.h$a r13 = EI.C15649h.f134231V
            EI.h r13 = r13.b()
            r1 = 1
            GI.i r13 = GI.C15739i.n1(r12, r13, r1, r10)
            java.util.List r1 = YH.C16877v.n()
            DI.u r2 = DI.C15573t.f133852d
            r13.q1(r1, r2)
            java.lang.String r1 = "apply(...)"
            kotlin.jvm.internal.C17542s.i(r13, r1)
            wJ.h r1 = wJ.C18226h.SCOPE_FOR_ERROR_CLASS
            cJ.f r2 = r13.getName()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = ""
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            wJ.g r1 = wJ.C18230l.b(r1, r2)
            wJ.i r2 = new wJ.i
            wJ.k r6 = wJ.C18229k.ERROR_CLASS
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            wJ.j r4 = r0.e(r6, r4)
            java.lang.String[] r9 = new java.lang.String[r3]
            r10 = 24
            r11 = 0
            r7 = 0
            r3 = r2
            r5 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r13.g1(r2)
            java.util.Set r0 = YH.g0.c(r13)
            r12.K0(r1, r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wJ.C18219a.<init>(cJ.f):void");
    }

    /* renamed from: H0 */
    public C15558e c(J0 j02) {
        C17542s.j(j02, "substitutor");
        return this;
    }

    public C17656k S(H0 h02, g gVar) {
        C17542s.j(h02, "typeSubstitution");
        C17542s.j(gVar, "kotlinTypeRefiner");
        return C18230l.b(C18226h.SCOPE_FOR_ERROR_CLASS, getName().toString(), h02.toString());
    }

    public String toString() {
        String b10 = getName().b();
        C17542s.i(b10, "asString(...)");
        return b10;
    }
}
