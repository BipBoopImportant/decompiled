package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

final class K implements Comparator<C7400s> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7361n f48700a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7275d3 f48701b;

    K(C7361n nVar, C7275d3 d3Var) {
        this.f48700a = nVar;
        this.f48701b = d3Var;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C7400s sVar = (C7400s) obj;
        C7400s sVar2 = (C7400s) obj2;
        C7361n nVar = this.f48700a;
        C7275d3 d3Var = this.f48701b;
        if (sVar instanceof C7456z) {
            return !(sVar2 instanceof C7456z) ? 1 : 0;
        }
        if (sVar2 instanceof C7456z) {
            return -1;
        }
        if (nVar == null) {
            return sVar.i().compareTo(sVar2.i());
        }
        return (int) C7265c2.a(nVar.a(d3Var, Arrays.asList(new C7400s[]{sVar, sVar2})).h().doubleValue());
    }
}
