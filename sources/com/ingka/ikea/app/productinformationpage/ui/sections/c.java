package com.ingka.ikea.app.productinformationpage.ui.sections;

import Xh.j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

abstract class c extends SectionBaseFragment {

    /* renamed from: T  reason: collision with root package name */
    private ContextWrapper f72141T;

    /* renamed from: U  reason: collision with root package name */
    private boolean f72142U;

    /* renamed from: X  reason: collision with root package name */
    private boolean f72143X = false;

    c() {
    }

    private void o0() {
        if (this.f72141T == null) {
            this.f72141T = C17410g.b(super.getContext(), this);
            this.f72142U = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f72142U) {
            return null;
        }
        o0();
        return this.f72141T;
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
        if (!this.f72143X) {
            this.f72143X = true;
            ((j) ((C17600c) C17602e.a(this)).g0()).z((MaterialsAndCareFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f72141T;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
