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
import uz.j;

abstract class h extends BaseComposeDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    private ContextWrapper f120185N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f120186O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f120187P = false;

    h() {
    }

    private void o0() {
        if (this.f120185N == null) {
            this.f120185N = C17410g.b(super.getContext(), this);
            this.f120186O = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f120186O) {
            return null;
        }
        o0();
        return this.f120185N;
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
        if (!this.f120187P) {
            this.f120187P = true;
            ((j) ((C17600c) C17602e.a(this)).g0()).R0((DeeplinkWrongStoreFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f120185N;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
