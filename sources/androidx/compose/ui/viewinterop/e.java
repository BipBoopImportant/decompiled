package androidx.compose.ui.viewinterop;

import G1.C4504g;
import G1.G;
import G1.m0;
import U0.C4889m;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.r;
import XH.C16807N;
import XH.C16820k;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C5221y;
import c2.t;
import f1.C5306h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a^\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "update", "a", "(LnI/l;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "onReset", "onRelease", "b", "(LnI/l;Landroidx/compose/ui/d;LnI/l;LnI/l;LnI/l;LU0/m;II)V", "Lkotlin/Function0;", "LG1/G;", "d", "(LnI/l;LU0/m;I)LnI/a;", "LU0/F1;", "", "compositeKeyHash", "Lc2/d;", "density", "Landroidx/lifecycle/y;", "lifecycleOwner", "LP4/f;", "savedStateRegistryOwner", "Lc2/t;", "layoutDirection", "LU0/y;", "compositionLocalMap", "g", "(LU0/m;Landroidx/compose/ui/d;ILc2/d;Landroidx/lifecycle/y;LP4/f;Lc2/t;LU0/y;)V", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "f", "(LG1/G;)Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "LnI/l;", "e", "()LnI/l;", "NoOpUpdate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final C17642l<View, C16807N> f19805a = h.f19823c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Context, T> f19806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f19807d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19808e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f19809f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f19810g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super Context, ? extends T> lVar, androidx.compose.ui.d dVar, C17642l<? super T, C16807N> lVar2, int i10, int i11) {
            super(2);
            this.f19806c = lVar;
            this.f19807d = dVar;
            this.f19808e = lVar2;
            this.f19809f = i10;
            this.f19810g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            e.a(this.f19806c, this.f19807d, this.f19808e, mVar, M0.a(this.f19809f | 1), this.f19810g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Lkotlin/Function1;", "LXH/N;", "it", "a", "(LG1/G;LnI/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements p<G, C17642l<? super T, ? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f19811c = new b();

        b() {
            super(2);
        }

        public final void a(G g10, C17642l<? super T, C16807N> lVar) {
            e.f(g10).setResetBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C17642l) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Lkotlin/Function1;", "LXH/N;", "it", "a", "(LG1/G;LnI/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements p<G, C17642l<? super T, ? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f19812c = new c();

        c() {
            super(2);
        }

        public final void a(G g10, C17642l<? super T, C16807N> lVar) {
            e.f(g10).setUpdateBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C17642l) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Lkotlin/Function1;", "LXH/N;", "it", "a", "(LG1/G;LnI/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements p<G, C17642l<? super T, ? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f19813c = new d();

        d() {
            super(2);
        }

        public final void a(G g10, C17642l<? super T, C16807N> lVar) {
            e.f(g10).setReleaseBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C17642l) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Lkotlin/Function1;", "LXH/N;", "it", "a", "(LG1/G;LnI/l;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.e$e  reason: collision with other inner class name */
    static final class C0310e extends C17544u implements p<G, C17642l<? super T, ? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0310e f19814c = new C0310e();

        C0310e() {
            super(2);
        }

        public final void a(G g10, C17642l<? super T, C16807N> lVar) {
            e.f(g10).setUpdateBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C17642l) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Lkotlin/Function1;", "LXH/N;", "it", "a", "(LG1/G;LnI/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements p<G, C17642l<? super T, ? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f19815c = new f();

        f() {
            super(2);
        }

        public final void a(G g10, C17642l<? super T, C16807N> lVar) {
            e.f(g10).setReleaseBlock(lVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C17642l) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Context, T> f19816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f19817d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19818e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19819f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19820g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f19821h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f19822i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17642l<? super Context, ? extends T> lVar, androidx.compose.ui.d dVar, C17642l<? super T, C16807N> lVar2, C17642l<? super T, C16807N> lVar3, C17642l<? super T, C16807N> lVar4, int i10, int i11) {
            super(2);
            this.f19816c = lVar;
            this.f19817d = dVar;
            this.f19818e = lVar2;
            this.f19819f = lVar3;
            this.f19820g = lVar4;
            this.f19821h = i10;
            this.f19822i = i11;
        }

        public final void a(C4889m mVar, int i10) {
            e.b(this.f19816c, this.f19817d, this.f19818e, this.f19819f, this.f19820g, mVar, M0.a(this.f19821h | 1), this.f19822i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "LXH/N;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<View, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f19823c = new h();

        h() {
            super(1);
        }

        public final void a(View view) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "b", "()LG1/G;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17631a<G> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f19824c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Context, T> f19825d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f19826e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5306h f19827f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f19828g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ View f19829h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Context context, C17642l<? super Context, ? extends T> lVar, r rVar, C5306h hVar, int i10, View view) {
            super(0);
            this.f19824c = context;
            this.f19825d = lVar;
            this.f19826e = rVar;
            this.f19827f = hVar;
            this.f19828g = i10;
            this.f19829h = view;
        }

        /* renamed from: b */
        public final G invoke() {
            Context context = this.f19824c;
            C17642l<Context, T> lVar = this.f19825d;
            r rVar = this.f19826e;
            C5306h hVar = this.f19827f;
            int i10 = this.f19828g;
            View view = this.f19829h;
            C17542s.h(view, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new ViewFactoryHolder(context, lVar, rVar, hVar, i10, (m0) view).getLayoutNode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Landroidx/compose/ui/d;", "it", "LXH/N;", "a", "(LG1/G;Landroidx/compose/ui/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements p<G, androidx.compose.ui.d, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final j f19830c = new j();

        j() {
            super(2);
        }

        public final void a(G g10, androidx.compose.ui.d dVar) {
            e.f(g10).setModifier(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (androidx.compose.ui.d) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Lc2/d;", "it", "LXH/N;", "a", "(LG1/G;Lc2/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends C17544u implements p<G, c2.d, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final k f19831c = new k();

        k() {
            super(2);
        }

        public final void a(G g10, c2.d dVar) {
            e.f(g10).setDensity(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (c2.d) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Landroidx/lifecycle/y;", "it", "LXH/N;", "a", "(LG1/G;Landroidx/lifecycle/y;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements p<G, C5221y, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final l f19832c = new l();

        l() {
            super(2);
        }

        public final void a(G g10, C5221y yVar) {
            e.f(g10).setLifecycleOwner(yVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (C5221y) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "LP4/f;", "it", "LXH/N;", "a", "(LG1/G;LP4/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements p<G, P4.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f19833c = new m();

        m() {
            super(2);
        }

        public final void a(G g10, P4.f fVar) {
            e.f(g10).setSavedStateRegistryOwner(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (P4.f) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LG1/G;", "Lc2/t;", "it", "LXH/N;", "a", "(LG1/G;Lc2/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends C17544u implements p<G, t, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final n f19834c = new n();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f19835a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    c2.t[] r0 = c2.t.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    c2.t r1 = c2.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    c2.t r1 = c2.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f19835a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.n.a.<clinit>():void");
            }
        }

        n() {
            super(2);
        }

        public final void a(G g10, t tVar) {
            ViewFactoryHolder c10 = e.f(g10);
            int i10 = a.f19835a[tVar.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new XH.t();
            }
            c10.setLayoutDirection(i11);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (t) obj2);
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void a(nI.C17642l<? super android.content.Context, ? extends T> r9, androidx.compose.ui.d r10, nI.C17642l<? super T, XH.C16807N> r11, U0.C4889m r12, int r13, int r14) {
        /*
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            U0.m r12 = r12.k(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x000e
            r1 = r13 | 6
            goto L_0x001e
        L_0x000e:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x001d
            boolean r1 = r12.F(r9)
            if (r1 == 0) goto L_0x001a
            r1 = 4
            goto L_0x001b
        L_0x001a:
            r1 = 2
        L_0x001b:
            r1 = r1 | r13
            goto L_0x001e
        L_0x001d:
            r1 = r13
        L_0x001e:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0025
            r1 = r1 | 48
            goto L_0x0035
        L_0x0025:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0035
            boolean r3 = r12.V(r10)
            if (r3 == 0) goto L_0x0032
            r3 = 32
            goto L_0x0034
        L_0x0032:
            r3 = 16
        L_0x0034:
            r1 = r1 | r3
        L_0x0035:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x003c
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x004c
        L_0x003c:
            r4 = r13 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004c
            boolean r4 = r12.F(r11)
            if (r4 == 0) goto L_0x0049
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004b
        L_0x0049:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004b:
            r1 = r1 | r4
        L_0x004c:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x005f
            boolean r4 = r12.l()
            if (r4 != 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            r12.L()
        L_0x005c:
            r3 = r10
            r4 = r11
            goto L_0x0097
        L_0x005f:
            if (r2 == 0) goto L_0x0063
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
        L_0x0063:
            if (r3 == 0) goto L_0x0067
            nI.l<android.view.View, XH.N> r11 = f19805a
        L_0x0067:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0073
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:107)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0073:
            nI.l<android.view.View, XH.N> r4 = f19805a
            r0 = r1 & 14
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            int r1 = r1 << 6
            r1 = r1 & r2
            r7 = r0 | r1
            r8 = 4
            r3 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r6 = r12
            b(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x005c
            U0.C4895p.R()
            goto L_0x005c
        L_0x0097:
            U0.Y0 r10 = r12.n()
            if (r10 == 0) goto L_0x00a9
            androidx.compose.ui.viewinterop.e$a r11 = new androidx.compose.ui.viewinterop.e$a
            r1 = r11
            r2 = r9
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            r10.a(r11)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.a(nI.l, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void b(nI.C17642l<? super android.content.Context, ? extends T> r21, androidx.compose.ui.d r22, nI.C17642l<? super T, XH.C16807N> r23, nI.C17642l<? super T, XH.C16807N> r24, nI.C17642l<? super T, XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r21
            r6 = r27
            r0 = -180024211(0xfffffffff5450c6d, float:-2.497887E32)
            r2 = r26
            U0.m r2 = r2.k(r0)
            r3 = r28 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r6 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r6
            goto L_0x0024
        L_0x0023:
            r3 = r6
        L_0x0024:
            r4 = r28 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r22
            goto L_0x003f
        L_0x002d:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r22
            boolean r7 = r2.V(r5)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r8 = r23
            goto L_0x005a
        L_0x0048:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0045
            r8 = r23
            boolean r9 = r2.F(r8)
            if (r9 == 0) goto L_0x0057
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r9
        L_0x005a:
            r9 = r28 & 8
            if (r9 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r10 = r24
            goto L_0x0075
        L_0x0063:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0060
            r10 = r24
            boolean r11 = r2.F(r10)
            if (r11 == 0) goto L_0x0072
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r11
        L_0x0075:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r12 = r25
            goto L_0x0090
        L_0x007e:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007b
            r12 = r25
            boolean r13 = r2.F(r12)
            if (r13 == 0) goto L_0x008d
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r13
        L_0x0090:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00a5
            boolean r13 = r2.l()
            if (r13 != 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            r2.L()
            r4 = r5
        L_0x00a1:
            r3 = r8
            r5 = r12
            goto L_0x0197
        L_0x00a5:
            if (r4 == 0) goto L_0x00aa
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x00ab
        L_0x00aa:
            r4 = r5
        L_0x00ab:
            if (r7 == 0) goto L_0x00af
            r5 = 0
            r8 = r5
        L_0x00af:
            if (r9 == 0) goto L_0x00b4
            nI.l<android.view.View, XH.N> r5 = f19805a
            r10 = r5
        L_0x00b4:
            if (r11 == 0) goto L_0x00b9
            nI.l<android.view.View, XH.N> r5 = f19805a
            r12 = r5
        L_0x00b9:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00c5
            r5 = -1
            java.lang.String r7 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:211)"
            U0.C4895p.S(r0, r3, r5, r7)
        L_0x00c5:
            r0 = 0
            int r15 = U0.C4883j.a(r2, r0)
            androidx.compose.ui.d r0 = androidx.compose.ui.viewinterop.f.e(r4)
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r2, r0)
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r2.Q(r0)
            r16 = r0
            c2.d r16 = (c2.d) r16
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r0 = r2.Q(r0)
            r19 = r0
            c2.t r19 = (c2.t) r19
            U0.y r20 = r2.s()
            U0.I0 r0 = j3.g.a()
            java.lang.Object r0 = r2.Q(r0)
            r17 = r0
            androidx.lifecycle.y r17 = (androidx.lifecycle.C5221y) r17
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r2.Q(r0)
            r18 = r0
            P4.f r18 = (P4.f) r18
            if (r8 == 0) goto L_0x014d
            r0 = 607871394(0x243b61a2, float:4.063186E-17)
            r2.W(r0)
            r0 = r3 & 14
            nI.a r0 = d(r1, r2, r0)
            U0.f r3 = r2.m()
            boolean r3 = r3 instanceof G1.E0
            if (r3 != 0) goto L_0x011f
            U0.C4883j.c()
        L_0x011f:
            r2.I()
            boolean r3 = r2.i()
            if (r3 == 0) goto L_0x012c
            r2.p(r0)
            goto L_0x012f
        L_0x012c:
            r2.t()
        L_0x012f:
            U0.m r0 = U0.F1.a(r2)
            r13 = r0
            g(r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.viewinterop.e$b r3 = androidx.compose.ui.viewinterop.e.b.f19811c
            U0.F1.c(r0, r8, r3)
            androidx.compose.ui.viewinterop.e$c r3 = androidx.compose.ui.viewinterop.e.c.f19812c
            U0.F1.c(r0, r12, r3)
            androidx.compose.ui.viewinterop.e$d r3 = androidx.compose.ui.viewinterop.e.d.f19813c
            U0.F1.c(r0, r10, r3)
            r2.x()
            r2.P()
            goto L_0x018c
        L_0x014d:
            r0 = 608726777(0x24486ef9, float:4.3462084E-17)
            r2.W(r0)
            r0 = r3 & 14
            nI.a r0 = d(r1, r2, r0)
            U0.f r3 = r2.m()
            boolean r3 = r3 instanceof G1.E0
            if (r3 != 0) goto L_0x0164
            U0.C4883j.c()
        L_0x0164:
            r2.o()
            boolean r3 = r2.i()
            if (r3 == 0) goto L_0x0171
            r2.p(r0)
            goto L_0x0174
        L_0x0171:
            r2.t()
        L_0x0174:
            U0.m r0 = U0.F1.a(r2)
            r13 = r0
            g(r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.viewinterop.e$e r3 = androidx.compose.ui.viewinterop.e.C0310e.f19814c
            U0.F1.c(r0, r12, r3)
            androidx.compose.ui.viewinterop.e$f r3 = androidx.compose.ui.viewinterop.e.f.f19815c
            U0.F1.c(r0, r10, r3)
            r2.x()
            r2.P()
        L_0x018c:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00a1
            U0.C4895p.R()
            goto L_0x00a1
        L_0x0197:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x01ae
            androidx.compose.ui.viewinterop.e$g r9 = new androidx.compose.ui.viewinterop.e$g
            r0 = r9
            r1 = r21
            r2 = r4
            r4 = r10
            r6 = r27
            r7 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.b(nI.l, androidx.compose.ui.d, nI.l, nI.l, nI.l, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: androidx.compose.ui.viewinterop.e$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.compose.ui.viewinterop.e$i} */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        if (r0 == U0.C4889m.f14007a.a()) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T extends android.view.View> nI.C17631a<G1.G> d(nI.C17642l<? super android.content.Context, ? extends T> r9, U0.C4889m r10, int r11) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:266)"
            r2 = 2030558801(0x7907de51, float:4.4091824E34)
            U0.C4895p.S(r2, r11, r0, r1)
        L_0x000f:
            r0 = 0
            int r6 = U0.C4883j.a(r10, r0)
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r1 = r10.Q(r1)
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            U0.r r4 = U0.C4883j.d(r10, r0)
            U0.I0 r1 = f1.C5308j.d()
            java.lang.Object r1 = r10.Q(r1)
            r5 = r1
            f1.h r5 = (f1.C5306h) r5
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r1 = r10.Q(r1)
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            boolean r1 = r10.F(r2)
            r3 = r11 & 14
            r3 = r3 ^ 6
            r8 = 4
            if (r3 <= r8) goto L_0x004a
            boolean r3 = r10.V(r9)
            if (r3 != 0) goto L_0x004e
        L_0x004a:
            r11 = r11 & 6
            if (r11 != r8) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            r11 = r1 | r0
            boolean r0 = r10.F(r4)
            r11 = r11 | r0
            boolean r0 = r10.F(r5)
            r11 = r11 | r0
            boolean r0 = r10.d(r6)
            r11 = r11 | r0
            boolean r0 = r10.F(r7)
            r11 = r11 | r0
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x0073
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x007d
        L_0x0073:
            androidx.compose.ui.viewinterop.e$i r0 = new androidx.compose.ui.viewinterop.e$i
            r1 = r0
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.u(r0)
        L_0x007d:
            nI.a r0 = (nI.C17631a) r0
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x0088
            U0.C4895p.R()
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.d(nI.l, U0.m, int):nI.a");
    }

    public static final C17642l<View, C16807N> e() {
        return f19805a;
    }

    /* access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> f(G g10) {
        AndroidViewHolder V10 = g10.V();
        if (V10 != null) {
            return (ViewFactoryHolder) V10;
        }
        D1.a.c("Required value was null.");
        throw new C16820k();
    }

    private static final <T extends View> void g(C4889m mVar, androidx.compose.ui.d dVar, int i10, c2.d dVar2, C5221y yVar, P4.f fVar, t tVar, C4912y yVar2) {
        C4504g.a aVar = C4504g.f6515W;
        F1.c(mVar, yVar2, aVar.e());
        F1.c(mVar, dVar, j.f19830c);
        F1.c(mVar, dVar2, k.f19831c);
        F1.c(mVar, yVar, l.f19832c);
        F1.c(mVar, fVar, m.f19833c);
        F1.c(mVar, tVar, n.f19834c);
        p<C4504g, Integer, C16807N> b10 = aVar.b();
        if (mVar.i() || !C17542s.e(mVar.D(), Integer.valueOf(i10))) {
            mVar.u(Integer.valueOf(i10));
            mVar.w(Integer.valueOf(i10), b10);
        }
    }
}
