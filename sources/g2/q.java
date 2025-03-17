package G2;

import H2.c;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

public class q implements Spannable {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f6629d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spannable f6630a;

    /* renamed from: b  reason: collision with root package name */
    private final a f6631b;

    /* renamed from: c  reason: collision with root package name */
    private final PrecomputedText f6632c;

    public a a() {
        return this.f6631b;
    }

    public PrecomputedText b() {
        if (c.a(this.f6630a)) {
            return d.a(this.f6630a);
        }
        return null;
    }

    public char charAt(int i10) {
        return this.f6630a.charAt(i10);
    }

    public int getSpanEnd(Object obj) {
        return this.f6630a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f6630a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f6630a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f6632c.getSpans(i10, i11, cls) : this.f6630a.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.f6630a.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f6630a.nextSpanTransition(i10, i11, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f6632c.removeSpan(obj);
        } else {
            this.f6630a.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f6632c.setSpan(obj, i10, i11, i12);
        } else {
            this.f6630a.setSpan(obj, i10, i11, i12);
        }
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.f6630a.subSequence(i10, i11);
    }

    public String toString() {
        return this.f6630a.toString();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f6633a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f6634b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6635c;

        /* renamed from: d  reason: collision with root package name */
        private final int f6636d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f6637e;

        /* renamed from: G2.q$a$a  reason: collision with other inner class name */
        public static class C0064a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f6638a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f6639b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c  reason: collision with root package name */
            private int f6640c = 1;

            /* renamed from: d  reason: collision with root package name */
            private int f6641d = 1;

            public C0064a(TextPaint textPaint) {
                this.f6638a = textPaint;
            }

            public a a() {
                return new a(this.f6638a, this.f6639b, this.f6640c, this.f6641d);
            }

            public C0064a b(int i10) {
                this.f6640c = i10;
                return this;
            }

            public C0064a c(int i10) {
                this.f6641d = i10;
                return this;
            }

            public C0064a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f6639b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f6637e = p.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f6637e = null;
            }
            this.f6633a = textPaint;
            this.f6634b = textDirectionHeuristic;
            this.f6635c = i10;
            this.f6636d = i11;
        }

        public boolean a(a aVar) {
            if (this.f6635c == aVar.b() && this.f6636d == aVar.c() && this.f6633a.getTextSize() == aVar.e().getTextSize() && this.f6633a.getTextScaleX() == aVar.e().getTextScaleX() && this.f6633a.getTextSkewX() == aVar.e().getTextSkewX() && this.f6633a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f6633a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f6633a.getFlags() == aVar.e().getFlags() && this.f6633a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f6633a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f6633a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f6635c;
        }

        public int c() {
            return this.f6636d;
        }

        public TextDirectionHeuristic d() {
            return this.f6634b;
        }

        public TextPaint e() {
            return this.f6633a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return this.f6634b == aVar.d();
        }

        public int hashCode() {
            return c.b(Float.valueOf(this.f6633a.getTextSize()), Float.valueOf(this.f6633a.getTextScaleX()), Float.valueOf(this.f6633a.getTextSkewX()), Float.valueOf(this.f6633a.getLetterSpacing()), Integer.valueOf(this.f6633a.getFlags()), this.f6633a.getTextLocales(), this.f6633a.getTypeface(), Boolean.valueOf(this.f6633a.isElegantTextHeight()), this.f6634b, Integer.valueOf(this.f6635c), Integer.valueOf(this.f6636d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f6633a.getTextSize());
            sb2.append(", textScaleX=" + this.f6633a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f6633a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f6633a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f6633a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f6633a.getTextLocales());
            sb2.append(", typeface=" + this.f6633a.getTypeface());
            sb2.append(", variationSettings=" + this.f6633a.getFontVariationSettings());
            sb2.append(", textDir=" + this.f6634b);
            sb2.append(", breakStrategy=" + this.f6635c);
            sb2.append(", hyphenationFrequency=" + this.f6636d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f6633a = params.getTextPaint();
            this.f6634b = params.getTextDirection();
            this.f6635c = params.getBreakStrategy();
            this.f6636d = params.getHyphenationFrequency();
            this.f6637e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
