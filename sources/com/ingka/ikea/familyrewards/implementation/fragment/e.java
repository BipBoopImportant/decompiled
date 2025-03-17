package com.ingka.ikea.familyrewards.implementation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment;
import fH.C17219a;
import ir.h;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class e extends BaseComposeDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    private ContextWrapper f95943N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f95944O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f95945P = false;

    e() {
    }

    private void o0() {
        if (this.f95943N == null) {
            this.f95943N = C17410g.b(super.getContext(), this);
            this.f95944O = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95944O) {
            return null;
        }
        o0();
        return this.f95943N;
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
        if (!this.f95945P) {
            this.f95945P = true;
            ((h) ((C17600c) C17602e.a(this)).g0()).G1((FamilyRewardsHistoryFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95943N;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
