package com.google.android.gms.maps;

import K9.C6620s;
import T9.d;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import oa.C8622f;
import pa.C8643d;
import pa.P;
import qa.m;

final class c implements T9.c {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f49484a;

    /* renamed from: b  reason: collision with root package name */
    private final C8643d f49485b;

    /* renamed from: c  reason: collision with root package name */
    private View f49486c;

    public c(ViewGroup viewGroup, C8643d dVar) {
        this.f49485b = (C8643d) C6620s.l(dVar);
        this.f49484a = (ViewGroup) C6620s.l(viewGroup);
    }

    public final void a(C8622f fVar) {
        try {
            this.f49485b.B(new b(this, fVar));
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void g() {
        try {
            this.f49485b.g();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void k() {
        try {
            this.f49485b.k();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void l() {
        try {
            this.f49485b.l();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void onLowMemory() {
        try {
            this.f49485b.onLowMemory();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void onPause() {
        try {
            this.f49485b.onPause();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void onResume() {
        try {
            this.f49485b.onResume();
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void s(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            P.b(bundle, bundle2);
            this.f49485b.s(bundle2);
            P.b(bundle2, bundle);
            this.f49486c = (View) d.K3(this.f49485b.c());
            this.f49484a.removeAllViews();
            this.f49484a.addView(this.f49486c);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }

    public final void t(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            P.b(bundle, bundle2);
            this.f49485b.t(bundle2);
            P.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new m(e10);
        }
    }
}
