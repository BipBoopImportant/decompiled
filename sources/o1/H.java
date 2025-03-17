package O1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\n\u0010\u001eR\u0011\u0010!\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000e\u0010 R\u0011\u0010\"\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\f\u0010 ¨\u0006#"}, d2 = {"LO1/H;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "a", "Ljava/lang/CharSequence;", "b", "Landroid/text/TextPaint;", "c", "I", "", "d", "F", "_maxIntrinsicWidth", "e", "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", "f", "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", "g", "Z", "boringMetricsIsInit", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "()F", "minIntrinsicWidth", "maxIntrinsicWidth", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f11695a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f11696b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11697c;

    /* renamed from: d  reason: collision with root package name */
    private float f11698d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    private float f11699e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private BoringLayout.Metrics f11700f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11701g;

    public H(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f11695a = charSequence;
        this.f11696b = textPaint;
        this.f11697c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f11701g) {
            this.f11700f = C4777k.f11757a.c(this.f11695a, this.f11696b, h0.k(this.f11697c));
            this.f11701g = true;
        }
        return this.f11700f;
    }

    public final float b() {
        if (!Float.isNaN(this.f11698d)) {
            return this.f11698d;
        }
        BoringLayout.Metrics a10 = a();
        float f10 = (float) (a10 != null ? a10.width : -1);
        if (f10 < 0.0f) {
            CharSequence charSequence = this.f11695a;
            f10 = (float) Math.ceil((double) Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f11696b));
        }
        if (J.e(f10, this.f11695a, this.f11696b)) {
            f10 += 0.5f;
        }
        this.f11698d = f10;
        return f10;
    }

    public final float c() {
        if (!Float.isNaN(this.f11699e)) {
            return this.f11699e;
        }
        float c10 = J.c(this.f11695a, this.f11696b);
        this.f11699e = c10;
        return c10;
    }
}
