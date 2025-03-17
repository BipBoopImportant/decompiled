package androidx.compose.foundation.layout;

import E1.I;
import c2.C5267b;
import c2.c;
import i1.C5437c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Li1/c$b;", "horizontalAlignment", "LE1/I;", "a", "(Landroidx/compose/foundation/layout/d$m;Li1/c$b;LU0/m;I)LE1/I;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "Lc2/b;", "b", "(ZIIII)J", "LE1/I;", "getDefaultColumnMeasurePolicy", "()LE1/I;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.k  reason: case insensitive filesystem */
public final class C5080k {

    /* renamed from: a  reason: collision with root package name */
    private static final I f18127a = new C5081l(C5073d.f18068a.g(), C5437c.f24302a.k());

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: E1.I} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final E1.I a(androidx.compose.foundation.layout.C5073d.m r5, i1.C5437c.b r6, U0.C4889m r7, int r8) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)"
            r2 = 1089876336(0x40f63170, float:7.693535)
            U0.C4895p.S(r2, r8, r0, r1)
        L_0x000f:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r5, r0)
            if (r0 == 0) goto L_0x0033
            i1.c$a r0 = i1.C5437c.f24302a
            i1.c$b r0 = r0.k()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r6, r0)
            if (r0 == 0) goto L_0x0033
            r5 = 345962472(0x149ef7e8, float:1.6051705E-26)
            r7.W(r5)
            r7.P()
            E1.I r5 = f18127a
            goto L_0x0080
        L_0x0033:
            r0 = 346016319(0x149fca3f, float:1.6134669E-26)
            r7.W(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 <= r3) goto L_0x0048
            boolean r0 = r7.V(r5)
            if (r0 != 0) goto L_0x004c
        L_0x0048:
            r0 = r8 & 6
            if (r0 != r3) goto L_0x004e
        L_0x004c:
            r0 = r2
            goto L_0x004f
        L_0x004e:
            r0 = r1
        L_0x004f:
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x005d
            boolean r3 = r7.V(r6)
            if (r3 != 0) goto L_0x0061
        L_0x005d:
            r8 = r8 & 48
            if (r8 != r4) goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            r8 = r0 | r1
            java.lang.Object r0 = r7.D()
            if (r8 != 0) goto L_0x0072
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r0 != r8) goto L_0x007a
        L_0x0072:
            androidx.compose.foundation.layout.l r0 = new androidx.compose.foundation.layout.l
            r0.<init>(r5, r6)
            r7.u(r0)
        L_0x007a:
            r5 = r0
            androidx.compose.foundation.layout.l r5 = (androidx.compose.foundation.layout.C5081l) r5
            r7.P()
        L_0x0080:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0089
            U0.C4895p.R()
        L_0x0089:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C5080k.a(androidx.compose.foundation.layout.d$m, i1.c$b, U0.m, int):E1.I");
    }

    public static final long b(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? c.a(i11, i13, i10, i12) : C5267b.f23024b.a(i11, i13, i10, i12);
    }
}
