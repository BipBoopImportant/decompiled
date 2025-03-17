package com.ingka.ikea.app.productinformationpage.v2.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import fH.C17219a;
import ii.K0;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_WebViewDialogFragment extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private ContextWrapper f72149M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f72150N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f72151O = false;

    private void o0() {
        if (this.f72149M == null) {
            this.f72149M = C17410g.b(super.getContext(), this);
            this.f72150N = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f72150N) {
            return null;
        }
        o0();
        return this.f72149M;
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
        if (!this.f72151O) {
            this.f72151O = true;
            ((K0) ((C17600c) C17602e.a(this)).g0()).V1((WebViewDialogFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f72149M;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
