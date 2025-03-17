package FF;

import E1.C4478k;
import E1.I;
import FF.C12888e;
import G1.C4504g;
import HJ.C15854t;
import I0.C4558g;
import I0.C4562i;
import I0.C4564j;
import I0.b1;
import J1.j;
import JF.C13085G;
import N1.C4669d;
import N1.E;
import N1.P;
import N1.Y;
import OE.C13316h;
import OE.C13320l;
import OE.n;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U1.e;
import U5.e;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import Y1.h;
import Y1.k;
import Y1.o;
import Y1.s;
import Y1.t;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.w;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.common.R;
import com.sugarcube.core.network.models.RoomType;
import i1.C5437c;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import k6.C8441h;
import kF.C14725u;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5749w0;
import p1.g1;
import r0.m;
import r1.g;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import t1.C5942c;
import tF.C15084i;
import tF.C15091p;
import tK.C18030v;
import uK.C18148c;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u0010\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0014\u001a=\u0010\u001c\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010 \u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001f\u001a\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0007¢\u0006\u0004\b#\u0010$\u001a5\u0010)\u001a\u00020\u00072\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%2\u0014\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00070\rH\u0007¢\u0006\u0004\b)\u0010*\u001a'\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101\u001a\u001d\u00102\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b2\u0010\u0014\u001a+\u00105\u001a\u00020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0007¢\u0006\u0004\b5\u00106\" \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"LFF/e$j;", "room", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "Lcom/sugarcube/app/base/ui/gallery/showrooms/GalleryCallbacks;", "callbacks", "Ljava/util/Locale;", "locale", "LXH/N;", "S", "(LFF/e$j;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Ljava/util/Locale;LU0/m;I)V", "LU0/r0;", "LFF/d;", "expandCollapse", "Lkotlin/Function1;", "", "onClick", "x", "(LU0/r0;LnI/l;LU0/m;I)V", "Lkotlin/Function0;", "J", "(LnI/a;LU0/m;I)V", "H", "", "bgDrawable", "iconId", "", "secondaryText", "primaryText", "L", "(LnI/a;IILjava/lang/String;Ljava/lang/String;LU0/m;I)V", "v", "(LU0/m;I)V", "A", "headerText", "bodyText", "C", "(Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "", "Lcom/sugarcube/core/network/models/RoomType;", "items", "onRoomTypeSelected", "V", "(Ljava/util/List;LnI/l;LU0/m;I)V", "unstyledString", "partToStyle", "LN1/G;", "spanStyle", "LN1/d;", "b0", "(Ljava/lang/String;Ljava/lang/String;LN1/G;)LN1/d;", "E", "onClickSignup", "onClickLogin", "O", "(LnI/a;LnI/a;LU0/m;I)V", "a", "LnI/l;", "previewOnClickBoolean", "b", "LnI/a;", "previewOnClick", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: FF.E  reason: case insensitive filesystem */
public final class C12882E {

    /* renamed from: a  reason: collision with root package name */
    private static final C17642l<Boolean, C16807N> f109770a = new C12903u();

    /* renamed from: b  reason: collision with root package name */
    private static final C17631a<C16807N> f109771b = new C12905w();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.E$a */
    static final class a implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<C12887d> f109772a;

        a(C4899r0<C12887d> r0Var) {
            this.f109772a = r0Var;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(m10, "$this$OutlinedButton");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1108432405, i11, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ExpandCollapse.<anonymous>.<anonymous> (ShowroomsGalleryComposables.kt:292)");
                }
                String b10 = j.b(this.f109772a.getValue().c() ? n.f113244M4 : n.f113250N4, mVar2, 0);
                Y y10 = r21;
                Y y11 = new Y(J1.b.a(R.color.primary_text_color, mVar2, 0), w.i(14), C.f13316b.a(), (C4830x) null, (C4831y) null, C14725u.f128855a.a(), (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (Y1.q) null, (E) null, (h) null, 0, 0, (s) null, 16777176, (DefaultConstructorMarker) null);
                b1.b(b10, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, y10, mVar, 0, 0, 65534);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FF.E$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f109773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C12888e.j f109774b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Locale f109775c;

        b(Context context, C12888e.j jVar, Locale locale) {
            this.f109773a = context;
            this.f109774b = jVar;
            this.f109775c = locale;
        }

        public final void a(C4889m mVar, int i10) {
            C18030v vVar;
            int i11;
            String str;
            C4889m mVar2 = mVar;
            int i12 = i10;
            if ((i12 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-700757903, i12, -1, "com.sugarcube.app.base.ui.gallery.showrooms.RoomCard.<anonymous> (ShowroomsGalleryComposables.kt:108)");
                }
                Context context = this.f109773a;
                C12888e.j jVar = this.f109774b;
                Locale locale = this.f109775c;
                d.a aVar = d.f18749a;
                C5073d dVar = C5073d.f18068a;
                C5073d.m g10 = dVar.g();
                C5437c.a aVar2 = C5437c.f24302a;
                I a10 = C5080k.a(g10, aVar2.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, aVar);
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
                d h10 = J.h(aVar, 0.0f, 1, (Object) null);
                Locale locale2 = locale;
                C12888e.j jVar2 = jVar;
                U5.s.b(new C8441h.a(context).e(jVar.g()).c(), j.b(n.f113184C4, mVar2, 0), h10, J1.e.c(R.drawable.sc_room_thumb_placeholder, mVar2, 0), J1.e.c(R.drawable.sc_room_thumb_placeholder, mVar2, 0), (C5942c) null, (C17642l<? super e.c.C0658c, C16807N>) null, (C17642l<? super e.c.d, C16807N>) null, (C17642l<? super e.c.b, C16807N>) null, (C5437c) null, C4478k.f5915a.d(), 0.0f, (C5749w0) null, 0, false, mVar, 384, 6, 31712);
                d.a aVar4 = aVar;
                d j10 = D.j(aVar4, c2.h.B((float) 20), c2.h.B((float) 16));
                C4889m mVar3 = mVar;
                I a14 = C5080k.a(dVar.g(), aVar2.k(), mVar3, 0);
                int a15 = C4883j.a(mVar3, 0);
                C4912y s11 = mVar.s();
                d e11 = c.e(mVar3, j10);
                C17631a<C4504g> a16 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar3.p(a16);
                } else {
                    mVar.t();
                }
                C4889m a17 = F1.a(mVar);
                F1.c(a17, a14, aVar3.c());
                F1.c(a17, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.w(Integer.valueOf(a15), b11);
                }
                F1.c(a17, e11, aVar3.d());
                I b12 = G.b(dVar.f(), aVar2.l(), mVar3, 0);
                int a18 = C4883j.a(mVar3, 0);
                C4912y s12 = mVar.s();
                d e12 = c.e(mVar3, aVar4);
                C17631a<C4504g> a19 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar3.p(a19);
                } else {
                    mVar.t();
                }
                C4889m a20 = F1.a(mVar);
                F1.c(a20, b12, aVar3.c());
                F1.c(a20, s12, aVar3.e());
                p<C4504g, Integer, C16807N> b13 = aVar3.b();
                if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                    a20.u(Integer.valueOf(a18));
                    a20.w(Integer.valueOf(a18), b13);
                }
                F1.c(a20, e12, aVar3.d());
                C5843N n10 = C5843N.f28726a;
                Uri k10 = jVar2.k();
                mVar3.W(-301061911);
                if (k10 != null) {
                    iF.I.b(k10, (d) null, mVar3, 0, 2);
                    C5844O.a(J.y(aVar4, c2.h.B((float) 12)), mVar3, 6);
                    C16807N n11 = C16807N.f139792a;
                }
                mVar.P();
                I a21 = C5080k.a(dVar.g(), aVar2.k(), mVar3, 0);
                int a22 = C4883j.a(mVar3, 0);
                C4912y s13 = mVar.s();
                d e13 = c.e(mVar3, aVar4);
                C17631a<C4504g> a23 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar3.p(a23);
                } else {
                    mVar.t();
                }
                C4889m a24 = F1.a(mVar);
                F1.c(a24, a21, aVar3.c());
                F1.c(a24, s13, aVar3.e());
                p<C4504g, Integer, C16807N> b14 = aVar3.b();
                if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                    a24.u(Integer.valueOf(a22));
                    a24.w(Integer.valueOf(a22), b14);
                }
                F1.c(a24, e13, aVar3.d());
                String j11 = jVar2.j();
                C18030v vVar2 = C18030v.f147664a;
                int i13 = C18030v.f147665b;
                int i14 = i13;
                C18030v vVar3 = vVar2;
                d.a aVar5 = aVar4;
                b1.b(j11, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, t.f14827a.b(), false, 0, 0, (C17642l<? super P, C16807N>) null, vVar2.b(mVar3, i13).c().c(), mVar, 0, 48, 63486);
                C15091p l10 = jVar2.l();
                C4889m mVar4 = mVar;
                mVar4.W(1806539025);
                if (l10 == null) {
                    i11 = i14;
                    vVar = vVar3;
                } else {
                    int i15 = i14;
                    C18030v vVar4 = vVar3;
                    i11 = i15;
                    vVar = vVar4;
                    b1.b(C15084i.a(l10, mVar4, 0), (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar4.b(mVar4, i15).a().c(), mVar, 0, 0, 65534);
                    C16807N n12 = C16807N.f139792a;
                }
                mVar.P();
                mVar.x();
                mVar.x();
                C4889m mVar5 = mVar;
                mVar5.W(-2138593257);
                if (jVar2.f() > 0) {
                    d.a aVar6 = aVar5;
                    C5844O.a(J.i(aVar6, c2.h.B(jVar2.k() == null ? (float) 4 : (float) 12)), mVar5, 0);
                    I b15 = G.b(dVar.f(), aVar2.i(), mVar5, 48);
                    int a25 = C4883j.a(mVar5, 0);
                    C4912y s14 = mVar.s();
                    d e14 = c.e(mVar5, aVar6);
                    C17631a<C4504g> a26 = aVar3.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar5.p(a26);
                    } else {
                        mVar.t();
                    }
                    C4889m a27 = F1.a(mVar);
                    F1.c(a27, b15, aVar3.c());
                    F1.c(a27, s14, aVar3.e());
                    p<C4504g, Integer, C16807N> b16 = aVar3.b();
                    if (a27.i() || !C17542s.e(a27.D(), Integer.valueOf(a25))) {
                        a27.u(Integer.valueOf(a25));
                        a27.w(Integer.valueOf(a25), b16);
                    }
                    F1.c(a27, e14, aVar3.d());
                    int i16 = i11;
                    C18030v vVar5 = vVar;
                    I0.Y.a(J1.e.c(C18148c.Calendar.m(), mVar5, 0), (String) null, (d) null, vVar5.a(mVar5, i16).G0(), mVar, 48, 4);
                    C5844O.a(J.y(aVar6, c2.h.B((float) 4)), mVar5, 6);
                    Instant i17 = jVar2.i();
                    if (i17 == null || (str = C13085G.a(i17, locale2)) == null) {
                        str = "";
                    }
                    C18030v vVar6 = vVar5;
                    d.a aVar7 = aVar6;
                    C4889m mVar6 = mVar;
                    b1.b(str, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar5.b(mVar5, i16).a().c(), mVar6, 0, 0, 65534);
                    C4889m mVar7 = mVar;
                    C5844O.a(C5842M.e(n10, aVar7, 1.0f, false, 2, (Object) null), mVar7, 0);
                    int i18 = i16;
                    C18030v vVar7 = vVar6;
                    b1.b(j.a(C13320l.f113162b, jVar2.f(), new Object[]{Integer.valueOf(jVar2.f())}, mVar7, 0), (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar7.b(mVar7, i18).a().c(), mVar6, 0, 0, 65534);
                    C4889m mVar8 = mVar;
                    float f10 = (float) 24;
                    I0.Y.a(J1.e.c(C18148c.ChevronRight.m(), mVar8, 0), (String) null, J.i(J.y(aVar7, c2.h.B(f10)), c2.h.B(f10)), vVar7.a(mVar8, i18).G0(), mVar, 432, 0);
                    mVar.x();
                } else {
                    C4889m mVar9 = mVar5;
                }
                mVar.P();
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

    public static final void A(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(36539362);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(36539362, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.FurnishedSpacesHeader (ShowroomsGalleryComposables.kt:426)");
            }
            C(j.b(n.f113447r4, k10, 0), j.b(n.f113440q4, k10, 0), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new z(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B(int i10, C4889m mVar, int i11) {
        A(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void C(String str, String str2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3 = str;
        String str4 = str2;
        C17542s.j(str3, "headerText");
        C17542s.j(str4, "bodyText");
        C4889m k10 = mVar.k(1061779853);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str3) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1061779853, i12, -1, "com.sugarcube.app.base.ui.gallery.showrooms.Header (ShowroomsGalleryComposables.kt:437)");
            }
            d.a aVar = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
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
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            C4889m mVar3 = k10;
            b1.b(str, (d) null, J1.b.a(R.color.primary_text_darker_color, k10, 0), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(k10, i13).c().b(), mVar3, i12 & 14, 0, 65530);
            C4889m mVar4 = mVar3;
            C5844O.a(J.i(aVar, c2.h.B((float) 12)), mVar4, 6);
            mVar2 = mVar4;
            b1.b(str2, (d) null, J1.b.a(R.color.primary_text_darker_color, mVar4, 0), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(mVar4, i13).a().b(), mVar2, (i12 >> 3) & 14, 0, 65530);
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
            n10.a(new C12901s(str, str2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N D(String str, String str2, int i10, C4889m mVar, int i11) {
        C(str, str2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(nI.C17631a<XH.C16807N> r41, U0.C4889m r42, int r43) {
        /*
            r0 = r41
            r1 = r43
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = 1885595133(0x7063e5fd, float:2.8212454E29)
            r3 = r42
            U0.m r15 = r3.k(r2)
            r3 = r1 & 6
            r4 = 2
            r14 = 4
            if (r3 != 0) goto L_0x0024
            boolean r3 = r15.F(r0)
            if (r3 == 0) goto L_0x0020
            r3 = r14
            goto L_0x0021
        L_0x0020:
            r3 = r4
        L_0x0021:
            r3 = r3 | r1
            r12 = r3
            goto L_0x0025
        L_0x0024:
            r12 = r1
        L_0x0025:
            r3 = r12 & 3
            if (r3 != r4) goto L_0x0037
            boolean r3 = r15.l()
            if (r3 != 0) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            r15.L()
            r29 = r15
            goto L_0x01e3
        L_0x0037:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0043
            r3 = -1
            java.lang.String r4 = "com.sugarcube.app.base.ui.gallery.showrooms.HelpCard (ShowroomsGalleryComposables.kt:544)"
            U0.C4895p.S(r2, r12, r3, r4)
        L_0x0043:
            int r2 = OE.n.f113322Z4
            int r3 = OE.n.f113454s4
            r13 = 0
            java.lang.String r3 = J1.j.b(r3, r15, r13)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = J1.j.c(r2, r3, r15, r13)
            int r3 = OE.n.f113454s4
            java.lang.String r3 = J1.j.b(r3, r15, r13)
            N1.G r4 = new N1.G
            r16 = r4
            int r5 = com.sugarcube.common.R.color.ikea_blue
            long r17 = J1.b.a(r5, r15, r13)
            S1.C$a r5 = S1.C.f13316b
            S1.C r21 = r5.a()
            Y1.k$a r5 = Y1.k.f14792b
            Y1.k r33 = r5.d()
            r37 = 61434(0xeffa, float:8.6087E-41)
            r38 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r16.<init>(r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38)
            N1.d r2 = b0(r2, r3, r4)
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r15, r13)
            int r4 = U0.C4883j.a(r15, r13)
            U0.y r5 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r11)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x00c3
            U0.C4883j.c()
        L_0x00c3:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x00d0
            r15.p(r8)
            goto L_0x00d3
        L_0x00d0:
            r15.t()
        L_0x00d3:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r3, r9)
            nI.p r3 = r7.e()
            U0.F1.c(r8, r5, r3)
            nI.p r3 = r7.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x00fd
            java.lang.Object r5 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x010b
        L_0x00fd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.w(r4, r3)
        L_0x010b:
            nI.p r3 = r7.d()
            U0.F1.c(r8, r6, r3)
            s0.h r3 = s0.C5862h.f28810a
            int r3 = com.sugarcube.common.R.color.ikea_blue
            long r5 = J1.b.a(r3, r15, r13)
            tK.v r10 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.w r3 = r10.b(r15, r9)
            tK.c r3 = r3.a()
            N1.Y r23 = r3.c()
            r26 = 0
            r27 = 65530(0xfffa, float:9.1827E-41)
            java.lang.String r3 = "Need help?"
            r4 = 0
            r7 = 0
            r16 = 0
            r39 = r9
            r9 = r16
            r40 = r10
            r10 = r16
            r28 = r11
            r11 = r16
            r16 = 0
            r29 = r12
            r12 = r16
            r16 = 0
            r14 = r16
            r42 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 6
            r24 = r42
            I0.b1.b(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = -206017875(0xfffffffff3b86aad, float:-2.9221993E31)
            r15 = r42
            r15.W(r3)
            r3 = r29 & 14
            r4 = 4
            if (r3 != r4) goto L_0x0172
            r13 = 1
            goto L_0x0173
        L_0x0172:
            r13 = 0
        L_0x0173:
            java.lang.Object r3 = r15.D()
            if (r13 != 0) goto L_0x0181
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x0189
        L_0x0181:
            FF.C r3 = new FF.C
            r3.<init>(r0)
            r15.u(r3)
        L_0x0189:
            r7 = r3
            nI.a r7 = (nI.C17631a) r7
            r15.P()
            r8 = 7
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r3 = r28
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r3, r4, r5, r6, r7, r8, r9)
            int r3 = com.sugarcube.common.R.color.primary_text_color
            r5 = 0
            long r5 = J1.b.a(r3, r15, r5)
            r7 = r39
            r3 = r40
            tK.w r3 = r3.b(r15, r7)
            tK.c r3 = r3.a()
            N1.Y r24 = r3.b()
            r27 = 0
            r28 = 131064(0x1fff8, float:1.8366E-40)
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r3 = 0
            r29 = r15
            r15 = r3
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r3 = r2
            r25 = r29
            I0.b1.c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r29.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01e3
            U0.C4895p.R()
        L_0x01e3:
            U0.Y0 r2 = r29.n()
            if (r2 == 0) goto L_0x01f1
            FF.D r3 = new FF.D
            r3.<init>(r0, r1)
            r2.a(r3)
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: FF.C12882E.E(nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C17631a aVar, int i10, C4889m mVar, int i11) {
        E(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void H(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onClick");
        C4889m k10 = mVar.k(-1568856129);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1568856129, i11, -1, "com.sugarcube.app.base.ui.gallery.showrooms.JumpToBlank (ShowroomsGalleryComposables.kt:332)");
            }
            int i12 = i11 & 14;
            L(aVar, C13316h.f112819A, C18148c.ArrowUp.m(), j.b(n.f113468u4, k10, 0), j.b(n.f113475v4, k10, 0), k10, i12);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12898o(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N I(C17631a aVar, int i10, C4889m mVar, int i11) {
        H(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void J(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onClick");
        C4889m k10 = mVar.k(1872254881);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1872254881, i11, -1, "com.sugarcube.app.base.ui.gallery.showrooms.JumpToFurnished (ShowroomsGalleryComposables.kt:321)");
            }
            int i12 = i11 & 14;
            L(aVar, C13316h.f112820B, C18148c.ArrowDown.m(), j.b(n.f113482w4, k10, 0), j.b(n.f113489x4, k10, 0), k10, i12);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12897n(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C17631a aVar, int i10, C4889m mVar, int i11) {
        J(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void L(nI.C17631a<XH.C16807N> r41, int r42, int r43, java.lang.String r44, java.lang.String r45, U0.C4889m r46, int r47) {
        /*
            r1 = r41
            r2 = r42
            r3 = r43
            r0 = r44
            r4 = r45
            r15 = r47
            r14 = 3
            r5 = 48
            java.lang.String r6 = "onClick"
            kotlin.jvm.internal.C17542s.j(r1, r6)
            java.lang.String r6 = "secondaryText"
            kotlin.jvm.internal.C17542s.j(r0, r6)
            java.lang.String r6 = "primaryText"
            kotlin.jvm.internal.C17542s.j(r4, r6)
            r6 = -1150923160(0xffffffffbb664e68, float:-0.0035141949)
            r7 = r46
            U0.m r12 = r7.k(r6)
            r11 = 6
            r7 = r15 & 6
            r8 = 2
            if (r7 != 0) goto L_0x0038
            boolean r7 = r12.F(r1)
            if (r7 == 0) goto L_0x0035
            r7 = 4
            goto L_0x0036
        L_0x0035:
            r7 = r8
        L_0x0036:
            r7 = r7 | r15
            goto L_0x0039
        L_0x0038:
            r7 = r15
        L_0x0039:
            r9 = r15 & 48
            if (r9 != 0) goto L_0x0049
            boolean r9 = r12.d(r2)
            if (r9 == 0) goto L_0x0046
            r9 = 32
            goto L_0x0048
        L_0x0046:
            r9 = 16
        L_0x0048:
            r7 = r7 | r9
        L_0x0049:
            r9 = r15 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0059
            boolean r9 = r12.d(r3)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r7 = r7 | r9
        L_0x0059:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0069
            boolean r9 = r12.V(r0)
            if (r9 == 0) goto L_0x0066
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0068
        L_0x0066:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0068:
            r7 = r7 | r9
        L_0x0069:
            r9 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0079
            boolean r9 = r12.V(r4)
            if (r9 == 0) goto L_0x0076
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0078
        L_0x0076:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0078:
            r7 = r7 | r9
        L_0x0079:
            r9 = r7
            r7 = r9 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r5) goto L_0x008d
            boolean r5 = r12.l()
            if (r5 != 0) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            r12.L()
            r0 = r12
            goto L_0x0432
        L_0x008d:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0099
            r5 = -1
            java.lang.String r7 = "com.sugarcube.app.base.ui.gallery.showrooms.JumpToSection (ShowroomsGalleryComposables.kt:349)"
            U0.C4895p.S(r6, r9, r5, r7)
        L_0x0099:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r5.a()
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            float r10 = (float) r11
            float r18 = c2.h.B(r10)
            r25 = 30
            r26 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r17 = r7
            androidx.compose.ui.d r10 = m1.m.b(r17, r18, r19, r20, r21, r23, r25, r26)
            r11 = 8
            float r11 = (float) r11
            float r17 = c2.h.B(r11)
            A0.f r13 = A0.g.e(r17)
            androidx.compose.ui.d r10 = m1.e.a(r10, r13)
            r13 = 1077821738(0x403e412a, float:2.9727273)
            r15 = 0
            r0 = 0
            androidx.compose.ui.d r29 = androidx.compose.foundation.layout.C5074e.b(r10, r13, r15, r8, r0)
            int r8 = r9 >> 3
            r10 = 14
            r8 = r8 & r10
            t1.c r30 = J1.e.c(r2, r12, r8)
            E1.k$a r8 = E1.C4478k.f5915a
            E1.k r33 = r8.b()
            r36 = 54
            r37 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            r35 = 0
            androidx.compose.ui.d r17 = androidx.compose.ui.draw.d.b(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r8 = 458319719(0x1b516767, float:1.7321486E-22)
            r12.W(r8)
            r8 = 14
            r10 = r9 & 14
            r8 = 4
            if (r10 != r8) goto L_0x00fe
            r10 = 1
            goto L_0x00ff
        L_0x00fe:
            r10 = r15
        L_0x00ff:
            java.lang.Object r8 = r12.D()
            if (r10 != 0) goto L_0x010d
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r8 != r10) goto L_0x0115
        L_0x010d:
            FF.t r8 = new FF.t
            r8.<init>(r1)
            r12.u(r8)
        L_0x0115:
            r21 = r8
            nI.a r21 = (nI.C17631a) r21
            r12.P()
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.d.d(r17, r18, r19, r20, r21, r22, r23)
            i1.c$a r29 = i1.C5437c.f24302a
            i1.c$b r10 = r29.k()
            r13 = 6
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r10, r12, r13)
            int r10 = U0.C4883j.a(r12, r15)
            U0.y r13 = r12.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r12, r8)
            G1.g$a r31 = G1.C4504g.f6515W
            nI.a r14 = r31.a()
            U0.f r17 = r12.m()
            if (r17 != 0) goto L_0x0150
            U0.C4883j.c()
        L_0x0150:
            r12.I()
            boolean r17 = r12.i()
            if (r17 == 0) goto L_0x015d
            r12.p(r14)
            goto L_0x0160
        L_0x015d:
            r12.t()
        L_0x0160:
            U0.m r14 = U0.F1.a(r12)
            nI.p r0 = r31.c()
            U0.F1.c(r14, r6, r0)
            nI.p r0 = r31.e()
            U0.F1.c(r14, r13, r0)
            nI.p r0 = r31.b()
            boolean r6 = r14.i()
            if (r6 != 0) goto L_0x018a
            java.lang.Object r6 = r14.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r13)
            if (r6 != 0) goto L_0x0198
        L_0x018a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r14.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r14.w(r6, r0)
        L_0x0198:
            nI.p r0 = r31.d()
            U0.F1.c(r14, r8, r0)
            s0.h r0 = s0.C5862h.f28810a
            i1.c$c r0 = r29.a()
            r6 = 14
            float r8 = (float) r6
            float r18 = c2.h.B(r8)
            float r20 = c2.h.B(r8)
            r22 = 10
            r23 = 0
            r19 = 0
            r21 = 0
            r17 = r7
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.foundation.layout.d$e r8 = r5.f()
            r10 = 48
            E1.I r0 = androidx.compose.foundation.layout.G.b(r8, r0, r12, r10)
            int r8 = U0.C4883j.a(r12, r15)
            U0.y r10 = r12.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r12, r6)
            nI.a r13 = r31.a()
            U0.f r14 = r12.m()
            if (r14 != 0) goto L_0x01e1
            U0.C4883j.c()
        L_0x01e1:
            r12.I()
            boolean r14 = r12.i()
            if (r14 == 0) goto L_0x01ee
            r12.p(r13)
            goto L_0x01f1
        L_0x01ee:
            r12.t()
        L_0x01f1:
            U0.m r13 = U0.F1.a(r12)
            nI.p r14 = r31.c()
            U0.F1.c(r13, r0, r14)
            nI.p r0 = r31.e()
            U0.F1.c(r13, r10, r0)
            nI.p r0 = r31.b()
            boolean r10 = r13.i()
            if (r10 != 0) goto L_0x021b
            java.lang.Object r10 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r14)
            if (r10 != 0) goto L_0x0229
        L_0x021b:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r13.u(r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.w(r8, r0)
        L_0x0229:
            nI.p r0 = r31.d()
            U0.F1.c(r13, r6, r0)
            s0.N r0 = s0.C5843N.f28726a
            r0 = 6
            int r6 = r9 >> 6
            r0 = 14
            r6 = r6 & r0
            t1.c r16 = J1.e.c(r3, r12, r6)
            tK.v r0 = tK.C18030v.f147664a
            int r13 = tK.C18030v.f147665b
            tK.h r6 = r0.a(r12, r13)
            long r19 = r6.F0()
            r22 = 48
            r23 = 4
            r17 = 0
            r18 = 0
            r21 = r12
            I0.Y.a(r16, r17, r18, r19, r21, r22, r23)
            androidx.compose.foundation.layout.d$m r5 = r5.a()
            i1.c$b r6 = r29.k()
            r8 = 6
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r12, r8)
            int r6 = U0.C4883j.a(r12, r15)
            U0.y r8 = r12.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r12, r7)
            nI.a r14 = r31.a()
            U0.f r16 = r12.m()
            if (r16 != 0) goto L_0x027b
            U0.C4883j.c()
        L_0x027b:
            r12.I()
            boolean r16 = r12.i()
            if (r16 == 0) goto L_0x0288
            r12.p(r14)
            goto L_0x028b
        L_0x0288:
            r12.t()
        L_0x028b:
            U0.m r14 = U0.F1.a(r12)
            nI.p r15 = r31.c()
            U0.F1.c(r14, r5, r15)
            nI.p r5 = r31.e()
            U0.F1.c(r14, r8, r5)
            nI.p r5 = r31.b()
            boolean r8 = r14.i()
            if (r8 != 0) goto L_0x02b5
            java.lang.Object r8 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r8 != 0) goto L_0x02c3
        L_0x02b5:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r14.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.w(r6, r5)
        L_0x02c3:
            nI.p r5 = r31.d()
            U0.F1.c(r14, r10, r5)
            float r5 = c2.h.B(r11)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r7, r5)
            r11 = 6
            s0.C5844O.a(r5, r12, r11)
            p1.v0$a r34 = p1.C5747v0.f27350b
            long r5 = r34.j()
            r15 = r7
            r6 = r5
            tK.w r5 = r0.b(r12, r13)
            tK.c r5 = r5.a()
            N1.Y r22 = r5.b()
            int r5 = r9 >> 9
            r14 = 14
            r5 = r5 & r14
            r5 = r5 | 384(0x180, float:5.38E-43)
            r25 = r5
            r26 = 0
            r27 = 49146(0xbffa, float:6.8868E-41)
            r5 = 0
            r17 = 0
            r28 = r9
            r10 = 4
            r8 = r17
            r17 = 0
            r10 = r17
            r11 = r17
            r46 = r12
            r12 = r17
            r17 = 0
            r38 = r13
            r30 = r14
            r13 = r17
            r17 = 0
            r39 = r15
            r15 = r17
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r4 = r44
            r24 = r46
            defpackage.f.f(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = 4
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            r15 = r39
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r15, r4)
            r13 = r46
            r14 = 6
            s0.C5844O.a(r4, r13, r14)
            long r6 = r34.j()
            Y1.t$a r4 = Y1.t.f14827a
            int r19 = r4.c()
            r4 = r38
            tK.w r0 = r0.b(r13, r4)
            tK.r r0 = r0.c()
            N1.Y r22 = r0.b()
            a$a r0 = new a$a
            r23 = r0
            r4 = 0
            r8 = 0
            r12 = 1
            r0.<init>(r4, r12, r8)
            int r0 = r28 >> 12
            r0 = r0 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            r25 = r0
            r26 = 48
            r27 = 14330(0x37fa, float:2.008E-41)
            r5 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r0 = 0
            r4 = r12
            r12 = r0
            r16 = 0
            r0 = r13
            r13 = r16
            r16 = 0
            r40 = r15
            r15 = r16
            r17 = 0
            r4 = r45
            r24 = r0
            defpackage.f.f(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.x()
            r0.x()
            r4 = 0
            r5 = r40
            r6 = 0
            r7 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r5, r4, r7, r6)
            r9 = 0
            r10 = 3
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.C(r8, r6, r9, r10, r6)
            i1.c r6 = r29.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r9)
            int r9 = U0.C4883j.a(r0, r9)
            U0.y r10 = r0.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r0, r8)
            nI.a r11 = r31.a()
            U0.f r12 = r0.m()
            if (r12 != 0) goto L_0x03be
            U0.C4883j.c()
        L_0x03be:
            r0.I()
            boolean r12 = r0.i()
            if (r12 == 0) goto L_0x03cb
            r0.p(r11)
            goto L_0x03ce
        L_0x03cb:
            r0.t()
        L_0x03ce:
            U0.m r11 = U0.F1.a(r0)
            nI.p r12 = r31.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r31.e()
            U0.F1.c(r11, r10, r6)
            nI.p r6 = r31.b()
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x03f8
            java.lang.Object r10 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x0406
        L_0x03f8:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.w(r9, r6)
        L_0x0406:
            nI.p r6 = r31.d()
            U0.F1.c(r11, r8, r6)
            androidx.compose.foundation.layout.j r6 = androidx.compose.foundation.layout.C5079j.f18125a
            r6 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r5, r4, r7, r6)
            r5 = 20
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r4, r5)
            r5 = 6
            s0.C5844O.a(r4, r0, r5)
            r0.x()
            r0.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0432
            U0.C4895p.R()
        L_0x0432:
            U0.Y0 r7 = r0.n()
            if (r7 == 0) goto L_0x044d
            FF.v r8 = new FF.v
            r0 = r8
            r1 = r41
            r2 = r42
            r3 = r43
            r4 = r44
            r5 = r45
            r6 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x044d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: FF.C12882E.L(nI.a, int, int, java.lang.String, java.lang.String, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17631a aVar, int i10, int i11, String str, String str2, int i12, C4889m mVar, int i13) {
        L(aVar, i10, i11, str, str2, mVar, M0.a(i12 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void O(nI.C17631a<XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, U0.C4889m r35, int r36) {
        /*
            r0 = r33
            r1 = r34
            r2 = r36
            java.lang.String r3 = "onClickSignup"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onClickLogin"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            r3 = 1493961893(0x590c0ca5, float:2.46377497E15)
            r4 = r35
            U0.m r15 = r4.k(r3)
            r13 = 6
            r4 = r2 & 6
            r14 = 4
            if (r4 != 0) goto L_0x002a
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0027
            r4 = r14
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r2
            goto L_0x002b
        L_0x002a:
            r4 = r2
        L_0x002b:
            r5 = r2 & 48
            r12 = 32
            if (r5 != 0) goto L_0x003c
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0039
            r5 = r12
            goto L_0x003b
        L_0x0039:
            r5 = 16
        L_0x003b:
            r4 = r4 | r5
        L_0x003c:
            r11 = r4
            r4 = r11 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0051
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x004a
            goto L_0x0051
        L_0x004a:
            r15.L()
            r17 = r15
            goto L_0x0292
        L_0x0051:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x005d
            r4 = -1
            java.lang.String r5 = "com.sugarcube.app.base.ui.gallery.showrooms.LoginCard (ShowroomsGalleryComposables.kt:584)"
            U0.C4895p.S(r3, r11, r4, r5)
        L_0x005d:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r29 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r29.g()
            i1.c$a r30 = i1.C5437c.f24302a
            i1.c$b r5 = r30.k()
            r10 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r15, r10)
            int r5 = U0.C4883j.a(r15, r10)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r31 = G1.C4504g.f6515W
            nI.a r8 = r31.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x008b
            U0.C4883j.c()
        L_0x008b:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x0098
            r15.p(r8)
            goto L_0x009b
        L_0x0098:
            r15.t()
        L_0x009b:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r31.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r31.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r31.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x00c5
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x00d3
        L_0x00c5:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r4)
        L_0x00d3:
            nI.p r4 = r31.d()
            U0.F1.c(r8, r7, r4)
            s0.h r4 = s0.C5862h.f28810a
            int r4 = OE.n.f113262P4
            java.lang.String r4 = J1.j.b(r4, r15, r10)
            tK.v r5 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.w r5 = r5.b(r15, r6)
            tK.c r5 = r5.a()
            N1.Y r24 = r5.b()
            r27 = 0
            r28 = 65534(0xfffe, float:9.1833E-41)
            r5 = 0
            r6 = 0
            r8 = 0
            r16 = 0
            r10 = r16
            r32 = r11
            r11 = r16
            r12 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r35 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r25 = r35
            I0.b1.b(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = 4
            float r15 = (float) r4
            float r5 = c2.h.B(r15)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r3, r5)
            r14 = r35
            r13 = 6
            s0.C5844O.a(r5, r14, r13)
            androidx.compose.foundation.layout.d$e r5 = r29.f()
            i1.c$c r6 = r30.l()
            r12 = 0
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r6, r14, r12)
            int r6 = U0.C4883j.a(r14, r12)
            U0.y r7 = r14.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r14, r3)
            nI.a r9 = r31.a()
            U0.f r10 = r14.m()
            if (r10 != 0) goto L_0x0159
            U0.C4883j.c()
        L_0x0159:
            r14.I()
            boolean r10 = r14.i()
            if (r10 == 0) goto L_0x0166
            r14.p(r9)
            goto L_0x0169
        L_0x0166:
            r14.t()
        L_0x0169:
            U0.m r9 = U0.F1.a(r14)
            nI.p r10 = r31.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r31.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r31.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x0193
            java.lang.Object r7 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
            if (r7 != 0) goto L_0x01a1
        L_0x0193:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x01a1:
            nI.p r5 = r31.d()
            U0.F1.c(r9, r8, r5)
            s0.N r22 = s0.C5843N.f28726a
            int r5 = OE.n.f113311Y
            java.lang.String r5 = J1.j.b(r5, r14, r12)
            wK.l0$f r7 = wK.C18390l0.f.f151159b
            wK.j0 r23 = wK.C18366j0.Small
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r22
            r17 = r3
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r8 = -1609966396(0xffffffffa009dcc4, float:-1.1677397E-19)
            r14.W(r8)
            r8 = r32 & 14
            r24 = 1
            if (r8 != r4) goto L_0x01d3
            r10 = r24
            goto L_0x01d4
        L_0x01d3:
            r10 = r12
        L_0x01d4:
            java.lang.Object r4 = r14.D()
            if (r10 != 0) goto L_0x01e2
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r4 != r8) goto L_0x01ea
        L_0x01e2:
            FF.p r4 = new FF.p
            r4.<init>(r0)
            r14.u(r4)
        L_0x01ea:
            r16 = r4
            nI.a r16 = (nI.C17631a) r16
            r14.P()
            int r4 = wK.C18390l0.f.f151160c
            int r4 = r4 << 9
            r11 = r4 | 24576(0x6000, float:3.4438E-41)
            r17 = 484(0x1e4, float:6.78E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r18 = 0
            r19 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r23
            r20 = r11
            r11 = r18
            r12 = r19
            r13 = r16
            r35 = r14
            r18 = r15
            r15 = r20
            r16 = r17
            wK.C18342h0.f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            float r4 = c2.h.B(r18)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.y(r3, r4)
            r15 = r35
            r5 = 6
            s0.C5844O.a(r4, r15, r5)
            int r4 = OE.n.f113191E
            r5 = 0
            java.lang.String r4 = J1.j.b(r4, r15, r5)
            wK.l0$d r7 = wK.C18390l0.d.f151153b
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r22
            r17 = r3
            androidx.compose.ui.d r3 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r6 = -1609955165(0xffffffffa00a08a3, float:-1.1691912E-19)
            r15.W(r6)
            r6 = r32 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r6 != r8) goto L_0x024e
            r10 = r24
            goto L_0x024f
        L_0x024e:
            r10 = r5
        L_0x024f:
            java.lang.Object r5 = r15.D()
            if (r10 != 0) goto L_0x025d
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x0265
        L_0x025d:
            FF.q r5 = new FF.q
            r5.<init>(r1)
            r15.u(r5)
        L_0x0265:
            r13 = r5
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            int r5 = wK.C18390l0.d.f151154c
            int r5 = r5 << 9
            r14 = r5 | 24576(0x6000, float:3.4438E-41)
            r16 = 484(0x1e4, float:6.78E-43)
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r3
            r8 = r23
            r3 = r14
            r14 = r15
            r17 = r15
            r15 = r3
            wK.C18342h0.f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r17.x()
            r17.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0292
            U0.C4895p.R()
        L_0x0292:
            U0.Y0 r3 = r17.n()
            if (r3 == 0) goto L_0x02a0
            FF.r r4 = new FF.r
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: FF.C12882E.O(nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        O(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void S(FF.C12888e.j r20, com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter.OnInteractionsListener r21, java.util.Locale r22, U0.C4889m r23, int r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            java.lang.String r4 = "room"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "callbacks"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "locale"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = 364669451(0x15bc6a0b, float:7.60999E-26)
            r5 = r23
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x002f
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x002c
            r5 = 4
            goto L_0x002d
        L_0x002c:
            r5 = 2
        L_0x002d:
            r5 = r5 | r3
            goto L_0x0030
        L_0x002f:
            r5 = r3
        L_0x0030:
            r6 = r3 & 48
            r7 = 32
            if (r6 != 0) goto L_0x004a
            r6 = r3 & 64
            if (r6 != 0) goto L_0x003f
            boolean r6 = r15.V(r1)
            goto L_0x0043
        L_0x003f:
            boolean r6 = r15.F(r1)
        L_0x0043:
            if (r6 == 0) goto L_0x0047
            r6 = r7
            goto L_0x0049
        L_0x0047:
            r6 = 16
        L_0x0049:
            r5 = r5 | r6
        L_0x004a:
            r6 = r3 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005a
            boolean r6 = r15.F(r2)
            if (r6 == 0) goto L_0x0057
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r5 = r5 | r6
        L_0x005a:
            r6 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x006d
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r15.L()
            r4 = r15
            goto L_0x00fd
        L_0x006d:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0079
            r6 = -1
            java.lang.String r8 = "com.sugarcube.app.base.ui.gallery.showrooms.RoomCard (ShowroomsGalleryComposables.kt:84)"
            U0.C4895p.S(r4, r5, r6, r8)
        L_0x0079:
            U0.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r15.Q(r4)
            android.content.Context r4 = (android.content.Context) r4
            int r6 = com.sugarcube.common.R.color.card_background_base
            r8 = 0
            long r9 = J1.b.a(r6, r15, r8)
            r6 = 8
            float r6 = (float) r6
            float r11 = c2.h.B(r6)
            A0.f r11 = A0.g.e(r11)
            float r14 = c2.h.B(r6)
            r6 = 1569289319(0x5d897467, float:1.23808184E18)
            r15.W(r6)
            r6 = r5 & 112(0x70, float:1.57E-43)
            r12 = 1
            if (r6 == r7) goto L_0x00ae
            r5 = r5 & 64
            if (r5 == 0) goto L_0x00af
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x00af
        L_0x00ae:
            r8 = r12
        L_0x00af:
            boolean r5 = r15.F(r0)
            r5 = r5 | r8
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x00c2
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00ca
        L_0x00c2:
            FF.x r6 = new FF.x
            r6.<init>(r1, r0)
            r15.u(r6)
        L_0x00ca:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            FF.E$b r6 = new FF.E$b
            r6.<init>(r4, r0, r2)
            r4 = 54
            r7 = -700757903(0xffffffffd63b4871, float:-5.1479952E13)
            c1.a r16 = c1.c.e(r7, r12, r6, r15, r4)
            r18 = 817889280(0x30c00000, float:1.3969839E-9)
            r19 = 358(0x166, float:5.02E-43)
            r6 = 0
            r7 = 0
            r12 = 0
            r4 = 0
            r17 = 0
            r8 = r11
            r11 = r12
            r13 = r4
            r4 = r15
            r15 = r17
            r17 = r4
            I0.C4566k.b(r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00fd
            U0.C4895p.R()
        L_0x00fd:
            U0.Y0 r4 = r4.n()
            if (r4 == 0) goto L_0x010b
            FF.y r5 = new FF.y
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: FF.C12882E.S(FF.e$j, com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter$OnInteractionsListener, java.util.Locale, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N T(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, C12888e.j jVar) {
        onInteractionsListener.onSceneSelected(jVar.n());
        if (jVar.f() > 0) {
            onInteractionsListener.onSceneDesignExistingClicked(jVar.n());
        } else {
            GalleryHomeContentAdapter.OnInteractionsListener.a.a(onInteractionsListener, new Design(jVar.j(), jVar.n(), 0, true, jVar.e()), (String) null, 2, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(C12888e.j jVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Locale locale, int i10, C4889m mVar, int i11) {
        S(jVar, onInteractionsListener, locale, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void V(java.util.List<? extends com.sugarcube.core.network.models.RoomType> r25, nI.C17642l<? super com.sugarcube.core.network.models.RoomType, XH.C16807N> r26, U0.C4889m r27, int r28) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = 1
            java.lang.String r4 = "items"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "onRoomTypeSelected"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            r4 = -1691472431(0xffffffff9b2e2dd1, float:-1.4407747E-22)
            r5 = r27
            U0.m r15 = r5.k(r4)
            r14 = 6
            r5 = r2 & 6
            if (r5 != 0) goto L_0x002a
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x0027
            r5 = 4
            goto L_0x0028
        L_0x0027:
            r5 = 2
        L_0x0028:
            r5 = r5 | r2
            goto L_0x002b
        L_0x002a:
            r5 = r2
        L_0x002b:
            r6 = r2 & 48
            if (r6 != 0) goto L_0x003b
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x0038
            r6 = 32
            goto L_0x003a
        L_0x0038:
            r6 = 16
        L_0x003a:
            r5 = r5 | r6
        L_0x003b:
            r12 = r5
            r5 = r12 & 19
            r6 = 18
            if (r5 != r6) goto L_0x004f
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            r15.L()
            r6 = r15
            goto L_0x029d
        L_0x004f:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x005b
            r5 = -1
            java.lang.String r6 = "com.sugarcube.app.base.ui.gallery.showrooms.RoomTypeFilterBar (ShowroomsGalleryComposables.kt:457)"
            U0.C4895p.S(r4, r12, r5, r6)
        L_0x005b:
            r4 = 950165694(0x38a260be, float:7.7427816E-5)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            r11 = 0
            if (r4 != r5) goto L_0x0075
            U0.o0 r4 = U0.C4877g1.a(r11)
            r15.u(r4)
        L_0x0075:
            U0.o0 r4 = (U0.C4894o0) r4
            r15.P()
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.o r17 = androidx.compose.foundation.m.c(r11, r15, r11, r3)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r5
            androidx.compose.ui.d r6 = androidx.compose.foundation.m.b(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r7 = r7.f()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$c r8 = r8.l()
            E1.I r7 = androidx.compose.foundation.layout.G.b(r7, r8, r15, r11)
            int r8 = U0.C4883j.a(r15, r11)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r10 = G1.C4504g.f6515W
            nI.a r3 = r10.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00bb
            U0.C4883j.c()
        L_0x00bb:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00c8
            r15.p(r3)
            goto L_0x00cb
        L_0x00c8:
            r15.t()
        L_0x00cb:
            U0.m r3 = U0.F1.a(r15)
            nI.p r13 = r10.c()
            U0.F1.c(r3, r7, r13)
            nI.p r7 = r10.e()
            U0.F1.c(r3, r9, r7)
            nI.p r7 = r10.b()
            boolean r9 = r3.i()
            if (r9 != 0) goto L_0x00f5
            java.lang.Object r9 = r3.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 != 0) goto L_0x0103
        L_0x00f5:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r3.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.w(r8, r7)
        L_0x0103:
            nI.p r7 = r10.d()
            U0.F1.c(r3, r6, r7)
            s0.N r3 = s0.C5843N.f28726a
            float r3 = FF.L.A()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.y(r5, r3)
            s0.C5844O.a(r3, r15, r14)
            r3 = -497107960(0xffffffffe25ebc08, float:-1.0271816E21)
            r15.W(r3)
            int r3 = r25.size()
            r13 = r11
        L_0x0122:
            if (r13 >= r3) goto L_0x027f
            java.lang.Object r5 = r0.get(r13)
            com.sugarcube.core.network.models.RoomType r5 = (com.sugarcube.core.network.models.RoomType) r5
            if (r5 == 0) goto L_0x0139
            com.sugarcube.app.base.data.model.RoomTypeRenderer r6 = com.sugarcube.app.base.data.model.RoomTypeRenderer.INSTANCE
            java.lang.Integer r6 = r6.getTitleRes(r5)
            if (r6 == 0) goto L_0x0139
            int r6 = r6.intValue()
            goto L_0x013b
        L_0x0139:
            int r6 = OE.n.f113433p4
        L_0x013b:
            if (r5 == 0) goto L_0x0148
            com.sugarcube.app.base.data.model.RoomTypeRenderer r7 = com.sugarcube.app.base.data.model.RoomTypeRenderer.INSTANCE
            int r7 = r7.getIconResId(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0149
        L_0x0148:
            r7 = 0
        L_0x0149:
            r8 = 44
            if (r7 != 0) goto L_0x01cb
            r7 = 891082215(0x351cd5e7, float:5.84258E-7)
            r15.W(r7)
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.i(r7, r8)
            java.lang.String r6 = J1.j.b(r6, r15, r11)
            int r8 = r4.e()
            if (r13 != r8) goto L_0x016a
            r9 = 1
            goto L_0x016b
        L_0x016a:
            r9 = r11
        L_0x016b:
            r8 = -525438183(0xffffffffe0ae7319, float:-1.0056335E20)
            r15.W(r8)
            boolean r8 = r15.d(r13)
            r10 = r12 & 112(0x70, float:1.57E-43)
            r14 = 32
            if (r10 != r14) goto L_0x017d
            r10 = 1
            goto L_0x017e
        L_0x017d:
            r10 = r11
        L_0x017e:
            r8 = r8 | r10
            boolean r10 = r15.V(r5)
            r8 = r8 | r10
            java.lang.Object r10 = r15.D()
            if (r8 != 0) goto L_0x0192
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x019a
        L_0x0192:
            FF.k r10 = new FF.k
            r10.<init>(r4, r13, r1, r5)
            r15.u(r10)
        L_0x019a:
            r18 = r10
            nI.a r18 = (nI.C17631a) r18
            r15.P()
            r19 = 48
            r20 = 44
            r8 = 0
            r10 = 0
            r21 = 0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r21
            r11 = r18
            r18 = r12
            r12 = r15
            r24 = r13
            r13 = r19
            r27 = r3
            r3 = r14
            r14 = r20
            wK.C18444p6.s(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.P()
            r3 = r24
            r23 = 0
            r24 = r15
            goto L_0x024d
        L_0x01cb:
            r27 = r3
            r18 = r12
            r24 = r13
            r3 = 32
            r9 = 891438436(0x35224564, float:6.045068E-7)
            r15.W(r9)
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r9, r8)
            r14 = 0
            java.lang.String r6 = J1.j.b(r6, r15, r14)
            int r9 = r4.e()
            if (r13 != r9) goto L_0x01f1
            r10 = 1
            goto L_0x01f2
        L_0x01f1:
            r10 = r14
        L_0x01f2:
            int r7 = r7.intValue()
            r9 = -525425607(0xffffffffe0aea439, float:-1.0067397E20)
            r15.W(r9)
            boolean r9 = r15.d(r13)
            r11 = r18 & 112(0x70, float:1.57E-43)
            if (r11 != r3) goto L_0x0206
            r11 = 1
            goto L_0x0207
        L_0x0206:
            r11 = r14
        L_0x0207:
            r9 = r9 | r11
            boolean r11 = r15.V(r5)
            r9 = r9 | r11
            java.lang.Object r11 = r15.D()
            if (r9 != 0) goto L_0x021b
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r11 != r9) goto L_0x0223
        L_0x021b:
            FF.l r11 = new FF.l
            r11.<init>(r4, r13, r1, r5)
            r15.u(r11)
        L_0x0223:
            r16 = r11
            nI.a r16 = (nI.C17631a) r16
            r15.P()
            r20 = 384(0x180, float:5.38E-43)
            r21 = 216(0xd8, float:3.03E-43)
            r9 = 0
            r11 = 0
            r12 = 0
            r22 = 0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r12
            r12 = r22
            r3 = r13
            r13 = r16
            r23 = r14
            r14 = r15
            r24 = r15
            r15 = r20
            r16 = r21
            wK.C18444p6.q(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r24.P()
        L_0x024d:
            r5 = -497074335(0xffffffffe25f3f61, float:-1.0295477E21)
            r6 = r24
            r6.W(r5)
            int r5 = r25.size()
            r7 = 1
            int r5 = r5 - r7
            if (r3 == r5) goto L_0x026f
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r8 = 20
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.y(r5, r8)
            r8 = 6
            s0.C5844O.a(r5, r6, r8)
            goto L_0x0270
        L_0x026f:
            r8 = 6
        L_0x0270:
            r6.P()
            int r13 = r3 + 1
            r3 = r27
            r15 = r6
            r14 = r8
            r12 = r18
            r11 = r23
            goto L_0x0122
        L_0x027f:
            r8 = r14
            r6 = r15
            r6.P()
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            float r4 = FF.L.A()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.y(r3, r4)
            s0.C5844O.a(r3, r6, r8)
            r6.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x029d
            U0.C4895p.R()
        L_0x029d:
            U0.Y0 r3 = r6.n()
            if (r3 == 0) goto L_0x02ab
            FF.m r4 = new FF.m
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x02ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: FF.C12882E.V(java.util.List, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C4894o0 o0Var, int i10, C17642l lVar, RoomType roomType) {
        o0Var.g(i10);
        lVar.invoke(roomType);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X(C4894o0 o0Var, int i10, C17642l lVar, RoomType roomType) {
        o0Var.g(i10);
        lVar.invoke(roomType);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(List list, C17642l lVar, int i10, C4889m mVar, int i11) {
        V(list, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(boolean z10) {
        return C16807N.f139792a;
    }

    private static final C4669d b0(String str, String str2, N1.G g10) {
        v vVar;
        try {
            int s02 = C15854t.s0(str, str2, 0, false, 6, (Object) null);
            vVar = C16796C.a(Integer.valueOf(s02), Integer.valueOf(str2.length() + s02));
        } catch (Exception unused) {
            vVar = C16796C.a(-1, -1);
        }
        int intValue = ((Number) vVar.a()).intValue();
        int intValue2 = ((Number) vVar.b()).intValue();
        if (intValue == -1) {
            C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
            aVar.j(str);
            return aVar.q();
        }
        C4669d.a aVar2 = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
        aVar2.j(str);
        aVar2.d(g10, intValue, intValue2);
        return aVar2.q();
    }

    public static final void v(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1985727364);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1985727364, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.BlankSpacesHeader (ShowroomsGalleryComposables.kt:418)");
            }
            C(j.b(n.f113335b4, k10, 0), j.b(n.f113328a4, k10, 0), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12893j(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(int i10, C4889m mVar, int i11) {
        v(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void x(C4899r0<C12887d> r0Var, C17642l<? super Boolean, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C4899r0<C12887d> r0Var2 = r0Var;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(r0Var2, "expandCollapse");
        C17542s.j(lVar2, "onClick");
        C4889m k10 = mVar.k(491796865);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(r0Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(491796865, i11, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ExpandCollapse (ShowroomsGalleryComposables.kt:275)");
            }
            k10.W(2049878443);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                k10.u(r0Var2);
                D10 = r0Var2;
            }
            C4899r0 r0Var3 = (C4899r0) D10;
            k10.P();
            d h10 = J.h(d.f18749a, 0.0f, 1, (Object) null);
            I b10 = G.b(C5073d.f18068a.b(), C5437c.f24302a.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
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
            k10.W(1355040243);
            boolean z10 = (i11 & 112) == 32;
            Object D11 = k10.D();
            if (z10 || D11 == aVar.a()) {
                D11 = new C12878A(r0Var3, lVar2);
                k10.u(D11);
            }
            k10.P();
            float f10 = (float) 24;
            mVar2 = k10;
            C4564j.c((C17631a) D11, (d) null, false, (m) null, (C4562i) null, A0.g.e(c2.h.B(f10)), (C5601g) null, (C4558g) null, D.b(c2.h.B(f10), c2.h.B((float) 12)), c1.c.e(-1108432405, true, new a(r0Var3), k10, 54), k10, 905969664, 222);
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
            n11.a(new C12879B(r0Var2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C4899r0 r0Var, C17642l lVar) {
        C12887d dVar = (C12887d) r0Var.getValue();
        r0Var.setValue(C12887d.b(dVar, false, !dVar.c(), 1, (Object) null));
        lVar.invoke(Boolean.valueOf(((C12887d) r0Var.getValue()).c()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C4899r0 r0Var, C17642l lVar, int i10, C4889m mVar, int i11) {
        x(r0Var, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
