package com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1;

import Hj.l;
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

abstract class a extends BaseFragment {

    /* renamed from: O  reason: collision with root package name */
    private ContextWrapper f92133O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f92134P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f92135Q = false;

    a() {
    }

    private void o0() {
        if (this.f92133O == null) {
            this.f92133O = C17410g.b(super.getContext(), this);
            this.f92134P = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f92134P) {
            return null;
        }
        o0();
        return this.f92133O;
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
        if (!this.f92135Q) {
            this.f92135Q = true;
            ((l) ((C17600c) C17602e.a(this)).g0()).e0((ProductScannerFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f92133O;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
