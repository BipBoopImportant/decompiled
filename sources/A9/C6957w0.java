package a9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.w0  reason: case insensitive filesystem */
public final class C6957w0 {

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap f42912h;

    /* renamed from: a  reason: collision with root package name */
    public final C3 f42913a;

    /* renamed from: b  reason: collision with root package name */
    public final Canvas f42914b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f42915c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f42916d;

    /* renamed from: e  reason: collision with root package name */
    public final Paint f42917e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f42918f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final Rect f42919g = new Rect();

    static {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        f42912h = createBitmap;
    }

    public C6957w0(int i10, int i11) {
        C3 c32 = new C3();
        Canvas canvas = new Canvas();
        C17542s.j(c32, "bitmapInstantiable");
        C17542s.j(canvas, "canvas");
        this.f42913a = c32;
        this.f42914b = canvas;
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        this.f42916d = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f42917e = paint2;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        C17542s.j(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, config);
        C17542s.i(createBitmap, "createBitmap(width, height, config)");
        this.f42915c = createBitmap;
        canvas.setBitmap(createBitmap);
    }

    public final void a(int i10, int i11) {
        Bitmap bitmap;
        if (!(i10 == this.f42915c.getWidth() && i11 == this.f42915c.getHeight())) {
            if (i10 < 1 || i11 < 1) {
                bitmap = f42912h;
            } else {
                try {
                    this.f42915c.reconfigure(i10, i11, Bitmap.Config.ARGB_8888);
                } catch (IllegalArgumentException unused) {
                    C3 c32 = this.f42913a;
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    c32.getClass();
                    C17542s.j(config, "config");
                    bitmap = Bitmap.createBitmap(i10, i11, config);
                    C17542s.i(bitmap, "createBitmap(width, height, config)");
                }
                this.f42914b.setBitmap(this.f42915c);
            }
            this.f42915c = bitmap;
            this.f42914b.setBitmap(this.f42915c);
        }
        this.f42915c.eraseColor(0);
    }
}
