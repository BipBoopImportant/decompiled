package O1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b,\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b0\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\"\u00107R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bB\u0010AR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b8\u0010)R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b9\u0010C\u001a\u0004\b5\u0010DR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010C\u001a\u0004\bE\u0010DR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b=\u0010)R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b>\u0010)R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bE\u0010G\u001a\u0004\b:\u0010HR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b0\u0010G\u001a\u0004\bF\u0010H¨\u0006I"}, d2 = {"LO1/c0;", "", "", "text", "", "start", "end", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "a", "Ljava/lang/CharSequence;", "r", "()Ljava/lang/CharSequence;", "b", "I", "q", "()I", "c", "e", "d", "Landroid/text/TextPaint;", "o", "()Landroid/text/TextPaint;", "u", "f", "Landroid/text/TextDirectionHeuristic;", "s", "()Landroid/text/TextDirectionHeuristic;", "g", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "h", "n", "i", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "j", "k", "F", "m", "()F", "l", "Z", "()Z", "t", "p", "[I", "()[I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f11709a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11710b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11711c;

    /* renamed from: d  reason: collision with root package name */
    private final TextPaint f11712d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11713e;

    /* renamed from: f  reason: collision with root package name */
    private final TextDirectionHeuristic f11714f;

    /* renamed from: g  reason: collision with root package name */
    private final Layout.Alignment f11715g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11716h;

    /* renamed from: i  reason: collision with root package name */
    private final TextUtils.TruncateAt f11717i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11718j;

    /* renamed from: k  reason: collision with root package name */
    private final float f11719k;

    /* renamed from: l  reason: collision with root package name */
    private final float f11720l;

    /* renamed from: m  reason: collision with root package name */
    private final int f11721m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f11722n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f11723o;

    /* renamed from: p  reason: collision with root package name */
    private final int f11724p;

    /* renamed from: q  reason: collision with root package name */
    private final int f11725q;

    /* renamed from: r  reason: collision with root package name */
    private final int f11726r;

    /* renamed from: s  reason: collision with root package name */
    private final int f11727s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f11728t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f11729u;

    public c0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        int i20 = i10;
        int i21 = i11;
        int i22 = i12;
        int i23 = i13;
        int i24 = i14;
        float f12 = f10;
        this.f11709a = charSequence;
        this.f11710b = i20;
        this.f11711c = i21;
        this.f11712d = textPaint;
        this.f11713e = i22;
        this.f11714f = textDirectionHeuristic;
        this.f11715g = alignment;
        this.f11716h = i23;
        this.f11717i = truncateAt;
        this.f11718j = i24;
        this.f11719k = f12;
        this.f11720l = f11;
        this.f11721m = i15;
        this.f11722n = z10;
        this.f11723o = z11;
        this.f11724p = i16;
        this.f11725q = i17;
        this.f11726r = i18;
        this.f11727s = i19;
        this.f11728t = iArr;
        this.f11729u = iArr2;
        if (i20 < 0 || i20 > i21) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i21 < 0 || i21 > length) {
            throw new IllegalArgumentException("invalid end value");
        } else if (i23 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        } else if (i22 < 0) {
            throw new IllegalArgumentException("invalid width value");
        } else if (i24 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        } else if (f12 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }

    public final Layout.Alignment a() {
        return this.f11715g;
    }

    public final int b() {
        return this.f11724p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f11717i;
    }

    public final int d() {
        return this.f11718j;
    }

    public final int e() {
        return this.f11711c;
    }

    public final int f() {
        return this.f11727s;
    }

    public final boolean g() {
        return this.f11722n;
    }

    public final int h() {
        return this.f11721m;
    }

    public final int[] i() {
        return this.f11728t;
    }

    public final int j() {
        return this.f11725q;
    }

    public final int k() {
        return this.f11726r;
    }

    public final float l() {
        return this.f11720l;
    }

    public final float m() {
        return this.f11719k;
    }

    public final int n() {
        return this.f11716h;
    }

    public final TextPaint o() {
        return this.f11712d;
    }

    public final int[] p() {
        return this.f11729u;
    }

    public final int q() {
        return this.f11710b;
    }

    public final CharSequence r() {
        return this.f11709a;
    }

    public final TextDirectionHeuristic s() {
        return this.f11714f;
    }

    public final boolean t() {
        return this.f11723o;
    }

    public final int u() {
        return this.f11713e;
    }
}
