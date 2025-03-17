package lo;

import Co.f;
import HJ.C15854t;
import Jh.a;
import Lh.c;
import Nh.a;
import Nn.z;
import Oo.b;
import XH.x;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import hl.C11367a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import rv.C11849b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u0013H@¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Llo/t;", "LLh/c;", "Llo/s;", "LNh/a;", "LCo/f;", "geocoder", "", "pickupPoints", "", "selectionEnabled", "<init>", "(LCo/f;Ljava/util/List;Z)V", "", "", "LNn/z;", "openingHours", "LXH/N;", "e", "(Ljava/util/List;Ljava/util/List;)V", "LXH/x;", "LLh/b;", "b", "(LdI/e;)Ljava/lang/Object;", "LLh/a;", "poi", "a", "(LLh/a;)Ljava/util/List;", "LCo/f;", "Ljava/util/List;", "c", "Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements c<s>, Nh.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f99438a;

    /* renamed from: b  reason: collision with root package name */
    private final List<s> f99439b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f99440c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.PickupPointDetailsSource", f = "PickupPointDetailsSource.kt", l = {45}, m = "loadInitialContent-IoAF18A")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f99441c;

        /* renamed from: d  reason: collision with root package name */
        Object f99442d;

        /* renamed from: e  reason: collision with root package name */
        Object f99443e;

        /* renamed from: f  reason: collision with root package name */
        Object f99444f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f99445g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ t f99446h;

        /* renamed from: i  reason: collision with root package name */
        int f99447i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(t tVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f99446h = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99445g = obj;
            this.f99447i |= Integer.MIN_VALUE;
            Object b10 = this.f99446h.b(this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    public t(f fVar, List<s> list, boolean z10) {
        C17542s.j(fVar, "geocoder");
        C17542s.j(list, "pickupPoints");
        this.f99438a = fVar;
        this.f99439b = list;
        this.f99440c = z10;
    }

    private final void e(List<Object> list, List<z> list2) {
        int i10 = 0;
        for (Object next : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            z zVar = (z) next;
            String b10 = zVar.b();
            f(list, String.valueOf(i10), C11367a.f98081a.a(zVar.a()), (b10 == null || C15854t.v0(b10)) ? C11367a.f98081a.a(C11849b.f102163A0) : C11367a.f98081a.b(zVar.b()));
            i10 = i11;
        }
    }

    public List<Object> a(Lh.a<s> aVar) {
        C17542s.j(aVar, "poi");
        ArrayList arrayList = new ArrayList();
        s c10 = aVar.c();
        d(arrayList, c10.f(), c10.d());
        a.C1016a aVar2 = new a.C1016a(c10.f(), aVar.b());
        a.b bVar = new a.b(c10.e());
        if (!this.f99440c || !c10.h()) {
            bVar = null;
        }
        c(arrayList, aVar2, bVar);
        g(arrayList, "unique_title_id", b.f84737o5);
        e(arrayList, c10.g());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(dI.C17164e<? super XH.x<Lh.b<lo.s>>> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof lo.t.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            lo.t$a r0 = (lo.t.a) r0
            int r1 = r0.f99447i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f99447i = r1
            goto L_0x0018
        L_0x0013:
            lo.t$a r0 = new lo.t$a
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f99445g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f99447i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r15 = r0.f99444f
            com.ingka.ikea.appconfig.model.LocationLatLng r15 = (com.ingka.ikea.appconfig.model.LocationLatLng) r15
            java.lang.Object r15 = r0.f99443e
            lo.s r15 = (lo.s) r15
            java.lang.Object r2 = r0.f99442d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f99441c
            lo.t r0 = (lo.t) r0
            XH.y.b(r1)
            goto L_0x0090
        L_0x0039:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0041:
            XH.y.b(r1)
            java.util.List<lo.s> r1 = r14.f99439b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0053
            java.lang.String r15 = "List of pickup points was empty"
            java.lang.Object r15 = r14.h(r15)
            return r15
        L_0x0053:
            java.util.List<lo.s> r1 = r14.f99439b
            java.lang.Object r1 = YH.C16877v.w0(r1)
            lo.s r1 = (lo.s) r1
            Nn.b r3 = r1.c()
            com.ingka.ikea.appconfig.model.LocationLatLng r3 = r3.e()
            if (r3 == 0) goto L_0x0074
            java.util.List<lo.s> r15 = r14.f99439b
            java.util.List r15 = lo.u.c(r15)
            Lh.a r0 = lo.u.d(r1, r3)
            java.lang.Object r15 = r14.i(r15, r0)
            return r15
        L_0x0074:
            Co.f r5 = r14.f99438a
            java.lang.String r6 = r1.d()
            r0.f99441c = r14
            r0.f99442d = r15
            r0.f99443e = r1
            r0.f99444f = r3
            r0.f99447i = r4
            r15 = 3
            java.lang.Object r15 = r5.a(r6, r15, r0)
            if (r15 != r2) goto L_0x008c
            return r2
        L_0x008c:
            r0 = r14
            r13 = r1
            r1 = r15
            r15 = r13
        L_0x0090:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x00b3
            java.lang.Object r2 = r1.next()
            r4 = r2
            android.location.Address r4 = (android.location.Address) r4
            boolean r5 = r4.hasLatitude()
            if (r5 == 0) goto L_0x0098
            boolean r4 = r4.hasLongitude()
            if (r4 == 0) goto L_0x0098
            goto L_0x00b4
        L_0x00b3:
            r2 = r3
        L_0x00b4:
            android.location.Address r2 = (android.location.Address) r2
            if (r2 == 0) goto L_0x00c5
            com.ingka.ikea.appconfig.model.LocationLatLng r3 = new com.ingka.ikea.appconfig.model.LocationLatLng
            double r4 = r2.getLatitude()
            double r1 = r2.getLongitude()
            r3.<init>(r4, r1)
        L_0x00c5:
            r1 = r3
            if (r1 == 0) goto L_0x0122
            Nn.b r6 = r15.c()
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = r1
            Nn.b r7 = Nn.C10799b.b(r6, r7, r8, r9, r10, r11, r12)
            r10 = 55
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r3 = r15
            lo.s r2 = lo.s.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.List<lo.s> r3 = r0.f99439b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00f6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0115
            java.lang.Object r5 = r3.next()
            lo.s r5 = (lo.s) r5
            java.lang.String r6 = r5.e()
            java.lang.String r7 = r15.e()
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 == 0) goto L_0x0111
            r5 = r2
        L_0x0111:
            r4.add(r5)
            goto L_0x00f6
        L_0x0115:
            java.util.List r15 = lo.u.c(r4)
            Lh.a r1 = lo.u.d(r2, r1)
            java.lang.Object r15 = r0.i(r15, r1)
            goto L_0x013b
        L_0x0122:
            java.lang.String r15 = r15.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Couldn't find address for: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            java.lang.Object r15 = r0.h(r15)
        L_0x013b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.t.b(dI.e):java.lang.Object");
    }

    public void c(List<Object> list, a.C1016a aVar, a.b bVar) {
        a.C1048a.a(this, list, aVar, bVar);
    }

    public boolean d(List<Object> list, String str, String str2) {
        return a.C1048a.b(this, list, str, str2);
    }

    public boolean f(List<Object> list, String str, C11367a aVar, C11367a aVar2) {
        return a.C1048a.c(this, list, str, aVar, aVar2);
    }

    public boolean g(List<Object> list, String str, int i10) {
        return a.C1048a.d(this, list, str, i10);
    }

    public Object h(String str) {
        return c.a.a(this, str);
    }

    public Object i(List<Lh.a<s>> list, Lh.a<s> aVar) {
        return c.a.b(this, list, aVar);
    }
}
