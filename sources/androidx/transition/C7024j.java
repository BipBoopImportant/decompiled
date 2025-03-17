package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.j  reason: case insensitive filesystem */
public class C7024j extends Q {

    /* renamed from: b  reason: collision with root package name */
    private float f44678b = 3.0f;

    /* renamed from: c  reason: collision with root package name */
    private int f44679c = 80;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r6.getLayoutDirection() == 1) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r6.getLayoutDirection() == 1) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int h(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r5 = this;
            int r0 = r5.f44679c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 1
            r3 = 3
            r4 = 5
            if (r0 != r1) goto L_0x0014
            int r6 = r6.getLayoutDirection()
            if (r6 != r2) goto L_0x0012
        L_0x0010:
            r0 = r4
            goto L_0x0020
        L_0x0012:
            r0 = r3
            goto L_0x0020
        L_0x0014:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L_0x0020
            int r6 = r6.getLayoutDirection()
            if (r6 != r2) goto L_0x0010
            goto L_0x0012
        L_0x0020:
            if (r0 == r3) goto L_0x0046
            if (r0 == r4) goto L_0x003e
            r6 = 48
            if (r0 == r6) goto L_0x0036
            r6 = 80
            if (r0 == r6) goto L_0x002e
            r6 = 0
            goto L_0x004d
        L_0x002e:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r8
            goto L_0x004d
        L_0x0036:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r14
            goto L_0x004d
        L_0x003e:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r7
            goto L_0x004d
        L_0x0046:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r13
        L_0x004d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C7024j.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int i(ViewGroup viewGroup) {
        int i10 = this.f44679c;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public long c(ViewGroup viewGroup, C7026l lVar, y yVar, y yVar2) {
        int i10;
        int i11;
        int i12;
        y yVar3 = yVar;
        if (yVar3 == null && yVar2 == null) {
            return 0;
        }
        Rect A10 = lVar.A();
        if (yVar2 == null || e(yVar3) == 0) {
            i10 = -1;
        } else {
            yVar3 = yVar2;
            i10 = 1;
        }
        int f10 = f(yVar3);
        int g10 = g(yVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (A10 != null) {
            i12 = A10.centerX();
            i11 = A10.centerY();
        } else {
            i12 = (round + width) / 2;
            i11 = (round2 + height) / 2;
        }
        float h10 = ((float) h(viewGroup, f10, g10, i12, i11, round, round2, width, height)) / ((float) i(viewGroup));
        long z10 = lVar.z();
        if (z10 < 0) {
            z10 = 300;
        }
        return (long) Math.round((((float) (z10 * ((long) i10))) / this.f44678b) * h10);
    }

    public void j(int i10) {
        this.f44679c = i10;
    }
}
