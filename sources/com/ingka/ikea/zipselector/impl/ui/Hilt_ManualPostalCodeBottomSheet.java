package com.ingka.ikea.zipselector.impl.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import fH.C17219a;
import jH.C17410g;
import mE.u;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_ManualPostalCodeBottomSheet extends BaseBottomSheetDialogFragment {

    /* renamed from: L  reason: collision with root package name */
    private ContextWrapper f120755L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f120756M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f120757N = false;

    private void s0() {
        if (this.f120755L == null) {
            this.f120755L = C17410g.b(super.getContext(), this);
            this.f120756M = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f120756M) {
            return null;
        }
        s0();
        return this.f120755L;
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
        if (!this.f120757N) {
            this.f120757N = true;
            ((u) ((C17600c) C17602e.a(this)).g0()).Y((ManualPostalCodeBottomSheet) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f120755L;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
