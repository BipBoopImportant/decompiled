package g2;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import i2.C5439b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 \u00012\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010#JG\u0010'\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\"\u0010L\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER\"\u0010P\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010A\u001a\u0004\bN\u0010C\"\u0004\bO\u0010ER\"\u0010T\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010C\"\u0004\bS\u0010ER\u0014\u0010V\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010*R\u001a\u0010[\u001a\u00020\n8\u0006XD¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010^\u001a\u00020\n8\u0006XD¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010ZR\u001a\u0010a\u001a\u00020\n8\u0006XD¢\u0006\f\n\u0004\b_\u0010X\u001a\u0004\b`\u0010ZR\u001a\u0010d\u001a\u00020\n8\u0006XD¢\u0006\f\n\u0004\bb\u0010X\u001a\u0004\bc\u0010ZR\u001a\u0010g\u001a\u00020\n8\u0006XD¢\u0006\f\n\u0004\be\u0010X\u001a\u0004\bf\u0010ZR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bp\u0010X\u001a\u0004\bq\u0010Z\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R&\u0010\u0001\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010X\u001a\u0005\b\u0001\u0010Z\"\u0005\b\u0001\u0010s¨\u0006\u0001"}, d2 = {"Lg2/U;", "", "", "textSize", "<init>", "(F)V", "Landroid/graphics/Canvas;", "canvas", "Li2/b;", "motionController", "", "duration", "layoutWidth", "layoutHeight", "", "drawPath", "drawTicks", "LXH/N;", "a", "(Landroid/graphics/Canvas;Li2/b;IIIZZ)V", "", "text", "Landroid/graphics/Paint;", "paint", "g", "(Ljava/lang/String;Landroid/graphics/Paint;)V", "b", "(Landroid/graphics/Canvas;)V", "mode", "keyFrames", "f", "(Landroid/graphics/Canvas;IILi2/b;II)V", "x", "y", "d", "(Landroid/graphics/Canvas;FF)V", "c", "viewWidth", "viewHeight", "e", "(Landroid/graphics/Canvas;FFIIII)V", "", "[F", "getMPoints", "()[F", "setMPoints", "([F)V", "mPoints", "", "[I", "getMPathMode", "()[I", "setMPathMode", "([I)V", "mPathMode", "getMKeyFramePoints", "setMKeyFramePoints", "mKeyFramePoints", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "getMPath", "()Landroid/graphics/Path;", "setMPath", "(Landroid/graphics/Path;)V", "mPath", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "setMPaint", "(Landroid/graphics/Paint;)V", "mPaint", "getMPaintKeyframes", "setMPaintKeyframes", "mPaintKeyframes", "getMPaintGraph", "setMPaintGraph", "mPaintGraph", "h", "getMTextPaint", "setMTextPaint", "mTextPaint", "i", "getMFillPaint", "setMFillPaint", "mFillPaint", "j", "mRectangle", "k", "I", "getMRedColor", "()I", "mRedColor", "l", "getMKeyframeColor", "mKeyframeColor", "m", "getMGraphColor", "mGraphColor", "n", "getMShadowColor", "mShadowColor", "o", "getMDiamondSize", "mDiamondSize", "Landroid/graphics/DashPathEffect;", "p", "Landroid/graphics/DashPathEffect;", "getMDashPathEffect", "()Landroid/graphics/DashPathEffect;", "setMDashPathEffect", "(Landroid/graphics/DashPathEffect;)V", "mDashPathEffect", "q", "getMKeyFrameCount", "setMKeyFrameCount", "(I)V", "mKeyFrameCount", "Landroid/graphics/Rect;", "r", "Landroid/graphics/Rect;", "getMBounds", "()Landroid/graphics/Rect;", "setMBounds", "(Landroid/graphics/Rect;)V", "mBounds", "s", "Z", "getMPresentationMode", "()Z", "setMPresentationMode", "(Z)V", "mPresentationMode", "t", "getMShadowTranslate", "setMShadowTranslate", "mShadowTranslate", "u", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class U {

    /* renamed from: u  reason: collision with root package name */
    public static final a f23622u = new a((DefaultConstructorMarker) null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f23623v = 8;

    /* renamed from: a  reason: collision with root package name */
    private float[] f23624a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f23625b;

    /* renamed from: c  reason: collision with root package name */
    private float[] f23626c;

    /* renamed from: d  reason: collision with root package name */
    private Path f23627d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f23628e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f23629f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f23630g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f23631h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f23632i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f23633j;

    /* renamed from: k  reason: collision with root package name */
    private final int f23634k = -21965;

    /* renamed from: l  reason: collision with root package name */
    private final int f23635l = -2067046;

    /* renamed from: m  reason: collision with root package name */
    private final int f23636m = -13391360;

    /* renamed from: n  reason: collision with root package name */
    private final int f23637n = 1996488704;

    /* renamed from: o  reason: collision with root package name */
    private final int f23638o = 10;

    /* renamed from: p  reason: collision with root package name */
    private DashPathEffect f23639p;

    /* renamed from: q  reason: collision with root package name */
    private int f23640q;

    /* renamed from: r  reason: collision with root package name */
    private Rect f23641r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    private boolean f23642s;

    /* renamed from: t  reason: collision with root package name */
    private int f23643t = 1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lg2/U$a;", "", "<init>", "()V", "", "DEBUG_PATH_TICKS_PER_MS", "I", "DEBUG_SHOW_NONE", "DEBUG_SHOW_PATH", "DEBUG_SHOW_PROGRESS", "MAX_KEY_FRAMES", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public U(float f10) {
        Paint paint = new Paint();
        this.f23628e = paint;
        paint.setAntiAlias(true);
        this.f23628e.setColor(-21965);
        this.f23628e.setStrokeWidth(2.0f);
        Paint paint2 = this.f23628e;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f23629f = paint3;
        paint3.setAntiAlias(true);
        this.f23629f.setColor(-2067046);
        this.f23629f.setStrokeWidth(2.0f);
        this.f23629f.setStyle(style);
        Paint paint4 = new Paint();
        this.f23630g = paint4;
        paint4.setAntiAlias(true);
        this.f23630g.setColor(-13391360);
        this.f23630g.setStrokeWidth(2.0f);
        this.f23630g.setStyle(style);
        Paint paint5 = new Paint();
        this.f23631h = paint5;
        paint5.setAntiAlias(true);
        this.f23631h.setColor(-13391360);
        this.f23631h.setTextSize(f10);
        this.f23633j = new float[8];
        Paint paint6 = new Paint();
        this.f23632i = paint6;
        paint6.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.f23639p = dashPathEffect;
        this.f23630g.setPathEffect(dashPathEffect);
        this.f23626c = new float[100];
        this.f23625b = new int[50];
        if (this.f23642s) {
            this.f23628e.setStrokeWidth(8.0f);
            this.f23632i.setStrokeWidth(8.0f);
            this.f23629f.setStrokeWidth(8.0f);
            this.f23643t = 4;
        }
    }

    private final void b(Canvas canvas) {
        float[] fArr = this.f23624a;
        C17542s.g(fArr);
        canvas.drawLines(fArr, this.f23628e);
    }

    private final void c(Canvas canvas, float f10, float f11) {
        Canvas canvas2 = canvas;
        float[] fArr = this.f23624a;
        C17542s.g(fArr);
        float f12 = fArr[0];
        float[] fArr2 = this.f23624a;
        C17542s.g(fArr2);
        float f13 = fArr2[1];
        float[] fArr3 = this.f23624a;
        C17542s.g(fArr3);
        float[] fArr4 = this.f23624a;
        C17542s.g(fArr4);
        float f14 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.f23624a;
        C17542s.g(fArr5);
        float[] fArr6 = this.f23624a;
        C17542s.g(fArr6);
        float f15 = fArr5[fArr6.length - 1];
        float min = Math.min(f12, f14);
        float max = Math.max(f13, f15);
        float min2 = f10 - Math.min(f12, f14);
        float max2 = Math.max(f13, f15) - f11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        float f16 = (float) 100;
        float f17 = f15;
        sb2.append(((float) ((int) (((double) ((f16 * min2) / Math.abs(f14 - f12))) + 0.5d))) / 100.0f);
        String sb3 = sb2.toString();
        g(sb3, this.f23631h);
        float f18 = (float) 2;
        canvas2.drawText(sb3, ((min2 / f18) - ((float) (this.f23641r.width() / 2))) + min, f11 - ((float) 20), this.f23631h);
        canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f23630g);
        String str = "" + (((float) ((int) (((double) ((f16 * max2) / Math.abs(f17 - f13))) + 0.5d))) / 100.0f);
        g(str, this.f23631h);
        canvas2.drawText(str, f10 + ((float) 5), max - ((max2 / f18) - ((float) (this.f23641r.height() / 2))), this.f23631h);
        canvas.drawLine(f10, f11, f10, Math.max(f13, f17), this.f23630g);
    }

    private final void d(Canvas canvas, float f10, float f11) {
        float f12 = f10;
        float f13 = f11;
        float[] fArr = this.f23624a;
        C17542s.g(fArr);
        float f14 = fArr[0];
        float[] fArr2 = this.f23624a;
        C17542s.g(fArr2);
        float f15 = fArr2[1];
        float[] fArr3 = this.f23624a;
        C17542s.g(fArr3);
        float[] fArr4 = this.f23624a;
        C17542s.g(fArr4);
        float f16 = fArr3[fArr4.length - 2];
        float[] fArr5 = this.f23624a;
        C17542s.g(fArr5);
        float[] fArr6 = this.f23624a;
        C17542s.g(fArr6);
        float f17 = fArr5[fArr6.length - 1];
        float hypot = (float) Math.hypot((double) (f14 - f16), (double) (f15 - f17));
        float f18 = f16 - f14;
        float f19 = f17 - f15;
        float f20 = (((f12 - f14) * f18) + ((f13 - f15) * f19)) / (hypot * hypot);
        float f21 = (f18 * f20) + f14;
        float f22 = f15 + (f20 * f19);
        Path path = new Path();
        path.moveTo(f12, f13);
        path.lineTo(f21, f22);
        float hypot2 = (float) Math.hypot((double) (f21 - f12), (double) (f22 - f13));
        String str = "" + (((float) ((int) ((((float) 100) * hypot2) / hypot))) / 100.0f);
        g(str, this.f23631h);
        canvas.drawTextOnPath(str, path, (hypot2 / ((float) 2)) - ((float) (this.f23641r.width() / 2)), -20.0f, this.f23631h);
        canvas.drawLine(f12, f13, f21, f22, this.f23630g);
    }

    private final void e(Canvas canvas, float f10, float f11, int i10, int i11, int i12, int i13) {
        Canvas canvas2 = canvas;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        float f12 = (float) 100;
        sb2.append(((float) ((int) (((double) (((f10 - ((float) (i10 / 2))) * f12) / ((float) (i12 - i10)))) + 0.5d))) / 100.0f);
        String sb3 = sb2.toString();
        g(sb3, this.f23631h);
        float f13 = (float) 2;
        canvas2.drawText(sb3, ((f10 / f13) - ((float) (this.f23641r.width() / 2))) + 0.0f, f11 - ((float) 20), this.f23631h);
        canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f23630g);
        String str = "" + (((float) ((int) (((double) ((f12 * (f11 - ((float) (i11 / 2)))) / ((float) (i13 - i11)))) + 0.5d))) / 100.0f);
        g(str, this.f23631h);
        canvas2.drawText(str, f10 + ((float) 5), 0.0f - ((f11 / f13) - ((float) (this.f23641r.height() / 2))), this.f23631h);
        canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f23630g);
    }

    private final void f(Canvas canvas, int i10, int i11, C5439b bVar, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        float f10;
        float f11;
        int i17;
        Canvas canvas2 = canvas;
        int i18 = i10;
        if (bVar.r() != null) {
            i15 = bVar.r().B();
            i14 = bVar.r().k();
        } else {
            i15 = 0;
            i14 = 0;
        }
        int i19 = i11 - 1;
        int i20 = 1;
        while (i20 < i19) {
            if (i18 == 4 && this.f23625b[i20 - 1] == 0) {
                i16 = i20;
            } else {
                float[] fArr = this.f23626c;
                int i21 = i20 * 2;
                float f12 = fArr[i21];
                float f13 = fArr[i21 + 1];
                Path path = this.f23627d;
                C17542s.g(path);
                path.reset();
                Path path2 = this.f23627d;
                C17542s.g(path2);
                path2.moveTo(f12, ((float) this.f23638o) + f13);
                Path path3 = this.f23627d;
                C17542s.g(path3);
                path3.lineTo(((float) this.f23638o) + f12, f13);
                Path path4 = this.f23627d;
                C17542s.g(path4);
                path4.lineTo(f12, f13 - ((float) this.f23638o));
                Path path5 = this.f23627d;
                C17542s.g(path5);
                path5.lineTo(f12 - ((float) this.f23638o), f13);
                Path path6 = this.f23627d;
                C17542s.g(path6);
                path6.close();
                if (i18 == 4) {
                    int i22 = this.f23625b[i20 - 1];
                    if (i22 == 1) {
                        d(canvas2, f12 - 0.0f, f13 - 0.0f);
                    } else if (i22 == 0) {
                        c(canvas2, f12 - 0.0f, f13 - 0.0f);
                    } else if (i22 == 2) {
                        f11 = f13;
                        f10 = f12;
                        i17 = 2;
                        i16 = i20;
                        e(canvas, f12 - 0.0f, f13 - 0.0f, i15, i14, i12, i13);
                        Path path7 = this.f23627d;
                        C17542s.g(path7);
                        canvas2.drawPath(path7, this.f23632i);
                    }
                    f11 = f13;
                    f10 = f12;
                    i17 = 2;
                    i16 = i20;
                    Path path72 = this.f23627d;
                    C17542s.g(path72);
                    canvas2.drawPath(path72, this.f23632i);
                } else {
                    f11 = f13;
                    f10 = f12;
                    i17 = 2;
                    i16 = i20;
                }
                if (i18 == i17) {
                    d(canvas2, f10 - 0.0f, f11 - 0.0f);
                }
                if (i18 == 3) {
                    c(canvas2, f10 - 0.0f, f11 - 0.0f);
                }
                if (i18 == 6) {
                    e(canvas, f10 - 0.0f, f11 - 0.0f, i15, i14, i12, i13);
                }
                Path path8 = this.f23627d;
                C17542s.g(path8);
                canvas2.drawPath(path8, this.f23632i);
            }
            i20 = i16 + 1;
        }
        float[] fArr2 = this.f23624a;
        C17542s.g(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.f23624a;
            C17542s.g(fArr3);
            float f14 = fArr3[0];
            float[] fArr4 = this.f23624a;
            C17542s.g(fArr4);
            canvas2.drawCircle(f14, fArr4[1], 8.0f, this.f23629f);
            float[] fArr5 = this.f23624a;
            C17542s.g(fArr5);
            float[] fArr6 = this.f23624a;
            C17542s.g(fArr6);
            float f15 = fArr5[fArr6.length - 2];
            float[] fArr7 = this.f23624a;
            C17542s.g(fArr7);
            float[] fArr8 = this.f23624a;
            C17542s.g(fArr8);
            canvas2.drawCircle(f15, fArr7[fArr8.length - 1], 8.0f, this.f23629f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.length != (r11 * 2)) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r9, i2.C5439b r10, int r11, int r12, int r13, boolean r14, boolean r15) {
        /*
            r8 = this;
            float[] r0 = r8.f23626c
            int[] r1 = r8.f23625b
            r2 = 0
            int r0 = r10.g(r0, r1, r2)
            r8.f23640q = r0
            int r11 = r11 / 16
            float[] r0 = r8.f23624a
            if (r0 == 0) goto L_0x0019
            kotlin.jvm.internal.C17542s.g(r0)
            int r0 = r0.length
            int r1 = r11 * 2
            if (r0 == r1) goto L_0x0026
        L_0x0019:
            int r0 = r11 * 2
            float[] r0 = new float[r0]
            r8.f23624a = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r8.f23627d = r0
        L_0x0026:
            int r0 = r8.f23643t
            float r1 = (float) r0
            float r0 = (float) r0
            r9.translate(r1, r0)
            android.graphics.Paint r0 = r8.f23628e
            int r1 = r8.f23637n
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.f23632i
            int r1 = r8.f23637n
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.f23629f
            int r1 = r8.f23637n
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.f23630g
            int r1 = r8.f23637n
            r0.setColor(r1)
            float[] r0 = r8.f23624a
            r10.h(r0, r11)
            if (r14 == 0) goto L_0x0053
            r8.b(r9)
        L_0x0053:
            r11 = 1
            if (r15 == 0) goto L_0x0061
            int r4 = r8.f23640q
            r1 = r8
            r2 = r9
            r3 = r11
            r5 = r10
            r6 = r12
            r7 = r13
            r1.f(r2, r3, r4, r5, r6, r7)
        L_0x0061:
            android.graphics.Paint r0 = r8.f23628e
            int r1 = r8.f23634k
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.f23629f
            int r1 = r8.f23635l
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.f23632i
            int r1 = r8.f23635l
            r0.setColor(r1)
            android.graphics.Paint r0 = r8.f23630g
            int r1 = r8.f23636m
            r0.setColor(r1)
            int r0 = r8.f23643t
            float r1 = (float) r0
            float r1 = -r1
            float r0 = (float) r0
            float r0 = -r0
            r9.translate(r1, r0)
            if (r14 == 0) goto L_0x008b
            r8.b(r9)
        L_0x008b:
            if (r15 == 0) goto L_0x0098
            int r4 = r8.f23640q
            r1 = r8
            r2 = r9
            r3 = r11
            r5 = r10
            r6 = r12
            r7 = r13
            r1.f(r2, r3, r4, r5, r6, r7)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.U.a(android.graphics.Canvas, i2.b, int, int, int, boolean, boolean):void");
    }

    public final void g(String str, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.f23641r);
    }
}
