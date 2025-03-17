package com.ingka.ikea.alertmessaging.impl.presentation;

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
import ve.C10305a;

abstract class a extends BottomSheetComposeDialogFragment {

    /* renamed from: R  reason: collision with root package name */
    private ContextWrapper f69931R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f69932S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f69933T = false;

    a() {
    }

    private void o0() {
        if (this.f69931R == null) {
            this.f69931R = C17410g.b(super.getContext(), this);
            this.f69932S = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f69932S) {
            return null;
        }
        o0();
        return this.f69931R;
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
        if (!this.f69933T) {
            this.f69933T = true;
            ((C10305a) ((C17600c) C17602e.a(this)).g0()).O((AlertMessageBottomSheetFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f69931R;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
