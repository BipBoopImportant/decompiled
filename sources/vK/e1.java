package vk;

import HJ.C15854t;
import J1.j;
import Oo.b;
import RA.C13502a;
import SC.W1;
import SC.Z1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.window.h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import pk.s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\t\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpk/s$j;", "renameListResult", "Lkotlin/Function1;", "", "LXH/N;", "onListNameSubmitted", "Lkotlin/Function0;", "onErrorDismissed", "onDismissed", "d", "(Lpk/s$j;LnI/l;LnI/a;LnI/a;LU0/m;I)V", "listName", "onNameSubmitted", "Landroidx/compose/ui/d;", "modifier", "f", "(Ljava/lang/String;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e1 {
    public static final void d(s.j jVar, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C17542s.j(lVar, "onListNameSubmitted");
        C17542s.j(aVar, "onErrorDismissed");
        C17542s.j(aVar2, "onDismissed");
        C4889m k10 = mVar.k(-1540629702);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(jVar) : k10.F(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1540629702, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.RenameListContent (RenameListContent.kt:25)");
            }
            k10.W(1273538212);
            if (jVar instanceof s.j.b) {
                f(((s.j.b) jVar).a(), lVar, aVar2, (d) null, k10, (i12 & 112) | ((i12 >> 3) & 896), 8);
            }
            k10.P();
            if (jVar instanceof s.j.a) {
                Z1.d(j.b(C13502a.f115114a.a(((s.j.a) jVar).a()), k10, 0), new W1(j.b(b.f84616d5, k10, 0), aVar), aVar, (d) null, (h) null, C12153j.f104815a.a(), k10, (W1.f116045c << 3) | ImageMetadata.EDGE_MODE | (i12 & 896), 24);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b1(jVar, lVar, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(s.j jVar, C17642l lVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        d(jVar, lVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(java.lang.String r23, nI.C17642l<? super java.lang.String, XH.C16807N> r24, nI.C17631a<XH.C16807N> r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r2 = r24
            r5 = r28
            r0 = -2066601092(0xffffffff84d22b7c, float:-4.9410697E-36)
            r1 = r27
            U0.m r1 = r1.k(r0)
            r3 = r29 & 1
            if (r3 == 0) goto L_0x0017
            r3 = r5 | 6
            r4 = r3
            r3 = r23
            goto L_0x002b
        L_0x0017:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x0028
            r3 = r23
            boolean r4 = r1.V(r3)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r5
            goto L_0x002b
        L_0x0028:
            r3 = r23
            r4 = r5
        L_0x002b:
            r6 = r29 & 2
            r7 = 32
            if (r6 == 0) goto L_0x0034
            r4 = r4 | 48
            goto L_0x0043
        L_0x0034:
            r6 = r5 & 48
            if (r6 != 0) goto L_0x0043
            boolean r6 = r1.F(r2)
            if (r6 == 0) goto L_0x0040
            r6 = r7
            goto L_0x0042
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
        L_0x0043:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            r15 = r25
            goto L_0x005e
        L_0x004c:
            r6 = r5 & 384(0x180, float:5.38E-43)
            r15 = r25
            if (r6 != 0) goto L_0x005e
            boolean r6 = r1.F(r15)
            if (r6 == 0) goto L_0x005b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r6
        L_0x005e:
            r6 = r29 & 8
            if (r6 == 0) goto L_0x0067
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r8 = r26
            goto L_0x0079
        L_0x0067:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0064
            r8 = r26
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x0076
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r9
        L_0x0079:
            r9 = r4 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 != r10) goto L_0x008c
            boolean r9 = r1.l()
            if (r9 != 0) goto L_0x0086
            goto L_0x008c
        L_0x0086:
            r1.L()
            r4 = r8
            goto L_0x0113
        L_0x008c:
            if (r6 == 0) goto L_0x0093
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r22 = r6
            goto L_0x0095
        L_0x0093:
            r22 = r8
        L_0x0095:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a1
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.RenameListInputDialog (RenameListContent.kt:55)"
            U0.C4895p.S(r0, r4, r6, r8)
        L_0x00a1:
            int r0 = ik.c.f98326R
            r6 = 0
            java.lang.String r0 = J1.j.b(r0, r1, r6)
            int r8 = Oo.b.f84385G7
            java.lang.String r8 = J1.j.b(r8, r1, r6)
            int r9 = Oo.b.f84828w8
            java.lang.String r13 = J1.j.b(r9, r1, r6)
            r9 = 1589813994(0x5ec2a2ea, float:7.0125147E18)
            r1.W(r9)
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 != r7) goto L_0x00bf
            r6 = 1
        L_0x00bf:
            java.lang.Object r7 = r1.D()
            if (r6 != 0) goto L_0x00cd
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x00d5
        L_0x00cd:
            vk.c1 r7 = new vk.c1
            r7.<init>(r2)
            r1.u(r7)
        L_0x00d5:
            r9 = r7
            nI.l r9 = (nI.C17642l) r9
            r1.P()
            int r6 = r4 << 3
            r7 = r6 & 7168(0x1c00, float:1.0045E-41)
            r10 = 805306368(0x30000000, float:4.656613E-10)
            r7 = r7 | r10
            r10 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r10
            r6 = r6 | r7
            int r4 = r4 << 24
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r7
            r19 = r6 | r4
            r20 = 0
            r21 = 3168(0xc60, float:4.44E-42)
            r11 = 0
            r12 = 0
            r4 = 0
            r16 = 0
            r17 = 0
            r6 = r0
            r7 = r8
            r8 = r9
            r9 = r25
            r10 = r22
            r14 = r23
            r15 = r4
            r18 = r1
            VC.d.d(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0111
            U0.C4895p.R()
        L_0x0111:
            r4 = r22
        L_0x0113:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x012c
            vk.d1 r8 = new vk.d1
            r0 = r8
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.e1.f(java.lang.String, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17642l lVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(C15854t.z1(str).toString());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, C17642l lVar, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(str, lVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
