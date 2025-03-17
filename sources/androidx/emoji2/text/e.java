package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

class e implements f.e {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f21542b = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f21543a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f21543a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f21542b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return x2.e.a(this.f21543a, b10.toString());
    }
}
