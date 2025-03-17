package n2;

import java.util.Iterator;
import m2.C5573a;
import m2.g;

public class j extends C5644d {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26576a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                m2.g$a[] r0 = m2.g.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26576a = r0
                m2.g$a r1 = m2.g.a.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26576a     // Catch:{ NoSuchFieldError -> 0x001d }
                m2.g$a r1 = m2.g.a.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26576a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m2.g$a r1 = m2.g.a.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.j.a.<clinit>():void");
        }
    }

    public j(g gVar) {
        super(gVar, g.d.VERTICAL_CHAIN);
    }

    public void apply() {
        Iterator<Object> it = this.f26153o0.iterator();
        while (it.hasNext()) {
            this.f26151m0.d(it.next()).v();
        }
        Iterator<Object> it2 = this.f26153o0.iterator();
        C5573a aVar = null;
        C5573a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            C5573a d10 = this.f26151m0.d(next);
            if (aVar2 == null) {
                Object obj = this.f26070S;
                if (obj != null) {
                    d10.m0(obj).J(this.f26104o).L(this.f26110u);
                } else {
                    Object obj2 = this.f26071T;
                    if (obj2 != null) {
                        d10.l0(obj2).J(this.f26104o).L(this.f26110u);
                    } else {
                        String obj3 = d10.getKey().toString();
                        d10.m0(g.f26155k).K(Float.valueOf(B0(obj3))).M(Float.valueOf(A0(obj3)));
                    }
                }
                aVar2 = d10;
            }
            if (aVar != null) {
                String obj4 = aVar.getKey().toString();
                String obj5 = d10.getKey().toString();
                aVar.q(d10.getKey()).K(Float.valueOf(z0(obj4))).M(Float.valueOf(y0(obj4)));
                d10.l0(aVar.getKey()).K(Float.valueOf(B0(obj5))).M(Float.valueOf(A0(obj5)));
            }
            float C02 = C0(next.toString());
            if (C02 != -1.0f) {
                d10.d0(C02);
            }
            aVar = d10;
        }
        if (aVar != null) {
            Object obj6 = this.f26073V;
            if (obj6 != null) {
                aVar.q(obj6).J(this.f26105p).L(this.f26111v);
            } else {
                Object obj7 = this.f26074W;
                if (obj7 != null) {
                    aVar.p(obj7).J(this.f26105p).L(this.f26111v);
                } else {
                    String obj8 = aVar.getKey().toString();
                    aVar.p(g.f26155k).K(Float.valueOf(z0(obj8))).M(Float.valueOf(y0(obj8)));
                }
            }
        }
        if (aVar2 != null) {
            float f10 = this.f26521q0;
            if (f10 != 0.5f) {
                aVar2.q0(f10);
            }
            int i10 = a.f26576a[this.f26527w0.ordinal()];
            if (i10 == 1) {
                aVar2.c0(0);
            } else if (i10 == 2) {
                aVar2.c0(1);
            } else if (i10 == 3) {
                aVar2.c0(2);
            }
        }
    }
}
