package n2;

import java.util.Iterator;
import m2.C5573a;
import m2.g;

public class i extends C5644d {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26575a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                m2.g$a[] r0 = m2.g.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26575a = r0
                m2.g$a r1 = m2.g.a.SPREAD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26575a     // Catch:{ NoSuchFieldError -> 0x001d }
                m2.g$a r1 = m2.g.a.SPREAD_INSIDE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26575a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m2.g$a r1 = m2.g.a.PACKED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n2.i.a.<clinit>():void");
        }
    }

    public i(g gVar) {
        super(gVar, g.d.HORIZONTAL_CHAIN);
    }

    public void apply() {
        Iterator<Object> it = this.f26153o0.iterator();
        while (it.hasNext()) {
            this.f26151m0.d(it.next()).u();
        }
        Iterator<Object> it2 = this.f26153o0.iterator();
        C5573a aVar = null;
        C5573a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            C5573a d10 = this.f26151m0.d(next);
            if (aVar2 == null) {
                Object obj = this.f26066O;
                if (obj != null) {
                    d10.i0(obj).J(this.f26102m).L(this.f26108s);
                } else {
                    Object obj2 = this.f26067P;
                    if (obj2 != null) {
                        d10.h0(obj2).J(this.f26102m).L(this.f26108s);
                    } else {
                        Object obj3 = this.f26062K;
                        if (obj3 != null) {
                            d10.i0(obj3).J(this.f26098k).L(this.f26106q);
                        } else {
                            Object obj4 = this.f26063L;
                            if (obj4 != null) {
                                d10.h0(obj4).J(this.f26098k).L(this.f26106q);
                            } else {
                                String obj5 = d10.getKey().toString();
                                d10.i0(g.f26155k).K(Float.valueOf(B0(obj5))).M(Float.valueOf(A0(obj5)));
                            }
                        }
                    }
                }
                aVar2 = d10;
            }
            if (aVar != null) {
                String obj6 = aVar.getKey().toString();
                String obj7 = d10.getKey().toString();
                aVar.A(d10.getKey()).K(Float.valueOf(z0(obj6))).M(Float.valueOf(y0(obj6)));
                d10.h0(aVar.getKey()).K(Float.valueOf(B0(obj7))).M(Float.valueOf(A0(obj7)));
            }
            float C02 = C0(next.toString());
            if (C02 != -1.0f) {
                d10.a0(C02);
            }
            aVar = d10;
        }
        if (aVar != null) {
            Object obj8 = this.f26068Q;
            if (obj8 != null) {
                aVar.A(obj8).J(this.f26103n).L(this.f26109t);
            } else {
                Object obj9 = this.f26069R;
                if (obj9 != null) {
                    aVar.z(obj9).J(this.f26103n).L(this.f26109t);
                } else {
                    Object obj10 = this.f26064M;
                    if (obj10 != null) {
                        aVar.A(obj10).J(this.f26100l).L(this.f26107r);
                    } else {
                        Object obj11 = this.f26065N;
                        if (obj11 != null) {
                            aVar.z(obj11).J(this.f26100l).L(this.f26107r);
                        } else {
                            String obj12 = aVar.getKey().toString();
                            aVar.z(g.f26155k).K(Float.valueOf(z0(obj12))).M(Float.valueOf(y0(obj12)));
                        }
                    }
                }
            }
        }
        if (aVar2 != null) {
            float f10 = this.f26521q0;
            if (f10 != 0.5f) {
                aVar2.F(f10);
            }
            int i10 = a.f26575a[this.f26527w0.ordinal()];
            if (i10 == 1) {
                aVar2.Z(0);
            } else if (i10 == 2) {
                aVar2.Z(1);
            } else if (i10 == 3) {
                aVar2.Z(2);
            }
        }
    }
}
