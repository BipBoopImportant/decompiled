package com.ingka.ikea.familyrewards.implementation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment;
import fH.C17219a;
import ir.m;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class g extends BaseComposeDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    private ContextWrapper f95949N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f95950O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f95951P = false;

    g() {
    }

    private void o0() {
        if (this.f95949N == null) {
            this.f95949N = C17410g.b(super.getContext(), this);
            this.f95950O = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95950O) {
            return null;
        }
        o0();
        return this.f95949N;
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
        if (!this.f95951P) {
            this.f95951P = true;
            ((m) ((C17600c) C17602e.a(this)).g0()).b1((RewardsDetailsFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95949N;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
