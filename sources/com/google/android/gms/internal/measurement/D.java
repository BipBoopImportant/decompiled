package com.google.android.gms.internal.measurement;

import java.util.List;

public final class D extends A {
    public D() {
        this.f48528a.add(Z.EQUALS);
        this.f48528a.add(Z.GREATER_THAN);
        this.f48528a.add(Z.GREATER_THAN_EQUALS);
        this.f48528a.add(Z.IDENTITY_EQUALS);
        this.f48528a.add(Z.IDENTITY_NOT_EQUALS);
        this.f48528a.add(Z.LESS_THAN);
        this.f48528a.add(Z.LESS_THAN_EQUALS);
        this.f48528a.add(Z.NOT_EQUALS);
    }

    private static boolean c(C7400s sVar, C7400s sVar2) {
        C7400s uVar;
        C7400s uVar2;
        while (!sVar.getClass().equals(sVar2.getClass())) {
            if (((sVar instanceof C7456z) || (sVar instanceof C7385q)) && ((sVar2 instanceof C7456z) || (sVar2 instanceof C7385q))) {
                return true;
            }
            boolean z10 = sVar instanceof C7334k;
            if (!z10 || !(sVar2 instanceof C7416u)) {
                boolean z11 = sVar instanceof C7416u;
                if (z11 && (sVar2 instanceof C7334k)) {
                    uVar = new C7334k(sVar.h());
                } else if (sVar instanceof C7307h) {
                    uVar = new C7334k(sVar.h());
                } else if (sVar2 instanceof C7307h) {
                    uVar2 = new C7334k(sVar2.h());
                } else if ((z11 || z10) && (sVar2 instanceof C7352m)) {
                    uVar2 = new C7416u(sVar2.i());
                } else if (!(sVar instanceof C7352m) || (!(sVar2 instanceof C7416u) && !(sVar2 instanceof C7334k))) {
                    return false;
                } else {
                    uVar = new C7416u(sVar.i());
                }
                sVar = uVar;
            } else {
                uVar2 = new C7334k(sVar2.h());
            }
            sVar2 = uVar2;
        }
        if ((sVar instanceof C7456z) || (sVar instanceof C7385q)) {
            return true;
        }
        return sVar instanceof C7334k ? !Double.isNaN(sVar.h().doubleValue()) && !Double.isNaN(sVar2.h().doubleValue()) && sVar.h().doubleValue() == sVar2.h().doubleValue() : sVar instanceof C7416u ? sVar.i().equals(sVar2.i()) : sVar instanceof C7307h ? sVar.zzd().equals(sVar2.zzd()) : sVar == sVar2;
    }

    private static boolean d(C7400s sVar, C7400s sVar2) {
        if (sVar instanceof C7352m) {
            sVar = new C7416u(sVar.i());
        }
        if (sVar2 instanceof C7352m) {
            sVar2 = new C7416u(sVar2.i());
        }
        if ((sVar instanceof C7416u) && (sVar2 instanceof C7416u)) {
            return sVar.i().compareTo(sVar2.i()) < 0;
        }
        double doubleValue = sVar.h().doubleValue();
        double doubleValue2 = sVar2.h().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == 0.0d && doubleValue2 == -0.0d) && (!(doubleValue == -0.0d && doubleValue2 == 0.0d) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    private static boolean e(C7400s sVar, C7400s sVar2) {
        if (sVar instanceof C7352m) {
            sVar = new C7416u(sVar.i());
        }
        if (sVar2 instanceof C7352m) {
            sVar2 = new C7416u(sVar2.i());
        }
        return (((sVar instanceof C7416u) && (sVar2 instanceof C7416u)) || (!Double.isNaN(sVar.h().doubleValue()) && !Double.isNaN(sVar2.h().doubleValue()))) && !d(sVar2, sVar);
    }

    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        boolean z10;
        boolean h10;
        C7265c2.f(C7265c2.c(str), 2, list);
        C7400s b10 = d3Var.b(list.get(0));
        C7400s b11 = d3Var.b(list.get(1));
        switch (G.f48658a[C7265c2.c(str).ordinal()]) {
            case 1:
                z10 = c(b10, b11);
                break;
            case 2:
                z10 = d(b11, b10);
                break;
            case 3:
                z10 = e(b11, b10);
                break;
            case 4:
                z10 = C7265c2.h(b10, b11);
                break;
            case 5:
                h10 = C7265c2.h(b10, b11);
                break;
            case 6:
                z10 = d(b10, b11);
                break;
            case 7:
                z10 = e(b10, b11);
                break;
            case 8:
                h10 = c(b10, b11);
                break;
            default:
                return super.a(str);
        }
        z10 = !h10;
        return z10 ? C7400s.f49057p0 : C7400s.f49058q0;
    }
}
