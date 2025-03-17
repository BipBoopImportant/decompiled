package jp;

import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.SuperscriptSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002XD¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ljp/f;", "Landroid/text/style/SuperscriptSpan;", "", "size", "<init>", "(F)V", "Landroid/text/TextPaint;", "textPaint", "LXH/N;", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "a", "F", "getSize", "()F", "Landroid/graphics/Rect;", "b", "Landroid/graphics/Rect;", "bounds", "", "c", "Ljava/lang/String;", "textToMeasure", "view_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends SuperscriptSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f98633a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f98634b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final String f98635c = "1A";

    public f(float f10) {
        this.f98633a = f10;
    }

    public void updateDrawState(TextPaint textPaint) {
        C17542s.j(textPaint, "textPaint");
        String str = this.f98635c;
        textPaint.getTextBounds(str, 0, str.length(), this.f98634b);
        Rect rect = this.f98634b;
        int i10 = rect.top - rect.bottom;
        textPaint.setTextSize(textPaint.getTextSize() * this.f98633a);
        String str2 = this.f98635c;
        textPaint.getTextBounds(str2, 0, str2.length(), this.f98634b);
        Rect rect2 = this.f98634b;
        textPaint.baselineShift += i10 - (rect2.top - rect2.bottom);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C17542s.j(textPaint, "textPaint");
        updateDrawState(textPaint);
    }
}
