package com.ingka.ikea.scanandgo.deeplinkerrorscreens;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;
import uz.e;

abstract class g extends BaseComposeDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    private ContextWrapper f120182N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f120183O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f120184P = false;

    g() {
    }

    private void o0() {
        if (this.f120182N == null) {
            this.f120182N = C17410g.b(super.getContext(), this);
            this.f120183O = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f120183O) {
            return null;
        }
        o0();
        return this.f120182N;
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
        if (!this.f120184P) {
            this.f120184P = true;
            ((e) ((C17600c) C17602e.a(this)).g0()).g0((DeeplinkWrongMarketFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f120182N;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
