package p1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.Metadata;
import p1.k1;
import p1.l1;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u0017*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001a\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\"\u0010\u001d\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u001cH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\r\u001a\u0017\u0010\u001e\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a\u001f\u0010\u001f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a\u0017\u0010!\u001a\u00020 *\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b!\u0010\"\u001a\"\u0010#\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010\r\u001a\u0017\u0010%\u001a\u00020$*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b%\u0010\"\u001a\"\u0010&\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020$H\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010\r\u001a\u0017\u0010'\u001a\u00020\u0012*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b'\u0010\u0014\u001a\u001f\u0010(\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b(\u0010\u0016\u001a\u0017\u0010*\u001a\u00020)*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b*\u0010\"\u001a\"\u0010+\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\u000f\u001a\u00020)H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010\r\u001a'\u0010.\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\u000f\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0000¢\u0006\u0004\b.\u0010/\u001a!\u00101\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\u000f\u001a\u0004\u0018\u000100H\u0000¢\u0006\u0004\b1\u00102*\n\u00103\"\u00020\u00032\u00020\u0003\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lp1/S0;", "a", "()Lp1/S0;", "Landroid/graphics/Paint;", "b", "(Landroid/graphics/Paint;)Lp1/S0;", "j", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Lp1/d0;", "mode", "LXH/N;", "l", "(Landroid/graphics/Paint;I)V", "Lp1/w0;", "value", "n", "(Landroid/graphics/Paint;Lp1/w0;)V", "", "c", "(Landroid/graphics/Paint;)F", "k", "(Landroid/graphics/Paint;F)V", "Lp1/v0;", "d", "(Landroid/graphics/Paint;)J", "m", "(Landroid/graphics/Paint;J)V", "Lp1/T0;", "v", "i", "u", "Lp1/k1;", "f", "(Landroid/graphics/Paint;)I", "r", "Lp1/l1;", "g", "s", "h", "t", "Lp1/E0;", "e", "o", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "q", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Lp1/V0;", "p", "(Landroid/graphics/Paint;Lp1/V0;)V", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class S {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27241a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f27242b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f27243c;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        static {
            /*
                android.graphics.Paint$Style[] r0 = android.graphics.Paint.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f27241a = r0
                android.graphics.Paint$Cap[] r0 = android.graphics.Paint.Cap.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r2 = 2
                android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 3
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                f27242b = r0
                android.graphics.Paint$Join[] r0 = android.graphics.Paint.Join.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f27243c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1.S.a.<clinit>():void");
        }
    }

    public static final S0 a() {
        return new Q();
    }

    public static final S0 b(Paint paint) {
        return new Q(paint);
    }

    public static final float c(Paint paint) {
        return ((float) paint.getAlpha()) / 255.0f;
    }

    public static final long d(Paint paint) {
        return C5751x0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? E0.f27183a.b() : E0.f27183a.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f27242b[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? k1.f27320b.a() : k1.f27320b.c() : k1.f27320b.b() : k1.f27320b.a();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f27243c[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? l1.f27327b.b() : l1.f27327b.c() : l1.f27327b.a() : l1.f27327b.b();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        paint.setAlpha((int) ((float) Math.rint((double) (f10 * 255.0f))));
    }

    public static final void l(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            r1.f27345a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C5700F.c(i10)));
        }
    }

    public static final void m(Paint paint, long j10) {
        paint.setColor(C5751x0.k(j10));
    }

    public static final void n(Paint paint, C5749w0 w0Var) {
        paint.setColorFilter(w0Var != null ? C5703I.b(w0Var) : null);
    }

    public static final void o(Paint paint, int i10) {
        paint.setFilterBitmap(!E0.d(i10, E0.f27183a.b()));
    }

    public static final void p(Paint paint, V0 v02) {
        U u10 = (U) v02;
        paint.setPathEffect(u10 != null ? u10.a() : null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i10) {
        k1.a aVar = k1.f27320b;
        paint.setStrokeCap(k1.g(i10, aVar.c()) ? Paint.Cap.SQUARE : k1.g(i10, aVar.b()) ? Paint.Cap.ROUND : k1.g(i10, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final void s(Paint paint, int i10) {
        l1.a aVar = l1.f27327b;
        paint.setStrokeJoin(l1.g(i10, aVar.b()) ? Paint.Join.MITER : l1.g(i10, aVar.a()) ? Paint.Join.BEVEL : l1.g(i10, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void t(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void u(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void v(Paint paint, int i10) {
        paint.setStyle(T0.d(i10, T0.f27248a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
