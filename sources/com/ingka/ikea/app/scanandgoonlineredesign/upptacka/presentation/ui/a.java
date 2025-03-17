package com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui;

import Sj.A;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class a extends BaseComposeDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    private ContextWrapper f92314N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f92315O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f92316P = false;

    a() {
    }

    private void o0() {
        if (this.f92314N == null) {
            this.f92314N = C17410g.b(super.getContext(), this);
            this.f92315O = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f92315O) {
            return null;
        }
        o0();
        return this.f92314N;
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
        if (!this.f92316P) {
            this.f92316P = true;
            ((A) ((C17600c) C17602e.a(this)).g0()).f((UpptackaImportProductDialogFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f92314N;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
