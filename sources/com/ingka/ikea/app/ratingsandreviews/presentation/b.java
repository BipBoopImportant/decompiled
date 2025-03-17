package com.ingka.ikea.app.ratingsandreviews.presentation;

import Oi.g;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseComposeFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class b extends BaseComposeFragment {

    /* renamed from: S  reason: collision with root package name */
    private ContextWrapper f91149S;

    /* renamed from: T  reason: collision with root package name */
    private boolean f91150T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f91151U = false;

    b() {
    }

    private void o0() {
        if (this.f91149S == null) {
            this.f91149S = C17410g.b(super.getContext(), this);
            this.f91150T = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f91150T) {
            return null;
        }
        o0();
        return this.f91149S;
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
        if (!this.f91151U) {
            this.f91151U = true;
            ((g) ((C17600c) C17602e.a(this)).g0()).L((WriteReviewFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f91149S;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
