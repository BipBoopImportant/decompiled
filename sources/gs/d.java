package gs;

import E1.C4478k;
import T5.u;
import U0.C4889m;
import U0.C4895p;
import U5.e;
import U5.t;
import XH.C16807N;
import android.content.res.Resources;
import gs.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import r1.f;
import t1.C5942c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\r\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\n*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgs/e;", "model", "LE1/k;", "contentScale", "Lp1/E0;", "filterQuality", "Lt1/c;", "c", "(Lgs/e;LE1/k;ILU0/m;II)Lt1/c;", "Lkotlin/Function1;", "Lgs/e$c;", "LXH/N;", "onState", "b", "(Lgs/e;LnI/l;LE1/k;ILU0/m;II)Lt1/c;", "LU5/e$c;", "Landroid/content/res/Resources;", "resources", "e", "(LU5/e$c;Landroid/content/res/Resources;)Lgs/e$c;", "imagerequest_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final t1.C5942c b(gs.e r9, nI.C17642l<? super gs.e.c, XH.C16807N> r10, E1.C4478k r11, int r12, U0.C4889m r13, int r14, int r15) {
        /*
            r0 = 1032962722(0x3d91c2a2, float:0.071172014)
            r13.W(r0)
            r1 = r15 & 4
            if (r1 == 0) goto L_0x0010
            E1.k$a r11 = E1.C4478k.f5915a
            E1.k r11 = r11.e()
        L_0x0010:
            r4 = r11
            r11 = r15 & 8
            if (r11 == 0) goto L_0x001b
            r1.f$a r11 = r1.f.f28623w0
            int r12 = r11.b()
        L_0x001b:
            r5 = r12
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x0028
            r11 = -1
            java.lang.String r12 = "com.ingka.ikea.imagerequest.rememberIkeaAsyncImagePainter (IkeaAsyncImagePainter.kt:66)"
            U0.C4895p.S(r0, r14, r11, r12)
        L_0x0028:
            U0.I0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r11 = r13.Q(r11)
            android.content.Context r11 = (android.content.Context) r11
            android.content.res.Resources r11 = r11.getResources()
            if (r9 == 0) goto L_0x003e
            k6.h r9 = r9.a()
        L_0x003c:
            r1 = r9
            goto L_0x0040
        L_0x003e:
            r9 = 0
            goto L_0x003c
        L_0x0040:
            r9 = 1285010114(0x4c97b2c2, float:7.9533584E7)
            r13.W(r9)
            r9 = r14 & 112(0x70, float:1.57E-43)
            r9 = r9 ^ 48
            r12 = 32
            if (r9 <= r12) goto L_0x0054
            boolean r9 = r13.V(r10)
            if (r9 != 0) goto L_0x0058
        L_0x0054:
            r9 = r14 & 48
            if (r9 != r12) goto L_0x005a
        L_0x0058:
            r9 = 1
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            boolean r12 = r13.F(r11)
            r9 = r9 | r12
            java.lang.Object r12 = r13.D()
            if (r9 != 0) goto L_0x006e
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r12 != r9) goto L_0x0076
        L_0x006e:
            gs.c r12 = new gs.c
            r12.<init>(r10, r11)
            r13.u(r12)
        L_0x0076:
            r3 = r12
            nI.l r3 = (nI.C17642l) r3
            r13.P()
            int r9 = r14 << 3
            r10 = 64512(0xfc00, float:9.04E-41)
            r7 = r9 & r10
            r8 = 2
            r2 = 0
            r6 = r13
            U5.e r9 = U5.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0093
            U0.C4895p.R()
        L_0x0093:
            r13.P()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.d.b(gs.e, nI.l, E1.k, int, U0.m, int, int):t1.c");
    }

    public static final C5942c c(e eVar, C4478k kVar, int i10, C4889m mVar, int i11, int i12) {
        mVar.W(450703567);
        if ((i12 & 2) != 0) {
            kVar = C4478k.f5915a.e();
        }
        C4478k kVar2 = kVar;
        if ((i12 & 4) != 0) {
            i10 = f.f28623w0.b();
        }
        int i13 = i10;
        if (C4895p.J()) {
            C4895p.S(450703567, i11, -1, "com.ingka.ikea.imagerequest.rememberIkeaAsyncImagePainter (IkeaAsyncImagePainter.kt:27)");
        }
        e a10 = t.a(eVar != null ? eVar.a() : null, (C17642l<? super e.c, ? extends e.c>) null, (C17642l<? super e.c, C16807N>) null, kVar2, i13, mVar, (i11 << 6) & 64512, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a10;
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, Resources resources, e.c cVar) {
        C17542s.j(cVar, "it");
        if (lVar != null) {
            C17542s.g(resources);
            lVar.invoke(e(cVar, resources));
        }
        return C16807N.f139792a;
    }

    public static final e.c e(e.c cVar, Resources resources) {
        e.c cVar2;
        C17542s.j(cVar, "<this>");
        C17542s.j(resources, "resources");
        if (C17542s.e(cVar, e.c.a.f40212a)) {
            return e.c.a.f97965b;
        }
        if (cVar instanceof e.c.b) {
            cVar2 = new e.c.b(((e.c.b) cVar).a());
        } else if (cVar instanceof e.c.C0658c) {
            cVar2 = new e.c.C2193c(((e.c.C0658c) cVar).a());
        } else if (cVar instanceof e.c.d) {
            e.c.d dVar = (e.c.d) cVar;
            return new e.c.d(dVar.a(), u.a(dVar.b().k(), resources));
        } else {
            throw new XH.t();
        }
        return cVar2;
    }
}
