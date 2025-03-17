package com.ingka.ikea.familyrewards.implementation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class c extends BottomSheetComposeDialogFragment {

    /* renamed from: R  reason: collision with root package name */
    private ContextWrapper f95937R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f95938S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f95939T = false;

    c() {
    }

    private void o0() {
        if (this.f95937R == null) {
            this.f95937R = C17410g.b(super.getContext(), this);
            this.f95938S = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f95938S) {
            return null;
        }
        o0();
        return this.f95937R;
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
        if (!this.f95939T) {
            this.f95939T = true;
            ((ir.c) ((C17600c) C17602e.a(this)).g0()).D0((FamilyRewardsFaqBottomSheetFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f95937R;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
