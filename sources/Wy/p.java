package wy;

import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKJ/c;", "Lwy/l;", "slots", "LXH/N;", "c", "(LKJ/c;LU0/m;I)V", "room-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final a f131826c = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(l lVar) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f131827c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f131828d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17642l lVar, List list) {
            super(1);
            this.f131827c = lVar;
            this.f131828d = list;
        }

        public final Object a(int i10) {
            return this.f131827c.invoke(this.f131828d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f131829c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(4);
            this.f131829c = list;
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
                mVar.W(-215536489);
                l.f131816b.b((l) this.f131829c.get(i10), mVar, 48);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(KJ.C15987c<wy.l> r13, U0.C4889m r14, int r15) {
        /*
            java.lang.String r0 = "slots"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = -980169444(0xffffffffc593cd1c, float:-4729.6387)
            U0.m r14 = r14.k(r0)
            r1 = r15 & 6
            r2 = 2
            r3 = 4
            if (r1 != 0) goto L_0x001d
            boolean r1 = r14.V(r13)
            if (r1 == 0) goto L_0x001a
            r1 = r3
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            r1 = r1 | r15
            goto L_0x001e
        L_0x001d:
            r1 = r15
        L_0x001e:
            r4 = r1 & 3
            if (r4 != r2) goto L_0x002d
            boolean r2 = r14.l()
            if (r2 != 0) goto L_0x0029
            goto L_0x002d
        L_0x0029:
            r14.L()
            goto L_0x0093
        L_0x002d:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0039
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.room.impl.presentation.composables.Slots (Slots.kt:25)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0039:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r2 = 0
            r4 = 0
            r5 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r0, r2, r5, r4)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            r4 = 16
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.foundation.layout.d$f r6 = r2.n(r4)
            r2 = 1524806804(0x5ae2b494, float:3.19059462E16)
            r14.W(r2)
            r1 = r1 & 14
            if (r1 != r3) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            java.lang.Object r1 = r14.D()
            if (r5 != 0) goto L_0x0069
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0071
        L_0x0069:
            wy.n r1 = new wy.n
            r1.<init>(r13)
            r14.u(r1)
        L_0x0071:
            r9 = r1
            nI.l r9 = (nI.C17642l) r9
            r14.P()
            r11 = 24582(0x6006, float:3.4447E-41)
            r12 = 238(0xee, float:3.34E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r1 = r0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r14
            t0.C5937b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0093
            U0.C4895p.R()
        L_0x0093:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x00a1
            wy.o r0 = new wy.o
            r0.<init>(r13, r15)
            r14.a(r0)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wy.p.c(KJ.c, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        xVar.e(cVar.size(), (C17642l<? super Integer, ? extends Object>) null, new b(a.f131826c, cVar), c1.c.c(-632812321, true, new c(cVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C15987c cVar, int i10, C4889m mVar, int i11) {
        c(cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
