package Q1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0003\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"LQ1/n;", "Landroid/text/style/CharacterStyle;", "", "isUnderlineText", "isStrikethroughText", "<init>", "(ZZ)V", "Landroid/text/TextPaint;", "textPaint", "LXH/N;", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "Z", "()Z", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f12166a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12167b;

    public n(boolean z10, boolean z11) {
        this.f12166a = z10;
        this.f12167b = z11;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f12166a);
        textPaint.setStrikeThruText(this.f12167b);
    }
}
