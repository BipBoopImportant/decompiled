package O1;

import P1.i;
import Q1.a;
import Q1.d;
import Q1.h;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010!J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b$\u0010!J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b%\u0010!J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b&\u0010!J\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b'\u0010!J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b(\u0010!J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b-\u0010*J\u0015\u0010.\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b.\u0010*J\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u0010*J\u001d\u00102\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u00101\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u000f¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00042\u0006\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u000f¢\u0006\u0004\b8\u00107J\u0015\u00109\u001a\u00020\b2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b9\u0010*J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b<\u0010*J%\u0010B\u001a\u00020A2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CJ9\u0010I\u001a\u0004\u0018\u00010\u00182\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\b2\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f0G¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020A2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bM\u0010NJ-\u0010R\u001a\u00020A2\u0006\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b2\u0006\u0010L\u001a\u00020K2\u0006\u0010Q\u001a\u00020\b¢\u0006\u0004\bR\u0010SJ\u0015\u0010T\u001a\u00020D2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u00020A2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000fH\u0000¢\u0006\u0004\bZ\u0010[R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bM\u0010_\u001a\u0004\b`\u0010[R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bT\u0010_\u001a\u0004\ba\u0010[R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010f\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\ba\u0010_\u001a\u0004\bb\u0010[R\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010iR \u0010q\u001a\u00020k8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010l\u0012\u0004\bo\u0010p\u001a\u0004\bm\u0010nR\u0017\u0010u\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b`\u0010r\u001a\u0004\bs\u0010tR \u0010x\u001a\u00020\b8\u0000X\u0004¢\u0006\u0012\n\u0004\bm\u0010r\u0012\u0004\bw\u0010p\u001a\u0004\bv\u0010tR \u0010|\u001a\u00020\b8\u0000X\u0004¢\u0006\u0012\n\u0004\by\u0010r\u0012\u0004\b{\u0010p\u001a\u0004\bz\u0010tR\u0014\u0010}\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010BR\u0014\u0010~\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010_R\u0019\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b.\u0010\u0001R\u0015\u0010\u0001\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010rR \u0010\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b+\u0010\u0001R\u0016\u0010E\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b9\u0010\u0001R\u001b\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b0\u0010\u0001R\u0017\u0010\u0001\u001a\u00030\u00018BX\u0004¢\u0006\u0007\u001a\u0005\by\u0010\u0001R\u0013\u0010\u0001\u001a\u00020g8F¢\u0006\u0007\u001a\u0005\br\u0010\u0001R\u0014\u0010\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0012\u0010\u0001\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bh\u0010t¨\u0006\u0001"}, d2 = {"LO1/f0;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "LO1/H;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILO1/H;)V", "line", "g", "(I)F", "lineIndex", "t", "u", "w", "l", "k", "s", "v", "(I)I", "p", "x", "o", "n", "vertical", "r", "horizontal", "y", "(IF)I", "offset", "upstream", "A", "(IZ)F", "D", "q", "K", "(I)Z", "z", "start", "end", "Landroid/graphics/Path;", "dest", "LXH/N;", "F", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "rect", "granularity", "Lkotlin/Function2;", "inclusionStrategy", "C", "(Landroid/graphics/RectF;ILnI/p;)[I", "", "array", "b", "(I[F)V", "startOffset", "endOffset", "arrayStart", "a", "(II[FI)V", "c", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "canvas", "L", "(Landroid/graphics/Canvas;)V", "J", "()Z", "Landroid/text/TextPaint;", "H", "()Landroid/text/TextPaint;", "Z", "h", "e", "d", "LO1/H;", "getLayoutIntrinsics", "()LO1/H;", "didExceedMaxLines", "LP1/i;", "f", "LP1/i;", "backingWordIterator", "Landroid/text/Layout;", "Landroid/text/Layout;", "i", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "layout", "I", "m", "()I", "lineCount", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "topPadding", "j", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "bottomPadding", "leftPadding", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "lastLineExtra", "", "LQ1/h;", "[LQ1/h;", "lineHeightSpans", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "LO1/G;", "LO1/G;", "backingLayoutHelper", "()LO1/G;", "layoutHelper", "()LP1/i;", "wordIterator", "G", "()Ljava/lang/CharSequence;", "text", "height", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f11736a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11737b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11738c;

    /* renamed from: d  reason: collision with root package name */
    private final H f11739d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11740e;

    /* renamed from: f  reason: collision with root package name */
    private i f11741f;

    /* renamed from: g  reason: collision with root package name */
    private final Layout f11742g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11743h;

    /* renamed from: i  reason: collision with root package name */
    private final int f11744i;

    /* renamed from: j  reason: collision with root package name */
    private final int f11745j;

    /* renamed from: k  reason: collision with root package name */
    private final float f11746k;

    /* renamed from: l  reason: collision with root package name */
    private final float f11747l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f11748m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint.FontMetricsInt f11749n;

    /* renamed from: o  reason: collision with root package name */
    private final int f11750o;

    /* renamed from: p  reason: collision with root package name */
    private final h[] f11751p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f11752q;

    /* renamed from: r  reason: collision with root package name */
    private G f11753r;

    public f0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, H h10) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z12;
        boolean z13;
        Layout layout;
        boolean z14;
        CharSequence charSequence2 = charSequence;
        float f13 = f10;
        this.f11736a = textPaint;
        this.f11737b = z10;
        this.f11738c = z11;
        this.f11739d = h10;
        this.f11752q = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic k10 = h0.k(i11);
        Layout.Alignment a10 = d0.f11730a.a(i10);
        boolean z15 = (charSequence2 instanceof Spanned) && ((Spanned) charSequence2).nextSpanTransition(-1, length, a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a11 = h10.a();
            double d10 = (double) f13;
            int ceil = (int) ((float) Math.ceil(d10));
            if (a11 == null || h10.b() > f13 || z15) {
                z13 = true;
                this.f11748m = false;
                z12 = false;
                textDirectionHeuristic = k10;
                layout = a0.f11706a.a(charSequence, textPaint, ceil, 0, charSequence.length(), k10, a10, i12, truncateAt, (int) ((float) Math.ceil(d10)), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.f11748m = true;
                z13 = true;
                layout = C4777k.f11757a.a(charSequence, textPaint, ceil, a11, a10, z10, z11, truncateAt, ceil);
                textDirectionHeuristic = k10;
                z12 = false;
            }
            this.f11742g = layout;
            Trace.endSection();
            int i18 = i12;
            int min = Math.min(layout.getLineCount(), i18);
            this.f11743h = min;
            int i19 = min - 1;
            if (min >= i18 && (layout.getEllipsisCount(i19) > 0 || layout.getLineEnd(i19) != charSequence.length())) {
                z14 = z13;
            } else {
                z14 = z12;
            }
            this.f11740e = z14;
            long f14 = h0.l(this);
            h[] d11 = h0.j(this);
            this.f11751p = d11;
            long c10 = d11 != null ? h0.i(d11) : h0.f11755b;
            this.f11744i = Math.max(i0.c(f14), i0.c(c10));
            this.f11745j = Math.max(i0.b(f14), i0.b(c10));
            Paint.FontMetricsInt b10 = h0.h(this, textPaint, textDirectionHeuristic, d11);
            this.f11750o = b10 != null ? b10.bottom - ((int) s(i19)) : z12;
            this.f11749n = b10;
            this.f11746k = d.b(layout, i19, (Paint) null, 2, (Object) null);
            this.f11747l = d.d(layout, i19, (Paint) null, 2, (Object) null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float B(f0 f0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return f0Var.A(i10, z10);
    }

    public static /* synthetic */ float E(f0 f0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return f0Var.D(i10, z10);
    }

    private final float g(int i10) {
        if (i10 == this.f11743h - 1) {
            return this.f11746k + this.f11747l;
        }
        return 0.0f;
    }

    private final G j() {
        G g10 = this.f11753r;
        if (g10 == null) {
            G g11 = new G(this.f11742g);
            this.f11753r = g11;
            return g11;
        }
        C17542s.g(g10);
        return g10;
    }

    public final float A(int i10, boolean z10) {
        return j().c(i10, true, z10) + g(q(i10));
    }

    public final int[] C(RectF rectF, int i10, p<? super RectF, ? super RectF, Boolean> pVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C4772f.f11735a.c(this, rectF, i10, pVar);
        }
        return g0.d(this, this.f11742g, j(), rectF, i10, pVar);
    }

    public final float D(int i10, boolean z10) {
        return j().c(i10, false, z10) + g(q(i10));
    }

    public final void F(int i10, int i11, Path path) {
        this.f11742g.getSelectionPath(i10, i11, path);
        if (this.f11744i != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) this.f11744i);
        }
    }

    public final CharSequence G() {
        return this.f11742g.getText();
    }

    public final TextPaint H() {
        return this.f11736a;
    }

    public final i I() {
        i iVar = this.f11741f;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this.f11742g.getText(), 0, this.f11742g.getText().length(), this.f11736a.getTextLocale());
        this.f11741f = iVar2;
        return iVar2;
    }

    public final boolean J() {
        if (this.f11748m) {
            C4777k kVar = C4777k.f11757a;
            Layout layout = this.f11742g;
            C17542s.h(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return kVar.b((BoringLayout) layout);
        }
        a0 a0Var = a0.f11706a;
        Layout layout2 = this.f11742g;
        C17542s.h(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return a0Var.c((StaticLayout) layout2, this.f11738c);
    }

    public final boolean K(int i10) {
        return this.f11742g.isRtlCharAt(i10);
    }

    public final void L(Canvas canvas) {
        if (canvas.getClipBounds(this.f11752q)) {
            int i10 = this.f11744i;
            if (i10 != 0) {
                canvas.translate(0.0f, (float) i10);
            }
            e0 e10 = h0.f11754a;
            e10.a(canvas);
            this.f11742g.draw(e10);
            int i11 = this.f11744i;
            if (i11 != 0) {
                canvas.translate(0.0f, ((float) -1) * ((float) i11));
            }
        }
    }

    public final void a(int i10, int i11, float[] fArr, int i12) {
        float f10;
        float f11;
        int length = G().length();
        if (i10 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        } else if (i10 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        } else if (i11 <= i10) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        } else if (i11 <= length) {
            if (fArr.length - i12 >= (i11 - i10) * 4) {
                int q10 = q(i10);
                int q11 = q(i11 - 1);
                D d10 = new D(this);
                if (q10 <= q11) {
                    while (true) {
                        int v10 = v(q10);
                        int p10 = p(q10);
                        int min = Math.min(i11, p10);
                        float w10 = w(q10);
                        float l10 = l(q10);
                        boolean z10 = true;
                        if (z(q10) != 1) {
                            z10 = false;
                        }
                        for (int max = Math.max(i10, v10); max < min; max++) {
                            boolean K10 = K(max);
                            if (z10 && !K10) {
                                f11 = d10.b(max);
                                f10 = d10.c(max + 1);
                            } else if (z10 && K10) {
                                f10 = d10.d(max);
                                f11 = d10.e(max + 1);
                            } else if (z10 || !K10) {
                                f11 = d10.d(max);
                                f10 = d10.e(max + 1);
                            } else {
                                f10 = d10.b(max);
                                f11 = d10.c(max + 1);
                            }
                            fArr[i12] = f11;
                            fArr[i12 + 1] = w10;
                            fArr[i12 + 2] = f10;
                            fArr[i12 + 3] = l10;
                            i12 += 4;
                        }
                        if (q10 != q11) {
                            q10++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
            }
        } else {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
    }

    public final void b(int i10, float[] fArr) {
        float f10;
        float f11;
        int v10 = v(i10);
        int p10 = p(i10);
        if (fArr.length >= (p10 - v10) * 2) {
            D d10 = new D(this);
            int i11 = 0;
            boolean z10 = true;
            if (z(i10) != 1) {
                z10 = false;
            }
            while (v10 < p10) {
                boolean K10 = K(v10);
                if (z10 && !K10) {
                    f10 = d10.b(v10);
                    f11 = d10.c(v10 + 1);
                } else if (z10 && K10) {
                    f11 = d10.d(v10);
                    f10 = d10.e(v10 + 1);
                } else if (K10) {
                    f11 = d10.b(v10);
                    f10 = d10.c(v10 + 1);
                } else {
                    f10 = d10.d(v10);
                    f11 = d10.e(v10 + 1);
                }
                fArr[i11] = f10;
                fArr[i11 + 1] = f11;
                i11 += 2;
                v10++;
            }
            return;
        }
        throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
    }

    public final RectF c(int i10) {
        float f10;
        float f11;
        float A10;
        float A11;
        int q10 = q(i10);
        float w10 = w(q10);
        float l10 = l(q10);
        boolean z10 = z(q10) == 1;
        boolean isRtlCharAt = this.f11742g.isRtlCharAt(i10);
        if (!z10 || isRtlCharAt) {
            if (z10 && isRtlCharAt) {
                A10 = D(i10, false);
                A11 = D(i10 + 1, true);
            } else if (isRtlCharAt) {
                A10 = A(i10, false);
                A11 = A(i10 + 1, true);
            } else {
                f11 = D(i10, false);
                f10 = D(i10 + 1, true);
            }
            float f12 = A10;
            f11 = A11;
            f10 = f12;
        } else {
            f11 = A(i10, false);
            f10 = A(i10 + 1, true);
        }
        return new RectF(f11, w10, f10, l10);
    }

    public final boolean d() {
        return this.f11740e;
    }

    public final boolean e() {
        return this.f11738c;
    }

    public final int f() {
        return (this.f11740e ? this.f11742g.getLineBottom(this.f11743h - 1) : this.f11742g.getHeight()) + this.f11744i + this.f11745j + this.f11750o;
    }

    public final boolean h() {
        return this.f11737b;
    }

    public final Layout i() {
        return this.f11742g;
    }

    public final float k(int i10) {
        return ((float) this.f11744i) + ((i10 != this.f11743h + -1 || this.f11749n == null) ? (float) this.f11742g.getLineBaseline(i10) : w(i10) - ((float) this.f11749n.ascent));
    }

    public final float l(int i10) {
        if (i10 == this.f11743h - 1 && this.f11749n != null) {
            return ((float) this.f11742g.getLineBottom(i10 - 1)) + ((float) this.f11749n.bottom);
        }
        return ((float) this.f11744i) + ((float) this.f11742g.getLineBottom(i10)) + ((float) (i10 == this.f11743h + -1 ? this.f11745j : 0));
    }

    public final int m() {
        return this.f11743h;
    }

    public final int n(int i10) {
        return this.f11742g.getEllipsisCount(i10);
    }

    public final int o(int i10) {
        return this.f11742g.getEllipsisStart(i10);
    }

    public final int p(int i10) {
        return this.f11742g.getEllipsisStart(i10) == 0 ? this.f11742g.getLineEnd(i10) : this.f11742g.getText().length();
    }

    public final int q(int i10) {
        return this.f11742g.getLineForOffset(i10);
    }

    public final int r(int i10) {
        return this.f11742g.getLineForVertical(i10 - this.f11744i);
    }

    public final float s(int i10) {
        return l(i10) - w(i10);
    }

    public final float t(int i10) {
        return this.f11742g.getLineLeft(i10) + (i10 == this.f11743h + -1 ? this.f11746k : 0.0f);
    }

    public final float u(int i10) {
        return this.f11742g.getLineRight(i10) + (i10 == this.f11743h + -1 ? this.f11747l : 0.0f);
    }

    public final int v(int i10) {
        return this.f11742g.getLineStart(i10);
    }

    public final float w(int i10) {
        return ((float) this.f11742g.getLineTop(i10)) + ((float) (i10 == 0 ? 0 : this.f11744i));
    }

    public final int x(int i10) {
        if (this.f11742g.getEllipsisStart(i10) == 0) {
            return j().e(i10);
        }
        return this.f11742g.getEllipsisStart(i10) + this.f11742g.getLineStart(i10);
    }

    public final int y(int i10, float f10) {
        return this.f11742g.getOffsetForHorizontal(i10, f10 + (((float) -1) * g(i10)));
    }

    public final int z(int i10) {
        return this.f11742g.getParagraphDirection(i10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f0(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, O1.H r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r27
        L_0x000b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r8 = r3
            goto L_0x0014
        L_0x0012:
            r8 = r28
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r1 = 2
            r9 = r1
            goto L_0x001d
        L_0x001b:
            r9 = r29
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0025
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L_0x0027
        L_0x0025:
            r10 = r30
        L_0x0027:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002e
            r1 = 0
            r11 = r1
            goto L_0x0030
        L_0x002e:
            r11 = r31
        L_0x0030:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0036
            r12 = r2
            goto L_0x0038
        L_0x0036:
            r12 = r32
        L_0x0038:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 1
            r13 = r1
            goto L_0x0041
        L_0x003f:
            r13 = r33
        L_0x0041:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004a
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L_0x004c
        L_0x004a:
            r14 = r34
        L_0x004c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r15 = r2
            goto L_0x0054
        L_0x0052:
            r15 = r35
        L_0x0054:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005b
            r16 = r2
            goto L_0x005d
        L_0x005b:
            r16 = r36
        L_0x005d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0064
            r17 = r2
            goto L_0x0066
        L_0x0064:
            r17 = r37
        L_0x0066:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x006d
            r18 = r2
            goto L_0x006f
        L_0x006d:
            r18 = r38
        L_0x006f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0078
            r19 = r2
            goto L_0x007a
        L_0x0078:
            r19 = r39
        L_0x007a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0082
            r20 = r3
            goto L_0x0084
        L_0x0082:
            r20 = r40
        L_0x0084:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008c
            r21 = r3
            goto L_0x008e
        L_0x008c:
            r21 = r41
        L_0x008e:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x009f
            O1.H r0 = new O1.H
            r1 = r24
            r2 = r26
            r0.<init>(r1, r2, r9)
            r22 = r0
            goto L_0x00a5
        L_0x009f:
            r1 = r24
            r2 = r26
            r22 = r42
        L_0x00a5:
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.f0.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], O1.H, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
