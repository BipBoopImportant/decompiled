package com.google.android.gms.maps;

import G9.C6522c;
import T9.a;
import T9.e;
import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import oa.C8621e;
import oa.C8622f;
import pa.C8643d;
import pa.Q;
import qa.m;

final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f49487e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f49488f;

    /* renamed from: g  reason: collision with root package name */
    protected e f49489g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleMapOptions f49490h;

    /* renamed from: i  reason: collision with root package name */
    private final List f49491i = new ArrayList();

    d(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f49487e = viewGroup;
        this.f49488f = context;
        this.f49490h = googleMapOptions;
    }

    /* access modifiers changed from: protected */
    public final void a(e eVar) {
        this.f49489g = eVar;
        s();
    }

    public final void r(C8622f fVar) {
        if (b() != null) {
            ((c) b()).a(fVar);
        } else {
            this.f49491i.add(fVar);
        }
    }

    public final void s() {
        if (this.f49489g != null && b() == null) {
            try {
                C8621e.a(this.f49488f);
                C8643d d12 = Q.a(this.f49488f, (C8621e.a) null).d1(T9.d.L3(this.f49488f), this.f49490h);
                if (d12 != null) {
                    this.f49489g.a(new c(this.f49487e, d12));
                    for (C8622f a10 : this.f49491i) {
                        ((c) b()).a(a10);
                    }
                    this.f49491i.clear();
                }
            } catch (RemoteException e10) {
                throw new m(e10);
            } catch (C6522c unused) {
            }
        }
    }
}
