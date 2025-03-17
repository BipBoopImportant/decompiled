package Dl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pI.C17752b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJq\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"LDl/a;", "Landroid/text/style/LeadingMarginSpan;", "", "bulletRadius", "gapWidth", "<init>", "(FF)V", "", "first", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "x", "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "LXH/N;", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "a", "F", "b", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a implements LeadingMarginSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f79784a;

    /* renamed from: b  reason: collision with root package name */
    private final float f79785b;

    public a(float f10, float f11) {
        this.f79784a = f10;
        this.f79785b = f11;
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        C17542s.j(canvas, "canvas");
        C17542s.j(paint, "paint");
        C17542s.j(charSequence, "text");
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null && spanned.getSpanStart(this) == i15) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float f10 = ((float) i10) + (((float) i11) * (this.f79785b + this.f79784a));
            float abs = ((float) i13) - (((float) Math.abs(i13 - i12)) / 2.0f);
            float f11 = this.f79784a;
            canvas.drawCircle(f10, abs + f11, f11, paint);
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z10) {
        float f10 = this.f79785b;
        return C17752b.e((((float) 2) * this.f79784a) + f10 + f10);
    }
}
