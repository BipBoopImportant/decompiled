package com.ingka.ikea.app.scanandgoonlineredesign.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;
import tj.C11915w;

abstract class f extends BaseFragment {

    /* renamed from: O  reason: collision with root package name */
    private ContextWrapper f91656O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f91657P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f91658Q = false;

    f() {
    }

    private void o0() {
        if (this.f91656O == null) {
            this.f91656O = C17410g.b(super.getContext(), this);
            this.f91657P = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f91657P) {
            return null;
        }
        o0();
        return this.f91656O;
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
        if (!this.f91658Q) {
            this.f91658Q = true;
            ((C11915w) ((C17600c) C17602e.a(this)).g0()).t((ScanAndGoScannerCouponFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f91656O;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
