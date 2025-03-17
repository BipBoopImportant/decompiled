package O0;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import L1.o;
import L1.v;
import L1.x;
import Q0.s;
import Q0.t;
import Q0.u;
import S0.C4803e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.J0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import p1.i1;
import s0.C5834E;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u001a?\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a®\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a0\u0010 \u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\"\u001a\u0010%\u001a\u00020\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$\"\u001a\u0010'\u001a\u00020\u00168\u0000X\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b&\u0010$\"\u0014\u0010(\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"\"\u0014\u0010)\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"\"\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00101\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00103\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010,\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Landroidx/compose/ui/d;", "modifier", "Landroidx/compose/ui/window/h;", "properties", "content", "d", "(LnI/a;Landroidx/compose/ui/d;Landroidx/compose/ui/window/h;LnI/p;LU0/m;II)V", "confirmButton", "dismissButton", "icon", "title", "text", "Lp1/i1;", "shape", "Lp1/v0;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "Lc2/h;", "tonalElevation", "c", "(LnI/a;LnI/p;Landroidx/compose/ui/d;LnI/p;LnI/p;LnI/p;LnI/p;Lp1/i1;JJJJFLandroidx/compose/ui/window/h;LU0/m;II)V", "buttons", "buttonContentColor", "a", "(LnI/p;Landroidx/compose/ui/d;LnI/p;LnI/p;LnI/p;Lp1/i1;JFJJJJLU0/m;III)V", "mainAxisSpacing", "crossAxisSpacing", "b", "(FFLnI/p;LU0/m;I)V", "F", "l", "()F", "DialogMinWidth", "k", "DialogMaxWidth", "ButtonsMainAxisSpacing", "ButtonsCrossAxisSpacing", "Ls0/E;", "e", "Ls0/E;", "DialogPadding", "f", "IconPadding", "g", "TitlePadding", "h", "TextPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.b  reason: case insensitive filesystem */
public final class C4718b {

    /* renamed from: a  reason: collision with root package name */
    private static final float f10261a = c2.h.B((float) 280);

    /* renamed from: b  reason: collision with root package name */
    private static final float f10262b = c2.h.B((float) 560);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float f10263c = c2.h.B((float) 8);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final float f10264d = c2.h.B((float) 12);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C5834E f10265e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C5834E f10266f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C5834E f10267g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C5834E f10268h;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10269c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10270d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10271e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f10272f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f10273g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f10274h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10275i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10276j;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b$a$a  reason: collision with other inner class name */
        static final class C0153a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5861g f10277c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10278d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0153a(C5861g gVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f10277c = gVar;
                this.f10278d = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(934657765, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                    }
                    C5861g gVar = this.f10277c;
                    androidx.compose.ui.d h10 = D.h(androidx.compose.ui.d.f18749a, C4718b.f10266f);
                    C5437c.a aVar = C5437c.f24302a;
                    androidx.compose.ui.d b10 = gVar.b(h10, aVar.g());
                    p<C4889m, Integer, C16807N> pVar = this.f10278d;
                    I h11 = C5077h.h(aVar.o(), false);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, b10);
                    C4504g.a aVar2 = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar2.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h11, aVar2.c());
                    F1.c(a12, s10, aVar2.e());
                    p<C4504g, Integer, C16807N> b11 = aVar2.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b11);
                    }
                    F1.c(a12, e10, aVar2.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar.invoke(mVar, 0);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b$a$b  reason: collision with other inner class name */
        static final class C0154b extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5861g f10279c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10280d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10281e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0154b(C5861g gVar, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
                super(2);
                this.f10279c = gVar;
                this.f10280d = pVar;
                this.f10281e = pVar2;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(434448772, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                    }
                    androidx.compose.ui.d b10 = this.f10279c.b(D.h(androidx.compose.ui.d.f18749a, C4718b.f10267g), this.f10280d == null ? C5437c.f24302a.k() : C5437c.f24302a.g());
                    p<C4889m, Integer, C16807N> pVar = this.f10281e;
                    I h10 = C5077h.h(C5437c.f24302a.o(), false);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, b10);
                    C4504g.a aVar = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h10, aVar.c());
                    F1.c(a12, s10, aVar.e());
                    p<C4504g, Integer, C16807N> b11 = aVar.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b11);
                    }
                    F1.c(a12, e10, aVar.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar.invoke(mVar, 0);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b$a$c */
        static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5861g f10282c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10283d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C5861g gVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
                super(2);
                this.f10282c = gVar;
                this.f10283d = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-796843771, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                    }
                    C5861g gVar = this.f10282c;
                    androidx.compose.ui.d h10 = D.h(gVar.a(androidx.compose.ui.d.f18749a, 1.0f, false), C4718b.f10268h);
                    C5437c.a aVar = C5437c.f24302a;
                    androidx.compose.ui.d b10 = gVar.b(h10, aVar.k());
                    p<C4889m, Integer, C16807N> pVar = this.f10283d;
                    I h11 = C5077h.h(aVar.o(), false);
                    int a10 = C4883j.a(mVar, 0);
                    C4912y s10 = mVar.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, b10);
                    C4504g.a aVar2 = C4504g.f6515W;
                    C17631a<C4504g> a11 = aVar2.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar.p(a11);
                    } else {
                        mVar.t();
                    }
                    C4889m a12 = F1.a(mVar);
                    F1.c(a12, h11, aVar2.c());
                    F1.c(a12, s10, aVar2.e());
                    p<C4504g, Integer, C16807N> b11 = aVar2.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b11);
                    }
                    F1.c(a12, e10, aVar2.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar.invoke(mVar, 0);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, long j10, long j11, long j12, long j13, p<? super C4889m, ? super Integer, C16807N> pVar4) {
            super(2);
            this.f10269c = pVar;
            this.f10270d = pVar2;
            this.f10271e = pVar3;
            this.f10272f = j10;
            this.f10273g = j11;
            this.f10274h = j12;
            this.f10275i = j13;
            this.f10276j = pVar4;
        }

        public final void a(C4889m mVar, int i10) {
            p<C4889m, Integer, C16807N> pVar;
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2126308228, i11, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d h10 = D.h(aVar, C4718b.f10265e);
                p<C4889m, Integer, C16807N> pVar2 = this.f10269c;
                p<C4889m, Integer, C16807N> pVar3 = this.f10270d;
                p<C4889m, Integer, C16807N> pVar4 = this.f10271e;
                long j10 = this.f10272f;
                long j11 = this.f10273g;
                long j12 = this.f10274h;
                long j13 = this.f10275i;
                p<C4889m, Integer, C16807N> pVar5 = this.f10276j;
                C5073d.m g10 = C5073d.f18068a.g();
                C5437c.a aVar2 = C5437c.f24302a;
                p<C4889m, Integer, C16807N> pVar6 = pVar5;
                long j14 = j13;
                I a10 = C5080k.a(g10, aVar2.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, h10);
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
                d.a aVar4 = aVar;
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                mVar2.W(-1924971291);
                if (pVar2 != null) {
                    C4910x.a(E.a().d(C5747v0.k(j10)), c1.c.e(934657765, true, new C0153a(hVar, pVar2), mVar2, 54), mVar2, J0.f13770i | 48);
                }
                mVar.P();
                mVar2.W(-1924961479);
                if (pVar3 == null) {
                    pVar = pVar6;
                } else {
                    pVar = pVar6;
                    s.a(j11, j1.c(C4803e.f12831a.f(), mVar2, 6), c1.c.e(434448772, true, new C0154b(hVar, pVar2, pVar3), mVar2, 54), mVar, 384);
                }
                mVar.P();
                mVar2.W(-1924936431);
                if (pVar4 != null) {
                    s.a(j12, j1.c(C4803e.f12831a.i(), mVar2, 6), c1.c.e(-796843771, true, new c(hVar, pVar4), mVar2, 54), mVar, 384);
                }
                mVar.P();
                androidx.compose.ui.d b11 = hVar.b(aVar4, aVar2.j());
                I h11 = C5077h.h(aVar2.o(), false);
                int a14 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar2, b11);
                C17631a<C4504g> a15 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a15);
                } else {
                    mVar.t();
                }
                C4889m a16 = F1.a(mVar);
                F1.c(a16, h11, aVar3.c());
                F1.c(a16, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b12 = aVar3.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b12);
                }
                F1.c(a16, e11, aVar3.d());
                C5079j jVar = C5079j.f18125a;
                s.a(j14, j1.c(C4803e.f12831a.b(), mVar2, 6), pVar, mVar, 0);
                mVar.x();
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.b$b  reason: collision with other inner class name */
    static final class C0155b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10284c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10285d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10286e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10287f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10288g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i1 f10289h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10290i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10291j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f10292k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f10293l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f10294m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ long f10295n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f10296o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f10297p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f10298q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0155b(p<? super C4889m, ? super Integer, C16807N> pVar, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, i1 i1Var, long j10, float f10, long j11, long j12, long j13, long j14, int i10, int i11, int i12) {
            super(2);
            this.f10284c = pVar;
            this.f10285d = dVar;
            this.f10286e = pVar2;
            this.f10287f = pVar3;
            this.f10288g = pVar4;
            this.f10289h = i1Var;
            this.f10290i = j10;
            this.f10291j = f10;
            this.f10292k = j11;
            this.f10293l = j12;
            this.f10294m = j13;
            this.f10295n = j14;
            this.f10296o = i10;
            this.f10297p = i11;
            this.f10298q = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            p<C4889m, Integer, C16807N> pVar = this.f10284c;
            p<C4889m, Integer, C16807N> pVar2 = pVar;
            C4718b.a(pVar2, this.f10285d, this.f10286e, this.f10287f, this.f10288g, this.f10289h, this.f10290i, this.f10291j, this.f10292k, this.f10293l, this.f10294m, this.f10295n, mVar2, M0.a(this.f10296o | 1), M0.a(this.f10297p), this.f10298q);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b$c */
    static final class c implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f10299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f10300b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b$c$a */
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ List<List<a0>> f10301c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f10302d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f10303e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f10304f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List<Integer> f10305g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List<List<a0>> list, K k10, float f10, int i10, List<Integer> list2) {
                super(1);
                this.f10301c = list;
                this.f10302d = k10;
                this.f10303e = f10;
                this.f10304f = i10;
                this.f10305g = list2;
            }

            public final void a(a0.a aVar) {
                List<List<a0>> list = this.f10301c;
                K k10 = this.f10302d;
                float f10 = this.f10303e;
                int i10 = this.f10304f;
                List<Integer> list2 = this.f10305g;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    List list3 = list.get(i11);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    int i12 = 0;
                    while (i12 < size2) {
                        iArr[i12] = ((a0) list3.get(i12)).E0() + (i12 < C16877v.p(list3) ? k10.K0(f10) : 0);
                        i12++;
                    }
                    C5073d.e c10 = C5073d.f18068a.c();
                    int[] iArr2 = new int[size2];
                    for (int i13 = 0; i13 < size2; i13++) {
                        iArr2[i13] = 0;
                    }
                    int[] iArr3 = iArr2;
                    c10.b(k10, i10, iArr, k10.getLayoutDirection(), iArr2);
                    int size3 = list3.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        a0.a.i(aVar, (a0) list3.get(i14), iArr3[i14], list2.get(i11).intValue(), 0.0f, 4, (Object) null);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        c(float f10, float f11) {
            this.f10299a = f10;
            this.f10300b = f11;
        }

        private static final boolean b(List<a0> list, M m10, K k10, float f10, long j10, a0 a0Var) {
            return list.isEmpty() || (m10.f144346a + k10.K0(f10)) + a0Var.E0() <= C5267b.l(j10);
        }

        private static final void c(List<List<a0>> list, M m10, K k10, float f10, List<a0> list2, List<Integer> list3, M m11, List<Integer> list4, M m12, M m13) {
            if (!list.isEmpty()) {
                m10.f144346a += k10.K0(f10);
            }
            list.add(0, C16877v.t1(list2));
            list3.add(Integer.valueOf(m11.f144346a));
            list4.add(Integer.valueOf(m10.f144346a));
            m10.f144346a += m11.f144346a;
            m12.f144346a = Math.max(m12.f144346a, m13.f144346a);
            list2.clear();
            m13.f144346a = 0;
            m11.f144346a = 0;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            ArrayList arrayList;
            M m10;
            M m11;
            M m12;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            M m13 = new M();
            M m14 = new M();
            ArrayList arrayList5 = new ArrayList();
            M m15 = new M();
            M m16 = new M();
            float f10 = this.f10299a;
            float f11 = this.f10300b;
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList6 = arrayList4;
                M m17 = m13;
                a0 i02 = ((H) list.get(i10)).i0(j10);
                int i11 = i10;
                float f12 = f11;
                int i12 = size;
                float f13 = f10;
                if (!b(arrayList5, m15, k10, f10, j10, i02)) {
                    m11 = m16;
                    m10 = m15;
                    arrayList = arrayList5;
                    c(arrayList2, m14, k10, f12, arrayList5, arrayList3, m16, arrayList6, m17, m10);
                } else {
                    m11 = m16;
                    m10 = m15;
                    arrayList = arrayList5;
                }
                if (!arrayList.isEmpty()) {
                    m12 = m10;
                    m12.f144346a += k10.K0(f13);
                } else {
                    K k11 = k10;
                    m12 = m10;
                }
                a0 a0Var = i02;
                ArrayList arrayList7 = arrayList;
                arrayList7.add(a0Var);
                m12.f144346a += a0Var.E0();
                m11.f144346a = Math.max(m11.f144346a, a0Var.z0());
                i10 = i11 + 1;
                m15 = m12;
                f10 = f13;
                m16 = m11;
                arrayList4 = arrayList6;
                m13 = m17;
                size = i12;
                arrayList5 = arrayList7;
                f11 = f12;
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList4;
            M m18 = m13;
            M m19 = m16;
            M m20 = m15;
            K k12 = k10;
            if (!arrayList8.isEmpty()) {
                c(arrayList2, m14, k10, this.f10300b, arrayList8, arrayList3, m19, arrayList9, m18, m20);
            }
            int max = Math.max(m18.f144346a, C5267b.n(j10));
            return K.v0(k10, max, Math.max(m14.f144346a, C5267b.m(j10)), (Map) null, new a(arrayList2, k10, this.f10299a, max, arrayList9), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.b$d */
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f10306c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f10307d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10308e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f10309f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f10, float f11, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f10306c = f10;
            this.f10307d = f11;
            this.f10308e = pVar;
            this.f10309f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4718b.b(this.f10306c, this.f10307d, this.f10308e, mVar, M0.a(this.f10309f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b$e */
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10311d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10312e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i1 f10313f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f10314g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f10315h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10316i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ long f10317j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f10318k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10319l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10320m;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b$e$a */
        static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10321c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f10322d;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: O0.b$e$a$a  reason: collision with other inner class name */
            static final class C0156a extends C17544u implements p<C4889m, Integer, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f10323c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f10324d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0156a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
                    super(2);
                    this.f10323c = pVar;
                    this.f10324d = pVar2;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(1887135077, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                        }
                        p<C4889m, Integer, C16807N> pVar = this.f10323c;
                        mVar.W(1497073862);
                        if (pVar != null) {
                            pVar.invoke(mVar, 0);
                            C16807N n10 = C16807N.f139792a;
                        }
                        mVar.P();
                        this.f10324d.invoke(mVar, 0);
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
            a(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
                super(2);
                this.f10321c = pVar;
                this.f10322d = pVar2;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1163543932, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                    }
                    C4718b.b(C4718b.f10263c, C4718b.f10264d, c1.c.e(1887135077, true, new C0156a(this.f10321c, this.f10322d), mVar, 54), mVar, 438);
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
        e(p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, i1 i1Var, long j10, float f10, long j11, long j12, long j13, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5) {
            super(2);
            this.f10310c = pVar;
            this.f10311d = pVar2;
            this.f10312e = pVar3;
            this.f10313f = i1Var;
            this.f10314g = j10;
            this.f10315h = f10;
            this.f10316i = j11;
            this.f10317j = j12;
            this.f10318k = j13;
            this.f10319l = pVar4;
            this.f10320m = pVar5;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1852840226, i11, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
                }
                C4718b.a(c1.c.e(1163543932, true, new a(this.f10319l, this.f10320m), mVar2, 54), (androidx.compose.ui.d) null, this.f10310c, this.f10311d, this.f10312e, this.f10313f, this.f10314g, this.f10315h, C4755u.i(C4803e.f12831a.a(), mVar2, 6), this.f10316i, this.f10317j, this.f10318k, mVar, 6, 0, 2);
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
    /* renamed from: O0.b$f */
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10325c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10326d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10327e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10328f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10329g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10330h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10331i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i1 f10332j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f10333k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f10334l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f10335m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ long f10336n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ float f10337o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.h f10338p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f10339q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f10340r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, i1 i1Var, long j10, long j11, long j12, long j13, float f10, androidx.compose.ui.window.h hVar, int i10, int i11) {
            super(2);
            this.f10325c = aVar;
            this.f10326d = pVar;
            this.f10327e = dVar;
            this.f10328f = pVar2;
            this.f10329g = pVar3;
            this.f10330h = pVar4;
            this.f10331i = pVar5;
            this.f10332j = i1Var;
            this.f10333k = j10;
            this.f10334l = j11;
            this.f10335m = j12;
            this.f10336n = j13;
            this.f10337o = f10;
            this.f10338p = hVar;
            this.f10339q = i10;
            this.f10340r = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C17631a<C16807N> aVar = this.f10325c;
            C17631a<C16807N> aVar2 = aVar;
            C4718b.c(aVar2, this.f10326d, this.f10327e, this.f10328f, this.f10329g, this.f10330h, this.f10331i, this.f10332j, this.f10333k, this.f10334l, this.f10335m, this.f10336n, this.f10337o, this.f10338p, mVar2, M0.a(this.f10339q | 1), M0.a(this.f10340r));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.b$g */
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10341c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10342d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.b$g$a */
        static final class a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f10343c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f10343c = str;
            }

            public final void a(x xVar) {
                v.j0(xVar, this.f10343c);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f10341c = dVar;
            this.f10342d = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(905289008, i10, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
                }
                t.a aVar = t.f12046a;
                String a10 = u.a(t.a(C4749q0.f11448f), mVar, 0);
                androidx.compose.ui.d x10 = androidx.compose.foundation.layout.J.x(this.f10341c, C4718b.l(), 0.0f, C4718b.k(), 0.0f, 10, (Object) null);
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                boolean V10 = mVar.V(a10);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(a10);
                    mVar.u(D10);
                }
                androidx.compose.ui.d s10 = x10.s(o.d(aVar2, false, (C17642l) D10, 1, (Object) null));
                p<C4889m, Integer, C16807N> pVar = this.f10342d;
                I h10 = C5077h.h(C5437c.f24302a.o(), true);
                int a11 = C4883j.a(mVar, 0);
                C4912y s11 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, s10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, h10, aVar3.c());
                F1.c(a13, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar3.d());
                C5079j jVar = C5079j.f18125a;
                pVar.invoke(mVar, 0);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.b$h */
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10344c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10345d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.h f10346e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10347f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f10348g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f10349h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C17631a<C16807N> aVar, androidx.compose.ui.d dVar, androidx.compose.ui.window.h hVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f10344c = aVar;
            this.f10345d = dVar;
            this.f10346e = hVar;
            this.f10347f = pVar;
            this.f10348g = i10;
            this.f10349h = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C4718b.d(this.f10344c, this.f10345d, this.f10346e, this.f10347f, mVar, M0.a(this.f10348g | 1), this.f10349h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    static {
        float f10 = (float) 24;
        f10265e = D.a(c2.h.B(f10));
        float f11 = (float) 16;
        f10266f = D.e(0.0f, 0.0f, 0.0f, c2.h.B(f11), 7, (Object) null);
        f10267g = D.e(0.0f, 0.0f, 0.0f, c2.h.B(f11), 7, (Object) null);
        f10268h = D.e(0.0f, 0.0f, 0.0f, c2.h.B(f10), 7, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, androidx.compose.ui.d r34, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r35, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r36, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r37, p1.i1 r38, long r39, float r41, long r42, long r44, long r46, long r48, U0.C4889m r50, int r51, int r52, int r53) {
        /*
            r14 = r51
            r15 = r53
            r0 = 1522575799(0x5ac0a9b7, float:2.71148995E16)
            r1 = r50
            U0.m r13 = r1.k(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r14 | 6
            r12 = r33
            goto L_0x0028
        L_0x0016:
            r1 = r14 & 6
            r12 = r33
            if (r1 != 0) goto L_0x0027
            boolean r1 = r13.F(r12)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r4 = r15 & 2
            r6 = 32
            if (r4 == 0) goto L_0x0033
            r1 = r1 | 48
        L_0x0030:
            r7 = r34
            goto L_0x0044
        L_0x0033:
            r7 = r14 & 48
            if (r7 != 0) goto L_0x0030
            r7 = r34
            boolean r8 = r13.V(r7)
            if (r8 == 0) goto L_0x0041
            r8 = r6
            goto L_0x0043
        L_0x0041:
            r8 = 16
        L_0x0043:
            r1 = r1 | r8
        L_0x0044:
            r8 = r15 & 4
            if (r8 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            r11 = r35
            goto L_0x005f
        L_0x004d:
            r8 = r14 & 384(0x180, float:5.38E-43)
            r11 = r35
            if (r8 != 0) goto L_0x005f
            boolean r8 = r13.F(r11)
            if (r8 == 0) goto L_0x005c
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r8
        L_0x005f:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r10 = r36
            goto L_0x007a
        L_0x0068:
            r8 = r14 & 3072(0xc00, float:4.305E-42)
            r10 = r36
            if (r8 != 0) goto L_0x007a
            boolean r8 = r13.F(r10)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r8
        L_0x007a:
            r8 = r15 & 16
            if (r8 == 0) goto L_0x0083
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r9 = r37
            goto L_0x0095
        L_0x0083:
            r8 = r14 & 24576(0x6000, float:3.4438E-41)
            r9 = r37
            if (r8 != 0) goto L_0x0095
            boolean r8 = r13.F(r9)
            if (r8 == 0) goto L_0x0092
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r1 = r1 | r8
        L_0x0095:
            r8 = r15 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x00a0
            r1 = r1 | r16
        L_0x009d:
            r8 = r38
            goto L_0x00b3
        L_0x00a0:
            r8 = r14 & r16
            if (r8 != 0) goto L_0x009d
            r8 = r38
            boolean r16 = r13.V(r8)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r1 = r1 | r16
        L_0x00b3:
            r16 = r15 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00be
            r1 = r1 | r17
            r9 = r39
            goto L_0x00d1
        L_0x00be:
            r16 = r14 & r17
            r9 = r39
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r13.e(r9)
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r1 = r1 | r16
        L_0x00d1:
            r2 = r15 & 128(0x80, float:1.794E-43)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00dc
            r1 = r1 | r29
        L_0x00d9:
            r2 = r41
            goto L_0x00ef
        L_0x00dc:
            r2 = r14 & r29
            if (r2 != 0) goto L_0x00d9
            r2 = r41
            boolean r16 = r13.c(r2)
            if (r16 == 0) goto L_0x00eb
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r1 = r1 | r16
        L_0x00ef:
            r3 = r15 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x00fa
            r1 = r1 | r17
            r9 = r42
            goto L_0x010c
        L_0x00fa:
            r3 = r14 & r17
            r9 = r42
            if (r3 != 0) goto L_0x010c
            boolean r3 = r13.e(r9)
            if (r3 == 0) goto L_0x0109
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r1 = r1 | r3
        L_0x010c:
            r3 = r15 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r3 == 0) goto L_0x0117
            r1 = r1 | r17
            r9 = r44
            goto L_0x0129
        L_0x0117:
            r3 = r14 & r17
            r9 = r44
            if (r3 != 0) goto L_0x0129
            boolean r3 = r13.e(r9)
            if (r3 == 0) goto L_0x0126
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r1 = r1 | r3
        L_0x0129:
            r3 = r15 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0132
            r3 = r52 | 6
            r9 = r46
            goto L_0x0148
        L_0x0132:
            r3 = r52 & 6
            r9 = r46
            if (r3 != 0) goto L_0x0146
            boolean r3 = r13.e(r9)
            if (r3 == 0) goto L_0x0141
            r16 = 4
            goto L_0x0143
        L_0x0141:
            r16 = 2
        L_0x0143:
            r3 = r52 | r16
            goto L_0x0148
        L_0x0146:
            r3 = r52
        L_0x0148:
            r5 = r15 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0151
            r3 = r3 | 48
            r9 = r48
            goto L_0x0162
        L_0x0151:
            r5 = r52 & 48
            r9 = r48
            if (r5 != 0) goto L_0x0162
            boolean r5 = r13.e(r9)
            if (r5 == 0) goto L_0x015f
            r5 = r6
            goto L_0x0161
        L_0x015f:
            r5 = 16
        L_0x0161:
            r3 = r3 | r5
        L_0x0162:
            r5 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r5 & r1
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x017f
            r5 = r3 & 19
            r6 = 18
            if (r5 != r6) goto L_0x017f
            boolean r5 = r13.l()
            if (r5 != 0) goto L_0x0178
            goto L_0x017f
        L_0x0178:
            r13.L()
            r2 = r7
            r0 = r13
            goto L_0x01f3
        L_0x017f:
            if (r4 == 0) goto L_0x0186
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r30 = r4
            goto L_0x0188
        L_0x0186:
            r30 = r7
        L_0x0188:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0193
            java.lang.String r4 = "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:293)"
            U0.C4895p.S(r0, r1, r3, r4)
        L_0x0193:
            O0.b$a r0 = new O0.b$a
            r16 = r0
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r44
            r22 = r46
            r24 = r48
            r26 = r42
            r28 = r33
            r16.<init>(r17, r18, r19, r20, r22, r24, r26, r28)
            r3 = 54
            r4 = -2126308228(0xffffffff81431c7c, float:-3.583628E-38)
            r5 = 1
            c1.a r0 = c1.c.e(r4, r5, r0, r13, r3)
            int r3 = r1 >> 3
            r3 = r3 & 14
            r3 = r3 | r29
            int r4 = r1 >> 12
            r5 = r4 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            r4 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r1 = r1 >> 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r4
            r16 = r3 | r1
            r17 = 104(0x68, float:1.46E-43)
            r5 = 0
            r18 = 0
            r19 = 0
            r1 = r30
            r2 = r38
            r3 = r39
            r7 = r41
            r8 = r18
            r9 = r19
            r10 = r0
            r11 = r13
            r12 = r16
            r0 = r13
            r13 = r17
            O0.P0.a(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01f1
            U0.C4895p.R()
        L_0x01f1:
            r2 = r30
        L_0x01f3:
            U0.Y0 r12 = r0.n()
            if (r12 == 0) goto L_0x0226
            O0.b$b r13 = new O0.b$b
            r0 = r13
            r1 = r33
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r9 = r41
            r10 = r42
            r31 = r12
            r32 = r13
            r12 = r44
            r14 = r46
            r16 = r48
            r18 = r51
            r19 = r52
            r20 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r12, r14, r16, r18, r19, r20)
            r0 = r31
            r1 = r32
            r0.a(r1)
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4718b.a(nI.p, androidx.compose.ui.d, nI.p, nI.p, nI.p, p1.i1, long, float, long, long, long, long, U0.m, int, int, int):void");
    }

    public static final void b(float f10, float f11, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(586821353);
        if ((i10 & 6) == 0) {
            i11 = (k10.c(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.c(f11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(pVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(586821353, i11, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z10 = true;
            boolean z11 = (i11 & 14) == 4;
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new c(f10, f11);
                k10.u(D10);
            }
            I i12 = (I) D10;
            d.a aVar = androidx.compose.ui.d.f18749a;
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            int i13 = ((((i11 >> 6) & 14) << 6) & 896) | 6;
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
            F1.c(a12, i12, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            pVar.invoke(k10, Integer.valueOf((i13 >> 6) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(f10, f11, pVar, i10));
        }
    }

    public static final void c(C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, p<? super C4889m, ? super Integer, C16807N> pVar4, p<? super C4889m, ? super Integer, C16807N> pVar5, i1 i1Var, long j10, long j11, long j12, long j13, float f10, androidx.compose.ui.window.h hVar, C4889m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14 = i10;
        int i15 = i11;
        C4889m k10 = mVar.k(-919826268);
        C17631a<C16807N> aVar2 = aVar;
        if ((i14 & 6) == 0) {
            i12 = (k10.F(aVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        int i16 = 16;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar;
        if ((i14 & 48) == 0) {
            i12 |= k10.F(pVar6) ? 32 : 16;
        }
        androidx.compose.ui.d dVar2 = dVar;
        if ((i14 & 384) == 0) {
            i12 |= k10.V(dVar2) ? 256 : 128;
        }
        int i17 = i14 & 3072;
        int i18 = RecyclerView.n.FLAG_MOVED;
        if (i17 == 0) {
            i12 |= k10.F(pVar2) ? 2048 : 1024;
        } else {
            p<? super C4889m, ? super Integer, C16807N> pVar7 = pVar2;
        }
        if ((i14 & 24576) == 0) {
            i12 |= k10.F(pVar3) ? 16384 : 8192;
        } else {
            p<? super C4889m, ? super Integer, C16807N> pVar8 = pVar3;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar9 = pVar4;
        if ((i14 & ImageMetadata.EDGE_MODE) == 0) {
            i12 |= k10.F(pVar9) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        p<? super C4889m, ? super Integer, C16807N> pVar10 = pVar5;
        if ((i14 & 1572864) == 0) {
            i12 |= k10.F(pVar10) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        i1 i1Var2 = i1Var;
        if ((i14 & 12582912) == 0) {
            i12 |= k10.V(i1Var2) ? 8388608 : 4194304;
        }
        int i19 = i12;
        long j14 = j10;
        if ((i14 & 100663296) == 0) {
            i19 |= k10.e(j14) ? 67108864 : 33554432;
        }
        long j15 = j11;
        if ((i14 & 805306368) == 0) {
            i19 |= k10.e(j15) ? 536870912 : 268435456;
        }
        int i20 = i19;
        long j16 = j12;
        if ((i15 & 6) == 0) {
            i13 = i15 | (k10.e(j16) ? 4 : 2);
        } else {
            i13 = i15;
        }
        long j17 = j13;
        if ((i15 & 48) == 0) {
            if (k10.e(j17)) {
                i16 = 32;
            }
            i13 |= i16;
        }
        float f11 = f10;
        if ((i15 & 384) == 0) {
            i13 |= k10.c(f11) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            if (!k10.V(hVar)) {
                i18 = 1024;
            }
            i13 |= i18;
        } else {
            androidx.compose.ui.window.h hVar2 = hVar;
        }
        int i21 = i13;
        if ((306783379 & i20) == 306783378 && (i21 & 1171) == 1170 && k10.l()) {
            k10.L();
        } else {
            if (C4895p.J()) {
                C4895p.S(-919826268, i20, i21, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            d(aVar, dVar, hVar, c1.c.e(-1852840226, true, new e(pVar3, pVar4, pVar5, i1Var, j10, f10, j11, j12, j13, pVar2, pVar), k10, 54), k10, ((i21 >> 3) & 896) | (i20 & 14) | 3072 | ((i20 >> 3) & 112), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            f fVar = r0;
            f fVar2 = new f(aVar, pVar, dVar, pVar2, pVar3, pVar4, pVar5, i1Var, j10, j11, j12, j13, f10, hVar, i10, i11);
            n10.a(fVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(nI.C17631a<XH.C16807N> r19, androidx.compose.ui.d r20, androidx.compose.ui.window.h r21, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r4 = r22
            r5 = r24
            r0 = -1922902937(0xffffffff8d62d467, float:-6.9897297E-31)
            r1 = r23
            U0.m r1 = r1.k(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r5 | 6
            r3 = r2
            r2 = r19
            goto L_0x002b
        L_0x0017:
            r2 = r5 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r19
            boolean r3 = r1.F(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r5
            goto L_0x002b
        L_0x0028:
            r2 = r19
            r3 = r5
        L_0x002b:
            r6 = r25 & 2
            if (r6 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r7 = r20
            goto L_0x0046
        L_0x0034:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0031
            r7 = r20
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r3 = r3 | r8
        L_0x0046:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r21
            goto L_0x0061
        L_0x004f:
            r9 = r5 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004c
            r9 = r21
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r10
        L_0x0061:
            r10 = r25 & 8
            if (r10 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0068:
            r10 = r5 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0078
            boolean r10 = r1.F(r4)
            if (r10 == 0) goto L_0x0075
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r3 = r3 | r10
        L_0x0078:
            r10 = r3 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r10 != r11) goto L_0x008b
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            r1.L()
            r12 = r7
            r3 = r9
            goto L_0x00db
        L_0x008b:
            if (r6 == 0) goto L_0x0091
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r12 = r6
            goto L_0x0092
        L_0x0091:
            r12 = r7
        L_0x0092:
            if (r8 == 0) goto L_0x00a3
            androidx.compose.ui.window.h r6 = new androidx.compose.ui.window.h
            r17 = 7
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r6
            r13.<init>((boolean) r14, (boolean) r15, (boolean) r16, (int) r17, (kotlin.jvm.internal.DefaultConstructorMarker) r18)
            goto L_0x00a4
        L_0x00a3:
            r13 = r9
        L_0x00a4:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00b0
            r6 = -1
            java.lang.String r7 = "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:145)"
            U0.C4895p.S(r0, r3, r6, r7)
        L_0x00b0:
            O0.b$g r0 = new O0.b$g
            r0.<init>(r12, r4)
            r6 = 54
            r7 = 905289008(0x35f59d30, float:1.829967E-6)
            r8 = 1
            c1.a r8 = c1.c.e(r7, r8, r0, r1, r6)
            r0 = r3 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            int r3 = r3 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r10 = r0 | r3
            r11 = 0
            r6 = r19
            r7 = r13
            r9 = r1
            androidx.compose.ui.window.a.a(r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00da
            U0.C4895p.R()
        L_0x00da:
            r3 = r13
        L_0x00db:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x00f3
            O0.b$h r8 = new O0.b$h
            r0 = r8
            r1 = r19
            r2 = r12
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4718b.d(nI.a, androidx.compose.ui.d, androidx.compose.ui.window.h, nI.p, U0.m, int, int):void");
    }

    public static final float k() {
        return f10262b;
    }

    public static final float l() {
        return f10261a;
    }
}
