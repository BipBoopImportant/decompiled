package I0;

import kotlin.Metadata;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LI0/l;", "colors", "LH0/V;", "e", "(LI0/l;LU0/m;I)LH0/V;", "Lp1/v0;", "selectionColor", "textColor", "backgroundColor", "d", "(JJJ)J", "", "a", "(JJJ)F", "selectionColorAlpha", "c", "(JFJJ)F", "foreground", "background", "b", "(JJ)F", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.c0  reason: case insensitive filesystem */
public final class C4551c0 {
    private static final float a(long j10, long j11, long j12) {
        float f10 = 0.2f;
        float f11 = 0.4f;
        float f12 = 0.4f;
        for (int i10 = 0; i10 < 7; i10++) {
            float c10 = (c(j10, f11, j11, j12) / 4.5f) - 1.0f;
            if (0.0f <= c10 && c10 <= 0.01f) {
                break;
            }
            if (c10 < 0.0f) {
                f12 = f11;
            } else {
                f10 = f11;
            }
            f11 = (f12 + f10) / 2.0f;
        }
        return f11;
    }

    public static final float b(long j10, long j11) {
        float j12 = C5751x0.j(j10) + 0.05f;
        float j13 = C5751x0.j(j11) + 0.05f;
        return Math.max(j12, j13) / Math.min(j12, j13);
    }

    private static final float c(long j10, float f10, long j11, long j12) {
        long h10 = C5751x0.h(C5747v0.o(j10, f10, 0.0f, 0.0f, 0.0f, 14, (Object) null), j12);
        return b(C5751x0.h(j11, h10), h10);
    }

    public static final long d(long j10, long j11, long j12) {
        return C5747v0.o(j10, c(j10, 0.4f, j11, j12) >= 4.5f ? 0.4f : c(j10, 0.2f, j11, j12) < 4.5f ? 0.2f : a(j10, j11, j12), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: H0.V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: H0.V} */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
        if (r3 == U0.C4889m.f14007a.a()) goto L_0x006f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final H0.V e(I0.C4568l r18, U0.C4889m r19, int r20) {
        /*
            r0 = r19
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0013
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)"
            r3 = -721696685(0xffffffffd4fbc853, float:-8.6511814E12)
            r4 = r20
            U0.C4895p.S(r3, r4, r1, r2)
        L_0x0013:
            long r4 = r18.j()
            long r8 = r18.c()
            r1 = 1102762072(0x41bad058, float:23.35173)
            r0.W(r1)
            r1 = r18
            long r2 = I0.C4570m.a(r1, r8)
            r6 = 16
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002f
        L_0x002d:
            r10 = r2
            goto L_0x003e
        L_0x002f:
            U0.I0 r2 = I0.C4581s.a()
            java.lang.Object r2 = r0.Q(r2)
            p1.v0 r2 = (p1.C5747v0) r2
            long r2 = r2.y()
            goto L_0x002d
        L_0x003e:
            r19.P()
            I0.q r2 = I0.C4578q.f8304a
            r3 = 6
            float r12 = r2.d(r0, r3)
            r16 = 14
            r17 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            long r6 = p1.C5747v0.o(r10, r12, r13, r14, r15, r16, r17)
            boolean r2 = r0.e(r4)
            boolean r3 = r0.e(r8)
            r2 = r2 | r3
            boolean r3 = r0.e(r6)
            r2 = r2 | r3
            java.lang.Object r3 = r19.D()
            if (r2 != 0) goto L_0x006f
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0081
        L_0x006f:
            H0.V r3 = new H0.V
            long r11 = r18.j()
            long r13 = d(r4, r6, r8)
            r15 = 0
            r10 = r3
            r10.<init>(r11, r13, r15)
            r0.u(r3)
        L_0x0081:
            H0.V r3 = (H0.V) r3
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x008c
            U0.C4895p.R()
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C4551c0.e(I0.l, U0.m, int):H0.V");
    }
}
