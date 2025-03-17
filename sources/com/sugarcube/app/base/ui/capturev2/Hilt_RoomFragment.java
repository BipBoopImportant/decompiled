package com.sugarcube.app.base.ui.capturev2;

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

public abstract class Hilt_RoomFragment extends PermissionsFragment {

    /* renamed from: Q  reason: collision with root package name */
    private ContextWrapper f123488Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f123489R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f123490S = false;

    private void C0() {
        if (this.f123488Q == null) {
            this.f123488Q = C17410g.b(super.getContext(), this);
            this.f123489R = C17219a.a(super.getContext());
        }
    }

    /* access modifiers changed from: protected */
    public void D0() {
        if (!this.f123490S) {
            this.f123490S = true;
            ((RoomFragment_GeneratedInjector) ((C17600c) C17602e.a(this)).g0()).injectRoomFragment((RoomFragment) C17602e.a(this));
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f123489R) {
            return null;
        }
        C0();
        return this.f123488Q;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        C0();
        D0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C17410g.c(onGetLayoutInflater, this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f123488Q;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        C0();
        D0();
    }
}
