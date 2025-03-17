package xL;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: xL.b  reason: case insensitive filesystem */
public class C18681b {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f152519a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<C18680a> f152520b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private final String f152521c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f152522d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f152523e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f152524f;

    /* renamed from: xL.b$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Context> f152525a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f152526b = true;

        /* renamed from: c  reason: collision with root package name */
        private boolean f152527c = true;

        /* renamed from: d  reason: collision with root package name */
        private boolean f152528d = true;

        /* renamed from: e  reason: collision with root package name */
        private String[] f152529e;

        public a(Context context) {
            this.f152525a = new WeakReference<>(context);
        }

        private String b(String[] strArr) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                if (!str.isEmpty()) {
                    sb2.append(str);
                }
            }
            return sb2.toString();
        }

        public C18681b a() {
            String[] strArr = this.f152529e;
            if (strArr != null) {
                C18681b bVar = new C18681b(this.f152525a, b(strArr), this.f152526b, this.f152527c, this.f152528d);
                bVar.f();
                return bVar;
            }
            throw new IllegalStateException("Using builder without providing attribution data");
        }

        public a c(String... strArr) {
            this.f152529e = strArr;
            return this;
        }

        public a d(boolean z10) {
            this.f152527c = z10;
            return this;
        }

        public a e(boolean z10) {
            this.f152526b = z10;
            return this;
        }
    }

    C18681b(WeakReference<Context> weakReference, String str, boolean z10, boolean z11, boolean z12) {
        this.f152519a = weakReference;
        this.f152521c = str;
        this.f152522d = z10;
        this.f152523e = z11;
        this.f152524f = z12;
    }

    private static Spanned a(String str) {
        return Html.fromHtml(str, 0);
    }

    private boolean c(String str) {
        return d(str) && e(str);
    }

    private boolean d(String str) {
        return this.f152522d || !C18680a.f152516c.contains(str);
    }

    private boolean e(String str) {
        return this.f152524f || !str.equals("https://www.mapbox.com/about/maps/");
    }

    private String g(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        char[] cArr = new char[(spanEnd - spanStart)];
        spannableStringBuilder.getChars(spanStart, spanEnd, cArr, 0);
        return j(String.valueOf(cArr));
    }

    private void h() {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) a(this.f152521c);
        for (URLSpan i10 : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            i(spannableStringBuilder, i10);
        }
    }

    private void i(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        String url = uRLSpan.getURL();
        if (c(url)) {
            this.f152520b.add(new C18680a(g(spannableStringBuilder, uRLSpan), url));
        }
    }

    private String j(String str) {
        return (this.f152523e || !str.startsWith("© ")) ? str : str.substring(2, str.length());
    }

    public Set<C18680a> b() {
        return this.f152520b;
    }

    /* access modifiers changed from: protected */
    public void f() {
        h();
    }
}
