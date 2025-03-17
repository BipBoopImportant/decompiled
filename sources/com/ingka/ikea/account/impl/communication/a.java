package com.ingka.ikea.account.impl.communication;

import Ud.g;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.app.uicomponents.fragment.DelegateFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class a extends DelegateFragment {

    /* renamed from: Y  reason: collision with root package name */
    private ContextWrapper f69474Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f69475Z;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f69476y0 = false;

    a() {
    }

    private void o0() {
        if (this.f69474Y == null) {
            this.f69474Y = C17410g.b(super.getContext(), this);
            this.f69475Z = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f69475Z) {
            return null;
        }
        o0();
        return this.f69474Y;
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
        if (!this.f69476y0) {
            this.f69476y0 = true;
            ((g) ((C17600c) C17602e.a(this)).g0()).B1((CommunicationPreferencesFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f69474Y;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
