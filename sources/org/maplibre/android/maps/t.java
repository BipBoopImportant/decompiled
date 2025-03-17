package org.maplibre.android.maps;

import android.graphics.RectF;
import j0.C5468y;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import wL.C18566a;

class t implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v f146034a;

    /* renamed from: b  reason: collision with root package name */
    private final C5468y<C18566a> f146035b;

    /* renamed from: c  reason: collision with root package name */
    private final C17738g f146036c;

    t(v vVar, C5468y<C18566a> yVar, C17738g gVar) {
        this.f146034a = vVar;
        this.f146035b = yVar;
        this.f146036c = gVar;
    }

    private List<C18566a> c() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f146035b.o(); i10++) {
            C5468y<C18566a> yVar = this.f146035b;
            arrayList.add(yVar.d(yVar.j(i10)));
        }
        return arrayList;
    }

    public List<Marker> a(RectF rectF) {
        long[] h02 = this.f146034a.h0(this.f146034a.H(rectF));
        ArrayList arrayList = new ArrayList(h02.length);
        for (long valueOf : h02) {
            arrayList.add(Long.valueOf(valueOf));
        }
        ArrayList arrayList2 = new ArrayList(h02.length);
        List<C18566a> c10 = c();
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            C18566a aVar = c10.get(i10);
            if ((aVar instanceof Marker) && arrayList.contains(Long.valueOf(aVar.b()))) {
                arrayList2.add((Marker) aVar);
            }
        }
        return new ArrayList(arrayList2);
    }

    public void b() {
        this.f146036c.e();
        int o10 = this.f146035b.o();
        for (int i10 = 0; i10 < o10; i10++) {
            C18566a d10 = this.f146035b.d((long) i10);
            if (d10 instanceof Marker) {
                Marker marker = (Marker) d10;
                this.f146034a.t(d10.b());
                marker.m(this.f146034a.C(marker));
            }
        }
    }
}
