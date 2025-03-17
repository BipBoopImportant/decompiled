package androidx.camera.view;

import C.C4391e0;
import C.G0;
import G.c;
import G.q;
import H2.i;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.PreviewView;

final class m {

    /* renamed from: i  reason: collision with root package name */
    private static final PreviewView.d f17196i = PreviewView.d.FILL_CENTER;

    /* renamed from: a  reason: collision with root package name */
    private Size f17197a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f17198b;

    /* renamed from: c  reason: collision with root package name */
    private int f17199c;

    /* renamed from: d  reason: collision with root package name */
    private Matrix f17200d;

    /* renamed from: e  reason: collision with root package name */
    private int f17201e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17202f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f17203g;

    /* renamed from: h  reason: collision with root package name */
    private PreviewView.d f17204h = f17196i;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17205a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.view.PreviewView$d[] r0 = androidx.camera.view.PreviewView.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17205a = r0
                androidx.camera.view.PreviewView$d r1 = androidx.camera.view.PreviewView.d.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17205a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.view.PreviewView$d r1 = androidx.camera.view.PreviewView.d.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17205a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.view.PreviewView$d r1 = androidx.camera.view.PreviewView.d.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17205a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.view.PreviewView$d r1 = androidx.camera.view.PreviewView.d.FILL_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17205a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.view.PreviewView$d r1 = androidx.camera.view.PreviewView.d.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17205a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.view.PreviewView$d r1 = androidx.camera.view.PreviewView.d.FILL_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.m.a.<clinit>():void");
        }
    }

    m() {
    }

    private static RectF b(RectF rectF, float f10) {
        float f11 = f10 + f10;
        return new RectF(f11 - rectF.right, rectF.top, f11 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f17203g ? this.f17199c : -c.b(this.f17201e);
    }

    private Size f() {
        return q.i(this.f17199c) ? new Size(this.f17198b.height(), this.f17198b.width()) : new Size(this.f17198b.width(), this.f17198b.height());
    }

    private RectF l(Size size, int i10) {
        i.i(m());
        Matrix j10 = j(size, i10);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f17197a.getWidth(), (float) this.f17197a.getHeight());
        j10.mapRect(rectF);
        return rectF;
    }

    private boolean m() {
        return (this.f17198b == null || this.f17197a == null || !(!this.f17203g || this.f17201e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f17205a[dVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C4391e0.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == PreviewView.d.FIT_CENTER || dVar == PreviewView.d.FIT_START || dVar == PreviewView.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    /* access modifiers changed from: package-private */
    public Bitmap a(Bitmap bitmap, Size size, int i10) {
        if (!m()) {
            return bitmap;
        }
        Matrix k10 = k();
        RectF l10 = l(size, i10);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(k10);
        matrix.postScale(l10.width() / ((float) this.f17197a.getWidth()), l10.height() / ((float) this.f17197a.getHeight()));
        matrix.postTranslate(l10.left, l10.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    /* access modifiers changed from: package-private */
    public Matrix c(Size size, int i10, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i10).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, (float) rect.width(), (float) rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* access modifiers changed from: package-private */
    public RectF d(Size size, int i10) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight());
        Size f10 = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) f10.getWidth(), (float) f10.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f17204h);
        matrix.mapRect(rectF2);
        return i10 == 1 ? b(rectF2, ((float) size.getWidth()) / 2.0f) : rectF2;
    }

    /* access modifiers changed from: package-private */
    public PreviewView.d g() {
        return this.f17204h;
    }

    /* access modifiers changed from: package-private */
    public Matrix h(Size size, int i10) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f17200d);
        matrix.postConcat(j(size, i10));
        return matrix;
    }

    /* access modifiers changed from: package-private */
    public Rect i() {
        return this.f17198b;
    }

    /* access modifiers changed from: package-private */
    public Matrix j(Size size, int i10) {
        i.i(m());
        Matrix d10 = q.d(new RectF(this.f17198b), n(size) ? new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()) : d(size, i10), this.f17199c);
        if (this.f17202f && this.f17203g) {
            if (q.i(this.f17199c)) {
                d10.preScale(1.0f, -1.0f, (float) this.f17198b.centerX(), (float) this.f17198b.centerY());
            } else {
                d10.preScale(-1.0f, 1.0f, (float) this.f17198b.centerX(), (float) this.f17198b.centerY());
            }
        }
        return d10;
    }

    /* access modifiers changed from: package-private */
    public Matrix k() {
        i.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f17197a.getWidth(), (float) this.f17197a.getHeight());
        return q.d(rectF, rectF, e());
    }

    /* access modifiers changed from: package-private */
    public boolean n(Size size) {
        return q.k(size, true, f(), false);
    }

    /* access modifiers changed from: package-private */
    public void o(int i10, int i11) {
        if (this.f17203g) {
            this.f17199c = i10;
            this.f17201e = i11;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(PreviewView.d dVar) {
        this.f17204h = dVar;
    }

    /* access modifiers changed from: package-private */
    public void r(G0.h hVar, Size size, boolean z10) {
        C4391e0.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z10);
        this.f17198b = hVar.a();
        this.f17199c = hVar.b();
        this.f17201e = hVar.d();
        this.f17197a = size;
        this.f17202f = z10;
        this.f17203g = hVar.e();
        this.f17200d = hVar.c();
    }

    /* access modifiers changed from: package-private */
    public void s(Size size, int i10, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            C4391e0.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        } else if (m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z10 = false;
                boolean z11 = (!this.f17203g || display == null || display.getRotation() == this.f17201e) ? false : true;
                if (!this.f17203g && e() != 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    C4391e0.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF l10 = l(size, i10);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(l10.width() / ((float) this.f17197a.getWidth()));
            view.setScaleY(l10.height() / ((float) this.f17197a.getHeight()));
            view.setTranslationX(l10.left - ((float) view.getLeft()));
            view.setTranslationY(l10.top - ((float) view.getTop()));
        }
    }
}
