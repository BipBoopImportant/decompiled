package com.google.android.material.carousel;

import B2.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class i extends d {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f66346d = {1};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f66347e = {1, 0};

    /* renamed from: c  reason: collision with root package name */
    private int f66348c = 0;

    /* access modifiers changed from: package-private */
    public f g(b bVar, View view) {
        float e10 = (float) bVar.e();
        if (bVar.f()) {
            e10 = (float) bVar.b();
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f10 = (float) (rVar.topMargin + rVar.bottomMargin);
        float measuredHeight = (float) view.getMeasuredHeight();
        if (bVar.f()) {
            f10 = (float) (rVar.leftMargin + rVar.rightMargin);
            measuredHeight = (float) view.getMeasuredWidth();
        }
        float f11 = f10;
        float d10 = d() + f11;
        float max = Math.max(c() + f11, d10);
        float min = Math.min(measuredHeight + f11, e10);
        float b10 = a.b((measuredHeight / 3.0f) + f11, d10 + f11, max + f11);
        float f12 = (min + b10) / 2.0f;
        int[] iArr = f66346d;
        if (e10 < 2.0f * d10) {
            iArr = new int[]{0};
        }
        int[] iArr2 = f66347e;
        if (bVar.p() == 1) {
            iArr = d.a(iArr);
            iArr2 = d.a(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int ceil = (int) Math.ceil((double) (e10 / min));
        int max2 = (ceil - ((int) Math.max(1.0d, Math.floor((double) (((e10 - (((float) e.i(iArr4)) * f12)) - (((float) e.i(iArr3)) * max)) / min))))) + 1;
        int[] iArr5 = new int[max2];
        for (int i10 = 0; i10 < max2; i10++) {
            iArr5[i10] = ceil - i10;
        }
        a c10 = a.c(e10, b10, d10, max, iArr3, f12, iArr4, min, iArr5);
        this.f66348c = c10.e();
        if (i(c10, bVar.a())) {
            c10 = a.c(e10, b10, d10, max, new int[]{c10.f66307c}, f12, new int[]{c10.f66308d}, min, new int[]{c10.f66311g});
        }
        return e.d(view.getContext(), f11, e10, c10, bVar.p());
    }

    /* access modifiers changed from: package-private */
    public boolean h(b bVar, int i10) {
        return (i10 < this.f66348c && bVar.a() >= this.f66348c) || (i10 >= this.f66348c && bVar.a() < this.f66348c);
    }

    /* access modifiers changed from: package-private */
    public boolean i(a aVar, int i10) {
        int e10 = aVar.e() - i10;
        boolean z10 = e10 > 0 && (aVar.f66307c > 0 || aVar.f66308d > 1);
        while (e10 > 0) {
            int i11 = aVar.f66307c;
            if (i11 > 0) {
                aVar.f66307c = i11 - 1;
            } else {
                int i12 = aVar.f66308d;
                if (i12 > 1) {
                    aVar.f66308d = i12 - 1;
                }
            }
            e10--;
        }
        return z10;
    }
}
