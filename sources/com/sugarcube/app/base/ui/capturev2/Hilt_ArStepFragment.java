package com.sugarcube.app.base.ui.capturev2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.i0;
import fH.C17219a;
import iH.C17354a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_ArStepFragment extends BaseFragment implements C17600c {

    /* renamed from: H  reason: collision with root package name */
    private ContextWrapper f123457H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f123458I;

    /* renamed from: J  reason: collision with root package name */
    private volatile C17410g f123459J;

    /* renamed from: K  reason: collision with root package name */
    private final Object f123460K = new Object();

    /* renamed from: L  reason: collision with root package name */
    private boolean f123461L = false;

    private void C0() {
        if (this.f123457H == null) {
            this.f123457H = C17410g.b(super.getContext(), this);
            this.f123458I = C17219a.a(super.getContext());
        }
    }

    public final C17410g A0() {
        if (this.f123459J == null) {
            synchronized (this.f123460K) {
                try {
                    if (this.f123459J == null) {
                        this.f123459J = B0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f123459J;
    }

    /* access modifiers changed from: protected */
    public C17410g B0() {
        return new C17410g(this);
    }

    /* access modifiers changed from: protected */
    public void D0() {
        if (!this.f123461L) {
            this.f123461L = true;
            ((ArStepFragment_GeneratedInjector) g0()).injectArStepFragment((ArStepFragment) C17602e.a(this));
        }
    }

    public final Object g0() {
        return A0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f123458I) {
            return null;
        }
        C0();
        return this.f123457H;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return C17354a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        C0();
        D0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C17410g.c(onGetLayoutInflater, this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f123457H;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        C0();
        D0();
    }
}
