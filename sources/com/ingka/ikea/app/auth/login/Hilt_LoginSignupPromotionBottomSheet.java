package com.ingka.ikea.app.auth.login;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import ef.h;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_LoginSignupPromotionBottomSheet extends BaseBottomSheetDialogFragment {

    /* renamed from: L  reason: collision with root package name */
    private ContextWrapper f70071L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f70072M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f70073N = false;

    private void s0() {
        if (this.f70071L == null) {
            this.f70071L = C17410g.b(super.getContext(), this);
            this.f70072M = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f70072M) {
            return null;
        }
        s0();
        return this.f70071L;
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
        if (!this.f70073N) {
            this.f70073N = true;
            ((h) ((C17600c) C17602e.a(this)).g0()).f1((LoginSignupPromotionBottomSheet) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f70071L;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
