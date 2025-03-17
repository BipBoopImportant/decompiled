package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

final class o {

    /* renamed from: n  reason: collision with root package name */
    static final int f66999n = 1;

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f67000a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f67001b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67002c;

    /* renamed from: d  reason: collision with root package name */
    private int f67003d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f67004e;

    /* renamed from: f  reason: collision with root package name */
    private Layout.Alignment f67005f;

    /* renamed from: g  reason: collision with root package name */
    private int f67006g;

    /* renamed from: h  reason: collision with root package name */
    private float f67007h;

    /* renamed from: i  reason: collision with root package name */
    private float f67008i;

    /* renamed from: j  reason: collision with root package name */
    private int f67009j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f67010k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f67011l;

    /* renamed from: m  reason: collision with root package name */
    private TextUtils.TruncateAt f67012m;

    static class a extends Exception {
    }

    private o(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f67000a = charSequence;
        this.f67001b = textPaint;
        this.f67002c = i10;
        this.f67004e = charSequence.length();
        this.f67005f = Layout.Alignment.ALIGN_NORMAL;
        this.f67006g = Integer.MAX_VALUE;
        this.f67007h = 0.0f;
        this.f67008i = 1.0f;
        this.f67009j = f66999n;
        this.f67010k = true;
        this.f67012m = null;
    }

    public static o b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new o(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f67000a == null) {
            this.f67000a = "";
        }
        int max = Math.max(0, this.f67002c);
        CharSequence charSequence = this.f67000a;
        if (this.f67006g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f67001b, (float) max, this.f67012m);
        }
        int min = Math.min(charSequence.length(), this.f67004e);
        this.f67004e = min;
        if (this.f67011l && this.f67006g == 1) {
            this.f67005f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f67003d, min, this.f67001b, max);
        obtain.setAlignment(this.f67005f);
        obtain.setIncludePad(this.f67010k);
        obtain.setTextDirection(this.f67011l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f67012m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f67006g);
        float f10 = this.f67007h;
        if (!(f10 == 0.0f && this.f67008i == 1.0f)) {
            obtain.setLineSpacing(f10, this.f67008i);
        }
        if (this.f67006g > 1) {
            obtain.setHyphenationFrequency(this.f67009j);
        }
        return obtain.build();
    }

    public o c(Layout.Alignment alignment) {
        this.f67005f = alignment;
        return this;
    }

    public o d(TextUtils.TruncateAt truncateAt) {
        this.f67012m = truncateAt;
        return this;
    }

    public o e(int i10) {
        this.f67009j = i10;
        return this;
    }

    public o f(boolean z10) {
        this.f67010k = z10;
        return this;
    }

    public o g(boolean z10) {
        this.f67011l = z10;
        return this;
    }

    public o h(float f10, float f11) {
        this.f67007h = f10;
        this.f67008i = f11;
        return this;
    }

    public o i(int i10) {
        this.f67006g = i10;
        return this;
    }

    public o j(p pVar) {
        return this;
    }
}
