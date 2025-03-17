package I0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LI0/T;", "", "<init>", "()V", "Lc2/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "LI0/U;", "a", "(FFFFLU0/m;II)LI0/U;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public static final T f7557a = new T();

    private T() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: I0.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: I0.w} */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009d, code lost:
        if (r10 == U0.C4889m.f14007a.a()) goto L_0x009f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final I0.U a(float r9, float r10, float r11, float r12, U0.C4889m r13, int r14, int r15) {
        /*
            r8 = this;
            r0 = r15 & 1
            r1 = 6
            if (r0 == 0) goto L_0x000a
            float r9 = (float) r1
            float r9 = c2.h.B(r9)
        L_0x000a:
            r3 = r9
            r9 = r15 & 2
            if (r9 == 0) goto L_0x0016
            r9 = 12
            float r9 = (float) r9
            float r10 = c2.h.B(r9)
        L_0x0016:
            r4 = r10
            r9 = r15 & 4
            r10 = 8
            if (r9 == 0) goto L_0x0022
            float r9 = (float) r10
            float r11 = c2.h.B(r9)
        L_0x0022:
            r5 = r11
            r9 = r15 & 8
            if (r9 == 0) goto L_0x002c
            float r9 = (float) r10
            float r12 = c2.h.B(r9)
        L_0x002c:
            r6 = r12
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x003c
            r9 = -1
            java.lang.String r10 = "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:248)"
            r11 = 380403812(0x16ac8064, float:2.7869125E-25)
            U0.C4895p.S(r11, r14, r9, r10)
        L_0x003c:
            r9 = r14 & 14
            r9 = r9 ^ r1
            r10 = 4
            r11 = 0
            r12 = 1
            if (r9 <= r10) goto L_0x004a
            boolean r9 = r13.c(r3)
            if (r9 != 0) goto L_0x004e
        L_0x004a:
            r9 = r14 & 6
            if (r9 != r10) goto L_0x0050
        L_0x004e:
            r9 = r12
            goto L_0x0051
        L_0x0050:
            r9 = r11
        L_0x0051:
            r10 = r14 & 112(0x70, float:1.57E-43)
            r10 = r10 ^ 48
            r15 = 32
            if (r10 <= r15) goto L_0x005f
            boolean r10 = r13.c(r4)
            if (r10 != 0) goto L_0x0063
        L_0x005f:
            r10 = r14 & 48
            if (r10 != r15) goto L_0x0065
        L_0x0063:
            r10 = r12
            goto L_0x0066
        L_0x0065:
            r10 = r11
        L_0x0066:
            r9 = r9 | r10
            r10 = r14 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r10 <= r15) goto L_0x0075
            boolean r10 = r13.c(r5)
            if (r10 != 0) goto L_0x0079
        L_0x0075:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != r15) goto L_0x007b
        L_0x0079:
            r10 = r12
            goto L_0x007c
        L_0x007b:
            r10 = r11
        L_0x007c:
            r9 = r9 | r10
            r10 = r14 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r10 <= r15) goto L_0x008b
            boolean r10 = r13.c(r6)
            if (r10 != 0) goto L_0x008f
        L_0x008b:
            r10 = r14 & 3072(0xc00, float:4.305E-42)
            if (r10 != r15) goto L_0x0090
        L_0x008f:
            r11 = r12
        L_0x0090:
            r9 = r9 | r11
            java.lang.Object r10 = r13.D()
            if (r9 != 0) goto L_0x009f
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x00a9
        L_0x009f:
            I0.w r10 = new I0.w
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r13.u(r10)
        L_0x00a9:
            I0.w r10 = (I0.C4589w) r10
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00b4
            U0.C4895p.R()
        L_0x00b4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.T.a(float, float, float, float, U0.m, int, int):I0.U");
    }
}
