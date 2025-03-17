package com.ingka.ikea.account.impl.modalsettings.editprofile;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.account.impl.dynamicfields.DynamicFieldsDelegateFragment;
import fH.C17219a;
import fe.k;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class a extends DynamicFieldsDelegateFragment {

    /* renamed from: M0  reason: collision with root package name */
    private ContextWrapper f69794M0;

    /* renamed from: N0  reason: collision with root package name */
    private boolean f69795N0;

    /* renamed from: O0  reason: collision with root package name */
    private boolean f69796O0 = false;

    a() {
    }

    private void o0() {
        if (this.f69794M0 == null) {
            this.f69794M0 = C17410g.b(super.getContext(), this);
            this.f69795N0 = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f69795N0) {
            return null;
        }
        o0();
        return this.f69794M0;
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
        if (!this.f69796O0) {
            this.f69796O0 = true;
            ((k) ((C17600c) C17602e.a(this)).g0()).N((EditProfileFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f69794M0;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
