package Dv;

import Tv.b;
import U0.C4889m;
import XH.C16807N;
import XH.v;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lt0/x;", "", "LTv/b;", "content", "Lkotlin/Function1;", "LRv/c;", "LXH/N;", "onEvent", "a", "(Lt0/x;Ljava/util/List;LnI/l;)V", "", "b", "(Ljava/util/List;)Ljava/util/Set;", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34652a = new a();

        /* renamed from: a */
        public final Void invoke(Tv.b bVar) {
            C17542s.j(bVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17642l<Tv.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f34653a;

        public b(String str) {
            this.f34653a = str;
        }

        /* renamed from: a */
        public final Object invoke(Tv.b bVar) {
            C17542s.j(bVar, "item");
            String str = this.f34653a;
            if (str != null) {
                String str2 = str + ":" + bVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(bVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f34654c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f34655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f34654c = lVar;
            this.f34655d = list;
        }

        public final Object a(int i10) {
            return this.f34654c.invoke(this.f34655d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f34656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f34657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f34656c = lVar;
            this.f34657d = list;
        }

        public final Object a(int i10) {
            return this.f34656c.invoke(this.f34657d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: Dv.e$e  reason: collision with other inner class name */
    public static final class C0555e extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f34658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f34659d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Set f34660e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0555e(List list, C17642l lVar, Set set) {
            super(4);
            this.f34658c = list;
            this.f34659d = lVar;
            this.f34660e = set;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r16, int r17, U0.C4889m r18, int r19) {
            /*
                r15 = this;
                r0 = r15
                r1 = r17
                r14 = r18
                r2 = r19 & 6
                if (r2 != 0) goto L_0x0017
                r2 = r16
                boolean r2 = r14.V(r2)
                if (r2 == 0) goto L_0x0013
                r2 = 4
                goto L_0x0014
            L_0x0013:
                r2 = 2
            L_0x0014:
                r2 = r19 | r2
                goto L_0x0019
            L_0x0017:
                r2 = r19
            L_0x0019:
                r3 = 48
                r4 = r19 & 48
                if (r4 != 0) goto L_0x002b
                boolean r4 = r14.d(r1)
                if (r4 == 0) goto L_0x0028
                r4 = 32
                goto L_0x002a
            L_0x0028:
                r4 = 16
            L_0x002a:
                r2 = r2 | r4
            L_0x002b:
                r4 = r2 & 147(0x93, float:2.06E-43)
                r5 = 146(0x92, float:2.05E-43)
                if (r4 != r5) goto L_0x003d
                boolean r4 = r18.l()
                if (r4 != 0) goto L_0x0038
                goto L_0x003d
            L_0x0038:
                r18.L()
                goto L_0x01d2
            L_0x003d:
                boolean r4 = U0.C4895p.J()
                if (r4 == 0) goto L_0x004c
                r4 = -1
                java.lang.String r5 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r6 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r6, r2, r4, r5)
            L_0x004c:
                java.util.List r2 = r0.f34658c
                java.lang.Object r1 = r2.get(r1)
                r9 = r1
                Tv.b r9 = (Tv.b) r9
                r1 = -285486171(0xffffffffeefbd3a5, float:-3.89683E28)
                r14.W(r1)
                boolean r1 = r9 instanceof Tv.b.e
                r2 = 0
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0070
                r1 = -285466363(0xffffffffeefc2105, float:-3.901507E28)
                r14.W(r1)
                Dv.d.b(r2, r14, r4, r5)
                r18.P()
                goto L_0x01c6
            L_0x0070:
                boolean r1 = r9 instanceof Tv.b.C0656b
                if (r1 == 0) goto L_0x00a4
                r1 = -285368620(0xffffffffeefd9ed4, float:-3.924586E28)
                r14.W(r1)
                Tv.b$b r9 = (Tv.b.C0656b) r9
                IC.e r1 = r9.g()
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                r2 = 12
                float r2 = (float) r2
                float r8 = c2.h.B(r2)
                r9 = 7
                r10 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r4, r5, r6, r7, r8, r9, r10)
                int r4 = IC.C13023e.f110931a
                r6 = r4 | 48
                r7 = 12
                r3 = 0
                r4 = 0
                r5 = r18
                Bv.I.b(r1, r2, r3, r4, r5, r6, r7)
                r18.P()
                goto L_0x01c6
            L_0x00a4:
                boolean r1 = r9 instanceof Tv.b.c
                if (r1 == 0) goto L_0x0118
                r1 = -285127192(0xffffffffef014de8, float:-4.001775E28)
                r14.W(r1)
                r1 = r9
                Tv.b$c r1 = (Tv.b.c) r1
                IC.e r2 = r1.j()
                IC.e r4 = r1.h()
                int r5 = r1.i()
                r1 = 1514828714(0x5a4a73aa, float:1.42462798E16)
                r14.W(r1)
                nI.l r1 = r0.f34659d
                boolean r1 = r14.V(r1)
                boolean r3 = r14.F(r9)
                r1 = r1 | r3
                java.lang.Object r3 = r18.D()
                if (r1 != 0) goto L_0x00dc
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x00e6
            L_0x00dc:
                Dv.e$f r3 = new Dv.e$f
                nI.l r1 = r0.f34659d
                r3.<init>(r1, r9)
                r14.u(r3)
            L_0x00e6:
                nI.a r3 = (nI.C17631a) r3
                r18.P()
                int r1 = IC.C13023e.f110931a
                int r6 = r1 << 9
                r7 = r1 | r6
                r8 = 4
                r6 = 0
                r1 = r2
                r2 = r3
                r3 = r6
                r6 = r18
                Dv.b.b(r1, r2, r3, r4, r5, r6, r7, r8)
                java.util.Set r1 = r0.f34660e
                boolean r1 = r1.contains(r9)
                if (r1 == 0) goto L_0x0113
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r1 = TC.e.i(r1)
                r6 = 0
                r7 = 6
                r2 = 0
                r3 = 0
                r5 = r18
                SC.C13643u0.c(r1, r2, r3, r5, r6, r7)
            L_0x0113:
                r18.P()
                goto L_0x01c6
            L_0x0118:
                boolean r1 = r9 instanceof Tv.b.d
                r6 = 0
                if (r1 == 0) goto L_0x0182
                r1 = -284680792(0xffffffffef081da8, float:-4.2125814E28)
                r14.W(r1)
                int r1 = Oo.b.f84854z4
                java.lang.String r1 = J1.j.b(r1, r14, r4)
                SC.N r4 = SC.N.Secondary
                androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r6, r5, r2)
                androidx.compose.ui.d r3 = TC.e.i(r3)
                r7 = 24
                float r7 = (float) r7
                float r7 = c2.h.B(r7)
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r3, r6, r7, r5, r2)
                r3 = 1514848746(0x5a4ac1ea, float:1.4267789E16)
                r14.W(r3)
                nI.l r3 = r0.f34659d
                boolean r3 = r14.V(r3)
                boolean r5 = r14.F(r9)
                r3 = r3 | r5
                java.lang.Object r5 = r18.D()
                if (r3 != 0) goto L_0x015f
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x0169
            L_0x015f:
                Dv.e$g r5 = new Dv.e$g
                nI.l r3 = r0.f34659d
                r5.<init>(r3, r9)
                r14.u(r5)
            L_0x0169:
                r10 = r5
                nI.a r10 = (nI.C17631a) r10
                r18.P()
                r12 = 3072(0xc00, float:4.305E-42)
                r13 = 500(0x1f4, float:7.0E-43)
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = r18
                SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r18.P()
                goto L_0x01c6
            L_0x0182:
                boolean r1 = r9 instanceof Tv.b.a
                if (r1 == 0) goto L_0x01d3
                r1 = -284209313(0xffffffffef0f4f5f, float:-4.435231E28)
                r14.W(r1)
                r1 = 1514854506(0x5a4ad86a, float:1.42739738E16)
                r14.W(r1)
                nI.l r1 = r0.f34659d
                boolean r1 = r14.V(r1)
                boolean r7 = r14.F(r9)
                r1 = r1 | r7
                java.lang.Object r7 = r18.D()
                if (r1 != 0) goto L_0x01ab
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r7 != r1) goto L_0x01b5
            L_0x01ab:
                Dv.e$h r7 = new Dv.e$h
                nI.l r1 = r0.f34659d
                r7.<init>(r1, r9)
                r14.u(r7)
            L_0x01b5:
                nI.a r7 = (nI.C17631a) r7
                r18.P()
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r6, r5, r2)
                Cv.c.c(r7, r1, r14, r3, r4)
                r18.P()
            L_0x01c6:
                r18.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x01d2
                U0.C4895p.R()
            L_0x01d2:
                return
            L_0x01d3:
                r1 = 1514811422(0x5a4a301e, float:1.42277127E16)
                r14.W(r1)
                r18.P()
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Dv.e.C0555e.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f34661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Tv.b f34662b;

        f(C17642l<? super Rv.c, C16807N> lVar, Tv.b bVar) {
            this.f34661a = lVar;
            this.f34662b = bVar;
        }

        public final void a() {
            this.f34661a.invoke(((b.c) this.f34662b).g());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f34663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Tv.b f34664b;

        g(C17642l<? super Rv.c, C16807N> lVar, Tv.b bVar) {
            this.f34663a = lVar;
            this.f34664b = bVar;
        }

        public final void a() {
            this.f34663a.invoke(((b.d) this.f34664b).g());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f34665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Tv.b f34666b;

        h(C17642l<? super Rv.c, C16807N> lVar, Tv.b bVar) {
            this.f34665a = lVar;
            this.f34666b = bVar;
        }

        public final void a() {
            this.f34665a.invoke(((b.a) this.f34666b).g());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    public static final void a(x xVar, List<? extends Tv.b> list, C17642l<? super Rv.c, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(list, "content");
        C17542s.j(lVar, "onEvent");
        Set<Tv.b> b10 = b(list);
        a aVar = a.f34652a;
        xVar.e(list.size(), new c(new b((String) null), list), new d(aVar, list), c1.c.c(-632812321, true, new C0555e(list, lVar, b10)));
    }

    private static final Set<Tv.b> b(List<? extends Tv.b> list) {
        ArrayList arrayList = new ArrayList();
        for (v vVar : C16877v.E1(list)) {
            Tv.b bVar = (Tv.b) vVar.a();
            Tv.b bVar2 = (Tv.b) vVar.b();
            if (!(bVar instanceof b.c) || !(bVar2 instanceof b.c)) {
                bVar = null;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return C16877v.y1(arrayList);
    }
}
