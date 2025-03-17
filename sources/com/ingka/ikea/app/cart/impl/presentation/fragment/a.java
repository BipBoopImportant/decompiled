package com.ingka.ikea.app.cart.impl.presentation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import cg.b;
import com.ingka.ikea.core.android.fragments.BaseComposeFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class a extends BaseComposeFragment {

    /* renamed from: S  reason: collision with root package name */
    private ContextWrapper f71860S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f71861T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f71862U = false;

    a() {
    }

    private void o0() {
        if (this.f71860S == null) {
            this.f71860S = C17410g.b(super.getContext(), this);
            this.f71861T = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f71861T) {
            return null;
        }
        o0();
        return this.f71860S;
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
        if (!this.f71862U) {
            this.f71862U = true;
            ((b) ((C17600c) C17602e.a(this)).g0()).b0((YouMayAlsoLikeFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f71860S;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
