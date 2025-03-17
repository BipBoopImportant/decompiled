package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.C7411t2;
import com.google.android.gms.internal.measurement.C7419u2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.O6;
import j0.C5445a;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class a6 {

    /* renamed from: a  reason: collision with root package name */
    private String f50047a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f50048b;

    /* renamed from: c  reason: collision with root package name */
    private C2 f50049c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f50050d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f50051e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f50052f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, List<Long>> f50053g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Y5 f50054h;

    /* access modifiers changed from: package-private */
    public final C7411t2 a(int i10) {
        ArrayList arrayList;
        List list;
        C7411t2.a M10 = C7411t2.M();
        M10.z(i10);
        M10.D(this.f50048b);
        C2 c22 = this.f50049c;
        if (c22 != null) {
            M10.C(c22);
        }
        C2.a I10 = C2.U().D(N5.M(this.f50050d)).I(N5.M(this.f50051e));
        if (this.f50052f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f50052f.size());
            for (Integer next : this.f50052f.keySet()) {
                int intValue = next.intValue();
                Long l10 = this.f50052f.get(next);
                if (l10 != null) {
                    arrayList.add((C7419u2) ((L4) C7419u2.M().z(intValue).A(l10.longValue()).s()));
                }
            }
        }
        if (arrayList != null) {
            I10.A(arrayList);
        }
        if (this.f50053g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f50053g.size());
            for (Integer next2 : this.f50053g.keySet()) {
                D2.a z10 = D2.N().z(next2.intValue());
                List list2 = this.f50053g.get(next2);
                if (list2 != null) {
                    Collections.sort(list2);
                    z10.A(list2);
                }
                arrayList2.add((D2) ((L4) z10.s()));
            }
            list = arrayList2;
        }
        I10.G(list);
        M10.A(I10);
        return (C7411t2) ((L4) M10.s());
    }

    /* access modifiers changed from: package-private */
    public final void c(C7562b bVar) {
        int a10 = bVar.a();
        Boolean bool = bVar.f50057c;
        if (bool != null) {
            this.f50051e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = bVar.f50058d;
        if (bool2 != null) {
            this.f50050d.set(a10, bool2.booleanValue());
        }
        if (bVar.f50059e != null) {
            Long l10 = this.f50052f.get(Integer.valueOf(a10));
            long longValue = bVar.f50059e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f50052f.put(Integer.valueOf(a10), Long.valueOf(longValue));
            }
        }
        if (bVar.f50060f != null) {
            List list = this.f50053g.get(Integer.valueOf(a10));
            if (list == null) {
                list = new ArrayList();
                this.f50053g.put(Integer.valueOf(a10), list);
            }
            if (bVar.j()) {
                list.clear();
            }
            if (O6.a() && this.f50054h.a().H(this.f50047a, K.f49691A0) && bVar.i()) {
                list.clear();
            }
            if (!O6.a() || !this.f50054h.a().H(this.f50047a, K.f49691A0)) {
                list.add(Long.valueOf(bVar.f50060f.longValue() / 1000));
                return;
            }
            long longValue2 = bVar.f50060f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    private a6(Y5 y52, String str) {
        this.f50054h = y52;
        this.f50047a = str;
        this.f50048b = true;
        this.f50050d = new BitSet();
        this.f50051e = new BitSet();
        this.f50052f = new C5445a();
        this.f50053g = new C5445a();
    }

    private a6(Y5 y52, String str, C2 c22, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f50054h = y52;
        this.f50047a = str;
        this.f50050d = bitSet;
        this.f50051e = bitSet2;
        this.f50052f = map;
        this.f50053g = new C5445a();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f50053g.put(next, arrayList);
            }
        }
        this.f50048b = false;
        this.f50049c = c22;
    }
}
