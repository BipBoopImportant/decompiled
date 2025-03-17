package FF;

import E1.C4488v;
import E1.C4489w;
import E1.I;
import FF.C12888e;
import G1.C4504g;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.d;
import com.sugarcube.app.base.data.analytics.Furnishing;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.ui.gallery.adapters.main.GalleryHomeContentAdapter;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.app.base.ui.gallery.showrooms.VizState;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.Showroom;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import m0.C5548j;
import m0.M;
import m0.N;
import m0.y0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import p0.s;
import s0.C5861g;
import s0.C5862h;
import wK.I4;
import wK.J4;
import wK.X4;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u001b\u0010\"\u001a\u00060\u0007j\u0002`\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!*\n\u0010#\"\u00020\u00072\u00020\u0007¨\u0006$²\u0006\u000e\u0010\u000f\u001a\u00020\n8\n@\nX\u0002"}, d2 = {"LFF/i;", "content", "", "LFF/e;", "z", "(LFF/i;)Ljava/util/List;", "contentState", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "Lcom/sugarcube/app/base/ui/gallery/showrooms/GalleryCallbacks;", "callbacks", "", "isUpdating", "LXH/N;", "g", "(LFF/i;Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;Ljava/lang/Boolean;LU0/m;I)V", "isRefreshing", "B", "(Ljava/lang/Boolean;Z)Z", "Lc2/h;", "a", "F", "A", "()F", "screenStartEndPadding", "", "b", "Ljava/util/List;", "getPreviewImages", "()Ljava/util/List;", "previewImages", "c", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "getPreviewCallbacks", "()Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "previewCallbacks", "GalleryCallbacks", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class L {

    /* renamed from: a  reason: collision with root package name */
    private static final float f109788a = c2.h.B((float) 24);

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f109789b = C16877v.q("https://storage.googleapis.com/processed-develop/compositions/412fbd41-2a27-4edb-a3b6-23c83135a845/thumbnail_2022_05_25_23_03_47.jpeg", "https://storage.googleapis.com/processed-develop/compositions/9254eb1e-b466-48ef-b972-357e4af638c5/thumbnail_2022_08_16_21_35_38.jpeg");

    /* renamed from: c  reason: collision with root package name */
    private static final GalleryHomeContentAdapter.OnInteractionsListener f109790c = new k();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreenKt$ShowroomsGalleryScreen$1", f = "ShowroomsGalleryScreen.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f109791c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O<List<C12888e>> f109792d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12892i f109793e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O<List<C12888e>> o10, C12892i iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f109792d = o10;
            this.f109793e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f109792d, this.f109793e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f109791c == 0) {
                y.b(obj);
                this.f109792d.f144348a = L.z(this.f109793e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12888e f109794a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentAdapter.OnInteractionsListener f109795b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12892i f109796c;

        b(C12888e eVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, C12892i iVar) {
            this.f109794a = eVar;
            this.f109795b = onInteractionsListener;
            this.f109796c = iVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1057486525, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowroomsGalleryScreen.kt:283)");
                }
                C12882E.S((C12888e.j) this.f109794a, this.f109795b, this.f109796c.e(), mVar, 0);
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
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4899r0<C12887d> f109797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map<C12888e.j, C4899r0<C12889f>> f109798b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C12888e f109799c;

        c(C4899r0<C12887d> r0Var, Map<C12888e.j, C4899r0<C12889f>> map, C12888e eVar) {
            this.f109797a = r0Var;
            this.f109798b = map;
            this.f109799c = eVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C12888e eVar, Map map, boolean z10) {
            L.i(map, z10, ((C12888e.c) eVar).e());
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1538288038, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowroomsGalleryScreen.kt:290)");
                }
                C4899r0<C12887d> r0Var = this.f109797a;
                mVar.W(-1546111400);
                boolean F10 = mVar.F(this.f109798b) | mVar.F(this.f109799c);
                C12888e eVar = this.f109799c;
                Map<C12888e.j, C4899r0<C12889f>> map = this.f109798b;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new M(eVar, map);
                    mVar.u(D10);
                }
                mVar.P();
                C12882E.x(r0Var, (C17642l) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12892i f109800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map<C12888e.j, C4899r0<C12889f>> f109801b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<C12887d> f109802c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<C12887d> f109803d;

        d(C12892i iVar, Map<C12888e.j, C4899r0<C12889f>> map, C4899r0<C12887d> r0Var, C4899r0<C12887d> r0Var2) {
            this.f109800a = iVar;
            this.f109801b = map;
            this.f109802c = r0Var;
            this.f109803d = r0Var2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(Map map, C4899r0 r0Var, C4899r0 r0Var2, RoomType roomType) {
            L.h(map, r0Var, r0Var2, roomType, C12891h.Furnished);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1903567229, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowroomsGalleryScreen.kt:312)");
                }
                List V02 = C16877v.V0(C16877v.e(null), this.f109800a.a());
                mVar.W(-1546080018);
                boolean F10 = mVar.F(this.f109801b);
                Map<C12888e.j, C4899r0<C12889f>> map = this.f109801b;
                C4899r0<C12887d> r0Var = this.f109802c;
                C4899r0<C12887d> r0Var2 = this.f109803d;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new N(map, r0Var, r0Var2);
                    mVar.u(D10);
                }
                mVar.P();
                C12882E.V(V02, (C17642l) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentAdapter.OnInteractionsListener f109804a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f109805b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f109806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f109807d;

        e(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Q q10, o oVar, kotlin.jvm.internal.L l10) {
            this.f109804a = onInteractionsListener;
            this.f109805b = q10;
            this.f109806c = oVar;
            this.f109807d = l10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Q q10, o oVar, kotlin.jvm.internal.L l10) {
            onInteractionsListener.onJumpClicked(Furnishing.Unfurnished);
            L.s(q10, oVar, l10, C12888e.a.f109869f);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-762031173, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowroomsGalleryScreen.kt:330)");
                }
                C12882E.H(new O(this.f109804a, this.f109805b, this.f109806c, this.f109807d), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentAdapter.OnInteractionsListener f109808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f109809b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f109810c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f109811d;

        f(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Q q10, o oVar, kotlin.jvm.internal.L l10) {
            this.f109808a = onInteractionsListener;
            this.f109809b = q10;
            this.f109810c = oVar;
            this.f109811d = l10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Q q10, o oVar, kotlin.jvm.internal.L l10) {
            onInteractionsListener.onJumpClicked(Furnishing.FullyFurnished);
            L.s(q10, oVar, l10, C12888e.C2626e.f109873f);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2094830374, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowroomsGalleryScreen.kt:339)");
                }
                C12882E.J(new P(this.f109808a, this.f109809b, this.f109810c, this.f109811d), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentAdapter.OnInteractionsListener f109812a;

        g(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
            this.f109812a = onInteractionsListener;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
            onInteractionsListener.openHelpCenter(h.d.f124420e);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(867337721, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowroomsGalleryScreen.kt:348)");
                }
                mVar.W(-1546032397);
                boolean F10 = mVar.F(this.f109812a);
                GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = this.f109812a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new Q(onInteractionsListener);
                    mVar.u(D10);
                }
                mVar.P();
                C12882E.E((C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GalleryHomeContentAdapter.OnInteractionsListener f109813a;

        h(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
            this.f109813a = onInteractionsListener;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
            onInteractionsListener.onSignUpClicked(h.d.f124420e);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener) {
            onInteractionsListener.onLoginClicked(h.d.f124420e);
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-465461480, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShowroomsGalleryScreen.kt:356)");
                }
                mVar.W(-1546020328);
                boolean F10 = mVar.F(this.f109813a);
                GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener = this.f109813a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new S(onInteractionsListener);
                    mVar.u(D10);
                }
                C17631a aVar = (C17631a) D10;
                mVar.P();
                mVar.W(-1546017225);
                boolean F11 = mVar.F(this.f109813a);
                GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener2 = this.f109813a;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new T(onInteractionsListener2);
                    mVar.u(D11);
                }
                mVar.P();
                C12882E.O(aVar, (C17631a) D11, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreenKt$ShowroomsGalleryScreen$scrollTo$1", f = "ShowroomsGalleryScreen.kt", l = {248, 253}, m = "invokeSuspend")
    static final class i extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f109814c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12888e f109815d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o f109816e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f109817f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C12888e eVar, o oVar, kotlin.jvm.internal.L l10, C17164e<? super i> eVar2) {
            super(2, eVar2);
            this.f109815d = eVar;
            this.f109816e = oVar;
            this.f109817f = l10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f109815d, this.f109816e, this.f109817f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f109814c;
            if (i10 == 0) {
                y.b(obj);
                C12888e eVar = this.f109815d;
                if (eVar instanceof C12888e.a) {
                    o oVar = this.f109816e;
                    y0 j10 = C5548j.j(1400, 0, M.d(), 2, (Object) null);
                    this.f109814c = 1;
                    if (oVar.k(0, j10, this) == f10) {
                        return f10;
                    }
                } else if (eVar instanceof C12888e.C2626e) {
                    y0 j11 = C5548j.j(1400, 0, M.d(), 2, (Object) null);
                    this.f109814c = 2;
                    if (this.f109816e.k((int) (this.f109817f.f144345a + ((float) 20)), j11, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f109818a;

        j(p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f109818a = pVar;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(245804301, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.wrapExpandableItem.<anonymous> (ShowroomsGalleryScreen.kt:186)");
            }
            this.f109818a.invoke(mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\u0005¨\u0006\""}, d2 = {"FF/L$k", "Lcom/sugarcube/app/base/ui/gallery/adapters/main/GalleryHomeContentAdapter$OnInteractionsListener;", "Lcom/sugarcube/app/base/ui/gallery/showrooms/GalleryCallbacks;", "LXH/N;", "onNewScanClicked", "()V", "Lcom/sugarcube/app/base/data/model/Design;", "design", "", "furniture", "onNewDesignClicked", "(Lcom/sugarcube/app/base/data/model/Design;Ljava/lang/String;)V", "Lcom/sugarcube/app/base/data/database/Scene;", "scene", "onRetryUploadClicked", "(Lcom/sugarcube/app/base/data/database/Scene;)V", "Ljava/util/UUID;", "uuid", "onSceneDesignExistingClicked", "(Ljava/util/UUID;)V", "onSceneSelected", "Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "onNeedHelpClicked", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "openHelpCenter", "onSignUpClicked", "onLoginClicked", "onDesignOnWebClicked", "type", "onJumpClicked", "(Ljava/lang/String;)V", "onPrivacyPolicyConsentContinueClicked", "onPullRefresh", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements GalleryHomeContentAdapter.OnInteractionsListener {
        k() {
        }

        public void onDesignOnWebClicked() {
        }

        public void onJumpClicked(String str) {
            C17542s.j(str, "type");
        }

        public void onLoginClicked(com.sugarcube.app.base.ui.gallery.h hVar) {
        }

        public void onNeedHelpClicked(com.sugarcube.app.base.ui.gallery.h hVar) {
        }

        public void onNewDesignClicked(Design design, String str) {
            C17542s.j(design, "design");
        }

        public void onNewScanClicked() {
        }

        public void onPrivacyPolicyConsentContinueClicked() {
        }

        public void onPullRefresh() {
        }

        public void onRetryUploadClicked(Scene scene) {
            C17542s.j(scene, "scene");
        }

        public void onSceneDesignExistingClicked(UUID uuid) {
            C17542s.j(uuid, "uuid");
        }

        public void onSceneSelected(UUID uuid) {
            C17542s.j(uuid, "uuid");
        }

        public void onSignUpClicked(com.sugarcube.app.base.ui.gallery.h hVar) {
        }

        public void openHelpCenter(com.sugarcube.app.base.ui.gallery.h hVar) {
        }
    }

    public static final float A() {
        return f109788a;
    }

    public static final boolean B(Boolean bool, boolean z10) {
        if (!z10 || C17542s.e(bool, Boolean.TRUE)) {
            return z10;
        }
        return false;
    }

    public static final void g(C12892i iVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Boolean bool, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        Iterator it;
        C4899r0 r0Var;
        M0.g gVar;
        Map map;
        C4899r0 r0Var2;
        Q q10;
        o oVar;
        C4899r0 r0Var3;
        C4899r0 r0Var4;
        Map map2;
        boolean z10;
        C12892i iVar2 = iVar;
        GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener2 = onInteractionsListener;
        Boolean bool2 = bool;
        int i12 = i10;
        C17542s.j(onInteractionsListener2, "callbacks");
        C4889m k10 = mVar.k(50227842);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(iVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k10.V(onInteractionsListener2) : k10.F(onInteractionsListener2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(bool2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(50227842, i11, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen (ShowroomsGalleryScreen.kt:115)");
            }
            k10.W(1518642824);
            if (iVar2 == null) {
                X4.q((androidx.compose.ui.d) null, (J4) null, I4.Large, k10, 384, 3);
                k10.P();
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new C12883F(iVar2, onInteractionsListener2, bool2, i12));
                    return;
                }
                return;
            }
            k10.P();
            O o10 = new O();
            o10.f144348a = z(iVar);
            k10.W(1518648398);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var5 = (C4899r0) D10;
            k10.P();
            r(r0Var5, B(bool2, q(r0Var5)));
            P.g(Long.valueOf(iVar.d()), new a(o10, iVar2, (C17164e<? super a>) null), k10, 0);
            k10.W(1518663303);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = new LinkedHashMap();
                k10.u(D11);
            }
            k10.P();
            k10.W(1518667390);
            Object D12 = k10.D();
            Map map3 = (Map) D11;
            if (D12 == aVar.a()) {
                D12 = u1.e(new C12887d(false, false, 3, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);
                k10.u(D12);
            }
            C4899r0 r0Var6 = (C4899r0) D12;
            k10.P();
            k10.W(1518670302);
            Object D13 = k10.D();
            if (D13 == aVar.a()) {
                D13 = u1.e(new C12887d(false, false, 3, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);
                k10.u(D13);
            }
            C4899r0 r0Var7 = (C4899r0) D13;
            k10.P();
            Object D14 = k10.D();
            if (D14 == aVar.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D14 = b10;
            }
            Q a10 = ((B) D14).a();
            o c10 = m.c(0, k10, 0, 1);
            kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
            boolean q11 = q(r0Var5);
            k10.W(1518678749);
            boolean z11 = (i11 & 112) == 32 || ((i11 & 64) != 0 && k10.F(onInteractionsListener2));
            Object D15 = k10.D();
            if (z11 || D15 == aVar.a()) {
                D15 = new G(onInteractionsListener2, r0Var5);
                k10.u(D15);
            }
            k10.P();
            C4899r0 r0Var8 = r0Var7;
            C4899r0 r0Var9 = r0Var6;
            Map map4 = map3;
            Q q12 = a10;
            M0.g a11 = M0.h.a(q11, (C17631a) D15, 0.0f, 0.0f, k10, 0, 12);
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d d10 = M0.e.d(aVar2, a11, false, 2, (Object) null);
            C5437c.a aVar3 = C5437c.f24302a;
            I h10 = C5077h.h(aVar3.o(), false);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, d10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar4.a();
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
            M0.g gVar2 = a11;
            F1.c(a14, h10, aVar4.c());
            F1.c(a14, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b11);
            }
            F1.c(a14, e10, aVar4.d());
            C5079j jVar = C5079j.f18125a;
            androidx.compose.ui.d f10 = m.f(aVar2, c10, false, (s) null, false, 14, (Object) null);
            I a15 = C5080k.a(C5073d.f18068a.g(), aVar3.k(), k10, 0);
            int a16 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, f10);
            C17631a<C4504g> a17 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a17);
            } else {
                k10.t();
            }
            C4889m a18 = F1.a(k10);
            F1.c(a18, a15, aVar4.c());
            F1.c(a18, s11, aVar4.e());
            p<C4504g, Integer, C16807N> b12 = aVar4.b();
            if (a18.i() || !C17542s.e(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.w(Integer.valueOf(a16), b12);
            }
            F1.c(a18, e11, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(1638530668);
            Iterator it2 = ((Iterable) o10.f144348a).iterator();
            while (it2.hasNext()) {
                C12888e eVar = (C12888e) it2.next();
                if (eVar instanceof C12888e.j) {
                    k10.W(-1641834663);
                    k10.W(1609607760);
                    Object D16 = k10.D();
                    if (D16 == C4889m.f14007a.a()) {
                        I i13 = new I(new H());
                        k10.u(i13);
                        D16 = i13;
                    }
                    k10.P();
                    Map map5 = map4;
                    Object computeIfAbsent = map5.computeIfAbsent(eVar, (Function) D16);
                    C17542s.i(computeIfAbsent, "computeIfAbsent(...)");
                    gVar = gVar2;
                    it = it2;
                    oVar = c10;
                    t(hVar, eVar, (C4899r0) computeIfAbsent, (androidx.compose.ui.d) null, c1.c.e(1057486525, true, new b(eVar, onInteractionsListener2, iVar2), k10, 54), k10, 24582, 4);
                    k10.P();
                    r0Var2 = r0Var5;
                    r0Var = r0Var8;
                    r0Var3 = r0Var9;
                    q10 = q12;
                    map = map5;
                } else {
                    it = it2;
                    oVar = c10;
                    Map map6 = map4;
                    gVar = gVar2;
                    if (eVar instanceof C12888e.c) {
                        k10.W(-1641056222);
                        C4899r0 r0Var10 = r0Var8;
                        C4899r0<C12887d> j10 = j(r0Var9, r0Var10, ((C12888e.c) eVar).e());
                        Map map7 = map6;
                        map2 = map7;
                        r0Var4 = r0Var10;
                        r0Var2 = r0Var5;
                        r0Var3 = r0Var9;
                        z10 = true;
                        t(hVar, eVar, j10, (androidx.compose.ui.d) null, c1.c.e(1538288038, true, new c(j10, map7, eVar), k10, 54), k10, 24582, 4);
                        k10.P();
                    } else {
                        r0Var2 = r0Var5;
                        r0Var4 = r0Var8;
                        r0Var3 = r0Var9;
                        map2 = map6;
                        z10 = true;
                        if (eVar instanceof C12888e.a) {
                            k10.W(-1640569274);
                            u(hVar, eVar, (androidx.compose.ui.d) null, false, C12884a.f109851a.a(), k10, 24582, 6);
                            k10.P();
                        } else if (eVar instanceof C12888e.b) {
                            k10.W(-1640373168);
                            u(hVar, eVar, (androidx.compose.ui.d) null, false, C12884a.f109851a.b(), k10, 24582, 6);
                            k10.P();
                        } else {
                            if (eVar instanceof C12888e.d) {
                                k10.W(-1640161221);
                                Map map8 = map2;
                                C4899r0 r0Var11 = r0Var4;
                                r0Var = r0Var11;
                                map = map8;
                                u(hVar, eVar, (androidx.compose.ui.d) null, false, c1.c.e(1903567229, true, new d(iVar2, map8, r0Var3, r0Var11), k10, 54), k10, 24582, 6);
                                k10.P();
                            } else {
                                map = map2;
                                r0Var = r0Var4;
                                if (eVar instanceof C12888e.C2626e) {
                                    k10.W(-1639687882);
                                    u(hVar, eVar, androidx.compose.ui.layout.c.a(androidx.compose.ui.d.f18749a, new J(l10)), false, C12884a.f109851a.c(), k10, 24582, 4);
                                    k10.P();
                                } else if (eVar instanceof C12888e.g) {
                                    k10.W(-1639282061);
                                    Q q13 = q12;
                                    q10 = q13;
                                    u(hVar, eVar, (androidx.compose.ui.d) null, false, c1.c.e(-762031173, true, new e(onInteractionsListener2, q13, oVar, l10), k10, 54), k10, 24582, 6);
                                    k10.P();
                                } else {
                                    q10 = q12;
                                    if (eVar instanceof C12888e.h) {
                                        k10.W(-1638899800);
                                        u(hVar, eVar, (androidx.compose.ui.d) null, false, c1.c.e(-2094830374, true, new f(onInteractionsListener2, q10, oVar, l10), k10, 54), k10, 24582, 6);
                                        k10.P();
                                    } else if (eVar instanceof C12888e.f) {
                                        k10.W(-1638516795);
                                        u(hVar, eVar, (androidx.compose.ui.d) null, false, c1.c.e(867337721, true, new g(onInteractionsListener2), k10, 54), k10, 24582, 6);
                                        k10.P();
                                    } else if (eVar instanceof C12888e.i) {
                                        k10.W(-1638217521);
                                        u(hVar, eVar, (androidx.compose.ui.d) null, iVar.f(), c1.c.e(-465461480, true, new h(onInteractionsListener2), k10, 54), k10, 24582, 2);
                                        k10.P();
                                        r0Var9 = r0Var3;
                                        c10 = oVar;
                                        q12 = q10;
                                        r0Var5 = r0Var2;
                                        map4 = map;
                                        gVar2 = gVar;
                                        r0Var8 = r0Var;
                                        it2 = it;
                                        int i14 = i10;
                                    } else {
                                        k10.W(1609606616);
                                        k10.P();
                                        throw new t();
                                    }
                                }
                            }
                            q10 = q12;
                            r0Var9 = r0Var3;
                            c10 = oVar;
                            q12 = q10;
                            r0Var5 = r0Var2;
                            map4 = map;
                            gVar2 = gVar;
                            r0Var8 = r0Var;
                            it2 = it;
                            int i142 = i10;
                        }
                    }
                    boolean z12 = z10;
                    q10 = q12;
                    map = map2;
                    r0Var = r0Var4;
                    r0Var9 = r0Var3;
                    c10 = oVar;
                    q12 = q10;
                    r0Var5 = r0Var2;
                    map4 = map;
                    gVar2 = gVar;
                    r0Var8 = r0Var;
                    it2 = it;
                    int i1422 = i10;
                }
                r0Var9 = r0Var3;
                c10 = oVar;
                q12 = q10;
                r0Var5 = r0Var2;
                map4 = map;
                gVar2 = gVar;
                r0Var8 = r0Var;
                it2 = it;
                int i14222 = i10;
            }
            k10.P();
            k10.x();
            mVar2 = k10;
            M0.c.d(q(r0Var5), gVar2, jVar.a(androidx.compose.ui.d.f18749a, C5437c.f24302a.m()), 0, 0, false, k10, M0.g.f9115j << 3, 56);
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
            n11.a(new K(iVar2, onInteractionsListener2, bool, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void h(Map<C12888e.j, C4899r0<C12889f>> map, C4899r0<C12887d> r0Var, C4899r0<C12887d> r0Var2, RoomType roomType, C12891h hVar) {
        Boolean bool;
        j(r0Var, r0Var2, hVar).setValue(C12887d.b(j(r0Var, r0Var2, hVar).getValue(), roomType == null, false, 2, (Object) null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((C12888e.j) next.getKey()).o() == hVar) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C12888e.j jVar = (C12888e.j) entry.getKey();
            C4899r0 r0Var3 = (C4899r0) entry.getValue();
            if (roomType == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(jVar.m() == roomType);
            }
            r0Var3.setValue(C12889f.b((C12889f) r0Var3.getValue(), false, false, bool, 3, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void i(Map<C12888e.j, C4899r0<C12889f>> map, boolean z10, C12891h hVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (((C12888e.j) next.getKey()).o() == hVar) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        for (Map.Entry value : linkedHashMap.entrySet()) {
            C4899r0 r0Var = (C4899r0) value.getValue();
            r0Var.setValue(C12889f.b((C12889f) r0Var.getValue(), false, z10, (Boolean) null, 5, (Object) null));
        }
    }

    private static final C4899r0<C12887d> j(C4899r0<C12887d> r0Var, C4899r0<C12887d> r0Var2, C12891h hVar) {
        return hVar == C12891h.Blank ? r0Var : r0Var2;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, C4899r0 r0Var) {
        r(r0Var, true);
        onInteractionsListener.onPullRefresh();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 l(C12888e.j jVar) {
        C17542s.j(jVar, "it");
        return u1.e(new C12889f(jVar.h() < jVar.o().b(), false, (Boolean) null), (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C4899r0 m(C17642l lVar, Object obj) {
        return (C4899r0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final C16807N n(kotlin.jvm.internal.L l10, C4488v vVar) {
        C17542s.j(vVar, "coordinates");
        l10.f144345a = C5667g.n(C4489w.e(vVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C12892i iVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Boolean bool, int i10, C4889m mVar, int i11) {
        g(iVar, onInteractionsListener, bool, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C12892i iVar, GalleryHomeContentAdapter.OnInteractionsListener onInteractionsListener, Boolean bool, int i10, C4889m mVar, int i11) {
        g(iVar, onInteractionsListener, bool, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final boolean q(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void r(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final void s(Q q10, o oVar, kotlin.jvm.internal.L l10, C12888e eVar) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new i(eVar, oVar, l10, (C17164e<? super i>) null), 3, (Object) null);
    }

    private static final void t(C5861g gVar, C12888e eVar, A1<? extends VizState> a12, androidx.compose.ui.d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10, int i11) {
        C4889m mVar2 = mVar;
        int i12 = i10;
        mVar2.W(-1771134747);
        androidx.compose.ui.d dVar2 = (i11 & 4) != 0 ? androidx.compose.ui.d.f18749a : dVar;
        if (C4895p.J()) {
            C4895p.S(-1771134747, i12, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.wrapExpandableItem (ShowroomsGalleryScreen.kt:172)");
        }
        int i13 = (i12 & 14) | 1572864;
        l0.d.e(gVar, ((VizState) a12.getValue()).isVisible(), D.l(dVar2, eVar.d(), eVar.a(), eVar.c(), eVar.b()), androidx.compose.animation.g.m((N) null, (C5437c.C0386c) null, false, (C17642l) null, 15, (Object) null).c(androidx.compose.animation.g.o(new C12885b(0, 1, (DefaultConstructorMarker) null), 0.0f, 2, (Object) null)), androidx.compose.animation.g.q((N) null, 0.0f, 3, (Object) null).c(androidx.compose.animation.g.A(new C12885b(0, 1, (DefaultConstructorMarker) null), (C5437c.C0386c) null, false, (C17642l) null, 14, (Object) null)), (String) null, c1.c.e(245804301, true, new j(pVar), mVar2, 54), mVar, i13, 16);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    private static final void u(C5861g gVar, C12888e eVar, androidx.compose.ui.d dVar, boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10, int i11) {
        mVar.W(645061216);
        if ((i11 & 2) != 0) {
            dVar = androidx.compose.ui.d.f18749a;
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        if (C4895p.J()) {
            C4895p.S(645061216, i10, -1, "com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryScreen.wrapStaticItem (ShowroomsGalleryScreen.kt:199)");
        }
        if (!z10) {
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return;
        }
        androidx.compose.ui.d l10 = D.l(dVar, eVar.d(), eVar.a(), eVar.c(), eVar.b());
        I h10 = C5077h.h(C5437c.f24302a.o(), false);
        int a10 = C4883j.a(mVar, 0);
        C4912y s10 = mVar.s();
        androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, l10);
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
        p<C4504g, Integer, C16807N> b10 = aVar.b();
        if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
            a12.u(Integer.valueOf(a10));
            a12.w(Integer.valueOf(a10), b10);
        }
        F1.c(a12, e10, aVar.d());
        C5079j jVar = C5079j.f18125a;
        pVar.invoke(mVar, Integer.valueOf((i10 >> 12) & 14));
        mVar.x();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: private */
    public static final List<C12888e> z(C12892i iVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12888e.h.f109876f);
        arrayList.add(new C12888e.b("div1"));
        C12890g b10 = iVar.b();
        List<Showroom> list = null;
        List<Showroom> a10 = b10 != null ? b10.a() : null;
        int i10 = 0;
        if (a10 != null) {
            arrayList.add(C12888e.a.f109869f);
            int i11 = 0;
            for (Object next : a10) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C16877v.x();
                }
                arrayList.add(Y.a((Showroom) next, i11, C12891h.Blank));
                i11 = i12;
            }
            if (a10.size() > iVar.b().b().b()) {
                arrayList.add(new C12888e.c(C12891h.Blank));
            }
        }
        arrayList.add(new C12888e.b("div2"));
        C12890g c10 = iVar.c();
        if (c10 != null) {
            list = c10.a();
        }
        if (list != null) {
            arrayList.add(C12888e.C2626e.f109873f);
            arrayList.add(C12888e.d.f109872f);
            for (Object next2 : list) {
                int i13 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                arrayList.add(Y.a((Showroom) next2, i10, C12891h.Furnished));
                i10 = i13;
            }
            if (list.size() > iVar.c().b().b()) {
                arrayList.add(new C12888e.c(C12891h.Furnished));
            }
        }
        arrayList.add(new C12888e.b("div3"));
        arrayList.add(C12888e.g.f109875f);
        arrayList.add(C12888e.i.f109877f);
        arrayList.add(C12888e.f.f109874f);
        return arrayList;
    }
}
