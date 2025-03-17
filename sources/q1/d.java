package Q1;

import O1.h0;
import android.graphics.Paint;
import android.text.Layout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", "a", "(Landroid/text/Layout;ILandroid/graphics/Paint;)F", "c", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12133a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f12133a = iArr;
        }
    }

    public static final float a(Layout layout, int i10, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        if (!h0.m(layout, i10) || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : a.f12133a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (((float) layout.getWidth()) - primaryHorizontal) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = ((float) layout.getWidth()) - primaryHorizontal;
        }
        return abs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i10, paint);
    }

    public static final float c(Layout layout, int i10, Paint paint) {
        float width;
        float width2;
        if (!h0.m(layout, i10)) {
            return 0.0f;
        }
        int i11 = -1;
        if (layout.getParagraphDirection(i10) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i10)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if (paragraphAlignment != null) {
            i11 = a.f12133a[paragraphAlignment.ordinal()];
        }
        if (i11 == 1) {
            width = ((float) layout.getWidth()) - layout.getLineRight(i10);
            width2 = (((float) layout.getWidth()) - lineRight) / 2.0f;
        } else {
            width = ((float) layout.getWidth()) - layout.getLineRight(i10);
            width2 = ((float) layout.getWidth()) - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i10, paint);
    }
}
