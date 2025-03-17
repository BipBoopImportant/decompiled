package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import j0.C5445a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w2.C6210d;
import w2.C6214h;
import w2.l;
import x2.f;
import y2.C6260a;

public class f extends e {

    /* renamed from: j  reason: collision with root package name */
    static final PorterDuff.Mode f44811j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private h f44812b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffColorFilter f44813c;

    /* renamed from: d  reason: collision with root package name */
    private ColorFilter f44814d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f44815e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f44816f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f44817g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f44818h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f44819i;

    private static class b extends C0772f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f44846b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f44845a = x2.f.d(string2);
            }
            this.f44847c = l.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (l.p(xmlPullParser, "pathData")) {
                TypedArray q10 = l.q(resources, theme, attributeSet, a.f44784d);
                f(q10, xmlPullParser);
                q10.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f44866a;

        /* renamed from: b  reason: collision with root package name */
        g f44867b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f44868c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f44869d;

        /* renamed from: e  reason: collision with root package name */
        boolean f44870e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f44871f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f44872g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f44873h;

        /* renamed from: i  reason: collision with root package name */
        int f44874i;

        /* renamed from: j  reason: collision with root package name */
        boolean f44875j;

        /* renamed from: k  reason: collision with root package name */
        boolean f44876k;

        /* renamed from: l  reason: collision with root package name */
        Paint f44877l;

        h(h hVar) {
            this.f44868c = null;
            this.f44869d = f.f44811j;
            if (hVar != null) {
                this.f44866a = hVar.f44866a;
                g gVar = new g(hVar.f44867b);
                this.f44867b = gVar;
                if (hVar.f44867b.f44854e != null) {
                    gVar.f44854e = new Paint(hVar.f44867b.f44854e);
                }
                if (hVar.f44867b.f44853d != null) {
                    this.f44867b.f44853d = new Paint(hVar.f44867b.f44853d);
                }
                this.f44868c = hVar.f44868c;
                this.f44869d = hVar.f44869d;
                this.f44870e = hVar.f44870e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f44871f.getWidth() && i11 == this.f44871f.getHeight();
        }

        public boolean b() {
            return !this.f44876k && this.f44872g == this.f44868c && this.f44873h == this.f44869d && this.f44875j == this.f44870e && this.f44874i == this.f44867b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f44871f == null || !a(i10, i11)) {
                this.f44871f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f44876k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f44871f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f44877l == null) {
                Paint paint = new Paint();
                this.f44877l = paint;
                paint.setFilterBitmap(true);
            }
            this.f44877l.setAlpha(this.f44867b.getRootAlpha());
            this.f44877l.setColorFilter(colorFilter);
            return this.f44877l;
        }

        public boolean f() {
            return this.f44867b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f44867b.f();
        }

        public int getChangingConfigurations() {
            return this.f44866a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f44867b.g(iArr);
            this.f44876k |= g10;
            return g10;
        }

        public void i() {
            this.f44872g = this.f44868c;
            this.f44873h = this.f44869d;
            this.f44874i = this.f44867b.getRootAlpha();
            this.f44875j = this.f44870e;
            this.f44876k = false;
        }

        public void j(int i10, int i11) {
            this.f44871f.eraseColor(0);
            this.f44867b.b(new Canvas(this.f44871f), i10, i11, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new f(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        h() {
            this.f44868c = null;
            this.f44869d = f.f44811j;
            this.f44867b = new g();
        }
    }

    f() {
        this.f44816f = true;
        this.f44817g = new float[9];
        this.f44818h = new Matrix();
        this.f44819i = new Rect();
        this.f44812b = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (((float) Color.alpha(i10)) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f44810a = C6214h.e(resources, i10, theme);
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f44812b;
        g gVar = hVar.f44867b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f44857h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (dVar != null) {
                    if ("path".equals(name)) {
                        c cVar = new c();
                        cVar.g(resources, attributeSet, theme, xmlPullParser);
                        dVar.f44833b.add(cVar);
                        if (cVar.getPathName() != null) {
                            gVar.f44865p.put(cVar.getPathName(), cVar);
                        }
                        hVar.f44866a = cVar.f44848d | hVar.f44866a;
                        z10 = false;
                    } else if ("clip-path".equals(name)) {
                        b bVar = new b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f44833b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f44865p.put(bVar.getPathName(), bVar);
                        }
                        hVar.f44866a = bVar.f44848d | hVar.f44866a;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f44833b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f44865p.put(dVar2.getGroupName(), dVar2);
                        }
                        hVar.f44866a = dVar2.f44842k | hVar.f44866a;
                    }
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && C6260a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f44812b;
        g gVar = hVar.f44867b;
        hVar.f44869d = f(l.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g10 = l.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g10 != null) {
            hVar.f44868c = g10;
        }
        hVar.f44870e = l.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f44870e);
        gVar.f44860k = l.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f44860k);
        float j10 = l.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f44861l);
        gVar.f44861l = j10;
        if (gVar.f44860k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j10 > 0.0f) {
            gVar.f44858i = typedArray.getDimension(3, gVar.f44858i);
            float dimension = typedArray.getDimension(2, gVar.f44859j);
            gVar.f44859j = dimension;
            if (gVar.f44858i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(l.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f44863n = string;
                    gVar.f44865p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    /* access modifiers changed from: package-private */
    public Object c(String str) {
        return this.f44812b.f44867b.f44865p.get(str);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f44810a;
        if (drawable == null) {
            return false;
        }
        C6260a.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f44819i);
        if (this.f44819i.width() > 0 && this.f44819i.height() > 0) {
            ColorFilter colorFilter = this.f44814d;
            if (colorFilter == null) {
                colorFilter = this.f44813c;
            }
            canvas.getMatrix(this.f44818h);
            this.f44818h.getValues(this.f44817g);
            float abs = Math.abs(this.f44817g[0]);
            float abs2 = Math.abs(this.f44817g[4]);
            float abs3 = Math.abs(this.f44817g[1]);
            float abs4 = Math.abs(this.f44817g[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(RecyclerView.n.FLAG_MOVED, (int) (((float) this.f44819i.width()) * abs));
            int min2 = Math.min(RecyclerView.n.FLAG_MOVED, (int) (((float) this.f44819i.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f44819i;
                canvas.translate((float) rect.left, (float) rect.top);
                if (e()) {
                    canvas.translate((float) this.f44819i.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f44819i.offsetTo(0, 0);
                this.f44812b.c(min, min2);
                if (!this.f44816f) {
                    this.f44812b.j(min, min2);
                } else if (!this.f44812b.b()) {
                    this.f44812b.j(min, min2);
                    this.f44812b.i();
                }
                this.f44812b.d(canvas, colorFilter, this.f44819i);
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(boolean z10) {
        this.f44816f = z10;
    }

    public int getAlpha() {
        Drawable drawable = this.f44810a;
        return drawable != null ? C6260a.d(drawable) : this.f44812b.f44867b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f44812b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f44810a;
        return drawable != null ? C6260a.e(drawable) : this.f44814d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f44810a != null) {
            return new i(this.f44810a.getConstantState());
        }
        this.f44812b.f44866a = getChangingConfigurations();
        return this.f44812b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f44812b.f44867b.f44859j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f44812b.f44867b.f44858i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f44810a;
        return drawable != null ? C6260a.h(drawable) : this.f44812b.f44870e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f44812b.f44868c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f44812b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f44810a
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.f$h r0 = r1.f44812b
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            androidx.vectordrawable.graphics.drawable.f$h r0 = r1.f44812b
            android.content.res.ColorStateList r0 = r0.f44868c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.f.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f44815e && super.mutate() == this) {
            this.f44812b = new h(this.f44812b);
            this.f44815e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f44812b;
        ColorStateList colorStateList = hVar.f44868c;
        if (colorStateList == null || (mode = hVar.f44869d) == null) {
            z10 = false;
        } else {
            this.f44813c = i(this.f44813c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f44812b.f44867b.getRootAlpha() != i10) {
            this.f44812b.f44867b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.j(drawable, z10);
        } else {
            this.f44812b.f44870e = z10;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f44812b;
        if (hVar.f44868c != colorStateList) {
            hVar.f44868c = colorStateList;
            this.f44813c = i(this.f44813c, colorStateList, hVar.f44869d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.p(drawable, mode);
            return;
        }
        h hVar = this.f44812b;
        if (hVar.f44869d != mode) {
            hVar.f44869d = mode;
            this.f44813c = i(this.f44813c, hVar.f44868c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f44810a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f44878a;

        i(Drawable.ConstantState constantState) {
            this.f44878a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f44878a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f44878a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f44810a = (VectorDrawable) this.f44878a.newDrawable();
            return fVar;
        }

        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f44810a = (VectorDrawable) this.f44878a.newDrawable(resources);
            return fVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f44810a = (VectorDrawable) this.f44878a.newDrawable(resources, theme);
            return fVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f44814d = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$f  reason: collision with other inner class name */
    private static abstract class C0772f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected f.b[] f44845a = null;

        /* renamed from: b  reason: collision with root package name */
        String f44846b;

        /* renamed from: c  reason: collision with root package name */
        int f44847c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f44848d;

        C0772f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            f.b[] bVarArr = this.f44845a;
            if (bVarArr != null) {
                x2.f.j(bVarArr, path);
            }
        }

        public f.b[] getPathData() {
            return this.f44845a;
        }

        public String getPathName() {
            return this.f44846b;
        }

        public void setPathData(f.b[] bVarArr) {
            if (!x2.f.b(this.f44845a, bVarArr)) {
                this.f44845a = x2.f.f(bVarArr);
            } else {
                x2.f.k(this.f44845a, bVarArr);
            }
        }

        C0772f(C0772f fVar) {
            super();
            this.f44846b = fVar.f44846b;
            this.f44848d = fVar.f44848d;
            this.f44845a = x2.f.f(fVar.f44845a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f44810a;
        if (drawable != null) {
            C6260a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f44812b;
        hVar.f44867b = new g();
        TypedArray q10 = l.q(resources, theme, attributeSet, a.f44781a);
        h(q10, xmlPullParser, theme);
        q10.recycle();
        hVar.f44866a = getChangingConfigurations();
        hVar.f44876k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f44813c = i(this.f44813c, hVar.f44868c, hVar.f44869d);
    }

    f(h hVar) {
        this.f44816f = true;
        this.f44817g = new float[9];
        this.f44818h = new Matrix();
        this.f44819i = new Rect();
        this.f44812b = hVar;
        this.f44813c = i(this.f44813c, hVar.f44868c, hVar.f44869d);
    }

    private static class c extends C0772f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f44820e;

        /* renamed from: f  reason: collision with root package name */
        C6210d f44821f;

        /* renamed from: g  reason: collision with root package name */
        float f44822g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        C6210d f44823h;

        /* renamed from: i  reason: collision with root package name */
        float f44824i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f44825j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f44826k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f44827l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f44828m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f44829n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f44830o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f44831p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f44820e = null;
            if (l.p(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f44846b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f44845a = x2.f.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f44823h = l.i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f44825j = l.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f44825j);
                this.f44829n = e(l.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f44829n);
                this.f44830o = f(l.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f44830o);
                this.f44831p = l.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f44831p);
                this.f44821f = l.i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f44824i = l.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f44824i);
                this.f44822g = l.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f44822g);
                this.f44827l = l.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f44827l);
                this.f44828m = l.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f44828m);
                this.f44826k = l.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f44826k);
                this.f44847c = l.k(typedArray, xmlPullParser, "fillType", 13, this.f44847c);
            }
        }

        public boolean a() {
            return this.f44823h.i() || this.f44821f.i();
        }

        public boolean b(int[] iArr) {
            return this.f44821f.j(iArr) | this.f44823h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray q10 = l.q(resources, theme, attributeSet, a.f44783c);
            h(q10, xmlPullParser, theme);
            q10.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f44825j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f44823h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f44824i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f44821f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f44822g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f44827l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f44828m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f44826k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f10) {
            this.f44825j = f10;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i10) {
            this.f44823h.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f10) {
            this.f44824i = f10;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i10) {
            this.f44821f.k(i10);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f10) {
            this.f44822g = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f10) {
            this.f44827l = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f10) {
            this.f44828m = f10;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f10) {
            this.f44826k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f44820e = cVar.f44820e;
            this.f44821f = cVar.f44821f;
            this.f44822g = cVar.f44822g;
            this.f44824i = cVar.f44824i;
            this.f44823h = cVar.f44823h;
            this.f44847c = cVar.f44847c;
            this.f44825j = cVar.f44825j;
            this.f44826k = cVar.f44826k;
            this.f44827l = cVar.f44827l;
            this.f44828m = cVar.f44828m;
            this.f44829n = cVar.f44829n;
            this.f44830o = cVar.f44830o;
            this.f44831p = cVar.f44831p;
        }
    }

    private static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f44849q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f44850a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f44851b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f44852c;

        /* renamed from: d  reason: collision with root package name */
        Paint f44853d;

        /* renamed from: e  reason: collision with root package name */
        Paint f44854e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f44855f;

        /* renamed from: g  reason: collision with root package name */
        private int f44856g;

        /* renamed from: h  reason: collision with root package name */
        final d f44857h;

        /* renamed from: i  reason: collision with root package name */
        float f44858i;

        /* renamed from: j  reason: collision with root package name */
        float f44859j;

        /* renamed from: k  reason: collision with root package name */
        float f44860k;

        /* renamed from: l  reason: collision with root package name */
        float f44861l;

        /* renamed from: m  reason: collision with root package name */
        int f44862m;

        /* renamed from: n  reason: collision with root package name */
        String f44863n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f44864o;

        /* renamed from: p  reason: collision with root package name */
        final C5445a<String, Object> f44865p;

        g() {
            this.f44852c = new Matrix();
            this.f44858i = 0.0f;
            this.f44859j = 0.0f;
            this.f44860k = 0.0f;
            this.f44861l = 0.0f;
            this.f44862m = 255;
            this.f44863n = null;
            this.f44864o = null;
            this.f44865p = new C5445a<>();
            this.f44857h = new d();
            this.f44850a = new Path();
            this.f44851b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f44832a.set(matrix);
            dVar.f44832a.preConcat(dVar.f44841j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f44833b.size(); i12++) {
                e eVar = dVar.f44833b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f44832a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof C0772f) {
                    d(dVar, (C0772f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, C0772f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = ((float) i10) / this.f44860k;
            float f11 = ((float) i11) / this.f44861l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f44832a;
            this.f44852c.set(matrix);
            this.f44852c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 != 0.0f) {
                fVar.d(this.f44850a);
                Path path = this.f44850a;
                this.f44851b.reset();
                if (fVar.c()) {
                    this.f44851b.setFillType(fVar.f44847c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f44851b.addPath(path, this.f44852c);
                    canvas.clipPath(this.f44851b);
                    return;
                }
                c cVar = (c) fVar;
                float f12 = cVar.f44826k;
                if (!(f12 == 0.0f && cVar.f44827l == 1.0f)) {
                    float f13 = cVar.f44828m;
                    float f14 = (f12 + f13) % 1.0f;
                    float f15 = (cVar.f44827l + f13) % 1.0f;
                    if (this.f44855f == null) {
                        this.f44855f = new PathMeasure();
                    }
                    this.f44855f.setPath(this.f44850a, false);
                    float length = this.f44855f.getLength();
                    float f16 = f14 * length;
                    float f17 = f15 * length;
                    path.reset();
                    if (f16 > f17) {
                        this.f44855f.getSegment(f16, length, path, true);
                        this.f44855f.getSegment(0.0f, f17, path, true);
                    } else {
                        this.f44855f.getSegment(f16, f17, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f44851b.addPath(path, this.f44852c);
                if (cVar.f44823h.l()) {
                    C6210d dVar2 = cVar.f44823h;
                    if (this.f44854e == null) {
                        Paint paint = new Paint(1);
                        this.f44854e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f44854e;
                    if (dVar2.h()) {
                        Shader f18 = dVar2.f();
                        f18.setLocalMatrix(this.f44852c);
                        paint2.setShader(f18);
                        paint2.setAlpha(Math.round(cVar.f44825j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(f.a(dVar2.e(), cVar.f44825j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f44851b.setFillType(cVar.f44847c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f44851b, paint2);
                }
                if (cVar.f44821f.l()) {
                    C6210d dVar3 = cVar.f44821f;
                    if (this.f44853d == null) {
                        Paint paint3 = new Paint(1);
                        this.f44853d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f44853d;
                    Paint.Join join = cVar.f44830o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f44829n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f44831p);
                    if (dVar3.h()) {
                        Shader f19 = dVar3.f();
                        f19.setLocalMatrix(this.f44852c);
                        paint4.setShader(f19);
                        paint4.setAlpha(Math.round(cVar.f44824i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(f.a(dVar3.e(), cVar.f44824i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f44822g * min * e10);
                    canvas.drawPath(this.f44851b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f44857h, f44849q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f44864o == null) {
                this.f44864o = Boolean.valueOf(this.f44857h.a());
            }
            return this.f44864o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f44857h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f44862m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f44862m = i10;
        }

        g(g gVar) {
            this.f44852c = new Matrix();
            this.f44858i = 0.0f;
            this.f44859j = 0.0f;
            this.f44860k = 0.0f;
            this.f44861l = 0.0f;
            this.f44862m = 255;
            this.f44863n = null;
            this.f44864o = null;
            C5445a<String, Object> aVar = new C5445a<>();
            this.f44865p = aVar;
            this.f44857h = new d(gVar.f44857h, aVar);
            this.f44850a = new Path(gVar.f44850a);
            this.f44851b = new Path(gVar.f44851b);
            this.f44858i = gVar.f44858i;
            this.f44859j = gVar.f44859j;
            this.f44860k = gVar.f44860k;
            this.f44861l = gVar.f44861l;
            this.f44856g = gVar.f44856g;
            this.f44862m = gVar.f44862m;
            this.f44863n = gVar.f44863n;
            String str = gVar.f44863n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f44864o = gVar.f44864o;
        }
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f44832a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f44833b;

        /* renamed from: c  reason: collision with root package name */
        float f44834c;

        /* renamed from: d  reason: collision with root package name */
        private float f44835d;

        /* renamed from: e  reason: collision with root package name */
        private float f44836e;

        /* renamed from: f  reason: collision with root package name */
        private float f44837f;

        /* renamed from: g  reason: collision with root package name */
        private float f44838g;

        /* renamed from: h  reason: collision with root package name */
        private float f44839h;

        /* renamed from: i  reason: collision with root package name */
        private float f44840i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f44841j;

        /* renamed from: k  reason: collision with root package name */
        int f44842k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f44843l;

        /* renamed from: m  reason: collision with root package name */
        private String f44844m;

        d(d dVar, C5445a<String, Object> aVar) {
            super();
            C0772f fVar;
            this.f44832a = new Matrix();
            this.f44833b = new ArrayList<>();
            this.f44834c = 0.0f;
            this.f44835d = 0.0f;
            this.f44836e = 0.0f;
            this.f44837f = 1.0f;
            this.f44838g = 1.0f;
            this.f44839h = 0.0f;
            this.f44840i = 0.0f;
            Matrix matrix = new Matrix();
            this.f44841j = matrix;
            this.f44844m = null;
            this.f44834c = dVar.f44834c;
            this.f44835d = dVar.f44835d;
            this.f44836e = dVar.f44836e;
            this.f44837f = dVar.f44837f;
            this.f44838g = dVar.f44838g;
            this.f44839h = dVar.f44839h;
            this.f44840i = dVar.f44840i;
            this.f44843l = dVar.f44843l;
            String str = dVar.f44844m;
            this.f44844m = str;
            this.f44842k = dVar.f44842k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f44841j);
            ArrayList<e> arrayList = dVar.f44833b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f44833b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f44833b.add(fVar);
                    String str2 = fVar.f44846b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f44841j.reset();
            this.f44841j.postTranslate(-this.f44835d, -this.f44836e);
            this.f44841j.postScale(this.f44837f, this.f44838g);
            this.f44841j.postRotate(this.f44834c, 0.0f, 0.0f);
            this.f44841j.postTranslate(this.f44839h + this.f44835d, this.f44840i + this.f44836e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f44843l = null;
            this.f44834c = l.j(typedArray, xmlPullParser, "rotation", 5, this.f44834c);
            this.f44835d = typedArray.getFloat(1, this.f44835d);
            this.f44836e = typedArray.getFloat(2, this.f44836e);
            this.f44837f = l.j(typedArray, xmlPullParser, "scaleX", 3, this.f44837f);
            this.f44838g = l.j(typedArray, xmlPullParser, "scaleY", 4, this.f44838g);
            this.f44839h = l.j(typedArray, xmlPullParser, "translateX", 6, this.f44839h);
            this.f44840i = l.j(typedArray, xmlPullParser, "translateY", 7, this.f44840i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f44844m = string;
            }
            d();
        }

        public boolean a() {
            for (int i10 = 0; i10 < this.f44833b.size(); i10++) {
                if (this.f44833b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f44833b.size(); i10++) {
                z10 |= this.f44833b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray q10 = l.q(resources, theme, attributeSet, a.f44782b);
            e(q10, xmlPullParser);
            q10.recycle();
        }

        public String getGroupName() {
            return this.f44844m;
        }

        public Matrix getLocalMatrix() {
            return this.f44841j;
        }

        public float getPivotX() {
            return this.f44835d;
        }

        public float getPivotY() {
            return this.f44836e;
        }

        public float getRotation() {
            return this.f44834c;
        }

        public float getScaleX() {
            return this.f44837f;
        }

        public float getScaleY() {
            return this.f44838g;
        }

        public float getTranslateX() {
            return this.f44839h;
        }

        public float getTranslateY() {
            return this.f44840i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f44835d) {
                this.f44835d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f44836e) {
                this.f44836e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f44834c) {
                this.f44834c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f44837f) {
                this.f44837f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f44838g) {
                this.f44838g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f44839h) {
                this.f44839h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f44840i) {
                this.f44840i = f10;
                d();
            }
        }

        d() {
            super();
            this.f44832a = new Matrix();
            this.f44833b = new ArrayList<>();
            this.f44834c = 0.0f;
            this.f44835d = 0.0f;
            this.f44836e = 0.0f;
            this.f44837f = 1.0f;
            this.f44838g = 1.0f;
            this.f44839h = 0.0f;
            this.f44840i = 0.0f;
            this.f44841j = new Matrix();
            this.f44844m = null;
        }
    }
}
