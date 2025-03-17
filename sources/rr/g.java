package rr;

import Iq.a;
import Iq.f;
import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.foundation.layout.J;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import nI.r;
import qr.C11812c;
import t0.C5938c;
import t0.x;
import tr.C11986e;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u0002"}, d2 = {"LIq/g;", "state", "Lkotlin/Function1;", "LIq/f;", "LXH/N;", "onAction", "Landroidx/compose/ui/d;", "modifier", "e", "(LIq/g;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "", "Lrr/a;", "a", "Ljava/util/List;", "loadingCards", "Lc2/h;", "rowHeight", "familyrewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final List<C11842a> f102126a = C16877v.q(C11842a.Loading1, C11842a.Loading2, C11842a.Loading3);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iq.g f102127a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Iq.f, C16807N> f102128b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f102129c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<c2.h> f102130d;

        a(Iq.g gVar, C17642l<? super Iq.f, C16807N> lVar, boolean z10, C4899r0<c2.h> r0Var) {
            this.f102127a = gVar;
            this.f102128b = lVar;
            this.f102129c = z10;
            this.f102130d = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(f.a.f81983a);
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1792544874, i10, -1, "com.ingka.ikea.familyrewards.presentation.carousel.FamilyRewardsCarouselWithEntryPoint.<anonymous>.<anonymous>.<anonymous> (FamilyRewardsCarouselWithEntryPoint.kt:59)");
                }
                androidx.compose.ui.d i11 = J.i(androidx.compose.ui.d.f18749a, g.f(this.f102130d));
                int b10 = this.f102127a.b();
                mVar.W(-1126908174);
                boolean V10 = mVar.V(this.f102128b);
                C17642l<Iq.f, C16807N> lVar = this.f102128b;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new f(lVar);
                    mVar.u(D10);
                }
                mVar.P();
                C11986e.b(b10, (C17631a) D10, i11, this.f102129c, mVar, 0, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements C17642l<a.C1605a, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iq.a f102131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Iq.f, C16807N> f102132b;

        b(Iq.a aVar, C17642l<? super Iq.f, C16807N> lVar) {
            this.f102131a = aVar;
            this.f102132b = lVar;
        }

        public final void a(a.C1605a aVar) {
            Object obj;
            C17542s.j(aVar, "it");
            if (aVar instanceof a.C1605a.C1606a) {
                obj = new f.b(this.f102131a);
            } else if (aVar instanceof a.C1605a.b) {
                obj = new f.c(this.f102131a);
            } else {
                throw new t();
            }
            this.f102132b.invoke(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.C1605a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final c f102133c = new c();

        public c() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C11842a aVar) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f102134c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f102135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f102134c = lVar;
            this.f102135d = list;
        }

        public final Object a(int i10) {
            return this.f102134c.invoke(this.f102135d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f102136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f102137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17642l lVar, List list) {
            super(1);
            this.f102136c = lVar;
            this.f102137d = list;
        }

        public final Object a(int i10) {
            return this.f102136c.invoke(this.f102137d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f102138c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list) {
            super(4);
            this.f102138c = list;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                C11842a aVar = (C11842a) this.f102138c.get(i10);
                mVar.W(-574265014);
                C11812c.e((androidx.compose.ui.d) null, mVar, 0, 1);
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rr.g$g  reason: collision with other inner class name */
    public static final class C2434g implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final C2434g f102139a = new C2434g();

        /* renamed from: a */
        public final Void invoke(Iq.a aVar) {
            C17542s.j(aVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C17642l<Iq.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f102140a;

        public h(String str) {
            this.f102140a = str;
        }

        /* renamed from: a */
        public final Object invoke(Iq.a aVar) {
            C17542s.j(aVar, "item");
            String str = this.f102140a;
            if (str != null) {
                String str2 = str + ":" + aVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(aVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f102141c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f102142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17642l lVar, List list) {
            super(1);
            this.f102141c = lVar;
            this.f102142d = list;
        }

        public final Object a(int i10) {
            return this.f102141c.invoke(this.f102142d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f102143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f102144d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17642l lVar, List list) {
            super(1);
            this.f102143c = lVar;
            this.f102144d = list;
        }

        public final Object a(int i10) {
            return this.f102143c.invoke(this.f102144d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f102145c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f102146d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(List list, C17642l lVar) {
            super(4);
            this.f102145c = list;
            this.f102146d = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r7, int r8, U0.C4889m r9, int r10) {
            /*
                r6 = this;
                r0 = r10 & 6
                if (r0 != 0) goto L_0x000f
                boolean r7 = r9.V(r7)
                if (r7 == 0) goto L_0x000c
                r7 = 4
                goto L_0x000d
            L_0x000c:
                r7 = 2
            L_0x000d:
                r7 = r7 | r10
                goto L_0x0010
            L_0x000f:
                r7 = r10
            L_0x0010:
                r10 = r10 & 48
                if (r10 != 0) goto L_0x0020
                boolean r10 = r9.d(r8)
                if (r10 == 0) goto L_0x001d
                r10 = 32
                goto L_0x001f
            L_0x001d:
                r10 = 16
            L_0x001f:
                r7 = r7 | r10
            L_0x0020:
                r10 = r7 & 147(0x93, float:2.06E-43)
                r0 = 146(0x92, float:2.05E-43)
                if (r10 != r0) goto L_0x0031
                boolean r10 = r9.l()
                if (r10 != 0) goto L_0x002d
                goto L_0x0031
            L_0x002d:
                r9.L()
                goto L_0x0091
            L_0x0031:
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x0040
                r10 = -1
                java.lang.String r0 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
                r1 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                U0.C4895p.S(r1, r7, r10, r0)
            L_0x0040:
                java.util.List r7 = r6.f102145c
                java.lang.Object r7 = r7.get(r8)
                r0 = r7
                Iq.a r0 = (Iq.a) r0
                r7 = -574141634(0xffffffffddc74b3e, float:-1.79508E18)
                r9.W(r7)
                r7 = -1126896956(0xffffffffbcd4eac4, float:-0.025990851)
                r9.W(r7)
                boolean r7 = r9.F(r0)
                nI.l r8 = r6.f102146d
                boolean r8 = r9.V(r8)
                r7 = r7 | r8
                java.lang.Object r8 = r9.D()
                if (r7 != 0) goto L_0x006e
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r8 != r7) goto L_0x0078
            L_0x006e:
                rr.g$b r8 = new rr.g$b
                nI.l r7 = r6.f102146d
                r8.<init>(r0, r7)
                r9.u(r8)
            L_0x0078:
                r1 = r8
                nI.l r1 = (nI.C17642l) r1
                r9.P()
                r4 = 0
                r5 = 4
                r2 = 0
                r3 = r9
                qr.n.h(r0, r1, r2, r3, r4, r5)
                r9.P()
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x0091
                U0.C4895p.R()
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rr.g.k.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(Iq.g r18, nI.C17642l<? super Iq.f, XH.C16807N> r19, androidx.compose.ui.d r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r18
            r2 = r19
            r4 = r22
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onAction"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = -1994055352(0xffffffff89252148, float:-1.9876801E-33)
            r3 = r21
            U0.m r3 = r3.k(r0)
            r5 = r23 & 1
            r6 = 4
            r7 = 2
            if (r5 == 0) goto L_0x0022
            r5 = r4 | 6
            goto L_0x0032
        L_0x0022:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0031
            boolean r5 = r3.V(r1)
            if (r5 == 0) goto L_0x002e
            r5 = r6
            goto L_0x002f
        L_0x002e:
            r5 = r7
        L_0x002f:
            r5 = r5 | r4
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            r8 = r23 & 2
            if (r8 == 0) goto L_0x0039
            r5 = r5 | 48
            goto L_0x0049
        L_0x0039:
            r8 = r4 & 48
            if (r8 != 0) goto L_0x0049
            boolean r8 = r3.F(r2)
            if (r8 == 0) goto L_0x0046
            r8 = 32
            goto L_0x0048
        L_0x0046:
            r8 = 16
        L_0x0048:
            r5 = r5 | r8
        L_0x0049:
            r8 = r23 & 4
            if (r8 == 0) goto L_0x0052
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r10 = r20
            goto L_0x0064
        L_0x0052:
            r10 = r4 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004f
            r10 = r20
            boolean r11 = r3.V(r10)
            if (r11 == 0) goto L_0x0061
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r5 = r5 | r11
        L_0x0064:
            r11 = r5 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r11 != r12) goto L_0x0076
            boolean r11 = r3.l()
            if (r11 != 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r3.L()
            goto L_0x015c
        L_0x0076:
            if (r8 == 0) goto L_0x007c
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r15 = r8
            goto L_0x007d
        L_0x007c:
            r15 = r10
        L_0x007d:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0089
            r8 = -1
            java.lang.String r10 = "com.ingka.ikea.familyrewards.presentation.carousel.FamilyRewardsCarouselWithEntryPoint (FamilyRewardsCarouselWithEntryPoint.kt:45)"
            U0.C4895p.S(r0, r5, r8, r10)
        L_0x0089:
            boolean r0 = r1 instanceof Iq.g.c
            r8 = 3
            r10 = 0
            t0.A r8 = t0.C5935B.c(r10, r10, r3, r10, r8)
            U0.I0 r11 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r11 = r3.Q(r11)
            c2.d r11 = (c2.d) r11
            r12 = 435049648(0x19ee54b0, float:2.4642828E-23)
            r3.W(r12)
            java.lang.Object r12 = r3.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r14 = r13.a()
            r9 = 0
            if (r12 != r14) goto L_0x00be
            float r12 = (float) r10
            float r12 = c2.h.B(r12)
            c2.h r12 = c2.h.m(r12)
            U0.r0 r12 = U0.u1.e(r12, r9, r7, r9)
            r3.u(r12)
        L_0x00be:
            U0.r0 r12 = (U0.C4899r0) r12
            r3.P()
            r14 = 435053953(0x19ee6581, float:2.464962E-23)
            r3.W(r14)
            boolean r14 = r3.V(r11)
            java.lang.Object r10 = r3.D()
            if (r14 != 0) goto L_0x00d9
            java.lang.Object r14 = r13.a()
            if (r10 != r14) goto L_0x00e1
        L_0x00d9:
            rr.b r10 = new rr.b
            r10.<init>(r11, r12)
            r3.u(r10)
        L_0x00e1:
            nI.l r10 = (nI.C17642l) r10
            r3.P()
            androidx.compose.ui.d r10 = androidx.compose.ui.layout.g.a(r15, r10)
            r11 = 24
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            r14 = 0
            s0.E r7 = androidx.compose.foundation.layout.D.c(r11, r14, r7, r9)
            androidx.compose.foundation.layout.d$a r9 = androidx.compose.foundation.layout.C5073d.a.f18077a
            r11 = 12
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            androidx.compose.foundation.layout.d$f r9 = r9.c(r11)
            r11 = 435060280(0x19ee7e38, float:2.4659603E-23)
            r3.W(r11)
            r11 = r5 & 14
            r14 = 1
            if (r11 != r6) goto L_0x0110
            r6 = r14
            goto L_0x0111
        L_0x0110:
            r6 = 0
        L_0x0111:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r5 != r11) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r14 = 0
        L_0x0119:
            r5 = r6 | r14
            boolean r6 = r3.b(r0)
            r5 = r5 | r6
            java.lang.Object r6 = r3.D()
            if (r5 != 0) goto L_0x012c
            java.lang.Object r5 = r13.a()
            if (r6 != r5) goto L_0x0134
        L_0x012c:
            rr.c r6 = new rr.c
            r6.<init>(r0, r1, r2, r12)
            r3.u(r6)
        L_0x0134:
            r13 = r6
            nI.l r13 = (nI.C17642l) r13
            r3.P()
            r0 = 24960(0x6180, float:3.4976E-41)
            r16 = 232(0xe8, float:3.25E-43)
            r11 = 0
            r12 = 0
            r14 = 0
            r17 = 0
            r5 = r10
            r6 = r8
            r8 = r11
            r10 = r12
            r11 = r14
            r12 = r17
            r14 = r3
            r17 = r15
            r15 = r0
            t0.C5937b.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x015a
            U0.C4895p.R()
        L_0x015a:
            r10 = r17
        L_0x015c:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0174
            rr.d r7 = new rr.d
            r0 = r7
            r1 = r18
            r2 = r19
            r3 = r10
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rr.g.e(Iq.g, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float f(C4899r0<c2.h> r0Var) {
        return r0Var.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final C16807N g(boolean z10, Iq.g gVar, C17642l lVar, C4899r0 r0Var, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        x.i(xVar, C11842a.EntryPoint, (Object) null, c1.c.c(1792544874, true, new a(gVar, lVar, z10, r0Var)), 2, (Object) null);
        if (z10) {
            List<C11842a> list = f102126a;
            xVar.e(list.size(), new d(new e(), list), new e(c.f102133c, list), c1.c.c(-632812321, true, new f(list)));
        } else {
            C15987c<Iq.a> c10 = gVar.c();
            C2434g gVar2 = C2434g.f102139a;
            xVar.e(c10.size(), new i(new h((String) null), c10), new j(gVar2, c10), c1.c.c(-632812321, true, new k(c10, lVar)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object h(C11842a aVar) {
        C17542s.j(aVar, "it");
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(Iq.g gVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(gVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void j(C4899r0<c2.h> r0Var, float f10) {
        r0Var.setValue(c2.h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N k(c2.d dVar, C4899r0 r0Var, c2.r rVar) {
        j(r0Var, dVar.H(c2.r.g(rVar.k())));
        return C16807N.f139792a;
    }
}
