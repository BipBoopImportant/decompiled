package com.sugarcube.app.base.debug;

import B0.A;
import E1.I;
import G1.C4504g;
import H0.C4545x;
import HJ.C15854t;
import I0.B;
import I0.C4556f;
import I0.L0;
import I0.Q0;
import I0.S0;
import I0.b1;
import L1.i;
import N1.P;
import N1.Y;
import RE.C13530h;
import RE.C13531i;
import RE.C13532j;
import RE.C13533k;
import RE.C13534l;
import RE.C13535m;
import RE.C13537o;
import RE.C13540s;
import RE.C13541t;
import RE.H;
import RE.L;
import RE.N;
import RE.O;
import RE.r;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import T1.C4855y;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import VE.C13759a;
import XH.C16807N;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.o;
import androidx.compose.ui.d;
import androidx.lifecycle.K;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.feature.ConfigItem;
import com.sugarcube.app.base.data.feature.ConfigState;
import com.sugarcube.app.base.debug.a;
import com.sugarcube.app.base.debug.b;
import com.sugarcube.common.R;
import dI.C17168i;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.M;
import m1.C5571a;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import r0.m;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;
import t1.C5942c;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u001a\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010 \u001a\u00020\u00022\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!\u001aA\u0010%\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\"2\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001e0#2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b%\u0010&\u001a=\u0010'\u001a\u00020\u00022\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\f\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010!\u001aC\u0010*\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020(2\u0016\u0010$\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020)\u0018\u00010\u001e0#2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010+\u001aA\u0010-\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020,2\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001e0#2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010.\u001aA\u00100\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020/2\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001e0#2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b0\u00101\u001aA\u00104\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u0002022\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000203\u0018\u00010\u001e0#2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b4\u00105\u001aA\u00108\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u0002062\u0014\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u00010\u001e0#2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b8\u00109\u001a+\u0010;\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020:2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b;\u0010<\u001aE\u0010@\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\b@\u0010A¨\u0006F²\u0006\u000e\u0010B\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010C\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010D\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010E\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010E\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010E\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010E\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010E\u001a\u00020\u00108\n@\nX\u0002²\u0006\u000e\u0010E\u001a\u00020\u00108\n@\nX\u0002"}, d2 = {"Lcom/sugarcube/app/base/debug/b$f;", "uiItem", "LXH/N;", "s0", "(Lcom/sugarcube/app/base/debug/b$f;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$e;", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/debug/a;", "onAction", "p0", "(Lcom/sugarcube/app/base/debug/b$e;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$a;", "appVersion", "R", "(Lcom/sugarcube/app/base/debug/b$a;LnI/l;LU0/m;I)V", "Landroidx/lifecycle/K;", "", "recommendKillApp", "f1", "(Landroidx/lifecycle/K;LnI/l;LU0/m;I)V", "Lkotlin/Function0;", "onDismissRequest", "onConfirmation", "", "message", "confirm", "W", "(LnI/a;LnI/a;Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "configItem", "Lcom/sugarcube/app/base/data/feature/ConfigState;", "configState", "u0", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;Lcom/sugarcube/app/base/data/feature/ConfigState;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$b;", "LU0/A1;", "state", "T", "(Lcom/sugarcube/app/base/debug/b$b;LU0/A1;LnI/l;LU0/m;I)V", "I0", "Lcom/sugarcube/app/base/debug/b$h;", "Lcom/sugarcube/app/base/data/feature/ConfigItem$ObjectListValue;", "K0", "(Lcom/sugarcube/app/base/debug/b$h;LU0/A1;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$i;", "R0", "(Lcom/sugarcube/app/base/debug/b$i;LU0/A1;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$j;", "Y0", "(Lcom/sugarcube/app/base/debug/b$j;LU0/A1;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$g;", "Ljava/lang/Integer;", "B0", "(Lcom/sugarcube/app/base/debug/b$g;LU0/A1;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$c;", "", "Z", "(Lcom/sugarcube/app/base/debug/b$c;LU0/A1;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/debug/b$d;", "j0", "(Lcom/sugarcube/app/base/debug/b$d;LnI/l;LU0/m;I)V", "text", "LT1/y;", "keyboardType", "g0", "(Ljava/lang/String;LnI/a;LnI/l;LT1/y;LU0/m;II)V", "confirmKill", "confirmClear", "dialogOpen", "expanded", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f122991a;

        a(b.a aVar) {
            this.f122991a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(168667736, i11, -1, "com.sugarcube.app.base.debug.AppVersionSection.<anonymous> (DebugComposable.kt:128)");
                }
                b.a aVar = this.f122991a;
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, aVar2);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                d.a aVar4 = aVar2;
                b.a aVar5 = aVar;
                b1.b("Versions", (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(mVar2, C18030v.f147665b).c().c(), mVar, 6, 0, 65534);
                String a14 = aVar5.a();
                String str = aVar5.c() ? " (debug)" : "";
                C4889m mVar3 = mVar;
                b1.b(a14 + str, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar3, 0, 0, 131070);
                b1.b(aVar5.e(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar3, 0, 0, 131070);
                b1.b(aVar5.d(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar3, 0, 0, 131070);
                b1.b(aVar5.b(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar3, 0, 0, 131070);
                C5844O.a(J.i(aVar4, c2.h.B((float) 12)), mVar, 6);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f122992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f122993b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f122994a;

            a(String str) {
                this.f122994a = str;
            }

            public final void a(C5842M m10, C4889m mVar, int i10) {
                int i11 = i10;
                C17542s.j(m10, "$this$TextButton");
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-318163680, i11, -1, "com.sugarcube.app.base.debug.ConfirmDialog.<anonymous>.<anonymous> (DebugComposable.kt:281)");
                    }
                    b1.b(this.f122994a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        b(C17631a<C16807N> aVar, String str) {
            this.f122992a = aVar;
            this.f122993b = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17631a aVar) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r15, int r16) {
            /*
                r14 = this;
                r0 = r14
                r11 = r15
                r1 = r16
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0014
                boolean r2 = r15.l()
                if (r2 != 0) goto L_0x0010
                goto L_0x0014
            L_0x0010:
                r15.L()
                goto L_0x0077
            L_0x0014:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0023
                r2 = -1
                java.lang.String r3 = "com.sugarcube.app.base.debug.ConfirmDialog.<anonymous> (DebugComposable.kt:276)"
                r4 = 532612541(0x1fbf05bd, float:8.090114E-20)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0023:
                r1 = 947355492(0x38777f64, float:5.900803E-5)
                r15.W(r1)
                nI.a<XH.N> r1 = r0.f122992a
                boolean r1 = r15.V(r1)
                nI.a<XH.N> r2 = r0.f122992a
                java.lang.Object r3 = r15.D()
                if (r1 != 0) goto L_0x003f
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0047
            L_0x003f:
                com.sugarcube.app.base.debug.d r3 = new com.sugarcube.app.base.debug.d
                r3.<init>(r2)
                r15.u(r3)
            L_0x0047:
                r1 = r3
                nI.a r1 = (nI.C17631a) r1
                r15.P()
                com.sugarcube.app.base.debug.c$b$a r2 = new com.sugarcube.app.base.debug.c$b$a
                java.lang.String r3 = r0.f122993b
                r2.<init>(r3)
                r3 = 54
                r4 = -318163680(0xffffffffed093520, float:-2.6539794E27)
                r5 = 1
                c1.a r10 = c1.c.e(r4, r5, r2, r15, r3)
                r12 = 805306368(0x30000000, float:4.656613E-10)
                r13 = 510(0x1fe, float:7.15E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = r15
                I0.C4564j.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0077
                U0.C4895p.R()
            L_0x0077:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.b.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.debug.c$c  reason: collision with other inner class name */
    static final class C3028c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f122995a;

        C3028c(C17631a<C16807N> aVar) {
            this.f122995a = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17631a aVar) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r15, int r16) {
            /*
                r14 = this;
                r0 = r14
                r11 = r15
                r1 = r16
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0014
                boolean r2 = r15.l()
                if (r2 != 0) goto L_0x0010
                goto L_0x0014
            L_0x0010:
                r15.L()
                goto L_0x006c
            L_0x0014:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0023
                r2 = -1
                java.lang.String r3 = "com.sugarcube.app.base.debug.ConfirmDialog.<anonymous> (DebugComposable.kt:285)"
                r4 = 821431931(0x30f60e7b, float:1.7902971E-9)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0023:
                r1 = 947362054(0x38779906, float:5.9031903E-5)
                r15.W(r1)
                nI.a<XH.N> r1 = r0.f122995a
                boolean r1 = r15.V(r1)
                nI.a<XH.N> r2 = r0.f122995a
                java.lang.Object r3 = r15.D()
                if (r1 != 0) goto L_0x003f
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0047
            L_0x003f:
                com.sugarcube.app.base.debug.e r3 = new com.sugarcube.app.base.debug.e
                r3.<init>(r2)
                r15.u(r3)
            L_0x0047:
                r1 = r3
                nI.a r1 = (nI.C17631a) r1
                r15.P()
                RE.a r2 = RE.C13523a.f115465a
                nI.q r10 = r2.d()
                r12 = 805306368(0x30000000, float:4.656613E-10)
                r13 = 510(0x1fe, float:7.15E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = r15
                I0.C4564j.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x006c
                U0.C4895p.R()
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.C3028c.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f122996a;

        d(String str) {
            this.f122996a = str;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(965841626, i11, -1, "com.sugarcube.app.base.debug.ConfirmDialog.<anonymous> (DebugComposable.kt:270)");
                }
                b1.b(this.f122996a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<T1.P> f122997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f122998b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f122999c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f123000d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4899r0<T1.P> f123001a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ A f123002b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f123003c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<String, C16807N> f123004d;

            a(C4899r0<T1.P> r0Var, A a10, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar) {
                this.f123001a = r0Var;
                this.f123002b = a10;
                this.f123003c = aVar;
                this.f123004d = lVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(C4899r0 r0Var, T1.P p10) {
                C17542s.j(p10, "it");
                r0Var.setValue(p10);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N h(C17631a aVar) {
                aVar.invoke();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N i(C17642l lVar, C4899r0 r0Var) {
                lVar.invoke(((T1.P) r0Var.getValue()).i());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: nI.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void e(U0.C4889m r36, int r37) {
                /*
                    r35 = this;
                    r0 = r35
                    r13 = r36
                    r1 = r37
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0017
                    boolean r2 = r36.l()
                    if (r2 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r36.L()
                    goto L_0x022c
                L_0x0017:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0026
                    r2 = -1
                    java.lang.String r3 = "com.sugarcube.app.base.debug.EditTextDialog.<anonymous>.<anonymous> (DebugComposable.kt:754)"
                    r4 = -1612742876(0xffffffff9fdf7f24, float:-9.465451E-20)
                    U0.C4895p.S(r4, r1, r2, r3)
                L_0x0026:
                    U0.r0<T1.P> r3 = r0.f123001a
                    B0.A r1 = r0.f123002b
                    nI.a<XH.N> r15 = r0.f123003c
                    nI.l<java.lang.String, XH.N> r14 = r0.f123004d
                    androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                    androidx.compose.foundation.layout.d r25 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r2 = r25.g()
                    i1.c$a r26 = i1.C5437c.f24302a
                    i1.c$b r4 = r26.k()
                    r11 = 0
                    E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r4, r13, r11)
                    int r4 = U0.C4883j.a(r13, r11)
                    U0.y r5 = r36.s()
                    androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r13, r12)
                    G1.g$a r27 = G1.C4504g.f6515W
                    nI.a r7 = r27.a()
                    U0.f r8 = r36.m()
                    if (r8 != 0) goto L_0x005c
                    U0.C4883j.c()
                L_0x005c:
                    r36.I()
                    boolean r8 = r36.i()
                    if (r8 == 0) goto L_0x0069
                    r13.p(r7)
                    goto L_0x006c
                L_0x0069:
                    r36.t()
                L_0x006c:
                    U0.m r7 = U0.F1.a(r36)
                    nI.p r8 = r27.c()
                    U0.F1.c(r7, r2, r8)
                    nI.p r2 = r27.e()
                    U0.F1.c(r7, r5, r2)
                    nI.p r2 = r27.b()
                    boolean r5 = r7.i()
                    if (r5 != 0) goto L_0x0096
                    java.lang.Object r5 = r7.D()
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
                    if (r5 != 0) goto L_0x00a4
                L_0x0096:
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                    r7.u(r5)
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r7.w(r4, r2)
                L_0x00a4:
                    nI.p r2 = r27.d()
                    U0.F1.c(r7, r6, r2)
                    s0.h r2 = s0.C5862h.f28810a
                    java.lang.Object r2 = r3.getValue()
                    r21 = r2
                    T1.P r21 = (T1.P) r21
                    if (r1 != 0) goto L_0x00bd
                    B0.A$a r1 = B0.A.f4480g
                    B0.A r1 = r1.a()
                L_0x00bd:
                    r28 = r1
                    r1 = 0
                    r10 = 1
                    r9 = 0
                    androidx.compose.ui.d r29 = androidx.compose.foundation.layout.J.h(r12, r1, r10, r9)
                    r2 = 125205808(0x7767d30, float:1.8543772E-34)
                    r13.W(r2)
                    java.lang.Object r2 = r36.D()
                    U0.m$a r30 = U0.C4889m.f14007a
                    java.lang.Object r4 = r30.a()
                    if (r2 != r4) goto L_0x00e0
                    com.sugarcube.app.base.debug.f r2 = new com.sugarcube.app.base.debug.f
                    r2.<init>(r3)
                    r13.u(r2)
                L_0x00e0:
                    nI.l r2 = (nI.C17642l) r2
                    r36.P()
                    r23 = 0
                    r24 = 1044472(0xfeff8, float:1.463617E-39)
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r16 = 0
                    r9 = r16
                    r10 = r16
                    r16 = 0
                    r11 = r16
                    r16 = 0
                    r31 = r12
                    r12 = r16
                    r32 = r14
                    r14 = r16
                    r16 = 0
                    r33 = r15
                    r15 = r16
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r22 = 432(0x1b0, float:6.05E-43)
                    r1 = r21
                    r34 = r3
                    r3 = r29
                    r13 = r28
                    r21 = r36
                    I0.X0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                    r1 = r31
                    r2 = 0
                    r3 = 1
                    r4 = 0
                    androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r2, r3, r4)
                    androidx.compose.foundation.layout.d$e r2 = r25.c()
                    i1.c$c r3 = r26.l()
                    r4 = 6
                    r14 = r36
                    E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r14, r4)
                    r3 = 0
                    int r3 = U0.C4883j.a(r14, r3)
                    U0.y r4 = r36.s()
                    androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r14, r1)
                    nI.a r5 = r27.a()
                    U0.f r6 = r36.m()
                    if (r6 != 0) goto L_0x0152
                    U0.C4883j.c()
                L_0x0152:
                    r36.I()
                    boolean r6 = r36.i()
                    if (r6 == 0) goto L_0x015f
                    r14.p(r5)
                    goto L_0x0162
                L_0x015f:
                    r36.t()
                L_0x0162:
                    U0.m r5 = U0.F1.a(r36)
                    nI.p r6 = r27.c()
                    U0.F1.c(r5, r2, r6)
                    nI.p r2 = r27.e()
                    U0.F1.c(r5, r4, r2)
                    nI.p r2 = r27.b()
                    boolean r4 = r5.i()
                    if (r4 != 0) goto L_0x018c
                    java.lang.Object r4 = r5.D()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
                    if (r4 != 0) goto L_0x019a
                L_0x018c:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                    r5.u(r4)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r5.w(r3, r2)
                L_0x019a:
                    nI.p r2 = r27.d()
                    U0.F1.c(r5, r1, r2)
                    s0.N r1 = s0.C5843N.f28726a
                    r1 = -1082055565(0xffffffffbf812473, float:-1.0089248)
                    r14.W(r1)
                    r1 = r33
                    boolean r2 = r14.V(r1)
                    java.lang.Object r3 = r36.D()
                    if (r2 != 0) goto L_0x01bb
                    java.lang.Object r2 = r30.a()
                    if (r3 != r2) goto L_0x01c3
                L_0x01bb:
                    com.sugarcube.app.base.debug.g r3 = new com.sugarcube.app.base.debug.g
                    r3.<init>(r1)
                    r14.u(r3)
                L_0x01c3:
                    r1 = r3
                    nI.a r1 = (nI.C17631a) r1
                    r36.P()
                    RE.a r15 = RE.C13523a.f115465a
                    nI.q r10 = r15.e()
                    r12 = 805306368(0x30000000, float:4.656613E-10)
                    r13 = 510(0x1fe, float:7.15E-43)
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r11 = r36
                    I0.C4564j.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    r1 = -1082051226(0xffffffffbf813566, float:-1.0094421)
                    r14.W(r1)
                    r1 = r32
                    boolean r2 = r14.V(r1)
                    java.lang.Object r3 = r36.D()
                    if (r2 != 0) goto L_0x01f8
                    java.lang.Object r2 = r30.a()
                    if (r3 != r2) goto L_0x0202
                L_0x01f8:
                    com.sugarcube.app.base.debug.h r3 = new com.sugarcube.app.base.debug.h
                    r2 = r34
                    r3.<init>(r1, r2)
                    r14.u(r3)
                L_0x0202:
                    r1 = r3
                    nI.a r1 = (nI.C17631a) r1
                    r36.P()
                    nI.q r10 = r15.f()
                    r12 = 805306368(0x30000000, float:4.656613E-10)
                    r13 = 510(0x1fe, float:7.15E-43)
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r11 = r36
                    I0.C4564j.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    r36.x()
                    r36.x()
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x022c
                    U0.C4895p.R()
                L_0x022c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.e.a.e(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                e((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        e(C4899r0<T1.P> r0Var, A a10, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar) {
            this.f122997a = r0Var;
            this.f122998b = a10;
            this.f122999c = aVar;
            this.f123000d = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(361196256, i10, -1, "com.sugarcube.app.base.debug.EditTextDialog.<anonymous> (DebugComposable.kt:749)");
                }
                L0.a(D.i(androidx.compose.ui.d.f18749a, c2.h.B((float) 8)), A0.g.e(c2.h.B((float) 4)), C5747v0.f27350b.j(), 0, (C5601g) null, 0.0f, c1.c.e(-1612742876, true, new a(this.f122997a, this.f122998b, this.f122999c, this.f123000d), mVar, 54), mVar, 1573254, 56);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.d f123005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ M f123006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<a, C16807N> f123007c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f123008d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C13759a f123009a;

            a(C13759a aVar) {
                this.f123009a = aVar;
            }

            public final void a(C5842M m10, C4889m mVar, int i10) {
                int i11 = i10;
                C17542s.j(m10, "$this$DropdownMenuItem");
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1832756248, i11, -1, "com.sugarcube.app.base.debug.EnvironmentSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugComposable.kt:705)");
                    }
                    b1.b(this.f123009a.e(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        f(b.d dVar, M m10, C17642l<? super a, C16807N> lVar, C4899r0<Boolean> r0Var) {
            this.f123005a = dVar;
            this.f123006b = m10;
            this.f123007c = lVar;
            this.f123008d = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(M m10, int i10, C17642l lVar, C13759a aVar, C4899r0 r0Var) {
            m10.f144346a = i10;
            c.l0(r0Var, false);
            lVar.invoke(new a.e(aVar));
            return C16807N.f139792a;
        }

        public final void b(C5861g gVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(gVar, "$this$DropdownMenu");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(646888289, i11, -1, "com.sugarcube.app.base.debug.EnvironmentSelector.<anonymous>.<anonymous> (DebugComposable.kt:695)");
                }
                M m10 = this.f123006b;
                C17642l<a, C16807N> lVar = this.f123007c;
                C4899r0<Boolean> r0Var = this.f123008d;
                int i12 = 0;
                for (Object next : this.f123005a.b()) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    C13759a aVar = (C13759a) next;
                    C4556f.b(new i(m10, i12, lVar, aVar, r0Var), (androidx.compose.ui.d) null, false, (C5834E) null, (m) null, c1.c.e(1832756248, true, new a(aVar), mVar, 54), mVar, ImageMetadata.EDGE_MODE, 30);
                    i12 = i13;
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<ConfigItem.ObjectListValue> f123010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ M f123011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<a, C16807N> f123012c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.h f123013d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f123014e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ConfigItem.ObjectListValue f123015a;

            a(ConfigItem.ObjectListValue objectListValue) {
                this.f123015a = objectListValue;
            }

            public final void a(C5842M m10, C4889m mVar, int i10) {
                int i11 = i10;
                C17542s.j(m10, "$this$DropdownMenuItem");
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(886182851, i11, -1, "com.sugarcube.app.base.debug.ObjectDropDown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugComposable.kt:451)");
                    }
                    b1.b(this.f123015a.getName(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        g(List<? extends ConfigItem.ObjectListValue> list, M m10, C17642l<? super a, C16807N> lVar, b.h hVar, C4899r0<Boolean> r0Var) {
            this.f123010a = list;
            this.f123011b = m10;
            this.f123012c = lVar;
            this.f123013d = hVar;
            this.f123014e = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(M m10, int i10, C17642l lVar, b.h hVar, C4899r0 r0Var) {
            m10.f144346a = i10;
            c.N0(r0Var, false);
            lVar.invoke(new a.g(hVar.a(), hVar.a().possibleConfigObjects().get(i10)));
            return C16807N.f139792a;
        }

        public final void b(C5861g gVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(gVar, "$this$DropdownMenu");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(37314189, i11, -1, "com.sugarcube.app.base.debug.ObjectDropDown.<anonymous>.<anonymous> (DebugComposable.kt:438)");
                }
                M m10 = this.f123011b;
                C17642l<a, C16807N> lVar = this.f123012c;
                b.h hVar = this.f123013d;
                C4899r0<Boolean> r0Var = this.f123014e;
                int i12 = 0;
                for (Object next : this.f123010a) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    C4556f.b(new j(m10, i12, lVar, hVar, r0Var), (androidx.compose.ui.d) null, false, (C5834E) null, (m) null, c1.c.e(886182851, true, new a((ConfigItem.ObjectListValue) next), mVar, 54), mVar, ImageMetadata.EDGE_MODE, 30);
                    i12 = i13;
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<String> f123016a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ M f123017b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<a, C16807N> f123018c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.i f123019d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f123020e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5842M, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f123021a;

            a(String str) {
                this.f123021a = str;
            }

            public final void a(C5842M m10, C4889m mVar, int i10) {
                int i11 = i10;
                C17542s.j(m10, "$this$DropdownMenuItem");
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-379988496, i11, -1, "com.sugarcube.app.base.debug.StringDropDown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DebugComposable.kt:516)");
                    }
                    b1.b(this.f123021a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar, 0, 0, 131070);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        h(List<String> list, M m10, C17642l<? super a, C16807N> lVar, b.i iVar, C4899r0<Boolean> r0Var) {
            this.f123016a = list;
            this.f123017b = m10;
            this.f123018c = lVar;
            this.f123019d = iVar;
            this.f123020e = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(M m10, int i10, C17642l lVar, b.i iVar, C4899r0 r0Var) {
            m10.f144346a = i10;
            c.U0(r0Var, false);
            lVar.invoke(new a.g(iVar.a(), iVar.a().getPossibleValues().get(i10)));
            return C16807N.f139792a;
        }

        public final void b(C5861g gVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(gVar, "$this$DropdownMenu");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(458231885, i11, -1, "com.sugarcube.app.base.debug.StringDropDown.<anonymous>.<anonymous> (DebugComposable.kt:503)");
                }
                M m10 = this.f123017b;
                C17642l<a, C16807N> lVar = this.f123018c;
                b.i iVar = this.f123019d;
                C4899r0<Boolean> r0Var = this.f123020e;
                int i12 = 0;
                for (Object next : this.f123016a) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C16877v.x();
                    }
                    C4556f.b(new k(m10, i12, lVar, iVar, r0Var), (androidx.compose.ui.d) null, false, (C5834E) null, (m) null, c1.c.e(-379988496, true, new a((String) next), mVar, 54), mVar, ImageMetadata.EDGE_MODE, 30);
                    i12 = i13;
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A0(ConfigItem configItem, ConfigState configState, C17642l lVar, int i10, C4889m mVar, int i11) {
        u0(configItem, configState, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void B0(com.sugarcube.app.base.debug.b.g r35, U0.A1<com.sugarcube.app.base.data.feature.ConfigState<java.lang.Integer>> r36, nI.C17642l<? super com.sugarcube.app.base.debug.a, XH.C16807N> r37, U0.C4889m r38, int r39) {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r39
            java.lang.String r4 = "uiItem"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onAction"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = 1878622721(0x6ff98201, float:1.54437865E29)
            r5 = r38
            U0.m r5 = r5.k(r4)
            r6 = r3 & 6
            r7 = 2
            if (r6 != 0) goto L_0x0030
            boolean r6 = r5.F(r0)
            if (r6 == 0) goto L_0x002d
            r6 = 4
            goto L_0x002e
        L_0x002d:
            r6 = r7
        L_0x002e:
            r6 = r6 | r3
            goto L_0x0031
        L_0x0030:
            r6 = r3
        L_0x0031:
            r8 = r3 & 48
            if (r8 != 0) goto L_0x0041
            boolean r8 = r5.V(r1)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r6 = r6 | r8
        L_0x0041:
            r8 = r3 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0051
            boolean r8 = r5.F(r2)
            if (r8 == 0) goto L_0x004e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r6 = r6 | r8
        L_0x0051:
            r8 = r6 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0064
            boolean r8 = r5.l()
            if (r8 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r5.L()
            r12 = r5
            goto L_0x02e1
        L_0x0064:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0070
            r8 = -1
            java.lang.String r9 = "com.sugarcube.app.base.debug.IntegerEditor (DebugComposable.kt:577)"
            U0.C4895p.S(r4, r6, r8, r9)
        L_0x0070:
            java.lang.Object r4 = r36.getValue()
            com.sugarcube.app.base.data.feature.ConfigState r4 = (com.sugarcube.app.base.data.feature.ConfigState) r4
            r8 = 0
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r4.getCurrentValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L_0x0081
        L_0x0080:
            r4 = r8
        L_0x0081:
            if (r4 == 0) goto L_0x008d
            java.lang.String r9 = r4.toString()
            if (r9 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            r30 = r9
            goto L_0x0090
        L_0x008d:
            java.lang.String r9 = ""
            goto L_0x008a
        L_0x0090:
            r9 = -1194771822(0xffffffffb8c93a92, float:-9.5953365E-5)
            r5.W(r9)
            java.lang.Object r9 = r5.D()
            U0.m$a r31 = U0.C4889m.f14007a
            java.lang.Object r10 = r31.a()
            if (r9 != r10) goto L_0x00ab
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            U0.r0 r9 = U0.u1.e(r9, r8, r7, r8)
            r5.u(r9)
        L_0x00ab:
            r15 = r9
            U0.r0 r15 = (U0.C4899r0) r15
            r5.P()
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r16.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r8 = r17.k()
            r12 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r8, r5, r12)
            int r8 = U0.C4883j.a(r5, r12)
            U0.y r9 = r5.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r5, r13)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r11 = r18.a()
            U0.f r19 = r5.m()
            if (r19 != 0) goto L_0x00df
            U0.C4883j.c()
        L_0x00df:
            r5.I()
            boolean r19 = r5.i()
            if (r19 == 0) goto L_0x00ec
            r5.p(r11)
            goto L_0x00ef
        L_0x00ec:
            r5.t()
        L_0x00ef:
            U0.m r11 = U0.F1.a(r5)
            nI.p r12 = r18.c()
            U0.F1.c(r11, r7, r12)
            nI.p r7 = r18.e()
            U0.F1.c(r11, r9, r7)
            nI.p r7 = r18.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x0119
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x0127
        L_0x0119:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r7)
        L_0x0127:
            nI.p r7 = r18.d()
            U0.F1.c(r11, r10, r7)
            s0.h r7 = s0.C5862h.f28810a
            r7 = 8
            float r7 = (float) r7
            float r9 = c2.h.B(r7)
            float r11 = c2.h.B(r7)
            r12 = 5
            r19 = 0
            r8 = 0
            r10 = 0
            r7 = r13
            r14 = 0
            r21 = r13
            r13 = r19
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.foundation.layout.d$e r8 = r16.f()
            i1.c$c r9 = r17.l()
            E1.I r8 = androidx.compose.foundation.layout.G.b(r8, r9, r5, r14)
            int r9 = U0.C4883j.a(r5, r14)
            U0.y r10 = r5.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r5, r7)
            nI.a r11 = r18.a()
            U0.f r12 = r5.m()
            if (r12 != 0) goto L_0x016f
            U0.C4883j.c()
        L_0x016f:
            r5.I()
            boolean r12 = r5.i()
            if (r12 == 0) goto L_0x017c
            r5.p(r11)
            goto L_0x017f
        L_0x017c:
            r5.t()
        L_0x017f:
            U0.m r11 = U0.F1.a(r5)
            nI.p r12 = r18.c()
            U0.F1.c(r11, r8, r12)
            nI.p r8 = r18.e()
            U0.F1.c(r11, r10, r8)
            nI.p r8 = r18.b()
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x01a9
            java.lang.Object r10 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x01b7
        L_0x01a9:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.w(r9, r8)
        L_0x01b7:
            nI.p r8 = r18.d()
            U0.F1.c(r11, r7, r8)
            s0.N r7 = s0.C5843N.f28726a
            com.sugarcube.app.base.data.feature.ConfigItem r8 = r35.a()
            java.lang.Object r9 = r36.getValue()
            com.sugarcube.app.base.data.feature.ConfigState r9 = (com.sugarcube.app.base.data.feature.ConfigState) r9
            r6 = r6 & 896(0x380, float:1.256E-42)
            I0(r8, r9, r2, r5, r6)
            r11 = 2
            r12 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8 = r21
            androidx.compose.ui.d r7 = s0.C5842M.e(r7, r8, r9, r10, r11, r12)
            s0.C5844O.a(r7, r5, r14)
            r7 = 86551528(0x528abe8, float:7.930896E-36)
            r5.W(r7)
            if (r4 != 0) goto L_0x01ee
            r34 = r5
            r32 = r6
            r33 = r14
            r38 = r15
            goto L_0x0259
        L_0x01ee:
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r4, r7)
            r7 = 1851989184(0x6e631cc0, float:1.7571963E28)
            r5.W(r7)
            java.lang.Object r7 = r5.D()
            java.lang.Object r8 = r31.a()
            if (r7 != r8) goto L_0x020f
            RE.c r7 = new RE.c
            r7.<init>(r15)
            r5.u(r7)
        L_0x020f:
            r11 = r7
            nI.a r11 = (nI.C17631a) r11
            r5.P()
            r12 = 7
            r13 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r21
            androidx.compose.ui.d r7 = androidx.compose.foundation.d.d(r7, r8, r9, r10, r11, r12, r13)
            r13 = r6
            r6 = r7
            r28 = 0
            r29 = 131068(0x1fffc, float:1.83665E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r32 = r13
            r13 = r16
            r16 = 0
            r33 = r14
            r38 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r34 = r5
            r5 = r4
            r26 = r34
            I0.b1.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            XH.N r4 = XH.C16807N.f139792a
        L_0x0259:
            r34.P()
            r34.x()
            r4 = -351131810(0xffffffffeb12275e, float:-1.7668908E26)
            r12 = r34
            r12.W(r4)
            boolean r4 = C0(r38)
            if (r4 == 0) goto L_0x02d2
            r4 = -351128189(0xffffffffeb123583, float:-1.7675587E26)
            r12.W(r4)
            java.lang.Object r4 = r12.D()
            java.lang.Object r5 = r31.a()
            if (r4 != r5) goto L_0x0288
            RE.n r4 = new RE.n
            r9 = r38
            r4.<init>(r9)
            r12.u(r4)
            goto L_0x028a
        L_0x0288:
            r9 = r38
        L_0x028a:
            r6 = r4
            nI.a r6 = (nI.C17631a) r6
            r12.P()
            r4 = -351126183(0xffffffffeb123d59, float:-1.7679288E26)
            r12.W(r4)
            r5 = r32
            r4 = 256(0x100, float:3.59E-43)
            if (r5 != r4) goto L_0x029f
            r4 = 1
            r33 = r4
        L_0x029f:
            boolean r4 = r12.F(r0)
            r4 = r33 | r4
            java.lang.Object r5 = r12.D()
            if (r4 != 0) goto L_0x02b1
            java.lang.Object r4 = r31.a()
            if (r5 != r4) goto L_0x02b9
        L_0x02b1:
            RE.y r5 = new RE.y
            r5.<init>(r9, r2, r0)
            r12.u(r5)
        L_0x02b9:
            r7 = r5
            nI.l r7 = (nI.C17642l) r7
            r12.P()
            T1.y$a r4 = T1.C4855y.f13650b
            int r4 = r4.d()
            T1.y r8 = T1.C4855y.k(r4)
            r10 = 3120(0xc30, float:4.372E-42)
            r11 = 0
            r5 = r30
            r9 = r12
            g0(r5, r6, r7, r8, r9, r10, r11)
        L_0x02d2:
            r12.P()
            r12.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x02e1
            U0.C4895p.R()
        L_0x02e1:
            U0.Y0 r4 = r12.n()
            if (r4 == 0) goto L_0x02ef
            RE.J r5 = new RE.J
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x02ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.B0(com.sugarcube.app.base.debug.b$g, U0.A1, nI.l, U0.m, int):void");
    }

    private static final boolean C0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void D0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(C4899r0 r0Var) {
        D0(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F0(C4899r0 r0Var) {
        D0(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G0(C4899r0 r0Var, C17642l lVar, b.g gVar, String str) {
        C17542s.j(str, "newValue");
        D0(r0Var, false);
        Integer t10 = C15854t.t(str);
        if (t10 != null) {
            lVar.invoke(new a.g(gVar.a(), Integer.valueOf(t10.intValue())));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H0(b.g gVar, A1 a12, C17642l lVar, int i10, C4889m mVar, int i11) {
        B0(gVar, a12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void I0(ConfigItem<?> configItem, ConfigState<?> configState, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        ConfigItem<?> configItem2 = configItem;
        ConfigState<?> configState2 = configState;
        C17642l<? super a, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(configItem2, "configItem");
        C17542s.j(lVar2, "onAction");
        C4889m k10 = mVar.k(-903594123);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(configItem2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(configState2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-903594123, i13, -1, "com.sugarcube.app.base.debug.LabelBlock (DebugComposable.kt:386)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            String localKey = configItem.getMeta().getLocalKey();
            C18030v vVar = C18030v.f147664a;
            int i14 = C18030v.f147665b;
            int i15 = i14;
            C4889m mVar3 = k10;
            int i16 = i13;
            b1.b(localKey, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, C.f13316b.a(), (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(k10, i14).a().b(), mVar3, ImageMetadata.EDGE_MODE, 0, 65502);
            String moreInfo = configItem.getMeta().getMoreInfo();
            C4889m mVar4 = mVar3;
            mVar4.W(-638935029);
            if (moreInfo == null) {
                mVar2 = mVar4;
            } else {
                String moreInfo2 = configItem.getMeta().getMoreInfo();
                Y b11 = vVar.b(mVar4, i15).a().b();
                mVar2 = mVar4;
                b1.b(moreInfo2, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, b11, mVar2, 0, 0, 65534);
            }
            mVar2.P();
            u0(configItem2, configState2, lVar2, mVar2, i16 & 1022);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new H(configItem2, configState2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(ConfigItem configItem, ConfigState configState, C17642l lVar, int i10, C4889m mVar, int i11) {
        I0(configItem, configState, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void K0(b.h hVar, A1<? extends ConfigState<? extends ConfigItem.ObjectListValue>> a12, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        b.h hVar2 = hVar;
        A1<? extends ConfigState<? extends ConfigItem.ObjectListValue>> a13 = a12;
        C17642l<? super a, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(hVar2, "uiItem");
        C17542s.j(a13, "state");
        C17542s.j(lVar2, "onAction");
        C4889m k10 = mVar.k(-1362715109);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(hVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(a13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1362715109, i11, -1, "com.sugarcube.app.base.debug.ObjectDropDown (DebugComposable.kt:409)");
            }
            ConfigState configState = (ConfigState) a12.getValue();
            ConfigItem.ObjectListValue objectListValue = configState != null ? (ConfigItem.ObjectListValue) configState.getCurrentValue() : null;
            k10.W(-61739859);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            List<ConfigItem.ObjectListValue> possibleConfigObjects = hVar.a().possibleConfigObjects();
            M m10 = new M();
            m10.f144346a = L0(hVar2, objectListValue);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            float f10 = (float) 8;
            androidx.compose.ui.d m11 = D.m(aVar2, 0.0f, c2.h.B(f10), 0.0f, c2.h.B(f10), 5, (Object) null);
            C5073d.e f11 = C5073d.f18068a.f();
            C5437c.a aVar3 = C5437c.f24302a;
            I b10 = G.b(f11, aVar3.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, m11);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, b10, aVar4.c());
            F1.c(a14, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a10))) {
                a14.u(Integer.valueOf(a10));
                a14.w(Integer.valueOf(a10), b11);
            }
            F1.c(a14, e10, aVar4.d());
            C5843N n10 = C5843N.f28726a;
            I0(hVar.a(), (ConfigState) a12.getValue(), lVar2, k10, i11 & 896);
            C5844O.a(C5842M.e(n10, aVar2, 1.0f, false, 2, (Object) null), k10, 0);
            k10.W(-1752906176);
            int i13 = m10.f144346a;
            if (i13 >= 0) {
                String name = possibleConfigObjects.get(i13).getName();
                k10.W(-1752902307);
                Object D11 = k10.D();
                if (D11 == aVar.a()) {
                    D11 = new C13534l(r0Var);
                    k10.u(D11);
                }
                k10.P();
                M m12 = m10;
                b1.b(name, androidx.compose.foundation.d.d(aVar2, false, (String) null, (i) null, (C17631a) D11, 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, k10, 0, 0, 131068);
                boolean M02 = M0(r0Var);
                k10.W(-1752897986);
                Object D12 = k10.D();
                if (D12 == aVar.a()) {
                    D12 = new C13535m(r0Var);
                    k10.u(D12);
                }
                k10.P();
                C4889m mVar3 = k10;
                mVar2 = mVar3;
                C4556f.a(M02, (C17631a) D12, J.h(aVar2, 0.0f, 1, (Object) null), 0, (o) null, (androidx.compose.ui.window.q) null, c1.c.e(37314189, true, new g(possibleConfigObjects, m12, lVar, hVar, r0Var), mVar3, 54), mVar2, 1573296, 56);
                I0.Y.a(J1.e.c(R.drawable.sc_ic_chevron_down, mVar2, 0), "Drop", J.t(D.m(n10.c(aVar2, aVar3.l()), c2.h.B((float) 6), c2.h.B((float) 5), 0.0f, 0.0f, 12, (Object) null), c2.h.B((float) 12)), 0, mVar2, 48, 8);
            } else {
                mVar2 = k10;
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C13537o(hVar2, a13, lVar2, i12));
        }
    }

    private static final int L0(b.h hVar, ConfigItem.ObjectListValue objectListValue) {
        return C16877v.B0(hVar.a().possibleConfigObjects(), objectListValue);
    }

    private static final boolean M0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void N0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(C4899r0 r0Var) {
        N0(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(C4899r0 r0Var) {
        N0(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(b.h hVar, A1 a12, C17642l lVar, int i10, C4889m mVar, int i11) {
        K0(hVar, a12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void R(b.a aVar, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "appVersion");
        C17542s.j(lVar, "onAction");
        C4889m k10 = mVar.k(1569080539);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1569080539, i11, -1, "com.sugarcube.app.base.debug.AppVersionSection (DebugComposable.kt:126)");
            }
            C4545x.b((androidx.compose.ui.d) null, c1.c.e(168667736, true, new a(aVar), k10, 54), k10, 48, 1);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            float f10 = (float) 12;
            C5844O.a(J.i(aVar2, c2.h.B(f10)), k10, 6);
            B.a((androidx.compose.ui.d) null, C18030v.f147664a.a(k10, C18030v.f147665b).m0(), c2.h.B((float) 1), 0.0f, k10, 384, 9);
            C5844O.a(J.i(aVar2, c2.h.B(f10)), k10, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13530h(aVar, lVar, i10));
        }
    }

    public static final void R0(b.i iVar, A1<ConfigState<String>> a12, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C5843N n10;
        d.a aVar;
        b.i iVar2 = iVar;
        A1<ConfigState<String>> a13 = a12;
        C17642l<? super a, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(iVar2, "uiItem");
        C17542s.j(a13, "state");
        C17542s.j(lVar2, "onAction");
        C4889m k10 = mVar.k(-941797413);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(iVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(a13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-941797413, i11, -1, "com.sugarcube.app.base.debug.StringDropDown (DebugComposable.kt:474)");
            }
            ConfigState value = a12.getValue();
            String str = value != null ? (String) value.getCurrentValue() : null;
            k10.W(1644647903);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            List<String> possibleValues = iVar.a().getPossibleValues();
            M m10 = new M();
            m10.f144346a = S0(iVar2, str);
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            float f10 = (float) 8;
            androidx.compose.ui.d m11 = D.m(aVar3, 0.0f, c2.h.B(f10), 0.0f, c2.h.B(f10), 5, (Object) null);
            C5073d.e f11 = C5073d.f18068a.f();
            C5437c.a aVar4 = C5437c.f24302a;
            I b10 = G.b(f11, aVar4.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, m11);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar5.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, b10, aVar5.c());
            F1.c(a14, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a10))) {
                a14.u(Integer.valueOf(a10));
                a14.w(Integer.valueOf(a10), b11);
            }
            F1.c(a14, e10, aVar5.d());
            C5843N n11 = C5843N.f28726a;
            I0(iVar.a(), a12.getValue(), lVar2, k10, i11 & 896);
            C5844O.a(C5842M.e(n11, aVar3, 1.0f, false, 2, (Object) null), k10, 0);
            k10.W(-1852490144);
            int i13 = m10.f144346a;
            if (i13 >= 0) {
                String str2 = possibleValues.get(i13);
                k10.W(-1852486097);
                Object D11 = k10.D();
                if (D11 == aVar2.a()) {
                    D11 = new C13531i(r0Var);
                    k10.u(D11);
                }
                k10.P();
                M m12 = m10;
                b1.b(str2, androidx.compose.foundation.d.d(aVar3, false, (String) null, (i) null, (C17631a) D11, 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, k10, 0, 0, 131068);
                boolean T02 = T0(r0Var);
                k10.W(-1852481776);
                Object D12 = k10.D();
                if (D12 == aVar2.a()) {
                    D12 = new C13532j(r0Var);
                    k10.u(D12);
                }
                k10.P();
                n10 = n11;
                C4889m mVar3 = k10;
                aVar = aVar3;
                mVar2 = mVar3;
                C4556f.a(T02, (C17631a) D12, J.h(aVar3, 0.0f, 1, (Object) null), 0, (o) null, (androidx.compose.ui.window.q) null, c1.c.e(458231885, true, new h(possibleValues, m12, lVar, iVar, r0Var), mVar3, 54), mVar2, 1573296, 56);
            } else {
                aVar = aVar3;
                n10 = n11;
                mVar2 = k10;
            }
            mVar2.P();
            I0.Y.a(J1.e.c(R.drawable.sc_ic_chevron_down, mVar2, 0), "Drop", J.t(D.m(n10.c(aVar, aVar4.l()), c2.h.B((float) 6), c2.h.B((float) 5), 0.0f, 0.0f, 12, (Object) null), c2.h.B((float) 12)), 0, mVar2, 48, 8);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new C13533k(iVar2, a13, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N S(b.a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        R(aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final int S0(b.i iVar, String str) {
        return C16877v.B0(iVar.a().getPossibleValues(), str);
    }

    public static final void T(b.C3027b bVar, A1<ConfigState<Boolean>> a12, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        b.C3027b bVar2 = bVar;
        A1<ConfigState<Boolean>> a13 = a12;
        C17642l<? super a, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(bVar2, "uiItem");
        C17542s.j(a13, "state");
        C17542s.j(lVar2, "onAction");
        C4889m k10 = mVar.k(1793107990);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(a13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1793107990, i11, -1, "com.sugarcube.app.base.debug.BooleanSwitch (DebugComposable.kt:358)");
            }
            ConfigState value = a12.getValue();
            d.a aVar = androidx.compose.ui.d.f18749a;
            float f10 = (float) 8;
            androidx.compose.ui.d m10 = D.m(aVar, 0.0f, c2.h.B(f10), 0.0f, c2.h.B(f10), 5, (Object) null);
            boolean z10 = false;
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, m10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, b10, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a10))) {
                a14.u(Integer.valueOf(a10));
                a14.w(Integer.valueOf(a10), b11);
            }
            F1.c(a14, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            int i13 = i11 & 896;
            I0(bVar.a(), a12.getValue(), lVar2, k10, i13);
            C5844O.a(C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null), k10, 0);
            k10.W(-1560122103);
            if (C17542s.e(value != null ? value.getConfigItem() : null, bVar.a())) {
                boolean booleanValue = ((Boolean) value.getCurrentValue()).booleanValue();
                k10.W(-1560117230);
                boolean z11 = i13 == 256;
                if ((i11 & 14) == 4) {
                    z10 = true;
                }
                boolean z12 = z11 | z10;
                Object D10 = k10.D();
                if (z12 || D10 == C4889m.f14007a.a()) {
                    D10 = new O(lVar2, bVar2);
                    k10.u(D10);
                }
                k10.P();
                S0.a(booleanValue, (C17642l) D10, (androidx.compose.ui.d) null, false, (m) null, (Q0) null, k10, 0, 60);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new RE.P(bVar2, a13, lVar2, i12));
        }
    }

    private static final boolean T0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N U(C17642l lVar, b.C3027b bVar, boolean z10) {
        lVar.invoke(new a.g(bVar.a(), Boolean.valueOf(z10)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void U0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N V(b.C3027b bVar, A1 a12, C17642l lVar, int i10, C4889m mVar, int i11) {
        T(bVar, a12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V0(C4899r0 r0Var) {
        U0(r0Var, true);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void W(nI.C17631a<XH.C16807N> r26, nI.C17631a<XH.C16807N> r27, java.lang.String r28, java.lang.String r29, U0.C4889m r30, int r31) {
        /*
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r31
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onConfirmation"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "confirm"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -748308219(0xffffffffd365b905, float:-9.8665162E11)
            r6 = r30
            U0.m r15 = r6.k(r0)
            r6 = r5 & 6
            r7 = 4
            if (r6 != 0) goto L_0x0037
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x0034
            r6 = r7
            goto L_0x0035
        L_0x0034:
            r6 = 2
        L_0x0035:
            r6 = r6 | r5
            goto L_0x0038
        L_0x0037:
            r6 = r5
        L_0x0038:
            r8 = r5 & 48
            if (r8 != 0) goto L_0x0048
            boolean r8 = r15.F(r2)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0045:
            r8 = 16
        L_0x0047:
            r6 = r6 | r8
        L_0x0048:
            r8 = r5 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0058
            boolean r8 = r15.V(r3)
            if (r8 == 0) goto L_0x0055
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r6 = r6 | r8
        L_0x0058:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0068
            boolean r8 = r15.V(r4)
            if (r8 == 0) goto L_0x0065
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0067
        L_0x0065:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0067:
            r6 = r6 | r8
        L_0x0068:
            r8 = r6 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x007b
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            r15.L()
            r0 = r15
            goto L_0x0110
        L_0x007b:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0087
            r8 = -1
            java.lang.String r9 = "com.sugarcube.app.base.debug.ConfirmDialog (DebugComposable.kt:266)"
            U0.C4895p.S(r0, r6, r8, r9)
        L_0x0087:
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            r0 = 8
            float r0 = (float) r0
            float r17 = c2.h.B(r0)
            r24 = 30
            r25 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            androidx.compose.ui.d r8 = m1.m.b(r16, r17, r18, r19, r20, r22, r24, r25)
            r0 = 785500631(0x2ed1c9d7, float:9.5400736E-11)
            r15.W(r0)
            r0 = r6 & 14
            r6 = 1
            if (r0 != r7) goto L_0x00ad
            r0 = r6
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            java.lang.Object r7 = r15.D()
            if (r0 != 0) goto L_0x00bc
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x00c4
        L_0x00bc:
            RE.F r7 = new RE.F
            r7.<init>(r1)
            r15.u(r7)
        L_0x00c4:
            r0 = r7
            nI.a r0 = (nI.C17631a) r0
            r15.P()
            com.sugarcube.app.base.debug.c$b r7 = new com.sugarcube.app.base.debug.c$b
            r7.<init>(r2, r4)
            r9 = 532612541(0x1fbf05bd, float:8.090114E-20)
            r10 = 54
            c1.a r7 = c1.c.e(r9, r6, r7, r15, r10)
            com.sugarcube.app.base.debug.c$c r9 = new com.sugarcube.app.base.debug.c$c
            r9.<init>(r1)
            r11 = 821431931(0x30f60e7b, float:1.7902971E-9)
            c1.a r9 = c1.c.e(r11, r6, r9, r15, r10)
            com.sugarcube.app.base.debug.c$d r11 = new com.sugarcube.app.base.debug.c$d
            r11.<init>(r3)
            r12 = 965841626(0x399192da, float:2.7765968E-4)
            c1.a r10 = c1.c.e(r12, r6, r11, r15, r10)
            r19 = 28080(0x6db0, float:3.9348E-41)
            r20 = 992(0x3e0, float:1.39E-42)
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r6 = r0
            r0 = r15
            r15 = r16
            r17 = r18
            r18 = r0
            I0.C4554e.a(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20)
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0110
            U0.C4895p.R()
        L_0x0110:
            U0.Y0 r6 = r0.n()
            if (r6 == 0) goto L_0x0129
            RE.G r7 = new RE.G
            r0 = r7
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.W(nI.a, nI.a, java.lang.String, java.lang.String, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(C4899r0 r0Var) {
        U0(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X0(b.i iVar, A1 a12, C17642l lVar, int i10, C4889m mVar, int i11) {
        R0(iVar, a12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(C17631a aVar, C17631a aVar2, String str, String str2, int i10, C4889m mVar, int i11) {
        W(aVar, aVar2, str, str2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Y0(com.sugarcube.app.base.debug.b.j r36, U0.A1<com.sugarcube.app.base.data.feature.ConfigState<java.lang.String>> r37, nI.C17642l<? super com.sugarcube.app.base.debug.a, XH.C16807N> r38, U0.C4889m r39, int r40) {
        /*
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r40
            java.lang.String r4 = "uiItem"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onAction"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = 1437442043(0x55ad9ffb, float:2.38628278E13)
            r5 = r39
            U0.m r5 = r5.k(r4)
            r6 = r3 & 6
            r7 = 2
            if (r6 != 0) goto L_0x0030
            boolean r6 = r5.V(r0)
            if (r6 == 0) goto L_0x002d
            r6 = 4
            goto L_0x002e
        L_0x002d:
            r6 = r7
        L_0x002e:
            r6 = r6 | r3
            goto L_0x0031
        L_0x0030:
            r6 = r3
        L_0x0031:
            r8 = r3 & 48
            if (r8 != 0) goto L_0x0041
            boolean r8 = r5.V(r1)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r6 = r6 | r8
        L_0x0041:
            r8 = r3 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0051
            boolean r8 = r5.F(r2)
            if (r8 == 0) goto L_0x004e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r6 = r6 | r8
        L_0x0051:
            r13 = r6
            r6 = r13 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0065
            boolean r6 = r5.l()
            if (r6 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r5.L()
            r12 = r5
            goto L_0x02be
        L_0x0065:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0071
            r6 = -1
            java.lang.String r8 = "com.sugarcube.app.base.debug.StringEditor (DebugComposable.kt:539)"
            U0.C4895p.S(r4, r13, r6, r8)
        L_0x0071:
            java.lang.Object r4 = r37.getValue()
            com.sugarcube.app.base.data.feature.ConfigState r4 = (com.sugarcube.app.base.data.feature.ConfigState) r4
            r6 = 0
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r4.getCurrentValue()
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0082
        L_0x0081:
            r4 = r6
        L_0x0082:
            if (r4 != 0) goto L_0x0086
            java.lang.String r4 = ""
        L_0x0086:
            r8 = 885045691(0x34c0b9bb, float:3.5897924E-7)
            r5.W(r8)
            java.lang.Object r8 = r5.D()
            U0.m$a r30 = U0.C4889m.f14007a
            java.lang.Object r9 = r30.a()
            if (r8 != r9) goto L_0x00a1
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            U0.r0 r8 = U0.u1.e(r8, r6, r7, r6)
            r5.u(r8)
        L_0x00a1:
            r12 = r8
            U0.r0 r12 = (U0.C4899r0) r12
            r5.P()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r6.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r9 = r8.k()
            r10 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r9, r5, r10)
            int r9 = U0.C4883j.a(r5, r10)
            U0.y r14 = r5.s()
            androidx.compose.ui.d r15 = androidx.compose.ui.c.e(r5, r11)
            G1.g$a r24 = G1.C4504g.f6515W
            nI.a r10 = r24.a()
            U0.f r16 = r5.m()
            if (r16 != 0) goto L_0x00d5
            U0.C4883j.c()
        L_0x00d5:
            r5.I()
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x00e2
            r5.p(r10)
            goto L_0x00e5
        L_0x00e2:
            r5.t()
        L_0x00e5:
            U0.m r10 = U0.F1.a(r5)
            nI.p r1 = r24.c()
            U0.F1.c(r10, r7, r1)
            nI.p r1 = r24.e()
            U0.F1.c(r10, r14, r1)
            nI.p r1 = r24.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x010f
            java.lang.Object r7 = r10.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r14)
            if (r7 != 0) goto L_0x011d
        L_0x010f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.w(r7, r1)
        L_0x011d:
            nI.p r1 = r24.d()
            U0.F1.c(r10, r15, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 8
            float r1 = (float) r1
            float r18 = c2.h.B(r1)
            float r20 = c2.h.B(r1)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r16 = r11
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d$e r6 = r6.f()
            i1.c$c r7 = r8.l()
            r10 = 0
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r5, r10)
            int r7 = U0.C4883j.a(r5, r10)
            U0.y r8 = r5.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r5, r1)
            nI.a r9 = r24.a()
            U0.f r14 = r5.m()
            if (r14 != 0) goto L_0x0165
            U0.C4883j.c()
        L_0x0165:
            r5.I()
            boolean r14 = r5.i()
            if (r14 == 0) goto L_0x0172
            r5.p(r9)
            goto L_0x0175
        L_0x0172:
            r5.t()
        L_0x0175:
            U0.m r9 = U0.F1.a(r5)
            nI.p r14 = r24.c()
            U0.F1.c(r9, r6, r14)
            nI.p r6 = r24.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r24.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x019f
            java.lang.Object r8 = r9.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x01ad
        L_0x019f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x01ad:
            nI.p r6 = r24.d()
            U0.F1.c(r9, r1, r6)
            s0.N r6 = s0.C5843N.f28726a
            com.sugarcube.app.base.data.feature.ConfigItem$StringConfigItem r1 = r36.a()
            java.lang.Object r7 = r37.getValue()
            com.sugarcube.app.base.data.feature.ConfigState r7 = (com.sugarcube.app.base.data.feature.ConfigState) r7
            r14 = r13 & 896(0x380, float:1.256E-42)
            I0(r1, r7, r2, r5, r14)
            r1 = 2
            r15 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r7 = r11
            r24 = r14
            r14 = r10
            r10 = r1
            r1 = r11
            r11 = r15
            androidx.compose.ui.d r6 = s0.C5842M.e(r6, r7, r8, r9, r10, r11)
            s0.C5844O.a(r6, r5, r14)
            r6 = -384660150(0xffffffffe9128d4a, float:-1.1073149E25)
            r5.W(r6)
            java.lang.Object r6 = r5.D()
            java.lang.Object r7 = r30.a()
            if (r6 != r7) goto L_0x01f0
            RE.u r6 = new RE.u
            r6.<init>(r12)
            r5.u(r6)
        L_0x01f0:
            r20 = r6
            nI.a r20 = (nI.C17631a) r20
            r5.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r1
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            r28 = 0
            r29 = 131068(0x1fffc, float:1.83665E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r1 = 0
            r15 = r12
            r12 = r1
            r31 = r13
            r13 = r1
            r16 = 0
            r33 = r14
            r32 = r15
            r34 = r24
            r1 = 256(0x100, float:3.59E-43)
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r35 = r5
            r5 = r4
            r26 = r35
            I0.b1.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r35.x()
            r5 = -1872713853(0xffffffff9060a783, float:-4.4305257E-29)
            r12 = r35
            r12.W(r5)
            boolean r5 = Z0(r32)
            if (r5 == 0) goto L_0x02af
            r5 = -1872710068(0xffffffff9060b64c, float:-4.4316647E-29)
            r12.W(r5)
            java.lang.Object r5 = r12.D()
            java.lang.Object r6 = r30.a()
            if (r5 != r6) goto L_0x026b
            RE.v r5 = new RE.v
            r8 = r32
            r5.<init>(r8)
            r12.u(r5)
            goto L_0x026d
        L_0x026b:
            r8 = r32
        L_0x026d:
            r6 = r5
            nI.a r6 = (nI.C17631a) r6
            r12.P()
            r5 = -1872708174(0xffffffff9060bdb2, float:-4.4322347E-29)
            r12.W(r5)
            r10 = 1
            r5 = r34
            if (r5 != r1) goto L_0x0280
            r1 = r10
            goto L_0x0282
        L_0x0280:
            r1 = r33
        L_0x0282:
            r5 = r31 & 14
            r7 = 4
            if (r5 != r7) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r10 = r33
        L_0x028a:
            r1 = r1 | r10
            java.lang.Object r5 = r12.D()
            if (r1 != 0) goto L_0x0297
            java.lang.Object r1 = r30.a()
            if (r5 != r1) goto L_0x029f
        L_0x0297:
            RE.w r5 = new RE.w
            r5.<init>(r2, r0, r8)
            r12.u(r5)
        L_0x029f:
            r7 = r5
            nI.l r7 = (nI.C17642l) r7
            r12.P()
            r10 = 48
            r11 = 8
            r8 = 0
            r5 = r4
            r9 = r12
            g0(r5, r6, r7, r8, r9, r10, r11)
        L_0x02af:
            r12.P()
            r12.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02be
            U0.C4895p.R()
        L_0x02be:
            U0.Y0 r1 = r12.n()
            if (r1 == 0) goto L_0x02ce
            RE.x r4 = new RE.x
            r5 = r37
            r4.<init>(r0, r5, r2, r3)
            r1.a(r4)
        L_0x02ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.Y0(com.sugarcube.app.base.debug.b$j, U0.A1, nI.l, U0.m, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Z(com.sugarcube.app.base.debug.b.c r37, U0.A1<com.sugarcube.app.base.data.feature.ConfigState<java.lang.Double>> r38, nI.C17642l<? super com.sugarcube.app.base.debug.a, XH.C16807N> r39, U0.C4889m r40, int r41) {
        /*
            r0 = r37
            r1 = r38
            r2 = r39
            r3 = r41
            java.lang.String r4 = "uiItem"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "state"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onAction"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = -28526597(0xfffffffffe4cb7fb, float:-6.802945E37)
            r5 = r40
            U0.m r5 = r5.k(r4)
            r6 = r3 & 6
            r7 = 2
            if (r6 != 0) goto L_0x0030
            boolean r6 = r5.V(r0)
            if (r6 == 0) goto L_0x002d
            r6 = 4
            goto L_0x002e
        L_0x002d:
            r6 = r7
        L_0x002e:
            r6 = r6 | r3
            goto L_0x0031
        L_0x0030:
            r6 = r3
        L_0x0031:
            r8 = r3 & 48
            if (r8 != 0) goto L_0x0041
            boolean r8 = r5.V(r1)
            if (r8 == 0) goto L_0x003e
            r8 = 32
            goto L_0x0040
        L_0x003e:
            r8 = 16
        L_0x0040:
            r6 = r6 | r8
        L_0x0041:
            r8 = r3 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0051
            boolean r8 = r5.F(r2)
            if (r8 == 0) goto L_0x004e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r6 = r6 | r8
        L_0x0051:
            r13 = r6
            r6 = r13 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0065
            boolean r6 = r5.l()
            if (r6 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r5.L()
            r12 = r5
            goto L_0x02f1
        L_0x0065:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0071
            r6 = -1
            java.lang.String r8 = "com.sugarcube.app.base.debug.DoubleEditor (DebugComposable.kt:621)"
            U0.C4895p.S(r4, r13, r6, r8)
        L_0x0071:
            java.lang.Object r4 = r38.getValue()
            com.sugarcube.app.base.data.feature.ConfigState r4 = (com.sugarcube.app.base.data.feature.ConfigState) r4
            r6 = 0
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r4.getCurrentValue()
            java.lang.Double r4 = (java.lang.Double) r4
            goto L_0x0082
        L_0x0081:
            r4 = r6
        L_0x0082:
            if (r4 == 0) goto L_0x008e
            java.lang.String r8 = r4.toString()
            if (r8 != 0) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            r30 = r8
            goto L_0x0091
        L_0x008e:
            java.lang.String r8 = ""
            goto L_0x008b
        L_0x0091:
            r8 = 1139560571(0x43ec507b, float:472.62875)
            r5.W(r8)
            java.lang.Object r8 = r5.D()
            U0.m$a r31 = U0.C4889m.f14007a
            java.lang.Object r9 = r31.a()
            if (r8 != r9) goto L_0x00ac
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            U0.r0 r8 = U0.u1.e(r8, r6, r7, r6)
            r5.u(r8)
        L_0x00ac:
            r12 = r8
            U0.r0 r12 = (U0.C4899r0) r12
            r5.P()
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r6.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r9 = r8.k()
            r10 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r9, r5, r10)
            int r9 = U0.C4883j.a(r5, r10)
            U0.y r14 = r5.s()
            androidx.compose.ui.d r15 = androidx.compose.ui.c.e(r5, r11)
            G1.g$a r24 = G1.C4504g.f6515W
            nI.a r10 = r24.a()
            U0.f r16 = r5.m()
            if (r16 != 0) goto L_0x00e0
            U0.C4883j.c()
        L_0x00e0:
            r5.I()
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x00ed
            r5.p(r10)
            goto L_0x00f0
        L_0x00ed:
            r5.t()
        L_0x00f0:
            U0.m r10 = U0.F1.a(r5)
            nI.p r1 = r24.c()
            U0.F1.c(r10, r7, r1)
            nI.p r1 = r24.e()
            U0.F1.c(r10, r14, r1)
            nI.p r1 = r24.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x011a
            java.lang.Object r7 = r10.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r14)
            if (r7 != 0) goto L_0x0128
        L_0x011a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.w(r7, r1)
        L_0x0128:
            nI.p r1 = r24.d()
            U0.F1.c(r10, r15, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 8
            float r1 = (float) r1
            float r18 = c2.h.B(r1)
            float r20 = c2.h.B(r1)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r16 = r11
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d$e r6 = r6.f()
            i1.c$c r7 = r8.l()
            r10 = 0
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r5, r10)
            int r7 = U0.C4883j.a(r5, r10)
            U0.y r8 = r5.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r5, r1)
            nI.a r9 = r24.a()
            U0.f r14 = r5.m()
            if (r14 != 0) goto L_0x0170
            U0.C4883j.c()
        L_0x0170:
            r5.I()
            boolean r14 = r5.i()
            if (r14 == 0) goto L_0x017d
            r5.p(r9)
            goto L_0x0180
        L_0x017d:
            r5.t()
        L_0x0180:
            U0.m r9 = U0.F1.a(r5)
            nI.p r14 = r24.c()
            U0.F1.c(r9, r6, r14)
            nI.p r6 = r24.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r24.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x01aa
            java.lang.Object r8 = r9.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x01b8
        L_0x01aa:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x01b8:
            nI.p r6 = r24.d()
            U0.F1.c(r9, r1, r6)
            s0.N r6 = s0.C5843N.f28726a
            com.sugarcube.app.base.data.feature.ConfigItem r1 = r37.a()
            java.lang.Object r7 = r38.getValue()
            com.sugarcube.app.base.data.feature.ConfigState r7 = (com.sugarcube.app.base.data.feature.ConfigState) r7
            r14 = r13 & 896(0x380, float:1.256E-42)
            I0(r1, r7, r2, r5, r14)
            r1 = 2
            r15 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r7 = r11
            r24 = r14
            r14 = r10
            r10 = r1
            r1 = r11
            r11 = r15
            androidx.compose.ui.d r6 = s0.C5842M.e(r6, r7, r8, r9, r10, r11)
            s0.C5844O.a(r6, r5, r14)
            r6 = -371796271(0xffffffffe9d6d6d1, float:-3.246557E25)
            r5.W(r6)
            if (r4 != 0) goto L_0x01f9
            r36 = r5
            r33 = r12
            r32 = r13
            r34 = r14
            r35 = r24
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0266
        L_0x01f9:
            java.lang.String r4 = r4.toString()
            r6 = 1241854505(0x4a053229, float:2182282.2)
            r5.W(r6)
            java.lang.Object r6 = r5.D()
            java.lang.Object r7 = r31.a()
            if (r6 != r7) goto L_0x0215
            RE.z r6 = new RE.z
            r6.<init>(r12)
            r5.u(r6)
        L_0x0215:
            r20 = r6
            nI.a r20 = (nI.C17631a) r20
            r5.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16 = r1
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            r28 = 0
            r29 = 131068(0x1fffc, float:1.83665E-40)
            r7 = 0
            r9 = 0
            r11 = 0
            r1 = 0
            r15 = r12
            r12 = r1
            r32 = r13
            r13 = r1
            r16 = 0
            r34 = r14
            r33 = r15
            r35 = r24
            r1 = 256(0x100, float:3.59E-43)
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r36 = r5
            r5 = r4
            r26 = r36
            I0.b1.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            XH.N r4 = XH.C16807N.f139792a
        L_0x0266:
            r36.P()
            r36.x()
            r4 = -1507809336(0xffffffffa620a7c8, float:-5.5738537E-16)
            r12 = r36
            r12.W(r4)
            boolean r4 = a0(r33)
            if (r4 == 0) goto L_0x02e2
            r4 = -1507805716(0xffffffffa620b5ec, float:-5.57577E-16)
            r12.W(r4)
            java.lang.Object r4 = r12.D()
            java.lang.Object r5 = r31.a()
            if (r4 != r5) goto L_0x0295
            RE.A r4 = new RE.A
            r8 = r33
            r4.<init>(r8)
            r12.u(r4)
            goto L_0x0297
        L_0x0295:
            r8 = r33
        L_0x0297:
            r6 = r4
            nI.a r6 = (nI.C17631a) r6
            r12.P()
            r4 = -1507803709(0xffffffffa620bdc3, float:-5.5768326E-16)
            r12.W(r4)
            r10 = 1
            r4 = r35
            if (r4 != r1) goto L_0x02aa
            r1 = r10
            goto L_0x02ac
        L_0x02aa:
            r1 = r34
        L_0x02ac:
            r4 = r32 & 14
            r5 = 4
            if (r4 != r5) goto L_0x02b2
            goto L_0x02b4
        L_0x02b2:
            r10 = r34
        L_0x02b4:
            r1 = r1 | r10
            java.lang.Object r4 = r12.D()
            if (r1 != 0) goto L_0x02c1
            java.lang.Object r1 = r31.a()
            if (r4 != r1) goto L_0x02c9
        L_0x02c1:
            RE.B r4 = new RE.B
            r4.<init>(r8, r2, r0)
            r12.u(r4)
        L_0x02c9:
            r7 = r4
            nI.l r7 = (nI.C17642l) r7
            r12.P()
            T1.y$a r1 = T1.C4855y.f13650b
            int r1 = r1.d()
            T1.y r8 = T1.C4855y.k(r1)
            r10 = 3120(0xc30, float:4.372E-42)
            r11 = 0
            r5 = r30
            r9 = r12
            g0(r5, r6, r7, r8, r9, r10, r11)
        L_0x02e2:
            r12.P()
            r12.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02f1
            U0.C4895p.R()
        L_0x02f1:
            U0.Y0 r1 = r12.n()
            if (r1 == 0) goto L_0x0301
            RE.C r4 = new RE.C
            r5 = r38
            r4.<init>(r0, r5, r2, r3)
            r1.a(r4)
        L_0x0301:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.Z(com.sugarcube.app.base.debug.b$c, U0.A1, nI.l, U0.m, int):void");
    }

    private static final boolean Z0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final boolean a0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void a1(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final void b0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(C4899r0 r0Var) {
        a1(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(C4899r0 r0Var) {
        b0(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c1(C4899r0 r0Var) {
        a1(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d0(C4899r0 r0Var) {
        b0(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d1(C17642l lVar, b.j jVar, C4899r0 r0Var, String str) {
        C17542s.j(str, "newValue");
        a1(r0Var, false);
        lVar.invoke(new a.g(jVar.a(), str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(C4899r0 r0Var, C17642l lVar, b.c cVar, String str) {
        C17542s.j(str, "newValue");
        b0(r0Var, false);
        Double q10 = C15854t.q(str);
        if (q10 != null) {
            lVar.invoke(new a.g(cVar.a(), Double.valueOf(q10.doubleValue())));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e1(b.j jVar, A1 a12, C17642l lVar, int i10, C4889m mVar, int i11) {
        Y0(jVar, a12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(b.c cVar, A1 a12, C17642l lVar, int i10, C4889m mVar, int i11) {
        Z(cVar, a12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f1(androidx.lifecycle.K<java.lang.Boolean> r33, nI.C17642l<? super com.sugarcube.app.base.debug.a, XH.C16807N> r34, U0.C4889m r35, int r36) {
        /*
            r0 = r33
            r1 = r34
            r2 = r36
            java.lang.String r3 = "recommendKillApp"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onAction"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = -939481720(0xffffffffc800a588, float:-131734.12)
            r4 = r35
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            r5 = 4
            r6 = 2
            if (r4 != 0) goto L_0x002a
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0027
            r4 = r5
            goto L_0x0028
        L_0x0027:
            r4 = r6
        L_0x0028:
            r4 = r4 | r2
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            r7 = r2 & 48
            r14 = 32
            if (r7 != 0) goto L_0x003c
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0039
            r7 = r14
            goto L_0x003b
        L_0x0039:
            r7 = 16
        L_0x003b:
            r4 = r4 | r7
        L_0x003c:
            r13 = r4
            r4 = r13 & 19
            r7 = 18
            if (r4 != r7) goto L_0x0050
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            r15.L()
            r10 = r15
            goto L_0x0395
        L_0x0050:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x005c
            r4 = -1
            java.lang.String r7 = "com.sugarcube.app.base.debug.ToolsSection (DebugComposable.kt:169)"
            U0.C4895p.S(r3, r13, r4, r7)
        L_0x005c:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = r13 & 14
            r12 = 48
            r4 = r4 | r12
            U0.A1 r4 = d1.b.b(r0, r3, r15, r4)
            java.lang.Object r4 = r4.getValue()
            r17 = r4
            java.lang.Boolean r17 = (java.lang.Boolean) r17
            r4 = 522406311(0x1f2349a7, float:3.4577516E-20)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            U0.m$a r18 = U0.C4889m.f14007a
            java.lang.Object r7 = r18.a()
            r11 = 0
            if (r4 != r7) goto L_0x0089
            U0.r0 r4 = U0.u1.e(r3, r11, r6, r11)
            r15.u(r4)
        L_0x0089:
            r10 = r4
            U0.r0 r10 = (U0.C4899r0) r10
            r15.P()
            r4 = 522408199(0x1f235107, float:3.4583617E-20)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            java.lang.Object r7 = r18.a()
            if (r4 != r7) goto L_0x00a6
            U0.r0 r4 = U0.u1.e(r3, r11, r6, r11)
            r15.u(r4)
        L_0x00a6:
            r3 = r4
            U0.r0 r3 = (U0.C4899r0) r3
            r15.P()
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r8 = 0
            r7 = 1
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r9, r8, r7, r11)
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            A0.f r5 = A0.g.e(r5)
            androidx.compose.ui.d r19 = m1.e.a(r4, r5)
            tK.v r4 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r15, r5)
            long r20 = r4.l0()
            r23 = 2
            r24 = 0
            r22 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r19, r20, r22, r23, r24)
            r5 = 8
            float r5 = (float) r5
            float r6 = c2.h.B(r5)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.i(r4, r6)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            float r5 = c2.h.B(r5)
            androidx.compose.foundation.layout.d$f r5 = r6.n(r5)
            i1.c$a r25 = i1.C5437c.f24302a
            i1.c$c r7 = r25.a()
            r8 = 54
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r7, r15, r8)
            r8 = 0
            int r7 = U0.C4883j.a(r15, r8)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r27 = G1.C4504g.f6515W
            nI.a r11 = r27.a()
            U0.f r19 = r15.m()
            if (r19 != 0) goto L_0x0114
            U0.C4883j.c()
        L_0x0114:
            r15.I()
            boolean r19 = r15.i()
            if (r19 == 0) goto L_0x0121
            r15.p(r11)
            goto L_0x0124
        L_0x0121:
            r15.t()
        L_0x0124:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r27.c()
            U0.F1.c(r11, r5, r12)
            nI.p r5 = r27.e()
            U0.F1.c(r11, r8, r5)
            nI.p r5 = r27.b()
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x014e
            java.lang.Object r8 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x015c
        L_0x014e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r11.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r11.w(r7, r5)
        L_0x015c:
            nI.p r5 = r27.d()
            U0.F1.c(r11, r4, r5)
            s0.N r28 = s0.C5843N.f28726a
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r19 = r28
            r20 = r9
            androidx.compose.ui.d r5 = s0.C5842M.e(r19, r20, r21, r22, r23, r24)
            r4 = 1184339995(0x4697981b, float:19404.053)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            java.lang.Object r7 = r18.a()
            if (r4 != r7) goto L_0x018d
            RE.Q r4 = new RE.Q
            r4.<init>(r3)
            r15.u(r4)
        L_0x018d:
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            RE.a r29 = RE.C13523a.f115465a
            nI.q r19 = r29.a()
            r20 = 805306374(0x30000006, float:4.656616E-10)
            r21 = 508(0x1fc, float:7.12E-43)
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r30 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            r11 = r9
            r9 = r12
            r12 = r10
            r10 = r22
            r35 = r11
            r11 = r23
            r31 = r12
            r12 = r24
            r26 = r13
            r13 = r19
            r14 = r15
            r32 = r15
            r15 = r20
            r16 = r21
            I0.C4564j.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r23 = 2
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r19 = r28
            r20 = r35
            androidx.compose.ui.d r4 = s0.C5842M.e(r19, r20, r21, r22, r23, r24)
            i1.c$b r5 = r25.g()
            androidx.compose.foundation.layout.d$m r6 = r30.g()
            r15 = r32
            r7 = 48
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r6, r5, r15, r7)
            r14 = 0
            int r6 = U0.C4883j.a(r15, r14)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            nI.a r8 = r27.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x01ff
            U0.C4883j.c()
        L_0x01ff:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x020c
            r15.p(r8)
            goto L_0x020f
        L_0x020c:
            r15.t()
        L_0x020f:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r27.c()
            U0.F1.c(r8, r5, r9)
            nI.p r5 = r27.e()
            U0.F1.c(r8, r7, r5)
            nI.p r5 = r27.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x0239
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x0247
        L_0x0239:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r5)
        L_0x0247:
            nI.p r5 = r27.d()
            U0.F1.c(r8, r4, r5)
            s0.h r4 = s0.C5862h.f28810a
            kotlin.jvm.internal.C17542s.g(r17)
            boolean r5 = r17.booleanValue()
            r6 = 3
            r12 = 0
            r13 = 0
            androidx.compose.animation.i r7 = androidx.compose.animation.g.o(r13, r12, r6, r13)
            androidx.compose.animation.k r8 = androidx.compose.animation.g.q(r13, r12, r6, r13)
            nI.q r10 = r29.b()
            r16 = 1600518(0x186c06, float:2.242803E-39)
            r17 = 18
            r6 = 0
            r9 = 0
            r11 = r15
            r14 = r12
            r12 = r16
            r0 = r13
            r13 = r17
            l0.d.e(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = r35
            r13 = 1
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r4, r14, r13, r0)
            r0 = 1770083321(0x698153f9, float:1.9543498E25)
            r15.W(r0)
            java.lang.Object r0 = r15.D()
            java.lang.Object r4 = r18.a()
            if (r0 != r4) goto L_0x0299
            RE.S r0 = new RE.S
            r14 = r31
            r0.<init>(r14)
            r15.u(r0)
            goto L_0x029b
        L_0x0299:
            r14 = r31
        L_0x029b:
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            nI.q r0 = r29.c()
            r16 = 805306422(0x30000036, float:4.656643E-10)
            r17 = 508(0x1fc, float:7.12E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r19 = r13
            r13 = r0
            r0 = r14
            r20 = 0
            r14 = r15
            r32 = r15
            r15 = r16
            r16 = r17
            I0.C4564j.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r32.x()
            r4 = 1184379818(0x469833aa, float:19481.832)
            r10 = r32
            r10.W(r4)
            boolean r4 = g1(r0)
            if (r4 == 0) goto L_0x0324
            r4 = 1184382079(0x46983c7f, float:19486.248)
            r10.W(r4)
            java.lang.Object r4 = r10.D()
            java.lang.Object r5 = r18.a()
            if (r4 != r5) goto L_0x02ea
            RE.T r4 = new RE.T
            r4.<init>(r0)
            r10.u(r4)
        L_0x02ea:
            nI.a r4 = (nI.C17631a) r4
            r10.P()
            r5 = 1184385139(0x46984873, float:19492.225)
            r10.W(r5)
            r5 = r26 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r5 != r11) goto L_0x02fe
            r7 = r19
            goto L_0x0300
        L_0x02fe:
            r7 = r20
        L_0x0300:
            java.lang.Object r5 = r10.D()
            if (r7 != 0) goto L_0x030c
            java.lang.Object r6 = r18.a()
            if (r5 != r6) goto L_0x0314
        L_0x030c:
            RE.d r5 = new RE.d
            r5.<init>(r1, r0)
            r10.u(r5)
        L_0x0314:
            nI.a r5 = (nI.C17631a) r5
            r10.P()
            java.lang.String r7 = "Kill"
            r9 = 3462(0xd86, float:4.851E-42)
            java.lang.String r6 = "Force kill app?"
            r8 = r10
            W(r4, r5, r6, r7, r8, r9)
            goto L_0x0326
        L_0x0324:
            r11 = 32
        L_0x0326:
            r10.P()
            r0 = 1184392637(0x469865bd, float:19506.87)
            r10.W(r0)
            boolean r0 = i1(r3)
            if (r0 == 0) goto L_0x0386
            r0 = 1184394912(0x46986ea0, float:19511.312)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            java.lang.Object r4 = r18.a()
            if (r0 != r4) goto L_0x034d
            RE.e r0 = new RE.e
            r0.<init>(r3)
            r10.u(r0)
        L_0x034d:
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r10.P()
            r0 = 1184398014(0x46987abe, float:19517.371)
            r10.W(r0)
            r0 = r26 & 112(0x70, float:1.57E-43)
            if (r0 != r11) goto L_0x0360
            r7 = r19
            goto L_0x0362
        L_0x0360:
            r7 = r20
        L_0x0362:
            java.lang.Object r0 = r10.D()
            if (r7 != 0) goto L_0x036e
            java.lang.Object r5 = r18.a()
            if (r0 != r5) goto L_0x0376
        L_0x036e:
            RE.f r0 = new RE.f
            r0.<init>(r1, r3)
            r10.u(r0)
        L_0x0376:
            r5 = r0
            nI.a r5 = (nI.C17631a) r5
            r10.P()
            java.lang.String r7 = "Reset"
            r9 = 3462(0xd86, float:4.851E-42)
            java.lang.String r6 = "Reset all overrides?"
            r8 = r10
            W(r4, r5, r6, r7, r8, r9)
        L_0x0386:
            r10.P()
            r10.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0395
            U0.C4895p.R()
        L_0x0395:
            U0.Y0 r0 = r10.n()
            if (r0 == 0) goto L_0x03a5
            RE.g r3 = new RE.g
            r4 = r33
            r3.<init>(r4, r1, r2)
            r0.a(r3)
        L_0x03a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.f1(androidx.lifecycle.K, nI.l, U0.m, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g0(java.lang.String r26, nI.C17631a<XH.C16807N> r27, nI.C17642l<? super java.lang.String, XH.C16807N> r28, T1.C4855y r29, U0.C4889m r30, int r31, int r32) {
        /*
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r31
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onConfirmation"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = -361298985(0xffffffffea7703d7, float:-7.4655703E25)
            r1 = r30
            U0.m r11 = r1.k(r0)
            r1 = r32 & 1
            r12 = 2
            if (r1 == 0) goto L_0x0028
            r1 = r10 | 6
            goto L_0x0038
        L_0x0028:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0037
            boolean r1 = r11.V(r7)
            if (r1 == 0) goto L_0x0034
            r1 = 4
            goto L_0x0035
        L_0x0034:
            r1 = r12
        L_0x0035:
            r1 = r1 | r10
            goto L_0x0038
        L_0x0037:
            r1 = r10
        L_0x0038:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x003f
            r1 = r1 | 48
            goto L_0x004f
        L_0x003f:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x004f
            boolean r2 = r11.F(r8)
            if (r2 == 0) goto L_0x004c
            r2 = 32
            goto L_0x004e
        L_0x004c:
            r2 = 16
        L_0x004e:
            r1 = r1 | r2
        L_0x004f:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x0056
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0066
            boolean r2 = r11.F(r9)
            if (r2 == 0) goto L_0x0063
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r32 & 8
            if (r2 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r3 = r29
            goto L_0x0081
        L_0x006f:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006c
            r3 = r29
            boolean r4 = r11.V(r3)
            if (r4 == 0) goto L_0x007e
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r4
        L_0x0081:
            r4 = r1 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0094
            boolean r4 = r11.l()
            if (r4 != 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            r11.L()
            r4 = r3
            goto L_0x0130
        L_0x0094:
            r13 = 0
            if (r2 == 0) goto L_0x0099
            r14 = r13
            goto L_0x009a
        L_0x0099:
            r14 = r3
        L_0x009a:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00a6
            r2 = -1
            java.lang.String r3 = "com.sugarcube.app.base.debug.EditTextDialog (DebugComposable.kt:735)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00a6:
            r0 = -553669845(0xffffffffdeffab2b, float:-9.211433E18)
            r11.W(r0)
            java.lang.Object r0 = r11.D()
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r1 = r15.a()
            if (r0 != r1) goto L_0x00d0
            T1.P r6 = new T1.P
            r5 = 6
            r16 = 0
            r2 = 0
            r4 = 0
            r0 = r6
            r1 = r26
            r7 = r6
            r6 = r16
            r0.<init>((java.lang.String) r1, (long) r2, (N1.W) r4, (int) r5, (kotlin.jvm.internal.DefaultConstructorMarker) r6)
            U0.r0 r0 = U0.u1.e(r7, r13, r12, r13)
            r11.u(r0)
        L_0x00d0:
            U0.r0 r0 = (U0.C4899r0) r0
            r11.P()
            if (r14 == 0) goto L_0x00f2
            B0.A r13 = new B0.A
            int r19 = r14.q()
            r24 = 123(0x7b, float:1.72E-43)
            r25 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x00f2:
            r1 = -553661859(0xffffffffdeffca5d, float:-9.2158233E18)
            r11.W(r1)
            java.lang.Object r1 = r11.D()
            java.lang.Object r2 = r15.a()
            if (r1 != r2) goto L_0x010a
            RE.D r1 = new RE.D
            r1.<init>()
            r11.u(r1)
        L_0x010a:
            nI.a r1 = (nI.C17631a) r1
            r11.P()
            com.sugarcube.app.base.debug.c$e r2 = new com.sugarcube.app.base.debug.c$e
            r2.<init>(r0, r13, r8, r9)
            r0 = 54
            r3 = 361196256(0x15876ae0, float:5.4694685E-26)
            r4 = 1
            c1.a r3 = c1.c.e(r3, r4, r2, r11, r0)
            r5 = 390(0x186, float:5.47E-43)
            r6 = 2
            r2 = 0
            r4 = r11
            androidx.compose.ui.window.a.a(r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x012f
            U0.C4895p.R()
        L_0x012f:
            r4 = r14
        L_0x0130:
            U0.Y0 r7 = r11.n()
            if (r7 == 0) goto L_0x0149
            RE.E r11 = new RE.E
            r0 = r11
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = r31
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r11)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.g0(java.lang.String, nI.a, nI.l, T1.y, U0.m, int, int):void");
    }

    private static final boolean g1(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N h0() {
        return C16807N.f139792a;
    }

    private static final void h1(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N i0(String str, C17631a aVar, C17642l lVar, C4855y yVar, int i10, int i11, C4889m mVar, int i12) {
        g0(str, aVar, lVar, yVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean i1(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    public static final void j0(b.d dVar, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4899r0 r0Var;
        b.d dVar2 = dVar;
        C17642l<? super a, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(dVar2, "uiItem");
        C17542s.j(lVar2, "onAction");
        C4889m k10 = mVar.k(1210659850);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(dVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1210659850, i11, -1, "com.sugarcube.app.base.debug.EnvironmentSelector (DebugComposable.kt:663)");
            }
            C13759a value = p1.b(dVar.a(), (C17168i) null, k10, 0, 1).getValue();
            k10.W(-1420077479);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var2 = (C4899r0) D10;
            k10.P();
            M m10 = new M();
            m10.f144346a = dVar.b().indexOf(value);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            float f10 = (float) 8;
            androidx.compose.ui.d m11 = D.m(aVar2, 0.0f, c2.h.B(f10), 0.0f, c2.h.B(f10), 5, (Object) null);
            k10.W(-1420071126);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = new r(r0Var2);
                k10.u(D11);
            }
            k10.P();
            androidx.compose.ui.d d10 = androidx.compose.foundation.d.d(m11, false, (String) null, (i) null, (C17631a) D11, 7, (Object) null);
            C5073d dVar3 = C5073d.f18068a;
            C5073d.e f11 = dVar3.f();
            C5437c.a aVar3 = C5437c.f24302a;
            I b10 = G.b(f11, aVar3.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, d10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar4.d());
            C5843N n10 = C5843N.f28726a;
            I a13 = C5080k.a(dVar3.g(), aVar3.k(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, aVar2);
            C17631a<C4504g> a15 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, a13, aVar4.c());
            F1.c(a16, s11, aVar4.e());
            p<C4504g, Integer, C16807N> b12 = aVar4.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            String e12 = value.e();
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            M m12 = m10;
            d.a aVar5 = aVar2;
            C4899r0 r0Var3 = r0Var2;
            int i14 = i13;
            C5843N n11 = n10;
            C18030v vVar2 = vVar;
            C4889m mVar2 = k10;
            C4889m mVar3 = mVar2;
            b1.b(e12, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(k10, i13).c().c(), mVar3, 0, 0, 65534);
            b1.b(value.c(), (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, (Y) null, mVar3, 0, 0, 131070);
            mVar2.x();
            k10 = mVar2;
            C5844O.a(C5842M.e(n11, aVar5, 1.0f, false, 2, (Object) null), k10, 0);
            d.a aVar6 = aVar5;
            float f12 = (float) 12;
            I0.Y.a(J1.e.c(R.drawable.sc_ic_chevron_down, k10, 0), "Drop", J.t(D.m(n11.c(aVar6, aVar3.l()), c2.h.B((float) 6), c2.h.B((float) 5), 0.0f, 0.0f, 12, (Object) null), c2.h.B(f12)), 0, k10, 48, 8);
            boolean k02 = k0(r0Var3);
            k10.W(-1538672566);
            Object D12 = k10.D();
            if (D12 == aVar.a()) {
                r0Var = r0Var3;
                D12 = new C13540s(r0Var);
                k10.u(D12);
            } else {
                r0Var = r0Var3;
            }
            k10.P();
            float f13 = f12;
            d.a aVar7 = aVar6;
            C4556f.a(k02, (C17631a) D12, J.h(aVar6, 0.0f, 1, (Object) null), 0, (o) null, (androidx.compose.ui.window.q) null, c1.c.e(646888289, true, new f(dVar2, m12, lVar2, r0Var), k10, 54), k10, 1573296, 56);
            k10.x();
            C5844O.a(J.i(aVar7, c2.h.B(f13)), k10, 6);
            B.a((androidx.compose.ui.d) null, vVar2.a(k10, i14).m0(), c2.h.B((float) 1), 0.0f, k10, 384, 9);
            C5844O.a(J.i(aVar7, c2.h.B(f13)), k10, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n12 = k10.n();
        if (n12 != null) {
            n12.a(new C13541t(dVar2, lVar2, i12));
        }
    }

    private static final void j1(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean k0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(C4899r0 r0Var) {
        j1(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void l0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N l1(C4899r0 r0Var) {
        h1(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m0(C4899r0 r0Var) {
        l0(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m1(C4899r0 r0Var) {
        h1(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n0(C4899r0 r0Var) {
        l0(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n1(C17642l lVar, C4899r0 r0Var) {
        h1(r0Var, false);
        lVar.invoke(a.f.f122972a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o0(b.d dVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        j0(dVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o1(C4899r0 r0Var) {
        j1(r0Var, false);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p0(com.sugarcube.app.base.debug.b.e r30, nI.C17642l<? super com.sugarcube.app.base.debug.a, XH.C16807N> r31, U0.C4889m r32, int r33) {
        /*
            r0 = r30
            r1 = r31
            r2 = r33
            java.lang.String r3 = "uiItem"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onAction"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 369561297(0x16070ed1, float:1.0909888E-25)
            r4 = r32
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x0028
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r2
            goto L_0x0029
        L_0x0028:
            r4 = r2
        L_0x0029:
            r5 = r2 & 48
            r6 = 16
            r7 = 32
            if (r5 != 0) goto L_0x003b
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0039
            r5 = r7
            goto L_0x003a
        L_0x0039:
            r5 = r6
        L_0x003a:
            r4 = r4 | r5
        L_0x003b:
            r5 = r4 & 19
            r8 = 18
            if (r5 != r8) goto L_0x004e
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            r15.L()
            r12 = r15
            goto L_0x01ca
        L_0x004e:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x005a
            r5 = -1
            java.lang.String r8 = "com.sugarcube.app.base.debug.GroupHeader (DebugComposable.kt:86)"
            U0.C4895p.S(r3, r4, r5, r8)
        L_0x005a:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            float r5 = (float) r6
            float r18 = c2.h.B(r5)
            float r20 = c2.h.B(r5)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r16 = r3
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r5 = -841280483(0xffffffffcddb141d, float:-4.59441056E8)
            r15.W(r5)
            r4 = r4 & 112(0x70, float:1.57E-43)
            r6 = 0
            if (r4 != r7) goto L_0x0080
            r4 = 1
            goto L_0x0081
        L_0x0080:
            r4 = r6
        L_0x0081:
            boolean r5 = r15.F(r0)
            r4 = r4 | r5
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x0094
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x009c
        L_0x0094:
            RE.p r5 = new RE.p
            r5.<init>(r1, r0)
            r15.u(r5)
        L_0x009c:
            r12 = r5
            nI.a r12 = (nI.C17631a) r12
            r15.P()
            r13 = 7
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r8, r9, r10, r11, r12, r13, r14)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r5 = r5.i()
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r7 = r7.f()
            r8 = 48
            E1.I r5 = androidx.compose.foundation.layout.G.b(r7, r5, r15, r8)
            int r7 = U0.C4883j.a(r15, r6)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x00d8
            U0.C4883j.c()
        L_0x00d8:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x00e5
            r15.p(r10)
            goto L_0x00e8
        L_0x00e5:
            r15.t()
        L_0x00e8:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r5, r11)
            nI.p r5 = r9.e()
            U0.F1.c(r10, r8, r5)
            nI.p r5 = r9.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x0112
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x0120
        L_0x0112:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r5)
        L_0x0120:
            nI.p r5 = r9.d()
            U0.F1.c(r10, r4, r5)
            s0.N r29 = s0.C5843N.f28726a
            com.sugarcube.app.base.data.feature.ConfigItemGroup r4 = r30.b()
            int r4 = r4.getIconResId()
            t1.c r4 = J1.e.c(r4, r15, r6)
            com.sugarcube.app.base.data.feature.ConfigItemGroup r5 = r30.b()
            java.lang.String r5 = r5.getName()
            r10 = 0
            r11 = 12
            r7 = 0
            r8 = 0
            r13 = r6
            r6 = r7
            r7 = r8
            r9 = r15
            I0.Y.a(r4, r5, r6, r7, r9, r10, r11)
            r4 = 8
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.y(r3, r4)
            r5 = 6
            s0.C5844O.a(r4, r15, r5)
            com.sugarcube.app.base.data.feature.ConfigItemGroup r4 = r30.b()
            java.lang.String r4 = r4.getName()
            tK.v r5 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.w r5 = r5.b(r15, r6)
            tK.r r5 = r5.c()
            N1.Y r24 = r5.c()
            r27 = 0
            r28 = 65534(0xfffe, float:9.1833E-41)
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r13 = r16
            r16 = 0
            r32 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r25 = r32
            I0.b1.b(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r13 = 2
            r14 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r9 = r29
            r10 = r3
            androidx.compose.ui.d r3 = s0.C5842M.e(r9, r10, r11, r12, r13, r14)
            r12 = r32
            r4 = 0
            s0.C5844O.a(r3, r12, r4)
            int r3 = com.sugarcube.common.R.drawable.sc_arrow_right_16
            t1.c r4 = J1.e.c(r3, r12, r4)
            r10 = 48
            r11 = 12
            r6 = 0
            r7 = 0
            r9 = r12
            I0.Y.a(r4, r5, r6, r7, r9, r10, r11)
            r12.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01ca
            U0.C4895p.R()
        L_0x01ca:
            U0.Y0 r3 = r12.n()
            if (r3 == 0) goto L_0x01d8
            RE.q r4 = new RE.q
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.c.p0(com.sugarcube.app.base.debug.b$e, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p1(C17642l lVar, C4899r0 r0Var) {
        j1(r0Var, false);
        lVar.invoke(a.b.f122968a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q0(C17642l lVar, b.e eVar) {
        lVar.invoke(new a.d(eVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q1(K k10, C17642l lVar, int i10, C4889m mVar, int i11) {
        f1(k10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r0(b.e eVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        p0(eVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void s0(b.f fVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        b.f fVar2 = fVar;
        int i12 = i10;
        C17542s.j(fVar2, "uiItem");
        C4889m k10 = mVar.k(423475465);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(fVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(423475465, i11, -1, "com.sugarcube.app.base.debug.Header (DebugComposable.kt:72)");
            }
            String a10 = fVar.a();
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            int i14 = i13;
            C4889m mVar3 = k10;
            b1.b(a10, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(k10, i13).c().c(), mVar3, 0, 0, 65534);
            d.a aVar = androidx.compose.ui.d.f18749a;
            float f10 = (float) 12;
            mVar2 = mVar3;
            C5844O.a(J.i(aVar, c2.h.B(f10)), mVar2, 6);
            B.a((androidx.compose.ui.d) null, vVar.a(mVar2, i14).m0(), c2.h.B((float) 1), 0.0f, mVar2, 384, 9);
            C5844O.a(J.i(aVar, c2.h.B(f10)), mVar2, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new N(fVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t0(b.f fVar, int i10, C4889m mVar, int i11) {
        s0(fVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void u0(ConfigItem<?> configItem, ConfigState<?> configState, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        androidx.compose.ui.d dVar;
        ConfigItem<?> configItem2 = configItem;
        ConfigState<?> configState2 = configState;
        C17642l<? super a, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(configItem2, "configItem");
        C17542s.j(lVar2, "onAction");
        C4889m k10 = mVar.k(1439600873);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(configItem2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(configState2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1439600873, i13, -1, "com.sugarcube.app.base.debug.IconRow (DebugComposable.kt:298)");
            }
            k10.W(-502845976);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            boolean z10 = configState2 != null && configState.isOverridden();
            k10.W(-502842166);
            if (z10) {
                androidx.compose.ui.d m10 = D.m(androidx.compose.ui.d.f18749a, 0.0f, c2.h.B((float) 2), 0.0f, 0.0f, 13, (Object) null);
                k10.W(-502839401);
                Object D11 = k10.D();
                if (D11 == aVar.a()) {
                    D11 = new RE.I(r0Var);
                    k10.u(D11);
                }
                k10.P();
                dVar = androidx.compose.foundation.d.d(m10, false, (String) null, (i) null, (C17631a) D11, 7, (Object) null);
            } else {
                dVar = D.m(androidx.compose.ui.d.f18749a, 0.0f, c2.h.B((float) 2), 0.0f, 0.0f, 13, (Object) null);
            }
            k10.P();
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, dVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            C5942c c10 = J1.e.c(R.drawable.sc_ic_pencil, k10, 0);
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            float f10 = (float) 18;
            float f11 = 1.0f;
            I0.Y.a(c10, "Overridden", C5571a.a(J.t(aVar3, c2.h.B(f10)), (configState2 == null || !configState.isOverridden()) ? 0.15f : 1.0f), 0, k10, 48, 8);
            I0.Y.a(J1.e.c(C18146a.f148554n, k10, 0), "Remote", C5571a.a(J.t(aVar3, c2.h.B(f10)), (configState2 == null || !configState.getHasRemote()) ? 0.15f : 1.0f), 0, k10, 48, 8);
            C5942c c11 = J1.e.c(C18146a.f148718xd, k10, 0);
            long a13 = J1.b.a(R.color.ikea_red, k10, 0);
            androidx.compose.ui.d t10 = J.t(aVar3, c2.h.B((float) 14));
            if (configState2 == null || configState.getInitialized()) {
                f11 = 0.0f;
            }
            I0.Y.a(c11, "Fallback", C5571a.a(t10, f11), a13, k10, 48, 0);
            k10.x();
            if (v0(r0Var)) {
                k10.W(-502802504);
                Object D12 = k10.D();
                if (D12 == aVar.a()) {
                    D12 = new RE.K(r0Var);
                    k10.u(D12);
                }
                C17631a aVar4 = (C17631a) D12;
                k10.P();
                k10.W(-502799846);
                boolean F10 = k10.F(configItem2) | ((i13 & 896) == 256);
                Object D13 = k10.D();
                if (F10 || D13 == aVar.a()) {
                    D13 = new L(lVar2, configItem2, r0Var);
                    k10.u(D13);
                }
                k10.P();
                W(aVar4, (C17631a) D13, "Clear override?", "Clear", k10, 3462);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new RE.M(configItem2, configState2, lVar2, i10));
        }
    }

    private static final boolean v0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void w0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N x0(C4899r0 r0Var) {
        w0(r0Var, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y0(C4899r0 r0Var) {
        w0(r0Var, false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z0(C17642l lVar, ConfigItem configItem, C4899r0 r0Var) {
        w0(r0Var, false);
        lVar.invoke(new a.c(configItem));
        return C16807N.f139792a;
    }
}
