package ki;

import HJ.C15854t;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import ji.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mi.j;
import nI.C17642l;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmi/j$b;", "uiData", "Lkotlin/Function1;", "Lji/c;", "LXH/N;", "screenUiEvent", "d", "(Lmi/j$b;LnI/l;LU0/m;I)V", "Lt0/x;", "h", "(Lt0/x;Lmi/j$b;LnI/l;)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.b f75084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<c, C16807N> f75085b;

        a(j.b bVar, C17642l<? super c, C16807N> lVar) {
            this.f75084a = bVar;
            this.f75085b = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(170219028, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.pipDisclaimersItem.<anonymous> (PipDisclaimers.kt:42)");
                }
                C.d(this.f75084a, this.f75085b, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(mi.j.b r11, nI.C17642l<? super ji.c, XH.C16807N> r12, U0.C4889m r13, int r14) {
        /*
            java.lang.String r0 = "uiData"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "screenUiEvent"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -498447054(0xffffffffe24a4d32, float:-9.329512E20)
            U0.m r13 = r13.k(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0020
            boolean r1 = r13.V(r11)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r14
            goto L_0x0021
        L_0x0020:
            r1 = r14
        L_0x0021:
            r2 = r14 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0032
            boolean r2 = r13.F(r12)
            if (r2 == 0) goto L_0x002f
            r2 = r3
            goto L_0x0031
        L_0x002f:
            r2 = 16
        L_0x0031:
            r1 = r1 | r2
        L_0x0032:
            r2 = r1 & 19
            r4 = 18
            if (r2 != r4) goto L_0x0044
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            r13.L()
            goto L_0x00bd
        L_0x0044:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0050
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.productinformationpage.v3.compose.PipDisclaimers (PipDisclaimers.kt:16)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0050:
            java.lang.String r0 = r11.g()
            KJ.c r2 = r11.h()
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r7 = TC.e.i(r4)
            java.lang.String r6 = r11.i()
            r4 = -969164204(0xffffffffc63bba54, float:-12014.582)
            r13.W(r4)
            java.lang.Object r4 = r13.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r8 = r5.a()
            if (r4 != r8) goto L_0x007c
            ki.z r4 = new ki.z
            r4.<init>()
            r13.u(r4)
        L_0x007c:
            nI.l r4 = (nI.C17642l) r4
            r13.P()
            r8 = -969159851(0xffffffffc63bcb55, float:-12018.833)
            r13.W(r8)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x008d
            r1 = 1
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            java.lang.Object r3 = r13.D()
            if (r1 != 0) goto L_0x009a
            java.lang.Object r1 = r5.a()
            if (r3 != r1) goto L_0x00a2
        L_0x009a:
            ki.A r3 = new ki.A
            r3.<init>(r12)
            r13.u(r3)
        L_0x00a2:
            r5 = r3
            nI.l r5 = (nI.C17642l) r5
            r13.P()
            r9 = 24960(0x6180, float:3.4976E-41)
            r10 = 0
            r8 = 0
            r1 = r0
            r3 = r4
            r4 = r5
            r5 = r8
            r8 = r13
            Op.C10848n.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00bd
            U0.C4895p.R()
        L_0x00bd:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x00cb
            ki.B r0 = new ki.B
            r0.<init>(r11, r12, r14)
            r13.a(r0)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.C.d(mi.j$b, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str) {
        C17542s.j(str, "<unused var>");
        IllegalStateException illegalStateException = new IllegalStateException("We should not get color info on the PIP");
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "PIP";
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalStateException, str4);
            str2 = str4;
            str3 = str5;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar, Link link) {
        C17542s.j(link, "link");
        lVar.invoke(new c.d(link));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(j.b bVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(bVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(x xVar, j.b bVar, C17642l<? super c, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(bVar, "uiData");
        C17542s.j(lVar, "screenUiEvent");
        xVar.b("pip:DisclaimersData", "DisclaimersData", c1.c.c(170219028, true, new a(bVar, lVar)));
    }
}
