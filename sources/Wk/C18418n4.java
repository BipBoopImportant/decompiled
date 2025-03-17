package wK;

import E1.I;
import G1.C4504g;
import HJ.C15854t;
import L1.o;
import L1.v;
import L1.x;
import N1.P;
import O0.C4722d;
import O0.Z;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.j;
import Y1.k;
import android.view.View;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.C5747v0;
import p1.i1;
import r0.C5814f;
import r0.i;
import r0.l;
import r0.m;
import s0.C5834E;
import s0.C5843N;
import s0.C5848T;
import s0.C5861g;
import s0.a0;
import tK.C18029u;
import tK.C18030v;
import vK.C18205e;
import z0.C6270a;
import zK.C18767l;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0001\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001ac\u0010\u0018\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00018\nX\u0002"}, d2 = {"T", "", "expanded", "", "items", "Lkotlin/Function1;", "LXH/N;", "itemContent", "Lkotlin/Function0;", "onDismissRequest", "Landroidx/compose/ui/d;", "modifier", "Ls0/E;", "contentPadding", "useSafeHeight", "onItemClick", "l", "(ZLjava/util/List;LnI/q;LnI/a;Landroidx/compose/ui/d;Ls0/E;ZLnI/l;LU0/m;II)V", "content", "n", "(ZLnI/a;Landroidx/compose/ui/d;ZLnI/p;LU0/m;I)V", "item", "", "header", "i", "(Landroidx/compose/ui/d;Ls0/E;LnI/q;Ljava/lang/Object;Ljava/lang/String;LnI/l;LU0/m;II)V", "f", "(Landroidx/compose/ui/d;Ljava/lang/String;LU0/m;I)V", "hover", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.n4  reason: case insensitive filesystem */
public final class C18418n4 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.n4$a */
    static final class a implements r<androidx.compose.ui.d, C17642l<? super T, ? extends C16807N>, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f151287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f151288b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ T f151289c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f151290d;

        a(A1<Boolean> a12, m mVar, T t10, A1<Boolean> a13) {
            this.f151287a = a12;
            this.f151288b = mVar;
            this.f151289c = t10;
            this.f151290d = a13;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, Object obj) {
            lVar.invoke(obj);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.compose.ui.d b(androidx.compose.ui.d r19, nI.C17642l<? super T, XH.C16807N> r20, U0.C4889m r21, int r22) {
            /*
                r18 = this;
                r0 = r18
                r1 = r20
                r2 = r21
                r3 = r22
                java.lang.String r4 = "$this$thenCheckNull"
                r5 = r19
                kotlin.jvm.internal.C17542s.j(r5, r4)
                java.lang.String r4 = "it"
                kotlin.jvm.internal.C17542s.j(r1, r4)
                r4 = 261708142(0xf99596e, float:1.5121412E-29)
                r2.W(r4)
                boolean r6 = U0.C4895p.J()
                if (r6 == 0) goto L_0x0026
                r6 = -1
                java.lang.String r7 = "net.ikea.skapa.ui.components.ItemLayout.<anonymous> (ListBox.kt:165)"
                U0.C4895p.S(r4, r3, r6, r7)
            L_0x0026:
                U0.A1<java.lang.Boolean> r6 = r0.f151287a
                r12 = 12
                r13 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r5 = r19
                androidx.compose.ui.d r4 = zK.C18756a.d(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                U0.A1<java.lang.Boolean> r5 = r0.f151290d
                boolean r5 = wK.C18418n4.j(r5)
                r6 = 2
                r7 = 0
                r8 = 0
                androidx.compose.ui.d r9 = zK.C18756a.j(r4, r5, r8, r6, r7)
                r14 = 6
                r15 = 0
                r11 = 0
                r12 = 0
                n0.I r11 = O0.C4756u0.c(r10, r11, r12, r14, r15)
                r0.m r10 = r0.f151288b
                r4 = 1161613696(0x453cd180, float:3021.0938)
                r2.W(r4)
                r4 = r3 & 112(0x70, float:1.57E-43)
                r4 = r4 ^ 48
                r5 = 32
                if (r4 <= r5) goto L_0x0062
                boolean r4 = r2.V(r1)
                if (r4 != 0) goto L_0x0066
            L_0x0062:
                r3 = r3 & 48
                if (r3 != r5) goto L_0x0067
            L_0x0066:
                r8 = 1
            L_0x0067:
                T r3 = r0.f151289c
                boolean r3 = r2.F(r3)
                r3 = r3 | r8
                T r4 = r0.f151289c
                java.lang.Object r5 = r21.D()
                if (r3 != 0) goto L_0x007e
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x0086
            L_0x007e:
                wK.m4 r5 = new wK.m4
                r5.<init>(r1, r4)
                r2.u(r5)
            L_0x0086:
                r15 = r5
                nI.a r15 = (nI.C17631a) r15
                r21.P()
                r16 = 28
                r17 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.d.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x00a0
                U0.C4895p.R()
            L_0x00a0:
                r21.P()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18418n4.a.b(androidx.compose.ui.d, nI.l, U0.m, int):androidx.compose.ui.d");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return b((androidx.compose.ui.d) obj, (C17642l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.n4$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<T> f151291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5834E f151292b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<T, C4889m, Integer, C16807N> f151293c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f151294d;

        b(List<? extends T> list, C5834E e10, q<? super T, ? super C4889m, ? super Integer, C16807N> qVar, C17642l<? super T, C16807N> lVar) {
            this.f151291a = list;
            this.f151292b = e10;
            this.f151293c = qVar;
            this.f151294d = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1103087738, i10, -1, "net.ikea.skapa.ui.components.ListBox.<anonymous> (ListBox.kt:64)");
                }
                C5834E e10 = this.f151292b;
                q<T, C4889m, Integer, C16807N> qVar = this.f151293c;
                C17642l<T, C16807N> lVar = this.f151294d;
                for (T p10 : this.f151291a) {
                    C18418n4.i(androidx.compose.ui.d.f18749a, e10, qVar, p10, (String) null, lVar, mVar, 24582, 0);
                }
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
    /* renamed from: wK.n4$c */
    static final class c implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f151295a = new c();

        c() {
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckTrue");
            mVar.W(-327374377);
            if (C4895p.J()) {
                C4895p.S(-327374377, i10, -1, "net.ikea.skapa.ui.components.ListBoxImpl.<anonymous> (ListBox.kt:129)");
            }
            c2.d dVar2 = (c2.d) mVar.Q(C5100f0.e());
            C5848T.a aVar = C5848T.f28733a;
            androidx.compose.ui.d k10 = J.k(dVar, 0.0f, dVar2.H(((View) mVar.Q(AndroidCompositionLocals_androidKt.k())).getHeight() - (a0.e(aVar, mVar, 6).a(dVar2) + a0.e(aVar, mVar, 6).b(dVar2))), 1, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return k10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.n4$d */
    static final class d implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f151296a;

        d(p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f151296a = pVar;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "$this$DropdownMenu");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2140371814, i10, -1, "net.ikea.skapa.ui.components.ListBoxImpl.<anonymous> (ListBox.kt:140)");
                }
                this.f151296a.invoke(mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void f(androidx.compose.ui.d dVar, String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        androidx.compose.ui.d dVar2 = dVar;
        String str2 = str;
        C4889m k10 = mVar.k(1525068376);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(dVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1525068376, i11, -1, "net.ikea.skapa.ui.components.HeaderItem (ListBox.kt:186)");
            }
            C5437c h10 = C5437c.f24302a.h();
            androidx.compose.ui.d h11 = J.h(dVar2, 0.0f, 1, (Object) null);
            C18029u uVar = C18029u.f147649a;
            androidx.compose.ui.d l10 = D.l(h11, uVar.d(), uVar.a(), uVar.d(), uVar.j());
            I h12 = C5077h.h(h10, false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, l10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
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
            F1.c(a12, h12, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            k10.W(-707540803);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new C18382k4();
                k10.u(D10);
            }
            k10.P();
            mVar2 = k10;
            d1.b(str, o.d(aVar2, false, (C17642l) D10, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18030v.f147664a.b(k10, C18030v.f147665b).c().e(), mVar2, (i11 >> 3) & 14, 0, 65532);
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
            n10.a(new C18394l4(dVar2, str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(androidx.compose.ui.d dVar, String str, int i10, C4889m mVar, int i11) {
        f(dVar, str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.v(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final <T> void i(androidx.compose.ui.d dVar, C5834E e10, q<? super T, ? super C4889m, ? super Integer, C16807N> qVar, T t10, String str, C17642l<? super T, C16807N> lVar, C4889m mVar, int i10, int i11) {
        int i12;
        C5834E e11;
        androidx.compose.ui.d dVar2 = dVar;
        q<? super T, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        T t11 = t10;
        String str2 = str;
        C17642l<? super T, C16807N> lVar2 = lVar;
        int i13 = i10;
        C4889m k10 = mVar.k(-1956384013);
        if ((i11 & 1) != 0) {
            i12 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i13 & 48) == 0) {
            e11 = e10;
            i12 |= ((i11 & 2) != 0 || !k10.V(e11)) ? 16 : 32;
        } else {
            e11 = e10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i13 & 384) == 0) {
            i12 |= k10.F(qVar2) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i12 |= (i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? k10.V(t11) : k10.F(t11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i12 |= k10.V(str2) ? 16384 : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= ImageMetadata.EDGE_MODE;
        } else if ((i13 & ImageMetadata.EDGE_MODE) == 0) {
            i12 |= k10.F(lVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i12) != 74898 || !k10.l()) {
            k10.G();
            if ((i13 & 1) != 0 && !k10.O()) {
                k10.L();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            } else if ((i11 & 2) != 0) {
                i12 &= -113;
                e11 = Z.f10197a.c();
            }
            k10.y();
            if (C4895p.J()) {
                C4895p.S(-1956384013, i12, -1, "net.ikea.skapa.ui.components.ItemLayout (ListBox.kt:153)");
            }
            k10.W(-2008726571);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = l.a();
                k10.u(D10);
            }
            m mVar2 = (m) D10;
            k10.P();
            A1<Boolean> a10 = C5814f.a(mVar2, k10, 6);
            A1<Boolean> a11 = i.a(mVar2, k10, 6);
            if (!(str2 == null || C15854t.v0(str))) {
                k10.W(-2140785976);
                f(dVar2, str2, k10, (i12 & 14) | ((i12 >> 9) & 112));
                k10.P();
            } else {
                k10.W(-2140710832);
                C5437c.C0386c i14 = C5437c.f24302a.i();
                androidx.compose.ui.d h10 = D.h(J.x(J.h(C18205e.g(dVar2, lVar2, new a(a10, mVar2, t11, a11), k10, (i12 & 14) | ((i12 >> 12) & 112)), 0.0f, 1, (Object) null), h.B((float) 112), C18029u.f147649a.h(), 0.0f, 0.0f, 12, (Object) null), e11);
                I b10 = G.b(C5073d.f18068a.f(), i14, k10, 48);
                int a12 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, h10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a13);
                } else {
                    k10.t();
                }
                C4889m a14 = F1.a(k10);
                F1.c(a14, b10, aVar.c());
                F1.c(a14, s10, aVar.e());
                p<C4504g, Integer, C16807N> b11 = aVar.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b11);
                }
                F1.c(a14, e12, aVar.d());
                C5843N n10 = C5843N.f28726a;
                qVar2.invoke(t11, k10, Integer.valueOf(((i12 >> 9) & 14) | ((i12 >> 3) & 112)));
                k10.x();
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        C5834E e13 = e11;
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C18370j4(dVar, e13, qVar, t10, str, lVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean j(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N k(androidx.compose.ui.d dVar, C5834E e10, q qVar, Object obj, String str, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        i(dVar, e10, qVar, obj, str, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void l(boolean r18, java.util.List<? extends T> r19, nI.q<? super T, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r20, nI.C17631a<XH.C16807N> r21, androidx.compose.ui.d r22, s0.C5834E r23, boolean r24, nI.C17642l<? super T, XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r2 = r19
            r3 = r20
            r11 = r21
            r12 = r25
            r13 = r27
            r14 = r28
            java.lang.String r0 = "items"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "itemContent"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1560858968(0xffffffffa2f72ea8, float:-6.6998883E-18)
            r1 = r26
            U0.m r1 = r1.k(r0)
            r4 = r14 & 1
            if (r4 == 0) goto L_0x002d
            r4 = r13 | 6
            r15 = r18
            goto L_0x003f
        L_0x002d:
            r4 = r13 & 6
            r15 = r18
            if (r4 != 0) goto L_0x003e
            boolean r4 = r1.b(r15)
            if (r4 == 0) goto L_0x003b
            r4 = 4
            goto L_0x003c
        L_0x003b:
            r4 = 2
        L_0x003c:
            r4 = r4 | r13
            goto L_0x003f
        L_0x003e:
            r4 = r13
        L_0x003f:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0046
            r4 = r4 | 48
            goto L_0x0056
        L_0x0046:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0056
            boolean r5 = r1.F(r2)
            if (r5 == 0) goto L_0x0053
            r5 = 32
            goto L_0x0055
        L_0x0053:
            r5 = 16
        L_0x0055:
            r4 = r4 | r5
        L_0x0056:
            r5 = r14 & 4
            if (r5 == 0) goto L_0x005d
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005d:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x006d
            boolean r5 = r1.F(r3)
            if (r5 == 0) goto L_0x006a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r4 = r4 | r5
        L_0x006d:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x0074
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0074:
            r5 = r13 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0084
            boolean r5 = r1.F(r11)
            if (r5 == 0) goto L_0x0081
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0083
        L_0x0081:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0083:
            r4 = r4 | r5
        L_0x0084:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x008d
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r6 = r22
            goto L_0x009f
        L_0x008d:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008a
            r6 = r22
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x009c
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r7
        L_0x009f:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r13
            if (r7 != 0) goto L_0x00b9
            r7 = r14 & 32
            if (r7 != 0) goto L_0x00b3
            r7 = r23
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x00b5
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b3:
            r7 = r23
        L_0x00b5:
            r8 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r4 = r4 | r8
            goto L_0x00bb
        L_0x00b9:
            r7 = r23
        L_0x00bb:
            r8 = r14 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r8 == 0) goto L_0x00c5
            r4 = r4 | r9
        L_0x00c2:
            r9 = r24
            goto L_0x00d6
        L_0x00c5:
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00c2
            r9 = r24
            boolean r10 = r1.b(r9)
            if (r10 == 0) goto L_0x00d3
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r4 = r4 | r10
        L_0x00d6:
            r10 = r14 & 128(0x80, float:1.794E-43)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 == 0) goto L_0x00df
            r4 = r4 | r16
            goto L_0x00ef
        L_0x00df:
            r10 = r13 & r16
            if (r10 != 0) goto L_0x00ef
            boolean r10 = r1.F(r12)
            if (r10 == 0) goto L_0x00ec
            r10 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r10 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r4 = r4 | r10
        L_0x00ef:
            r10 = 4793491(0x492493, float:6.717112E-39)
            r10 = r10 & r4
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r10 != r0) goto L_0x0107
            boolean r0 = r1.l()
            if (r0 != 0) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            r1.L()
            r5 = r6
            r6 = r7
            r7 = r9
            goto L_0x018d
        L_0x0107:
            r1.G()
            r0 = r13 & 1
            r10 = 1
            if (r0 == 0) goto L_0x0126
            boolean r0 = r1.O()
            if (r0 == 0) goto L_0x0116
            goto L_0x0126
        L_0x0116:
            r1.L()
            r0 = r14 & 32
            if (r0 == 0) goto L_0x0121
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r0
        L_0x0121:
            r0 = r6
            r17 = r9
            r9 = r7
            goto L_0x0140
        L_0x0126:
            if (r5 == 0) goto L_0x012b
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r6 = r0
        L_0x012b:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x013a
            O0.Z r0 = O0.Z.f10197a
            s0.E r0 = r0.c()
            r5 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r5
            r7 = r0
        L_0x013a:
            if (r8 == 0) goto L_0x0121
            r0 = r6
            r9 = r7
            r17 = r10
        L_0x0140:
            r1.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0152
            r5 = -1
            java.lang.String r6 = "net.ikea.skapa.ui.components.ListBox (ListBox.kt:57)"
            r7 = -1560858968(0xffffffffa2f72ea8, float:-6.6998883E-18)
            U0.C4895p.S(r7, r4, r5, r6)
        L_0x0152:
            wK.n4$b r5 = new wK.n4$b
            r5.<init>(r2, r9, r3, r12)
            r6 = 54
            r7 = -1103087738(0xffffffffbe403786, float:-0.1877118)
            c1.a r8 = c1.c.e(r7, r10, r5, r1, r6)
            r5 = r4 & 14
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            int r6 = r4 >> 6
            r7 = r6 & 112(0x70, float:1.57E-43)
            r5 = r5 | r7
            r6 = r6 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            int r4 = r4 >> 9
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r10 = r5 | r4
            r4 = r18
            r5 = r21
            r6 = r0
            r7 = r17
            r16 = r9
            r9 = r1
            n(r4, r5, r6, r7, r8, r9, r10)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0188
            U0.C4895p.R()
        L_0x0188:
            r5 = r0
            r6 = r16
            r7 = r17
        L_0x018d:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x01ac
            wK.h4 r9 = new wK.h4
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r8 = r25
            r11 = r9
            r9 = r27
            r12 = r10
            r10 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.a(r11)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18418n4.l(boolean, java.util.List, nI.q, nI.a, androidx.compose.ui.d, s0.E, boolean, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(boolean z10, List list, q qVar, C17631a aVar, androidx.compose.ui.d dVar, C5834E e10, boolean z11, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        l(z10, list, qVar, aVar, dVar, e10, z11, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void n(boolean z10, C17631a<C16807N> aVar, androidx.compose.ui.d dVar, boolean z11, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        androidx.compose.ui.d dVar2 = dVar;
        boolean z12 = z11;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1922534879);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z10) ? 4 : 2) | i12;
        } else {
            boolean z13 = z10;
            i11 = i12;
        }
        C17631a<C16807N> aVar2 = aVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(dVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.b(z12) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1922534879, i11, -1, "net.ikea.skapa.ui.components.ListBoxImpl (ListBox.kt:123)");
            }
            androidx.compose.ui.d h10 = C18205e.h(androidx.compose.ui.d.f18749a, z12, c.f151295a, k10, ((i11 >> 6) & 112) | 6);
            float a10 = C18430o4.f151347a.a();
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            C4722d.a(z10, aVar, C6270a.a(FocusableKt.c(androidx.compose.foundation.b.d(C18767l.e(h10, a10, C5747v0.o(vVar.a(k10, i13).n0(), 0.24f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, 0.0f, 0.0f, 28, (Object) null), vVar.a(k10, i13).k(), (i1) null, 2, (Object) null), false, (m) null, 2, (Object) null)).s(dVar2), 0, (androidx.compose.foundation.o) null, (androidx.compose.ui.window.q) null, (i1) null, 0, 0.0f, 0.0f, (C5601g) null, c1.c.e(-2140371814, true, new d(pVar2), k10, 54), k10, i11 & 126, 48, 2040);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18358i4(z10, aVar, dVar, z11, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(boolean z10, C17631a aVar, androidx.compose.ui.d dVar, boolean z11, p pVar, int i10, C4889m mVar, int i11) {
        n(z10, aVar, dVar, z11, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
