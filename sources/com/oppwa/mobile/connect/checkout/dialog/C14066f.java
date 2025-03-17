package com.oppwa.mobile.connect.checkout.dialog;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Q;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.processing.ProcessingUiComponentContainer;
import java.util.Objects;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.f  reason: case insensitive filesystem */
class C14066f {

    /* renamed from: g  reason: collision with root package name */
    private static final int f121170g = R.id.container;

    /* renamed from: a  reason: collision with root package name */
    private final C5191t f121171a;

    /* renamed from: b  reason: collision with root package name */
    private final FragmentManager f121172b;

    /* renamed from: c  reason: collision with root package name */
    private final View f121173c;

    /* renamed from: d  reason: collision with root package name */
    private final int f121174d;

    /* renamed from: e  reason: collision with root package name */
    private final int f121175e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f121176f = false;

    C14066f(C5191t tVar) {
        this.f121171a = tVar;
        this.f121172b = tVar.getSupportFragmentManager();
        View findViewById = tVar.findViewById(f121170g);
        this.f121173c = findViewById;
        this.f121174d = e();
        this.f121175e = c();
        C5187o b10 = b();
        if (b10 instanceof PaymentMethodSelectionUiComponentContainer) {
            a(b10, findViewById.getHeight());
        }
    }

    private int e() {
        WindowManager windowManager = (WindowManager) this.f121171a.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private boolean h() {
        C5191t tVar = this.f121171a;
        return tVar != null && !tVar.isFinishing() && !this.f121171a.isDestroyed();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        a(this.f121173c.getHeight(), 0);
        Handler handler = new Handler(Looper.getMainLooper());
        C5191t tVar = this.f121171a;
        Objects.requireNonNull(tVar);
        handler.postDelayed(new t2(tVar), 500);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return (int) ((((double) this.f121174d) * 60.0d) / 100.0d);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return (int) ((((double) this.f121174d) * 35.0d) / 100.0d);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str = null;
        for (int z02 = this.f121172b.z0() - 2; z02 >= 0; z02--) {
            str = this.f121172b.y0(z02).getName();
            if (str != null) {
                break;
            }
        }
        if (str != null) {
            this.f121172b.u1(str, 0);
            a(str, this.f121173c.getHeight());
            return;
        }
        this.f121172b.s1();
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return b() != null;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        C5187o b10 = b();
        if (b10 instanceof BillingAddressFragment) {
            return false;
        }
        if (b10 instanceof PaymentMethodSelectionUiComponentContainer) {
            return true;
        }
        return (b10 instanceof PaymentMethodSelectionFragment) || (b10 instanceof OrderSummaryFragment) || this.f121176f;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f121176f;
    }

    private boolean c(String str) {
        return str.equals(ProcessingFragment.class.getName()) || str.equals(ProcessingUiComponentContainer.class.getName());
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z10) {
        this.f121176f = z10;
    }

    /* access modifiers changed from: package-private */
    public C5187o b() {
        return this.f121172b.p0(f121170g);
    }

    private boolean b(String str) {
        return str.equals(PaymentMethodSelectionFragment.class.getName()) || str.equals(PaymentMethodSelectionUiComponentContainer.class.getName());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f121171a.runOnUiThread(new w2(this));
    }

    /* access modifiers changed from: package-private */
    public void a(Class<? extends C5187o> cls, Bundle bundle) {
        String str;
        if (h()) {
            int height = g() ? this.f121173c.getHeight() : 0;
            boolean c10 = c(cls.getName());
            Q x10 = this.f121172b.s().u(R.id.container, cls, bundle).x(R.anim.opp_fragment_in, R.anim.opp_fragment_out);
            if (c10) {
                str = null;
            } else {
                str = cls.getName();
            }
            x10.i(str).B(true).j();
            a(height, a(cls.getName()) ? this.f121174d : this.f121175e);
        }
    }

    private ValueAnimator b(int i10, int i11) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i10, i11});
        ofInt.addUpdateListener(new u2(this, ofInt));
        ofInt.setDuration(500);
        return ofInt;
    }

    /* access modifiers changed from: package-private */
    public void a(C5187o oVar) {
        int height = g() ? this.f121173c.getHeight() : 0;
        a(oVar, oVar instanceof ProcessingFragment);
        a(oVar, height);
    }

    private void a(C5187o oVar, int i10) {
        a(oVar.getClass().getName(), i10);
    }

    private void a(String str, int i10) {
        a(i10, a(str) ? this.f121174d : this.f121175e);
    }

    private boolean a(String str) {
        return Utils.isScreenOrientationLandscape(this.f121171a) || (!b(str) && !c(str));
    }

    private void a(C5187o oVar, boolean z10) {
        String str;
        if (h()) {
            Q s10 = this.f121172b.s();
            s10.s(f121170g, oVar);
            s10.x(R.anim.opp_fragment_in, R.anim.opp_fragment_out);
            if (z10) {
                str = null;
            } else {
                str = oVar.getClass().getName();
            }
            s10.i(str);
            s10.j();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i10, int i11) {
        if (this.f121173c.getHeight() != i11) {
            ValueAnimator b10 = b(i10, i11);
            C5191t tVar = this.f121171a;
            Objects.requireNonNull(b10);
            tVar.runOnUiThread(new v2(b10));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f121173c.getLayoutParams();
        layoutParams.height = intValue;
        this.f121173c.setLayoutParams(layoutParams);
    }
}
