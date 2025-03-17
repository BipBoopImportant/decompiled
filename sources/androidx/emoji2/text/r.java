package androidx.emoji2.text;

import G2.q;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

class r implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21636a = false;

    /* renamed from: b  reason: collision with root package name */
    private Spannable f21637b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof q;
        }
    }

    static class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public boolean a(CharSequence charSequence) {
            return G2.c.a(charSequence) || (charSequence instanceof q);
        }
    }

    r(Spannable spannable) {
        this.f21637b = spannable;
    }

    private void a() {
        Spannable spannable = this.f21637b;
        if (!this.f21636a && c().a(spannable)) {
            this.f21637b = new SpannableString(spannable);
        }
        this.f21636a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* access modifiers changed from: package-private */
    public Spannable b() {
        return this.f21637b;
    }

    public char charAt(int i10) {
        return this.f21637b.charAt(i10);
    }

    public IntStream chars() {
        return a.a(this.f21637b);
    }

    public IntStream codePoints() {
        return a.b(this.f21637b);
    }

    public int getSpanEnd(Object obj) {
        return this.f21637b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f21637b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f21637b.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return this.f21637b.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f21637b.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f21637b.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        a();
        this.f21637b.removeSpan(obj);
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f21637b.setSpan(obj, i10, i11, i12);
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f21637b.subSequence(i10, i11);
    }

    public String toString() {
        return this.f21637b.toString();
    }

    r(CharSequence charSequence) {
        this.f21637b = new SpannableString(charSequence);
    }
}
