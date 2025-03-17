package Ta;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import x2.C6244c;

/* renamed from: Ta.a  reason: case insensitive filesystem */
public class C9271a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f63423i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f63424j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f63425k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f63426l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f63427a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f63428b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f63429c;

    /* renamed from: d  reason: collision with root package name */
    private int f63430d;

    /* renamed from: e  reason: collision with root package name */
    private int f63431e;

    /* renamed from: f  reason: collision with root package name */
    private int f63432f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f63433g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f63434h;

    public C9271a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i11 = i10;
        float f12 = f11;
        boolean z10 = f12 < 0.0f;
        Path path = this.f63433g;
        if (z10) {
            int[] iArr = f63425k;
            iArr[0] = 0;
            iArr[1] = this.f63432f;
            iArr[2] = this.f63431e;
            iArr[3] = this.f63430d;
            float f13 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f10, f12);
            path.close();
            float f14 = (float) (-i11);
            rectF2.inset(f14, f14);
            int[] iArr2 = f63425k;
            iArr2[0] = 0;
            iArr2[1] = this.f63430d;
            iArr2[2] = this.f63431e;
            iArr2[3] = this.f63432f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f15 = 1.0f - (((float) i11) / width);
            float[] fArr = f63426l;
            fArr[1] = f15;
            fArr[2] = ((1.0f - f15) / 2.0f) + f15;
            this.f63428b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f63425k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f63434h);
            }
            canvas.drawArc(rectF, f10, f11, true, this.f63428b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += (float) i10;
        rectF.offset(0.0f, (float) (-i10));
        int[] iArr = f63423i;
        iArr[0] = this.f63432f;
        iArr[1] = this.f63431e;
        iArr[2] = this.f63430d;
        Paint paint = this.f63429c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f63424j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f63429c);
        canvas.restore();
    }

    public Paint c() {
        return this.f63427a;
    }

    public void d(int i10) {
        this.f63430d = C6244c.p(i10, 68);
        this.f63431e = C6244c.p(i10, 20);
        this.f63432f = C6244c.p(i10, 0);
        this.f63427a.setColor(this.f63430d);
    }

    public C9271a(int i10) {
        this.f63433g = new Path();
        Paint paint = new Paint();
        this.f63434h = paint;
        this.f63427a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f63428b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f63429c = new Paint(paint2);
    }
}
