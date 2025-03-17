package com.ingka.ikea.app.cart;

import Kf.C9137f;
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
    private ContextWrapper f71775R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f71776S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f71777T = false;

    c() {
    }

    private void o0() {
        if (this.f71775R == null) {
            this.f71775R = C17410g.b(super.getContext(), this);
            this.f71776S = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f71776S) {
            return null;
        }
        o0();
        return this.f71775R;
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
        if (!this.f71777T) {
            this.f71777T = true;
            ((C9137f) ((C17600c) C17602e.a(this)).g0()).Y0((CartAvailabilityBottomSheet) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f71775R;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
