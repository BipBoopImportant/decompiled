package com.ingka.ikea.checkout.impl.delivery.bottomsheets;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import fH.C17219a;
import fo.m;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class d extends BaseBottomSheetDialogFragment {

    /* renamed from: L  reason: collision with root package name */
    private ContextWrapper f94530L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f94531M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f94532N = false;

    d() {
    }

    private void s0() {
        if (this.f94530L == null) {
            this.f94530L = C17410g.b(super.getContext(), this);
            this.f94531M = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f94531M) {
            return null;
        }
        s0();
        return this.f94530L;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        s0();
        t0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C17410g.c(onGetLayoutInflater, this));
    }

    /* access modifiers changed from: protected */
    public void t0() {
        if (!this.f94532N) {
            this.f94532N = true;
            ((m) ((C17600c) C17602e.a(this)).g0()).r((PostalCodeInfoBottomSheet) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f94530L;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
