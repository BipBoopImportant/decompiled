package com.google.android.material.radiobutton;

import Ea.C9068b;
import Ea.C9077k;
import La.C9138a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.c;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: g  reason: collision with root package name */
    private static final int f67061g = C9077k.f59584A;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f67062h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f67063e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f67064f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59318X);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f67063e == null) {
            int d10 = C9138a.d(this, C9068b.f59339j);
            int d11 = C9138a.d(this, C9068b.f59345m);
            int d12 = C9138a.d(this, C9068b.f59352q);
            int[][] iArr = f67062h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C9138a.j(d12, d10, 1.0f);
            iArr2[1] = C9138a.j(d12, d11, 0.54f);
            iArr2[2] = C9138a.j(d12, d11, 0.38f);
            iArr2[3] = C9138a.j(d12, d11, 0.38f);
            this.f67063e = new ColorStateList(iArr, iArr2);
        }
        return this.f67063e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f67064f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f67064f = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f67061g
            android.content.Context r8 = Xa.C9359a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = Ea.C9078l.f59732K4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r10 = Ea.C9078l.f59743L4
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L_0x002a
            int r10 = Ea.C9078l.f59743L4
            android.content.res.ColorStateList r8 = Ra.c.a(r8, r9, r10)
            androidx.core.widget.c.d(r7, r8)
        L_0x002a:
            int r8 = Ea.C9078l.f59754M4
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f67064f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
