package com.ingka.ikea.app.auth.datacontrols;

import Ze.l;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.app.auth.AuthDelegateFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class a extends AuthDelegateFragment {

    /* renamed from: Y  reason: collision with root package name */
    private ContextWrapper f70031Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f70032Z;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f70033y0 = false;

    a() {
    }

    private void o0() {
        if (this.f70031Y == null) {
            this.f70031Y = C17410g.b(super.getContext(), this);
            this.f70032Z = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f70032Z) {
            return null;
        }
        o0();
        return this.f70031Y;
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
        if (!this.f70033y0) {
            this.f70033y0 = true;
            ((l) ((C17600c) C17602e.a(this)).g0()).M((DataPreferenceFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f70031Y;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
