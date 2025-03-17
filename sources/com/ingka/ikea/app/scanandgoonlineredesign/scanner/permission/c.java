package com.ingka.ikea.app.scanandgoonlineredesign.scanner.permission;

import Gj.f;
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

abstract class c extends BaseComposeDialogFragment {

    /* renamed from: N  reason: collision with root package name */
    private ContextWrapper f92060N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f92061O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f92062P = false;

    c() {
    }

    private void o0() {
        if (this.f92060N == null) {
            this.f92060N = C17410g.b(super.getContext(), this);
            this.f92061O = C17219a.a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f92061O) {
            return null;
        }
        o0();
        return this.f92060N;
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
        if (!this.f92062P) {
            this.f92062P = true;
            ((f) ((C17600c) C17602e.a(this)).g0()).f0((RationalePermissionPromptDialogFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f92060N;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
