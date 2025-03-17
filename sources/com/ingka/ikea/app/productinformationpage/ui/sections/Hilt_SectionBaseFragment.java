package com.ingka.ikea.app.productinformationpage.ui.sections;

import Xh.r;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ingka.ikea.core.android.fragments.BaseFragment;
import fH.C17219a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_SectionBaseFragment extends BaseFragment {

    /* renamed from: O  reason: collision with root package name */
    private ContextWrapper f72120O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f72121P;

    /* renamed from: Q  reason: collision with root package name */
    private boolean f72122Q = false;

    private void o0() {
        if (this.f72120O == null) {
            this.f72120O = C17410g.b(super.getContext(), this);
            this.f72121P = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f72121P) {
            return null;
        }
        o0();
        return this.f72120O;
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
        if (!this.f72122Q) {
            this.f72122Q = true;
            ((r) ((C17600c) C17602e.a(this)).g0()).o((SectionBaseFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f72120O;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
