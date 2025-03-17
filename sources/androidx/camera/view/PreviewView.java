package androidx.camera.view;

import C.C4391e0;
import C.C4399i0;
import C.G0;
import C.J0;
import C.U;
import C.p0;
import G.p;
import G.q;
import I2.C4600b0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import d0.g;
import d0.h;
import d0.i;
import d0.j;
import e0.C5290a;
import f0.C5298a;
import h0.C5409b;
import java.util.concurrent.atomic.AtomicReference;
import u2.C6012a;

public final class PreviewView extends FrameLayout {

    /* renamed from: p  reason: collision with root package name */
    private static final c f17106p = c.PERFORMANCE;

    /* renamed from: a  reason: collision with root package name */
    c f17107a;

    /* renamed from: b  reason: collision with root package name */
    q f17108b;

    /* renamed from: c  reason: collision with root package name */
    final ScreenFlashView f17109c;

    /* renamed from: d  reason: collision with root package name */
    final m f17110d;

    /* renamed from: e  reason: collision with root package name */
    boolean f17111e;

    /* renamed from: f  reason: collision with root package name */
    final K<e> f17112f;

    /* renamed from: g  reason: collision with root package name */
    final AtomicReference<l> f17113g;

    /* renamed from: h  reason: collision with root package name */
    C5063c f17114h;

    /* renamed from: i  reason: collision with root package name */
    r f17115i;

    /* renamed from: j  reason: collision with root package name */
    private final C5290a f17116j;

    /* renamed from: k  reason: collision with root package name */
    I f17117k;

    /* renamed from: l  reason: collision with root package name */
    private MotionEvent f17118l;

    /* renamed from: m  reason: collision with root package name */
    private final b f17119m;

    /* renamed from: n  reason: collision with root package name */
    private final View.OnLayoutChangeListener f17120n;

    /* renamed from: o  reason: collision with root package name */
    final p0.c f17121o;

    class a implements p0.c {
        a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(G0 g02) {
            PreviewView.this.f17121o.a(g02);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(J j10, G0 g02, G0.h hVar) {
            PreviewView previewView;
            q qVar;
            C4391e0.a("PreviewView", "Preview transformation info updated. " + hVar);
            PreviewView.this.f17110d.r(hVar, g02.p(), j10.j().f() == 0);
            if (hVar.d() == -1 || ((qVar = previewView.f17108b) != null && (qVar instanceof z))) {
                PreviewView.this.f17111e = true;
            } else {
                (previewView = PreviewView.this).f17111e = false;
            }
            PreviewView.this.g();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g(l lVar, J j10) {
            if (i.a(PreviewView.this.f17113g, lVar, (Object) null)) {
                lVar.l(e.IDLE);
            }
            lVar.f();
            j10.p().d(lVar);
        }

        public void a(G0 g02) {
            q qVar;
            if (!p.c()) {
                C6012a.h(PreviewView.this.getContext()).execute(new n(this, g02));
                return;
            }
            C4391e0.a("PreviewView", "Surface requested by Preview.");
            J l10 = g02.l();
            PreviewView.this.f17117k = l10.j();
            PreviewView.this.f17115i.e(l10.d().g());
            g02.E(C6012a.h(PreviewView.this.getContext()), new o(this, l10, g02));
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.h(previewView.f17108b, g02, previewView.f17107a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.i(g02, previewView2.f17107a)) {
                    PreviewView previewView3 = PreviewView.this;
                    qVar = new F(previewView3, previewView3.f17110d);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    qVar = new z(previewView4, previewView4.f17110d);
                }
                previewView2.f17108b = qVar;
            }
            I j10 = l10.j();
            PreviewView previewView5 = PreviewView.this;
            l lVar = new l(j10, previewView5.f17112f, previewView5.f17108b);
            PreviewView.this.f17113g.set(lVar);
            l10.p().c(C6012a.h(PreviewView.this.getContext()), lVar);
            PreviewView.this.f17108b.g(g02, new p(this, lVar, l10));
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f17109c) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f17109c);
            }
            PreviewView.this.getClass();
        }
    }

    class b implements DisplayManager.DisplayListener {
        b() {
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            Display display = PreviewView.this.getDisplay();
            if (display != null && display.getDisplayId() == i10) {
                PreviewView.this.g();
            }
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);
        
        private final int mId;

        private c(int i10) {
            this.mId = i10;
        }

        static c b(int i10) {
            for (c cVar : values()) {
                if (cVar.mId == i10) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.mId;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        
        private final int mId;

        private d(int i10) {
            this.mId = i10;
        }

        static d b(int i10) {
            for (d dVar : values()) {
                if (dVar.mId == i10) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.mId;
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void c(boolean z10) {
        p.a();
        J0 viewPort = getViewPort();
        if (this.f17114h != null && viewPort != null && isAttachedToWindow()) {
            try {
                this.f17114h.e(getSurfaceProvider(), viewPort);
            } catch (IllegalStateException e10) {
                if (z10) {
                    C4391e0.d("PreviewView", e10.toString(), e10);
                    return;
                }
                throw e10;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
            g();
            c(true);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean f(C5290a.c cVar) {
        C5063c cVar2;
        if (!(cVar instanceof C5290a.c.C0371c) || (cVar2 = this.f17114h) == null) {
            return true;
        }
        cVar2.G(((C5290a.c.C0371c) cVar).a());
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private U.i getScreenFlashInternal() {
        return this.f17109c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (ordinal != 1) {
            i10 = 2;
            if (ordinal != 2) {
                i10 = 3;
                if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i10;
    }

    static boolean h(q qVar, G0 g02, c cVar) {
        return (qVar instanceof z) && !i(g02, cVar);
    }

    static boolean i(G0 g02, c cVar) {
        boolean equals = g02.l().j().n().equals("androidx.camera.camera2.legacy");
        boolean z10 = (androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (equals || z10) {
            return true;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private void j() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f17119m, new Handler(Looper.getMainLooper()));
        }
    }

    private void k() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.f17119m);
        }
    }

    private void setScreenFlashUiInfo(U.i iVar) {
        C5063c cVar = this.f17114h;
        if (cVar == null) {
            C4391e0.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cVar.O(new C5298a(C5298a.C0372a.PREVIEW_VIEW, iVar));
        }
    }

    @SuppressLint({"WrongConstant"})
    public J0 d(int i10) {
        p.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new J0.a(new Rational(getWidth(), getHeight()), i10).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    /* access modifiers changed from: package-private */
    public void g() {
        p.a();
        if (this.f17108b != null) {
            l();
            this.f17108b.h();
        }
        this.f17115i.d(new Size(getWidth(), getHeight()), getLayoutDirection());
        C5063c cVar = this.f17114h;
        if (cVar != null) {
            cVar.c0(getSensorToViewTransform());
        }
    }

    public Bitmap getBitmap() {
        p.a();
        q qVar = this.f17108b;
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    public C5063c getController() {
        p.a();
        return this.f17114h;
    }

    public c getImplementationMode() {
        p.a();
        return this.f17107a;
    }

    public C4399i0 getMeteringPointFactory() {
        p.a();
        return this.f17115i;
    }

    public C5409b getOutputTransform() {
        Matrix matrix;
        p.a();
        try {
            matrix = this.f17110d.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect i10 = this.f17110d.i();
        if (matrix == null || i10 == null) {
            C4391e0.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(q.b(i10));
        if (this.f17108b instanceof F) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            C4391e0.l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new C5409b(matrix, new Size(i10.width(), i10.height()));
    }

    public F<e> getPreviewStreamState() {
        return this.f17112f;
    }

    public d getScaleType() {
        p.a();
        return this.f17110d.g();
    }

    public U.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        p.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f17110d.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public p0.c getSurfaceProvider() {
        p.a();
        return this.f17121o;
    }

    public J0 getViewPort() {
        p.a();
        if (getDisplay() == null) {
            return null;
        }
        return d(getDisplay().getRotation());
    }

    /* access modifiers changed from: package-private */
    public void l() {
        Display display;
        I i10;
        if (this.f17111e && (display = getDisplay()) != null && (i10 = this.f17117k) != null) {
            this.f17110d.o(i10.o(display.getRotation()), display.getRotation());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        j();
        addOnLayoutChangeListener(this.f17120n);
        q qVar = this.f17108b;
        if (qVar != null) {
            qVar.d();
        }
        c(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f17120n);
        q qVar = this.f17108b;
        if (qVar != null) {
            qVar.e();
        }
        C5063c cVar = this.f17114h;
        if (cVar != null) {
            cVar.g();
        }
        k();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17114h == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z10 = motionEvent.getPointerCount() == 1;
        boolean z11 = motionEvent.getAction() == 1;
        boolean z12 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z10 || !z11 || !z12) {
            return this.f17116j.f(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.f17118l = motionEvent;
        performClick();
        return true;
    }

    public boolean performClick() {
        if (this.f17114h != null) {
            MotionEvent motionEvent = this.f17118l;
            float x10 = motionEvent != null ? motionEvent.getX() : ((float) getWidth()) / 2.0f;
            MotionEvent motionEvent2 = this.f17118l;
            this.f17114h.H(this.f17115i, x10, motionEvent2 != null ? motionEvent2.getY() : ((float) getHeight()) / 2.0f);
        }
        this.f17118l = null;
        return super.performClick();
    }

    public void setController(C5063c cVar) {
        p.a();
        C5063c cVar2 = this.f17114h;
        if (!(cVar2 == null || cVar2 == cVar)) {
            cVar2.g();
            setScreenFlashUiInfo((U.i) null);
        }
        this.f17114h = cVar;
        c(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        p.a();
        this.f17107a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        p.a();
        this.f17110d.q(dVar);
        g();
        c(false);
    }

    public void setScreenFlashOverlayColor(int i10) {
        this.f17109c.setBackgroundColor(i10);
    }

    public void setScreenFlashWindow(Window window) {
        p.a();
        this.f17109c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX INFO: finally extract failed */
    public PreviewView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c cVar = f17106p;
        this.f17107a = cVar;
        m mVar = new m();
        this.f17110d = mVar;
        this.f17111e = true;
        this.f17112f = new K<>(e.IDLE);
        this.f17113g = new AtomicReference<>();
        this.f17115i = new r(mVar);
        this.f17119m = new b();
        this.f17120n = new g(this);
        this.f17121o = new a();
        p.a();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j.f23100a, i10, i11);
        C4600b0.n0(this, context, j.f23100a, attributeSet, obtainStyledAttributes, i10, i11);
        try {
            setScaleType(d.b(obtainStyledAttributes.getInteger(j.f23102c, mVar.g().j())));
            setImplementationMode(c.b(obtainStyledAttributes.getInteger(j.f23101b, cVar.j())));
            obtainStyledAttributes.recycle();
            this.f17116j = new C5290a(context, new h(this));
            if (getBackground() == null) {
                setBackgroundColor(C6012a.c(getContext(), 17170444));
            }
            ScreenFlashView screenFlashView = new ScreenFlashView(context);
            this.f17109c = screenFlashView;
            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
