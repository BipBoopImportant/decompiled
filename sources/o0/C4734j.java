package O0;

import E1.A;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.O;
import E1.a0;
import G1.C4504g;
import L1.x;
import Q0.C4796e;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.C5267b;
import c2.r;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import pI.C17752b;
import s0.C5834E;
import s0.C5861g;
import z1.C6271a;
import z1.C6272b;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\u001aì\u0001\u0010\u001d\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\"\u0010#\u001a9\u0010(\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020$2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u00002\b\b\u0002\u0010'\u001a\u00020\u0014H\u0007¢\u0006\u0004\b(\u0010)\u001a~\u00100\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0003ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001az\u00107\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00122\u0006\u00106\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b7\u00108\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lkotlin/Function1;", "Ls0/g;", "LXH/N;", "sheetContent", "Landroidx/compose/ui/d;", "modifier", "LO0/k;", "scaffoldState", "Lc2/h;", "sheetPeekHeight", "sheetMaxWidth", "Lp1/i1;", "sheetShape", "Lp1/v0;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "LO0/L0;", "snackbarHost", "containerColor", "contentColor", "Ls0/E;", "content", "a", "(LnI/q;Landroidx/compose/ui/d;LO0/k;FFLp1/i1;JJFFLnI/p;ZLnI/p;LnI/q;JJLnI/q;LU0/m;III)V", "LO0/F0;", "bottomSheetState", "snackbarHostState", "f", "(LO0/F0;LO0/L0;LU0/m;II)LO0/k;", "LO0/G0;", "initialValue", "confirmValueChange", "skipHiddenState", "g", "(LO0/G0;LnI/l;ZLU0/m;II)LO0/F0;", "state", "peekHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", "c", "(LO0/F0;FFZLp1/i1;JJFFLnI/p;LnI/q;LU0/m;II)V", "body", "bottomSheet", "", "sheetOffset", "sheetState", "b", "(Landroidx/compose/ui/d;LnI/p;LnI/p;LnI/p;LnI/p;LnI/a;LO0/F0;JJLU0/m;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.j  reason: case insensitive filesystem */
public final class C4734j {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f10863c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10864d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, float f10) {
            super(2);
            this.f10863c = qVar;
            this.f10864d = f10;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-459880832, i10, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:131)");
                }
                this.f10863c.invoke(D.e(0.0f, 0.0f, 0.0f, this.f10864d, 7, (Object) null), mVar, 0);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4736k f10865c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10866d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f10867e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f10868f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f10869g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f10870h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10871i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10872j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ float f10873k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10874l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10875m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4736k kVar, float f10, float f11, boolean z10, i1 i1Var, long j10, long j11, float f12, float f13, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10865c = kVar;
            this.f10866d = f10;
            this.f10867e = f11;
            this.f10868f = z10;
            this.f10869g = i1Var;
            this.f10870h = j10;
            this.f10871i = j11;
            this.f10872j = f12;
            this.f10873k = f13;
            this.f10874l = pVar;
            this.f10875m = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1961872927, i11, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:138)");
                }
                C4734j.c(this.f10865c.a(), this.f10866d, this.f10867e, this.f10868f, this.f10869g, this.f10870h, this.f10871i, this.f10872j, this.f10873k, this.f10874l, this.f10875m, mVar, 0, 0);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<L0, C4889m, Integer, C16807N> f10876c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4736k f10877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q<? super L0, ? super C4889m, ? super Integer, C16807N> qVar, C4736k kVar) {
            super(2);
            this.f10876c = qVar;
            this.f10877d = kVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(88659390, i10, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:132)");
                }
                this.f10876c.invoke(this.f10877d.b(), mVar, 0);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$d */
    static final class d extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4736k f10878c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4736k kVar) {
            super(0);
            this.f10878c = kVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f10878c.a().n());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.j$e */
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10879c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10880d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4736k f10881e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f10882f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f10883g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i1 f10884h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10885i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f10886j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ float f10887k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ float f10888l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10889m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f10890n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10891o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ q<L0, C4889m, Integer, C16807N> f10892p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f10893q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f10894r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f10895s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f10896t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f10897u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f10898v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, androidx.compose.ui.d dVar, C4736k kVar, float f10, float f11, i1 i1Var, long j10, long j11, float f12, float f13, p<? super C4889m, ? super Integer, C16807N> pVar, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super L0, ? super C4889m, ? super Integer, C16807N> qVar2, long j12, long j13, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar3, int i10, int i11, int i12) {
            super(2);
            this.f10879c = qVar;
            this.f10880d = dVar;
            this.f10881e = kVar;
            this.f10882f = f10;
            this.f10883g = f11;
            this.f10884h = i1Var;
            this.f10885i = j10;
            this.f10886j = j11;
            this.f10887k = f12;
            this.f10888l = f13;
            this.f10889m = pVar;
            this.f10890n = z10;
            this.f10891o = pVar2;
            this.f10892p = qVar2;
            this.f10893q = j12;
            this.f10894r = j13;
            this.f10895s = qVar3;
            this.f10896t = i10;
            this.f10897u = i11;
            this.f10898v = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            q<C5861g, C4889m, Integer, C16807N> qVar = this.f10879c;
            q<C5861g, C4889m, Integer, C16807N> qVar2 = qVar;
            C4734j.a(qVar2, this.f10880d, this.f10881e, this.f10882f, this.f10883g, this.f10884h, this.f10885i, this.f10886j, this.f10887k, this.f10888l, this.f10889m, this.f10890n, this.f10891o, this.f10892p, this.f10893q, this.f10894r, this.f10895s, mVar2, M0.a(this.f10896t | 1), M0.a(this.f10897u), this.f10898v);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$f */
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10899c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f10900d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f10901e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10902f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.d dVar, long j10, long j11, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f10899c = dVar;
            this.f10900d = j10;
            this.f10901e = j11;
            this.f10902f = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(398963586, i11, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                }
                P0.a(this.f10899c, (i1) null, this.f10900d, this.f10901e, 0.0f, 0.0f, (C5601g) null, this.f10902f, mVar, 0, 114);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "<name for destructuring parameter 0>", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$g */
    static final class g implements O {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ F0 f10903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f10904b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.j$g$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<a0> f10905c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f10906d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<a0> f10907e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ F0 f10908f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17631a<Float> f10909g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f10910h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ List<a0> f10911i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ List<a0> f10912j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ int f10913k;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: O0.j$g$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0161a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f10914a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        O0.G0[] r0 = O0.G0.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        O0.G0 r1 = O0.G0.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        O0.G0 r1 = O0.G0.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        O0.G0 r1 = O0.G0.Hidden     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f10914a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: O0.C4734j.g.a.C0161a.<clinit>():void");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<? extends a0> list, int i10, List<? extends a0> list2, F0 f02, C17631a<Float> aVar, int i11, List<? extends a0> list3, List<? extends a0> list4, int i12) {
                super(1);
                this.f10905c = list;
                this.f10906d = i10;
                this.f10907e = list2;
                this.f10908f = f02;
                this.f10909g = aVar;
                this.f10910h = i11;
                this.f10911i = list3;
                this.f10912j = list4;
                this.f10913k = i12;
            }

            public final void a(a0.a aVar) {
                Integer num;
                Integer num2;
                int e10;
                List<a0> list = this.f10905c;
                Integer num3 = null;
                if (list.isEmpty()) {
                    num = null;
                } else {
                    num = Integer.valueOf(list.get(0).E0());
                    int p10 = C16877v.p(list);
                    if (1 <= p10) {
                        int i10 = 1;
                        while (true) {
                            Integer valueOf = Integer.valueOf(list.get(i10).E0());
                            if (valueOf.compareTo(num) > 0) {
                                num = valueOf;
                            }
                            if (i10 == p10) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
                int max = Integer.max(0, (this.f10906d - (num != null ? num.intValue() : 0)) / 2);
                List<a0> list2 = this.f10907e;
                if (list2.isEmpty()) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(list2.get(0).E0());
                    int p11 = C16877v.p(list2);
                    if (1 <= p11) {
                        int i11 = 1;
                        while (true) {
                            Integer valueOf2 = Integer.valueOf(list2.get(i11).E0());
                            if (valueOf2.compareTo(num2) > 0) {
                                num2 = valueOf2;
                            }
                            if (i11 == p11) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
                int intValue = num2 != null ? num2.intValue() : 0;
                List<a0> list3 = this.f10907e;
                if (!list3.isEmpty()) {
                    num3 = Integer.valueOf(list3.get(0).z0());
                    int p12 = C16877v.p(list3);
                    if (1 <= p12) {
                        int i12 = 1;
                        while (true) {
                            Integer valueOf3 = Integer.valueOf(list3.get(i12).z0());
                            if (valueOf3.compareTo(num3) > 0) {
                                num3 = valueOf3;
                            }
                            if (i12 == p12) {
                                break;
                            }
                            i12++;
                        }
                    }
                }
                int intValue2 = num3 != null ? num3.intValue() : 0;
                int i13 = (this.f10906d - intValue) / 2;
                int i14 = C0161a.f10914a[this.f10908f.e().ordinal()];
                if (i14 == 1) {
                    e10 = C17752b.e(this.f10909g.invoke().floatValue());
                } else if (i14 == 2 || i14 == 3) {
                    e10 = this.f10910h;
                } else {
                    throw new t();
                }
                int i15 = e10 - intValue2;
                List<a0> list4 = this.f10911i;
                int i16 = this.f10913k;
                int size = list4.size();
                for (int i17 = 0; i17 < size; i17++) {
                    a0.a.m(aVar, list4.get(i17), 0, i16, 0.0f, 4, (Object) null);
                }
                List<a0> list5 = this.f10912j;
                int size2 = list5.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    a0.a.m(aVar, list5.get(i18), 0, 0, 0.0f, 4, (Object) null);
                }
                List<a0> list6 = this.f10905c;
                int size3 = list6.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    a0.a.m(aVar, list6.get(i19), max, 0, 0.0f, 4, (Object) null);
                }
                List<a0> list7 = this.f10907e;
                int size4 = list7.size();
                for (int i20 = 0; i20 < size4; i20++) {
                    a0.a.m(aVar, list7.get(i20), i13, i15, 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        g(F0 f02, C17631a<Float> aVar) {
            this.f10903a = f02;
            this.f10904b = aVar;
        }

        public final J i(K k10, List<? extends List<? extends H>> list, long j10) {
            Integer num;
            List<? extends List<? extends H>> list2 = list;
            List list3 = (List) list2.get(0);
            int i10 = 1;
            List list4 = (List) list2.get(1);
            List list5 = (List) list2.get(2);
            List list6 = (List) list2.get(3);
            int l10 = C5267b.l(j10);
            int k11 = C5267b.k(j10);
            long d10 = C5267b.d(j10, 0, 0, 0, 0, 10, (Object) null);
            ArrayList arrayList = new ArrayList(list5.size());
            int size = list5.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((H) list5.get(i11)).i0(d10));
            }
            ArrayList arrayList2 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(((H) list3.get(i12)).i0(d10));
            }
            if (arrayList2.isEmpty()) {
                num = null;
            } else {
                num = Integer.valueOf(((a0) arrayList2.get(0)).z0());
                int p10 = C16877v.p(arrayList2);
                if (1 <= p10) {
                    while (true) {
                        Integer valueOf = Integer.valueOf(((a0) arrayList2.get(i10)).z0());
                        if (valueOf.compareTo(num) > 0) {
                            num = valueOf;
                        }
                        if (i10 == p10) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            int intValue = num != null ? num.intValue() : 0;
            long d11 = C5267b.d(d10, 0, 0, 0, k11 - intValue, 7, (Object) null);
            ArrayList arrayList3 = new ArrayList(list4.size());
            int size3 = list4.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList3.add(((H) list4.get(i13)).i0(d11));
            }
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size4 = list6.size();
            for (int i14 = 0; i14 < size4; i14++) {
                arrayList4.add(((H) list6.get(i14)).i0(d10));
            }
            return K.v0(k10, l10, k11, (Map) null, new a(arrayList, l10, arrayList4, this.f10903a, this.f10904b, k11, arrayList3, arrayList2, intValue), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.j$h */
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10915c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10916d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10917e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10918f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10919g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<Float> f10920h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ F0 f10921i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f10922j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f10923k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f10924l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, C17631a<Float> aVar, F0 f02, long j10, long j11, int i10) {
            super(2);
            this.f10915c = dVar;
            this.f10916d = pVar;
            this.f10917e = pVar2;
            this.f10918f = pVar3;
            this.f10919g = pVar4;
            this.f10920h = aVar;
            this.f10921i = f02;
            this.f10922j = j10;
            this.f10923k = j11;
            this.f10924l = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4734j.b(this.f10915c, this.f10916d, this.f10917e, this.f10918f, this.f10919g, this.f10920h, this.f10921i, this.f10922j, this.f10923k, mVar, M0.a(this.f10924l | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc2/r;", "sheetSize", "Lc2/b;", "constraints", "LXH/v;", "LQ0/g;", "LO0/G0;", "a", "(JJ)LXH/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$i */
    static final class i extends C17544u implements p<r, C5267b, v<? extends Q0.g<G0>, ? extends G0>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f10925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10926d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O0.j$i$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f10927a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    O0.G0[] r0 = O0.G0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.G0 r1 = O0.G0.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    O0.G0 r1 = O0.G0.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    O0.G0 r1 = O0.G0.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f10927a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: O0.C4734j.i.a.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ0/h;", "LO0/G0;", "LXH/N;", "a", "(LQ0/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.j$i$b */
        static final class b extends C17544u implements C17642l<Q0.h<G0>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ F0 f10928c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ float f10929d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f10930e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ float f10931f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(F0 f02, float f10, float f11, float f12) {
                super(1);
                this.f10928c = f02;
                this.f10929d = f10;
                this.f10930e = f11;
                this.f10931f = f12;
            }

            public final void a(Q0.h<G0> hVar) {
                if (!this.f10928c.i()) {
                    hVar.a(G0.PartiallyExpanded, this.f10929d - this.f10930e);
                }
                float f10 = this.f10931f;
                if (f10 != this.f10930e) {
                    hVar.a(G0.Expanded, Math.max(this.f10929d - f10, 0.0f));
                }
                if (!this.f10928c.h()) {
                    hVar.a(G0.Hidden, this.f10929d);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Q0.h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(F0 f02, float f10) {
            super(2);
            this.f10925c = f02;
            this.f10926d = f10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
            if (r2.d(r4) != false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
            if (r2.d(r4) != false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
            if (r2.d(r4) != false) goto L_0x003c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final XH.v<Q0.g<O0.G0>, O0.G0> a(long r2, long r4) {
            /*
                r1 = this;
                int r4 = c2.C5267b.k(r4)
                float r4 = (float) r4
                int r2 = c2.r.g(r2)
                float r2 = (float) r2
                O0.j$i$b r3 = new O0.j$i$b
                O0.F0 r5 = r1.f10925c
                float r0 = r1.f10926d
                r3.<init>(r5, r4, r0, r2)
                Q0.g r2 = androidx.compose.material3.internal.b.a(r3)
                O0.F0 r3 = r1.f10925c
                Q0.e r3 = r3.d()
                java.lang.Object r3 = r3.x()
                O0.G0 r3 = (O0.G0) r3
                int[] r4 = O0.C4734j.i.a.f10927a
                int r5 = r3.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L_0x0071
                r5 = 2
                if (r4 == r5) goto L_0x0056
                r5 = 3
                if (r4 != r5) goto L_0x0050
                O0.G0 r4 = O0.G0.Expanded
                boolean r5 = r2.d(r4)
                if (r5 == 0) goto L_0x003e
            L_0x003c:
                r3 = r4
                goto L_0x007a
            L_0x003e:
                O0.G0 r4 = O0.G0.PartiallyExpanded
                boolean r5 = r2.d(r4)
                if (r5 == 0) goto L_0x0047
                goto L_0x003c
            L_0x0047:
                O0.G0 r4 = O0.G0.Hidden
                boolean r5 = r2.d(r4)
                if (r5 == 0) goto L_0x007a
                goto L_0x003c
            L_0x0050:
                XH.t r2 = new XH.t
                r2.<init>()
                throw r2
            L_0x0056:
                O0.G0 r4 = O0.G0.PartiallyExpanded
                boolean r5 = r2.d(r4)
                if (r5 == 0) goto L_0x005f
                goto L_0x003c
            L_0x005f:
                O0.G0 r4 = O0.G0.Expanded
                boolean r5 = r2.d(r4)
                if (r5 == 0) goto L_0x0068
                goto L_0x003c
            L_0x0068:
                O0.G0 r4 = O0.G0.Hidden
                boolean r5 = r2.d(r4)
                if (r5 == 0) goto L_0x007a
                goto L_0x003c
            L_0x0071:
                O0.G0 r4 = O0.G0.Hidden
                boolean r5 = r2.d(r4)
                if (r5 == 0) goto L_0x007a
                goto L_0x003c
            L_0x007a:
                XH.v r2 = XH.C16796C.a(r2, r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.C4734j.i.a(long, long):XH.v");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((r) obj).k(), ((C5267b) obj2).r());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$j  reason: collision with other inner class name */
    static final class C0162j extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10932c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f10933d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f10934e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Q f10935f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10936g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.j$j$a */
        static final class a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ F0 f10937c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f10938d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f10939e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f10940f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f10941g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Q f10942h;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: O0.j$j$a$a  reason: collision with other inner class name */
            static final class C0163a extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Q f10943c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ F0 f10944d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1", f = "BottomSheetScaffold.kt", l = {311}, m = "invokeSuspend")
                /* renamed from: O0.j$j$a$a$a  reason: collision with other inner class name */
                static final class C0164a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f10945c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ F0 f10946d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0164a(F0 f02, C17164e<? super C0164a> eVar) {
                        super(2, eVar);
                        this.f10946d = f02;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0164a(this.f10946d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C0164a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f10945c;
                        if (i10 == 0) {
                            y.b(obj);
                            F0 f02 = this.f10946d;
                            this.f10945c = 1;
                            if (f02.c(this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0163a(Q q10, F0 f02) {
                    super(0);
                    this.f10943c = q10;
                    this.f10944d = f02;
                }

                public final Boolean invoke() {
                    F0 unused = C16314k.d(this.f10943c, (C17168i) null, (T) null, new C0164a(this.f10944d, (C17164e<? super C0164a>) null), 3, (Object) null);
                    return Boolean.TRUE;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: O0.j$j$a$b */
            static final class b extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Q f10947c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ F0 f10948d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1", f = "BottomSheetScaffold.kt", l = {320}, m = "invokeSuspend")
                /* renamed from: O0.j$j$a$b$a  reason: collision with other inner class name */
                static final class C0165a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f10949c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ F0 f10950d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0165a(F0 f02, C17164e<? super C0165a> eVar) {
                        super(2, eVar);
                        this.f10950d = f02;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0165a(this.f10950d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C0165a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f10949c;
                        if (i10 == 0) {
                            y.b(obj);
                            F0 f02 = this.f10950d;
                            this.f10949c = 1;
                            if (f02.m(this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(Q q10, F0 f02) {
                    super(0);
                    this.f10947c = q10;
                    this.f10948d = f02;
                }

                public final Boolean invoke() {
                    F0 unused = C16314k.d(this.f10947c, (C17168i) null, (T) null, new C0165a(this.f10948d, (C17164e<? super C0165a>) null), 3, (Object) null);
                    return Boolean.TRUE;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: O0.j$j$a$c */
            static final class c extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Q f10951c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ F0 f10952d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1", f = "BottomSheetScaffold.kt", l = {327}, m = "invokeSuspend")
                /* renamed from: O0.j$j$a$c$a  reason: collision with other inner class name */
                static final class C0166a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f10953c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ F0 f10954d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0166a(F0 f02, C17164e<? super C0166a> eVar) {
                        super(2, eVar);
                        this.f10954d = f02;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C0166a(this.f10954d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C0166a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f10953c;
                        if (i10 == 0) {
                            y.b(obj);
                            F0 f02 = this.f10954d;
                            this.f10953c = 1;
                            if (f02.k(this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(Q q10, F0 f02) {
                    super(0);
                    this.f10951c = q10;
                    this.f10952d = f02;
                }

                public final Boolean invoke() {
                    F0 unused = C16314k.d(this.f10951c, (C17168i) null, (T) null, new C0166a(this.f10952d, (C17164e<? super C0166a>) null), 3, (Object) null);
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(F0 f02, boolean z10, String str, String str2, String str3, Q q10) {
                super(1);
                this.f10937c = f02;
                this.f10938d = z10;
                this.f10939e = str;
                this.f10940f = str2;
                this.f10941g = str3;
                this.f10942h = q10;
            }

            public final void a(x xVar) {
                F0 f02 = this.f10937c;
                boolean z10 = this.f10938d;
                String str = this.f10939e;
                String str2 = this.f10940f;
                String str3 = this.f10941g;
                Q q10 = this.f10942h;
                if (f02.d().o().a() > 1 && z10) {
                    G0 e10 = f02.e();
                    G0 g02 = G0.PartiallyExpanded;
                    if (e10 == g02) {
                        if (f02.d().r().invoke(G0.Expanded).booleanValue()) {
                            L1.v.p(xVar, str, new C0163a(q10, f02));
                        }
                    } else if (f02.d().r().invoke(g02).booleanValue()) {
                        L1.v.e(xVar, str2, new b(q10, f02));
                    }
                    if (!f02.h()) {
                        L1.v.m(xVar, str3, new c(q10, f02));
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0162j(p<? super C4889m, ? super Integer, C16807N> pVar, F0 f02, boolean z10, Q q10, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10932c = pVar;
            this.f10933d = f02;
            this.f10934e = z10;
            this.f10935f = q10;
            this.f10936g = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x010f, code lost:
            if (r6 == U0.C4889m.f14007a.a()) goto L_0x0111;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(U0.C4889m r19, int r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r2 & 3
                r4 = 2
                if (r3 != r4) goto L_0x0017
                boolean r3 = r19.l()
                if (r3 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r19.L()
                goto L_0x01b4
            L_0x0017:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x0026
                r3 = -1
                java.lang.String r4 = "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)"
                r5 = 390720907(0x1749ed8b, float:6.5246424E-25)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x0026:
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r3 = 0
                r4 = 0
                r5 = 1
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r2, r3, r5, r4)
                nI.p<U0.m, java.lang.Integer, XH.N> r4 = r0.f10932c
                O0.F0 r7 = r0.f10933d
                boolean r8 = r0.f10934e
                QJ.Q r12 = r0.f10935f
                nI.q<s0.g, U0.m, java.lang.Integer, XH.N> r13 = r0.f10936g
                androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r6 = r6.g()
                i1.c$a r14 = i1.C5437c.f24302a
                i1.c$b r9 = r14.k()
                r15 = 0
                E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r9, r1, r15)
                int r9 = U0.C4883j.a(r1, r15)
                U0.y r10 = r19.s()
                androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r1, r3)
                G1.g$a r16 = G1.C4504g.f6515W
                nI.a r11 = r16.a()
                U0.f r17 = r19.m()
                if (r17 != 0) goto L_0x0065
                U0.C4883j.c()
            L_0x0065:
                r19.I()
                boolean r17 = r19.i()
                if (r17 == 0) goto L_0x0072
                r1.p(r11)
                goto L_0x0075
            L_0x0072:
                r19.t()
            L_0x0075:
                U0.m r11 = U0.F1.a(r19)
                nI.p r5 = r16.c()
                U0.F1.c(r11, r6, r5)
                nI.p r5 = r16.e()
                U0.F1.c(r11, r10, r5)
                nI.p r5 = r16.b()
                boolean r6 = r11.i()
                if (r6 != 0) goto L_0x009f
                java.lang.Object r6 = r11.D()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
                if (r6 != 0) goto L_0x00ad
            L_0x009f:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                r11.u(r6)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                r11.w(r6, r5)
            L_0x00ad:
                nI.p r5 = r16.d()
                U0.F1.c(r11, r3, r5)
                s0.h r3 = s0.C5862h.f28810a
                r5 = -1168080147(0xffffffffba6082ed, float:-8.5644313E-4)
                r1.W(r5)
                if (r4 == 0) goto L_0x019d
                Q0.t$a r5 = Q0.t.f12046a
                int r5 = O0.C4749q0.f11443a
                int r5 = Q0.t.a(r5)
                java.lang.String r10 = Q0.u.a(r5, r1, r15)
                int r5 = O0.C4749q0.f11444b
                int r5 = Q0.t.a(r5)
                java.lang.String r11 = Q0.u.a(r5, r1, r15)
                int r5 = O0.C4749q0.f11446d
                int r5 = Q0.t.a(r5)
                java.lang.String r9 = Q0.u.a(r5, r1, r15)
                i1.c$b r5 = r14.g()
                androidx.compose.ui.d r2 = r3.b(r2, r5)
                boolean r5 = r1.V(r7)
                boolean r6 = r1.b(r8)
                r5 = r5 | r6
                boolean r6 = r1.V(r9)
                r5 = r5 | r6
                boolean r6 = r1.F(r12)
                r5 = r5 | r6
                boolean r6 = r1.V(r10)
                r5 = r5 | r6
                boolean r6 = r1.V(r11)
                r5 = r5 | r6
                java.lang.Object r6 = r19.D()
                if (r5 != 0) goto L_0x0111
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r5 = r5.a()
                if (r6 != r5) goto L_0x011a
            L_0x0111:
                O0.j$j$a r5 = new O0.j$j$a
                r6 = r5
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r1.u(r5)
            L_0x011a:
                nI.l r6 = (nI.C17642l) r6
                r5 = 1
                androidx.compose.ui.d r2 = L1.o.c(r2, r5, r6)
                i1.c r5 = r14.o()
                E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r15)
                int r6 = U0.C4883j.a(r1, r15)
                U0.y r7 = r19.s()
                androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
                nI.a r8 = r16.a()
                U0.f r9 = r19.m()
                if (r9 != 0) goto L_0x0142
                U0.C4883j.c()
            L_0x0142:
                r19.I()
                boolean r9 = r19.i()
                if (r9 == 0) goto L_0x014f
                r1.p(r8)
                goto L_0x0152
            L_0x014f:
                r19.t()
            L_0x0152:
                U0.m r8 = U0.F1.a(r19)
                nI.p r9 = r16.c()
                U0.F1.c(r8, r5, r9)
                nI.p r5 = r16.e()
                U0.F1.c(r8, r7, r5)
                nI.p r5 = r16.b()
                boolean r7 = r8.i()
                if (r7 != 0) goto L_0x017c
                java.lang.Object r7 = r8.D()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
                if (r7 != 0) goto L_0x018a
            L_0x017c:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8.u(r7)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r8.w(r6, r5)
            L_0x018a:
                nI.p r5 = r16.d()
                U0.F1.c(r8, r2, r5)
                androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
                r4.invoke(r1, r2)
                r19.x()
            L_0x019d:
                r19.P()
                r2 = 6
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r13.invoke(r3, r1, r2)
                r19.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x01b4
                U0.C4895p.R()
            L_0x01b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.C4734j.C0162j.a(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.j$k */
    static final class k extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f10955c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10956d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f10957e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f10958f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f10959g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f10960h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10961i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10962j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ float f10963k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10964l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f10965m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f10966n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f10967o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(F0 f02, float f10, float f11, boolean z10, i1 i1Var, long j10, long j11, float f12, float f13, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11) {
            super(2);
            this.f10955c = f02;
            this.f10956d = f10;
            this.f10957e = f11;
            this.f10958f = z10;
            this.f10959g = i1Var;
            this.f10960h = j10;
            this.f10961i = j11;
            this.f10962j = f12;
            this.f10963k = f13;
            this.f10964l = pVar;
            this.f10965m = qVar;
            this.f10966n = i10;
            this.f10967o = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4734j.c(this.f10955c, this.f10956d, this.f10957e, this.f10958f, this.f10959g, this.f10960h, this.f10961i, this.f10962j, this.f10963k, this.f10964l, this.f10965m, mVar, M0.a(this.f10966n | 1), M0.a(this.f10967o));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.j$l */
    static final class l extends C17544u implements C17642l<Float, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f10968c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f10969d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1", f = "BottomSheetScaffold.kt", l = {236}, m = "invokeSuspend")
        /* renamed from: O0.j$l$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f10970c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f10971d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f10972e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(F0 f02, float f10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f10971d = f02;
                this.f10972e = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f10971d, this.f10972e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f10970c;
                if (i10 == 0) {
                    y.b(obj);
                    F0 f02 = this.f10971d;
                    float f11 = this.f10972e;
                    this.f10970c = 1;
                    if (f02.o(f11, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Q q10, F0 f02) {
            super(1);
            this.f10968c = q10;
            this.f10969d = f02;
        }

        public final void a(float f10) {
            F0 unused = C16314k.d(this.f10968c, (C17168i) null, (T) null, new a(this.f10969d, f10, (C17164e<? super a>) null), 3, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.j$m */
    static final class m extends C17544u implements C17642l<G0, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f10973c = new m();

        m() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G0 g02) {
            return Boolean.TRUE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v47, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r31, androidx.compose.ui.d r32, O0.C4736k r33, float r34, float r35, p1.i1 r36, long r37, long r39, float r41, float r42, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r43, boolean r44, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r45, nI.q<? super O0.L0, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r46, long r47, long r49, nI.q<? super s0.C5834E, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r51, U0.C4889m r52, int r53, int r54, int r55) {
        /*
            r15 = r51
            r14 = r53
            r13 = r54
            r12 = r55
            r0 = -1523924135(0xffffffffa52ac359, float:-1.4811336E-16)
            r1 = r52
            U0.m r0 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r14 | 6
            r4 = r1
            r1 = r31
            goto L_0x002f
        L_0x001b:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x002c
            r1 = r31
            boolean r4 = r0.F(r1)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r14
            goto L_0x002f
        L_0x002c:
            r1 = r31
            r4 = r14
        L_0x002f:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r8 = r32
            goto L_0x004a
        L_0x0038:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x0035
            r8 = r32
            boolean r9 = r0.V(r8)
            if (r9 == 0) goto L_0x0047
            r9 = 32
            goto L_0x0049
        L_0x0047:
            r9 = 16
        L_0x0049:
            r4 = r4 | r9
        L_0x004a:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0064
            r9 = r12 & 4
            if (r9 != 0) goto L_0x005d
            r9 = r33
            boolean r16 = r0.V(r9)
            if (r16 == 0) goto L_0x005f
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005d:
            r9 = r33
        L_0x005f:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r4 = r4 | r16
            goto L_0x0066
        L_0x0064:
            r9 = r33
        L_0x0066:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r2 = r34
            goto L_0x0086
        L_0x0073:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0070
            r2 = r34
            boolean r19 = r0.c(r2)
            if (r19 == 0) goto L_0x0082
            r19 = r18
            goto L_0x0084
        L_0x0082:
            r19 = r17
        L_0x0084:
            r4 = r4 | r19
        L_0x0086:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0093
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r3 = r35
            goto L_0x00a6
        L_0x0093:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0090
            r3 = r35
            boolean r23 = r0.c(r3)
            if (r23 == 0) goto L_0x00a2
            r23 = r21
            goto L_0x00a4
        L_0x00a2:
            r23 = r20
        L_0x00a4:
            r4 = r4 | r23
        L_0x00a6:
            r23 = 196608(0x30000, float:2.75506E-40)
            r23 = r14 & r23
            r24 = 65536(0x10000, float:9.18355E-41)
            if (r23 != 0) goto L_0x00c2
            r23 = r12 & 32
            r6 = r36
            if (r23 != 0) goto L_0x00bd
            boolean r25 = r0.V(r6)
            if (r25 == 0) goto L_0x00bd
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r25 = r24
        L_0x00bf:
            r4 = r4 | r25
            goto L_0x00c4
        L_0x00c2:
            r6 = r36
        L_0x00c4:
            r25 = 1572864(0x180000, float:2.204052E-39)
            r26 = r14 & r25
            if (r26 != 0) goto L_0x00de
            r26 = r12 & 64
            r7 = r37
            if (r26 != 0) goto L_0x00d9
            boolean r27 = r0.e(r7)
            if (r27 == 0) goto L_0x00d9
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r4 = r4 | r27
            goto L_0x00e0
        L_0x00de:
            r7 = r37
        L_0x00e0:
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x00fa
            r10 = r12 & 128(0x80, float:1.794E-43)
            r11 = r39
            if (r10 != 0) goto L_0x00f5
            boolean r28 = r0.e(r11)
            if (r28 == 0) goto L_0x00f5
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r4 = r4 | r28
            goto L_0x00fc
        L_0x00fa:
            r11 = r39
        L_0x00fc:
            r12 = r55
            r11 = r12 & 256(0x100, float:3.59E-43)
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            if (r11 == 0) goto L_0x0109
            r4 = r4 | r28
            r10 = r41
            goto L_0x011c
        L_0x0109:
            r28 = r14 & r28
            r10 = r41
            if (r28 != 0) goto L_0x011c
            boolean r29 = r0.c(r10)
            if (r29 == 0) goto L_0x0118
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0118:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r4 = r4 | r29
        L_0x011c:
            r1 = r12 & 512(0x200, float:7.175E-43)
            r29 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x0127
            r4 = r4 | r29
            r2 = r42
            goto L_0x013a
        L_0x0127:
            r29 = r14 & r29
            r2 = r42
            if (r29 != 0) goto L_0x013a
            boolean r29 = r0.c(r2)
            if (r29 == 0) goto L_0x0136
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x0136:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0138:
            r4 = r4 | r29
        L_0x013a:
            r2 = r12 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0143
            r22 = r13 | 6
            r3 = r43
            goto L_0x0159
        L_0x0143:
            r29 = r13 & 6
            r3 = r43
            if (r29 != 0) goto L_0x0157
            boolean r29 = r0.F(r3)
            if (r29 == 0) goto L_0x0152
            r22 = 4
            goto L_0x0154
        L_0x0152:
            r22 = 2
        L_0x0154:
            r22 = r13 | r22
            goto L_0x0159
        L_0x0157:
            r22 = r13
        L_0x0159:
            r3 = r12 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0162
            r22 = r22 | 48
        L_0x015f:
            r6 = r22
            goto L_0x0176
        L_0x0162:
            r29 = r13 & 48
            r6 = r44
            if (r29 != 0) goto L_0x015f
            boolean r29 = r0.b(r6)
            if (r29 == 0) goto L_0x0171
            r23 = 32
            goto L_0x0173
        L_0x0171:
            r23 = 16
        L_0x0173:
            r22 = r22 | r23
            goto L_0x015f
        L_0x0176:
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017c:
            r8 = r45
            goto L_0x0192
        L_0x017f:
            r8 = r13 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x017c
            r8 = r45
            boolean r22 = r0.F(r8)
            if (r22 == 0) goto L_0x018e
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x0190
        L_0x018e:
            r27 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r6 = r6 | r27
        L_0x0192:
            r8 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x019b
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0198:
            r9 = r46
            goto L_0x01ab
        L_0x019b:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0198
            r9 = r46
            boolean r22 = r0.F(r9)
            if (r22 == 0) goto L_0x01a9
            r17 = r18
        L_0x01a9:
            r6 = r6 | r17
        L_0x01ab:
            r9 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x01c3
            r9 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r9 != 0) goto L_0x01be
            r9 = r47
            boolean r17 = r0.e(r9)
            if (r17 == 0) goto L_0x01c0
            r20 = r21
            goto L_0x01c0
        L_0x01be:
            r9 = r47
        L_0x01c0:
            r6 = r6 | r20
            goto L_0x01c5
        L_0x01c3:
            r9 = r47
        L_0x01c5:
            r17 = 196608(0x30000, float:2.75506E-40)
            r17 = r13 & r17
            r18 = 32768(0x8000, float:4.5918E-41)
            if (r17 != 0) goto L_0x01e2
            r17 = r12 & r18
            r9 = r49
            if (r17 != 0) goto L_0x01dd
            boolean r17 = r0.e(r9)
            if (r17 == 0) goto L_0x01dd
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01df
        L_0x01dd:
            r17 = r24
        L_0x01df:
            r6 = r6 | r17
            goto L_0x01e4
        L_0x01e2:
            r9 = r49
        L_0x01e4:
            r17 = r12 & r24
            if (r17 == 0) goto L_0x01eb
            r6 = r6 | r25
            goto L_0x01fc
        L_0x01eb:
            r17 = r13 & r25
            if (r17 != 0) goto L_0x01fc
            boolean r17 = r0.F(r15)
            if (r17 == 0) goto L_0x01f8
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fa
        L_0x01f8:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x01fa:
            r6 = r6 | r17
        L_0x01fc:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r4 & r17
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x0239
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r6
            r10 = 599186(0x92492, float:8.39638E-40)
            if (r9 != r10) goto L_0x0239
            boolean r9 = r0.l()
            if (r9 != 0) goto L_0x0216
            goto L_0x0239
        L_0x0216:
            r0.L()
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r9 = r39
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            r15 = r45
            r16 = r46
            r17 = r47
            r19 = r49
            goto L_0x047d
        L_0x0239:
            r0.G()
            r9 = r14 & 1
            if (r9 == 0) goto L_0x029a
            boolean r9 = r0.O()
            if (r9 == 0) goto L_0x0247
            goto L_0x029a
        L_0x0247:
            r0.L()
            r1 = r12 & 4
            if (r1 == 0) goto L_0x0250
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0250:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0258
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x0258:
            r1 = r12 & 64
            if (r1 == 0) goto L_0x0260
            r1 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r1
        L_0x0260:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0268
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r1
        L_0x0268:
            r1 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0270
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r1
        L_0x0270:
            r1 = r12 & r18
            if (r1 == 0) goto L_0x0278
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r1
        L_0x0278:
            r1 = r32
            r2 = r33
            r9 = r34
            r16 = r35
            r3 = r36
            r21 = r39
            r11 = r41
            r7 = r43
            r8 = r44
            r20 = r45
            r10 = r46
            r18 = r47
            r23 = r49
            r12 = r4
            r13 = r6
            r4 = r37
            r6 = r42
            goto L_0x039c
        L_0x029a:
            if (r5 == 0) goto L_0x029f
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x02a1
        L_0x029f:
            r5 = r32
        L_0x02a1:
            r9 = r12 & 4
            r10 = 0
            if (r9 == 0) goto L_0x02b1
            r9 = 0
            r32 = r5
            r5 = 3
            O0.k r5 = f(r10, r10, r0, r9, r5)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02b5
        L_0x02b1:
            r32 = r5
            r5 = r33
        L_0x02b5:
            if (r16 == 0) goto L_0x02be
            O0.i r9 = O0.C4732i.f10831a
            float r9 = r9.g()
            goto L_0x02c0
        L_0x02be:
            r9 = r34
        L_0x02c0:
            if (r19 == 0) goto L_0x02c9
            O0.i r16 = O0.C4732i.f10831a
            float r16 = r16.f()
            goto L_0x02cb
        L_0x02c9:
            r16 = r35
        L_0x02cb:
            r19 = r12 & 32
            r10 = 6
            r33 = r5
            if (r19 == 0) goto L_0x02de
            O0.i r5 = O0.C4732i.f10831a
            p1.i1 r5 = r5.d(r0, r10)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r19
            goto L_0x02e0
        L_0x02de:
            r5 = r36
        L_0x02e0:
            r19 = r12 & 64
            r34 = r5
            if (r19 == 0) goto L_0x02f5
            O0.i r5 = O0.C4732i.f10831a
            long r21 = r5.b(r0, r10)
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r5
            r19 = r4
            r4 = r21
            goto L_0x02f9
        L_0x02f5:
            r19 = r4
            r4 = r37
        L_0x02f9:
            r10 = r12 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x030b
            int r10 = r19 >> 18
            r10 = r10 & 14
            long r21 = O0.C4755u.c(r4, r0, r10)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r10 = r19 & r10
            goto L_0x030f
        L_0x030b:
            r21 = r39
            r10 = r19
        L_0x030f:
            if (r11 == 0) goto L_0x0318
            r11 = 0
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            goto L_0x031a
        L_0x0318:
            r11 = r41
        L_0x031a:
            if (r1 == 0) goto L_0x0323
            O0.i r1 = O0.C4732i.f10831a
            float r1 = r1.c()
            goto L_0x0325
        L_0x0323:
            r1 = r42
        L_0x0325:
            if (r2 == 0) goto L_0x032e
            O0.x r2 = O0.C4761x.f11592a
            nI.p r2 = r2.a()
            goto L_0x0330
        L_0x032e:
            r2 = r43
        L_0x0330:
            if (r3 == 0) goto L_0x0334
            r3 = 1
            goto L_0x0336
        L_0x0334:
            r3 = r44
        L_0x0336:
            if (r7 == 0) goto L_0x033b
            r20 = 0
            goto L_0x033d
        L_0x033b:
            r20 = r45
        L_0x033d:
            if (r8 == 0) goto L_0x0346
            O0.x r7 = O0.C4761x.f11592a
            nI.q r7 = r7.b()
            goto L_0x0348
        L_0x0346:
            r7 = r46
        L_0x0348:
            r8 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x0362
            O0.X r8 = O0.X.f10101a
            r36 = r1
            r1 = 6
            O0.t r1 = r8.a(r0, r1)
            long r23 = r1.G()
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = r6 & r1
            r35 = r2
            r1 = r23
            goto L_0x0368
        L_0x0362:
            r36 = r1
            r35 = r2
            r1 = r47
        L_0x0368:
            r8 = r12 & r18
            if (r8 == 0) goto L_0x038b
            int r8 = r6 >> 12
            r8 = r8 & 14
            long r18 = O0.C4755u.c(r1, r0, r8)
            r8 = -458753(0xfffffffffff8ffff, float:NaN)
            r6 = r6 & r8
            r8 = r3
            r13 = r6
            r12 = r10
            r23 = r18
            r3 = r34
            r6 = r36
            r18 = r1
            r10 = r7
            r1 = r32
            r2 = r33
        L_0x0388:
            r7 = r35
            goto L_0x039c
        L_0x038b:
            r23 = r49
            r18 = r1
            r8 = r3
            r13 = r6
            r12 = r10
            r1 = r32
            r2 = r33
            r3 = r34
            r6 = r36
            r10 = r7
            goto L_0x0388
        L_0x039c:
            r0.y()
            boolean r25 = U0.C4895p.J()
            if (r25 == 0) goto L_0x03b0
            r14 = -1523924135(0xffffffffa52ac359, float:-1.4811336E-16)
            r46 = r1
            java.lang.String r1 = "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:127)"
            U0.C4895p.S(r14, r12, r13, r1)
            goto L_0x03b2
        L_0x03b0:
            r46 = r1
        L_0x03b2:
            O0.F0 r1 = r2.a()
            O0.j$a r14 = new O0.j$a
            r14.<init>(r15, r9)
            r15 = 54
            r47 = r1
            r1 = -459880832(0xffffffffe496c680, float:-2.225052E22)
            r25 = r13
            r13 = 1
            c1.a r1 = c1.c.e(r1, r13, r14, r0, r15)
            O0.j$b r13 = new O0.j$b
            r32 = r13
            r33 = r2
            r34 = r9
            r35 = r16
            r36 = r8
            r37 = r3
            r38 = r4
            r40 = r21
            r42 = r11
            r43 = r6
            r44 = r7
            r45 = r31
            r32.<init>(r33, r34, r35, r36, r37, r38, r40, r42, r43, r44, r45)
            r14 = 54
            r15 = 1961872927(0x74efce1f, float:1.5199458E32)
            r45 = r3
            r3 = 1
            c1.a r13 = c1.c.e(r15, r3, r13, r0, r14)
            O0.j$c r14 = new O0.j$c
            r14.<init>(r10, r2)
            r15 = 54
            r48 = r4
            r4 = 88659390(0x548d5be, float:9.443213E-36)
            c1.a r4 = c1.c.e(r4, r3, r14, r0, r15)
            r5 = r12 & 896(0x380, float:1.256E-42)
            r5 = r5 ^ 384(0x180, float:5.38E-43)
            r14 = 256(0x100, float:3.59E-43)
            if (r5 <= r14) goto L_0x0410
            boolean r5 = r0.V(r2)
            if (r5 != 0) goto L_0x0416
        L_0x0410:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != r14) goto L_0x0415
            goto L_0x0416
        L_0x0415:
            r3 = 0
        L_0x0416:
            java.lang.Object r5 = r0.D()
            if (r3 != 0) goto L_0x0424
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x042c
        L_0x0424:
            O0.j$d r5 = new O0.j$d
            r5.<init>(r2)
            r0.u(r5)
        L_0x042c:
            r3 = r5
            nI.a r3 = (nI.C17631a) r3
            int r5 = r12 >> 3
            r5 = r5 & 14
            r5 = r5 | 28032(0x6d80, float:3.9281E-41)
            int r12 = r25 >> 3
            r12 = r12 & 112(0x70, float:1.57E-43)
            r5 = r5 | r12
            int r12 = r25 << 9
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r12
            r5 = r5 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r14
            r5 = r5 | r12
            r32 = r46
            r33 = r20
            r34 = r1
            r35 = r13
            r36 = r4
            r37 = r3
            r38 = r47
            r39 = r18
            r41 = r23
            r43 = r0
            r44 = r5
            b(r32, r33, r34, r35, r36, r37, r38, r39, r41, r43, r44)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0466
            U0.C4895p.R()
        L_0x0466:
            r3 = r2
            r12 = r6
            r13 = r7
            r14 = r8
            r4 = r9
            r5 = r16
            r17 = r18
            r15 = r20
            r19 = r23
            r6 = r45
            r2 = r46
            r7 = r48
            r16 = r10
            r9 = r21
        L_0x047d:
            U0.Y0 r1 = r0.n()
            if (r1 == 0) goto L_0x049d
            O0.j$e r0 = new O0.j$e
            r32 = r0
            r30 = r1
            r1 = r31
            r21 = r51
            r22 = r53
            r23 = r54
            r24 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24)
            r1 = r32
            r0 = r30
            r0.a(r1)
        L_0x049d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4734j.a(nI.q, androidx.compose.ui.d, O0.k, float, float, p1.i1, long, long, float, float, nI.p, boolean, nI.p, nI.q, long, long, nI.q, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void b(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, C17631a<Float> aVar, F0 f02, long j10, long j11, C4889m mVar, int i10) {
        int i11;
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar3;
        p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar4;
        C17631a<Float> aVar2 = aVar;
        F0 f03 = f02;
        int i12 = i10;
        C4889m k10 = mVar.k(-1651214892);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(dVar) ? 4 : 2) | i12;
        } else {
            androidx.compose.ui.d dVar2 = dVar;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar5) ? 32 : 16;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar2;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar8) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar7) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.V(f03) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        long j12 = j10;
        if ((12582912 & i12) == 0) {
            i11 |= k10.e(j12) ? 8388608 : 4194304;
        }
        long j13 = j11;
        if ((100663296 & i12) == 0) {
            i11 |= k10.e(j13) ? 67108864 : 33554432;
        }
        int i13 = i11;
        if ((38347923 & i13) != 38347922 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1651214892, i13, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)");
            }
            int i14 = i13;
            boolean z10 = true;
            List q10 = C16877v.q(pVar5 == null ? C4761x.f11592a.c() : pVar5, c1.c.e(398963586, true, new f(dVar, j10, j11, pVar2), k10, 54), pVar3, pVar7);
            boolean z11 = (i14 & 3670016) == 1048576;
            if ((i14 & ImageMetadata.JPEG_GPS_COORDINATES) != 131072) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new g(f03, aVar2);
                k10.u(D10);
            }
            O o10 = (O) D10;
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            p<C4889m, Integer, C16807N> b10 = A.b(q10);
            boolean V10 = k10.V(o10);
            Object D11 = k10.D();
            if (V10 || D11 == C4889m.f14007a.a()) {
                D11 = E1.Q.a(o10);
                k10.u(D11);
            }
            I i15 = (I) D11;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar3);
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
            F1.c(a12, i15, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar4.d());
            b10.invoke(k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new h(dVar, pVar, pVar2, pVar3, pVar4, aVar, f02, j10, j11, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void c(F0 f02, float f10, float f11, boolean z10, i1 i1Var, long j10, long j11, float f12, float f13, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        C4889m mVar2;
        Object obj;
        androidx.compose.ui.d dVar;
        F0 f03 = f02;
        float f14 = f10;
        float f15 = f11;
        boolean z11 = z10;
        int i14 = i10;
        C4889m k10 = mVar.k(721467526);
        if ((i14 & 6) == 0) {
            i12 = (k10.V(f03) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.c(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.c(f15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.b(z11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        i1 i1Var2 = i1Var;
        if ((i14 & 24576) == 0) {
            i12 |= k10.V(i1Var2) ? 16384 : 8192;
        }
        long j12 = j10;
        if ((196608 & i14) == 0) {
            i12 |= k10.e(j12) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        long j13 = j11;
        if ((1572864 & i14) == 0) {
            i12 |= k10.e(j13) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((i14 & 12582912) == 0) {
            i12 |= k10.c(f12) ? 8388608 : 4194304;
        } else {
            float f16 = f12;
        }
        float f17 = f13;
        if ((i14 & 100663296) == 0) {
            i12 |= k10.c(f17) ? 67108864 : 33554432;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        if ((i14 & 805306368) == 0) {
            i12 |= k10.F(pVar2) ? 536870912 : 268435456;
        }
        q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        if ((i11 & 6) == 0) {
            i13 = i11 | (k10.F(qVar2) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && k10.l()) {
            k10.L();
            mVar2 = k10;
        } else {
            if (C4895p.J()) {
                C4895p.S(721467526, i12, i13, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)");
            }
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            p0.v vVar = p0.v.Vertical;
            float H12 = ((c2.d) k10.Q(C5100f0.e())).H1(f14);
            k10.W(-1831611516);
            if (z11) {
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                boolean V10 = k10.V(f02.d());
                Object D11 = k10.D();
                if (V10 || D11 == aVar.a()) {
                    D11 = E0.a(f03, vVar, new l(a10, f03));
                    k10.u(D11);
                }
                obj = null;
                dVar = androidx.compose.ui.input.nestedscroll.a.b(aVar2, (C6271a) D11, (C6272b) null, 2, (Object) null);
            } else {
                obj = null;
                dVar = androidx.compose.ui.d.f18749a;
            }
            k10.P();
            androidx.compose.ui.d s10 = androidx.compose.foundation.layout.J.n(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.J.A(androidx.compose.ui.d.f18749a, 0.0f, f15, 1, obj), 0.0f, 1, obj), f14, 0.0f, 2, obj).s(dVar);
            C4796e<G0> d10 = f02.d();
            boolean c10 = ((i12 & 14) == 4) | k10.c(H12);
            Object D12 = k10.D();
            if (c10 || D12 == aVar.a()) {
                D12 = new i(f03, H12);
                k10.u(D12);
            }
            androidx.compose.ui.d e10 = androidx.compose.material3.internal.b.e(androidx.compose.material3.internal.b.h(s10, d10, vVar, (p) D12), f02.d(), vVar, z10, false, (r0.m) null, 24, (Object) null);
            C4889m mVar3 = k10;
            C5264a e11 = c1.c.e(390720907, true, new C0162j(pVar, f02, z10, a10, qVar), mVar3, 54);
            int i15 = i12 >> 9;
            int i16 = (i15 & 112) | 12582912 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & ImageMetadata.JPEG_GPS_COORDINATES);
            mVar2 = mVar3;
            P0.a(e10, i1Var, j10, j11, f12, f13, (C5601g) null, e11, mVar2, i16, 64);
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            k kVar = r0;
            k kVar2 = new k(f02, f10, f11, z10, i1Var, j10, j11, f12, f13, pVar, qVar, i10, i11);
            n10.a(kVar);
        }
    }

    public static final C4736k f(F0 f02, L0 l02, C4889m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f02 = g((G0) null, (C17642l<? super G0, Boolean>) null, false, mVar, 0, 7);
        }
        if ((i11 & 2) != 0) {
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new L0();
                mVar.u(D10);
            }
            l02 = (L0) D10;
        }
        if (C4895p.J()) {
            C4895p.S(-1474606134, i10, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)");
        }
        boolean z10 = false;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && mVar.V(f02)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) > 32 && mVar.V(l02)) || (i10 & 48) == 32) {
            z10 = true;
        }
        boolean z12 = z11 | z10;
        Object D11 = mVar.D();
        if (z12 || D11 == C4889m.f14007a.a()) {
            D11 = new C4736k(f02, l02);
            mVar.u(D11);
        }
        C4736k kVar = (C4736k) D11;
        if (C4895p.J()) {
            C4895p.R();
        }
        return kVar;
    }

    public static final F0 g(G0 g02, C17642l<? super G0, Boolean> lVar, boolean z10, C4889m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            g02 = G0.PartiallyExpanded;
        }
        G0 g03 = g02;
        if ((i11 & 2) != 0) {
            lVar = m.f10973c;
        }
        C17642l<? super G0, Boolean> lVar2 = lVar;
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if (C4895p.J()) {
            C4895p.S(678511581, i10, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        F0 d10 = E0.d(false, lVar2, g03, z11, mVar, (i10 & 112) | ((i10 << 6) & 896) | ((i10 << 3) & 7168), 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        return d10;
    }
}
