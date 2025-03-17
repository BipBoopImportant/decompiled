package androidx.camera.view;

import C.C4391e0;
import C.U;
import G.p;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import d0.k;
import d0.l;
import f0.C5298a;
import java.util.Objects;

public final class ScreenFlashView extends View {

    /* renamed from: a  reason: collision with root package name */
    private C5063c f17124a;

    /* renamed from: b  reason: collision with root package name */
    private Window f17125b;

    /* renamed from: c  reason: collision with root package name */
    private U.i f17126c;

    class a implements U.i {

        /* renamed from: a  reason: collision with root package name */
        private float f17127a;

        /* renamed from: b  reason: collision with root package name */
        private ValueAnimator f17128b;

        a() {
        }

        public void a(long j10, U.j jVar) {
            C4391e0.a("ScreenFlashView", "ScreenFlash#apply");
            this.f17127a = ScreenFlashView.this.getBrightness();
            ScreenFlashView.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f17128b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ScreenFlashView screenFlashView = ScreenFlashView.this;
            Objects.requireNonNull(jVar);
            this.f17128b = screenFlashView.e(new l(jVar));
        }

        public void clear() {
            C4391e0.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
            ValueAnimator valueAnimator = this.f17128b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f17128b = null;
            }
            ScreenFlashView.this.setAlpha(0.0f);
            ScreenFlashView.this.setBrightness(this.f17127a);
        }
    }

    class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f17130a;

        b(Runnable runnable) {
            this.f17130a = runnable;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C4391e0.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f17130a;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public ScreenFlashView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public ValueAnimator e(Runnable runnable) {
        C4391e0.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new k(this));
        ofFloat.addListener(new b(runnable));
        ofFloat.start();
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(ValueAnimator valueAnimator) {
        C4391e0.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void g(Window window) {
        if (this.f17125b != window) {
            this.f17126c = window == null ? null : new a();
        }
    }

    /* access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f17125b;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        C4391e0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f17125b == null) {
            C4391e0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        } else if (Float.isNaN(f10)) {
            C4391e0.c("ScreenFlashView", "setBrightness: value is NaN!");
        } else {
            WindowManager.LayoutParams attributes = this.f17125b.getAttributes();
            attributes.screenBrightness = f10;
            this.f17125b.setAttributes(attributes);
            C4391e0.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
        }
    }

    private void setScreenFlashUiInfo(U.i iVar) {
        C5063c cVar = this.f17124a;
        if (cVar == null) {
            C4391e0.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cVar.O(new C5298a(C5298a.C0372a.SCREEN_FLASH_VIEW, iVar));
        }
    }

    public U.i getScreenFlash() {
        return this.f17126c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000;
    }

    public void setController(C5063c cVar) {
        p.a();
        C5063c cVar2 = this.f17124a;
        if (!(cVar2 == null || cVar2 == cVar)) {
            setScreenFlashUiInfo((U.i) null);
        }
        this.f17124a = cVar;
        if (cVar != null) {
            if (cVar.o() == 3 && this.f17125b == null) {
                throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
            }
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        p.a();
        g(window);
        this.f17125b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
