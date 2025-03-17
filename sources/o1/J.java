package O1;

import XH.v;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", "c", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "desiredWidth", "charSequence", "textPaint", "", "e", "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class J {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i10 = 0;
        lineInstance.setText(new C(charSequence, 0, charSequence.length()));
        PriorityQueue<v> priorityQueue = new PriorityQueue<>(10, new I());
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            int i12 = i11;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new v(Integer.valueOf(i12), Integer.valueOf(i10)));
            } else {
                v vVar = (v) priorityQueue.peek();
                if (vVar != null && ((Number) vVar.d()).intValue() - ((Number) vVar.c()).intValue() < i10 - i12) {
                    priorityQueue.poll();
                    priorityQueue.add(new v(Integer.valueOf(i12), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        float f10 = 0.0f;
        for (v vVar2 : priorityQueue) {
            f10 = Math.max(f10, Layout.getDesiredWidth(charSequence, ((Number) vVar2.a()).intValue(), ((Number) vVar2.b()).intValue(), textPaint));
        }
        return f10;
    }

    /* access modifiers changed from: private */
    public static final int d(v vVar, v vVar2) {
        return (((Number) vVar.d()).intValue() - ((Number) vVar.c()).intValue()) - (((Number) vVar2.d()).intValue() - ((Number) vVar2.c()).intValue());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (O1.N.a(r2, Q1.e.class) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0006
            goto L_0x0024
        L_0x0006:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L_0x001c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<Q1.f> r1 = Q1.f.class
            boolean r1 = O1.N.a(r2, r1)
            if (r1 != 0) goto L_0x0026
            java.lang.Class<Q1.e> r1 = Q1.e.class
            boolean r1 = O1.N.a(r2, r1)
            if (r1 != 0) goto L_0x0026
        L_0x001c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L_0x0026
        L_0x0024:
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.J.e(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }
}
