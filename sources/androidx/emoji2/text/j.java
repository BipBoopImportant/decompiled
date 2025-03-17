package androidx.emoji2.text;

import H2.i;
import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

public abstract class j extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Paint.FontMetricsInt f21600a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    private final p f21601b;

    /* renamed from: c  reason: collision with root package name */
    private short f21602c = -1;

    /* renamed from: d  reason: collision with root package name */
    private short f21603d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float f21604e = 1.0f;

    j(p pVar) {
        i.h(pVar, "rasterizer cannot be null");
        this.f21601b = pVar;
    }

    public final p a() {
        return this.f21601b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f21602c;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f21600a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f21600a;
        this.f21604e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f21601b.e());
        this.f21603d = (short) ((int) (((float) this.f21601b.e()) * this.f21604e));
        short i12 = (short) ((int) (((float) this.f21601b.i()) * this.f21604e));
        this.f21602c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f21600a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
