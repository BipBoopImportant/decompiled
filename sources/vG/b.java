package Vg;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import RC.m;
import RC.n;
import Vg.a;
import YH.C16877v;
import ip.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qx.C14957b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001EB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\u00020\u0017*\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0004\u0018\u00010\u0017*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0019JM\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00112\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'J9\u0010+\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020#2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00112\b\u0010%\u001a\u0004\u0018\u00010#2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,J7\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u0011H\u0002¢\u0006\u0004\b1\u00102J-\u00106\u001a\b\u0012\u0004\u0012\u00020)0\u00112\b\u00103\u001a\u0004\u0018\u00010#2\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0011H\u0002¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u0004\u0018\u00010:*\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020?*\u0004\u0018\u00010#2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020?*\u0004\u0018\u00010#2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bB\u0010AJ8\u0010E\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010G¨\u0006H"}, d2 = {"LVg/b;", "LVg/a;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "LVg/a$a;", "price", "LIC/e;", "title", "", "showTotalPriceExclVat", "showPriceEntriesExclVat", "showTaxDetails", "showGiftCardDisclaimer", "showSections", "includeFamilySavingsInSummary", "", "LVg/a$a$g;", "transactions", "LRC/m;", "m", "(LVg/a$a;LIC/e;ZZZZZZLjava/util/List;)LRC/m;", "LRC/m$c;", "g", "(LVg/a$a;ZZ)LRC/m$c;", "LVg/a$a$b;", "deliveryPrice", "c", "(LVg/a$a$b;ZZ)LRC/m$c;", "j", "LVg/a$a$d;", "discountSummaries", "LVg/a$a$c;", "coupon", "", "familySavings", "totalSavings", "h", "(ZZLjava/util/List;LVg/a$a$c;Ljava/lang/Double;Ljava/lang/Double;)LRC/m$c;", "savingsSum", "LRC/m$c$a;", "savingEntries", "i", "(DLjava/util/List;Ljava/lang/Double;Z)LRC/m$c;", "LVg/a$a$e;", "totalPrice", "taxEntries", "LRC/m$d;", "l", "(LVg/a$a$e;ZZLjava/util/List;)LRC/m$d;", "totalPriceTax", "LVg/a$a$f;", "salesTaxes", "k", "(Ljava/lang/Double;Ljava/util/List;)Ljava/util/List;", "d", "(LVg/a$a;)LIC/e;", "LRC/m$a;", "b", "(LVg/a$a;)LRC/m$a;", "Lkp/d;", "currencyConfig", "", "f", "(Ljava/lang/Double;Lkp/d;)Ljava/lang/String;", "e", "LVg/a$b;", "priceSummaryConfig", "a", "(LVg/a$a;LIC/e;Ljava/util/List;LVg/a$b;)LRC/m;", "LIl/a;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f64599b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f64600c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f64601a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LVg/b$a;", "", "<init>", "()V", "", "MISSING_PRICE_REPRESENTATION", "Ljava/lang/String;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f64601a = aVar;
    }

    private final m.a b(a.C1128a aVar) {
        a.C1128a.C1129a a10 = aVar.a();
        if (a10 == null) {
            return null;
        }
        m.d dVar = new m.d(C13026h.a(Oo.b.f84443M5), new n.a(C14957b.a(a10.a(), this.f64601a.s()), this.f64601a.s()), C16877v.n());
        Iterable<a.C1128a.C1129a.C1130a> b10 = a10.b();
        ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
        for (a.C1128a.C1129a.C1130a aVar2 : b10) {
            arrayList.add(new m.a.C2837a(aVar2.c(), aVar2.d(), aVar2.e(), e(Double.valueOf(aVar2.a()), this.f64601a.s()), aVar2.b()));
        }
        return new m.a(dVar, C15985a.h(arrayList));
    }

    private final m.c c(a.C1128a.b bVar, boolean z10, boolean z11) {
        String str;
        Double d10 = null;
        if (z10) {
            a.C1128a.e b10 = bVar.b();
            if (b10 != null) {
                d10 = Double.valueOf(b10.a());
            }
        } else {
            a.C1128a.e b11 = bVar.b();
            if (b11 != null) {
                d10 = b11.b();
            }
        }
        C13023e a10 = C13026h.a(Oo.b.f84613d2);
        if (d10 == null || (str = f(d10, this.f64601a.s())) == null) {
            str = "-";
        }
        return z11 ? new m.c(a10, (String) null, C16877v.e(new m.c.a(bVar.a(), str)), 2, (DefaultConstructorMarker) null) : new m.c((C13023e) null, (String) null, C16877v.e(new m.c.a(a10, str)), 2, (DefaultConstructorMarker) null);
    }

    private final C13023e d(a.C1128a aVar) {
        if (g.a(aVar.l(), 0.0d)) {
            return C13026h.b(Oo.b.f84470P2, f(aVar.l(), this.f64601a.s()));
        }
        if (g.a(aVar.f(), 0.0d)) {
            return C13026h.b(Oo.b.f84480Q2, f(aVar.f(), this.f64601a.s()));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = qx.C14956a.f130484a.a(r3.doubleValue(), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String e(java.lang.Double r3, kp.C11522d r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000e
            double r0 = r3.doubleValue()
            qx.a r3 = qx.C14956a.f130484a
            java.lang.String r3 = r3.a(r0, r4)
            if (r3 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r3 = "-"
        L_0x0010:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Vg.b.e(java.lang.Double, kp.d):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = qx.C14956a.f130484a.b(r3.doubleValue(), r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String f(java.lang.Double r3, kp.C11522d r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000e
            double r0 = r3.doubleValue()
            qx.a r3 = qx.C14956a.f130484a
            java.lang.String r3 = r3.b(r0, r4)
            if (r3 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r3 = "-"
        L_0x0010:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Vg.b.f(java.lang.Double, kp.d):java.lang.String");
    }

    private final m.c g(a.C1128a aVar, boolean z10, boolean z11) {
        String str;
        Double d10 = null;
        if (z10) {
            a.C1128a.e j10 = aVar.j();
            if (j10 != null) {
                d10 = Double.valueOf(j10.a());
            }
        } else {
            a.C1128a.e j11 = aVar.j();
            if (j11 != null) {
                d10 = j11.b();
            }
        }
        C13023e a10 = C13026h.a(Oo.b.f84393H5);
        if (d10 == null || (str = f(d10, this.f64601a.s())) == null) {
            str = "-";
        }
        return z11 ? new m.c(a10, str, C16877v.n()) : new m.c((C13023e) null, (String) null, C16877v.e(new m.c.a(a10, str)), 2, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [RC.m$c$a] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1 == null) goto L_0x0046;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final RC.m.c h(boolean r16, boolean r17, java.util.List<Vg.a.C1128a.d> r18, Vg.a.C1128a.c r19, java.lang.Double r20, java.lang.Double r21) {
        /*
            r15 = this;
            r6 = r15
            r0 = r20
            r1 = 0
            if (r19 == 0) goto L_0x0056
            r2 = r18
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0018
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0018
            goto L_0x0037
        L_0x0018:
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r2.next()
            Vg.a$a$d r3 = (Vg.a.C1128a.d) r3
            java.lang.String r3 = r3.b()
            java.lang.String r4 = r19.a()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x001c
            goto L_0x0056
        L_0x0037:
            java.lang.String r2 = r19.b()
            if (r2 == 0) goto L_0x0046
            boolean r3 = HJ.C15854t.v0(r2)
            if (r3 != 0) goto L_0x0044
            r1 = r2
        L_0x0044:
            if (r1 != 0) goto L_0x004a
        L_0x0046:
            java.lang.String r1 = r19.a()
        L_0x004a:
            RC.m$c$a r2 = new RC.m$c$a
            IC.e r1 = IC.C13026h.c(r1)
            java.lang.String r3 = "-"
            r2.<init>(r1, r3)
            r1 = r2
        L_0x0056:
            java.util.List r2 = YH.C16877v.c()
            r3 = r18
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
            r7 = 0
            r9 = r7
        L_0x0070:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r3.next()
            Vg.a$a$d r5 = (Vg.a.C1128a.d) r5
            IC.e r11 = r5.c()
            if (r11 != 0) goto L_0x008e
            java.lang.String r11 = r5.b()
            if (r11 != 0) goto L_0x008a
            java.lang.String r11 = ""
        L_0x008a:
            IC.e r11 = IC.C13026h.c(r11)
        L_0x008e:
            double r12 = r5.a()
            double r9 = r9 + r12
            RC.m$c$a r12 = new RC.m$c$a
            double r13 = r5.a()
            java.lang.Double r5 = java.lang.Double.valueOf(r13)
            Il.a r13 = r6.f64601a
            kp.d r13 = r13.s()
            java.lang.String r5 = r15.e(r5, r13)
            r12.<init>(r11, r5)
            r4.add(r12)
            goto L_0x0070
        L_0x00ae:
            r2.addAll(r4)
            if (r1 == 0) goto L_0x00b6
            r2.add(r1)
        L_0x00b6:
            if (r17 == 0) goto L_0x00dd
            boolean r1 = ip.g.a(r0, r7)
            if (r1 == 0) goto L_0x00dd
            if (r0 == 0) goto L_0x00c5
            double r3 = r20.doubleValue()
            double r9 = r9 + r3
        L_0x00c5:
            RC.m$c$a r1 = new RC.m$c$a
            int r3 = Oo.b.f84403I5
            IC.e r3 = IC.C13026h.a(r3)
            Il.a r4 = r6.f64601a
            kp.d r4 = r4.s()
            java.lang.String r0 = r15.e(r0, r4)
            r1.<init>(r3, r0)
            r2.add(r1)
        L_0x00dd:
            java.util.List r3 = YH.C16877v.a(r2)
            r0 = r15
            r1 = r9
            r4 = r21
            r5 = r16
            RC.m$c r0 = r0.i(r1, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Vg.b.h(boolean, boolean, java.util.List, Vg.a$a$c, java.lang.Double, java.lang.Double):RC.m$c");
    }

    private final m.c i(double d10, List<m.c.a> list, Double d11, boolean z10) {
        String str = null;
        if (list.isEmpty() && !g.a(d11, 0.0d)) {
            return null;
        }
        C13023e a10 = C13026h.a(Oo.b.f84413J5);
        if (z10) {
            if (d11 != null) {
                str = e(d11, this.f64601a.s());
            }
            return new m.c(a10, str, list);
        }
        if (!g.a(d11, 0.0d)) {
            d11 = g.a(Double.valueOf(d10), 0.0d) ? Double.valueOf(d10) : null;
        }
        if (d11 != null) {
            return new m.c((C13023e) null, (String) null, C16877v.e(new m.c.a(a10, e(Double.valueOf(d11.doubleValue()), this.f64601a.s()))), 2, (DefaultConstructorMarker) null);
        }
        return null;
    }

    private final m.c j(a.C1128a aVar, boolean z10, boolean z11) {
        a.C1128a.e h10 = aVar.h();
        if (h10 == null) {
            return null;
        }
        Double valueOf = z11 ? Double.valueOf(h10.a()) : h10.b();
        C13023e a10 = C13026h.a(Oo.b.f84718m8);
        String f10 = f(valueOf, this.f64601a.s());
        return z10 ? new m.c(a10, (String) null, C16877v.e(new m.c.a(C13026h.a(Oo.b.f84600c0), f10)), 2, (DefaultConstructorMarker) null) : new m.c((C13023e) null, (String) null, C16877v.e(new m.c.a(a10, f10)), 2, (DefaultConstructorMarker) null);
    }

    private final List<m.c.a> k(Double d10, List<a.C1128a.f> list) {
        List c10 = C16877v.c();
        if (!list.isEmpty()) {
            Iterable<a.C1128a.f> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (a.C1128a.f fVar : iterable) {
                arrayList.add(new m.c.a(C13026h.c(fVar.a()), f(Double.valueOf(fVar.b()), this.f64601a.s())));
            }
            c10.addAll(arrayList);
        } else if (d10 != null) {
            if (d10.doubleValue() <= 0.0d) {
                d10 = null;
            }
            if (d10 != null) {
                c10.add(new m.c.a(C13026h.a(Oo.b.f84631e9), f(Double.valueOf(d10.doubleValue()), this.f64601a.s())));
            }
        }
        return C16877v.a(c10);
    }

    private final m.d l(a.C1128a.e eVar, boolean z10, boolean z11, List<m.c.a> list) {
        double d10;
        List list2;
        if (z11) {
            d10 = eVar.a();
        } else {
            Double b10 = eVar.b();
            d10 = b10 != null ? b10.doubleValue() : eVar.a();
        }
        C13023e a10 = z11 ? C13026h.a(Oo.b.f84423K5) : C13026h.a(Oo.b.f84433L5);
        if (!z10 || z11) {
            list2 = C16877v.n();
        } else {
            List c10 = C16877v.c();
            Double valueOf = Double.valueOf(eVar.a());
            if (valueOf.doubleValue() <= 0.0d) {
                valueOf = null;
            }
            if (valueOf != null) {
                c10.add(new m.c.a(C13026h.a(Oo.b.f84466O8), f(Double.valueOf(valueOf.doubleValue()), this.f64601a.s())));
            }
            if (list != null) {
                c10.addAll(list);
            }
            list2 = C16877v.a(c10);
        }
        return new m.d(a10, new n.a(C14957b.a(d10, this.f64601a.s()), this.f64601a.s()), list2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final RC.m m(Vg.a.C1128a r24, IC.C13023e r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, java.util.List<Vg.a.C1128a.g> r32) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r27
            r10 = r28
            r11 = r30
            RC.m$c r12 = r7.g(r8, r9, r11)
            Vg.a$a$b r0 = r24.c()
            r13 = 0
            if (r0 == 0) goto L_0x001b
            RC.m$c r0 = r7.c(r0, r9, r11)
            r14 = r0
            goto L_0x001c
        L_0x001b:
            r14 = r13
        L_0x001c:
            java.util.List r3 = r24.d()
            Vg.a$a$c r4 = r24.b()
            java.lang.Double r5 = r24.f()
            java.lang.Double r6 = r24.k()
            r0 = r23
            r1 = r30
            r2 = r31
            RC.m$c r0 = r0.h(r1, r2, r3, r4, r5, r6)
            RC.m$c r1 = r7.j(r8, r11, r9)
            Vg.a$a$e r2 = r24.i()
            java.lang.Double r2 = r2.c()
            java.util.List r3 = r24.g()
            java.util.List r18 = r7.k(r2, r3)
            r2 = 0
            r3 = 1
            if (r10 == 0) goto L_0x0052
            if (r9 != 0) goto L_0x0052
            r4 = r3
            goto L_0x0053
        L_0x0052:
            r4 = r2
        L_0x0053:
            if (r10 == 0) goto L_0x0058
            if (r9 == 0) goto L_0x0058
            r2 = r3
        L_0x0058:
            Vg.a$a$e r3 = r24.i()
            if (r4 == 0) goto L_0x0063
            r4 = r26
            r5 = r18
            goto L_0x0066
        L_0x0063:
            r4 = r26
            r5 = r13
        L_0x0066:
            RC.m$d r3 = r7.l(r3, r10, r4, r5)
            if (r2 == 0) goto L_0x006f
            r2 = r18
            goto L_0x0070
        L_0x006f:
            r2 = r13
        L_0x0070:
            if (r2 == 0) goto L_0x008e
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r2 = r13
        L_0x007d:
            if (r2 == 0) goto L_0x008e
            RC.m$c r2 = new RC.m$c
            r19 = 2
            r20 = 0
            r16 = 0
            r17 = 0
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            goto L_0x008f
        L_0x008e:
            r2 = r13
        L_0x008f:
            IC.e r16 = r23.d(r24)
            RC.m$a r20 = r23.b(r24)
            if (r29 == 0) goto L_0x00a2
            int r4 = rv.C11849b.f102334p2
            IC.e r4 = IC.C13026h.a(r4)
            r18 = r4
            goto L_0x00a4
        L_0x00a2:
            r18 = r13
        L_0x00a4:
            r4 = r32
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00b1
            r4 = r32
            goto L_0x00b2
        L_0x00b1:
            r4 = r13
        L_0x00b2:
            if (r4 == 0) goto L_0x010a
            r4 = r32
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = YH.C16877v.y(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x00c7:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00f2
            java.lang.Object r6 = r4.next()
            Vg.a$a$g r6 = (Vg.a.C1128a.g) r6
            RC.m$c$a r9 = new RC.m$c$a
            IC.e r10 = r6.b()
            double r21 = r6.a()
            java.lang.Double r6 = java.lang.Double.valueOf(r21)
            Il.a r11 = r7.f64601a
            kp.d r11 = r11.s()
            java.lang.String r6 = r7.e(r6, r11)
            r9.<init>(r10, r6)
            r5.add(r9)
            goto L_0x00c7
        L_0x00f2:
            RC.m$c r4 = new RC.m$c
            r6 = 0
            r9 = 0
            r10 = 2
            r11 = 0
            r26 = r4
            r27 = r6
            r28 = r9
            r29 = r5
            r30 = r10
            r31 = r11
            r26.<init>(r27, r28, r29, r30, r31)
            r19 = r4
            goto L_0x010c
        L_0x010a:
            r19 = r13
        L_0x010c:
            RC.m$b r17 = r24.e()
            RC.m r4 = new RC.m
            r8 = r4
            r9 = r25
            r10 = r12
            r11 = r14
            r12 = r1
            r13 = r0
            r14 = r2
            r15 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Vg.b.m(Vg.a$a, IC.e, boolean, boolean, boolean, boolean, boolean, boolean, java.util.List):RC.m");
    }

    public m a(a.C1128a aVar, C13023e eVar, List<a.C1128a.g> list, a.b bVar) {
        C17542s.j(aVar, "price");
        C17542s.j(list, "transactions");
        C17542s.j(bVar, "priceSummaryConfig");
        return m(aVar, eVar, bVar.f(), bVar.c(), bVar.e() && !bVar.f(), bVar.b(), bVar.d(), bVar.a(), list);
    }
}
