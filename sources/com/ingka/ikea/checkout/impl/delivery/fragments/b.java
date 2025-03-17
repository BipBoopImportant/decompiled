package com.ingka.ikea.checkout.impl.delivery.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import fH.C17219a;
import io.c;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class b extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private ContextWrapper f94589M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f94590N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f94591O = false;

    b() {
    }

    private void o0() {
        if (this.f94589M == null) {
            this.f94589M = C17410g.b(super.getContext(), this);
            this.f94590N = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f94590N) {
            return null;
        }
        o0();
        return this.f94589M;
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
        if (!this.f94591O) {
            this.f94591O = true;
            ((c) ((C17600c) C17602e.a(this)).g0()).W((ChangeDeliveryTimeSlotFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f94589M;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
