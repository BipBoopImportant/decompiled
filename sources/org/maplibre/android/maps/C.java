package org.maplibre.android.maps;

import android.graphics.RectF;
import j0.C5468y;
import java.util.ArrayList;
import java.util.List;
import wL.C18566a;

class C implements D {

    /* renamed from: a  reason: collision with root package name */
    private final v f145699a;

    /* renamed from: b  reason: collision with root package name */
    private final C5468y<C18566a> f145700b;

    C(v vVar, C5468y<C18566a> yVar) {
        this.f145699a = vVar;
        this.f145700b = yVar;
    }

    private List<C18566a> b(long[] jArr) {
        ArrayList arrayList = new ArrayList();
        for (long d10 : jArr) {
            C18566a d11 = this.f145700b.d(d10);
            if (d11 != null) {
                arrayList.add(d11);
            }
        }
        return arrayList;
    }

    public List<C18566a> a(RectF rectF) {
        return b(this.f145699a.Q(this.f145699a.H(rectF)));
    }
}
