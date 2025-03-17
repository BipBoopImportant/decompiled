package com.ingka.ikea.scanandgo.dialog.termsandconditions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.app.uicomponents.fragment.DelegateBottomSheet;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;
import wz.c;

public abstract class Hilt_TermsAndConditionsBottomSheetDialog extends DelegateBottomSheet {

    /* renamed from: Q  reason: collision with root package name */
    private ContextWrapper f120188Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f120189R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f120190S = false;

    private void s0() {
        if (this.f120188Q == null) {
            this.f120188Q = C17410g.b(super.getContext(), this);
            this.f120189R = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f120189R) {
            return null;
        }
        s0();
        return this.f120188Q;
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
        if (!this.f120190S) {
            this.f120190S = true;
            ((c) ((C17600c) C17602e.a(this)).g0()).n((TermsAndConditionsBottomSheetDialog) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f120188Q;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
