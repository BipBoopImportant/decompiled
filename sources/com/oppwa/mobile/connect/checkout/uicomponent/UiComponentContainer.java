package com.oppwa.mobile.connect.checkout.uicomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponent;
import com.oppwa.mobile.connect.databinding.OppwaUiComponentContainerFragmentBinding;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import java.util.Optional;

public abstract class UiComponentContainer<T extends UiComponent<? extends UiComponentInteraction>> extends C5187o implements UiComponentInteraction {
    public static final String ARG_CHECKOUT_INFO = "checkoutInfo";
    public static final String ARG_CHECKOUT_SETTINGS = "checkoutSettings";
    public static final String ARG_UI_COMPONENT_CLASS_NAME = "uiComponentClassName";
    public static final String RESULT_CANCELLED = "cancelled";
    public static final String RESULT_ERROR = "error";

    /* renamed from: a  reason: collision with root package name */
    protected T f121469a;

    /* renamed from: b  reason: collision with root package name */
    private OppwaUiComponentContainerFragmentBinding f121470b;

    /* renamed from: c  reason: collision with root package name */
    private CheckoutSettings f121471c;

    /* renamed from: d  reason: collision with root package name */
    private CheckoutInfo f121472d;

    class a extends FragmentManager.m {
        a() {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, C5187o oVar, View view, Bundle bundle) {
            super.onFragmentViewCreated(fragmentManager, oVar, view, bundle);
            if (oVar == UiComponentContainer.this.f121469a) {
                fragmentManager.Y1(this);
                UiComponentContainer.this.i();
            }
        }
    }

    private void a(boolean z10) {
        if (!z10) {
            getChildFragmentManager().s().d(a(), Class.forName(k()).asSubclass(C5187o.class), (Bundle) null).B(true).l();
        }
        this.f121469a = a(getChildFragmentManager().p0(a()));
        getChildFragmentManager().A1(b(), true);
    }

    private FragmentManager.m b() {
        return new a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException c() {
        return new IllegalStateException("Missing UI Component fragment.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException d() {
        return new IllegalStateException("Missing checkout info.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException e() {
        return new IllegalStateException("Missing checkout settings.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException f() {
        return new IllegalStateException("Missing fragment container.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException g() {
        return new IllegalStateException("Missing UI Component.");
    }

    public static String getRequestKey() {
        return UiComponentContainer.class.getName();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException h() {
        return new IllegalStateException("Missing UI Component class name.");
    }

    private String k() {
        return (String) Optional.ofNullable(requireArguments().getString(ARG_UI_COMPONENT_CLASS_NAME)).orElseThrow(new l());
    }

    public CheckoutInfo getCheckoutInfo() {
        return (CheckoutInfo) Optional.ofNullable(this.f121472d).orElseThrow(new i());
    }

    public CheckoutSettings getCheckoutSettings() {
        return (CheckoutSettings) Optional.ofNullable(this.f121471c).orElseThrow(new j());
    }

    /* access modifiers changed from: protected */
    public abstract void i();

    /* access modifiers changed from: protected */
    public T j() {
        return (UiComponent) Optional.ofNullable(this.f121469a).orElseThrow(new k());
    }

    /* access modifiers changed from: protected */
    public void l() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(RESULT_CANCELLED, true);
        a(getRequestKey(), bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OppwaUiComponentContainerFragmentBinding inflate = OppwaUiComponentContainerFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f121470b = inflate;
        return inflate.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121471c = (CheckoutSettings) requireArguments().getParcelable("checkoutSettings");
        this.f121472d = (CheckoutInfo) requireArguments().getParcelable("checkoutInfo");
        try {
            a(bundle != null);
        } catch (Exception e10) {
            a(PaymentError.getUiComponentError(e10.toString()));
        }
    }

    private T a(C5187o oVar) {
        return (UiComponent) Optional.ofNullable(oVar).orElseThrow(new f());
    }

    /* access modifiers changed from: protected */
    public void a(PaymentError paymentError) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_ERROR, paymentError);
        a(getRequestKey(), bundle);
    }

    /* access modifiers changed from: protected */
    public void a(String str, Bundle bundle) {
        getParentFragmentManager().Q1(str, bundle);
    }

    private int a() {
        return ((Integer) Optional.ofNullable(this.f121470b).map(new g()).orElseThrow(new h())).intValue();
    }
}
