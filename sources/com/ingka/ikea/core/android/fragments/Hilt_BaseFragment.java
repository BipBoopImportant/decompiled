package com.ingka.ikea.core.android.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.i0;
import fH.C17219a;
import iH.C17354a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_BaseFragment extends C5187o implements C17600c {

    /* renamed from: D  reason: collision with root package name */
    private ContextWrapper f94886D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f94887E;

    /* renamed from: F  reason: collision with root package name */
    private volatile C17410g f94888F;

    /* renamed from: G  reason: collision with root package name */
    private final Object f94889G = new Object();

    /* renamed from: H  reason: collision with root package name */
    private boolean f94890H = false;

    Hilt_BaseFragment() {
    }

    private void o0() {
        if (this.f94886D == null) {
            this.f94886D = C17410g.b(super.getContext(), this);
            this.f94887E = C17219a.a(super.getContext());
        }
    }

    public final Object g0() {
        return m0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f94887E) {
            return null;
        }
        o0();
        return this.f94886D;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return C17354a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final C17410g m0() {
        if (this.f94888F == null) {
            synchronized (this.f94889G) {
                try {
                    if (this.f94888F == null) {
                        this.f94888F = n0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f94888F;
    }

    /* access modifiers changed from: protected */
    public C17410g n0() {
        return new C17410g(this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        o0();
        q0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C17410g.c(onGetLayoutInflater, this));
    }

    /* access modifiers changed from: protected */
    public void q0() {
        if (!this.f94890H) {
            this.f94890H = true;
            ((e) g0()).T((BaseFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f94886D;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
