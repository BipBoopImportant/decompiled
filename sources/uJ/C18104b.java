package uJ;

import AI.C15429j;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import EJ.C15670k;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kJ.C17506e;
import tJ.C17994n;

/* renamed from: uJ.b  reason: case insensitive filesystem */
public abstract class C18104b extends C18134q {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18104b(C17994n nVar) {
        super(nVar);
        if (nVar == null) {
            I(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void I(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = r1
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uJ.C18104b.I(int):void");
    }

    public abstract C15558e J();

    /* access modifiers changed from: protected */
    public boolean i(C15561h hVar) {
        if (hVar == null) {
            I(2);
        }
        return (hVar instanceof C15558e) && g(J(), hVar);
    }

    public C15429j p() {
        C15429j m10 = C17506e.m(J());
        if (m10 == null) {
            I(1);
        }
        return m10;
    }

    /* access modifiers changed from: protected */
    public C18096U t() {
        if (C15429j.v0(J())) {
            return null;
        }
        return p().i();
    }

    /* access modifiers changed from: protected */
    public Collection<C18096U> u(boolean z10) {
        C15566m b10 = J().b();
        if (!(b10 instanceof C15558e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                I(3);
            }
            return emptyList;
        }
        C15670k kVar = new C15670k();
        C15558e eVar = (C15558e) b10;
        kVar.add(eVar.r());
        C15558e p02 = eVar.p0();
        if (z10 && p02 != null) {
            kVar.add(p02.r());
        }
        return kVar;
    }
}
