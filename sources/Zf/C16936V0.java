package ZF;

import XH.v;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.sugarcube.decorate.internal.shared.IDecorateEngine;
import com.sugarcube.decorate.v1.internal.v1.TouchInteractionListener;
import com.sugarcube.decorate_engine.EraserPickId;
import com.sugarcube.decorate_engine.EraserPickOp;
import com.sugarcube.decorate_engine.PanZoomRegion;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010&R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010,R\"\u00104\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010E\u001a\u00020A8\u0000X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b:\u0010DR\u001a\u0010F\u001a\u00020\u001b8\u0000XD¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\bB\u00101R\"\u0010H\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010/\u001a\u0004\b6\u00101\"\u0004\bG\u00103R\"\u0010L\u001a\u00020\u001b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101\"\u0004\bK\u00103R\u0014\u0010N\u001a\u00020\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b'\u0010MR\u0014\u0010O\u001a\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b>\u0010%R\u0016\u0010R\u001a\u0004\u0018\u00010P8@X\u0004¢\u0006\u0006\u001a\u0004\b.\u0010Q¨\u0006S"}, d2 = {"LZF/V0;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "Lcom/sugarcube/decorate/v1/internal/v1/b;", "decorateViewModel", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "decorateEngine", "Lcom/sugarcube/decorate/v1/internal/v1/TouchInteractionListener;", "listener", "<init>", "(Landroid/content/Context;Lcom/sugarcube/decorate/v1/internal/v1/b;Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;Lcom/sugarcube/decorate/v1/internal/v1/TouchInteractionListener;)V", "LXH/N;", "k", "()V", "p", "l", "s", "n", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "region", "q", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)V", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/sugarcube/decorate/v1/internal/v1/b;", "c", "()Lcom/sugarcube/decorate/v1/internal/v1/b;", "Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "d", "Lcom/sugarcube/decorate/v1/internal/v1/TouchInteractionListener;", "e", "()Lcom/sugarcube/decorate/v1/internal/v1/TouchInteractionListener;", "Landroid/view/GestureDetector;", "Landroid/view/GestureDetector;", "gestureDetector", "f", "Z", "getEnableTouchControlScheme", "()Z", "setEnableTouchControlScheme", "(Z)V", "enableTouchControlScheme", "Landroid/os/Handler;", "g", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "h", "Ljava/lang/Runnable;", "pressThresholdRunnable", "LZF/S0;", "i", "LZF/S0;", "schemeMode", "LZF/W0;", "j", "LZF/W0;", "()LZF/W0;", "touchState", "wallArtRotationEnabled", "r", "sceneIsUnzoomed", "m", "o", "setMagicEraserMode$v1_release", "isMagicEraserMode", "()Lcom/sugarcube/decorate/internal/shared/IDecorateEngine;", "engine", "viewModel", "LZF/a;", "()LZF/a;", "reporter", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.V0  reason: case insensitive filesystem */
public final class C16936V0 implements View.OnTouchListener {

    /* renamed from: n  reason: collision with root package name */
    public static final b f140584n = new b((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f140585o = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f140586a;

    /* renamed from: b  reason: collision with root package name */
    private final com.sugarcube.decorate.v1.internal.v1.b f140587b;

    /* renamed from: c  reason: collision with root package name */
    private final IDecorateEngine f140588c;

    /* renamed from: d  reason: collision with root package name */
    private final TouchInteractionListener f140589d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f140590e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f140591f = true;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f140592g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    private Runnable f140593h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public C16930S0 f140594i = new C16919M0(this);

    /* renamed from: j  reason: collision with root package name */
    private final C16938W0 f140595j = new C16938W0();

    /* renamed from: k  reason: collision with root package name */
    private final boolean f140596k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f140597l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f140598m;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ZF/V0$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", "LXH/N;", "onLongPress", "(Landroid/view/MotionEvent;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZF.V0$a */
    public static final class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16936V0 f140599a;

        a(C16936V0 v02) {
            this.f140599a = v02;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C17542s.j(motionEvent, "e");
            this.f140599a.f140594i.b().e().onInstanceDoubleTap(this.f140599a.h().i());
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            C17542s.j(motionEvent, "e");
            this.f140599a.h().C(true);
            this.f140599a.h().B(System.currentTimeMillis());
            super.onLongPress(motionEvent);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LZF/V0$b;", "", "<init>", "()V", "", "TAP_DURATION", "I", "", "kAllow1TouchPan", "Z", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ZF.V0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C16936V0(Context context, com.sugarcube.decorate.v1.internal.v1.b bVar, IDecorateEngine iDecorateEngine, TouchInteractionListener touchInteractionListener) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "decorateViewModel");
        C17542s.j(iDecorateEngine, "decorateEngine");
        C17542s.j(touchInteractionListener, "listener");
        this.f140586a = context;
        this.f140587b = bVar;
        this.f140588c = iDecorateEngine;
        this.f140589d = touchInteractionListener;
        this.f140590e = new GestureDetector(context, new a(this));
    }

    private final void k() {
        this.f140589d.onInteractionEnded();
        boolean z10 = false;
        if (this.f140595j.o()) {
            this.f140595j.C(false);
            this.f140589d.onLongPress(System.currentTimeMillis() - this.f140595j.f());
        }
        Runnable runnable = this.f140593h;
        if (runnable != null) {
            this.f140592g.removeCallbacks(runnable);
        }
        C16938W0 w02 = this.f140595j;
        if (System.currentTimeMillis() - this.f140595j.j() < 200) {
            z10 = true;
        }
        w02.H(z10);
        C16930S0 s02 = this.f140594i;
        if ((s02 instanceof C16928R0) || (s02 instanceof C16919M0) || !this.f140595j.r()) {
            this.f140589d.onItemInteractionMode((C16930S0) null);
        } else if (this.f140598m && !this.f140595j.h().isNone()) {
            d().execEraserOp(EraserPickOp.Toggle, this.f140595j.h());
            this.f140589d.onItemEraseToggled();
        } else if (this.f140595j.i() != null) {
            if (!C17542s.e(i().H0(), this.f140595j.i())) {
                this.f140589d.onInstanceSelected(this.f140595j.i());
            } else {
                this.f140594i.e();
                this.f140594i = new C16915K0(this);
                this.f140589d.onSelectionCleared();
            }
        }
        if (!this.f140595j.r() || this.f140595j.i() != null) {
            p();
            return;
        }
        this.f140589d.onSelectionCleared();
        this.f140595j.v();
        l();
    }

    private final void l() {
        C16930S0 s02;
        int k10 = this.f140595j.k();
        if (k10 == 0) {
            p();
        } else if (k10 == 1) {
            if ((this.f140594i instanceof C16917L0) || i().H0() != null || this.f140597l) {
                this.f140594i.e();
                s02 = new C16915K0(this);
            } else {
                this.f140594i.e();
                s02 = new C16917L0(this);
            }
            this.f140594i = s02;
            if (i().H0() != null) {
                Runnable runnable = this.f140593h;
                if (runnable != null) {
                    this.f140592g.removeCallbacks(runnable);
                }
                C16934U0 u02 = new C16934U0(this);
                this.f140592g.postDelayed(u02, 100);
                this.f140593h = u02;
            }
        } else if (k10 == 2) {
            C16930S0 s03 = this.f140594i;
            if (!(s03 instanceof C16928R0)) {
                s03.e();
                this.f140594i = new C16928R0(this);
            }
            this.f140589d.onItemInteractionMode(this.f140594i);
        }
    }

    /* access modifiers changed from: private */
    public static final void m(C16936V0 v02) {
        v02.f140589d.onItemInteractionMode(v02.f140594i);
        v02.f140593h = null;
    }

    private final void p() {
        C16930S0 s02 = this.f140594i;
        if (!(s02 instanceof C16919M0)) {
            s02.e();
            this.f140594i = new C16919M0(this);
        }
    }

    public final com.sugarcube.decorate.v1.internal.v1.b c() {
        return this.f140587b;
    }

    public final IDecorateEngine d() {
        return this.f140588c;
    }

    public final TouchInteractionListener e() {
        return this.f140589d;
    }

    public final C16942a f() {
        return this.f140587b.z0();
    }

    public final boolean g() {
        return this.f140597l;
    }

    public final C16938W0 h() {
        return this.f140595j;
    }

    public final com.sugarcube.decorate.v1.internal.v1.b i() {
        return this.f140587b;
    }

    public final boolean j() {
        return this.f140596k;
    }

    public final void n() {
        if (this.f140594i.b().f140598m) {
            this.f140594i.b().f140598m = false;
            d().execEraserOp(EraserPickOp.HighlightOff, EraserPickId.Companion.getKAll());
            d().setModelInstancesVisible(true);
            p();
        }
    }

    public final boolean o() {
        return this.f140598m;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C17542s.j(view, "view");
        C17542s.j(motionEvent, "event");
        this.f140590e.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f140595j.E(false);
            this.f140595j.F(false);
            if (!this.f140595j.a(motionEvent)) {
                return false;
            }
            this.f140595j.I(System.currentTimeMillis());
            if (!this.f140594i.g()) {
                l();
            }
            return true;
        } else if (actionMasked == 1 || actionMasked == 3) {
            k();
            return true;
        } else if (actionMasked == 5) {
            v<Float, Float> a10 = C16938W0.f140600q.a(motionEvent);
            float floatValue = a10.a().floatValue();
            float floatValue2 = a10.b().floatValue();
            this.f140595j.A(floatValue);
            this.f140595j.z(floatValue2);
            if (!this.f140595j.a(motionEvent)) {
                return false;
            }
            if (!this.f140594i.g()) {
                l();
            }
            return true;
        } else if (actionMasked != 6) {
            if (motionEvent.getActionMasked() == 2) {
                v<Float, Float> a11 = C16938W0.f140600q.a(motionEvent);
                float floatValue3 = a11.a().floatValue();
                float floatValue4 = a11.b().floatValue();
                float f10 = (float) 50;
                if (floatValue3 > this.f140595j.e() + f10) {
                    this.f140595j.E(true);
                    this.f140595j.F(false);
                } else if (floatValue3 < this.f140595j.e() - f10) {
                    this.f140595j.E(true);
                    this.f140595j.F(false);
                }
                if (Math.abs(floatValue4 - this.f140595j.d()) > ((float) 10)) {
                    this.f140595j.F(true);
                    this.f140595j.E(false);
                }
                if (this.f140595j.c() == null) {
                    if (this.f140595j.p()) {
                        this.f140595j.y(C16901D0.TWO_FINGERS_ZOOM);
                    } else if (this.f140595j.q()) {
                        this.f140595j.y(C16901D0.TWO_FINGERS_ROTATE);
                    } else {
                        this.f140595j.y((C16901D0) null);
                    }
                }
                if (this.f140595j.t(motionEvent)) {
                    if (!this.f140594i.f()) {
                        l();
                    }
                    return true;
                }
            }
            return false;
        } else if (!this.f140595j.w(motionEvent)) {
            return false;
        } else {
            this.f140595j.y((C16901D0) null);
            this.f140595j.A(0.0f);
            this.f140595j.z(0.0f);
            C16930S0 s02 = this.f140594i;
            if (s02 instanceof C16928R0) {
                this.f140595j.v();
                l();
                return true;
            }
            if (!s02.i()) {
                l();
            }
            return true;
        }
    }

    public final void q(PanZoomRegion panZoomRegion) {
        C17542s.j(panZoomRegion, "region");
        d().setPanZoomRegion(panZoomRegion);
    }

    public final void r(boolean z10) {
        this.f140597l = z10;
    }

    public final void s() {
        if (!this.f140594i.b().f140598m) {
            this.f140594i.e();
            this.f140594i.b().f140598m = true;
            this.f140594i = new C16919M0(this);
            d().execEraserOp(EraserPickOp.HighlightOn, EraserPickId.Companion.getKAll());
            d().setModelInstancesVisible(false);
        }
    }
}
