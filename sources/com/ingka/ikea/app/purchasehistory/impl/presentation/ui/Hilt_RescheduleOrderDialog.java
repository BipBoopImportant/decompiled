package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ci.C10625E;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_RescheduleOrderDialog extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private ContextWrapper f90804M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f90805N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f90806O = false;

    private void o0() {
        if (this.f90804M == null) {
            this.f90804M = C17410g.b(super.getContext(), this);
            this.f90805N = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f90805N) {
            return null;
        }
        o0();
        return this.f90804M;
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
        if (!this.f90806O) {
            this.f90806O = true;
            ((C10625E) ((C17600c) C17602e.a(this)).g0()).I((RescheduleOrderDialog) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f90804M;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
