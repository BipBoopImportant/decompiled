package a6;

import X5.C6723h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.f;
import r6.C8694b;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 m2\u00020\u00012\u00020\u0002:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010#J\u000f\u0010)\u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010#J\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\rJ\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010,J\u0017\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00107\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020.0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010>R\u0014\u0010A\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R\u0014\u0010B\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010LR\u0016\u0010Q\u001a\u00020J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010LR\u0016\u0010S\u001a\u00020J8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010LR\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020V8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010]R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010k\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010UR\u0018\u0010\u0014\u001a\u00020\u0013*\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010l¨\u0006n"}, d2 = {"La6/n;", "Landroid/graphics/drawable/Drawable;", "", "Landroid/graphics/Movie;", "movie", "Landroid/graphics/Bitmap$Config;", "config", "Ll6/f;", "scale", "<init>", "(Landroid/graphics/Movie;Landroid/graphics/Bitmap$Config;Ll6/f;)V", "", "g", "()Z", "Landroid/graphics/Canvas;", "canvas", "LXH/N;", "a", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "f", "(Landroid/graphics/Rect;)V", "draw", "", "repeatCount", "e", "(I)V", "La6/i;", "animatedTransformation", "d", "(La6/i;)V", "alpha", "setAlpha", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getIntrinsicWidth", "getIntrinsicHeight", "isRunning", "start", "()V", "stop", "Landroidx/vectordrawable/graphics/drawable/b;", "callback", "c", "(Landroidx/vectordrawable/graphics/drawable/b;)V", "Landroid/graphics/Movie;", "b", "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "Ll6/f;", "getScale", "()Ll6/f;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "", "Ljava/util/List;", "callbacks", "Landroid/graphics/Rect;", "currentBounds", "tempCanvasBounds", "h", "Landroid/graphics/Canvas;", "softwareCanvas", "Landroid/graphics/Bitmap;", "i", "Landroid/graphics/Bitmap;", "softwareBitmap", "", "j", "F", "softwareScale", "k", "hardwareScale", "l", "hardwareDx", "m", "hardwareDy", "n", "Z", "", "o", "J", "startTimeMillis", "p", "frameTimeMillis", "q", "I", "r", "loopIteration", "s", "La6/i;", "Landroid/graphics/Picture;", "t", "Landroid/graphics/Picture;", "animatedTransformationPicture", "La6/o;", "u", "La6/o;", "pixelOpacity", "v", "isSoftwareScalingEnabled", "(Landroid/graphics/Canvas;)Landroid/graphics/Rect;", "w", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends Drawable implements Animatable {

    /* renamed from: w  reason: collision with root package name */
    public static final a f41491w = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Movie f41492a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f41493b;

    /* renamed from: c  reason: collision with root package name */
    private final f f41494c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f41495d = new Paint(3);

    /* renamed from: e  reason: collision with root package name */
    private final List<b> f41496e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f41497f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final Rect f41498g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private Canvas f41499h;

    /* renamed from: i  reason: collision with root package name */
    private Bitmap f41500i;

    /* renamed from: j  reason: collision with root package name */
    private float f41501j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    private float f41502k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f41503l;

    /* renamed from: m  reason: collision with root package name */
    private float f41504m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f41505n;

    /* renamed from: o  reason: collision with root package name */
    private long f41506o;

    /* renamed from: p  reason: collision with root package name */
    private long f41507p;

    /* renamed from: q  reason: collision with root package name */
    private int f41508q = -1;

    /* renamed from: r  reason: collision with root package name */
    private int f41509r;

    /* renamed from: s  reason: collision with root package name */
    private i f41510s;

    /* renamed from: t  reason: collision with root package name */
    private Picture f41511t;

    /* renamed from: u  reason: collision with root package name */
    private o f41512u = o.UNCHANGED;

    /* renamed from: v  reason: collision with root package name */
    private boolean f41513v;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La6/n$a;", "", "<init>", "()V", "", "REPEAT_INFINITE", "I", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n(Movie movie, Bitmap.Config config, f fVar) {
        this.f41492a = movie;
        this.f41493b = config;
        this.f41494c = fVar;
        if (C8694b.d(config)) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    /* JADX INFO: finally extract failed */
    private final void a(Canvas canvas) {
        Canvas canvas2 = this.f41499h;
        Bitmap bitmap = this.f41500i;
        if (canvas2 != null && bitmap != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            int save = canvas2.save();
            try {
                float f10 = this.f41501j;
                canvas2.scale(f10, f10);
                this.f41492a.draw(canvas2, 0.0f, 0.0f, this.f41495d);
                Picture picture = this.f41511t;
                if (picture != null) {
                    picture.draw(canvas2);
                }
                canvas2.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.translate(this.f41503l, this.f41504m);
                    float f11 = this.f41502k;
                    canvas.scale(f11, f11);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f41495d);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } catch (Throwable th2) {
                canvas2.restoreToCount(save);
                throw th2;
            }
        }
    }

    private final Rect b(Canvas canvas) {
        Rect rect = this.f41498g;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    private final void f(Rect rect) {
        if (!C17542s.e(this.f41497f, rect)) {
            this.f41497f.set(rect);
            int width = rect.width();
            int height = rect.height();
            int width2 = this.f41492a.width();
            int height2 = this.f41492a.height();
            if (width2 > 0 && height2 > 0) {
                double d10 = C6723h.d(width2, height2, width, height, this.f41494c);
                if (!this.f41513v) {
                    d10 = C17978n.g(d10, 1.0d);
                }
                float f10 = (float) d10;
                this.f41501j = f10;
                int i10 = (int) (((float) width2) * f10);
                int i11 = (int) (f10 * ((float) height2));
                Bitmap createBitmap = Bitmap.createBitmap(i10, i11, this.f41493b);
                Bitmap bitmap = this.f41500i;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f41500i = createBitmap;
                this.f41499h = new Canvas(createBitmap);
                if (this.f41513v) {
                    this.f41502k = 1.0f;
                    this.f41503l = 0.0f;
                    this.f41504m = 0.0f;
                    return;
                }
                float d11 = (float) C6723h.d(i10, i11, width, height, this.f41494c);
                this.f41502k = d11;
                float f11 = ((float) width) - (((float) i10) * d11);
                float f12 = (float) 2;
                this.f41503l = ((float) rect.left) + (f11 / f12);
                this.f41504m = ((float) rect.top) + ((((float) height) - (d11 * ((float) i11))) / f12);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean g() {
        /*
            r7 = this;
            android.graphics.Movie r0 = r7.f41492a
            int r0 = r0.duration()
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x002f
        L_0x000b:
            boolean r2 = r7.f41505n
            if (r2 == 0) goto L_0x0015
            long r2 = android.os.SystemClock.uptimeMillis()
            r7.f41507p = r2
        L_0x0015:
            long r2 = r7.f41507p
            long r4 = r7.f41506o
            long r2 = r2 - r4
            int r2 = (int) r2
            int r3 = r2 / r0
            r7.f41509r = r3
            int r4 = r7.f41508q
            r5 = -1
            if (r4 == r5) goto L_0x0026
            if (r3 > r4) goto L_0x0027
        L_0x0026:
            r1 = 1
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            int r3 = r3 * r0
            int r0 = r2 - r3
        L_0x002c:
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x002f:
            android.graphics.Movie r2 = r7.f41492a
            r2.setTime(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.n.g():boolean");
    }

    public void c(b bVar) {
        this.f41496e.add(bVar);
    }

    public final void d(i iVar) {
        this.f41510s = iVar;
        if (iVar == null || this.f41492a.width() <= 0 || this.f41492a.height() <= 0) {
            this.f41511t = null;
            this.f41512u = o.UNCHANGED;
            this.f41513v = false;
        } else {
            Picture picture = new Picture();
            this.f41512u = iVar.a(picture.beginRecording(this.f41492a.width(), this.f41492a.height()));
            picture.endRecording();
            this.f41511t = picture;
            this.f41513v = true;
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        boolean g10 = g();
        if (this.f41513v) {
            f(b(canvas));
            int save = canvas.save();
            try {
                float f10 = ((float) 1) / this.f41501j;
                canvas.scale(f10, f10);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            f(getBounds());
            a(canvas);
        }
        if (!this.f41505n || !g10) {
            stop();
        } else {
            invalidateSelf();
        }
    }

    public final void e(int i10) {
        if (i10 >= -1) {
            this.f41508q = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid repeatCount: " + i10).toString());
    }

    public int getIntrinsicHeight() {
        return this.f41492a.height();
    }

    public int getIntrinsicWidth() {
        return this.f41492a.width();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r2.f41512u;
     */
    @XH.C16814e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOpacity() {
        /*
            r2 = this;
            android.graphics.Paint r0 = r2.f41495d
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x001e
            a6.o r0 = r2.f41512u
            a6.o r1 = a6.o.OPAQUE
            if (r0 == r1) goto L_0x001c
            a6.o r1 = a6.o.UNCHANGED
            if (r0 != r1) goto L_0x001e
            android.graphics.Movie r0 = r2.f41492a
            boolean r0 = r0.isOpaque()
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r0 = -1
            goto L_0x001f
        L_0x001e:
            r0 = -3
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.n.getOpacity():int");
    }

    public boolean isRunning() {
        return this.f41505n;
    }

    public void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
        }
        this.f41495d.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f41495d.setColorFilter(colorFilter);
    }

    public void start() {
        if (!this.f41505n) {
            this.f41505n = true;
            this.f41509r = 0;
            this.f41506o = SystemClock.uptimeMillis();
            int size = this.f41496e.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f41496e.get(i10).c(this);
            }
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f41505n) {
            this.f41505n = false;
            int size = this.f41496e.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f41496e.get(i10).b(this);
            }
        }
    }
}
