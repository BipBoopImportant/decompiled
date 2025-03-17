package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t  reason: case insensitive filesystem */
public final class C7408t extends C7361n implements C7352m {

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f49074c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C7400s> f49075d;

    /* renamed from: e  reason: collision with root package name */
    private C7275d3 f49076e;

    private C7408t(C7408t tVar) {
        super(tVar.f49017a);
        ArrayList arrayList = new ArrayList(tVar.f49074c.size());
        this.f49074c = arrayList;
        arrayList.addAll(tVar.f49074c);
        ArrayList arrayList2 = new ArrayList(tVar.f49075d.size());
        this.f49075d = arrayList2;
        arrayList2.addAll(tVar.f49075d);
        this.f49076e = tVar.f49076e;
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        C7275d3 d10 = this.f49076e.d();
        for (int i10 = 0; i10 < this.f49074c.size(); i10++) {
            if (i10 < list.size()) {
                d10.e(this.f49074c.get(i10), d3Var.b(list.get(i10)));
            } else {
                d10.e(this.f49074c.get(i10), C7400s.f49052k0);
            }
        }
        for (C7400s next : this.f49075d) {
            C7400s b10 = d10.b(next);
            if (b10 instanceof C7424v) {
                b10 = d10.b(next);
            }
            if (b10 instanceof C7343l) {
                return ((C7343l) b10).a();
            }
        }
        return C7400s.f49052k0;
    }

    public final C7400s zzc() {
        return new C7408t(this);
    }

    public C7408t(String str, List<C7400s> list, List<C7400s> list2, C7275d3 d3Var) {
        super(str);
        this.f49074c = new ArrayList();
        this.f49076e = d3Var;
        if (!list.isEmpty()) {
            for (C7400s i10 : list) {
                this.f49074c.add(i10.i());
            }
        }
        this.f49075d = new ArrayList(list2);
    }
}
