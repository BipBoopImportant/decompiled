package I0;

import E1.J;
import E1.a0;
import E1.m0;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.J0;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import c2.C5267b;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5834E;
import s0.C5848T;
import s0.C5850V;
import s0.C5851W;
import s0.C5861g;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0002\u0010&\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aü\u0001\u0010(\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001av\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0000X\u0004¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b3\u00104\"\u0014\u00107\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u00106\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"LI0/G;", "drawerState", "LI0/G0;", "snackbarHostState", "LI0/z0;", "g", "(LI0/G;LI0/G0;LU0/m;II)LI0/z0;", "Ls0/T;", "contentWindowInsets", "Landroidx/compose/ui/d;", "modifier", "scaffoldState", "Lkotlin/Function0;", "LXH/N;", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "LI0/O;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Ls0/g;", "drawerContent", "drawerGesturesEnabled", "Lp1/i1;", "drawerShape", "Lc2/h;", "drawerElevation", "Lp1/v0;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Ls0/E;", "content", "b", "(Ls0/T;Landroidx/compose/ui/d;LI0/z0;LnI/p;LnI/p;LnI/q;LnI/p;IZLnI/q;ZLp1/i1;FJJJJJLnI/q;LU0/m;III)V", "a", "(Landroidx/compose/ui/d;LI0/z0;LnI/p;LnI/p;LnI/q;LnI/p;IZLnI/q;ZLp1/i1;FJJJJJLnI/q;LU0/m;III)V", "isFabDocked", "fabPosition", "snackbar", "fab", "c", "(ZILnI/p;LnI/q;LnI/p;LnI/p;Ls0/T;LnI/p;LU0/m;I)V", "LU0/I0;", "LI0/N;", "LU0/I0;", "f", "()LU0/I0;", "LocalFabPlacement", "F", "FabSpacing", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.x0  reason: case insensitive filesystem */
public final class C4592x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<N> f8416a = C4910x.f(a.f8418c);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float f8417b = h.B((float) 16);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI0/N;", "b", "()LI0/N;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.x0$a */
    static final class a extends C17544u implements C17631a<N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f8418c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final N invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.x0$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<androidx.compose.ui.d, C4889m, Integer, C16807N> f8419c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f8419c = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1409196448, i10, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:242)");
                }
                this.f8419c.invoke(androidx.compose.ui.d.f18749a, mVar, 54);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.x0$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5848T f8420c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f8421d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4596z0 f8422e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8423f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8424g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q<G0, C4889m, Integer, C16807N> f8425h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8426i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f8427j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f8428k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f8429l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f8430m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ i1 f8431n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ float f8432o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f8433p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f8434q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f8435r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f8436s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f8437t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f8438u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f8439v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f8440w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f8441x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5848T t10, androidx.compose.ui.d dVar, C4596z0 z0Var, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super G0, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar3, int i10, boolean z10, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar2, boolean z11, i1 i1Var, float f10, long j10, long j11, long j12, long j13, long j14, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar3, int i11, int i12, int i13) {
            super(2);
            this.f8420c = t10;
            this.f8421d = dVar;
            this.f8422e = z0Var;
            this.f8423f = pVar;
            this.f8424g = pVar2;
            this.f8425h = qVar;
            this.f8426i = pVar3;
            this.f8427j = i10;
            this.f8428k = z10;
            this.f8429l = qVar2;
            this.f8430m = z11;
            this.f8431n = i1Var;
            this.f8432o = f10;
            this.f8433p = j10;
            this.f8434q = j11;
            this.f8435r = j12;
            this.f8436s = j13;
            this.f8437t = j14;
            this.f8438u = qVar3;
            this.f8439v = i11;
            this.f8440w = i12;
            this.f8441x = i13;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C5848T t10 = this.f8420c;
            C5848T t11 = t10;
            C4592x0.b(t11, this.f8421d, this.f8422e, this.f8423f, this.f8424g, this.f8425h, this.f8426i, this.f8427j, this.f8428k, this.f8429l, this.f8430m, this.f8431n, this.f8432o, this.f8433p, this.f8434q, this.f8435r, this.f8436s, this.f8437t, this.f8438u, mVar2, M0.a(this.f8439v | 1), M0.a(this.f8440w), this.f8441x);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.x0$d */
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f8442c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4596z0 f8443d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8444e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8445f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<G0, C4889m, Integer, C16807N> f8446g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8447h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f8448i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f8449j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ q<C5861g, C4889m, Integer, C16807N> f8450k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f8451l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i1 f8452m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ float f8453n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ long f8454o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f8455p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f8456q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f8457r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f8458s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f8459t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f8460u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f8461v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ int f8462w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.d dVar, C4596z0 z0Var, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, q<? super G0, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar3, int i10, boolean z10, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar2, boolean z11, i1 i1Var, float f10, long j10, long j11, long j12, long j13, long j14, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar3, int i11, int i12, int i13) {
            super(2);
            this.f8442c = dVar;
            this.f8443d = z0Var;
            this.f8444e = pVar;
            this.f8445f = pVar2;
            this.f8446g = qVar;
            this.f8447h = pVar3;
            this.f8448i = i10;
            this.f8449j = z10;
            this.f8450k = qVar2;
            this.f8451l = z11;
            this.f8452m = i1Var;
            this.f8453n = f10;
            this.f8454o = j10;
            this.f8455p = j11;
            this.f8456q = j12;
            this.f8457r = j13;
            this.f8458s = j14;
            this.f8459t = qVar3;
            this.f8460u = i11;
            this.f8461v = i12;
            this.f8462w = i13;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            androidx.compose.ui.d dVar = this.f8442c;
            androidx.compose.ui.d dVar2 = dVar;
            C4592x0.a(dVar2, this.f8443d, this.f8444e, this.f8445f, this.f8446g, this.f8447h, this.f8448i, this.f8449j, this.f8450k, this.f8451l, this.f8452m, this.f8453n, this.f8454o, this.f8455p, this.f8456q, this.f8457r, this.f8458s, this.f8459t, mVar2, M0.a(this.f8460u | 1), M0.a(this.f8461v), this.f8462w);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d;", "childModifier", "LXH/N;", "a", "(Landroidx/compose/ui/d;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.x0$e */
    static final class e extends C17544u implements q<androidx.compose.ui.d, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4573n0 f8463c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5848T f8464d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f8465e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f8466f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f8467g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f8468h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8469i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f8470j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8471k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8472l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q<G0, C4889m, Integer, C16807N> f8473m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C4596z0 f8474n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls0/T;", "consumedWindowInsets", "LXH/N;", "a", "(Ls0/T;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.x0$e$a */
        static final class a extends C17544u implements C17642l<C5848T, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4573n0 f8475c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5848T f8476d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4573n0 n0Var, C5848T t10) {
                super(1);
                this.f8475c = n0Var;
                this.f8476d = t10;
            }

            public final void a(C5848T t10) {
                this.f8475c.f(C5850V.h(this.f8476d, t10));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5848T) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.x0$e$b */
        static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f8477c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f8478d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f8479e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f8480f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f8481g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C4573n0 f8482h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f8483i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ q<G0, C4889m, Integer, C16807N> f8484j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ C4596z0 f8485k;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I0.x0$e$b$a */
            static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ q<G0, C4889m, Integer, C16807N> f8486c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C4596z0 f8487d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(q<? super G0, ? super C4889m, ? super Integer, C16807N> qVar, C4596z0 z0Var) {
                    super(2);
                    this.f8486c = qVar;
                    this.f8487d = z0Var;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(433906483, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:223)");
                        }
                        this.f8486c.invoke(this.f8487d.b(), mVar, 0);
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

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(boolean z10, int i10, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C4573n0 n0Var, p<? super C4889m, ? super Integer, C16807N> pVar3, q<? super G0, ? super C4889m, ? super Integer, C16807N> qVar2, C4596z0 z0Var) {
                super(2);
                this.f8477c = z10;
                this.f8478d = i10;
                this.f8479e = pVar;
                this.f8480f = qVar;
                this.f8481g = pVar2;
                this.f8482h = n0Var;
                this.f8483i = pVar3;
                this.f8484j = qVar2;
                this.f8485k = z0Var;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1772955108, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:216)");
                    }
                    C4592x0.c(this.f8477c, this.f8478d, this.f8479e, this.f8480f, c1.c.e(433906483, true, new a(this.f8484j, this.f8485k), mVar, 54), this.f8481g, this.f8482h, this.f8483i, mVar, 24576);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C4573n0 n0Var, C5848T t10, long j10, long j11, boolean z10, int i10, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, q<? super G0, ? super C4889m, ? super Integer, C16807N> qVar2, C4596z0 z0Var) {
            super(3);
            this.f8463c = n0Var;
            this.f8464d = t10;
            this.f8465e = j10;
            this.f8466f = j11;
            this.f8467g = z10;
            this.f8468h = i10;
            this.f8469i = pVar;
            this.f8470j = qVar;
            this.f8471k = pVar2;
            this.f8472l = pVar3;
            this.f8473m = qVar2;
            this.f8474n = z0Var;
        }

        public final void a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            int i11;
            androidx.compose.ui.d dVar2 = dVar;
            C4889m mVar2 = mVar;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(dVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-219833176, i11, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:207)");
                }
                boolean V10 = mVar2.V(this.f8463c) | mVar2.V(this.f8464d);
                C4573n0 n0Var = this.f8463c;
                C5848T t10 = this.f8464d;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(n0Var, t10);
                    mVar2.u(D10);
                }
                L0.a(C5851W.c(dVar2, (C17642l) D10), (i1) null, this.f8465e, this.f8466f, (C5601g) null, 0.0f, c1.c.e(1772955108, true, new b(this.f8467g, this.f8468h, this.f8469i, this.f8470j, this.f8471k, this.f8463c, this.f8472l, this.f8473m, this.f8474n), mVar2, 54), mVar, 1572864, 50);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE1/m0;", "Lc2/b;", "constraints", "LE1/J;", "a", "(LE1/m0;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I0.x0$f */
    static final class f extends C17544u implements p<m0, C5267b, J> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8489d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8490e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f8491f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f8492g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5848T f8493h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8494i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f8495j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.x0$f$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<a0> f8496c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List<a0> f8497d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<a0> f8498e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<a0> f8499f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List<a0> f8500g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f8501h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ int f8502i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f8503j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ Integer f8504k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ N f8505l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Integer f8506m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<? extends a0> list, List<? extends a0> list2, List<? extends a0> list3, List<? extends a0> list4, List<? extends a0> list5, int i10, int i11, int i12, Integer num, N n10, Integer num2) {
                super(1);
                this.f8496c = list;
                this.f8497d = list2;
                this.f8498e = list3;
                this.f8499f = list4;
                this.f8500g = list5;
                this.f8501h = i10;
                this.f8502i = i11;
                this.f8503j = i12;
                this.f8504k = num;
                this.f8505l = n10;
                this.f8506m = num2;
            }

            public final void a(a0.a aVar) {
                List<a0> list = this.f8496c;
                int i10 = this.f8501h;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    a0.a.i(aVar, list.get(i11), 0, i10, 0.0f, 4, (Object) null);
                }
                List<a0> list2 = this.f8497d;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    a0.a.i(aVar, list2.get(i12), 0, 0, 0.0f, 4, (Object) null);
                }
                List<a0> list3 = this.f8498e;
                int i13 = this.f8502i;
                int i14 = this.f8503j;
                int size3 = list3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    a0.a.i(aVar, list3.get(i15), 0, i13 - i14, 0.0f, 4, (Object) null);
                }
                List<a0> list4 = this.f8499f;
                int i16 = this.f8502i;
                Integer num = this.f8504k;
                int size4 = list4.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    a0.a.i(aVar, list4.get(i17), 0, i16 - (num != null ? num.intValue() : 0), 0.0f, 4, (Object) null);
                }
                List<a0> list5 = this.f8500g;
                N n10 = this.f8505l;
                int i18 = this.f8502i;
                Integer num2 = this.f8506m;
                int size5 = list5.size();
                for (int i19 = 0; i19 < size5; i19++) {
                    a0.a.i(aVar, list5.get(i19), n10 != null ? n10.b() : 0, i18 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I0.x0$f$b */
        static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5848T f8507c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ m0 f8508d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<a0> f8509e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ List<a0> f8510f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Integer f8511g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f8512h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C5848T t10, m0 m0Var, List<? extends a0> list, List<? extends a0> list2, Integer num, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar) {
                super(2);
                this.f8507c = t10;
                this.f8508d = m0Var;
                this.f8509e = list;
                this.f8510f = list2;
                this.f8511g = num;
                this.f8512h = qVar;
            }

            public final void a(C4889m mVar, int i10) {
                Integer num;
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-570781649, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:510)");
                    }
                    C5834E g10 = C5850V.g(this.f8507c, this.f8508d);
                    this.f8512h.invoke(D.d(D.g(g10, this.f8508d.getLayoutDirection()), this.f8509e.isEmpty() ? g10.d() : h.B((float) 0), D.f(g10, this.f8508d.getLayoutDirection()), (this.f8510f.isEmpty() || (num = this.f8511g) == null) ? g10.a() : this.f8508d.H(num.intValue())), mVar, 0);
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
        /* renamed from: I0.x0$f$c */
        static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ N f8513c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f8514d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(N n10, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f8513c = n10;
                this.f8514d = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(424088350, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:476)");
                    }
                    C4910x.a(C4592x0.f().d(this.f8513c), this.f8514d, mVar, J0.f13770i);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, int i10, boolean z10, C5848T t10, p<? super C4889m, ? super Integer, C16807N> pVar4, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f8488c = pVar;
            this.f8489d = pVar2;
            this.f8490e = pVar3;
            this.f8491f = i10;
            this.f8492g = z10;
            this.f8493h = t10;
            this.f8494i = pVar4;
            this.f8495j = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:108:0x029a  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x02a5  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x02a9  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x02e9  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x02ed  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0305  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0344 A[LOOP:9: B:129:0x0342->B:130:0x0344, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0253 A[LOOP:7: B:93:0x0251->B:94:0x0253, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x026b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final E1.J a(E1.m0 r33, long r34) {
            /*
                r32 = this;
                r0 = r32
                r8 = r33
                int r9 = c2.C5267b.l(r34)
                int r22 = c2.C5267b.k(r34)
                r16 = 10
                r17 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r10 = r34
                long r10 = c2.C5267b.d(r10, r12, r13, r14, r15, r16, r17)
                I0.y0 r1 = I0.C4594y0.TopBar
                nI.p<U0.m, java.lang.Integer, XH.N> r2 = r0.f8488c
                java.util.List r1 = r8.S0(r1, r2)
                java.util.ArrayList r12 = new java.util.ArrayList
                int r2 = r1.size()
                r12.<init>(r2)
                int r2 = r1.size()
                r3 = r13
            L_0x0030:
                if (r3 >= r2) goto L_0x0042
                java.lang.Object r4 = r1.get(r3)
                E1.H r4 = (E1.H) r4
                E1.a0 r4 = r4.i0(r10)
                r12.add(r4)
                int r3 = r3 + 1
                goto L_0x0030
            L_0x0042:
                boolean r1 = r12.isEmpty()
                r14 = 1
                if (r1 == 0) goto L_0x004b
                r1 = 0
                goto L_0x0071
            L_0x004b:
                java.lang.Object r1 = r12.get(r13)
                r3 = r1
                E1.a0 r3 = (E1.a0) r3
                int r3 = r3.z0()
                int r4 = YH.C16877v.p(r12)
                if (r14 > r4) goto L_0x0071
                r5 = r14
            L_0x005d:
                java.lang.Object r6 = r12.get(r5)
                r7 = r6
                E1.a0 r7 = (E1.a0) r7
                int r7 = r7.z0()
                if (r3 >= r7) goto L_0x006c
                r1 = r6
                r3 = r7
            L_0x006c:
                if (r5 == r4) goto L_0x0071
                int r5 = r5 + 1
                goto L_0x005d
            L_0x0071:
                E1.a0 r1 = (E1.a0) r1
                if (r1 == 0) goto L_0x007c
                int r1 = r1.z0()
                r16 = r1
                goto L_0x007e
            L_0x007c:
                r16 = r13
            L_0x007e:
                I0.y0 r1 = I0.C4594y0.Snackbar
                nI.p<U0.m, java.lang.Integer, XH.N> r3 = r0.f8489d
                java.util.List r1 = r8.S0(r1, r3)
                s0.T r3 = r0.f8493h
                java.util.ArrayList r15 = new java.util.ArrayList
                int r4 = r1.size()
                r15.<init>(r4)
                int r4 = r1.size()
                r5 = r13
            L_0x0096:
                if (r5 >= r4) goto L_0x00c5
                java.lang.Object r6 = r1.get(r5)
                E1.H r6 = (E1.H) r6
                c2.t r7 = r33.getLayoutDirection()
                int r7 = r3.c(r8, r7)
                c2.t r2 = r33.getLayoutDirection()
                int r2 = r3.d(r8, r2)
                int r14 = r3.b(r8)
                int r7 = -r7
                int r7 = r7 - r2
                int r2 = -r14
                long r13 = c2.c.o(r10, r7, r2)
                E1.a0 r2 = r6.i0(r13)
                r15.add(r2)
                int r5 = r5 + 1
                r13 = 0
                r14 = 1
                goto L_0x0096
            L_0x00c5:
                boolean r1 = r15.isEmpty()
                if (r1 == 0) goto L_0x00cd
                r2 = 0
                goto L_0x00f8
            L_0x00cd:
                r1 = 0
                java.lang.Object r2 = r15.get(r1)
                r1 = r2
                E1.a0 r1 = (E1.a0) r1
                int r1 = r1.z0()
                int r3 = YH.C16877v.p(r15)
                r4 = 1
                if (r4 > r3) goto L_0x00f8
                r4 = r2
                r2 = r1
                r1 = 1
            L_0x00e3:
                java.lang.Object r5 = r15.get(r1)
                r6 = r5
                E1.a0 r6 = (E1.a0) r6
                int r6 = r6.z0()
                if (r2 >= r6) goto L_0x00f2
                r4 = r5
                r2 = r6
            L_0x00f2:
                if (r1 == r3) goto L_0x00f7
                int r1 = r1 + 1
                goto L_0x00e3
            L_0x00f7:
                r2 = r4
            L_0x00f8:
                E1.a0 r2 = (E1.a0) r2
                if (r2 == 0) goto L_0x0101
                int r1 = r2.z0()
                goto L_0x0102
            L_0x0101:
                r1 = 0
            L_0x0102:
                I0.y0 r2 = I0.C4594y0.Fab
                nI.p<U0.m, java.lang.Integer, XH.N> r3 = r0.f8490e
                java.util.List r2 = r8.S0(r2, r3)
                s0.T r3 = r0.f8493h
                java.util.ArrayList r14 = new java.util.ArrayList
                int r4 = r2.size()
                r14.<init>(r4)
                int r4 = r2.size()
                r5 = 0
            L_0x011a:
                if (r5 >= r4) goto L_0x014d
                java.lang.Object r6 = r2.get(r5)
                E1.H r6 = (E1.H) r6
                c2.t r7 = r33.getLayoutDirection()
                int r7 = r3.c(r8, r7)
                c2.t r13 = r33.getLayoutDirection()
                int r13 = r3.d(r8, r13)
                r18 = r2
                int r2 = r3.b(r8)
                int r7 = -r7
                int r7 = r7 - r13
                int r2 = -r2
                r13 = r3
                long r2 = c2.c.o(r10, r7, r2)
                E1.a0 r2 = r6.i0(r2)
                r14.add(r2)
                int r5 = r5 + 1
                r3 = r13
                r2 = r18
                goto L_0x011a
            L_0x014d:
                boolean r2 = r14.isEmpty()
                if (r2 != 0) goto L_0x022d
                boolean r2 = r14.isEmpty()
                if (r2 == 0) goto L_0x015b
                r3 = 0
                goto L_0x0186
            L_0x015b:
                r2 = 0
                java.lang.Object r3 = r14.get(r2)
                r2 = r3
                E1.a0 r2 = (E1.a0) r2
                int r2 = r2.E0()
                int r4 = YH.C16877v.p(r14)
                r5 = 1
                if (r5 > r4) goto L_0x0186
                r5 = r3
                r3 = r2
                r2 = 1
            L_0x0171:
                java.lang.Object r6 = r14.get(r2)
                r7 = r6
                E1.a0 r7 = (E1.a0) r7
                int r7 = r7.E0()
                if (r3 >= r7) goto L_0x0180
                r5 = r6
                r3 = r7
            L_0x0180:
                if (r2 == r4) goto L_0x0185
                int r2 = r2 + 1
                goto L_0x0171
            L_0x0185:
                r3 = r5
            L_0x0186:
                E1.a0 r3 = (E1.a0) r3
                if (r3 == 0) goto L_0x018f
                int r2 = r3.E0()
                goto L_0x0190
            L_0x018f:
                r2 = 0
            L_0x0190:
                boolean r3 = r14.isEmpty()
                if (r3 == 0) goto L_0x0198
                r4 = 0
                goto L_0x01c3
            L_0x0198:
                r3 = 0
                java.lang.Object r4 = r14.get(r3)
                r3 = r4
                E1.a0 r3 = (E1.a0) r3
                int r3 = r3.z0()
                int r5 = YH.C16877v.p(r14)
                r6 = 1
                if (r6 > r5) goto L_0x01c3
                r6 = r4
                r4 = r3
                r3 = 1
            L_0x01ae:
                java.lang.Object r7 = r14.get(r3)
                r13 = r7
                E1.a0 r13 = (E1.a0) r13
                int r13 = r13.z0()
                if (r4 >= r13) goto L_0x01bd
                r6 = r7
                r4 = r13
            L_0x01bd:
                if (r3 == r5) goto L_0x01c2
                int r3 = r3 + 1
                goto L_0x01ae
            L_0x01c2:
                r4 = r6
            L_0x01c3:
                E1.a0 r4 = (E1.a0) r4
                if (r4 == 0) goto L_0x01cc
                int r3 = r4.z0()
                goto L_0x01cd
            L_0x01cc:
                r3 = 0
            L_0x01cd:
                if (r2 == 0) goto L_0x022d
                if (r3 == 0) goto L_0x022d
                int r4 = r0.f8491f
                I0.O$a r5 = I0.O.f7399a
                int r6 = r5.b()
                boolean r6 = I0.O.d(r4, r6)
                if (r6 == 0) goto L_0x01fc
                c2.t r4 = r33.getLayoutDirection()
                c2.t r5 = c2.t.Ltr
                if (r4 != r5) goto L_0x01f0
                float r4 = I0.C4592x0.f8417b
                int r4 = r8.K0(r4)
                goto L_0x0224
            L_0x01f0:
                float r4 = I0.C4592x0.f8417b
                int r4 = r8.K0(r4)
            L_0x01f8:
                int r4 = r9 - r4
                int r4 = r4 - r2
                goto L_0x0224
            L_0x01fc:
                int r5 = r5.a()
                boolean r4 = I0.O.d(r4, r5)
                if (r4 == 0) goto L_0x0220
                c2.t r4 = r33.getLayoutDirection()
                c2.t r5 = c2.t.Ltr
                if (r4 != r5) goto L_0x0217
                float r4 = I0.C4592x0.f8417b
                int r4 = r8.K0(r4)
                goto L_0x01f8
            L_0x0217:
                float r4 = I0.C4592x0.f8417b
                int r4 = r8.K0(r4)
                goto L_0x0224
            L_0x0220:
                int r4 = r9 - r2
                int r4 = r4 / 2
            L_0x0224:
                I0.N r5 = new I0.N
                boolean r6 = r0.f8492g
                r5.<init>(r6, r4, r2, r3)
                r13 = r5
                goto L_0x022e
            L_0x022d:
                r13 = 0
            L_0x022e:
                I0.y0 r2 = I0.C4594y0.BottomBar
                I0.x0$f$c r3 = new I0.x0$f$c
                nI.p<U0.m, java.lang.Integer, XH.N> r4 = r0.f8494i
                r3.<init>(r13, r4)
                r4 = 424088350(0x1947131e, float:1.02919196E-23)
                r5 = 1
                c1.a r3 = c1.c.c(r4, r5, r3)
                java.util.List r2 = r8.S0(r2, r3)
                java.util.ArrayList r7 = new java.util.ArrayList
                int r3 = r2.size()
                r7.<init>(r3)
                int r3 = r2.size()
                r4 = 0
            L_0x0251:
                if (r4 >= r3) goto L_0x0263
                java.lang.Object r5 = r2.get(r4)
                E1.H r5 = (E1.H) r5
                E1.a0 r5 = r5.i0(r10)
                r7.add(r5)
                int r4 = r4 + 1
                goto L_0x0251
            L_0x0263:
                boolean r2 = r7.isEmpty()
                if (r2 == 0) goto L_0x026b
                r2 = 0
                goto L_0x0296
            L_0x026b:
                r6 = 0
                java.lang.Object r2 = r7.get(r6)
                r3 = r2
                E1.a0 r3 = (E1.a0) r3
                int r3 = r3.z0()
                int r4 = YH.C16877v.p(r7)
                r5 = 1
                if (r5 > r4) goto L_0x0296
                r5 = 1
            L_0x027f:
                java.lang.Object r17 = r7.get(r5)
                r18 = r17
                E1.a0 r18 = (E1.a0) r18
                int r6 = r18.z0()
                if (r3 >= r6) goto L_0x0290
                r3 = r6
                r2 = r17
            L_0x0290:
                if (r5 == r4) goto L_0x0296
                int r5 = r5 + 1
                r6 = 0
                goto L_0x027f
            L_0x0296:
                E1.a0 r2 = (E1.a0) r2
                if (r2 == 0) goto L_0x02a5
                int r2 = r2.z0()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r20 = r2
                goto L_0x02a7
            L_0x02a5:
                r20 = 0
            L_0x02a7:
                if (r13 == 0) goto L_0x02e9
                s0.T r2 = r0.f8493h
                boolean r3 = r0.f8492g
                if (r20 != 0) goto L_0x02c2
                int r3 = r13.a()
                float r4 = I0.C4592x0.f8417b
                int r4 = r8.K0(r4)
                int r3 = r3 + r4
                int r2 = r2.b(r8)
                int r3 = r3 + r2
                goto L_0x02e2
            L_0x02c2:
                if (r3 == 0) goto L_0x02d0
                int r2 = r20.intValue()
                int r3 = r13.a()
                int r3 = r3 / 2
            L_0x02ce:
                int r3 = r3 + r2
                goto L_0x02e2
            L_0x02d0:
                int r2 = r20.intValue()
                int r3 = r13.a()
                int r2 = r2 + r3
                float r3 = I0.C4592x0.f8417b
                int r3 = r8.K0(r3)
                goto L_0x02ce
            L_0x02e2:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r21 = r2
                goto L_0x02eb
            L_0x02e9:
                r21 = 0
            L_0x02eb:
                if (r1 == 0) goto L_0x0305
                if (r21 == 0) goto L_0x02f4
                int r2 = r21.intValue()
                goto L_0x0301
            L_0x02f4:
                if (r20 == 0) goto L_0x02fb
                int r2 = r20.intValue()
                goto L_0x0301
            L_0x02fb:
                s0.T r2 = r0.f8493h
                int r2 = r2.b(r8)
            L_0x0301:
                int r1 = r1 + r2
                r18 = r1
                goto L_0x0307
            L_0x0305:
                r18 = 0
            L_0x0307:
                int r17 = r22 - r16
                I0.y0 r6 = I0.C4594y0.MainContent
                I0.x0$f$b r5 = new I0.x0$f$b
                s0.T r2 = r0.f8493h
                nI.q<s0.E, U0.m, java.lang.Integer, XH.N> r4 = r0.f8495j
                r1 = r5
                r3 = r33
                r23 = r4
                r4 = r12
                r0 = r5
                r5 = r7
                r34 = r13
                r19 = 0
                r13 = r6
                r6 = r20
                r31 = r7
                r7 = r23
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r1 = -570781649(0xffffffffddfa902f, float:-2.25687282E18)
                r2 = 1
                c1.a r0 = c1.c.c(r1, r2, r0)
                java.util.List r0 = r8.S0(r13, r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                r1.<init>(r2)
                int r2 = r0.size()
                r13 = r19
            L_0x0342:
                if (r13 >= r2) goto L_0x0366
                java.lang.Object r3 = r0.get(r13)
                E1.H r3 = (E1.H) r3
                r29 = 7
                r30 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r23 = r10
                r28 = r17
                long r4 = c2.C5267b.d(r23, r25, r26, r27, r28, r29, r30)
                E1.a0 r3 = r3.i0(r4)
                r1.add(r3)
                int r13 = r13 + 1
                goto L_0x0342
            L_0x0366:
                I0.x0$f$a r5 = new I0.x0$f$a
                r10 = r5
                r11 = r1
                r0 = r34
                r13 = r15
                r1 = r14
                r14 = r31
                r15 = r1
                r17 = r22
                r19 = r20
                r20 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                r6 = 4
                r7 = 0
                r4 = 0
                r1 = r33
                r2 = r9
                r3 = r22
                E1.J r0 = E1.K.v0(r1, r2, r3, r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.C4592x0.f.a(E1.m0, long):E1.J");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((m0) obj, ((C5267b) obj2).r());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I0.x0$g */
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f8515c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f8516d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8517e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f8518f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8519g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8520h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C5848T f8521i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f8522j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f8523k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z10, int i10, p<? super C4889m, ? super Integer, C16807N> pVar, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, C5848T t10, p<? super C4889m, ? super Integer, C16807N> pVar4, int i11) {
            super(2);
            this.f8515c = z10;
            this.f8516d = i10;
            this.f8517e = pVar;
            this.f8518f = qVar;
            this.f8519g = pVar2;
            this.f8520h = pVar3;
            this.f8521i = t10;
            this.f8522j = pVar4;
            this.f8523k = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4592x0.c(this.f8515c, this.f8516d, this.f8517e, this.f8518f, this.f8519g, this.f8520h, this.f8521i, this.f8522j, mVar, M0.a(this.f8523k | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v0, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01a2, code lost:
        if (r0.e(r72) != false) goto L_0x01a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.d r58, I0.C4596z0 r59, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r60, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r61, nI.q<? super I0.G0, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r62, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r63, int r64, boolean r65, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r66, boolean r67, p1.i1 r68, float r69, long r70, long r72, long r74, long r76, long r78, nI.q<? super s0.C5834E, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r80, U0.C4889m r81, int r82, int r83, int r84) {
        /*
            r15 = r82
            r13 = r83
            r14 = r84
            r0 = 1037492569(0x3dd6e159, float:0.104922004)
            r1 = r81
            U0.m r0 = r1.k(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0019
            r4 = r15 | 6
            r5 = r4
            r4 = r58
            goto L_0x002d
        L_0x0019:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x002a
            r4 = r58
            boolean r5 = r0.V(r4)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r15
            goto L_0x002d
        L_0x002a:
            r4 = r58
            r5 = r15
        L_0x002d:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0046
            r6 = r14 & 2
            if (r6 != 0) goto L_0x0040
            r6 = r59
            boolean r9 = r0.V(r6)
            if (r9 == 0) goto L_0x0042
            r9 = 32
            goto L_0x0044
        L_0x0040:
            r6 = r59
        L_0x0042:
            r9 = 16
        L_0x0044:
            r5 = r5 | r9
            goto L_0x0048
        L_0x0046:
            r6 = r59
        L_0x0048:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x0051
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r12 = r60
            goto L_0x0064
        L_0x0051:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004e
            r12 = r60
            boolean r16 = r0.F(r12)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r5 = r5 | r16
        L_0x0064:
            r16 = r14 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0071
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r2 = r61
            goto L_0x0084
        L_0x0071:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006e
            r2 = r61
            boolean r19 = r0.F(r2)
            if (r19 == 0) goto L_0x0080
            r19 = r17
            goto L_0x0082
        L_0x0080:
            r19 = r18
        L_0x0082:
            r5 = r5 | r19
        L_0x0084:
            r19 = r14 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0091
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x008e:
            r3 = r62
            goto L_0x00a4
        L_0x0091:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x008e
            r3 = r62
            boolean r23 = r0.F(r3)
            if (r23 == 0) goto L_0x00a0
            r23 = r21
            goto L_0x00a2
        L_0x00a0:
            r23 = r20
        L_0x00a2:
            r5 = r5 | r23
        L_0x00a4:
            r23 = r14 & 32
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = 65536(0x10000, float:9.18355E-41)
            if (r23 == 0) goto L_0x00b3
            r5 = r5 | r25
            r7 = r63
            goto L_0x00c6
        L_0x00b3:
            r27 = r15 & r25
            r7 = r63
            if (r27 != 0) goto L_0x00c6
            boolean r28 = r0.F(r7)
            if (r28 == 0) goto L_0x00c2
            r28 = r24
            goto L_0x00c4
        L_0x00c2:
            r28 = r26
        L_0x00c4:
            r5 = r5 | r28
        L_0x00c6:
            r28 = r14 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00d1
            r5 = r5 | r29
            r8 = r64
            goto L_0x00e4
        L_0x00d1:
            r30 = r15 & r29
            r8 = r64
            if (r30 != 0) goto L_0x00e4
            boolean r31 = r0.d(r8)
            if (r31 == 0) goto L_0x00e0
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r31 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r5 = r5 | r31
        L_0x00e4:
            r10 = r14 & 128(0x80, float:1.794E-43)
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00ef
            r5 = r5 | r32
            r11 = r65
            goto L_0x0102
        L_0x00ef:
            r33 = r15 & r32
            r11 = r65
            if (r33 != 0) goto L_0x0102
            boolean r34 = r0.b(r11)
            if (r34 == 0) goto L_0x00fe
            r34 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r34 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r5 = r5 | r34
        L_0x0102:
            r2 = r14 & 256(0x100, float:3.59E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010d
            r5 = r5 | r34
            r3 = r66
            goto L_0x0120
        L_0x010d:
            r34 = r15 & r34
            r3 = r66
            if (r34 != 0) goto L_0x0120
            boolean r34 = r0.F(r3)
            if (r34 == 0) goto L_0x011c
            r34 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r34 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r5 = r5 | r34
        L_0x0120:
            r3 = r14 & 512(0x200, float:7.175E-43)
            r34 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x012b
            r5 = r5 | r34
            r4 = r67
            goto L_0x013e
        L_0x012b:
            r34 = r15 & r34
            r4 = r67
            if (r34 != 0) goto L_0x013e
            boolean r34 = r0.b(r4)
            if (r34 == 0) goto L_0x013a
            r34 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x013a:
            r34 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013c:
            r5 = r5 | r34
        L_0x013e:
            r34 = r13 & 6
            if (r34 != 0) goto L_0x0158
            r4 = r14 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x0151
            r4 = r68
            boolean r34 = r0.V(r4)
            if (r34 == 0) goto L_0x0153
            r22 = 4
            goto L_0x0155
        L_0x0151:
            r4 = r68
        L_0x0153:
            r22 = 2
        L_0x0155:
            r22 = r13 | r22
            goto L_0x015c
        L_0x0158:
            r4 = r68
            r22 = r13
        L_0x015c:
            r4 = r14 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0165
            r22 = r22 | 48
            r6 = r69
            goto L_0x0178
        L_0x0165:
            r34 = r13 & 48
            r6 = r69
            if (r34 != 0) goto L_0x0178
            boolean r34 = r0.c(r6)
            if (r34 == 0) goto L_0x0174
            r27 = 32
            goto L_0x0176
        L_0x0174:
            r27 = 16
        L_0x0176:
            r22 = r22 | r27
        L_0x0178:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0192
            r6 = r14 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x018b
            r6 = r70
            boolean r27 = r0.e(r6)
            if (r27 == 0) goto L_0x018d
            r31 = 256(0x100, float:3.59E-43)
            goto L_0x018f
        L_0x018b:
            r6 = r70
        L_0x018d:
            r31 = 128(0x80, float:1.794E-43)
        L_0x018f:
            r22 = r22 | r31
            goto L_0x0194
        L_0x0192:
            r6 = r70
        L_0x0194:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x01ac
            r6 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r6 != 0) goto L_0x01a5
            r6 = r72
            boolean r27 = r0.e(r6)
            if (r27 == 0) goto L_0x01a7
            goto L_0x01a9
        L_0x01a5:
            r6 = r72
        L_0x01a7:
            r17 = r18
        L_0x01a9:
            r22 = r22 | r17
            goto L_0x01ae
        L_0x01ac:
            r6 = r72
        L_0x01ae:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x01c6
            r6 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x01c1
            r6 = r74
            boolean r17 = r0.e(r6)
            if (r17 == 0) goto L_0x01c3
            r20 = r21
            goto L_0x01c3
        L_0x01c1:
            r6 = r74
        L_0x01c3:
            r22 = r22 | r20
            goto L_0x01c8
        L_0x01c6:
            r6 = r74
        L_0x01c8:
            r17 = r13 & r25
            if (r17 != 0) goto L_0x01e3
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r14 & r17
            r6 = r76
            if (r17 != 0) goto L_0x01de
            boolean r17 = r0.e(r6)
            if (r17 == 0) goto L_0x01de
            r17 = r24
            goto L_0x01e0
        L_0x01de:
            r17 = r26
        L_0x01e0:
            r22 = r22 | r17
            goto L_0x01e5
        L_0x01e3:
            r6 = r76
        L_0x01e5:
            r17 = r13 & r29
            if (r17 != 0) goto L_0x01fd
            r17 = r14 & r26
            r6 = r78
            if (r17 != 0) goto L_0x01f8
            boolean r17 = r0.e(r6)
            if (r17 == 0) goto L_0x01f8
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01fa
        L_0x01f8:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x01fa:
            r22 = r22 | r17
            goto L_0x01ff
        L_0x01fd:
            r6 = r78
        L_0x01ff:
            r17 = r14 & r24
            if (r17 == 0) goto L_0x0208
            r22 = r22 | r32
            r13 = r80
            goto L_0x021b
        L_0x0208:
            r17 = r13 & r32
            r13 = r80
            if (r17 != 0) goto L_0x021b
            boolean r17 = r0.F(r13)
            if (r17 == 0) goto L_0x0217
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0219
        L_0x0217:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x0219:
            r22 = r22 | r17
        L_0x021b:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r5 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x025c
            r6 = 4793491(0x492493, float:6.717112E-39)
            r6 = r22 & r6
            r7 = 4793490(0x492492, float:6.71711E-39)
            if (r6 != r7) goto L_0x025c
            boolean r6 = r0.l()
            if (r6 != 0) goto L_0x0236
            goto L_0x025c
        L_0x0236:
            r0.L()
            r1 = r58
            r2 = r59
            r4 = r61
            r5 = r62
            r6 = r63
            r9 = r66
            r10 = r67
            r13 = r70
            r15 = r72
            r17 = r74
            r19 = r76
            r21 = r78
            r81 = r0
            r7 = r8
            r8 = r11
            r3 = r12
            r11 = r68
            r12 = r69
            goto L_0x0499
        L_0x025c:
            r0.G()
            r6 = r15 & 1
            if (r6 == 0) goto L_0x02c4
            boolean r6 = r0.O()
            if (r6 == 0) goto L_0x026a
            goto L_0x02c4
        L_0x026a:
            r0.L()
            r1 = r14 & 2
            if (r1 == 0) goto L_0x0273
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0273:
            r1 = r14 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0279
            r22 = r22 & -15
        L_0x0279:
            r1 = r22
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0281
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0281:
            r2 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0287
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0287:
            r2 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x028f
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r2
        L_0x028f:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0299
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x0299:
            r2 = r14 & r26
            if (r2 == 0) goto L_0x02a1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r2
        L_0x02a1:
            r2 = r59
            r7 = r61
            r9 = r63
            r3 = r66
            r4 = r67
            r44 = r70
            r46 = r72
            r48 = r74
            r50 = r76
            r52 = r78
            r13 = r1
            r14 = r5
            r10 = r11
            r6 = r12
            r1 = r58
            r11 = r68
            r5 = r69
            r12 = r8
            r8 = r62
            goto L_0x03ea
        L_0x02c4:
            if (r1 == 0) goto L_0x02c9
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x02cb
        L_0x02c9:
            r1 = r58
        L_0x02cb:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x02dc
            r6 = 0
            r7 = 3
            r58 = r1
            r1 = 0
            r8 = 0
            I0.z0 r1 = g(r1, r8, r0, r6, r7)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02e0
        L_0x02dc:
            r58 = r1
            r1 = r59
        L_0x02e0:
            if (r9 == 0) goto L_0x02e9
            I0.o r6 = I0.C4574o.f8248a
            nI.p r6 = r6.e()
            goto L_0x02ea
        L_0x02e9:
            r6 = r12
        L_0x02ea:
            if (r16 == 0) goto L_0x02f3
            I0.o r7 = I0.C4574o.f8248a
            nI.p r7 = r7.f()
            goto L_0x02f5
        L_0x02f3:
            r7 = r61
        L_0x02f5:
            if (r19 == 0) goto L_0x02fe
            I0.o r8 = I0.C4574o.f8248a
            nI.q r8 = r8.g()
            goto L_0x0300
        L_0x02fe:
            r8 = r62
        L_0x0300:
            if (r23 == 0) goto L_0x0309
            I0.o r9 = I0.C4574o.f8248a
            nI.p r9 = r9.h()
            goto L_0x030b
        L_0x0309:
            r9 = r63
        L_0x030b:
            if (r28 == 0) goto L_0x0314
            I0.O$a r12 = I0.O.f7399a
            int r12 = r12.a()
            goto L_0x0316
        L_0x0314:
            r12 = r64
        L_0x0316:
            if (r10 == 0) goto L_0x031a
            r10 = 0
            goto L_0x031b
        L_0x031a:
            r10 = r11
        L_0x031b:
            if (r2 == 0) goto L_0x031f
            r2 = 0
            goto L_0x0321
        L_0x031f:
            r2 = r66
        L_0x0321:
            if (r3 == 0) goto L_0x0325
            r3 = 1
            goto L_0x0327
        L_0x0325:
            r3 = r67
        L_0x0327:
            r11 = r14 & 1024(0x400, float:1.435E-42)
            r59 = r1
            r1 = 6
            if (r11 == 0) goto L_0x033d
            I0.d0 r11 = I0.C4553d0.f7988a
            I0.A0 r11 = r11.b(r0, r1)
            A0.a r11 = r11.a()
            r22 = r22 & -15
        L_0x033a:
            r44 = r22
            goto L_0x0340
        L_0x033d:
            r11 = r68
            goto L_0x033a
        L_0x0340:
            if (r4 == 0) goto L_0x0349
            I0.E r4 = I0.E.f7141a
            float r4 = r4.b()
            goto L_0x034b
        L_0x0349:
            r4 = r69
        L_0x034b:
            r1 = r14 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x036a
            I0.d0 r1 = I0.C4553d0.f7988a
            r61 = r2
            r2 = 6
            I0.l r1 = r1.a(r0, r2)
            long r1 = r1.n()
            r62 = r1
            r1 = r44
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r56 = r3
            r3 = r1
            r1 = r62
            r62 = r56
            goto L_0x0373
        L_0x036a:
            r61 = r2
            r1 = r44
            r62 = r3
            r3 = r1
            r1 = r70
        L_0x0373:
            r63 = r4
            r4 = r14 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0384
            int r4 = r3 >> 6
            r4 = r4 & 14
            long r16 = I0.C4570m.b(r1, r0, r4)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0386
        L_0x0384:
            r16 = r72
        L_0x0386:
            r4 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0398
            I0.E r4 = I0.E.f7141a
            r18 = r1
            r1 = 6
            long r20 = r4.c(r0, r1)
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r2
            goto L_0x039d
        L_0x0398:
            r18 = r1
            r1 = 6
            r20 = r74
        L_0x039d:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x03b2
            I0.d0 r2 = I0.C4553d0.f7988a
            I0.l r1 = r2.a(r0, r1)
            long r1 = r1.c()
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
            goto L_0x03b4
        L_0x03b2:
            r1 = r76
        L_0x03b4:
            r4 = r14 & r26
            if (r4 == 0) goto L_0x03db
            int r4 = r3 >> 15
            r4 = r4 & 14
            long r22 = I0.C4570m.b(r1, r0, r4)
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
            r4 = r62
            r50 = r1
            r13 = r3
            r14 = r5
            r46 = r16
            r44 = r18
            r48 = r20
            r52 = r22
        L_0x03d2:
            r1 = r58
            r2 = r59
            r3 = r61
            r5 = r63
            goto L_0x03ea
        L_0x03db:
            r4 = r62
            r52 = r78
            r50 = r1
            r13 = r3
            r14 = r5
            r46 = r16
            r44 = r18
            r48 = r20
            goto L_0x03d2
        L_0x03ea:
            r0.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x03fe
            r15 = 1037492569(0x3dd6e159, float:0.104922004)
            r81 = r0
            java.lang.String r0 = "androidx.compose.material.Scaffold (Scaffold.kt:330)"
            U0.C4895p.S(r15, r14, r13, r0)
            goto L_0x0400
        L_0x03fe:
            r81 = r0
        L_0x0400:
            r0 = 0
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r15 = 14
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r58 = r0
            r59 = r17
            r60 = r18
            r61 = r19
            r62 = r15
            r63 = r16
            s0.T r16 = s0.C5850V.c(r58, r59, r60, r61, r62, r63)
            int r0 = r14 << 3
            r15 = 2147483632(0x7ffffff0, float:NaN)
            r41 = r0 & r15
            int r0 = r14 >> 27
            r0 = r0 & 14
            int r13 = r13 << 3
            r14 = r13 & 112(0x70, float:1.57E-43)
            r0 = r0 | r14
            r14 = r13 & 896(0x380, float:1.256E-42)
            r0 = r0 | r14
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r14
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r14 = r14 & r13
            r0 = r0 | r14
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r14
            r42 = r0 | r13
            r43 = 0
            r17 = r1
            r18 = r2
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r12
            r24 = r10
            r25 = r3
            r26 = r4
            r27 = r11
            r28 = r5
            r29 = r44
            r31 = r46
            r33 = r48
            r35 = r50
            r37 = r52
            r39 = r80
            r40 = r81
            b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r39, r40, r41, r42, r43)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0480
            U0.C4895p.R()
        L_0x0480:
            r13 = r44
            r15 = r46
            r17 = r48
            r19 = r50
            r21 = r52
            r56 = r9
            r9 = r3
            r3 = r6
            r6 = r56
            r57 = r10
            r10 = r4
            r4 = r7
            r7 = r12
            r12 = r5
            r5 = r8
            r8 = r57
        L_0x0499:
            U0.Y0 r0 = r81.n()
            if (r0 == 0) goto L_0x04bc
            r58 = r15
            I0.x0$d r15 = new I0.x0$d
            r54 = r0
            r0 = r15
            r55 = r15
            r15 = r58
            r23 = r80
            r24 = r82
            r25 = r83
            r26 = r84
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r21, r23, r24, r25, r26)
            r0 = r54
            r1 = r55
            r0.a(r1)
        L_0x04bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C4592x0.a(androidx.compose.ui.d, I0.z0, nI.p, nI.p, nI.q, nI.p, int, boolean, nI.q, boolean, p1.i1, float, long, long, long, long, long, nI.q, U0.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: I0.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: nI.q<? super I0.G0, ? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: nI.p<? super U0.m, ? super java.lang.Integer, XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(s0.C5848T r36, androidx.compose.ui.d r37, I0.C4596z0 r38, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r39, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r40, nI.q<? super I0.G0, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r41, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r42, int r43, boolean r44, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r45, boolean r46, p1.i1 r47, float r48, long r49, long r51, long r53, long r55, long r57, nI.q<? super s0.C5834E, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r59, U0.C4889m r60, int r61, int r62, int r63) {
        /*
            r1 = r36
            r14 = r61
            r15 = r62
            r13 = r63
            r0 = -1288630565(0xffffffffb3310edb, float:-4.1224535E-8)
            r2 = r60
            U0.m r0 = r2.k(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0027
            boolean r2 = r0.V(r1)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r14
            goto L_0x0028
        L_0x0027:
            r2 = r14
        L_0x0028:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0031
            r2 = r2 | 48
        L_0x002e:
            r8 = r37
            goto L_0x0043
        L_0x0031:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x002e
            r8 = r37
            boolean r9 = r0.V(r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r2 = r2 | r9
        L_0x0043:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x005c
            r9 = r13 & 4
            if (r9 != 0) goto L_0x0056
            r9 = r38
            boolean r12 = r0.V(r9)
            if (r12 == 0) goto L_0x0058
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r9 = r38
        L_0x0058:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r2 = r2 | r12
            goto L_0x005e
        L_0x005c:
            r9 = r38
        L_0x005e:
            r12 = r13 & 8
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x006b
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r3 = r39
            goto L_0x007e
        L_0x006b:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0068
            r3 = r39
            boolean r18 = r0.F(r3)
            if (r18 == 0) goto L_0x007a
            r18 = r17
            goto L_0x007c
        L_0x007a:
            r18 = r16
        L_0x007c:
            r2 = r2 | r18
        L_0x007e:
            r18 = r13 & 16
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L_0x008b
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r6 = r40
            goto L_0x009e
        L_0x008b:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0088
            r6 = r40
            boolean r22 = r0.F(r6)
            if (r22 == 0) goto L_0x009a
            r22 = r20
            goto L_0x009c
        L_0x009a:
            r22 = r19
        L_0x009c:
            r2 = r2 | r22
        L_0x009e:
            r22 = r13 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            if (r22 == 0) goto L_0x00ad
            r2 = r2 | r23
            r7 = r41
            goto L_0x00c0
        L_0x00ad:
            r26 = r14 & r23
            r7 = r41
            if (r26 != 0) goto L_0x00c0
            boolean r27 = r0.F(r7)
            if (r27 == 0) goto L_0x00bc
            r27 = r25
            goto L_0x00be
        L_0x00bc:
            r27 = r24
        L_0x00be:
            r2 = r2 | r27
        L_0x00c0:
            r27 = r13 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00cb
            r2 = r2 | r28
            r10 = r42
            goto L_0x00de
        L_0x00cb:
            r29 = r14 & r28
            r10 = r42
            if (r29 != 0) goto L_0x00de
            boolean r30 = r0.F(r10)
            if (r30 == 0) goto L_0x00da
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dc
        L_0x00da:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00dc:
            r2 = r2 | r30
        L_0x00de:
            r11 = r13 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x00e9
            r2 = r2 | r31
            r4 = r43
            goto L_0x00fc
        L_0x00e9:
            r31 = r14 & r31
            r4 = r43
            if (r31 != 0) goto L_0x00fc
            boolean r32 = r0.d(r4)
            if (r32 == 0) goto L_0x00f8
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r2 = r2 | r32
        L_0x00fc:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0107
            r2 = r2 | r32
            r4 = r44
            goto L_0x011a
        L_0x0107:
            r33 = r14 & r32
            r4 = r44
            if (r33 != 0) goto L_0x011a
            boolean r33 = r0.b(r4)
            if (r33 == 0) goto L_0x0116
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r2 = r2 | r33
        L_0x011a:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r33 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0125
            r2 = r2 | r33
            r6 = r45
            goto L_0x0138
        L_0x0125:
            r33 = r14 & r33
            r6 = r45
            if (r33 != 0) goto L_0x0138
            boolean r33 = r0.F(r6)
            if (r33 == 0) goto L_0x0134
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r2 = r2 | r33
        L_0x0138:
            r6 = r13 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x0141
            r33 = r15 | 6
            r7 = r46
            goto L_0x0157
        L_0x0141:
            r33 = r15 & 6
            r7 = r46
            if (r33 != 0) goto L_0x0155
            boolean r33 = r0.b(r7)
            if (r33 == 0) goto L_0x0150
            r33 = 4
            goto L_0x0152
        L_0x0150:
            r33 = 2
        L_0x0152:
            r33 = r15 | r33
            goto L_0x0157
        L_0x0155:
            r33 = r15
        L_0x0157:
            r34 = r15 & 48
            if (r34 != 0) goto L_0x0173
            r7 = r13 & 2048(0x800, float:2.87E-42)
            if (r7 != 0) goto L_0x016a
            r7 = r47
            boolean r34 = r0.V(r7)
            if (r34 == 0) goto L_0x016c
            r21 = 32
            goto L_0x016e
        L_0x016a:
            r7 = r47
        L_0x016c:
            r21 = 16
        L_0x016e:
            r33 = r33 | r21
        L_0x0170:
            r7 = r33
            goto L_0x0176
        L_0x0173:
            r7 = r47
            goto L_0x0170
        L_0x0176:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x017f
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x017c:
            r9 = r48
            goto L_0x0192
        L_0x017f:
            r9 = r15 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x017c
            r9 = r48
            boolean r21 = r0.c(r9)
            if (r21 == 0) goto L_0x018e
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x0190
        L_0x018e:
            r29 = 128(0x80, float:1.794E-43)
        L_0x0190:
            r7 = r7 | r29
        L_0x0192:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x01aa
            r9 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r9 != 0) goto L_0x01a5
            r9 = r49
            boolean r21 = r0.e(r9)
            if (r21 == 0) goto L_0x01a7
            r16 = r17
            goto L_0x01a7
        L_0x01a5:
            r9 = r49
        L_0x01a7:
            r7 = r7 | r16
            goto L_0x01ac
        L_0x01aa:
            r9 = r49
        L_0x01ac:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x01c4
            r9 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r9 != 0) goto L_0x01bf
            r9 = r51
            boolean r16 = r0.e(r9)
            if (r16 == 0) goto L_0x01c1
            r19 = r20
            goto L_0x01c1
        L_0x01bf:
            r9 = r51
        L_0x01c1:
            r7 = r7 | r19
            goto L_0x01c6
        L_0x01c4:
            r9 = r51
        L_0x01c6:
            r16 = r15 & r23
            if (r16 != 0) goto L_0x01e1
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r13 & r16
            r9 = r53
            if (r16 != 0) goto L_0x01dc
            boolean r16 = r0.e(r9)
            if (r16 == 0) goto L_0x01dc
            r16 = r25
            goto L_0x01de
        L_0x01dc:
            r16 = r24
        L_0x01de:
            r7 = r7 | r16
            goto L_0x01e3
        L_0x01e1:
            r9 = r53
        L_0x01e3:
            r16 = r15 & r28
            if (r16 != 0) goto L_0x01fb
            r16 = r13 & r24
            r9 = r55
            if (r16 != 0) goto L_0x01f6
            boolean r16 = r0.e(r9)
            if (r16 == 0) goto L_0x01f6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x01f8
        L_0x01f6:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x01f8:
            r7 = r7 | r16
            goto L_0x01fd
        L_0x01fb:
            r9 = r55
        L_0x01fd:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x0217
            r16 = r13 & r25
            r9 = r57
            if (r16 != 0) goto L_0x0212
            boolean r16 = r0.e(r9)
            if (r16 == 0) goto L_0x0212
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0214
        L_0x0212:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x0214:
            r7 = r7 | r16
            goto L_0x0219
        L_0x0217:
            r9 = r57
        L_0x0219:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r13 & r16
            if (r16 == 0) goto L_0x0224
            r7 = r7 | r32
            r15 = r59
            goto L_0x0237
        L_0x0224:
            r16 = r15 & r32
            r15 = r59
            if (r16 != 0) goto L_0x0237
            boolean r16 = r0.F(r15)
            if (r16 == 0) goto L_0x0233
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0235
        L_0x0233:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0235:
            r7 = r7 | r16
        L_0x0237:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r2 & r16
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L_0x0278
            r9 = 38347923(0x2492493, float:1.4777644E-37)
            r9 = r9 & r7
            r10 = 38347922(0x2492492, float:1.4777643E-37)
            if (r9 != r10) goto L_0x0278
            boolean r9 = r0.l()
            if (r9 != 0) goto L_0x0251
            goto L_0x0278
        L_0x0251:
            r0.L()
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            r10 = r45
            r11 = r46
            r12 = r47
            r13 = r48
            r14 = r49
            r16 = r51
            r18 = r53
            r20 = r55
            r22 = r57
            goto L_0x04fd
        L_0x0278:
            r0.G()
            r9 = r14 & 1
            if (r9 == 0) goto L_0x02e3
            boolean r9 = r0.O()
            if (r9 == 0) goto L_0x0286
            goto L_0x02e3
        L_0x0286:
            r0.L()
            r3 = r13 & 4
            if (r3 == 0) goto L_0x028f
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x028f:
            r3 = r13 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0295
            r7 = r7 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0295:
            r3 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x029b
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x029b:
            r3 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x02a3
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r3
        L_0x02a3:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r13
            if (r3 == 0) goto L_0x02ad
            r3 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r3
        L_0x02ad:
            r3 = r13 & r24
            if (r3 == 0) goto L_0x02b5
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r3
        L_0x02b5:
            r3 = r13 & r25
            if (r3 == 0) goto L_0x02bd
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r3
        L_0x02bd:
            r5 = r38
            r9 = r39
            r10 = r40
            r12 = r41
            r14 = r42
            r11 = r43
            r3 = r44
            r4 = r45
            r6 = r46
            r8 = r48
            r18 = r49
            r16 = r51
            r20 = r53
            r22 = r55
            r24 = r57
            r13 = r2
            r15 = r7
            r2 = r37
            r7 = r47
            goto L_0x03fd
        L_0x02e3:
            if (r5 == 0) goto L_0x02e8
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x02ea
        L_0x02e8:
            r5 = r37
        L_0x02ea:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x02fb
            r9 = 0
            r10 = 3
            r37 = r5
            r5 = 0
            r14 = 0
            I0.z0 r5 = g(r5, r14, r0, r9, r10)
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x02ff
        L_0x02fb:
            r37 = r5
            r5 = r38
        L_0x02ff:
            if (r12 == 0) goto L_0x0308
            I0.o r9 = I0.C4574o.f8248a
            nI.p r9 = r9.a()
            goto L_0x030a
        L_0x0308:
            r9 = r39
        L_0x030a:
            if (r18 == 0) goto L_0x0313
            I0.o r10 = I0.C4574o.f8248a
            nI.p r10 = r10.b()
            goto L_0x0315
        L_0x0313:
            r10 = r40
        L_0x0315:
            if (r22 == 0) goto L_0x031e
            I0.o r12 = I0.C4574o.f8248a
            nI.q r12 = r12.c()
            goto L_0x0320
        L_0x031e:
            r12 = r41
        L_0x0320:
            if (r27 == 0) goto L_0x0329
            I0.o r14 = I0.C4574o.f8248a
            nI.p r14 = r14.d()
            goto L_0x032b
        L_0x0329:
            r14 = r42
        L_0x032b:
            if (r11 == 0) goto L_0x0334
            I0.O$a r11 = I0.O.f7399a
            int r11 = r11.a()
            goto L_0x0336
        L_0x0334:
            r11 = r43
        L_0x0336:
            if (r3 == 0) goto L_0x033a
            r3 = 0
            goto L_0x033c
        L_0x033a:
            r3 = r44
        L_0x033c:
            if (r4 == 0) goto L_0x0340
            r4 = 0
            goto L_0x0342
        L_0x0340:
            r4 = r45
        L_0x0342:
            if (r6 == 0) goto L_0x0346
            r6 = 1
            goto L_0x0348
        L_0x0346:
            r6 = r46
        L_0x0348:
            r38 = r2
            r2 = r13 & 2048(0x800, float:2.87E-42)
            r39 = r3
            r3 = 6
            if (r2 == 0) goto L_0x035e
            I0.d0 r2 = I0.C4553d0.f7988a
            I0.A0 r2 = r2.b(r0, r3)
            A0.a r2 = r2.a()
            r7 = r7 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0360
        L_0x035e:
            r2 = r47
        L_0x0360:
            if (r8 == 0) goto L_0x0369
            I0.E r8 = I0.E.f7141a
            float r8 = r8.b()
            goto L_0x036b
        L_0x0369:
            r8 = r48
        L_0x036b:
            r3 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x037f
            I0.d0 r3 = I0.C4553d0.f7988a
            r41 = r2
            r2 = 6
            I0.l r3 = r3.a(r0, r2)
            long r2 = r3.n()
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0383
        L_0x037f:
            r41 = r2
            r2 = r49
        L_0x0383:
            r42 = r4
            r4 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0396
            int r4 = r7 >> 9
            r4 = r4 & 14
            long r16 = I0.C4570m.b(r2, r0, r4)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r4
            goto L_0x0398
        L_0x0396:
            r16 = r51
        L_0x0398:
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r13
            if (r4 == 0) goto L_0x03ad
            I0.E r4 = I0.E.f7141a
            r18 = r2
            r2 = 6
            long r3 = r4.c(r0, r2)
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r20
            goto L_0x03b2
        L_0x03ad:
            r18 = r2
            r2 = 6
            r3 = r53
        L_0x03b2:
            r20 = r13 & r24
            r43 = r3
            if (r20 == 0) goto L_0x03c8
            I0.d0 r3 = I0.C4553d0.f7988a
            I0.l r2 = r3.a(r0, r2)
            long r2 = r2.c()
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r7
            r7 = r4
            goto L_0x03ca
        L_0x03c8:
            r2 = r55
        L_0x03ca:
            r4 = r13 & r25
            if (r4 == 0) goto L_0x03ec
            int r4 = r7 >> 18
            r4 = r4 & 14
            long r20 = I0.C4570m.b(r2, r0, r4)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r7 = r7 & r4
            r13 = r38
            r4 = r42
            r22 = r2
            r15 = r7
            r24 = r20
            r2 = r37
            r3 = r39
            r7 = r41
            r20 = r43
            goto L_0x03fd
        L_0x03ec:
            r13 = r38
            r4 = r42
            r20 = r43
            r24 = r57
            r22 = r2
            r15 = r7
            r2 = r37
            r3 = r39
            r7 = r41
        L_0x03fd:
            r0.y()
            boolean r26 = U0.C4895p.J()
            if (r26 == 0) goto L_0x0413
            r53 = r8
            r8 = -1288630565(0xffffffffb3310edb, float:-4.1224535E-8)
            r54 = r7
            java.lang.String r7 = "androidx.compose.material.Scaffold (Scaffold.kt:202)"
            U0.C4895p.S(r8, r13, r15, r7)
            goto L_0x0417
        L_0x0413:
            r54 = r7
            r53 = r8
        L_0x0417:
            r7 = r13 & 14
            r8 = 4
            if (r7 != r8) goto L_0x041e
            r7 = 1
            goto L_0x041f
        L_0x041e:
            r7 = 0
        L_0x041f:
            java.lang.Object r8 = r0.D()
            if (r7 != 0) goto L_0x042d
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0435
        L_0x042d:
            I0.n0 r8 = new I0.n0
            r8.<init>(r1)
            r0.u(r8)
        L_0x0435:
            r7 = r8
            I0.n0 r7 = (I0.C4573n0) r7
            I0.x0$e r8 = new I0.x0$e
            r37 = r8
            r38 = r7
            r39 = r36
            r40 = r22
            r42 = r24
            r44 = r3
            r45 = r11
            r46 = r9
            r47 = r59
            r48 = r14
            r49 = r10
            r50 = r12
            r51 = r5
            r37.<init>(r38, r39, r40, r42, r44, r45, r46, r47, r48, r49, r50, r51)
            r7 = 54
            r1 = -219833176(0xfffffffff2e59ca8, float:-9.095866E30)
            r55 = r3
            r3 = 1
            c1.a r1 = c1.c.e(r1, r3, r8, r0, r7)
            if (r4 == 0) goto L_0x04c5
            r7 = 651509775(0x26d5400f, float:1.4797207E-15)
            r0.W(r7)
            I0.G r7 = r5.a()
            I0.x0$b r8 = new I0.x0$b
            r8.<init>(r1)
            r1 = 54
            r56 = r5
            r5 = -1409196448(0xffffffffac015e60, float:-1.8384391E-12)
            c1.a r1 = c1.c.e(r5, r3, r8, r0, r1)
            int r3 = r13 >> 27
            r3 = r3 & 14
            r5 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r5
            r5 = r13 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            int r5 = r15 << 9
            r8 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r5
            r3 = r3 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r5
            r3 = r3 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r5
            r3 = r3 | r8
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r5
            r3 = r3 | r8
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r8
            r3 = r3 | r5
            r5 = 0
            r37 = r4
            r38 = r2
            r39 = r7
            r40 = r6
            r41 = r54
            r42 = r53
            r43 = r18
            r45 = r16
            r47 = r20
            r49 = r1
            r50 = r0
            r51 = r3
            r52 = r5
            I0.F.a(r37, r38, r39, r40, r41, r42, r43, r45, r47, r49, r50, r51, r52)
            r0.P()
            goto L_0x04dd
        L_0x04c5:
            r56 = r5
            r3 = 652000071(0x26dcbb47, float:1.5316328E-15)
            r0.W(r3)
            int r3 = r13 >> 3
            r3 = r3 & 14
            r3 = r3 | 48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.invoke(r2, r0, r3)
            r0.P()
        L_0x04dd:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x04e6
            U0.C4895p.R()
        L_0x04e6:
            r13 = r53
            r3 = r56
            r5 = r10
            r8 = r11
            r7 = r14
            r14 = r18
            r18 = r20
            r20 = r22
            r22 = r24
            r10 = r4
            r11 = r6
            r4 = r9
            r6 = r12
            r12 = r54
            r9 = r55
        L_0x04fd:
            U0.Y0 r1 = r0.n()
            if (r1 == 0) goto L_0x051d
            I0.x0$c r0 = new I0.x0$c
            r37 = r0
            r35 = r1
            r1 = r36
            r24 = r59
            r25 = r61
            r26 = r62
            r27 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)
            r1 = r37
            r0 = r35
            r0.a(r1)
        L_0x051d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C4592x0.b(s0.T, androidx.compose.ui.d, I0.z0, nI.p, nI.p, nI.q, nI.p, int, boolean, nI.q, boolean, p1.i1, float, long, long, long, long, long, nI.q, U0.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: I0.x0$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: I0.x0$f} */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(boolean r20, int r21, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r22, nI.q<? super s0.C5834E, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r23, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r25, s0.C5848T r26, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, U0.C4889m r28, int r29) {
        /*
            r9 = r29
            r0 = -468424875(0xffffffffe4146755, float:-1.0950256E22)
            r1 = r28
            U0.m r1 = r1.k(r0)
            r2 = r9 & 6
            if (r2 != 0) goto L_0x001c
            r2 = r20
            boolean r4 = r1.b(r2)
            if (r4 == 0) goto L_0x0019
            r4 = 4
            goto L_0x001a
        L_0x0019:
            r4 = 2
        L_0x001a:
            r4 = r4 | r9
            goto L_0x001f
        L_0x001c:
            r2 = r20
            r4 = r9
        L_0x001f:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0032
            r5 = r21
            boolean r7 = r1.d(r5)
            if (r7 == 0) goto L_0x002e
            r7 = 32
            goto L_0x0030
        L_0x002e:
            r7 = 16
        L_0x0030:
            r4 = r4 | r7
            goto L_0x0034
        L_0x0032:
            r5 = r21
        L_0x0034:
            r7 = r9 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0048
            r7 = r22
            boolean r10 = r1.F(r7)
            if (r10 == 0) goto L_0x0044
            r10 = r8
            goto L_0x0046
        L_0x0044:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r4 = r4 | r10
            goto L_0x004a
        L_0x0048:
            r7 = r22
        L_0x004a:
            r10 = r9 & 3072(0xc00, float:4.305E-42)
            r15 = r23
            if (r10 != 0) goto L_0x005c
            boolean r10 = r1.F(r15)
            if (r10 == 0) goto L_0x0059
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x005b
        L_0x0059:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x005b:
            r4 = r4 | r10
        L_0x005c:
            r10 = r9 & 24576(0x6000, float:3.4438E-41)
            r12 = 16384(0x4000, float:2.2959E-41)
            r14 = r24
            if (r10 != 0) goto L_0x006f
            boolean r10 = r1.F(r14)
            if (r10 == 0) goto L_0x006c
            r10 = r12
            goto L_0x006e
        L_0x006c:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x006e:
            r4 = r4 | r10
        L_0x006f:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r9
            if (r10 != 0) goto L_0x0084
            r10 = r25
            boolean r16 = r1.F(r10)
            if (r16 == 0) goto L_0x007f
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0081
        L_0x007f:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x0081:
            r4 = r4 | r16
            goto L_0x0086
        L_0x0084:
            r10 = r25
        L_0x0086:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r9 & r16
            r3 = r26
            if (r16 != 0) goto L_0x009b
            boolean r17 = r1.V(r3)
            if (r17 == 0) goto L_0x0097
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0099
        L_0x0097:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0099:
            r4 = r4 | r17
        L_0x009b:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r9 & r17
            r6 = r27
            if (r17 != 0) goto L_0x00b0
            boolean r19 = r1.F(r6)
            if (r19 == 0) goto L_0x00ac
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ae
        L_0x00ac:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ae:
            r4 = r4 | r19
        L_0x00b0:
            r19 = 4793491(0x492493, float:6.717112E-39)
            r13 = r4 & r19
            r11 = 4793490(0x492492, float:6.71711E-39)
            if (r13 != r11) goto L_0x00c6
            boolean r11 = r1.l()
            if (r11 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r1.L()
            goto L_0x015f
        L_0x00c6:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x00d2
            r11 = -1
            java.lang.String r13 = "androidx.compose.material.ScaffoldLayout (Scaffold.kt:390)"
            U0.C4895p.S(r0, r4, r11, r13)
        L_0x00d2:
            r0 = r4 & 896(0x380, float:1.256E-42)
            r13 = 0
            r11 = 1
            if (r0 != r8) goto L_0x00da
            r0 = r11
            goto L_0x00db
        L_0x00da:
            r0 = r13
        L_0x00db:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r4
            if (r8 != r12) goto L_0x00e3
            r8 = r11
            goto L_0x00e4
        L_0x00e3:
            r8 = r13
        L_0x00e4:
            r0 = r0 | r8
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r4
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r8 != r12) goto L_0x00ee
            r8 = r11
            goto L_0x00ef
        L_0x00ee:
            r8 = r13
        L_0x00ef:
            r0 = r0 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r4
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r8 != r12) goto L_0x00f9
            r8 = r11
            goto L_0x00fa
        L_0x00f9:
            r8 = r13
        L_0x00fa:
            r0 = r0 | r8
            r8 = r4 & 112(0x70, float:1.57E-43)
            r12 = 32
            if (r8 != r12) goto L_0x0103
            r8 = r11
            goto L_0x0104
        L_0x0103:
            r8 = r13
        L_0x0104:
            r0 = r0 | r8
            r8 = r4 & 14
            r12 = 4
            if (r8 != r12) goto L_0x010c
            r8 = r11
            goto L_0x010d
        L_0x010c:
            r8 = r13
        L_0x010d:
            r0 = r0 | r8
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r4
            r12 = 8388608(0x800000, float:1.17549435E-38)
            if (r8 != r12) goto L_0x0117
            r8 = r11
            goto L_0x0118
        L_0x0117:
            r8 = r13
        L_0x0118:
            r0 = r0 | r8
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r4 != r8) goto L_0x0121
            r4 = r11
            goto L_0x0122
        L_0x0121:
            r4 = r13
        L_0x0122:
            r0 = r0 | r4
            java.lang.Object r4 = r1.D()
            if (r0 != 0) goto L_0x0135
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0132
            goto L_0x0135
        L_0x0132:
            r0 = r11
            r8 = r13
            goto L_0x0150
        L_0x0135:
            I0.x0$f r4 = new I0.x0$f
            r10 = r4
            r0 = r11
            r11 = r22
            r12 = r24
            r8 = r13
            r13 = r25
            r14 = r21
            r15 = r20
            r16 = r26
            r17 = r27
            r18 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r1.u(r4)
        L_0x0150:
            nI.p r4 = (nI.p) r4
            r10 = 0
            E1.k0.b(r10, r4, r1, r8, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x015f
            U0.C4895p.R()
        L_0x015f:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0180
            I0.x0$g r11 = new I0.x0$g
            r0 = r11
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C4592x0.c(boolean, int, nI.p, nI.q, nI.p, nI.p, s0.T, nI.p, U0.m, int):void");
    }

    public static final I0<N> f() {
        return f8416a;
    }

    public static final C4596z0 g(G g10, G0 g02, C4889m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            g10 = F.j(H.Closed, (C17642l<? super H, Boolean>) null, mVar, 6, 2);
        }
        if ((i11 & 2) != 0) {
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new G0();
                mVar.u(D10);
            }
            g02 = (G0) D10;
        }
        if (C4895p.J()) {
            C4895p.S(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:74)");
        }
        Object D11 = mVar.D();
        if (D11 == C4889m.f14007a.a()) {
            D11 = new C4596z0(g10, g02);
            mVar.u(D11);
        }
        C4596z0 z0Var = (C4596z0) D11;
        if (C4895p.J()) {
            C4895p.R();
        }
        return z0Var;
    }
}
