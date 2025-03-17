package Q1;

import O1.h0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJw\u0010\u001a\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LQ1/c;", "Landroid/text/style/LeadingMarginSpan;", "<init>", "()V", "", "firstLine", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "left", "dir", "top", "baseline", "bottom", "", "text", "start", "end", "first", "Landroid/text/Layout;", "layout", "LXH/N;", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements LeadingMarginSpan {
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i15)) == layout.getLineCount() - 1 && h0.m(layout, lineForOffset)) {
            float a10 = d.a(layout, lineForOffset, paint) + d.c(layout, lineForOffset, paint);
            if (a10 != 0.0f) {
                C17542s.g(canvas);
                canvas.translate(a10, 0.0f);
            }
        }
    }

    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
