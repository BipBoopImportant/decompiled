package Ua;

import Ea.C9068b;
import La.C9138a;
import Na.C9152a;
import Ta.C9271a;
import Ua.k;
import Ua.l;
import Ua.m;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.material.drawable.d;
import java.util.BitSet;

/* renamed from: Ua.g  reason: case insensitive filesystem */
public class C9286g extends Drawable implements n {

    /* renamed from: x  reason: collision with root package name */
    private static final String f64007x = "g";

    /* renamed from: y  reason: collision with root package name */
    private static final Paint f64008y;

    /* renamed from: a  reason: collision with root package name */
    private c f64009a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m.g[] f64010b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final m.g[] f64011c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f64012d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f64013e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f64014f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f64015g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f64016h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f64017i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f64018j;

    /* renamed from: k  reason: collision with root package name */
    private final Region f64019k;

    /* renamed from: l  reason: collision with root package name */
    private final Region f64020l;

    /* renamed from: m  reason: collision with root package name */
    private k f64021m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f64022n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f64023o;

    /* renamed from: p  reason: collision with root package name */
    private final C9271a f64024p;

    /* renamed from: q  reason: collision with root package name */
    private final l.b f64025q;

    /* renamed from: r  reason: collision with root package name */
    private final l f64026r;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuffColorFilter f64027s;

    /* renamed from: t  reason: collision with root package name */
    private PorterDuffColorFilter f64028t;

    /* renamed from: u  reason: collision with root package name */
    private int f64029u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f64030v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f64031w;

    /* renamed from: Ua.g$a */
    class a implements l.b {
        a() {
        }

        public void a(m mVar, Matrix matrix, int i10) {
            C9286g.this.f64012d.set(i10, mVar.e());
            C9286g.this.f64010b[i10] = mVar.f(matrix);
        }

        public void b(m mVar, Matrix matrix, int i10) {
            C9286g.this.f64012d.set(i10 + 4, mVar.e());
            C9286g.this.f64011c[i10] = mVar.f(matrix);
        }
    }

    /* renamed from: Ua.g$b */
    class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f64033a;

        b(float f10) {
            this.f64033a = f10;
        }

        public C9282c a(C9282c cVar) {
            return cVar instanceof i ? cVar : new C9281b(this.f64033a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f64008y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C9286g() {
        this(new k());
    }

    private float G() {
        if (P()) {
            return this.f64023o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean N() {
        c cVar = this.f64009a;
        int i10 = cVar.f64051q;
        return i10 != 1 && cVar.f64052r > 0 && (i10 == 2 || X());
    }

    private boolean O() {
        Paint.Style style = this.f64009a.f64056v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean P() {
        Paint.Style style = this.f64009a.f64056v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f64023o.getStrokeWidth() > 0.0f;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f64031w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f64030v.width() - ((float) getBounds().width()));
            int height = (int) (this.f64030v.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f64030v.width()) + (this.f64009a.f64052r * 2) + width, ((int) this.f64030v.height()) + (this.f64009a.f64052r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (float) ((getBounds().left - this.f64009a.f64052r) - width);
            float f11 = (float) ((getBounds().top - this.f64009a.f64052r) - height);
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void W(Canvas canvas) {
        canvas.translate((float) B(), (float) C());
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int l10 = l(color);
        this.f64029u = l10;
        if (l10 != color) {
            return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f64009a.f64044j != 1.0f) {
            this.f64014f.reset();
            Matrix matrix = this.f64014f;
            float f10 = this.f64009a.f64044j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f64014f);
        }
        path.computeBounds(this.f64030v, true);
    }

    private void i() {
        k y10 = E().y(new b(-G()));
        this.f64021m = y10;
        this.f64026r.e(y10, this.f64009a.f64045k, v(), this.f64016h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f64029u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    private boolean l0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f64009a.f64038d == null || (color2 = this.f64022n.getColor()) == (colorForState2 = this.f64009a.f64038d.getColorForState(iArr, color2))) {
            z10 = false;
        } else {
            this.f64022n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f64009a.f64039e == null || (color = this.f64023o.getColor()) == (colorForState = this.f64009a.f64039e.getColorForState(iArr, color))) {
            return z10;
        }
        this.f64023o.setColor(colorForState);
        return true;
    }

    public static C9286g m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C9138a.c(context, C9068b.f59352q, C9286g.class.getSimpleName()));
        }
        C9286g gVar = new C9286g();
        gVar.Q(context);
        gVar.b0(colorStateList);
        gVar.a0(f10);
        return gVar;
    }

    private boolean m0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f64027s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f64028t;
        c cVar = this.f64009a;
        this.f64027s = k(cVar.f64041g, cVar.f64042h, this.f64022n, true);
        c cVar2 = this.f64009a;
        this.f64028t = k(cVar2.f64040f, cVar2.f64042h, this.f64023o, false);
        c cVar3 = this.f64009a;
        if (cVar3.f64055u) {
            this.f64024p.d(cVar3.f64041g.getColorForState(getState(), 0));
        }
        return !H2.c.a(porterDuffColorFilter, this.f64027s) || !H2.c.a(porterDuffColorFilter2, this.f64028t);
    }

    private void n(Canvas canvas) {
        if (this.f64012d.cardinality() > 0) {
            Log.w(f64007x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f64009a.f64053s != 0) {
            canvas.drawPath(this.f64015g, this.f64024p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f64010b[i10].a(this.f64024p, this.f64009a.f64052r, canvas);
            this.f64011c[i10].a(this.f64024p, this.f64009a.f64052r, canvas);
        }
        if (this.f64031w) {
            int B10 = B();
            int C10 = C();
            canvas.translate((float) (-B10), (float) (-C10));
            canvas.drawPath(this.f64015g, f64008y);
            canvas.translate((float) B10, (float) C10);
        }
    }

    private void n0() {
        float M10 = M();
        this.f64009a.f64052r = (int) Math.ceil((double) (0.75f * M10));
        this.f64009a.f64053s = (int) Math.ceil((double) (M10 * 0.25f));
        m0();
        R();
    }

    private void o(Canvas canvas) {
        p(canvas, this.f64022n, this.f64015g, this.f64009a.f64035a, u());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF) * this.f64009a.f64045k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF v() {
        this.f64018j.set(u());
        float G10 = G();
        this.f64018j.inset(G10, G10);
        return this.f64018j;
    }

    public int A() {
        return this.f64029u;
    }

    public int B() {
        c cVar = this.f64009a;
        return (int) (((double) cVar.f64053s) * Math.sin(Math.toRadians((double) cVar.f64054t)));
    }

    public int C() {
        c cVar = this.f64009a;
        return (int) (((double) cVar.f64053s) * Math.cos(Math.toRadians((double) cVar.f64054t)));
    }

    public int D() {
        return this.f64009a.f64052r;
    }

    public k E() {
        return this.f64009a.f64035a;
    }

    public ColorStateList F() {
        return this.f64009a.f64039e;
    }

    public float H() {
        return this.f64009a.f64046l;
    }

    public ColorStateList I() {
        return this.f64009a.f64041g;
    }

    public float J() {
        return this.f64009a.f64035a.r().a(u());
    }

    public float K() {
        return this.f64009a.f64035a.t().a(u());
    }

    public float L() {
        return this.f64009a.f64050p;
    }

    public float M() {
        return w() + L();
    }

    public void Q(Context context) {
        this.f64009a.f64036b = new C9152a(context);
        n0();
    }

    public boolean S() {
        C9152a aVar = this.f64009a.f64036b;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        return this.f64009a.f64035a.u(u());
    }

    public boolean X() {
        return !T() && !this.f64015g.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public void Y(float f10) {
        setShapeAppearanceModel(this.f64009a.f64035a.w(f10));
    }

    public void Z(C9282c cVar) {
        setShapeAppearanceModel(this.f64009a.f64035a.x(cVar));
    }

    public void a0(float f10) {
        c cVar = this.f64009a;
        if (cVar.f64049o != f10) {
            cVar.f64049o = f10;
            n0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f64009a;
        if (cVar.f64038d != colorStateList) {
            cVar.f64038d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f10) {
        c cVar = this.f64009a;
        if (cVar.f64045k != f10) {
            cVar.f64045k = f10;
            this.f64013e = true;
            invalidateSelf();
        }
    }

    public void d0(int i10, int i11, int i12, int i13) {
        c cVar = this.f64009a;
        if (cVar.f64043i == null) {
            cVar.f64043i = new Rect();
        }
        this.f64009a.f64043i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f64022n.setColorFilter(this.f64027s);
        int alpha = this.f64022n.getAlpha();
        this.f64022n.setAlpha(V(alpha, this.f64009a.f64047m));
        this.f64023o.setColorFilter(this.f64028t);
        this.f64023o.setStrokeWidth(this.f64009a.f64046l);
        int alpha2 = this.f64023o.getAlpha();
        this.f64023o.setAlpha(V(alpha2, this.f64009a.f64047m));
        if (this.f64013e) {
            i();
            g(u(), this.f64015g);
            this.f64013e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f64022n.setAlpha(alpha);
        this.f64023o.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f64009a;
        if (cVar.f64048n != f10) {
            cVar.f64048n = f10;
            n0();
        }
    }

    public void f0(boolean z10) {
        this.f64031w = z10;
    }

    public void g0(int i10) {
        this.f64024p.d(i10);
        this.f64009a.f64055u = false;
        R();
    }

    public int getAlpha() {
        return this.f64009a.f64047m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f64009a;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f64009a.f64051q != 2) {
            if (T()) {
                outline.setRoundRect(getBounds(), J() * this.f64009a.f64045k);
                return;
            }
            g(u(), this.f64015g);
            d.j(outline, this.f64015g);
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f64009a.f64043i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f64019k.set(getBounds());
        g(u(), this.f64015g);
        this.f64020l.setPath(this.f64015g, this.f64019k);
        this.f64019k.op(this.f64020l, Region.Op.DIFFERENCE);
        return this.f64019k;
    }

    /* access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.f64026r;
        c cVar = this.f64009a;
        k kVar = cVar.f64035a;
        float f10 = cVar.f64045k;
        lVar.d(kVar, f10, rectF, this.f64025q, path);
    }

    public void h0(float f10, int i10) {
        k0(f10);
        j0(ColorStateList.valueOf(i10));
    }

    public void i0(float f10, ColorStateList colorStateList) {
        k0(f10);
        j0(colorStateList);
    }

    public void invalidateSelf() {
        this.f64013e = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f64009a.f64039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f64009a.f64038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f64009a.f64041g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f64009a.f64040f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            Ua.g$c r0 = r1.f64009a
            android.content.res.ColorStateList r0 = r0.f64041g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            Ua.g$c r0 = r1.f64009a
            android.content.res.ColorStateList r0 = r0.f64040f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            Ua.g$c r0 = r1.f64009a
            android.content.res.ColorStateList r0 = r0.f64039e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            Ua.g$c r0 = r1.f64009a
            android.content.res.ColorStateList r0 = r0.f64038d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ua.C9286g.isStateful():boolean");
    }

    public void j0(ColorStateList colorStateList) {
        c cVar = this.f64009a;
        if (cVar.f64039e != colorStateList) {
            cVar.f64039e = colorStateList;
            onStateChange(getState());
        }
    }

    public void k0(float f10) {
        this.f64009a.f64046l = f10;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public int l(int i10) {
        float M10 = M() + z();
        C9152a aVar = this.f64009a.f64036b;
        return aVar != null ? aVar.c(i10, M10) : i10;
    }

    public Drawable mutate() {
        this.f64009a = new c(this.f64009a);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f64013e = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10 = l0(iArr) || m0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* access modifiers changed from: protected */
    public void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f64009a.f64035a, rectF);
    }

    /* access modifiers changed from: protected */
    public void r(Canvas canvas) {
        p(canvas, this.f64023o, this.f64016h, this.f64021m, v());
    }

    public float s() {
        return this.f64009a.f64035a.j().a(u());
    }

    public void setAlpha(int i10) {
        c cVar = this.f64009a;
        if (cVar.f64047m != i10) {
            cVar.f64047m = i10;
            R();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f64009a.f64037c = colorFilter;
        R();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f64009a.f64035a = kVar;
        invalidateSelf();
    }

    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f64009a.f64041g = colorStateList;
        m0();
        R();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f64009a;
        if (cVar.f64042h != mode) {
            cVar.f64042h = mode;
            m0();
            R();
        }
    }

    public float t() {
        return this.f64009a.f64035a.l().a(u());
    }

    /* access modifiers changed from: protected */
    public RectF u() {
        this.f64017i.set(getBounds());
        return this.f64017i;
    }

    public float w() {
        return this.f64009a.f64049o;
    }

    public ColorStateList x() {
        return this.f64009a.f64038d;
    }

    public float y() {
        return this.f64009a.f64045k;
    }

    public float z() {
        return this.f64009a.f64048n;
    }

    public C9286g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public C9286g(k kVar) {
        this(new c(kVar, (C9152a) null));
    }

    protected C9286g(c cVar) {
        l lVar;
        this.f64010b = new m.g[4];
        this.f64011c = new m.g[4];
        this.f64012d = new BitSet(8);
        this.f64014f = new Matrix();
        this.f64015g = new Path();
        this.f64016h = new Path();
        this.f64017i = new RectF();
        this.f64018j = new RectF();
        this.f64019k = new Region();
        this.f64020l = new Region();
        Paint paint = new Paint(1);
        this.f64022n = paint;
        Paint paint2 = new Paint(1);
        this.f64023o = paint2;
        this.f64024p = new C9271a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f64026r = lVar;
        this.f64030v = new RectF();
        this.f64031w = true;
        this.f64009a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m0();
        l0(getState());
        this.f64025q = new a();
    }

    /* renamed from: Ua.g$c */
    protected static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        k f64035a;

        /* renamed from: b  reason: collision with root package name */
        C9152a f64036b;

        /* renamed from: c  reason: collision with root package name */
        ColorFilter f64037c;

        /* renamed from: d  reason: collision with root package name */
        ColorStateList f64038d = null;

        /* renamed from: e  reason: collision with root package name */
        ColorStateList f64039e = null;

        /* renamed from: f  reason: collision with root package name */
        ColorStateList f64040f = null;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f64041g = null;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f64042h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        Rect f64043i = null;

        /* renamed from: j  reason: collision with root package name */
        float f64044j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f64045k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        float f64046l;

        /* renamed from: m  reason: collision with root package name */
        int f64047m = 255;

        /* renamed from: n  reason: collision with root package name */
        float f64048n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        float f64049o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        float f64050p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        int f64051q = 0;

        /* renamed from: r  reason: collision with root package name */
        int f64052r = 0;

        /* renamed from: s  reason: collision with root package name */
        int f64053s = 0;

        /* renamed from: t  reason: collision with root package name */
        int f64054t = 0;

        /* renamed from: u  reason: collision with root package name */
        boolean f64055u = false;

        /* renamed from: v  reason: collision with root package name */
        Paint.Style f64056v = Paint.Style.FILL_AND_STROKE;

        public c(k kVar, C9152a aVar) {
            this.f64035a = kVar;
            this.f64036b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C9286g gVar = new C9286g(this);
            boolean unused = gVar.f64013e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f64035a = cVar.f64035a;
            this.f64036b = cVar.f64036b;
            this.f64046l = cVar.f64046l;
            this.f64037c = cVar.f64037c;
            this.f64038d = cVar.f64038d;
            this.f64039e = cVar.f64039e;
            this.f64042h = cVar.f64042h;
            this.f64041g = cVar.f64041g;
            this.f64047m = cVar.f64047m;
            this.f64044j = cVar.f64044j;
            this.f64053s = cVar.f64053s;
            this.f64051q = cVar.f64051q;
            this.f64055u = cVar.f64055u;
            this.f64045k = cVar.f64045k;
            this.f64048n = cVar.f64048n;
            this.f64049o = cVar.f64049o;
            this.f64050p = cVar.f64050p;
            this.f64052r = cVar.f64052r;
            this.f64054t = cVar.f64054t;
            this.f64040f = cVar.f64040f;
            this.f64056v = cVar.f64056v;
            if (cVar.f64043i != null) {
                this.f64043i = new Rect(cVar.f64043i);
            }
        }
    }
}
