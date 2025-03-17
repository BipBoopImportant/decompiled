package fo;

import Do.m;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import Nn.C10804g;
import Nn.C10813p;
import Nn.Q;
import Nn.u;
import Nn.y;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.t;
import XH.v;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import fo.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rv.C11849b;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u000267B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010+\u001a\u0004\u0018\u00010(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010%R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\"\u00104¨\u00068"}, d2 = {"Lfo/r;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LWn/b;", "checkoutAnalytics", "<init>", "(Landroidx/lifecycle/U;LWn/b;)V", "", "Lfo/r$a;", "items", "Lfo/q;", "D", "(Ljava/util/List;)Lfo/q;", "Lfo/q$a;", "i", "(Ljava/util/List;)Lfo/q$a;", "F", "LNn/Q;", "unavailableItems", "LNn/g;", "productList", "E", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lgo/s;", "h", "(Lfo/r$a;)Lgo/s;", "LXH/N;", "H", "()V", "G", "Lfo/o;", "C", "()Lfo/o;", "m", "LWn/b;", "n", "Ljava/util/List;", "o", "allItems", "LDo/m;", "p", "LDo/m;", "selectedDeliveryOption", "", "q", "Z", "isSelectable", "r", "LTJ/P;", "s", "LTJ/P;", "()LTJ/P;", "uiState", "a", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final Wn.b f97488m;

    /* renamed from: n  reason: collision with root package name */
    private final List<Q> f97489n;

    /* renamed from: o  reason: collision with root package name */
    private final List<C10804g> f97490o;

    /* renamed from: p  reason: collision with root package name */
    private final m f97491p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f97492q;

    /* renamed from: r  reason: collision with root package name */
    private final List<a> f97493r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<q> f97494s;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lfo/r$a;", "Ljava/io/Serializable;", "", "productNumber", "", "quantity", "requestedQuantity", "LNn/g$b;", "productInfo", "Lfo/r$b;", "type", "<init>", "(Ljava/lang/String;IILNn/g$b;Lfo/r$b;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "d", "LNn/g$b;", "()LNn/g$b;", "e", "Lfo/r$b;", "()Lfo/r$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final String f97495a;

        /* renamed from: b  reason: collision with root package name */
        private final int f97496b;

        /* renamed from: c  reason: collision with root package name */
        private final int f97497c;

        /* renamed from: d  reason: collision with root package name */
        private final C10804g.b f97498d;

        /* renamed from: e  reason: collision with root package name */
        private final b f97499e;

        public a(String str, int i10, int i11, C10804g.b bVar, b bVar2) {
            C17542s.j(str, "productNumber");
            C17542s.j(bVar2, "type");
            this.f97495a = str;
            this.f97496b = i10;
            this.f97497c = i11;
            this.f97498d = bVar;
            this.f97499e = bVar2;
        }

        public final C10804g.b a() {
            return this.f97498d;
        }

        public final String b() {
            return this.f97495a;
        }

        public final int c() {
            return this.f97496b;
        }

        public final int d() {
            return this.f97497c;
        }

        public final b e() {
            return this.f97499e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f97495a, aVar.f97495a) && this.f97496b == aVar.f97496b && this.f97497c == aVar.f97497c && C17542s.e(this.f97498d, aVar.f97498d) && this.f97499e == aVar.f97499e;
        }

        public int hashCode() {
            int hashCode = ((((this.f97495a.hashCode() * 31) + Integer.hashCode(this.f97496b)) * 31) + Integer.hashCode(this.f97497c)) * 31;
            C10804g.b bVar = this.f97498d;
            return ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f97499e.hashCode();
        }

        public String toString() {
            String str = this.f97495a;
            int i10 = this.f97496b;
            int i11 = this.f97497c;
            C10804g.b bVar = this.f97498d;
            b bVar2 = this.f97499e;
            return "UnavailableItem(productNumber=" + str + ", quantity=" + i10 + ", requestedQuantity=" + i11 + ", productInfo=" + bVar + ", type=" + bVar2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lfo/r$b;", "", "<init>", "(Ljava/lang/String;I)V", "OUT_OF_STOCK", "PARTIALLY_OUT_OF_STOCK", "PARTIALLY_AVAILABLE", "AVAILABLE", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        OUT_OF_STOCK,
        PARTIALLY_OUT_OF_STOCK,
        PARTIALLY_AVAILABLE,
        AVAILABLE;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f97500a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                fo.r$b[] r0 = fo.r.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fo.r$b r1 = fo.r.b.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                fo.r$b r1 = fo.r.b.PARTIALLY_OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                fo.r$b r1 = fo.r.b.PARTIALLY_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                fo.r$b r1 = fo.r.b.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f97500a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.r.c.<clinit>():void");
        }
    }

    public r(U u10, Wn.b bVar) {
        char c10;
        Iterator it;
        String str;
        U u11 = u10;
        Wn.b bVar2 = bVar;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(bVar2, "checkoutAnalytics");
        this.f97488m = bVar2;
        List<Q> list = (List) u11.f("unavailable_items");
        list = list == null ? C16877v.n() : list;
        this.f97489n = list;
        List<C10804g> list2 = (List) u11.f("all_items");
        list2 = list2 == null ? C16877v.n() : list2;
        this.f97490o = list2;
        this.f97491p = (m) u11.f("delivery_option");
        Boolean bool = (Boolean) u11.f("is_selectable");
        this.f97492q = bool != null ? bool.booleanValue() : true;
        List<a> E10 = E(list, list2);
        this.f97493r = E10;
        this.f97494s = C16534i.c(C16521S.a(D(E10)));
        boolean isEmpty = list.isEmpty();
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<r> cls = r.class;
        if (isEmpty) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unavailable items dialog opened without any items");
            e eVar = e.ERROR;
            ArrayList arrayList = new ArrayList();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            String str3 = null;
            String str4 = null;
            while (it2.hasNext()) {
                C11819b bVar3 = (C11819b) it2.next();
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str = str2;
                    it = it2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str2;
                    it = it2;
                }
                e eVar2 = eVar;
                bVar3.a(eVar, str4, false, illegalArgumentException, str3);
                str2 = str;
                it2 = it;
            }
        }
        String str5 = str2;
        C10813p pVar = (C10813p) u11.f("delivery_service_type");
        u uVar = (u) u11.f("serviceType");
        if (pVar == null || uVar == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Missing delivery service type or service type");
            e eVar3 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar3, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar4 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 != null) {
                        str6 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    c10 = 2;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    name2 = o13.length() != 0 ? C15854t.P0(o13, "Kt") : name2;
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str5) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    c10 = 2;
                }
                char c11 = c10;
                bVar4.a(eVar3, str7, false, illegalArgumentException2, str6);
            }
            return;
        }
        Wn.c.b(this.f97488m, this.f97493r, pVar, uVar);
    }

    private final q D(List<a> list) {
        C13023e a10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            int i10 = c.f97500a[((a) next).e().ordinal()];
            if (i10 == 1 || i10 == 2) {
                arrayList.add(next);
            } else if (i10 == 3 || i10 == 4) {
                arrayList2.add(next);
            } else {
                throw new t();
            }
        }
        v vVar = new v(arrayList, arrayList2);
        List list2 = (List) vVar.a();
        List list3 = (List) vVar.b();
        m mVar = this.f97491p;
        if (mVar == null || (mVar instanceof m.b)) {
            a10 = C13026h.a(C11849b.f102275b3);
        } else if ((mVar instanceof m.a) || (mVar instanceof m.c)) {
            a10 = C13026h.a(C11849b.f102270a3);
        } else {
            throw new t();
        }
        return new q(this.f97492q, a10, C13026h.a(C11849b.f102290e3), F(list2), i(list3));
    }

    private final List<a> E(List<Q> list, List<C10804g> list2) {
        Object obj;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        String str3;
        String str4;
        List c10 = C16877v.c();
        for (C10804g gVar : list2) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((Q) obj).b(), gVar.b())) {
                    break;
                }
            }
            Q q10 = (Q) obj;
            if (q10 != null) {
                if (gVar.c() != q10.c()) {
                    IllegalStateException illegalStateException = new IllegalStateException("Requested quantity (" + q10.c() + ") differs from cart quantity (" + gVar.c() + ")");
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str5 = null;
                    String str6 = null;
                    for (C11819b bVar : arrayList) {
                        if (str5 == null) {
                            String a10 = C11818a.a((String) null, illegalStateException);
                            if (a10 == null) {
                                break;
                            }
                            str3 = C11820c.a(a10);
                        } else {
                            str3 = str5;
                        }
                        if (str6 == null) {
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getUnavailableItemsList";
                        } else {
                            str4 = str6;
                        }
                        bVar.a(eVar, str4, false, illegalStateException, str3);
                        str5 = str3;
                        str6 = str4;
                    }
                } else if (q10.a() < 0) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Available quantity is negative: " + q10);
                    e eVar2 = e.ERROR;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    Iterator it2 = d.f102012a.a().iterator();
                    while (true) {
                        z11 = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str7 = null;
                    String str8 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str7 == null) {
                            String a11 = C11818a.a((String) null, illegalStateException2);
                            if (a11 == null) {
                                break;
                            }
                            str7 = C11820c.a(a11);
                        }
                        String str9 = str7;
                        if (str8 == null) {
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getUnavailableItemsList";
                        } else {
                            str2 = str8;
                        }
                        bVar2.a(eVar2, str2, z11, illegalStateException2, str9);
                        str7 = str9;
                        str8 = str2;
                        z11 = z11;
                    }
                }
            }
            if ((q10 != null ? Integer.valueOf(q10.a()) : null) == null) {
                c10.add(new a(gVar.b(), gVar.c(), gVar.c(), gVar.a(), b.AVAILABLE));
            } else if (q10.a() == 0) {
                c10.add(new a(gVar.b(), q10.c(), q10.c(), gVar.a(), b.OUT_OF_STOCK));
            } else if (q10.a() < q10.c()) {
                c10.add(new a(gVar.b(), q10.a(), q10.c(), gVar.a(), b.PARTIALLY_AVAILABLE));
                c10.add(new a(gVar.b(), q10.c() - q10.a(), q10.c(), gVar.a(), b.PARTIALLY_OUT_OF_STOCK));
            } else {
                IllegalStateException illegalStateException3 = new IllegalStateException("Unknown interval, available: " + q10.a() + ", total: " + gVar.c());
                e eVar3 = e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                Iterator it3 = d.f102012a.a().iterator();
                while (true) {
                    z10 = false;
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str10 = null;
                String str11 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str10 == null) {
                        String a12 = C11818a.a((String) null, illegalStateException3);
                        if (a12 == null) {
                            break;
                        }
                        str10 = C11820c.a(a12);
                    }
                    String str12 = str10;
                    if (str11 == null) {
                        str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "getUnavailableItemsList";
                    } else {
                        str = str11;
                    }
                    bVar3.a(eVar3, str, z10, illegalStateException3, str12);
                    str10 = str12;
                    str11 = str;
                    z10 = z10;
                }
                c10.add(new a(gVar.b(), gVar.c(), q10.c(), gVar.a(), b.AVAILABLE));
            }
        }
        return C16877v.a(c10);
    }

    private final q.a F(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        int i10 = C11849b.f102280c3;
        Iterable<a> iterable = list;
        int i11 = 0;
        for (a c10 : iterable) {
            i11 += c10.c();
        }
        C13023e b10 = C13026h.b(i10, Integer.valueOf(i11));
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (a h10 : iterable) {
            arrayList.add(h(h10));
        }
        return new q.a(b10, C15985a.h(arrayList));
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final go.C11334s h(fo.r.a r23) {
        /*
            r22 = this;
            fo.r$b r0 = r23.e()
            int[] r1 = fo.r.c.f97500a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0019
            r3 = 2
            if (r0 == r3) goto L_0x0122
            r4 = 3
            if (r0 == r4) goto L_0x0023
            r1 = 4
            if (r0 != r1) goto L_0x001d
        L_0x0019:
            r10 = r23
            goto L_0x0157
        L_0x001d:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0023:
            int r0 = r23.c()
            if (r0 >= 0) goto L_0x00e7
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid quantity, item: "
            r4.append(r5)
            r10 = r23
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            qv.e r11 = qv.e.ERROR
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0054:
            boolean r6 = r4.hasNext()
            r12 = 0
            if (r6 == 0) goto L_0x006c
            java.lang.Object r6 = r4.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r11, r12)
            if (r7 == 0) goto L_0x0054
            r5.add(r6)
            goto L_0x0054
        L_0x006c:
            java.util.Iterator r13 = r5.iterator()
            r4 = r2
            r5 = r4
        L_0x0072:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00e9
            java.lang.Object r6 = r13.next()
            qv.b r6 = (qv.C11819b) r6
            if (r4 != 0) goto L_0x008c
            java.lang.String r4 = qv.C11818a.a(r2, r0)
            if (r4 != 0) goto L_0x0088
            goto L_0x00e9
        L_0x0088:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x008c:
            r14 = r4
            if (r5 != 0) goto L_0x00da
            java.lang.Class<fo.r$a> r4 = fo.r.a.class
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r5 = 36
            java.lang.String r5 = HJ.C15854t.s1(r4, r5, r2, r3, r2)
            r7 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r7, r2, r3, r2)
            int r7 = r5.length()
            if (r7 != 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r5, r4)
        L_0x00b1:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = "main"
            boolean r5 = HJ.C15854t.b0(r5, r7, r1)
            if (r5 == 0) goto L_0x00c4
            java.lang.String r5 = "m"
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r5 = "b"
        L_0x00c6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = "|"
            r7.append(r5)
            r7.append(r4)
            java.lang.String r5 = r7.toString()
        L_0x00da:
            r15 = r5
            r4 = r6
            r5 = r11
            r6 = r15
            r7 = r12
            r8 = r0
            r9 = r14
            r4.a(r5, r6, r7, r8, r9)
            r4 = r14
            r5 = r15
            goto L_0x0072
        L_0x00e7:
            r10 = r23
        L_0x00e9:
            Op.d$f r0 = new Op.d$f
            IC.e$c r1 = new IC.e$c
            int r3 = Oo.a.f84309d
            int r4 = r23.c()
            int r4 = IC.C13020b.a(r4)
            int r5 = r23.c()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r23.d()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer[] r5 = new java.lang.Integer[]{r5, r6}
            java.util.List r5 = YH.C16877v.q(r5)
            r1.<init>(r3, r4, r5, r2)
            SC.L2 r18 = SC.L2.Available
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r0
            r17 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0158
        L_0x0122:
            r10 = r23
            Op.d$f r0 = new Op.d$f
            IC.e$c r4 = new IC.e$c
            int r1 = Oo.a.f84310e
            int r3 = r23.c()
            int r3 = IC.C13020b.a(r3)
            int r5 = r23.c()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r23.d()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer[] r5 = new java.lang.Integer[]{r5, r6}
            java.util.List r5 = YH.C16877v.q(r5)
            r4.<init>(r1, r3, r5, r2)
            SC.L2 r5 = SC.L2.Low
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0158
        L_0x0157:
            r0 = r2
        L_0x0158:
            java.lang.String r4 = r23.b()
            Nn.g$b r1 = r23.a()
            if (r1 == 0) goto L_0x016b
            java.lang.String r1 = r1.d()
            if (r1 != 0) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r5 = r1
            goto L_0x0170
        L_0x016b:
            java.lang.String r1 = r23.b()
            goto L_0x0169
        L_0x0170:
            Nn.g$b r1 = r23.a()
            if (r1 == 0) goto L_0x017b
            java.lang.String r1 = r1.c()
            goto L_0x017c
        L_0x017b:
            r1 = r2
        L_0x017c:
            Nn.g$b r3 = r23.a()
            if (r3 == 0) goto L_0x0187
            java.lang.String r3 = r3.b()
            goto L_0x0188
        L_0x0187:
            r3 = r2
        L_0x0188:
            java.lang.String r6 = Co.c.i(r1, r3)
            Op.d$d r7 = new Op.d$d
            Nn.g$b r1 = r23.a()
            if (r1 == 0) goto L_0x0199
            java.lang.String r1 = r1.a()
            goto L_0x019a
        L_0x0199:
            r1 = r2
        L_0x019a:
            r7.<init>(r1, r2)
            int r1 = Oo.b.f84766r1
            int r3 = r23.c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            IC.e r8 = IC.C13026h.b(r1, r3)
            if (r0 == 0) goto L_0x01b5
            java.util.List r2 = YH.C16877v.e(r0)
        L_0x01b5:
            if (r2 != 0) goto L_0x01bb
            java.util.List r2 = YH.C16877v.n()
        L_0x01bb:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            KJ.c r9 = KJ.C15985a.h(r2)
            go.s r0 = new go.s
            r10 = 0
            r11 = 64
            r12 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.r.h(fo.r$a):go.s");
    }

    private final q.a i(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        int i10 = C11849b.f102285d3;
        Iterable<a> iterable = list;
        int i11 = 0;
        for (a c10 : iterable) {
            i11 += c10.c();
        }
        C13023e b10 = C13026h.b(i10, Integer.valueOf(i11));
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (a h10 : iterable) {
            arrayList.add(h(h10));
        }
        return new q.a(b10, C15985a.h(arrayList));
    }

    public final o C() {
        ArrayList<a> arrayList = new ArrayList<>();
        for (Object next : this.f97493r) {
            if (((a) next).e() == b.OUT_OF_STOCK) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (a b10 : arrayList) {
            arrayList2.add(b10.b());
        }
        ArrayList<a> arrayList3 = new ArrayList<>();
        for (Object next2 : this.f97493r) {
            if (((a) next2).e() == b.PARTIALLY_AVAILABLE) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C16877v.y(arrayList3, 10));
        for (a aVar : arrayList3) {
            arrayList4.add(new y(aVar.b(), aVar.c()));
        }
        return new o(arrayList2, arrayList4, this.f97491p);
    }

    public final void G() {
        this.f97488m.f();
    }

    public final void H() {
        this.f97488m.v();
    }

    public final C16519P<q> m() {
        return this.f97494s;
    }
}
