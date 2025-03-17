package wK;

import B0.A;
import B0.C4381z;
import E1.H;
import E1.I;
import E1.K;
import E1.a0;
import G1.C4504g;
import L1.x;
import N1.P;
import N1.Y;
import O0.E;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import T1.b0;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.J0;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.t;
import Y1.j;
import Y1.k;
import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import bI.C17035a;
import c2.C5267b;
import c2.h;
import c2.n;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.u;
import m0.C5525D;
import m0.C5548j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5662b;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import pI.C17752b;
import r0.m;
import r1.f;
import tK.C18017h;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÇ\u0001\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010'\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010)\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b)\u0010(\u001ak\u0010.\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b.\u0010/\u001ak\u00100\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b0\u0010/\u001a/\u00103\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0003¢\u0006\u0004\b3\u00104\u001a3\u0010:\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u00010%2\b\u00106\u001a\u0004\u0018\u00010%2\u0006\u00107\u001a\u00020%2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a'\u0010>\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u001c2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b>\u0010?\u001aa\u0010F\u001a\u00020\u0003*\u00020@2\u0006\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u00010%2\b\u00106\u001a\u0004\u0018\u00010%2\u0006\u00107\u001a\u00020%2\b\u0010D\u001a\u0004\u0018\u00010%2\u0006\u0010E\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bF\u0010G\u001a-\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010N\u001a\u00020M*\u00020\u001a¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010Q\u001a\u00020\u001a*\u00020P¢\u0006\u0004\bQ\u0010R\u001a\u001f\u0010V\u001a\u00020\u00032\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0000H\u0002¢\u0006\u0004\bV\u0010W¨\u0006\\²\u0006\u000e\u0010X\u001a\u00020\u001c8\n@\nX\u0002²\u0006\f\u0010H\u001a\u00020\u00108\nX\u0002²\u0006\f\u0010Y\u001a\u00020J8\nX\u0002²\u0006\f\u0010[\u001a\u00020Z8\nX\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "LXH/N;", "onChange", "label", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "leading", "trailing", "helperText", "LwK/Y0;", "characterCounterParams", "LwK/M2;", "enabledState", "", "singleLine", "LT1/b0;", "visualTransformation", "LB0/A;", "keyboardOptions", "LB0/z;", "keyboardActions", "Lr0/m;", "interactionSource", "LwK/N;", "state", "", "maxLines", "h", "(Ljava/lang/String;LnI/l;Ljava/lang/String;Landroidx/compose/ui/d;LnI/p;LnI/p;Ljava/lang/String;LwK/Y0;LwK/M2;ZLT1/b0;LB0/A;LB0/z;Lr0/m;LwK/N;ILU0/m;III)V", "K", "(LwK/N;)Z", "characterLimit", "J", "(ILjava/lang/String;)Z", "LE1/a0;", "placeable", "P", "(LE1/a0;)I", "I", "textField", "helper", "LwK/O;", "states", "v", "(LnI/p;LnI/p;LnI/p;LnI/p;LnI/p;LwK/O;ZLU0/m;I)V", "o", "layoutId", "content", "t", "(Ljava/lang/String;Landroidx/compose/ui/d;LnI/p;LU0/m;II)V", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "Lc2/b;", "constraints", "H", "(LE1/a0;LE1/a0;LE1/a0;J)I", "textFieldHeight", "defaultHeight", "G", "(IIJ)I", "LE1/a0$a;", "height", "width", "labelPlaceable", "helperPlaceable", "borderPlaceable", "L", "(LE1/a0$a;IILE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;LE1/a0;Z)V", "focused", "LU0/A1;", "Lp1/v0;", "F", "(LwK/M2;ZLwK/N;LU0/m;I)LU0/A1;", "LwK/Z2;", "O", "(LwK/N;)LwK/Z2;", "LwK/X2;", "N", "(LwK/X2;)LwK/N;", "Landroid/content/Context;", "context", "message", "M", "(Landroid/content/Context;Ljava/lang/String;)V", "textLength", "borderColor", "Lc2/h;", "borderWidth", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.Y  reason: case insensitive filesystem */
public final class C18255Y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.Y$a */
    static final class a implements q<p<? super C4889m, ? super Integer, ? extends C16807N>, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150412b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18245N f150413c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f150414d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Y0 f150415e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f150416f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ M2 f150417g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C18246O f150418h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f150419i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f150420j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C4894o0 f150421k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: wK.Y$a$a  reason: collision with other inner class name */
        static final class C4310a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C18246O f150422a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f150423b;

            C4310a(C18246O o10, String str) {
                this.f150422a = o10;
                this.f150423b = str;
            }

            public final void a(C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                if ((i11 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(448230709, i11, -1, "net.ikea.skapa.ui.components.BaseInputField.<anonymous>.<anonymous> (BaseInputField.kt:139)");
                    }
                    Y b10 = C18030v.f147664a.b(mVar2, C18030v.f147665b).a().b();
                    long e10 = this.f150422a.e(mVar2, 0);
                    d1.b(this.f150423b, J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), e10, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, b10, mVar, 48, 0, 65528);
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

        a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C18245N n10, boolean z10, Y0 y02, String str, M2 m22, C18246O o10, boolean z11, String str2, C4894o0 o0Var) {
            this.f150411a = pVar;
            this.f150412b = pVar2;
            this.f150413c = n10;
            this.f150414d = z10;
            this.f150415e = y02;
            this.f150416f = str;
            this.f150417g = m22;
            this.f150418h = o10;
            this.f150419i = z11;
            this.f150420j = str2;
            this.f150421k = o0Var;
        }

        public final void a(p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
            int i11;
            p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
            C4889m mVar2 = mVar;
            C17542s.j(pVar2, "coreTextField");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.F(pVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(399146795, i11, -1, "net.ikea.skapa.ui.components.BaseInputField.<anonymous> (BaseInputField.kt:137)");
                }
                C18255Y.v(c1.c.e(448230709, true, new C4310a(this.f150418h, this.f150420j), mVar2, 54), pVar, this.f150411a, this.f150412b, Z1.q(this.f150413c, this.f150414d, this.f150415e.b(), this.f150416f, this.f150415e.c(), C18255Y.j(this.f150421k), this.f150417g, mVar, 0), this.f150418h, this.f150419i, mVar, ((i11 << 3) & 112) | 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.Y$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150425b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f150426c;

        b(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3) {
            this.f150424a = pVar;
            this.f150425b = pVar2;
            this.f150426c = pVar3;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1991688415, i10, -1, "net.ikea.skapa.ui.components.BaseInputFieldLayout.<anonymous> (BaseInputField.kt:308)");
                }
                p<C4889m, Integer, C16807N> pVar = this.f150424a;
                mVar.W(21935924);
                if (pVar != null) {
                    C18255Y.t("Leading", (androidx.compose.ui.d) null, pVar, mVar, 6, 2);
                    C16807N n10 = C16807N.f139792a;
                }
                mVar.P();
                p<C4889m, Integer, C16807N> pVar2 = this.f150425b;
                mVar.W(21938357);
                if (pVar2 != null) {
                    C18255Y.t("Trailing", (androidx.compose.ui.d) null, pVar2, mVar, 6, 2);
                    C16807N n11 = C16807N.f139792a;
                }
                mVar.P();
                p<C4889m, Integer, C16807N> pVar3 = this.f150426c;
                if (pVar3 != null) {
                    C18255Y.t("Helper", (androidx.compose.ui.d) null, pVar3, mVar, 6, 2);
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
    /* renamed from: wK.Y$c */
    static final class c implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f150427a;

        c(boolean z10) {
            this.f150427a = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, boolean z10, a0.a aVar) {
            a0.a aVar2 = aVar;
            C17542s.j(aVar2, "$this$layout");
            C18255Y.L(aVar2, i10, i11, a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, z10);
            return C16807N.f139792a;
        }

        public final E1.J i(K k10, List<? extends H> list, long j10) {
            Object obj;
            Object obj2;
            Object obj3;
            K k11 = k10;
            List<? extends H> list2 = list;
            long j11 = j10;
            C17542s.j(k11, "$this$Layout");
            C17542s.j(list2, "measurable");
            int K02 = k11.K0(C18029u.f147649a.j());
            long d10 = C5267b.d(j10, 0, 0, 0, 0, 10, (Object) null);
            int i10 = -K02;
            long o10 = c2.c.o(d10, 0, i10);
            Iterable<H> iterable = list2;
            for (H h10 : iterable) {
                if (C17542s.e(androidx.compose.ui.layout.a.a(h10), "Label")) {
                    a0 i02 = h10.i0(o10);
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C17542s.e(androidx.compose.ui.layout.a.a((H) obj), "Leading")) {
                            break;
                        }
                    }
                    H h11 = (H) obj;
                    a0 i03 = h11 != null ? h11.i0(d10) : null;
                    int E10 = C18255Y.P(i03);
                    Iterator it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        Iterator it3 = it2;
                        if (C17542s.e(androidx.compose.ui.layout.a.a((H) obj2), "Trailing")) {
                            break;
                        }
                        K k12 = k10;
                        it2 = it3;
                    }
                    H h12 = (H) obj2;
                    a0 i04 = h12 != null ? h12.i0(c2.c.p(d10, -E10, 0, 2, (Object) null)) : null;
                    long d11 = C5267b.d(c2.c.o(j11, -(E10 + C18255Y.P(i04)), i10), 0, 0, 0, 0, 11, (Object) null);
                    for (H h13 : iterable) {
                        if (C17542s.e(androidx.compose.ui.layout.a.a(h13), "textField")) {
                            a0 i05 = h13.i0(d11);
                            int B10 = C18255Y.H(i03, i04, i05, j11);
                            int A10 = C18255Y.G(i05.z0(), C17752b.e(((float) (this.f150427a ? 48 : 96)) * k10.getDensity()), j11);
                            for (H h14 : iterable) {
                                if (C17542s.e(androidx.compose.ui.layout.a.a(h14), "Border")) {
                                    a0 i06 = h14.i0(c2.c.a(B10 != Integer.MAX_VALUE ? B10 : 0, B10, A10, A10));
                                    Iterator it4 = iterable.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it4.next();
                                        if (C17542s.e(androidx.compose.ui.layout.a.a((H) obj3), "Helper")) {
                                            break;
                                        }
                                    }
                                    H h15 = (H) obj3;
                                    a0 i07 = h15 != null ? h15.i0(o10) : null;
                                    return K.v0(k10, B10, C18255Y.I(i07) + i02.z0() + A10, (Map) null, new C18256Z(A10, B10, i02, i03, i04, i05, i07, i06, this.f150427a), 4, (Object) null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                K k13 = k10;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.Y$d */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150428a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f150429b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                wK.N[] r0 = wK.C18245N.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                wK.N r2 = wK.C18245N.Default     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                wK.N r3 = wK.C18245N.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                wK.N r4 = wK.C18245N.Success     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                wK.N r5 = wK.C18245N.Warning     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f150428a = r0
                wK.Z2[] r0 = wK.Z2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.Z2 r5 = wK.Z2.Regular     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                wK.Z2 r1 = wK.Z2.Error     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                wK.Z2 r1 = wK.Z2.Success     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                wK.Z2 r1 = wK.Z2.Warning     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f150429b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18255Y.d.<clinit>():void");
        }
    }

    public static final A1<C5747v0> F(M2 m22, boolean z10, C18245N n10, C4889m mVar, int i10) {
        A1<C5747v0> a12;
        C17542s.j(m22, "enabledState");
        C17542s.j(n10, "state");
        mVar.W(-223542342);
        if (C4895p.J()) {
            C4895p.S(-223542342, i10, -1, "net.ikea.skapa.ui.components.borderIndicatorColor (BaseInputField.kt:422)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar, C18030v.f147665b);
        long K10 = m22 == M2.Disabled ? a10.K() : m22 == M2.ReadOnly ? C5747v0.f27350b.i() : n10 == C18245N.Error ? a10.v0() : n10 == C18245N.Success ? a10.w0() : n10 == C18245N.Warning ? a10.s0() : z10 ? a10.Q() : a10.o0();
        if (m22 == M2.Enabled) {
            mVar.W(954070674);
            a12 = u.a(K10, C5548j.j(150, 0, (C5525D) null, 6, (Object) null), "Enabled", (C17642l<? super C5747v0, C16807N>) null, mVar, 432, 8);
            mVar.P();
        } else {
            mVar.W(954170401);
            a12 = p1.q(C5747v0.k(K10), mVar, 0);
            mVar.P();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a12;
    }

    /* access modifiers changed from: private */
    public static final int G(int i10, int i11, long j10) {
        return Math.max(i10, Math.max(i11, C5267b.m(j10)));
    }

    /* access modifiers changed from: private */
    public static final int H(a0 a0Var, a0 a0Var2, a0 a0Var3, long j10) {
        return Math.max(P(a0Var) + C17035a.j(a0Var3.E0(), new int[0]) + P(a0Var2), C5267b.n(j10));
    }

    /* access modifiers changed from: private */
    public static final int I(a0 a0Var) {
        if (a0Var != null) {
            return a0Var.z0();
        }
        return 0;
    }

    private static final boolean J(int i10, String str) {
        return i10 > 0 && str.length() > i10;
    }

    public static final boolean K(C18245N n10) {
        C17542s.j(n10, "state");
        return n10 == C18245N.Error;
    }

    /* access modifiers changed from: private */
    public static final void L(a0.a aVar, int i10, int i11, a0 a0Var, a0 a0Var2, a0 a0Var3, a0 a0Var4, a0 a0Var5, a0 a0Var6, boolean z10) {
        int i12 = i10;
        a0.a.k(aVar, a0Var, n.f23044b.a(), 0.0f, 2, (Object) null);
        a0.a.m(aVar, a0Var6, 0, a0Var.z0(), 0.0f, 4, (Object) null);
        if (a0Var2 != null) {
            a0.a.m(aVar, a0Var2, 0, a0Var.z0() + C5437c.f24302a.i().a(a0Var2.z0(), i12), 0.0f, 4, (Object) null);
        }
        if (a0Var3 != null) {
            a0.a.m(aVar, a0Var3, i11 - a0Var3.E0(), a0Var.z0() + C5437c.f24302a.i().a(a0Var3.z0(), i12), 0.0f, 4, (Object) null);
        }
        a0.a.m(aVar, a0Var4, P(a0Var2), a0Var.z0() + (z10 ? C5437c.f24302a.i().a(a0Var4.z0(), i12) : C5437c.f24302a.l().a(a0Var4.z0(), i12)), 0.0f, 4, (Object) null);
        if (a0Var5 != null) {
            a0.a.m(aVar, a0Var5, 0, i12 + a0Var.z0(), 0.0f, 4, (Object) null);
        }
    }

    private static final void M(Context context, String str) {
        Object systemService = context.getSystemService("accessibility");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent a10 = Build.VERSION.SDK_INT >= 30 ? C18247P.a() : AccessibilityEvent.obtain();
            a10.setEventType(16384);
            a10.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(a10);
        }
    }

    public static final C18245N N(X2 x22) {
        C17542s.j(x22, "<this>");
        int i10 = d.f150429b[x22.c().ordinal()];
        if (i10 == 1) {
            return C18245N.Default;
        }
        if (i10 == 2) {
            return C18245N.Error;
        }
        if (i10 == 3) {
            return C18245N.Success;
        }
        if (i10 == 4) {
            return C18245N.Warning;
        }
        throw new t();
    }

    public static final Z2 O(C18245N n10) {
        C17542s.j(n10, "<this>");
        int i10 = d.f150428a[n10.ordinal()];
        if (i10 == 1) {
            return Z2.Regular;
        }
        if (i10 == 2) {
            return Z2.Error;
        }
        if (i10 == 3) {
            return Z2.Success;
        }
        if (i10 == 4) {
            return Z2.Warning;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final int P(a0 a0Var) {
        if (a0Var != null) {
            return a0Var.E0();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: r0.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(java.lang.String r69, nI.C17642l<? super java.lang.String, XH.C16807N> r70, java.lang.String r71, androidx.compose.ui.d r72, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r73, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r74, java.lang.String r75, wK.Y0 r76, wK.M2 r77, boolean r78, T1.b0 r79, B0.A r80, B0.C4381z r81, r0.m r82, wK.C18245N r83, int r84, U0.C4889m r85, int r86, int r87, int r88) {
        /*
            r14 = r69
            r13 = r70
            r11 = r71
            r9 = r86
            r8 = r87
            r7 = r88
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = 1572864(0x180000, float:2.204052E-39)
            r15 = 128(0x80, float:1.794E-43)
            r2 = 32
            r17 = 16
            java.lang.String r6 = "value"
            kotlin.jvm.internal.C17542s.j(r14, r6)
            java.lang.String r6 = "onChange"
            kotlin.jvm.internal.C17542s.j(r13, r6)
            java.lang.String r6 = "label"
            kotlin.jvm.internal.C17542s.j(r11, r6)
            r6 = 1341013486(0x4fee3dee, float:7.9940721E9)
            r5 = r85
            U0.m r5 = r5.k(r6)
            r6 = 1
            r22 = r7 & 1
            r23 = 2
            r24 = 4
            if (r22 == 0) goto L_0x003a
            r22 = r9 | 6
            goto L_0x004e
        L_0x003a:
            r22 = r9 & 6
            if (r22 != 0) goto L_0x004c
            boolean r22 = r5.V(r14)
            if (r22 == 0) goto L_0x0047
            r22 = r24
            goto L_0x0049
        L_0x0047:
            r22 = r23
        L_0x0049:
            r22 = r9 | r22
            goto L_0x004e
        L_0x004c:
            r22 = r9
        L_0x004e:
            r25 = r7 & 2
            if (r25 == 0) goto L_0x0057
            r22 = r22 | 48
        L_0x0054:
            r6 = r22
            goto L_0x0069
        L_0x0057:
            r25 = r9 & 48
            if (r25 != 0) goto L_0x0054
            boolean r25 = r5.F(r13)
            if (r25 == 0) goto L_0x0064
            r25 = r2
            goto L_0x0066
        L_0x0064:
            r25 = r17
        L_0x0066:
            r22 = r22 | r25
            goto L_0x0054
        L_0x0069:
            r22 = r7 & 4
            if (r22 == 0) goto L_0x0070
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x007f
        L_0x0070:
            r10 = r9 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x007f
            boolean r10 = r5.V(r11)
            if (r10 == 0) goto L_0x007d
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x007e
        L_0x007d:
            r10 = r15
        L_0x007e:
            r6 = r6 | r10
        L_0x007f:
            r10 = r7 & 8
            if (r10 == 0) goto L_0x0088
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0085:
            r0 = r72
            goto L_0x009b
        L_0x0088:
            r0 = r9 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0085
            r0 = r72
            boolean r26 = r5.V(r0)
            if (r26 == 0) goto L_0x0097
            r26 = 2048(0x800, float:2.87E-42)
            goto L_0x0099
        L_0x0097:
            r26 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r6 = r6 | r26
        L_0x009b:
            r26 = r7 & 16
            if (r26 == 0) goto L_0x00a4
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x00a1:
            r1 = r73
            goto L_0x00b7
        L_0x00a4:
            r1 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x00a1
            r1 = r73
            boolean r28 = r5.F(r1)
            if (r28 == 0) goto L_0x00b3
            r28 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b5
        L_0x00b3:
            r28 = 8192(0x2000, float:1.14794E-41)
        L_0x00b5:
            r6 = r6 | r28
        L_0x00b7:
            r28 = r7 & 32
            r29 = 65536(0x10000, float:9.18355E-41)
            r30 = 131072(0x20000, float:1.83671E-40)
            r31 = 196608(0x30000, float:2.75506E-40)
            if (r28 == 0) goto L_0x00c6
            r6 = r6 | r31
            r2 = r74
            goto L_0x00d9
        L_0x00c6:
            r32 = r9 & r31
            r2 = r74
            if (r32 != 0) goto L_0x00d9
            boolean r33 = r5.F(r2)
            if (r33 == 0) goto L_0x00d5
            r33 = r30
            goto L_0x00d7
        L_0x00d5:
            r33 = r29
        L_0x00d7:
            r6 = r6 | r33
        L_0x00d9:
            r33 = r7 & 64
            if (r33 == 0) goto L_0x00e1
            r6 = r6 | r4
        L_0x00de:
            r4 = r75
            goto L_0x00f3
        L_0x00e1:
            r4 = r4 & r9
            if (r4 != 0) goto L_0x00de
            r4 = r75
            boolean r34 = r5.V(r4)
            if (r34 == 0) goto L_0x00ef
            r34 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f1
        L_0x00ef:
            r34 = 524288(0x80000, float:7.34684E-40)
        L_0x00f1:
            r6 = r6 | r34
        L_0x00f3:
            r12 = r7 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x00fd
            r6 = r6 | r3
        L_0x00f8:
            r3 = r76
        L_0x00fa:
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0110
        L_0x00fd:
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00f8
            r3 = r76
            boolean r35 = r5.V(r3)
            if (r35 == 0) goto L_0x010b
            r35 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r35 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r6 = r6 | r35
            goto L_0x00fa
        L_0x0110:
            r0 = r7 & 256(0x100, float:3.59E-43)
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x011b
            r6 = r6 | r27
            r15 = r77
            goto L_0x012e
        L_0x011b:
            r27 = r9 & r27
            r15 = r77
            if (r27 != 0) goto L_0x012e
            boolean r35 = r5.V(r15)
            if (r35 == 0) goto L_0x012a
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012c
        L_0x012a:
            r35 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012c:
            r6 = r6 | r35
        L_0x012e:
            r1 = r7 & 512(0x200, float:7.175E-43)
            r25 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x0139
        L_0x0134:
            r6 = r6 | r25
        L_0x0136:
            r2 = 1024(0x400, float:1.435E-42)
            goto L_0x014b
        L_0x0139:
            r25 = r9 & r25
            r2 = r78
            if (r25 != 0) goto L_0x0136
            boolean r25 = r5.b(r2)
            if (r25 == 0) goto L_0x0148
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0134
        L_0x0148:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0134
        L_0x014b:
            r3 = r7 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0156
            r22 = r8 | 6
            r2 = r79
            r23 = r22
            goto L_0x0169
        L_0x0156:
            r22 = r8 & 6
            r2 = r79
            if (r22 != 0) goto L_0x0167
            boolean r25 = r5.V(r2)
            if (r25 == 0) goto L_0x0164
            r23 = r24
        L_0x0164:
            r23 = r8 | r23
            goto L_0x0169
        L_0x0167:
            r23 = r8
        L_0x0169:
            r24 = r8 & 48
            if (r24 != 0) goto L_0x0182
            r2 = 2048(0x800, float:2.87E-42)
            r4 = r7 & 2048(0x800, float:2.87E-42)
            r2 = r80
            if (r4 != 0) goto L_0x017d
            boolean r4 = r5.V(r2)
            if (r4 == 0) goto L_0x017d
            r17 = 32
        L_0x017d:
            r23 = r23 | r17
        L_0x017f:
            r4 = r23
            goto L_0x0185
        L_0x0182:
            r2 = r80
            goto L_0x017f
        L_0x0185:
            r2 = r7 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x018e
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x018b:
            r11 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01a5
        L_0x018e:
            r11 = r8 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x01a2
            r11 = r81
            boolean r17 = r5.V(r11)
            if (r17 == 0) goto L_0x019d
            r34 = 256(0x100, float:3.59E-43)
            goto L_0x019f
        L_0x019d:
            r34 = 128(0x80, float:1.794E-43)
        L_0x019f:
            r4 = r4 | r34
            goto L_0x018b
        L_0x01a2:
            r11 = r81
            goto L_0x018b
        L_0x01a5:
            r15 = r7 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x01ae
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x01ab:
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01c5
        L_0x01ae:
            r11 = r8 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x01c2
            r11 = r82
            boolean r17 = r5.V(r11)
            if (r17 == 0) goto L_0x01bd
            r22 = 2048(0x800, float:2.87E-42)
            goto L_0x01bf
        L_0x01bd:
            r22 = 1024(0x400, float:1.435E-42)
        L_0x01bf:
            r4 = r4 | r22
            goto L_0x01ab
        L_0x01c2:
            r11 = r82
            goto L_0x01ab
        L_0x01c5:
            r13 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01ce
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x01cb:
            r11 = r83
            goto L_0x01e1
        L_0x01ce:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01cb
            r11 = r83
            boolean r17 = r5.V(r11)
            if (r17 == 0) goto L_0x01dd
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01df
        L_0x01dd:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x01df:
            r4 = r4 | r18
        L_0x01e1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r7 & r17
            if (r17 == 0) goto L_0x01ed
            r4 = r4 | r31
            r8 = r84
            goto L_0x01fd
        L_0x01ed:
            r18 = r8 & r31
            r8 = r84
            if (r18 != 0) goto L_0x01fd
            boolean r18 = r5.d(r8)
            if (r18 == 0) goto L_0x01fb
            r29 = r30
        L_0x01fb:
            r4 = r4 | r29
        L_0x01fd:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r6 & r18
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r11) goto L_0x0238
            r8 = 74899(0x12493, float:1.04956E-40)
            r8 = r8 & r4
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r11) goto L_0x0238
            boolean r8 = r5.l()
            if (r8 != 0) goto L_0x0217
            goto L_0x0238
        L_0x0217:
            r5.L()
            r4 = r72
            r6 = r74
            r7 = r75
            r8 = r76
            r9 = r77
            r10 = r78
            r11 = r79
            r12 = r80
            r13 = r81
            r14 = r82
            r15 = r83
            r16 = r84
            r30 = r5
            r5 = r73
            goto L_0x051c
        L_0x0238:
            r5.G()
            r8 = 1
            r11 = r9 & 1
            if (r11 == 0) goto L_0x026e
            boolean r11 = r5.O()
            if (r11 == 0) goto L_0x0247
            goto L_0x026e
        L_0x0247:
            r5.L()
            r0 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0251
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0251:
            r13 = r72
            r22 = r73
            r23 = r74
            r24 = r75
            r11 = r76
            r8 = r77
            r25 = r78
            r26 = r79
            r27 = r80
            r28 = r81
            r3 = r83
            r29 = r84
            r0 = r4
            r4 = r82
            goto L_0x033c
        L_0x026e:
            if (r10 == 0) goto L_0x0273
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            goto L_0x0275
        L_0x0273:
            r10 = r72
        L_0x0275:
            if (r26 == 0) goto L_0x0279
            r11 = 0
            goto L_0x027b
        L_0x0279:
            r11 = r73
        L_0x027b:
            if (r28 == 0) goto L_0x0280
            r18 = 0
            goto L_0x0282
        L_0x0280:
            r18 = r74
        L_0x0282:
            if (r33 == 0) goto L_0x0287
            r19 = 0
            goto L_0x0289
        L_0x0287:
            r19 = r75
        L_0x0289:
            if (r12 == 0) goto L_0x0292
            wK.Y0$a r12 = wK.Y0.f150430c
            wK.Y0 r12 = r12.a()
            goto L_0x0294
        L_0x0292:
            r12 = r76
        L_0x0294:
            if (r0 == 0) goto L_0x0299
            wK.M2 r0 = wK.M2.Enabled
            goto L_0x029b
        L_0x0299:
            r0 = r77
        L_0x029b:
            if (r1 == 0) goto L_0x029f
            r1 = 1
            goto L_0x02a1
        L_0x029f:
            r1 = r78
        L_0x02a1:
            if (r3 == 0) goto L_0x02ac
            T1.b0$a r3 = T1.b0.f13577a
            T1.b0 r3 = r3.c()
        L_0x02a9:
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x02af
        L_0x02ac:
            r3 = r79
            goto L_0x02a9
        L_0x02af:
            r8 = r8 & r7
            if (r8 == 0) goto L_0x02d1
            B0.A$a r8 = B0.A.f4480g
            B0.A r33 = r8.a()
            java.lang.Boolean r35 = java.lang.Boolean.FALSE
            r41 = 125(0x7d, float:1.75E-43)
            r42 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            B0.A r8 = B0.A.c(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r4 = r4 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02d3
        L_0x02d1:
            r8 = r80
        L_0x02d3:
            if (r2 == 0) goto L_0x02dc
            B0.z$a r2 = B0.C4381z.f5150g
            B0.z r2 = r2.a()
            goto L_0x02de
        L_0x02dc:
            r2 = r81
        L_0x02de:
            if (r15 == 0) goto L_0x0302
            r15 = 1984299513(0x764601f9, float:1.00401835E33)
            r5.W(r15)
            java.lang.Object r15 = r5.D()
            U0.m$a r22 = U0.C4889m.f14007a
            r72 = r0
            java.lang.Object r0 = r22.a()
            if (r15 != r0) goto L_0x02fb
            r0.m r15 = r0.l.a()
            r5.u(r15)
        L_0x02fb:
            r0 = r15
            r0.m r0 = (r0.m) r0
            r5.P()
            goto L_0x0306
        L_0x0302:
            r72 = r0
            r0 = r82
        L_0x0306:
            if (r13 == 0) goto L_0x030b
            wK.N r13 = wK.C18245N.Default
            goto L_0x030d
        L_0x030b:
            r13 = r83
        L_0x030d:
            if (r17 == 0) goto L_0x032d
            r15 = 2147483647(0x7fffffff, float:NaN)
            r25 = r1
            r28 = r2
            r26 = r3
            r27 = r8
            r22 = r11
            r11 = r12
            r3 = r13
            r29 = r15
        L_0x0320:
            r23 = r18
            r24 = r19
            r8 = r72
            r13 = r10
            r68 = r4
            r4 = r0
            r0 = r68
            goto L_0x033c
        L_0x032d:
            r29 = r84
            r25 = r1
            r28 = r2
            r26 = r3
            r27 = r8
            r22 = r11
            r11 = r12
            r3 = r13
            goto L_0x0320
        L_0x033c:
            r5.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x034d
            java.lang.String r1 = "net.ikea.skapa.ui.components.BaseInputField (BaseInputField.kt:104)"
            r2 = 1341013486(0x4fee3dee, float:7.9940721E9)
            U0.C4895p.S(r2, r6, r0, r1)
        L_0x034d:
            r1 = 1984304478(0x7646155e, float:1.0044025E33)
            r5.W(r1)
            java.lang.Object r1 = r5.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r10 = r2.a()
            if (r1 != r10) goto L_0x036a
            int r1 = r69.length()
            U0.o0 r1 = U0.C4877g1.a(r1)
            r5.u(r1)
        L_0x036a:
            r10 = r1
            U0.o0 r10 = (U0.C4894o0) r10
            r5.P()
            int r1 = r0 >> 9
            r1 = r1 & 14
            U0.A1 r1 = r0.C5814f.a(r4, r5, r1)
            int r12 = r11.c()
            boolean r12 = J(r12, r14)
            r15 = 1984313366(0x76463816, float:1.0050902E33)
            r5.W(r15)
            if (r12 == 0) goto L_0x03a1
            java.lang.String r15 = r11.b()
            if (r15 != 0) goto L_0x038f
            goto L_0x03a1
        L_0x038f:
            r21 = r4
            U0.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r5.Q(r4)
            android.content.Context r4 = (android.content.Context) r4
            M(r4, r15)
            XH.N r4 = XH.C16807N.f139792a
            goto L_0x03a3
        L_0x03a1:
            r21 = r4
        L_0x03a3:
            r5.P()
            wK.O r4 = new wK.O
            boolean r1 = l(r1)
            r4.<init>(r8, r1, r3)
            wK.M2 r1 = wK.M2.Disabled
            if (r8 == r1) goto L_0x03b6
            r30 = 1
            goto L_0x03b8
        L_0x03b6:
            r30 = 0
        L_0x03b8:
            wK.M2 r1 = wK.M2.ReadOnly
            if (r8 != r1) goto L_0x03bf
            r33 = 1
            goto L_0x03c1
        L_0x03bf:
            r33 = 0
        L_0x03c1:
            tK.v r1 = tK.C18030v.f147664a
            int r15 = tK.C18030v.f147665b
            tK.w r1 = r1.b(r5, r15)
            tK.c r1 = r1.a()
            N1.Y r34 = r1.a()
            r1 = 0
            long r35 = r4.d(r5, r1)
            r64 = 16777214(0xfffffe, float:2.3509884E-38)
            r65 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            N1.Y r34 = N1.Y.c(r34, r35, r37, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65)
            p1.j1 r15 = new p1.j1
            r35 = r8
            r1 = 0
            long r7 = r4.d(r5, r1)
            r1 = 0
            r15.<init>(r7, r1)
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r7 = 1984384212(0x76474cd4, float:1.0105716E33)
            r5.W(r7)
            java.lang.Object r7 = r5.D()
            java.lang.Object r8 = r2.a()
            if (r7 != r8) goto L_0x0434
            wK.Q r7 = new wK.Q
            r7.<init>()
            r5.u(r7)
        L_0x0434:
            nI.l r7 = (nI.C17642l) r7
            r5.P()
            r8 = 1
            androidx.compose.ui.d r1 = L1.o.c(r1, r8, r7)
            androidx.compose.ui.d r1 = r1.s(r13)
            r7 = 0
            r9 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r1, r7, r8, r9)
            r1 = 1984329473(0x76467701, float:1.0063364E33)
            r5.W(r1)
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r6
            r8 = 8388608(0x800000, float:1.17549435E-38)
            if (r1 != r8) goto L_0x0457
            r8 = 1
            goto L_0x0458
        L_0x0457:
            r8 = 0
        L_0x0458:
            r1 = r6 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r1 != r9) goto L_0x0460
            r1 = 1
            goto L_0x0461
        L_0x0460:
            r1 = 0
        L_0x0461:
            r1 = r1 | r8
            java.lang.Object r8 = r5.D()
            if (r1 != 0) goto L_0x0472
            java.lang.Object r1 = r2.a()
            if (r8 != r1) goto L_0x046f
            goto L_0x0472
        L_0x046f:
            r9 = r70
            goto L_0x047c
        L_0x0472:
            wK.S r8 = new wK.S
            r9 = r70
            r8.<init>(r11, r9, r10)
            r5.u(r8)
        L_0x047c:
            r1 = r8
            nI.l r1 = (nI.C17642l) r1
            r5.P()
            wK.Y$a r2 = new wK.Y$a
            r72 = r2
            r73 = r22
            r74 = r23
            r75 = r3
            r76 = r12
            r77 = r11
            r78 = r24
            r79 = r35
            r80 = r4
            r81 = r25
            r82 = r71
            r83 = r10
            r72.<init>(r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)
            r4 = 54
            r8 = 399146795(0x17ca7f2b, float:1.3086046E-24)
            r10 = 1
            c1.a r2 = c1.c.e(r8, r10, r2, r5, r4)
            r16 = r15
            r15 = r2
            r2 = r6 & 14
            int r4 = r0 << 15
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r4
            r2 = r2 | r8
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r4 = r4 & r8
            r2 = r2 | r4
            int r4 = r6 >> 3
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r4 = r4 & r6
            r2 = r2 | r4
            int r4 = r0 << 12
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r6
            r17 = r2 | r4
            int r2 = r0 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r31
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r18 = r2 | r0
            r19 = 5120(0x1400, float:7.175E-42)
            r10 = 0
            r12 = 0
            r0 = r69
            r2 = r7
            r20 = r3
            r3 = r30
            r4 = r33
            r30 = r5
            r5 = r34
            r6 = r27
            r7 = r28
            r31 = r35
            r8 = r25
            r9 = r29
            r32 = r11
            r11 = r26
            r33 = r13
            r13 = r21
            r14 = r16
            r16 = r30
            B0.C4359c.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0502
            U0.C4895p.R()
        L_0x0502:
            r15 = r20
            r14 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r16 = r29
            r9 = r31
            r8 = r32
            r4 = r33
        L_0x051c:
            U0.Y0 r3 = r30.n()
            if (r3 == 0) goto L_0x053f
            wK.T r2 = new wK.T
            r0 = r2
            r1 = r69
            r66 = r2
            r2 = r70
            r67 = r3
            r3 = r71
            r17 = r86
            r18 = r87
            r19 = r88
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r66
            r0 = r67
            r0.a(r1)
        L_0x053f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18255Y.h(java.lang.String, nI.l, java.lang.String, androidx.compose.ui.d, nI.p, nI.p, java.lang.String, wK.Y0, wK.M2, boolean, T1.b0, B0.A, B0.z, r0.m, wK.N, int, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, C17642l lVar, String str2, androidx.compose.ui.d dVar, p pVar, p pVar2, String str3, Y0 y02, M2 m22, boolean z10, b0 b0Var, A a10, C4381z zVar, m mVar, C18245N n10, int i10, int i11, int i12, int i13, C4889m mVar2, int i14) {
        h(str, lVar, str2, dVar, pVar, pVar2, str3, y02, m22, z10, b0Var, a10, zVar, mVar, n10, i10, mVar2, M0.a(i11 | 1), M0.a(i12), i13);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int j(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void k(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    private static final boolean l(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(Y0 y02, C17642l lVar, C4894o0 o0Var, String str) {
        C17542s.j(str, "it");
        if (y02.c() > 0) {
            k(o0Var, str.length());
        }
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    private static final void o(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, C18246O o10, boolean z10, C4889m mVar, int i10) {
        int i11;
        d.a aVar;
        androidx.compose.ui.d dVar;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar3;
        p<? super C4889m, ? super Integer, C16807N> pVar9 = pVar4;
        p<? super C4889m, ? super Integer, C16807N> pVar10 = pVar5;
        C18246O o11 = o10;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(1317046881);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(pVar6) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar7) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar8) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar9) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar10) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.V(o11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.b(z11) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((599187 & i11) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1317046881, i11, -1, "net.ikea.skapa.ui.components.BaseInputFieldLayout (BaseInputField.kt:272)");
            }
            int i13 = (i11 >> 15) & 14;
            long a10 = o11.a(k10, i13);
            A1<C5747v0> b10 = o11.b(k10, i13);
            A1<h> c10 = o11.c(k10, i13);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d b11 = androidx.compose.ui.layout.a.b(aVar2, "Border");
            k10.W(2010748507);
            boolean V10 = k10.V(c10) | k10.e(a10) | k10.V(b10);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C18252V(a10, c10, b10);
                k10.u(D10);
            }
            k10.P();
            C5077h.a(androidx.compose.ui.draw.b.b(b11, (C17642l) D10), k10, 0);
            androidx.compose.ui.d m10 = D.m(androidx.compose.ui.layout.a.b(aVar2, "Label"), 0.0f, 0.0f, 0.0f, h.B((float) 2), 7, (Object) null);
            C5437c.a aVar3 = C5437c.f24302a;
            I h10 = C5077h.h(aVar3.o(), false);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, m10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            d.a aVar5 = aVar2;
            F1.c(a13, h10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b12 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b12);
            }
            F1.c(a13, e10, aVar4.d());
            C5079j jVar = C5079j.f18125a;
            pVar6.invoke(k10, Integer.valueOf(i11 & 14));
            k10.x();
            C4910x.a(E.a().d(C5747v0.k(C18030v.f147664a.a(k10, C18030v.f147665b).I0())), c1.c.e(-1991688415, true, new b(pVar8, pVar9, pVar10), k10, 54), k10, J0.f13770i | 48);
            if (z11) {
                C18029u uVar = C18029u.f147649a;
                float j10 = pVar8 == null ? uVar.j() : uVar.f();
                C18029u uVar2 = C18029u.f147649a;
                float j11 = pVar9 == null ? uVar2.j() : uVar2.f();
                aVar = aVar5;
                dVar = D.m(aVar, j10, 0.0f, j11, 0.0f, 10, (Object) null);
            } else {
                aVar = aVar5;
                C18029u uVar3 = C18029u.f147649a;
                dVar = D.l(aVar, uVar3.j(), uVar3.l(), uVar3.j(), uVar3.l());
            }
            androidx.compose.ui.d s11 = androidx.compose.ui.layout.a.b(aVar, "textField").s(dVar);
            I h11 = C5077h.h(aVar3.o(), true);
            int a14 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, s11);
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
            F1.c(a16, h11, aVar4.c());
            F1.c(a16, s12, aVar4.e());
            p<C4504g, Integer, C16807N> b13 = aVar4.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b13);
            }
            F1.c(a16, e11, aVar4.d());
            pVar7.invoke(k10, Integer.valueOf((i11 >> 3) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18253W(pVar, pVar2, pVar3, pVar4, pVar5, o10, z10, i10));
        }
    }

    private static final long p(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    private static final float q(A1<h> a12) {
        return a12.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final C16807N r(long j10, A1 a12, A1 a13, f fVar) {
        f fVar2 = fVar;
        C17542s.j(fVar2, "$this$drawBehind");
        float H12 = fVar2.H1(q(a12));
        float f10 = (float) 4;
        f.L1(fVar, j10, C5667g.f26701b.c(), fVar.b(), C5662b.b(fVar2.H1(h.B(f10)), 0.0f, 2, (Object) null), r1.j.f28627a, 0.0f, (C5749w0) null, 0, 224, (Object) null);
        float f11 = H12 / ((float) 2);
        f.L1(fVar, p(a13), C5668h.a(f11, f11), C5674n.a(C5673m.l(fVar.b()) - H12, C5673m.i(fVar.b()) - H12), C5662b.b(fVar2.H1(h.B(f10)), 0.0f, 2, (Object) null), new r1.k(H12, 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), 0.0f, (C5749w0) null, 0, 224, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, C18246O o10, boolean z10, int i10, C4889m mVar, int i11) {
        o(pVar, pVar2, pVar3, pVar4, pVar5, o10, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void t(String str, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(774737189);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = 2 & i11;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((4 & i11) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(pVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(774737189, i12, -1, "net.ikea.skapa.ui.components.PlaceableItem (BaseInputField.kt:338)");
            }
            androidx.compose.ui.d s10 = androidx.compose.ui.layout.a.b(androidx.compose.ui.d.f18749a, str).s(J.E(dVar, (C5437c) null, false, 3, (Object) null));
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, s10);
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
            F1.c(a12, h10, aVar.c());
            F1.c(a12, s11, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            pVar.invoke(k10, Integer.valueOf((i12 >> 6) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18254X(str, dVar2, pVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(String str, androidx.compose.ui.d dVar, p pVar, int i10, int i11, C4889m mVar, int i12) {
        t(str, dVar, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void v(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, C18246O o10, boolean z10, C4889m mVar, int i10) {
        int i11;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(867643155);
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar;
        if ((i12 & 6) == 0) {
            i11 = (k10.F(pVar6) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar2;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar7) ? 32 : 16;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar3;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar8) ? 256 : 128;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar9 = pVar4;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar9) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar10 = pVar5;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar10) ? 16384 : 8192;
        }
        C18246O o11 = o10;
        if ((196608 & i12) == 0) {
            i11 |= k10.V(o11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.b(z11) ? 1048576 : ImageMetadata.LENS_APERTURE;
        }
        if ((599187 & i11) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(867643155, i11, -1, "net.ikea.skapa.ui.components.TextFieldLayoutWithDecorators (BaseInputField.kt:187)");
            }
            k10.W(-1574855797);
            boolean z12 = (3670016 & i11) == 1048576;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new c(z11);
                k10.u(D10);
            }
            I i13 = (I) D10;
            k10.P();
            d.a aVar = androidx.compose.ui.d.f18749a;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
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
            F1.c(a12, i13, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            o(pVar, pVar2, pVar3, pVar4, pVar5, o10, z10, k10, i11 & 4194302);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            C18251U u10 = r0;
            C18251U u11 = new C18251U(pVar, pVar2, pVar3, pVar4, pVar5, o10, z10, i10);
            n10.a(u10);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, C18246O o10, boolean z10, int i10, C4889m mVar, int i11) {
        v(pVar, pVar2, pVar3, pVar4, pVar5, o10, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
