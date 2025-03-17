package com.ingka.ikea.barcode.impl.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;
import zm.b;

public abstract class Hilt_DataMatrixBottomSheet extends BaseBottomSheetDialogFragment {

    /* renamed from: L  reason: collision with root package name */
    private ContextWrapper f93173L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f93174M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f93175N = false;

    private void s0() {
        if (this.f93173L == null) {
            this.f93173L = C17410g.b(super.getContext(), this);
            this.f93174M = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f93174M) {
            return null;
        }
        s0();
        return this.f93173L;
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
        if (!this.f93175N) {
            this.f93175N = true;
            ((b) ((C17600c) C17602e.a(this)).g0()).U1((DataMatrixBottomSheet) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f93173L;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
