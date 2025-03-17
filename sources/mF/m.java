package mF;

import HJ.C15854t;
import U0.C4889m;
import U0.M0;
import UE.C13733a;
import XH.C16807N;
import XH.C16816g;
import XH.t;
import android.net.Uri;
import android.util.Log;
import androidx.compose.ui.d;
import cF.C14046h;
import com.sugarcube.app.base.data.analytics.Destination;
import com.sugarcube.app.base.data.analytics.EntryType;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.external.entrypoint.TrackEntryPointUseCase;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.core.logger.Priority;
import java.lang.invoke.MethodHandles;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nF.C14850a;
import nF.C14851b;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LnF/b;", "model", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "origin", "LUE/a;", "deeplinks", "Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "trackEntryPoint", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "Landroid/net/Uri;", "LXH/N;", "onDeeplink", "e", "(LnF/b;Lcom/sugarcube/app/base/data/analytics/OpeningSource;LUE/a;Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(nF.C14851b r18, com.sugarcube.app.base.data.analytics.OpeningSource r19, UE.C13733a r20, com.sugarcube.app.base.external.entrypoint.TrackEntryPointUseCase r21, androidx.compose.ui.d r22, nI.C17642l<? super android.net.Uri, XH.C16807N> r23, U0.C4889m r24, int r25, int r26) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r23
            r7 = r25
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "deeplinks"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "trackEntryPoint"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            java.lang.String r0 = "onDeeplink"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            r0 = -1379732877(0xffffffffadc2f273, float:-2.2162916E-11)
            r5 = r24
            U0.m r5 = r5.k(r0)
            r8 = r26 & 1
            if (r8 == 0) goto L_0x0035
            r8 = r7 | 6
            goto L_0x0045
        L_0x0035:
            r8 = r7 & 6
            if (r8 != 0) goto L_0x0044
            boolean r8 = r5.V(r1)
            if (r8 == 0) goto L_0x0041
            r8 = 4
            goto L_0x0042
        L_0x0041:
            r8 = 2
        L_0x0042:
            r8 = r8 | r7
            goto L_0x0045
        L_0x0044:
            r8 = r7
        L_0x0045:
            r9 = r26 & 2
            r10 = 32
            if (r9 == 0) goto L_0x004e
            r8 = r8 | 48
            goto L_0x005d
        L_0x004e:
            r9 = r7 & 48
            if (r9 != 0) goto L_0x005d
            boolean r9 = r5.V(r2)
            if (r9 == 0) goto L_0x005a
            r9 = r10
            goto L_0x005c
        L_0x005a:
            r9 = 16
        L_0x005c:
            r8 = r8 | r9
        L_0x005d:
            r9 = r26 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0066
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x0075
        L_0x0066:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0075
            boolean r9 = r5.V(r3)
            if (r9 == 0) goto L_0x0072
            r9 = r11
            goto L_0x0074
        L_0x0072:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0074:
            r8 = r8 | r9
        L_0x0075:
            r9 = r26 & 8
            if (r9 == 0) goto L_0x007c
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x007c:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0095
            r9 = r7 & 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x0089
            boolean r9 = r5.V(r4)
            goto L_0x008d
        L_0x0089:
            boolean r9 = r5.F(r4)
        L_0x008d:
            if (r9 == 0) goto L_0x0092
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0094
        L_0x0092:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0094:
            r8 = r8 | r9
        L_0x0095:
            r9 = r26 & 16
            if (r9 == 0) goto L_0x009e
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x009b:
            r13 = r22
            goto L_0x00b0
        L_0x009e:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x009b
            r13 = r22
            boolean r14 = r5.V(r13)
            if (r14 == 0) goto L_0x00ad
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00af
        L_0x00ad:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00af:
            r8 = r8 | r14
        L_0x00b0:
            r14 = r26 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r14 == 0) goto L_0x00ba
            r8 = r8 | r15
            goto L_0x00c9
        L_0x00ba:
            r14 = r7 & r15
            if (r14 != 0) goto L_0x00c9
            boolean r14 = r5.F(r6)
            if (r14 == 0) goto L_0x00c6
            r14 = r12
            goto L_0x00c8
        L_0x00c6:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00c8:
            r8 = r8 | r14
        L_0x00c9:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r8
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00de
            boolean r14 = r5.l()
            if (r14 != 0) goto L_0x00d9
            goto L_0x00de
        L_0x00d9:
            r5.L()
            goto L_0x022d
        L_0x00de:
            if (r9 == 0) goto L_0x00e4
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r15 = r9
            goto L_0x00e5
        L_0x00e4:
            r15 = r13
        L_0x00e5:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00f1
            r9 = -1
            java.lang.String r13 = "com.sugarcube.app.base.ui.compose.entrypoint.EntryPoint (EntryPoint.kt:31)"
            U0.C4895p.S(r0, r8, r9, r13)
        L_0x00f1:
            boolean r0 = r1 instanceof nF.C14851b.C3193b
            r9 = 458752(0x70000, float:6.42848E-40)
            if (r0 == 0) goto L_0x01b5
            r0 = -1256191510(0xffffffffb52009ea, float:-5.961907E-7)
            r5.W(r0)
            r0 = r1
            nF.b$b r0 = (nF.C14851b.C3193b) r0
            r13 = -1287444538(0xffffffffb34327c6, float:-4.543815E-8)
            r5.W(r13)
            r13 = r8 & 896(0x380, float:1.256E-42)
            if (r13 != r11) goto L_0x010d
            r16 = 1
            goto L_0x010f
        L_0x010d:
            r16 = 0
        L_0x010f:
            r14 = r8 & 112(0x70, float:1.57E-43)
            if (r14 != r10) goto L_0x0116
            r17 = 1
            goto L_0x0118
        L_0x0116:
            r17 = 0
        L_0x0118:
            r16 = r16 | r17
            r9 = r9 & r8
            if (r9 != r12) goto L_0x0120
            r17 = 1
            goto L_0x0122
        L_0x0120:
            r17 = 0
        L_0x0122:
            r16 = r16 | r17
            r12 = r8 & 7168(0x1c00, float:1.0045E-41)
            r10 = 2048(0x800, float:2.87E-42)
            if (r12 == r10) goto L_0x0137
            r10 = r8 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0135
            boolean r10 = r5.F(r4)
            if (r10 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r10 = 0
            goto L_0x0138
        L_0x0137:
            r10 = 1
        L_0x0138:
            r10 = r16 | r10
            java.lang.Object r11 = r5.D()
            if (r10 != 0) goto L_0x0148
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x0150
        L_0x0148:
            mF.h r11 = new mF.h
            r11.<init>(r3, r2, r6, r4)
            r5.u(r11)
        L_0x0150:
            r10 = r11
            nI.l r10 = (nI.C17642l) r10
            r5.P()
            r11 = -1287383004(0xffffffffb3441824, float:-4.5656762E-8)
            r5.W(r11)
            r11 = 256(0x100, float:3.59E-43)
            if (r13 != r11) goto L_0x0164
            r11 = 32
            r13 = 1
            goto L_0x0167
        L_0x0164:
            r11 = 32
            r13 = 0
        L_0x0167:
            if (r14 != r11) goto L_0x016b
            r11 = 1
            goto L_0x016c
        L_0x016b:
            r11 = 0
        L_0x016c:
            r11 = r11 | r13
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r9 != r13) goto L_0x0173
            r9 = 1
            goto L_0x0174
        L_0x0173:
            r9 = 0
        L_0x0174:
            r9 = r9 | r11
            r11 = 2048(0x800, float:2.87E-42)
            if (r12 == r11) goto L_0x0186
            r11 = r8 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x0184
            boolean r11 = r5.F(r4)
            if (r11 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            r13 = 0
            goto L_0x0187
        L_0x0186:
            r13 = 1
        L_0x0187:
            r9 = r9 | r13
            java.lang.Object r11 = r5.D()
            if (r9 != 0) goto L_0x0196
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r11 != r9) goto L_0x019e
        L_0x0196:
            mF.i r11 = new mF.i
            r11.<init>(r3, r2, r6, r4)
            r5.u(r11)
        L_0x019e:
            nI.a r11 = (nI.C17631a) r11
            r5.P()
            int r8 = r8 >> 3
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            r14 = 0
            r8 = r0
            r9 = r10
            r10 = r11
            r11 = r15
            r12 = r5
            mF.C14798f.d(r8, r9, r10, r11, r12, r13, r14)
            r5.P()
            goto L_0x0223
        L_0x01b5:
            boolean r0 = r1 instanceof nF.C14851b.a
            if (r0 == 0) goto L_0x024c
            r0 = -1253674899(0xffffffffb546706d, float:-7.392435E-7)
            r5.W(r0)
            r0 = r1
            nF.b$a r0 = (nF.C14851b.a) r0
            r10 = -1287363234(0xffffffffb344655e, float:-4.5727E-8)
            r5.W(r10)
            r10 = r8 & 896(0x380, float:1.256E-42)
            r11 = 256(0x100, float:3.59E-43)
            if (r10 != r11) goto L_0x01d0
            r10 = 1
            goto L_0x01d1
        L_0x01d0:
            r10 = 0
        L_0x01d1:
            r11 = r8 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r11 != r12) goto L_0x01d9
            r11 = 1
            goto L_0x01da
        L_0x01d9:
            r11 = 0
        L_0x01da:
            r10 = r10 | r11
            r9 = r9 & r8
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r9 != r11) goto L_0x01e2
            r9 = 1
            goto L_0x01e3
        L_0x01e2:
            r9 = 0
        L_0x01e3:
            r9 = r9 | r10
            r10 = r8 & 7168(0x1c00, float:1.0045E-41)
            r11 = 2048(0x800, float:2.87E-42)
            if (r10 == r11) goto L_0x01f7
            r10 = r8 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x01f5
            boolean r10 = r5.F(r4)
            if (r10 == 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r13 = 0
            goto L_0x01f8
        L_0x01f7:
            r13 = 1
        L_0x01f8:
            r9 = r9 | r13
            java.lang.Object r10 = r5.D()
            if (r9 != 0) goto L_0x0207
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x020f
        L_0x0207:
            mF.j r10 = new mF.j
            r10.<init>(r3, r2, r6, r4)
            r5.u(r10)
        L_0x020f:
            r9 = r10
            nI.a r9 = (nI.C17631a) r9
            r5.P()
            int r8 = r8 >> 6
            r12 = r8 & 896(0x380, float:1.256E-42)
            r13 = 0
            r8 = r0
            r10 = r15
            r11 = r5
            mF.C14794b.b(r8, r9, r10, r11, r12, r13)
            r5.P()
        L_0x0223:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x022c
            U0.C4895p.R()
        L_0x022c:
            r13 = r15
        L_0x022d:
            U0.Y0 r9 = r5.n()
            if (r9 == 0) goto L_0x024b
            mF.k r10 = new mF.k
            r0 = r10
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r13
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x024b:
            return
        L_0x024c:
            r0 = -1287449352(0xffffffffb34314f8, float:-4.5421046E-8)
            r5.W(r0)
            r5.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mF.m.e(nF.b, com.sugarcube.app.base.data.analytics.OpeningSource, UE.a, com.sugarcube.app.base.external.entrypoint.TrackEntryPointUseCase, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C13733a aVar, OpeningSource openingSource, C17642l lVar, TrackEntryPointUseCase trackEntryPointUseCase, C14850a aVar2) {
        Uri uri;
        UUID uuid;
        UUID uuid2;
        Destination.Capture capture;
        Destination designScene;
        Uri h10;
        C17542s.j(aVar2, "item");
        Uri uri2 = null;
        if (C17542s.e(aVar2.c(), "capture_video")) {
            uri = aVar.a(openingSource);
            capture = Destination.Capture.INSTANCE;
            uuid2 = null;
            uuid = null;
        } else {
            String e10 = aVar2.e();
            UUID e11 = e10 != null ? C14046h.e(e10) : null;
            UUID e12 = C14046h.e(aVar2.c());
            if (e12 == null || (h10 = C13733a.h(aVar, e12, e12, (OpeningSource) null, 4, (Object) null)) == null) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not a valid uuid: " + aVar2.c());
                Priority priority = Priority.ERROR;
                String message = illegalArgumentException.getMessage();
                String str = "";
                if (message == null) {
                    message = str;
                }
                String b10 = C16816g.b(illegalArgumentException);
                if (b10 != null) {
                    str = b10;
                }
                int i10 = l.f129444a[priority.ordinal()];
                if (i10 == 1) {
                    MethodHandles.lookup().lookupClass().getSimpleName();
                    String name = MethodHandles.lookup().lookupClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    Log.v(name, message + " " + str);
                } else if (i10 == 2) {
                    MethodHandles.lookup().lookupClass().getSimpleName();
                    String name2 = MethodHandles.lookup().lookupClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    Log.d(name2, message + " " + str);
                } else if (i10 == 3) {
                    MethodHandles.lookup().lookupClass().getSimpleName();
                    String name3 = MethodHandles.lookup().lookupClass().getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    Log.i(name3, message + " " + str);
                } else if (i10 == 4) {
                    MethodHandles.lookup().lookupClass().getSimpleName();
                    String name4 = MethodHandles.lookup().lookupClass().getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    Log.w(name4, message + " " + str);
                } else if (i10 == 5) {
                    MethodHandles.lookup().lookupClass().getSimpleName();
                    String name5 = MethodHandles.lookup().lookupClass().getName();
                    C17542s.g(name5);
                    String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o16.length() != 0) {
                        name5 = C15854t.P0(o16, "Kt");
                    }
                    Log.e(name5, message + " " + str);
                } else {
                    throw new t();
                }
            } else {
                uri2 = h10;
            }
            if (e11 != null) {
                String uuid3 = e11.toString();
                C17542s.i(uuid3, "toString(...)");
                designScene = new Destination.DesignComposition(uuid3);
            } else {
                designScene = new Destination.DesignScene(String.valueOf(e12));
            }
            capture = designScene;
            uuid = e11;
            uri = uri2;
            uuid2 = e12;
        }
        if (uri != null) {
            lVar.invoke(uri);
            trackEntryPointUseCase.execute(openingSource, EntryType.ShowroomCarousel.INSTANCE, capture, uuid2, uuid, uri.toString());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C13733a aVar, OpeningSource openingSource, C17642l lVar, TrackEntryPointUseCase trackEntryPointUseCase) {
        Uri c10 = C13733a.c(aVar, openingSource, (h) null, 2, (Object) null);
        lVar.invoke(c10);
        TrackEntryPointUseCase.a.a(trackEntryPointUseCase, openingSource, EntryType.ShowroomCarousel.INSTANCE, Destination.KreativHome.INSTANCE, (UUID) null, (UUID) null, c10.toString(), 24, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C13733a aVar, OpeningSource openingSource, C17642l lVar, TrackEntryPointUseCase trackEntryPointUseCase) {
        Uri c10 = C13733a.c(aVar, openingSource, (h) null, 2, (Object) null);
        lVar.invoke(c10);
        TrackEntryPointUseCase.a.a(trackEntryPointUseCase, openingSource, EntryType.BrandVideo.INSTANCE, Destination.KreativHome.INSTANCE, (UUID) null, (UUID) null, c10.toString(), 24, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C14851b bVar, OpeningSource openingSource, C13733a aVar, TrackEntryPointUseCase trackEntryPointUseCase, d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        e(bVar, openingSource, aVar, trackEntryPointUseCase, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
