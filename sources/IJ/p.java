package Ij;

import C.C4409q;
import HJ.C15854t;
import Ij.h;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U.c;
import U0.C4889m;
import U0.L;
import U0.M;
import U0.M0;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.camera.view.C5066f;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import bd.C9427a;
import c2.r;
import cd.C9452a;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import o1.C5662b;
import o1.C5674n;
import p1.C5702H;
import p1.C5712d0;
import p1.C5747v0;
import p1.C5749w0;
import p1.C5751x0;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import r1.g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ljava/util/concurrent/Executor;", "executor", "LC/q;", "cameraSelector", "Lbd/a;", "barcodeScanner", "LIj/h;", "scannerBarcodeAnalyzer", "Lc2/r;", "intSize", "Lo1/g;", "offset", "LXH/N;", "g", "(Ljava/util/concurrent/Executor;LC/q;Lbd/a;LIj/h;JJLU0/m;I)V", "h", "(JJLU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerCameraKt$ScannerCamera$2$1$1$1$1$1", f = "ScannerCamera.kt", l = {78}, m = "invokeSuspend")
    static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81850c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f81851d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<h.a> f81852e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, List<h.a> list, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f81851d = hVar;
            this.f81852e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f81851d, this.f81852e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81850c;
            if (i10 == 0) {
                y.b(obj);
                h hVar = this.f81851d;
                List<h.a> list = this.f81852e;
                this.f81850c = 1;
                if (hVar.a(list, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ij/p$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5066f f81853a;

        public b(C5066f fVar) {
            this.f81853a = fVar;
        }

        public void b() {
            this.f81853a.f();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.util.concurrent.Executor r20, C.C4409q r21, bd.C9427a r22, Ij.h r23, long r24, long r26, U0.C4889m r28, int r29) {
        /*
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r29
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "cameraSelector"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "barcodeScanner"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "scannerBarcodeAnalyzer"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = -459852806(0xffffffffe49733fa, float:-2.231363E22)
            r1 = r28
            U0.m r15 = r1.k(r0)
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0036
            boolean r1 = r15.F(r6)
            if (r1 == 0) goto L_0x0033
            r1 = 4
            goto L_0x0034
        L_0x0033:
            r1 = 2
        L_0x0034:
            r1 = r1 | r10
            goto L_0x0037
        L_0x0036:
            r1 = r10
        L_0x0037:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0047
            boolean r2 = r15.F(r7)
            if (r2 == 0) goto L_0x0044
            r2 = 32
            goto L_0x0046
        L_0x0044:
            r2 = 16
        L_0x0046:
            r1 = r1 | r2
        L_0x0047:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0057
            boolean r2 = r15.F(r8)
            if (r2 == 0) goto L_0x0054
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r2
        L_0x0057:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0067
            boolean r2 = r15.F(r9)
            if (r2 == 0) goto L_0x0064
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0066
        L_0x0064:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0066:
            r1 = r1 | r2
        L_0x0067:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            r13 = r24
            if (r2 != 0) goto L_0x0079
            boolean r2 = r15.e(r13)
            if (r2 == 0) goto L_0x0076
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0078
        L_0x0076:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0078:
            r1 = r1 | r2
        L_0x0079:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r10
            r11 = r26
            if (r2 != 0) goto L_0x008c
            boolean r2 = r15.e(r11)
            if (r2 == 0) goto L_0x0089
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008b
        L_0x0089:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x008b:
            r1 = r1 | r2
        L_0x008c:
            r5 = r1
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r5
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r2) goto L_0x00a3
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            r15.L()
            r0 = r15
            goto L_0x0220
        L_0x00a3:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00af
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerCamera (ScannerCamera.kt:46)"
            U0.C4895p.S(r0, r5, r1, r2)
        L_0x00af:
            U0.I0 r0 = j3.g.a()
            java.lang.Object r0 = r15.Q(r0)
            r4 = r0
            androidx.lifecycle.y r4 = (androidx.lifecycle.C5221y) r4
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r15.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            r1 = -40921934(0xfffffffffd8f94b2, float:-2.385646E37)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r2 = r16.a()
            if (r1 != r2) goto L_0x00de
            androidx.camera.view.f r1 = new androidx.camera.view.f
            r1.<init>(r0)
            r15.u(r1)
        L_0x00de:
            r3 = r1
            androidx.camera.view.f r3 = (androidx.camera.view.C5066f) r3
            r15.P()
            r0 = -40919342(0xfffffffffd8f9ed2, float:-2.386303E37)
            r15.W(r0)
            U0.I0 r0 = j3.g.a()
            java.lang.Object r0 = r15.Q(r0)
            androidx.lifecycle.y r0 = (androidx.lifecycle.C5221y) r0
            r3.e0(r0)
            r3.J(r7)
            r15.P()
            r0 = -40913350(0xfffffffffd8fb63a, float:-2.3878222E37)
            r15.W(r0)
            boolean r0 = r15.F(r3)
            boolean r1 = r15.F(r6)
            r0 = r0 | r1
            boolean r1 = r15.F(r8)
            r0 = r0 | r1
            boolean r1 = r15.F(r4)
            r0 = r0 | r1
            boolean r1 = r15.F(r9)
            r0 = r0 | r1
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x012e
            java.lang.Object r0 = r16.a()
            if (r1 != r0) goto L_0x0128
            goto L_0x012e
        L_0x0128:
            r7 = r3
            r28 = r4
            r17 = r5
            goto L_0x0145
        L_0x012e:
            Ij.j r2 = new Ij.j
            r0 = r2
            r1 = r3
            r6 = r2
            r2 = r20
            r7 = r3
            r3 = r22
            r28 = r4
            r17 = r5
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r15.u(r6)
            r1 = r6
        L_0x0145:
            nI.l r1 = (nI.C17642l) r1
            r15.P()
            r0 = 0
            r2 = r28
            U0.P.c(r2, r1, r15, r0)
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r2 = 0
            r3 = 1
            r4 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.f(r1, r2, r3, r4)
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r0)
            int r0 = U0.C4883j.a(r15, r0)
            U0.y r2 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r3 = r18.a()
            U0.f r19 = r15.m()
            if (r19 != 0) goto L_0x017e
            U0.C4883j.c()
        L_0x017e:
            r15.I()
            boolean r19 = r15.i()
            if (r19 == 0) goto L_0x018b
            r15.p(r3)
            goto L_0x018e
        L_0x018b:
            r15.t()
        L_0x018e:
            U0.m r3 = U0.F1.a(r15)
            nI.p r4 = r18.c()
            U0.F1.c(r3, r6, r4)
            nI.p r4 = r18.e()
            U0.F1.c(r3, r2, r4)
            nI.p r2 = r18.b()
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x01b8
            java.lang.Object r4 = r3.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x01c6
        L_0x01b8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3.u(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.w(r0, r2)
        L_0x01c6:
            nI.p r0 = r18.d()
            U0.F1.c(r3, r5, r0)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            r0 = 0
            r2 = 1
            r3 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r1, r0, r2, r3)
            r1 = 675852405(0x2848b075, float:1.1140493E-14)
            r15.W(r1)
            boolean r1 = r15.F(r7)
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x01ec
            java.lang.Object r1 = r16.a()
            if (r2 != r1) goto L_0x01f4
        L_0x01ec:
            Ij.k r2 = new Ij.k
            r2.<init>(r7)
            r15.u(r2)
        L_0x01f4:
            r1 = r2
            nI.l r1 = (nI.C17642l) r1
            r15.P()
            r2 = 48
            r16 = 4
            r3 = 0
            r11 = r1
            r12 = r0
            r13 = r3
            r14 = r15
            r0 = r15
            r15 = r2
            androidx.compose.ui.viewinterop.e.a(r11, r12, r13, r14, r15, r16)
            int r1 = r17 >> 12
            r16 = r1 & 126(0x7e, float:1.77E-43)
            r11 = r24
            r13 = r26
            r15 = r0
            h(r11, r13, r15, r16)
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0220
            U0.C4895p.R()
        L_0x0220:
            U0.Y0 r11 = r0.n()
            if (r11 == 0) goto L_0x023d
            Ij.l r12 = new Ij.l
            r0 = r12
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r26
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r7, r9)
            r11.a(r12)
        L_0x023d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ij.p.g(java.util.concurrent.Executor, C.q, bd.a, Ij.h, long, long, U0.m, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: Ij.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: Ij.m} */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r3 == U0.C4889m.f14007a.a()) goto L_0x00b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void h(long r23, long r25, U0.C4889m r27, int r28) {
        /*
            r0 = 973254821(0x3a02b0a5, float:4.9854285E-4)
            r1 = r27
            U0.m r1 = r1.k(r0)
            r2 = r28 & 6
            r3 = 2
            r4 = 4
            r13 = r23
            if (r2 != 0) goto L_0x001d
            boolean r2 = r1.e(r13)
            if (r2 == 0) goto L_0x0019
            r2 = r4
            goto L_0x001a
        L_0x0019:
            r2 = r3
        L_0x001a:
            r2 = r28 | r2
            goto L_0x001f
        L_0x001d:
            r2 = r28
        L_0x001f:
            r5 = r28 & 48
            r6 = 32
            r11 = r25
            if (r5 != 0) goto L_0x0032
            boolean r5 = r1.e(r11)
            if (r5 == 0) goto L_0x002f
            r5 = r6
            goto L_0x0031
        L_0x002f:
            r5 = 16
        L_0x0031:
            r2 = r2 | r5
        L_0x0032:
            r5 = r2 & 19
            r7 = 18
            if (r5 != r7) goto L_0x0044
            boolean r5 = r1.l()
            if (r5 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            r1.L()
            goto L_0x00d8
        L_0x0044:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0050
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerCameraOverlay (ScannerCamera.kt:126)"
            U0.C4895p.S(r0, r2, r5, r7)
        L_0x0050:
            tK.v r0 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r1, r5)
            long r15 = r0.p0()
            r21 = 14
            r22 = 0
            r17 = 1048576000(0x3e800000, float:0.25)
            r18 = 0
            r19 = 0
            r20 = 0
            long r7 = p1.C5747v0.o(r15, r17, r18, r19, r20, r21, r22)
            float r0 = (float) r3
            float r10 = c2.h.B(r0)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r3 = 0
            r5 = 0
            r9 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r0, r3, r9, r5)
            int r3 = c2.r.h(r23)
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            int r5 = c2.r.g(r23)
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.v(r0, r3, r5)
            r3 = 482422785(0x1cc13001, float:1.2784077E-21)
            r1.W(r3)
            boolean r3 = r1.e(r7)
            r5 = r2 & 14
            r15 = 0
            if (r5 != r4) goto L_0x00a1
            r4 = r9
            goto L_0x00a2
        L_0x00a1:
            r4 = r15
        L_0x00a2:
            r3 = r3 | r4
            r2 = r2 & 112(0x70, float:1.57E-43)
            if (r2 != r6) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r9 = r15
        L_0x00a9:
            r2 = r3 | r9
            java.lang.Object r3 = r1.D()
            if (r2 != 0) goto L_0x00b9
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00c7
        L_0x00b9:
            Ij.m r3 = new Ij.m
            r5 = r3
            r6 = r7
            r8 = r23
            r11 = r25
            r5.<init>(r6, r8, r10, r11)
            r1.u(r3)
        L_0x00c7:
            nI.l r3 = (nI.C17642l) r3
            r1.P()
            n0.C5603i.a(r0, r3, r1, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00d8
            U0.C4895p.R()
        L_0x00d8:
            U0.Y0 r0 = r1.n()
            if (r0 == 0) goto L_0x00ed
            Ij.n r1 = new Ij.n
            r5 = r1
            r6 = r23
            r8 = r25
            r10 = r28
            r5.<init>(r6, r8, r10)
            r0.a(r1)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ij.p.h(long, long, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(long j10, long j11, float f10, long j12, r1.f fVar) {
        float f11 = f10;
        r1.f fVar2 = fVar;
        C17542s.j(fVar2, "$this$Canvas");
        Canvas d10 = C5702H.d(fVar.I1().e());
        r1.f.q1(fVar, j10, 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
        long a10 = C5674n.a((float) r.h(j11), (float) r.g(j11));
        long a11 = C5662b.a(fVar2.H1(f11), fVar2.H1(f11));
        r1.f.L1(fVar, C5747v0.f27350b.h(), j12, a10, a11, (g) null, 0.0f, (C5749w0) null, C5712d0.f27280a.a(), 112, (Object) null);
        d10.restoreToCount(d10.saveLayer((RectF) null, (Paint) null));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(long j10, long j11, int i10, C4889m mVar, int i11) {
        h(j10, j11, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L k(C5066f fVar, Executor executor, C9427a aVar, C5221y yVar, h hVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        fVar.K(2);
        fVar.L(executor, new c(C16877v.e(aVar), 1, executor, new o(aVar, yVar, hVar, fVar)));
        return new b(fVar);
    }

    /* access modifiers changed from: private */
    public static final void l(C9427a aVar, C5221y yVar, h hVar, C5066f fVar, c.a aVar2) {
        Throwable b10;
        List list;
        C9427a aVar3 = aVar;
        c.a aVar4 = aVar2;
        if (!(aVar4 == null || (list = (List) aVar4.c(aVar3)) == null)) {
            Iterable<C9452a> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C9452a aVar5 : iterable) {
                arrayList.add(new h.a(aVar5.b(), aVar5.a()));
            }
            F0 unused = C16314k.d(C5222z.a(yVar), (C17168i) null, (T) null, new a(hVar, arrayList, (C17164e<? super a>) null), 3, (Object) null);
        }
        if (aVar4 != null && (b10 = aVar4.b(aVar3)) != null) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList2) {
                if (str == null) {
                    String a10 = C11818a.a("Something went wrong while scanning a barcode", b10);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = fVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, b10, str);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final PreviewView m(C5066f fVar, Context context) {
        C17542s.j(context, "context");
        PreviewView previewView = new PreviewView(context);
        previewView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        previewView.setBackgroundColor(C5751x0.k(C5747v0.f27350b.h()));
        previewView.setScaleType(PreviewView.d.FILL_CENTER);
        previewView.setImplementationMode(PreviewView.c.COMPATIBLE);
        previewView.setController(fVar);
        return previewView;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(Executor executor, C4409q qVar, C9427a aVar, h hVar, long j10, long j11, int i10, C4889m mVar, int i11) {
        g(executor, qVar, aVar, hVar, j10, j11, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
