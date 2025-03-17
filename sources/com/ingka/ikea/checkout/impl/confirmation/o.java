package com.ingka.ikea.checkout.impl.confirmation;

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

abstract class o extends BaseComposeDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    private ContextWrapper f94444N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f94445O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f94446P = false;

    o() {
    }

    private void o0() {
        if (this.f94444N == null) {
            this.f94444N = C17410g.b(super.getContext(), this);
            this.f94445O = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f94445O) {
            return null;
        }
        o0();
        return this.f94444N;
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
        if (!this.f94446P) {
            this.f94446P = true;
            ((n) ((C17600c) C17602e.a(this)).g0()).u1((ConfirmationOrderSummaryDialogFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f94444N;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
