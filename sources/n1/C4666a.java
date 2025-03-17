package N1;

import O1.H;
import O1.f0;
import P1.h;
import V1.c;
import V1.d;
import V1.g;
import Y1.i;
import Y1.k;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import c2.C5267b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import o1.C5667g;
import o1.C5669i;
import o1.C5674n;
import p1.C5702H;
import p1.C5728l0;
import p1.C5732n0;
import p1.U0;
import p1.Y;
import p1.b1;
import p1.g1;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u0006*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJQ\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J*\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020-2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108J,\u0010=\u001a\u00020\u00182\u0006\u00109\u001a\u0002032\u0006\u0010;\u001a\u00020:2\b\b\u0001\u0010<\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020-2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\bD\u00108J\u001d\u0010E\u001a\u0002032\u0006\u00106\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010IJ\u0017\u0010K\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010IJ\u0017\u0010L\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bL\u0010IJ\u0017\u0010M\u001a\u00020%2\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010IJ\u0017\u0010N\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\bS\u0010OJ\u001f\u0010U\u001a\u00020%2\u0006\u00106\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0006H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020W2\u0006\u00106\u001a\u00020\u0004H\u0016¢\u0006\u0004\bZ\u0010YJH\u0010e\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020[2\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010d\u001a\u00020cH\u0016ø\u0001\u0000¢\u0006\u0004\be\u0010fJP\u0010j\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010h\u001a\u00020g2\u0006\u0010i\u001a\u00020%2\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010_2\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010d\u001a\u00020cH\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\u0019\u001a\u0004\bp\u0010qR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bH\u0010r\u001a\u0004\bs\u0010tR\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010yR\"\u0010\u0001\u001a\u00020{8\u0000X\u0004¢\u0006\u0013\n\u0004\bj\u0010|\u0012\u0005\b\u0010\u0001\u001a\u0004\b}\u0010~R(\u0010\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020%8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020%8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020%8VX\u0004¢\u0006\u0007\u001a\u0005\bl\u0010\u0001R\u0016\u0010\u0001\u001a\u00020%8VX\u0004¢\u0006\u0007\u001a\u0005\bu\u0010\u0001R\u0017\u0010\u0001\u001a\u00020%8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020%8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00068VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010tR\u0016\u0010\u0001\u001a\u00020\u00048VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010qR \u0010\u0001\u001a\u00030\u00018@X\u0004¢\u0006\u0010\u0012\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"LN1/a;", "LN1/s;", "LV1/d;", "paragraphIntrinsics", "", "maxLines", "", "ellipsis", "Lc2/b;", "constraints", "<init>", "(LV1/d;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LO1/f0;", "", "LX1/b;", "F", "(LO1/f0;)[LX1/b;", "Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "H", "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "Lp1/n0;", "canvas", "LXH/N;", "I", "(Lp1/n0;)V", "alignment", "justificationMode", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "D", "(IILandroid/text/TextUtils$TruncateAt;IIIII)LO1/f0;", "", "vertical", "s", "(F)I", "Lo1/g;", "position", "m", "(J)I", "Lo1/i;", "rect", "LN1/I;", "granularity", "LN1/M;", "inclusionStrategy", "LN1/W;", "C", "(Lo1/i;ILN1/M;)J", "offset", "e", "(I)Lo1/i;", "range", "", "array", "arrayStart", "w", "(J[FI)V", "start", "end", "Lp1/U0;", "t", "(II)Lp1/U0;", "j", "k", "(I)J", "lineIndex", "c", "(I)F", "b", "i", "E", "A", "n", "(I)I", "visibleEnd", "o", "(IZ)I", "y", "usePrimaryDirection", "u", "(IZ)F", "LY1/i;", "h", "(I)LY1/i;", "z", "Lp1/v0;", "color", "Lp1/g1;", "shadow", "LY1/k;", "textDecoration", "Lr1/g;", "drawStyle", "Lp1/d0;", "blendMode", "v", "(Lp1/n0;JLp1/g1;LY1/k;Lr1/g;I)V", "Lp1/l0;", "brush", "alpha", "f", "(Lp1/n0;Lp1/l0;FLp1/g1;LY1/k;Lr1/g;I)V", "a", "LV1/d;", "getParagraphIntrinsics", "()LV1/d;", "getMaxLines", "()I", "Z", "getEllipsis", "()Z", "d", "J", "getConstraints-msEJaDk", "()J", "LO1/f0;", "layout", "", "Ljava/lang/CharSequence;", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getCharSequence$ui_text_release$annotations", "()V", "charSequence", "", "g", "Ljava/util/List;", "B", "()Ljava/util/List;", "placeholderRects", "getWidth", "()F", "width", "getHeight", "height", "maxIntrinsicWidth", "minIntrinsicWidth", "l", "firstBaseline", "x", "lastBaseline", "r", "didExceedMaxLines", "p", "lineCount", "LV1/g;", "G", "()LV1/g;", "getTextPaint$ui_text_release$annotations", "textPaint", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.a  reason: case insensitive filesystem */
public final class C4666a implements C4683s {

    /* renamed from: a  reason: collision with root package name */
    private final d f9428a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9429b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9430c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9431d;

    /* renamed from: e  reason: collision with root package name */
    private final f0 f9432e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f9433f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C5669i> f9434g;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N1.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0137a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9435a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Y1.i[] r0 = Y1.i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Y1.i r1 = Y1.i.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Y1.i r1 = Y1.i.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9435a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: N1.C4666a.C0137a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/RectF;", "segmentBounds", "area", "", "a", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: N1.a$b */
    static final class b extends C17544u implements p<RectF, RectF, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ M f9436c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(M m10) {
            super(2);
            this.f9436c = m10;
        }

        /* renamed from: a */
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f9436c.a(b1.f(rectF), b1.f(rectF2)));
        }
    }

    public /* synthetic */ C4666a(d dVar, int i10, boolean z10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, z10, j10);
    }

    private final f0 D(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int i17 = i12;
        int i18 = i13;
        int i19 = i14;
        int i20 = i15;
        int i21 = i16;
        CharSequence charSequence = this.f9433f;
        float width = getWidth();
        g G10 = G();
        int j10 = this.f9428a.j();
        H h10 = this.f9428a.h();
        return new f0(charSequence, width, G10, i10, truncateAt2, j10, 1.0f, 0.0f, c.b(this.f9428a.i()), true, i17, i19, i20, i21, i18, i11, (int[]) null, (int[]) null, h10, 196736, (DefaultConstructorMarker) null);
    }

    private final X1.b[] F(f0 f0Var) {
        if (!(f0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence G10 = f0Var.G();
        C17542s.h(G10, "null cannot be cast to non-null type android.text.Spanned");
        Class<X1.b> cls = X1.b.class;
        if (!H((Spanned) G10, cls)) {
            return null;
        }
        CharSequence G11 = f0Var.G();
        C17542s.h(G11, "null cannot be cast to non-null type android.text.Spanned");
        return (X1.b[]) ((Spanned) G11).getSpans(0, f0Var.G().length(), cls);
    }

    private final boolean H(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    private final void I(C5732n0 n0Var) {
        Canvas d10 = C5702H.d(n0Var);
        if (r()) {
            d10.save();
            d10.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f9432e.L(d10);
        if (r()) {
            d10.restore();
        }
    }

    public float A(int i10) {
        return this.f9432e.l(i10);
    }

    public List<C5669i> B() {
        return this.f9434g;
    }

    public long C(C5669i iVar, int i10, M m10) {
        int[] C10 = this.f9432e.C(b1.c(iVar), C4667b.r(i10), new b(m10));
        return C10 == null ? W.f9419b.a() : X.b(C10[0], C10[1]);
    }

    public float E(int i10) {
        return this.f9432e.k(i10);
    }

    public final g G() {
        return this.f9428a.k();
    }

    public float a() {
        return this.f9428a.a();
    }

    public float b(int i10) {
        return this.f9432e.u(i10);
    }

    public float c(int i10) {
        return this.f9432e.t(i10);
    }

    public float d() {
        return this.f9428a.d();
    }

    public C5669i e(int i10) {
        if (i10 < 0 || i10 >= this.f9433f.length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f9433f.length() + ')').toString());
        }
        RectF c10 = this.f9432e.c(i10);
        return new C5669i(c10.left, c10.top, c10.right, c10.bottom);
    }

    public void f(C5732n0 n0Var, C5728l0 l0Var, float f10, g1 g1Var, k kVar, r1.g gVar, int i10) {
        int b10 = G().b();
        g G10 = G();
        G10.e(l0Var, C5674n.a(getWidth(), getHeight()), f10);
        G10.h(g1Var);
        G10.i(kVar);
        G10.g(gVar);
        G10.d(i10);
        I(n0Var);
        G().d(b10);
    }

    public float getHeight() {
        return (float) this.f9432e.f();
    }

    public float getWidth() {
        return (float) C5267b.l(this.f9431d);
    }

    public i h(int i10) {
        return this.f9432e.z(this.f9432e.q(i10)) == 1 ? i.Ltr : i.Rtl;
    }

    public float i(int i10) {
        return this.f9432e.w(i10);
    }

    public C5669i j(int i10) {
        if (i10 < 0 || i10 > this.f9433f.length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f9433f.length() + ']').toString());
        }
        float B10 = f0.B(this.f9432e, i10, false, 2, (Object) null);
        int q10 = this.f9432e.q(i10);
        return new C5669i(B10, this.f9432e.w(q10), B10, this.f9432e.l(q10));
    }

    public long k(int i10) {
        P1.i I10 = this.f9432e.I();
        return X.b(h.b(I10, i10), h.a(I10, i10));
    }

    public float l() {
        return E(0);
    }

    public int m(long j10) {
        return this.f9432e.y(this.f9432e.r((int) C5667g.n(j10)), C5667g.m(j10));
    }

    public int n(int i10) {
        return this.f9432e.v(i10);
    }

    public int o(int i10, boolean z10) {
        return z10 ? this.f9432e.x(i10) : this.f9432e.p(i10);
    }

    public int p() {
        return this.f9432e.m();
    }

    public boolean r() {
        return this.f9432e.d();
    }

    public int s(float f10) {
        return this.f9432e.r((int) f10);
    }

    public U0 t(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > this.f9433f.length()) {
            throw new IllegalArgumentException(("start(" + i10 + ") or end(" + i11 + ") is out of range [0.." + this.f9433f.length() + "], or start > end!").toString());
        }
        Path path = new Path();
        this.f9432e.F(i10, i11, path);
        return Y.c(path);
    }

    public float u(int i10, boolean z10) {
        return z10 ? f0.B(this.f9432e, i10, false, 2, (Object) null) : f0.E(this.f9432e, i10, false, 2, (Object) null);
    }

    public void v(C5732n0 n0Var, long j10, g1 g1Var, k kVar, r1.g gVar, int i10) {
        int b10 = G().b();
        g G10 = G();
        G10.f(j10);
        G10.h(g1Var);
        G10.i(kVar);
        G10.g(gVar);
        G10.d(i10);
        I(n0Var);
        G().d(b10);
    }

    public void w(long j10, float[] fArr, int i10) {
        this.f9432e.a(W.l(j10), W.k(j10), fArr, i10);
    }

    public float x() {
        return E(p() - 1);
    }

    public int y(int i10) {
        return this.f9432e.q(i10);
    }

    public i z(int i10) {
        return this.f9432e.K(i10) ? i.Rtl : i.Ltr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d2, code lost:
        r11 = r11 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020e, code lost:
        r11 = r10 - ((float) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0220, code lost:
        r10 = new o1.C5669i(r7, r11, r8, ((float) r6.b()) + r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C4666a(V1.d r25, int r26, boolean r27, long r28) {
        /*
            r24 = this;
            r9 = r24
            r10 = r26
            r11 = r27
            r24.<init>()
            r0 = r25
            r9.f9428a = r0
            r9.f9429b = r10
            r9.f9430c = r11
            r12 = r28
            r9.f9431d = r12
            int r1 = c2.C5267b.m(r28)
            if (r1 != 0) goto L_0x0241
            int r1 = c2.C5267b.n(r28)
            if (r1 != 0) goto L_0x0241
            r14 = 1
            if (r10 < r14) goto L_0x0239
            N1.Y r15 = r25.i()
            boolean r1 = N1.C4667b.l(r15, r11)
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r0 = r25.f()
            java.lang.CharSequence r0 = N1.C4667b.j(r0)
            goto L_0x003b
        L_0x0037:
            java.lang.CharSequence r0 = r25.f()
        L_0x003b:
            r9.f9433f = r0
            int r0 = r15.z()
            int r16 = N1.C4667b.m(r0)
            int r0 = r15.z()
            Y1.j$a r1 = Y1.j.f14783b
            int r1 = r1.c()
            boolean r17 = Y1.j.k(r0, r1)
            N1.y r0 = r15.v()
            int r0 = r0.c()
            int r18 = N1.C4667b.o(r0)
            int r0 = r15.r()
            int r0 = Y1.f.j(r0)
            int r19 = N1.C4667b.n(r0)
            int r0 = r15.r()
            int r0 = Y1.f.k(r0)
            int r20 = N1.C4667b.p(r0)
            int r0 = r15.r()
            int r0 = Y1.f.l(r0)
            int r21 = N1.C4667b.q(r0)
            r22 = 0
            if (r11 == 0) goto L_0x008c
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r23 = r0
            goto L_0x008e
        L_0x008c:
            r23 = r22
        L_0x008e:
            r0 = r24
            r1 = r16
            r2 = r17
            r3 = r23
            r4 = r26
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            O1.f0 r0 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L_0x00d9
            int r1 = r0.f()
            int r2 = c2.C5267b.k(r28)
            if (r1 <= r2) goto L_0x00d9
            if (r10 <= r14) goto L_0x00d9
            int r1 = c2.C5267b.k(r28)
            int r1 = N1.C4667b.k(r0, r1)
            if (r1 < 0) goto L_0x00d6
            if (r1 == r10) goto L_0x00d6
            int r4 = tI.C17978n.e(r1, r14)
            r0 = r24
            r1 = r16
            r2 = r17
            r3 = r23
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            O1.f0 r0 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00d6:
            r9.f9432e = r0
            goto L_0x00db
        L_0x00d9:
            r9.f9432e = r0
        L_0x00db:
            V1.g r0 = r24.G()
            p1.l0 r1 = r15.g()
            float r2 = r24.getWidth()
            float r3 = r24.getHeight()
            long r2 = o1.C5674n.a(r2, r3)
            float r4 = r15.d()
            r0.e(r1, r2, r4)
            O1.f0 r0 = r9.f9432e
            X1.b[] r0 = r9.F(r0)
            if (r0 == 0) goto L_0x011e
            java.util.Iterator r0 = kotlin.jvm.internal.C17527c.a(r0)
        L_0x0102:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011e
            java.lang.Object r1 = r0.next()
            X1.b r1 = (X1.b) r1
            float r2 = r24.getWidth()
            float r3 = r24.getHeight()
            long r2 = o1.C5674n.a(r2, r3)
            r1.c(r2)
            goto L_0x0102
        L_0x011e:
            java.lang.CharSequence r0 = r9.f9433f
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x012a
            java.util.List r0 = YH.C16877v.n()
            goto L_0x0236
        L_0x012a:
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r0 = r0.length()
            java.lang.Class<Q1.j> r2 = Q1.j.class
            r3 = 0
            java.lang.Object[] r0 = r1.getSpans(r3, r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r0.length
            r2.<init>(r4)
            int r4 = r0.length
            r5 = r3
        L_0x0140:
            if (r5 >= r4) goto L_0x0235
            r6 = r0[r5]
            Q1.j r6 = (Q1.j) r6
            int r7 = r1.getSpanStart(r6)
            int r8 = r1.getSpanEnd(r6)
            O1.f0 r10 = r9.f9432e
            int r10 = r10.q(r7)
            int r11 = r9.f9429b
            if (r10 < r11) goto L_0x015a
            r11 = r14
            goto L_0x015b
        L_0x015a:
            r11 = r3
        L_0x015b:
            O1.f0 r12 = r9.f9432e
            int r12 = r12.n(r10)
            if (r12 <= 0) goto L_0x016d
            O1.f0 r12 = r9.f9432e
            int r12 = r12.o(r10)
            if (r8 <= r12) goto L_0x016d
            r12 = r14
            goto L_0x016e
        L_0x016d:
            r12 = r3
        L_0x016e:
            O1.f0 r13 = r9.f9432e
            int r13 = r13.p(r10)
            if (r8 <= r13) goto L_0x0178
            r8 = r14
            goto L_0x0179
        L_0x0178:
            r8 = r3
        L_0x0179:
            if (r12 != 0) goto L_0x022c
            if (r8 != 0) goto L_0x022c
            if (r11 == 0) goto L_0x0181
            goto L_0x022c
        L_0x0181:
            Y1.i r8 = r9.z(r7)
            int[] r11 = N1.C4666a.C0137a.f9435a
            int r8 = r8.ordinal()
            r8 = r11[r8]
            r11 = 2
            if (r8 == r14) goto L_0x01a3
            if (r8 != r11) goto L_0x019d
            float r7 = r9.u(r7, r14)
            int r8 = r6.d()
            float r8 = (float) r8
            float r7 = r7 - r8
            goto L_0x01a7
        L_0x019d:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x01a3:
            float r7 = r9.u(r7, r14)
        L_0x01a7:
            int r8 = r6.d()
            float r8 = (float) r8
            float r8 = r8 + r7
            O1.f0 r12 = r9.f9432e
            int r13 = r6.c()
            switch(r13) {
                case 0: goto L_0x0217;
                case 1: goto L_0x0212;
                case 2: goto L_0x0206;
                case 3: goto L_0x01f3;
                case 4: goto L_0x01e7;
                case 5: goto L_0x01d4;
                case 6: goto L_0x01be;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected verticalAlignment"
            r0.<init>(r1)
            throw r0
        L_0x01be:
            android.graphics.Paint$FontMetricsInt r13 = r6.a()
            int r15 = r13.ascent
            int r13 = r13.descent
            int r15 = r15 + r13
            int r13 = r6.b()
            int r15 = r15 - r13
            int r15 = r15 / r11
            float r11 = (float) r15
            float r10 = r12.k(r10)
        L_0x01d2:
            float r11 = r11 + r10
            goto L_0x0220
        L_0x01d4:
            android.graphics.Paint$FontMetricsInt r11 = r6.a()
            int r11 = r11.descent
            float r11 = (float) r11
            float r10 = r12.k(r10)
            float r11 = r11 + r10
            int r10 = r6.b()
            float r10 = (float) r10
            float r11 = r11 - r10
            goto L_0x0220
        L_0x01e7:
            android.graphics.Paint$FontMetricsInt r11 = r6.a()
            int r11 = r11.ascent
            float r11 = (float) r11
            float r10 = r12.k(r10)
            goto L_0x01d2
        L_0x01f3:
            float r13 = r12.w(r10)
            float r10 = r12.l(r10)
            float r13 = r13 + r10
            int r10 = r6.b()
            float r10 = (float) r10
            float r13 = r13 - r10
            float r10 = (float) r11
            float r11 = r13 / r10
            goto L_0x0220
        L_0x0206:
            float r10 = r12.l(r10)
            int r11 = r6.b()
        L_0x020e:
            float r11 = (float) r11
            float r11 = r10 - r11
            goto L_0x0220
        L_0x0212:
            float r11 = r12.w(r10)
            goto L_0x0220
        L_0x0217:
            float r10 = r12.k(r10)
            int r11 = r6.b()
            goto L_0x020e
        L_0x0220:
            int r6 = r6.b()
            float r6 = (float) r6
            float r6 = r6 + r11
            o1.i r10 = new o1.i
            r10.<init>(r7, r11, r8, r6)
            goto L_0x022e
        L_0x022c:
            r10 = r22
        L_0x022e:
            r2.add(r10)
            int r5 = r5 + 1
            goto L_0x0140
        L_0x0235:
            r0 = r2
        L_0x0236:
            r9.f9434g = r0
            return
        L_0x0239:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            r0.<init>(r1)
            throw r0
        L_0x0241:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.C4666a.<init>(V1.d, int, boolean, long):void");
    }
}
