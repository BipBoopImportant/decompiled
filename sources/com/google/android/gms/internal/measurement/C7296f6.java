package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f6  reason: case insensitive filesystem */
public final class C7296f6 extends r {

    /* renamed from: b  reason: collision with root package name */
    private final C7271d f48922b;

    public C7296f6(C7271d dVar) {
        this.f48922b = dVar;
    }

    public final C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                C7265c2.g("getEventName", 0, list);
                return new C7416u(this.f48922b.d().e());
            case 1:
                C7265c2.g("getTimestamp", 0, list);
                return new C7334k(Double.valueOf((double) this.f48922b.d().a()));
            case 2:
                C7265c2.g("getParamValue", 1, list);
                return C7294f4.b(this.f48922b.d().b(d3Var.b(list.get(0)).i()));
            case 3:
                C7265c2.g("getParams", 0, list);
                Map<String, Object> g10 = this.f48922b.d().g();
                r rVar = new r();
                for (String next : g10.keySet()) {
                    rVar.m(next, C7294f4.b(g10.get(next)));
                }
                return rVar;
            case 4:
                C7265c2.g("setParamValue", 2, list);
                String i10 = d3Var.b(list.get(0)).i();
                C7400s b10 = d3Var.b(list.get(1));
                this.f48922b.d().d(i10, C7265c2.d(b10));
                return b10;
            case 5:
                C7265c2.g("setEventName", 1, list);
                C7400s b11 = d3Var.b(list.get(0));
                if (C7400s.f49052k0.equals(b11) || C7400s.f49053l0.equals(b11)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f48922b.d().f(b11.i());
                return new C7416u(b11.i());
            default:
                return super.k(str, d3Var, list);
        }
    }
}
