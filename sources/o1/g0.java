package O1;

import O1.G;
import P1.f;
import YH.C16870n;
import android.graphics.RectF;
import android.text.Layout;
import kotlin.Metadata;
import nI.p;
import tI.C17972h;
import tI.C17978n;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\u001aO\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a]\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001am\u0010\u001e\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001am\u0010 \u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b \u0010\u001f\u001a'\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010$\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#\u001a#\u0010'\u001a\u00020\n*\u00020\u00052\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"LO1/f0;", "Landroid/text/Layout;", "layout", "LO1/G;", "layoutHelper", "Landroid/graphics/RectF;", "rect", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "d", "(LO1/f0;Landroid/text/Layout;LO1/G;Landroid/graphics/RectF;ILnI/p;)[I", "lineIndex", "LP1/f;", "segmentFinder", "getStart", "f", "(LO1/f0;Landroid/text/Layout;LO1/G;ILandroid/graphics/RectF;LP1/f;LnI/p;Z)I", "LO1/G$a;", "lineStart", "lineTop", "lineBottom", "", "runLeft", "runRight", "", "horizontalBounds", "e", "(LO1/G$a;Landroid/graphics/RectF;IIIFF[FLP1/f;LnI/p;)I", "c", "offset", "a", "(II[F)F", "b", "left", "right", "g", "(Landroid/graphics/RectF;FF)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {
    private static final float a(int i10, int i11, float[] fArr) {
        return fArr[(i10 - i11) * 2];
    }

    private static final float b(int i10, int i11, float[] fArr) {
        return fArr[((i10 - i11) * 2) + 1];
    }

    private static final int c(G.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, f fVar, p<? super RectF, ? super RectF, Boolean> pVar) {
        int i13;
        int c10;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.right < f11) && (!aVar.c() || rectF.left > f10)) {
            i13 = aVar.b();
            int a10 = aVar.a();
            while (a10 - i13 > 1) {
                int i14 = (a10 + i13) / 2;
                float a11 = a(i14, i10, fArr);
                if ((aVar.c() || a11 <= rectF.right) && (!aVar.c() || a11 >= rectF.left)) {
                    i13 = i14;
                } else {
                    a10 = i14;
                }
            }
            if (aVar.c()) {
                i13 = a10;
            }
        } else {
            i13 = aVar.a() - 1;
        }
        int b10 = fVar.b(i13 + 1);
        if (b10 == -1 || (c10 = fVar.c(b10)) <= aVar.b()) {
            return -1;
        }
        int e10 = C17978n.e(b10, aVar.b());
        int i15 = C17978n.i(c10, aVar.a());
        RectF rectF2 = new RectF(0.0f, (float) i11, 0.0f, (float) i12);
        while (true) {
            rectF2.left = aVar.c() ? a(i15 - 1, i10, fArr) : a(e10, i10, fArr);
            rectF2.right = aVar.c() ? b(e10, i10, fArr) : b(i15 - 1, i10, fArr);
            if (pVar.invoke(rectF2, rectF).booleanValue()) {
                return i15;
            }
            i15 = fVar.d(i15);
            if (i15 == -1 || i15 <= aVar.b()) {
                return -1;
            }
            e10 = C17978n.e(fVar.b(i15), aVar.b());
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] d(O1.f0 r17, android.text.Layout r18, O1.G r19, android.graphics.RectF r20, int r21, nI.p<? super android.graphics.RectF, ? super android.graphics.RectF, java.lang.Boolean> r22) {
        /*
            r8 = r17
            r9 = r18
            r10 = r20
            r11 = 1
            r0 = r21
            if (r0 != r11) goto L_0x001a
            P1.j r0 = new P1.j
            java.lang.CharSequence r1 = r17.G()
            P1.i r2 = r17.I()
            r0.<init>(r1, r2)
        L_0x0018:
            r12 = r0
            goto L_0x0027
        L_0x001a:
            java.lang.CharSequence r0 = r17.G()
            android.text.TextPaint r1 = r17.H()
            P1.f r0 = P1.g.a(r0, r1)
            goto L_0x0018
        L_0x0027:
            float r0 = r10.top
            int r0 = (int) r0
            int r0 = r9.getLineForVertical(r0)
            float r1 = r10.top
            float r2 = r8.l(r0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r13 = 0
            if (r1 <= 0) goto L_0x0042
            int r0 = r0 + 1
            int r1 = r17.m()
            if (r0 < r1) goto L_0x0042
            return r13
        L_0x0042:
            r14 = r0
            float r0 = r10.bottom
            int r0 = (int) r0
            int r15 = r9.getLineForVertical(r0)
            if (r15 != 0) goto L_0x0058
            float r0 = r10.bottom
            r1 = 0
            float r1 = r8.w(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            return r13
        L_0x0058:
            r7 = 1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x0069:
            r7 = r14
            r14 = r0
            r6 = -1
            if (r14 != r6) goto L_0x0084
            if (r7 >= r15) goto L_0x0084
            int r14 = r7 + 1
            r7 = 1
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0069
        L_0x0084:
            if (r14 != r6) goto L_0x0087
            return r13
        L_0x0087:
            r16 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r5 = r12
            r11 = r6
            r6 = r22
            r13 = r7
            r7 = r16
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x009d:
            if (r0 != r11) goto L_0x00b5
            if (r13 >= r15) goto L_0x00b5
            int r15 = r15 + -1
            r7 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r15
            r4 = r20
            r5 = r12
            r6 = r22
            int r0 = f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x009d
        L_0x00b5:
            if (r0 != r11) goto L_0x00b9
            r1 = 0
            return r1
        L_0x00b9:
            r1 = 1
            int r14 = r14 + r1
            int r2 = r12.b(r14)
            int r0 = r0 - r1
            int r0 = r12.c(r0)
            int[] r0 = new int[]{r2, r0}
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.g0.d(O1.f0, android.text.Layout, O1.G, android.graphics.RectF, int, nI.p):int[]");
    }

    private static final int e(G.a aVar, RectF rectF, int i10, int i11, int i12, float f10, float f11, float[] fArr, f fVar, p<? super RectF, ? super RectF, Boolean> pVar) {
        int i13;
        int b10;
        if (!g(rectF, f10, f11)) {
            return -1;
        }
        if ((aVar.c() || rectF.left > f10) && (!aVar.c() || rectF.right < f11)) {
            i13 = aVar.b();
            int a10 = aVar.a();
            while (a10 - i13 > 1) {
                int i14 = (a10 + i13) / 2;
                float a11 = a(i14, i10, fArr);
                if ((aVar.c() || a11 <= rectF.left) && (!aVar.c() || a11 >= rectF.right)) {
                    i13 = i14;
                } else {
                    a10 = i14;
                }
            }
            if (aVar.c()) {
                i13 = a10;
            }
        } else {
            i13 = aVar.b();
        }
        int c10 = fVar.c(i13);
        if (c10 == -1 || (b10 = fVar.b(c10)) >= aVar.a()) {
            return -1;
        }
        int e10 = C17978n.e(b10, aVar.b());
        int i15 = C17978n.i(c10, aVar.a());
        RectF rectF2 = new RectF(0.0f, (float) i11, 0.0f, (float) i12);
        while (true) {
            rectF2.left = aVar.c() ? a(i15 - 1, i10, fArr) : a(e10, i10, fArr);
            rectF2.right = aVar.c() ? b(e10, i10, fArr) : b(i15 - 1, i10, fArr);
            if (pVar.invoke(rectF2, rectF).booleanValue()) {
                return e10;
            }
            e10 = fVar.a(e10);
            if (e10 == -1 || e10 >= aVar.a()) {
                return -1;
            }
            i15 = C17978n.i(fVar.c(e10), aVar.a());
        }
        return -1;
    }

    private static final int f(f0 f0Var, Layout layout, G g10, int i10, RectF rectF, f fVar, p<? super RectF, ? super RectF, Boolean> pVar, boolean z10) {
        G.a[] aVarArr;
        int i11;
        int i12;
        int i13;
        Layout layout2 = layout;
        int i14 = i10;
        int lineTop = layout2.getLineTop(i14);
        int lineBottom = layout2.getLineBottom(i14);
        int lineStart = layout2.getLineStart(i14);
        int lineEnd = layout2.getLineEnd(i14);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[((lineEnd - lineStart) * 2)];
        f0Var.b(i14, fArr);
        G.a[] d10 = g10.d(i10);
        C17972h j02 = z10 ? C16870n.j0(d10) : C17978n.s(C16870n.n0(d10), 0);
        int p10 = j02.p();
        int q10 = j02.q();
        int s10 = j02.s();
        if ((s10 <= 0 || p10 > q10) && (s10 >= 0 || q10 > p10)) {
            return -1;
        }
        int i15 = p10;
        while (true) {
            G.a aVar = d10[i15];
            float a10 = aVar.c() ? a(aVar.a() - 1, lineStart, fArr) : a(aVar.b(), lineStart, fArr);
            float b10 = aVar.c() ? b(aVar.b(), lineStart, fArr) : b(aVar.a() - 1, lineStart, fArr);
            if (z10) {
                i12 = i15;
                aVarArr = d10;
                i11 = q10;
                i13 = e(aVar, rectF, lineStart, lineTop, lineBottom, a10, b10, fArr, fVar, pVar);
            } else {
                i12 = i15;
                aVarArr = d10;
                i11 = q10;
                i13 = c(aVar, rectF, lineStart, lineTop, lineBottom, a10, b10, fArr, fVar, pVar);
            }
            if (i13 >= 0) {
                return i13;
            }
            if (i12 == i11) {
                return -1;
            }
            i15 = i12 + s10;
            q10 = i11;
            d10 = aVarArr;
        }
    }

    private static final boolean g(RectF rectF, float f10, float f11) {
        return f11 >= rectF.left && f10 <= rectF.right;
    }
}
