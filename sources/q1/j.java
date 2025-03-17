package Q1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 52\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b#\u0010'R$\u0010,\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00128\u0006@BX.¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+R$\u0010.\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u000e¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b$\u0010'R$\u00100\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u000e¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b!\u0010'R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"LQ1/j;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "pxPerSp", "verticalAlign", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "LXH/N;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "a", "F", "b", "I", "c", "d", "e", "f", "()I", "<set-?>", "g", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "h", "widthPx", "i", "heightPx", "", "j", "Z", "isLaidOut", "k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends ReplacementSpan {

    /* renamed from: k  reason: collision with root package name */
    public static final a f12149k = new a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f12150l = 8;

    /* renamed from: a  reason: collision with root package name */
    private final float f12151a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12152b;

    /* renamed from: c  reason: collision with root package name */
    private final float f12153c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12154d;

    /* renamed from: e  reason: collision with root package name */
    private final float f12155e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12156f;

    /* renamed from: g  reason: collision with root package name */
    private Paint.FontMetricsInt f12157g;

    /* renamed from: h  reason: collision with root package name */
    private int f12158h;

    /* renamed from: i  reason: collision with root package name */
    private int f12159i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12160j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"LQ1/j$a;", "", "<init>", "()V", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.f12151a = f10;
        this.f12152b = i10;
        this.f12153c = f11;
        this.f12154d = i11;
        this.f12155e = f12;
        this.f12156f = i12;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f12157g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C17542s.z("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.f12160j) {
            return this.f12159i;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final int c() {
        return this.f12156f;
    }

    public final int d() {
        if (this.f12160j) {
            return this.f12158h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }

    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        float f10;
        int i12;
        this.f12160j = true;
        float textSize = paint.getTextSize();
        this.f12157g = paint.getFontMetricsInt();
        if (a().descent > a().ascent) {
            int i13 = this.f12152b;
            if (i13 == 0) {
                f10 = this.f12151a * this.f12155e;
            } else if (i13 == 1) {
                f10 = this.f12151a * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f12158h = k.a(f10);
            int i14 = this.f12154d;
            if (i14 == 0) {
                i12 = k.a(this.f12153c * this.f12155e);
            } else if (i14 == 1) {
                i12 = k.a(this.f12153c * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f12159i = i12;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = a().ascent;
                fontMetricsInt.descent = a().descent;
                fontMetricsInt.leading = a().leading;
                switch (this.f12156f) {
                    case 0:
                        if (fontMetricsInt.ascent > (-b())) {
                            fontMetricsInt.ascent = -b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                            int b10 = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = b10;
                            fontMetricsInt.descent = b10 + b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
            }
            return d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
    }
}
