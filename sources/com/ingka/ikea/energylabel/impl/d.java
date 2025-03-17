package com.ingka.ikea.energylabel.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import fH.C17219a;
import jH.C17410g;
import jq.C11443A;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class d extends SectionBaseFragment {

    /* renamed from: T  reason: collision with root package name */
    private ContextWrapper f95730T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f95731U;

    /* renamed from: X  reason: collision with root package name */
    private boolean f95732X = false;

    d() {
    }

    private void o0() {
        if (this.f95730T == null) {
            this.f95730T = C17410g.b(super.getContext(), this);
            this.f95731U = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95731U) {
            return null;
        }
        o0();
        return this.f95730T;
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
        if (!this.f95732X) {
            this.f95732X = true;
            ((C11443A) ((C17600c) C17602e.a(this)).g0()).F1((TechnicalInfoFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95730T;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
