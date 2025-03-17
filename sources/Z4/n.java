package z4;

import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.C4899r0;
import U0.L;
import U0.M;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.activity.C4987b;
import androidx.lifecycle.C5221y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import f1.C5303e;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l0.C5507b;
import m0.C5525D;
import m0.C5548j;
import m0.C5549j0;
import m0.N;
import m0.t0;
import m0.v0;
import m0.y0;
import nI.C17631a;
import nI.C17642l;
import uI.C18055d;
import uI.C18068q;
import x4.C8935A;
import x4.C8948l;
import x4.F;
import x4.y;
import z4.d;
import z4.e;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aã\u0001\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000e0\t2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000e0\t2\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0002\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a2\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001b2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000e0\t2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000e0\t2\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\tH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aÃ\u0001\u0010#\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000e0\t2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u000e0\t2\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\tH\u0007¢\u0006\u0004\b#\u0010$\u001a#\u0010'\u001a\u0004\u0018\u00010\f*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b'\u0010(\u001a#\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010+\u001a\u0004\u0018\u00010\f*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b+\u0010(\u001a#\u0010,\u001a\u0004\u0018\u00010\u000e*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b,\u0010*\u001a#\u0010-\u001a\u0004\u0018\u00010\u0012*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b-\u0010.¨\u00067²\u0006\u0012\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0/8\nX\u0002²\u0006\u000e\u00102\u001a\u0002018\n@\nX\u0002²\u0006\u000e\u00104\u001a\u0002038\n@\nX\u0002²\u0006\u0012\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0/8\nX\u0002²\u0006\u0012\u00106\u001a\b\u0012\u0004\u0012\u00020\u000b0/8\nX\u0002"}, d2 = {"Lx4/A;", "navController", "", "startDestination", "Landroidx/compose/ui/d;", "modifier", "Li1/c;", "contentAlignment", "route", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Lx4/l;", "Landroidx/compose/animation/i;", "enterTransition", "Landroidx/compose/animation/k;", "exitTransition", "popEnterTransition", "popExitTransition", "Ll0/v;", "sizeTransform", "Lx4/y;", "LXH/N;", "builder", "b", "(Lx4/A;Ljava/lang/String;Landroidx/compose/ui/d;Li1/c;Ljava/lang/String;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LU0/m;III)V", "", "LuI/d;", "", "LuI/q;", "Lx4/F;", "typeMap", "a", "(Lx4/A;Ljava/lang/Object;Landroidx/compose/ui/d;Li1/c;LuI/d;Ljava/util/Map;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LU0/m;III)V", "Lx4/x;", "graph", "c", "(Lx4/A;Lx4/x;Landroidx/compose/ui/d;Li1/c;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LU0/m;II)V", "Lx4/v;", "scope", "w", "(Lx4/v;Landroidx/compose/animation/d;)Landroidx/compose/animation/i;", "x", "(Lx4/v;Landroidx/compose/animation/d;)Landroidx/compose/animation/k;", "y", "z", "A", "(Lx4/v;Landroidx/compose/animation/d;)Ll0/v;", "", "currentBackStack", "", "progress", "", "inPredictiveBack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8935A f58261c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f58262d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f58263e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c f58264f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f58265g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58266h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58267i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58268j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58269k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, l0.v> f58270l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l<y, C16807N> f58271m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f58272n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f58273o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f58274p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C8935A a10, String str, androidx.compose.ui.d dVar, C5437c cVar, String str2, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar2, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar3, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar4, C17642l<androidx.compose.animation.d<C8948l>, l0.v> lVar5, C17642l<? super y, C16807N> lVar6, int i10, int i11, int i12) {
            super(2);
            this.f58261c = a10;
            this.f58262d = str;
            this.f58263e = dVar;
            this.f58264f = cVar;
            this.f58265g = str2;
            this.f58266h = lVar;
            this.f58267i = lVar2;
            this.f58268j = lVar3;
            this.f58269k = lVar4;
            this.f58270l = lVar5;
            this.f58271m = lVar6;
            this.f58272n = i10;
            this.f58273o = i11;
            this.f58274p = i12;
        }

        public final void a(C4889m mVar, int i10) {
            n.b(this.f58261c, this.f58262d, this.f58263e, this.f58264f, this.f58265g, this.f58266h, this.f58267i, this.f58268j, this.f58269k, this.f58270l, this.f58271m, mVar, M0.a(this.f58272n | 1), M0.a(this.f58273o), this.f58274p);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f58275c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.i invoke(androidx.compose.animation.d<C8948l> dVar) {
            return androidx.compose.animation.g.o(C5548j.j(700, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f58276c = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.k invoke(androidx.compose.animation.d<C8948l> dVar) {
            return androidx.compose.animation.g.q(C5548j.j(700, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8935A f58277c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f58278d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f58279e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c f58280f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18055d<?> f58281g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Map<C18068q, F<?>> f58282h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58283i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58284j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58285k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58286l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, l0.v> f58287m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C17642l<y, C16807N> f58288n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f58289o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f58290p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f58291q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C8935A a10, Object obj, androidx.compose.ui.d dVar, C5437c cVar, C18055d<?> dVar2, Map<C18068q, F<?>> map, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar2, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar3, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar4, C17642l<androidx.compose.animation.d<C8948l>, l0.v> lVar5, C17642l<? super y, C16807N> lVar6, int i10, int i11, int i12) {
            super(2);
            this.f58277c = a10;
            this.f58278d = obj;
            this.f58279e = dVar;
            this.f58280f = cVar;
            this.f58281g = dVar2;
            this.f58282h = map;
            this.f58283i = lVar;
            this.f58284j = lVar2;
            this.f58285k = lVar3;
            this.f58286l = lVar4;
            this.f58287m = lVar5;
            this.f58288n = lVar6;
            this.f58289o = i10;
            this.f58290p = i11;
            this.f58291q = i12;
        }

        public final void a(C4889m mVar, int i10) {
            n.a(this.f58277c, this.f58278d, this.f58279e, this.f58280f, this.f58281g, this.f58282h, this.f58283i, this.f58284j, this.f58285k, this.f58286l, this.f58287m, this.f58288n, mVar, M0.a(this.f58289o | 1), M0.a(this.f58290p), this.f58291q);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f58292c = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.i invoke(androidx.compose.animation.d<C8948l> dVar) {
            return androidx.compose.animation.g.o(C5548j.j(700, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f58293c = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.k invoke(androidx.compose.animation.d<C8948l> dVar) {
            return androidx.compose.animation.g.q(C5548j.j(700, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/g;", "Landroidx/activity/b;", "backEvent", "LXH/N;", "<anonymous>", "(LTJ/g;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {524}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<C16532g<C4987b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f58294c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f58295d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f58296e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<List<C8948l>> f58297f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4892n0 f58298g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f58299h;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/b;", "it", "LXH/N;", "c", "(Landroidx/activity/b;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1<List<C8948l>> f58300a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f58301b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4892n0 f58302c;

            a(A1<? extends List<C8948l>> a12, C4899r0<Boolean> r0Var, C4892n0 n0Var) {
                this.f58300a = a12;
                this.f58301b = r0Var;
                this.f58302c = n0Var;
            }

            /* renamed from: c */
            public final Object emit(C4987b bVar, C17164e<? super C16807N> eVar) {
                if (n.h(this.f58300a).size() > 1) {
                    n.e(this.f58301b, true);
                    n.j(this.f58302c, bVar.a());
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(e eVar, A1<? extends List<C8948l>> a12, C4892n0 n0Var, C4899r0<Boolean> r0Var, C17164e<? super g> eVar2) {
            super(2, eVar2);
            this.f58296e = eVar;
            this.f58297f = a12;
            this.f58298g = n0Var;
            this.f58299h = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f58296e, this.f58297f, this.f58298g, this.f58299h, eVar);
            gVar.f58295d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(C16532g<C4987b> gVar, C17164e<? super C16807N> eVar) {
            return ((g) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C8948l lVar;
            C8948l lVar2;
            Object f10 = C17187b.f();
            int i10 = this.f58294c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g gVar = (C16532g) this.f58295d;
                if (n.h(this.f58297f).size() > 1) {
                    n.j(this.f58298g, 0.0f);
                    lVar2 = (C8948l) C16877v.K0(n.h(this.f58297f));
                    e eVar = this.f58296e;
                    C17542s.g(lVar2);
                    eVar.p(lVar2);
                    this.f58296e.p((C8948l) n.h(this.f58297f).get(n.h(this.f58297f).size() - 2));
                } else {
                    lVar2 = null;
                }
                a aVar = new a(this.f58297f, this.f58299h, this.f58298g);
                this.f58295d = lVar2;
                this.f58294c = 1;
                if (gVar.collect(aVar, this) == f10) {
                    return f10;
                }
                lVar = lVar2;
            } else if (i10 == 1) {
                lVar = (C8948l) this.f58295d;
                try {
                    XH.y.b(obj);
                } catch (CancellationException unused) {
                    if (n.h(this.f58297f).size() > 1) {
                        n.e(this.f58299h, false);
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (n.h(this.f58297f).size() > 1) {
                n.e(this.f58299h, false);
                e eVar2 = this.f58296e;
                C17542s.g(lVar);
                eVar2.j(lVar, false);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8935A f58303c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5221y f58304d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"z4/n$h$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {
            public void b() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C8935A a10, C5221y yVar) {
            super(1);
            this.f58303c = a10;
            this.f58304d = yVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f58303c.G0(this.f58304d);
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<List<C8948l>> f58305c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f58306d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"z4/n$i$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A1 f58307a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f58308b;

            public a(A1 a12, e eVar) {
                this.f58307a = a12;
                this.f58308b = eVar;
            }

            public void b() {
                for (C8948l o10 : n.g(this.f58307a)) {
                    this.f58308b.o(o10);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(A1<? extends List<C8948l>> a12, e eVar) {
            super(1);
            this.f58305c = a12;
            this.f58306d = eVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f58305c, this.f58306d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {621}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f58309c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5549j0<C8948l> f58310d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<List<C8948l>> f58311e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4892n0 f58312f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C5549j0<C8948l> j0Var, A1<? extends List<C8948l>> a12, C4892n0 n0Var, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f58310d = j0Var;
            this.f58311e = a12;
            this.f58312f = n0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f58310d, this.f58311e, this.f58312f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f58309c;
            if (i10 == 0) {
                XH.y.b(obj);
                C5549j0<C8948l> j0Var = this.f58310d;
                float p10 = n.i(this.f58312f);
                this.f58309c = 1;
                if (j0Var.P(p10, (C8948l) n.h(this.f58311e).get(n.h(this.f58311e).size() - 2), this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", l = {628, 635}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f58313c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f58314d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5549j0<C8948l> f58315e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8948l f58316f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v0<C8948l> f58317g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "<anonymous parameter 1>", "LXH/N;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements nI.p<Float, Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Q f58318c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5549j0<C8948l> f58319d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C8948l f58320e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {643, 647}, m = "invokeSuspend")
            /* renamed from: z4.n$k$a$a  reason: collision with other inner class name */
            static final class C0950a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f58321c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ float f58322d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C5549j0<C8948l> f58323e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C8948l f58324f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0950a(float f10, C5549j0<C8948l> j0Var, C8948l lVar, C17164e<? super C0950a> eVar) {
                    super(2, eVar);
                    this.f58322d = f10;
                    this.f58323e = j0Var;
                    this.f58324f = lVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0950a(this.f58322d, this.f58323e, this.f58324f, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0950a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f58321c;
                    if (i10 == 0) {
                        XH.y.b(obj);
                        float f11 = this.f58322d;
                        if (f11 > 0.0f) {
                            C5549j0<C8948l> j0Var = this.f58323e;
                            this.f58321c = 1;
                            if (C5549j0.Q(j0Var, f11, (Object) null, this, 2, (Object) null) == f10) {
                                return f10;
                            }
                        }
                    } else if (i10 == 1) {
                        XH.y.b(obj);
                    } else if (i10 == 2) {
                        XH.y.b(obj);
                        return C16807N.f139792a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (this.f58322d == 0.0f) {
                        C5549j0<C8948l> j0Var2 = this.f58323e;
                        C8948l lVar = this.f58324f;
                        this.f58321c = 2;
                        if (j0Var2.X(lVar, this) == f10) {
                            return f10;
                        }
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Q q10, C5549j0<C8948l> j0Var, C8948l lVar) {
                super(2);
                this.f58318c = q10;
                this.f58319d = j0Var;
                this.f58320e = lVar;
            }

            public final void a(float f10, float f11) {
                F0 unused = C16314k.d(this.f58318c, (C17168i) null, (T) null, new C0950a(f10, this.f58319d, this.f58320e, (C17164e<? super C0950a>) null), 3, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C5549j0<C8948l> j0Var, C8948l lVar, v0<C8948l> v0Var, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f58315e = j0Var;
            this.f58316f = lVar;
            this.f58317g = v0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f58315e, this.f58316f, this.f58317g, eVar);
            kVar.f58314d = obj;
            return kVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f58313c;
            if (i10 == 0) {
                XH.y.b(obj);
                Q q10 = (Q) this.f58314d;
                if (!C17542s.e(this.f58315e.a(), this.f58316f)) {
                    C5549j0<C8948l> j0Var = this.f58315e;
                    C8948l lVar = this.f58316f;
                    this.f58313c = 1;
                    if (C5549j0.C(j0Var, lVar, (N) null, this, 2, (Object) null) == f10) {
                        return f10;
                    }
                } else {
                    long q11 = this.f58317g.q() / ((long) 1000000);
                    float I10 = this.f58315e.I();
                    y0 j10 = C5548j.j((int) (this.f58315e.I() * ((float) q11)), 0, (C5525D) null, 6, (Object) null);
                    a aVar = new a(q10, this.f58315e, this.f58316f);
                    this.f58313c = 2;
                    if (t0.e(I10, 0.0f, 0.0f, j10, aVar, this, 4, (Object) null) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Lx4/l;", "Ll0/i;", "a", "(Landroidx/compose/animation/d;)Ll0/i;"}, k = 3, mv = {1, 8, 0})
    static final class l extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, l0.i> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map<String, Float> f58325c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f58326d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58327e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58328f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, l0.v> f58329g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ A1<List<C8948l>> f58330h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f58331i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Map<String, Float> map, e eVar, C17642l<? super androidx.compose.animation.d<C8948l>, ? extends androidx.compose.animation.i> lVar, C17642l<? super androidx.compose.animation.d<C8948l>, ? extends androidx.compose.animation.k> lVar2, C17642l<? super androidx.compose.animation.d<C8948l>, ? extends l0.v> lVar3, A1<? extends List<C8948l>> a12, C4899r0<Boolean> r0Var) {
            super(1);
            this.f58325c = map;
            this.f58326d = eVar;
            this.f58327e = lVar;
            this.f58328f = lVar2;
            this.f58329g = lVar3;
            this.f58330h = a12;
            this.f58331i = r0Var;
        }

        /* renamed from: a */
        public final l0.i invoke(androidx.compose.animation.d<C8948l> dVar) {
            float f10;
            if (!n.g(this.f58330h).contains(dVar.g())) {
                return androidx.compose.animation.a.e(androidx.compose.animation.i.f17449a.a(), androidx.compose.animation.k.f17452a.a());
            }
            Float f11 = this.f58325c.get(dVar.g().f());
            if (f11 != null) {
                f10 = f11.floatValue();
            } else {
                this.f58325c.put(dVar.g().f(), Float.valueOf(0.0f));
                f10 = 0.0f;
            }
            if (!C17542s.e(dVar.a().f(), dVar.g().f())) {
                f10 = (this.f58326d.n().getValue().booleanValue() || n.d(this.f58331i)) ? f10 - 1.0f : f10 + 1.0f;
            }
            this.f58325c.put(dVar.a().f(), Float.valueOf(f10));
            return new l0.i(this.f58327e.invoke(dVar), this.f58328f.invoke(dVar), f10, this.f58329g.invoke(dVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/l;", "it", "", "a", "(Lx4/l;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17642l<C8948l, Object> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f58332c = new m();

        m() {
            super(1);
        }

        /* renamed from: a */
        public final Object invoke(C8948l lVar) {
            return lVar.f();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll0/b;", "Lx4/l;", "it", "LXH/N;", "a", "(Ll0/b;Lx4/l;LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: z4.n$n  reason: collision with other inner class name */
    static final class C0951n extends C17544u implements nI.r<C5507b, C8948l, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5549j0<C8948l> f58333c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8948l f58334d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5303e f58335e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f58336f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<List<C8948l>> f58337g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: z4.n$n$a */
        static final class a extends C17544u implements nI.p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C8948l f58338c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5507b f58339d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C8948l lVar, C5507b bVar) {
                super(2);
                this.f58338c = lVar;
                this.f58339d = bVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1263531443, i10, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:703)");
                    }
                    x4.v e10 = this.f58338c.e();
                    C17542s.h(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((e.b) e10).R().l(this.f58339d, this.f58338c, mVar, 0);
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
        C0951n(C5549j0<C8948l> j0Var, C8948l lVar, C5303e eVar, C4899r0<Boolean> r0Var, A1<? extends List<C8948l>> a12) {
            super(4);
            this.f58333c = j0Var;
            this.f58334d = lVar;
            this.f58335e = eVar;
            this.f58336f = r0Var;
            this.f58337g = a12;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: x4.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(l0.C5507b r4, x4.C8948l r5, U0.C4889m r6, int r7) {
            /*
                r3 = this;
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x000f
                r0 = -1
                java.lang.String r1 = "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:689)"
                r2 = 820763100(0x30ebd9dc, float:1.716042E-9)
                U0.C4895p.S(r2, r7, r0, r1)
            L_0x000f:
                m0.j0<x4.l> r7 = r3.f58333c
                java.lang.Object r7 = r7.a()
                x4.l r0 = r3.f58334d
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r0)
                U0.r0<java.lang.Boolean> r0 = r3.f58336f
                boolean r0 = z4.n.d(r0)
                if (r0 != 0) goto L_0x004c
                if (r7 == 0) goto L_0x0026
                goto L_0x004c
            L_0x0026:
                U0.A1<java.util.List<x4.l>> r7 = r3.f58337g
                java.util.List r7 = z4.n.g(r7)
                int r0 = r7.size()
                java.util.ListIterator r7 = r7.listIterator(r0)
            L_0x0034:
                boolean r0 = r7.hasPrevious()
                if (r0 == 0) goto L_0x0048
                java.lang.Object r0 = r7.previous()
                r1 = r0
                x4.l r1 = (x4.C8948l) r1
                boolean r1 = kotlin.jvm.internal.C17542s.e(r5, r1)
                if (r1 == 0) goto L_0x0034
                goto L_0x0049
            L_0x0048:
                r0 = 0
            L_0x0049:
                r5 = r0
                x4.l r5 = (x4.C8948l) r5
            L_0x004c:
                if (r5 != 0) goto L_0x004f
                goto L_0x0065
            L_0x004f:
                f1.e r7 = r3.f58335e
                z4.n$n$a r0 = new z4.n$n$a
                r0.<init>(r5, r4)
                r4 = 54
                r1 = -1263531443(0xffffffffb4b00a4d, float:-3.279005E-7)
                r2 = 1
                c1.a r4 = c1.c.e(r1, r2, r0, r6, r4)
                r0 = 384(0x180, float:5.38E-43)
                z4.k.a(r5, r7, r4, r6, r0)
            L_0x0065:
                boolean r4 = U0.C4895p.J()
                if (r4 == 0) goto L_0x006e
                U0.C4895p.R()
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.n.C0951n.a(l0.b, x4.l, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5507b) obj, (C8948l) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", l = {}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f58340c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0<C8948l> f58341d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8935A f58342e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Map<String, Float> f58343f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<List<C8948l>> f58344g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f58345h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(v0<C8948l> v0Var, C8935A a10, Map<String, Float> map, A1<? extends List<C8948l>> a12, e eVar, C17164e<? super o> eVar2) {
            super(2, eVar2);
            this.f58341d = v0Var;
            this.f58342e = a10;
            this.f58343f = map;
            this.f58344g = a12;
            this.f58345h = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f58341d, this.f58342e, this.f58343f, this.f58344g, this.f58345h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f58340c == 0) {
                XH.y.b(obj);
                if (C17542s.e(this.f58341d.i(), this.f58341d.p()) && (this.f58342e.H() == null || C17542s.e(this.f58341d.p(), this.f58342e.H()))) {
                    e eVar = this.f58345h;
                    for (C8948l o10 : n.g(this.f58344g)) {
                        eVar.o(o10);
                    }
                    Map<String, Float> map = this.f58343f;
                    v0<C8948l> v0Var = this.f58341d;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry next : map.entrySet()) {
                        if (!C17542s.e(next.getKey(), v0Var.p().f())) {
                            linkedHashMap.put(next.getKey(), next.getValue());
                        }
                    }
                    Map<String, Float> map2 = this.f58343f;
                    for (Map.Entry key : linkedHashMap.entrySet()) {
                        map2.remove(key.getKey());
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class p extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8935A f58346c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x4.x f58347d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f58348e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c f58349f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58350g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58351h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58352i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58353j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, l0.v> f58354k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f58355l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f58356m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(C8935A a10, x4.x xVar, androidx.compose.ui.d dVar, C5437c cVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar2, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar3, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar4, C17642l<androidx.compose.animation.d<C8948l>, l0.v> lVar5, int i10, int i11) {
            super(2);
            this.f58346c = a10;
            this.f58347d = xVar;
            this.f58348e = dVar;
            this.f58349f = cVar;
            this.f58350g = lVar;
            this.f58351h = lVar2;
            this.f58352i = lVar3;
            this.f58353j = lVar4;
            this.f58354k = lVar5;
            this.f58355l = i10;
            this.f58356m = i11;
        }

        public final void a(C4889m mVar, int i10) {
            n.c(this.f58346c, this.f58347d, this.f58348e, this.f58349f, this.f58350g, this.f58351h, this.f58352i, this.f58353j, this.f58354k, mVar, M0.a(this.f58355l | 1), this.f58356m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> {

        /* renamed from: c  reason: collision with root package name */
        public static final q f58357c = new q();

        q() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.i invoke(androidx.compose.animation.d<C8948l> dVar) {
            return androidx.compose.animation.g.o(C5548j.j(700, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> {

        /* renamed from: c  reason: collision with root package name */
        public static final r f58358c = new r();

        r() {
            super(1);
        }

        /* renamed from: a */
        public final androidx.compose.animation.k invoke(androidx.compose.animation.d<C8948l> dVar) {
            return androidx.compose.animation.g.q(C5548j.j(700, 0, (C5525D) null, 6, (Object) null), 0.0f, 2, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8935A f58359c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x4.x f58360d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f58361e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c f58362f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58363g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58364h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58365i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58366j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, l0.v> f58367k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f58368l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f58369m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(C8935A a10, x4.x xVar, androidx.compose.ui.d dVar, C5437c cVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar2, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar3, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar4, C17642l<androidx.compose.animation.d<C8948l>, l0.v> lVar5, int i10, int i11) {
            super(2);
            this.f58359c = a10;
            this.f58360d = xVar;
            this.f58361e = dVar;
            this.f58362f = cVar;
            this.f58363g = lVar;
            this.f58364h = lVar2;
            this.f58365i = lVar3;
            this.f58366j = lVar4;
            this.f58367k = lVar5;
            this.f58368l = i10;
            this.f58369m = i11;
        }

        public final void a(C4889m mVar, int i10) {
            n.c(this.f58359c, this.f58360d, this.f58361e, this.f58362f, this.f58363g, this.f58364h, this.f58365i, this.f58366j, this.f58367k, mVar, M0.a(this.f58368l | 1), this.f58369m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class t extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8935A f58370c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x4.x f58371d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f58372e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5437c f58373f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58374g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58375h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58376i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58377j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, l0.v> f58378k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f58379l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f58380m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(C8935A a10, x4.x xVar, androidx.compose.ui.d dVar, C5437c cVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar2, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar3, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar4, C17642l<androidx.compose.animation.d<C8948l>, l0.v> lVar5, int i10, int i11) {
            super(2);
            this.f58370c = a10;
            this.f58371d = xVar;
            this.f58372e = dVar;
            this.f58373f = cVar;
            this.f58374g = lVar;
            this.f58375h = lVar2;
            this.f58376i = lVar3;
            this.f58377j = lVar4;
            this.f58378k = lVar5;
            this.f58379l = i10;
            this.f58380m = i11;
        }

        public final void a(C4889m mVar, int i10) {
            n.c(this.f58370c, this.f58371d, this.f58372e, this.f58373f, this.f58374g, this.f58375h, this.f58376i, this.f58377j, this.f58378k, mVar, M0.a(this.f58379l | 1), this.f58380m);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Lx4/l;", "Landroidx/compose/animation/i;", "a", "(Landroidx/compose/animation/d;)Landroidx/compose/animation/i;"}, k = 3, mv = {1, 8, 0})
    static final class u extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f58381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58382d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> f58383e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f58384f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(e eVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> lVar2, C4899r0<Boolean> r0Var) {
            super(1);
            this.f58381c = eVar;
            this.f58382d = lVar;
            this.f58383e = lVar2;
            this.f58384f = r0Var;
        }

        /* renamed from: a */
        public final androidx.compose.animation.i invoke(androidx.compose.animation.d<C8948l> dVar) {
            x4.v e10 = dVar.a().e();
            C17542s.h(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            e.b bVar = (e.b) e10;
            androidx.compose.animation.i iVar = null;
            if (this.f58381c.n().getValue().booleanValue() || n.d(this.f58384f)) {
                Iterator<x4.v> it = x4.v.f57671k.c(bVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        androidx.compose.animation.i t10 = n.y(it.next(), dVar);
                        if (t10 != null) {
                            iVar = t10;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                return iVar == null ? this.f58382d.invoke(dVar) : iVar;
            }
            Iterator<x4.v> it2 = x4.v.f57671k.c(bVar).iterator();
            while (true) {
                if (it2.hasNext()) {
                    androidx.compose.animation.i r10 = n.w(it2.next(), dVar);
                    if (r10 != null) {
                        iVar = r10;
                        break;
                    }
                } else {
                    break;
                }
            }
            return iVar == null ? this.f58383e.invoke(dVar) : iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Lx4/l;", "Landroidx/compose/animation/k;", "a", "(Landroidx/compose/animation/d;)Landroidx/compose/animation/k;"}, k = 3, mv = {1, 8, 0})
    static final class v extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f58385c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58386d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> f58387e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f58388f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(e eVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar, C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> lVar2, C4899r0<Boolean> r0Var) {
            super(1);
            this.f58385c = eVar;
            this.f58386d = lVar;
            this.f58387e = lVar2;
            this.f58388f = r0Var;
        }

        /* renamed from: a */
        public final androidx.compose.animation.k invoke(androidx.compose.animation.d<C8948l> dVar) {
            x4.v e10 = dVar.g().e();
            C17542s.h(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            e.b bVar = (e.b) e10;
            androidx.compose.animation.k kVar = null;
            if (this.f58385c.n().getValue().booleanValue() || n.d(this.f58388f)) {
                Iterator<x4.v> it = x4.v.f57671k.c(bVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        androidx.compose.animation.k u10 = n.z(it.next(), dVar);
                        if (u10 != null) {
                            kVar = u10;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                return kVar == null ? this.f58386d.invoke(dVar) : kVar;
            }
            Iterator<x4.v> it2 = x4.v.f57671k.c(bVar).iterator();
            while (true) {
                if (it2.hasNext()) {
                    androidx.compose.animation.k s10 = n.x(it2.next(), dVar);
                    if (s10 != null) {
                        kVar = s10;
                        break;
                    }
                } else {
                    break;
                }
            }
            return kVar == null ? this.f58387e.invoke(dVar) : kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/d;", "Lx4/l;", "Ll0/v;", "a", "(Landroidx/compose/animation/d;)Ll0/v;"}, k = 3, mv = {1, 8, 0})
    static final class w extends C17544u implements C17642l<androidx.compose.animation.d<C8948l>, l0.v> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.animation.d<C8948l>, l0.v> f58389c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(C17642l<androidx.compose.animation.d<C8948l>, l0.v> lVar) {
            super(1);
            this.f58389c = lVar;
        }

        /* renamed from: a */
        public final l0.v invoke(androidx.compose.animation.d<C8948l> dVar) {
            l0.v vVar;
            x4.v e10 = dVar.a().e();
            C17542s.h(e10, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            Iterator<x4.v> it = x4.v.f57671k.c((e.b) e10).iterator();
            while (true) {
                if (!it.hasNext()) {
                    vVar = null;
                    break;
                }
                vVar = n.A(it.next(), dVar);
                if (vVar != null) {
                    break;
                }
            }
            if (vVar != null) {
                return vVar;
            }
            C17642l<androidx.compose.animation.d<C8948l>, l0.v> lVar = this.f58389c;
            if (lVar != null) {
                return lVar.invoke(dVar);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lx4/l;", "b", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class x extends C17544u implements C17631a<List<? extends C8948l>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<List<C8948l>> f58390c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(A1<? extends List<C8948l>> a12) {
            super(0);
            this.f58390c = a12;
        }

        /* renamed from: b */
        public final List<C8948l> invoke() {
            ArrayList arrayList = new ArrayList();
            for (Object next : n.f(this.f58390c)) {
                if (C17542s.e(((C8948l) next).e().A(), "composable")) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: private */
    public static final l0.v A(x4.v vVar, androidx.compose.animation.d<C8948l> dVar) {
        C17642l<androidx.compose.animation.d<C8948l>, l0.v> s02;
        if (vVar instanceof e.b) {
            C17642l<androidx.compose.animation.d<C8948l>, l0.v> W10 = ((e.b) vVar).W();
            if (W10 != null) {
                return W10.invoke(dVar);
            }
            return null;
        } else if (!(vVar instanceof d.a) || (s02 = ((d.a) vVar).s0()) == null) {
            return null;
        } else {
            return s02.invoke(dVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: x4.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(x4.C8935A r30, java.lang.Object r31, androidx.compose.ui.d r32, i1.C5437c r33, uI.C18055d<?> r34, java.util.Map<uI.C18068q, x4.F<?>> r35, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.i> r36, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.k> r37, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.i> r38, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.k> r39, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, l0.v> r40, nI.C17642l<? super x4.y, XH.C16807N> r41, U0.C4889m r42, int r43, int r44, int r45) {
        /*
            r2 = r31
            r12 = r41
            r13 = r43
            r15 = r45
            r0 = -1476019057(0xffffffffa805bc8f, float:-7.42387E-15)
            r1 = r42
            U0.m r1 = r1.k(r0)
            r3 = r15 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r13 | 6
            r6 = r3
            r3 = r30
            goto L_0x002f
        L_0x001b:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r30
            boolean r6 = r1.F(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r13
            goto L_0x002f
        L_0x002c:
            r3 = r30
            r6 = r13
        L_0x002f:
            r7 = r15 & 2
            if (r7 == 0) goto L_0x0036
            r6 = r6 | 48
            goto L_0x0046
        L_0x0036:
            r7 = r13 & 48
            if (r7 != 0) goto L_0x0046
            boolean r7 = r1.F(r2)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r15 & 4
            if (r7 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r32
            goto L_0x0061
        L_0x004f:
            r10 = r13 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r32
            boolean r11 = r1.V(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r11
        L_0x0061:
            r11 = r15 & 8
            if (r11 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r14 = r33
            goto L_0x007d
        L_0x006a:
            r14 = r13 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0067
            r14 = r33
            boolean r16 = r1.V(r14)
            if (r16 == 0) goto L_0x0079
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r16
        L_0x007d:
            r16 = r15 & 16
            if (r16 == 0) goto L_0x0086
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r4 = r34
            goto L_0x0099
        L_0x0086:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0083
            r4 = r34
            boolean r17 = r1.F(r4)
            if (r17 == 0) goto L_0x0095
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r6 = r6 | r17
        L_0x0099:
            r17 = r15 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a4
            r6 = r6 | r18
            r5 = r35
            goto L_0x00b7
        L_0x00a4:
            r18 = r13 & r18
            r5 = r35
            if (r18 != 0) goto L_0x00b7
            boolean r19 = r1.F(r5)
            if (r19 == 0) goto L_0x00b3
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r6 = r6 | r19
        L_0x00b7:
            r19 = r15 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c2
            r6 = r6 | r20
            r8 = r36
            goto L_0x00d5
        L_0x00c2:
            r20 = r13 & r20
            r8 = r36
            if (r20 != 0) goto L_0x00d5
            boolean r21 = r1.F(r8)
            if (r21 == 0) goto L_0x00d1
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r6 = r6 | r21
        L_0x00d5:
            r9 = r15 & 128(0x80, float:1.794E-43)
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00e0
            r6 = r6 | r22
            r0 = r37
            goto L_0x00f3
        L_0x00e0:
            r22 = r13 & r22
            r0 = r37
            if (r22 != 0) goto L_0x00f3
            boolean r23 = r1.F(r0)
            if (r23 == 0) goto L_0x00ef
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r6 = r6 | r23
        L_0x00f3:
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x010f
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0108
            r0 = r38
            boolean r23 = r1.F(r0)
            if (r23 == 0) goto L_0x010a
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010c
        L_0x0108:
            r0 = r38
        L_0x010a:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010c:
            r6 = r6 | r23
            goto L_0x0111
        L_0x010f:
            r0 = r38
        L_0x0111:
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r23 = r13 & r23
            if (r23 != 0) goto L_0x012d
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0126
            r0 = r39
            boolean r23 = r1.F(r0)
            if (r23 == 0) goto L_0x0128
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012a
        L_0x0126:
            r0 = r39
        L_0x0128:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012a:
            r6 = r6 | r23
            goto L_0x012f
        L_0x012d:
            r0 = r39
        L_0x012f:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0138
            r18 = r44 | 6
            r3 = r40
            goto L_0x014e
        L_0x0138:
            r23 = r44 & 6
            r3 = r40
            if (r23 != 0) goto L_0x014c
            boolean r23 = r1.F(r3)
            if (r23 == 0) goto L_0x0147
            r18 = 4
            goto L_0x0149
        L_0x0147:
            r18 = 2
        L_0x0149:
            r18 = r44 | r18
            goto L_0x014e
        L_0x014c:
            r18 = r44
        L_0x014e:
            r3 = r15 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0157
            r18 = r18 | 48
        L_0x0154:
            r3 = r18
            goto L_0x0169
        L_0x0157:
            r3 = r44 & 48
            if (r3 != 0) goto L_0x0154
            boolean r3 = r1.F(r12)
            if (r3 == 0) goto L_0x0164
            r20 = 32
            goto L_0x0166
        L_0x0164:
            r20 = 16
        L_0x0166:
            r18 = r18 | r20
            goto L_0x0154
        L_0x0169:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r6 & r18
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x0194
            r4 = r3 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0194
            boolean r4 = r1.l()
            if (r4 != 0) goto L_0x0180
            goto L_0x0194
        L_0x0180:
            r1.L()
            r5 = r34
            r6 = r35
            r9 = r38
            r11 = r40
            r7 = r8
            r3 = r10
            r4 = r14
            r8 = r37
            r10 = r39
            goto L_0x02a5
        L_0x0194:
            r1.G()
            r4 = r13 & 1
            r5 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r4 == 0) goto L_0x01c6
            boolean r4 = r1.O()
            if (r4 == 0) goto L_0x01a8
            goto L_0x01c6
        L_0x01a8:
            r1.L()
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01b1
            r6 = r6 & r18
        L_0x01b1:
            r0 = r15 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01b6
            r6 = r6 & r5
        L_0x01b6:
            r11 = r34
            r9 = r37
            r4 = r39
            r0 = r40
            r5 = r6
            r7 = r14
            r14 = r35
            r6 = r38
            goto L_0x0214
        L_0x01c6:
            if (r7 == 0) goto L_0x01cb
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x01cc
        L_0x01cb:
            r4 = r10
        L_0x01cc:
            if (r11 == 0) goto L_0x01d5
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c r7 = r7.o()
            goto L_0x01d6
        L_0x01d5:
            r7 = r14
        L_0x01d6:
            if (r16 == 0) goto L_0x01da
            r11 = 0
            goto L_0x01dc
        L_0x01da:
            r11 = r34
        L_0x01dc:
            if (r17 == 0) goto L_0x01e3
            java.util.Map r14 = YH.X.j()
            goto L_0x01e5
        L_0x01e3:
            r14 = r35
        L_0x01e5:
            if (r19 == 0) goto L_0x01e9
            z4.n$b r8 = z4.n.b.f58275c
        L_0x01e9:
            if (r9 == 0) goto L_0x01ee
            z4.n$c r9 = z4.n.c.f58276c
            goto L_0x01f0
        L_0x01ee:
            r9 = r37
        L_0x01f0:
            r10 = r15 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x01f9
            r6 = r6 & r18
            r10 = r6
            r6 = r8
            goto L_0x01fc
        L_0x01f9:
            r10 = r6
            r6 = r38
        L_0x01fc:
            r42 = r4
            r4 = r15 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0207
            r4 = r10 & r5
            r10 = r4
            r4 = r9
            goto L_0x0209
        L_0x0207:
            r4 = r39
        L_0x0209:
            if (r0 == 0) goto L_0x0210
            r5 = r10
            r0 = 0
        L_0x020d:
            r10 = r42
            goto L_0x0214
        L_0x0210:
            r0 = r40
            r5 = r10
            goto L_0x020d
        L_0x0214:
            r1.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x0225
            java.lang.String r13 = "androidx.navigation.compose.NavHost (NavHost.kt:354)"
            r15 = -1476019057(0xffffffffa805bc8f, float:-7.42387E-15)
            U0.C4895p.S(r15, r5, r3, r13)
        L_0x0225:
            boolean r13 = r1.V(r11)
            boolean r15 = r1.V(r2)
            r13 = r13 | r15
            r15 = r3 & 112(0x70, float:1.57E-43)
            r32 = r0
            r0 = 32
            if (r15 != r0) goto L_0x0238
            r0 = 1
            goto L_0x0239
        L_0x0238:
            r0 = 0
        L_0x0239:
            r0 = r0 | r13
            java.lang.Object r13 = r1.D()
            if (r0 != 0) goto L_0x0248
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r13 != r0) goto L_0x025b
        L_0x0248:
            x4.J r0 = r30.O()
            x4.y r13 = new x4.y
            r13.<init>((x4.J) r0, (java.lang.Object) r2, (uI.C18055d<?>) r11, (java.util.Map<uI.C18068q, x4.F<?>>) r14)
            r12.invoke(r13)
            x4.x r13 = r13.c()
            r1.u(r13)
        L_0x025b:
            r17 = r13
            x4.x r17 = (x4.x) r17
            r0 = r5 & 8078(0x1f8e, float:1.132E-41)
            int r5 = r5 >> 6
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r5
            r0 = r0 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r13
            r0 = r0 | r5
            int r3 = r3 << 24
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r26 = r0 | r3
            r27 = 0
            r16 = r30
            r18 = r10
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r6
            r23 = r4
            r24 = r32
            r25 = r1
            c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x029b
            U0.C4895p.R()
        L_0x029b:
            r3 = r10
            r5 = r11
            r11 = r32
            r10 = r4
            r4 = r7
            r7 = r8
            r8 = r9
            r9 = r6
            r6 = r14
        L_0x02a5:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x02c8
            z4.n$d r14 = new z4.n$d
            r0 = r14
            r1 = r30
            r2 = r31
            r12 = r41
            r13 = r43
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.n.a(x4.A, java.lang.Object, androidx.compose.ui.d, i1.c, uI.d, java.util.Map, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, U0.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: x4.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(x4.C8935A r29, java.lang.String r30, androidx.compose.ui.d r31, i1.C5437c r32, java.lang.String r33, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.i> r34, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.k> r35, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.i> r36, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.k> r37, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, l0.v> r38, nI.C17642l<? super x4.y, XH.C16807N> r39, U0.C4889m r40, int r41, int r42, int r43) {
        /*
            r2 = r30
            r11 = r39
            r12 = r41
            r14 = r43
            r0 = 1840250294(0x6daffdb6, float:6.8083243E27)
            r1 = r40
            U0.m r1 = r1.k(r0)
            r3 = r14 & 1
            if (r3 == 0) goto L_0x001b
            r3 = r12 | 6
            r6 = r3
            r3 = r29
            goto L_0x002f
        L_0x001b:
            r3 = r12 & 6
            if (r3 != 0) goto L_0x002c
            r3 = r29
            boolean r6 = r1.F(r3)
            if (r6 == 0) goto L_0x0029
            r6 = 4
            goto L_0x002a
        L_0x0029:
            r6 = 2
        L_0x002a:
            r6 = r6 | r12
            goto L_0x002f
        L_0x002c:
            r3 = r29
            r6 = r12
        L_0x002f:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x0036
            r6 = r6 | 48
            goto L_0x0046
        L_0x0036:
            r7 = r12 & 48
            if (r7 != 0) goto L_0x0046
            boolean r7 = r1.V(r2)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r6 = r6 | r7
        L_0x0046:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r31
            goto L_0x0061
        L_0x004f:
            r9 = r12 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004c
            r9 = r31
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r10
        L_0x0061:
            r10 = r14 & 8
            if (r10 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r13 = r32
            goto L_0x007c
        L_0x006a:
            r13 = r12 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0067
            r13 = r32
            boolean r15 = r1.V(r13)
            if (r15 == 0) goto L_0x0079
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r15
        L_0x007c:
            r15 = r14 & 16
            if (r15 == 0) goto L_0x0085
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r8 = r33
            goto L_0x0098
        L_0x0085:
            r8 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0082
            r8 = r33
            boolean r17 = r1.V(r8)
            if (r17 == 0) goto L_0x0094
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r6 = r6 | r17
        L_0x0098:
            r17 = r14 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a3
            r6 = r6 | r18
            r5 = r34
            goto L_0x00b6
        L_0x00a3:
            r18 = r12 & r18
            r5 = r34
            if (r18 != 0) goto L_0x00b6
            boolean r19 = r1.F(r5)
            if (r19 == 0) goto L_0x00b2
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r6 = r6 | r19
        L_0x00b6:
            r19 = r14 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c1
            r6 = r6 | r20
            r0 = r35
            goto L_0x00d4
        L_0x00c1:
            r20 = r12 & r20
            r0 = r35
            if (r20 != 0) goto L_0x00d4
            boolean r21 = r1.F(r0)
            if (r21 == 0) goto L_0x00d0
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d2
        L_0x00d0:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d2:
            r6 = r6 | r21
        L_0x00d4:
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r21 = r12 & r21
            if (r21 != 0) goto L_0x00f0
            r4 = r14 & 128(0x80, float:1.794E-43)
            if (r4 != 0) goto L_0x00e9
            r4 = r36
            boolean r22 = r1.F(r4)
            if (r22 == 0) goto L_0x00eb
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00e9:
            r4 = r36
        L_0x00eb:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r6 = r6 | r22
            goto L_0x00f2
        L_0x00f0:
            r4 = r36
        L_0x00f2:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r22 = r12 & r22
            if (r22 != 0) goto L_0x010e
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0107
            r0 = r37
            boolean r22 = r1.F(r0)
            if (r22 == 0) goto L_0x0109
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0107:
            r0 = r37
        L_0x0109:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r6 = r6 | r22
            goto L_0x0110
        L_0x010e:
            r0 = r37
        L_0x0110:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011b
            r6 = r6 | r22
            r3 = r38
            goto L_0x012e
        L_0x011b:
            r22 = r12 & r22
            r3 = r38
            if (r22 != 0) goto L_0x012e
            boolean r22 = r1.F(r3)
            if (r22 == 0) goto L_0x012a
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012c
        L_0x012a:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012c:
            r6 = r6 | r22
        L_0x012e:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0135
            r3 = r42 | 6
            goto L_0x0147
        L_0x0135:
            r3 = r42 & 6
            if (r3 != 0) goto L_0x0145
            boolean r3 = r1.F(r11)
            if (r3 == 0) goto L_0x0141
            r3 = 4
            goto L_0x0142
        L_0x0141:
            r3 = 2
        L_0x0142:
            r3 = r42 | r3
            goto L_0x0147
        L_0x0145:
            r3 = r42
        L_0x0147:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r6 & r22
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x016f
            r4 = r3 & 3
            r5 = 2
            if (r4 != r5) goto L_0x016f
            boolean r4 = r1.l()
            if (r4 != 0) goto L_0x015d
            goto L_0x016f
        L_0x015d:
            r1.L()
            r6 = r34
            r7 = r35
            r10 = r38
            r5 = r8
            r3 = r9
            r4 = r13
            r8 = r36
            r9 = r37
            goto L_0x027b
        L_0x016f:
            r1.G()
            r4 = r12 & 1
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r21 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r4 == 0) goto L_0x019f
            boolean r4 = r1.O()
            if (r4 == 0) goto L_0x0183
            goto L_0x019f
        L_0x0183:
            r1.L()
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x018c
            r6 = r6 & r21
        L_0x018c:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0191
            r6 = r6 & r5
        L_0x0191:
            r10 = r35
            r5 = r37
            r0 = r38
            r4 = r9
            r7 = r13
            r9 = r34
            r13 = r6
            r6 = r36
            goto L_0x01dc
        L_0x019f:
            if (r7 == 0) goto L_0x01a4
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x01a5
        L_0x01a4:
            r4 = r9
        L_0x01a5:
            if (r10 == 0) goto L_0x01ae
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c r7 = r7.o()
            goto L_0x01af
        L_0x01ae:
            r7 = r13
        L_0x01af:
            if (r15 == 0) goto L_0x01b2
            r8 = 0
        L_0x01b2:
            if (r17 == 0) goto L_0x01b7
            z4.n$q r9 = z4.n.q.f58357c
            goto L_0x01b9
        L_0x01b7:
            r9 = r34
        L_0x01b9:
            if (r19 == 0) goto L_0x01be
            z4.n$r r10 = z4.n.r.f58358c
            goto L_0x01c0
        L_0x01be:
            r10 = r35
        L_0x01c0:
            r13 = r14 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01c9
            r6 = r6 & r21
            r13 = r6
            r6 = r9
            goto L_0x01cc
        L_0x01c9:
            r13 = r6
            r6 = r36
        L_0x01cc:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x01d4
            r5 = r5 & r13
            r13 = r5
            r5 = r10
            goto L_0x01d6
        L_0x01d4:
            r5 = r37
        L_0x01d6:
            if (r0 == 0) goto L_0x01da
            r0 = 0
            goto L_0x01dc
        L_0x01da:
            r0 = r38
        L_0x01dc:
            r1.y()
            boolean r15 = U0.C4895p.J()
            if (r15 == 0) goto L_0x01ed
            java.lang.String r15 = "androidx.navigation.compose.NavHost (NavHost.kt:210)"
            r12 = 1840250294(0x6daffdb6, float:6.8083243E27)
            U0.C4895p.S(r12, r13, r3, r15)
        L_0x01ed:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r13
            r17 = 1
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r15) goto L_0x01fa
            r12 = r17
            goto L_0x01fb
        L_0x01fa:
            r12 = 0
        L_0x01fb:
            r15 = r13 & 112(0x70, float:1.57E-43)
            r14 = 32
            if (r15 != r14) goto L_0x0204
            r14 = r17
            goto L_0x0205
        L_0x0204:
            r14 = 0
        L_0x0205:
            r12 = r12 | r14
            r3 = r3 & 14
            r14 = 4
            if (r3 != r14) goto L_0x020e
            r15 = r17
            goto L_0x020f
        L_0x020e:
            r15 = 0
        L_0x020f:
            r3 = r12 | r15
            java.lang.Object r12 = r1.D()
            if (r3 != 0) goto L_0x021f
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r12 != r3) goto L_0x0232
        L_0x021f:
            x4.J r3 = r29.O()
            x4.y r12 = new x4.y
            r12.<init>(r3, r2, r8)
            r11.invoke(r12)
            x4.x r12 = r12.c()
            r1.u(r12)
        L_0x0232:
            r16 = r12
            x4.x r16 = (x4.x) r16
            r3 = r13 & 8078(0x1f8e, float:1.132E-41)
            int r12 = r13 >> 3
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r12
            r3 = r3 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r13
            r25 = r3 | r12
            r26 = 0
            r15 = r29
            r17 = r4
            r18 = r7
            r19 = r9
            r20 = r10
            r21 = r6
            r22 = r5
            r23 = r0
            r24 = r1
            c(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0270
            U0.C4895p.R()
        L_0x0270:
            r3 = r4
            r4 = r7
            r7 = r10
            r10 = r0
            r28 = r9
            r9 = r5
            r5 = r8
            r8 = r6
            r6 = r28
        L_0x027b:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x029a
            z4.n$a r14 = new z4.n$a
            r0 = r14
            r1 = r29
            r2 = r30
            r11 = r39
            r12 = r41
            r13 = r42
            r27 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r27
            r15.a(r0)
        L_0x029a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.n.b(x4.A, java.lang.String, androidx.compose.ui.d, i1.c, java.lang.String, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, U0.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: z4.n$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: z4.n$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: z4.n$o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: z4.n$o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: z4.n$l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: z4.n$g} */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0266, code lost:
        if (r4 == r29.a()) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03a9, code lost:
        if (r14 == r29.a()) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x047a, code lost:
        if (r12 == r29.a()) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04fb, code lost:
        if (r12 == r29.a()) goto L_0x04fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f5  */
    @android.annotation.SuppressLint({"StateFlowValueCalledInComposition"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(x4.C8935A r35, x4.x r36, androidx.compose.ui.d r37, i1.C5437c r38, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.i> r39, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.k> r40, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.i> r41, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, androidx.compose.animation.k> r42, nI.C17642l<androidx.compose.animation.d<x4.C8948l>, l0.v> r43, U0.C4889m r44, int r45, int r46) {
        /*
            r1 = r35
            r10 = r45
            r11 = r46
            r0 = -1964664536(0xffffffff8ae59928, float:-2.2109509E-32)
            r2 = r44
            U0.m r2 = r2.k(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0016
            r3 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0025
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x0022
            r3 = 4
            goto L_0x0023
        L_0x0022:
            r3 = 2
        L_0x0023:
            r3 = r3 | r10
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r5 = r11 & 2
            if (r5 == 0) goto L_0x002f
            r3 = r3 | 48
        L_0x002c:
            r5 = r36
            goto L_0x0041
        L_0x002f:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x002c
            r5 = r36
            boolean r6 = r2.F(r5)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r7 = r37
            goto L_0x005c
        L_0x004a:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0047
            r7 = r37
            boolean r8 = r2.V(r7)
            if (r8 == 0) goto L_0x0059
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r8
        L_0x005c:
            r8 = r11 & 8
            if (r8 == 0) goto L_0x0065
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r9 = r38
            goto L_0x0077
        L_0x0065:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0062
            r9 = r38
            boolean r12 = r2.V(r9)
            if (r12 == 0) goto L_0x0074
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r3 = r3 | r12
        L_0x0077:
            r12 = r11 & 16
            if (r12 == 0) goto L_0x0080
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r14 = r39
            goto L_0x0092
        L_0x0080:
            r14 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x007d
            r14 = r39
            boolean r15 = r2.F(r14)
            if (r15 == 0) goto L_0x008f
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r3 = r3 | r15
        L_0x0092:
            r15 = r11 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x009d
            r3 = r3 | r16
            r13 = r40
            goto L_0x00b0
        L_0x009d:
            r16 = r10 & r16
            r13 = r40
            if (r16 != 0) goto L_0x00b0
            boolean r16 = r2.F(r13)
            if (r16 == 0) goto L_0x00ac
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r16
        L_0x00b0:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r17 = r10 & r16
            if (r17 != 0) goto L_0x00ca
            r17 = r11 & 64
            r4 = r41
            if (r17 != 0) goto L_0x00c5
            boolean r19 = r2.F(r4)
            if (r19 == 0) goto L_0x00c5
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c7
        L_0x00c5:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00c7:
            r3 = r3 | r19
            goto L_0x00cc
        L_0x00ca:
            r4 = r41
        L_0x00cc:
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r10 & r19
            if (r20 != 0) goto L_0x00e8
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e1
            r0 = r42
            boolean r22 = r2.F(r0)
            if (r22 == 0) goto L_0x00e3
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e5
        L_0x00e1:
            r0 = r42
        L_0x00e3:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e5:
            r3 = r3 | r22
            goto L_0x00ea
        L_0x00e8:
            r0 = r42
        L_0x00ea:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00f5
            r3 = r3 | r22
            r4 = r43
            goto L_0x0108
        L_0x00f5:
            r22 = r10 & r22
            r4 = r43
            if (r22 != 0) goto L_0x0108
            boolean r22 = r2.F(r4)
            if (r22 == 0) goto L_0x0104
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0106
        L_0x0104:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0106:
            r3 = r3 | r22
        L_0x0108:
            r22 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r3 & r22
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r5) goto L_0x0129
            boolean r4 = r2.l()
            if (r4 != 0) goto L_0x0119
            goto L_0x0129
        L_0x0119:
            r2.L()
            r8 = r42
            r11 = r1
            r3 = r7
            r4 = r9
            r6 = r13
            r5 = r14
            r7 = r41
            r9 = r43
            goto L_0x0582
        L_0x0129:
            r2.G()
            r4 = r10 & 1
            r5 = 0
            if (r4 == 0) goto L_0x0156
            boolean r4 = r2.O()
            if (r4 == 0) goto L_0x0138
            goto L_0x0156
        L_0x0138:
            r2.L()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0143
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0143:
            r0 = r11 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x014b
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x014b:
            r15 = r42
            r4 = r7
            r6 = r9
            r8 = r13
            r7 = r14
            r9 = r41
            r14 = r43
            goto L_0x0198
        L_0x0156:
            if (r6 == 0) goto L_0x015b
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x015c
        L_0x015b:
            r4 = r7
        L_0x015c:
            if (r8 == 0) goto L_0x0165
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c r6 = r6.o()
            goto L_0x0166
        L_0x0165:
            r6 = r9
        L_0x0166:
            if (r12 == 0) goto L_0x016b
            z4.n$e r7 = z4.n.e.f58292c
            goto L_0x016c
        L_0x016b:
            r7 = r14
        L_0x016c:
            if (r15 == 0) goto L_0x0171
            z4.n$f r8 = z4.n.f.f58293c
            goto L_0x0172
        L_0x0171:
            r8 = r13
        L_0x0172:
            r9 = r11 & 64
            if (r9 == 0) goto L_0x017d
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r9
            r9 = r3
            r3 = r7
            goto L_0x0180
        L_0x017d:
            r9 = r3
            r3 = r41
        L_0x0180:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x018b
            r12 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r9 = r9 & r12
            r12 = r9
            r9 = r8
            goto L_0x018e
        L_0x018b:
            r12 = r9
            r9 = r42
        L_0x018e:
            if (r0 == 0) goto L_0x0195
            r14 = r5
        L_0x0191:
            r15 = r9
            r9 = r3
            r3 = r12
            goto L_0x0198
        L_0x0195:
            r14 = r43
            goto L_0x0191
        L_0x0198:
            r2.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01aa
            r0 = -1
            java.lang.String r12 = "androidx.navigation.compose.NavHost (NavHost.kt:490)"
            r13 = -1964664536(0xffffffff8ae59928, float:-2.2109509E-32)
            U0.C4895p.S(r13, r3, r0, r12)
        L_0x01aa:
            U0.I0 r0 = j3.g.a()
            java.lang.Object r0 = r2.Q(r0)
            androidx.lifecycle.y r0 = (androidx.lifecycle.C5221y) r0
            m3.a r12 = m3.a.f26247a
            int r13 = m3.a.f26249c
            androidx.lifecycle.k0 r12 = r12.a(r2, r13)
            if (r12 == 0) goto L_0x059a
            androidx.lifecycle.j0 r12 = r12.getViewModelStore()
            r1.H0(r12)
            r35.E0(r36)
            x4.J r12 = r35.O()
            java.lang.String r13 = "composable"
            x4.I r12 = r12.e(r13)
            boolean r13 = r12 instanceof z4.e
            if (r13 == 0) goto L_0x01da
            z4.e r12 = (z4.e) r12
            r13 = r12
            goto L_0x01db
        L_0x01da:
            r13 = r5
        L_0x01db:
            if (r13 != 0) goto L_0x0205
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01e6
            U0.C4895p.R()
        L_0x01e6:
            U0.Y0 r12 = r2.n()
            if (r12 == 0) goto L_0x0204
            z4.n$s r13 = new z4.n$s
            r0 = r13
            r1 = r35
            r2 = r36
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r15
            r9 = r14
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0204:
            return
        L_0x0205:
            TJ.P r12 = r13.m()
            r10 = 0
            r11 = 1
            U0.A1 r12 = U0.p1.b(r12, r5, r2, r10, r11)
            java.lang.Object r10 = r2.D()
            U0.m$a r29 = U0.C4889m.f14007a
            java.lang.Object r11 = r29.a()
            if (r10 != r11) goto L_0x0223
            r10 = 0
            U0.n0 r10 = U0.D0.a(r10)
            r2.u(r10)
        L_0x0223:
            U0.n0 r10 = (U0.C4892n0) r10
            java.lang.Object r11 = r2.D()
            java.lang.Object r5 = r29.a()
            if (r11 != r5) goto L_0x023d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r30 = r6
            r6 = 0
            r11 = 2
            U0.r0 r11 = U0.u1.e(r5, r6, r11, r6)
            r2.u(r11)
            goto L_0x023f
        L_0x023d:
            r30 = r6
        L_0x023f:
            r5 = r11
            U0.r0 r5 = (U0.C4899r0) r5
            java.util.List r6 = h(r12)
            int r6 = r6.size()
            r11 = 1
            if (r6 <= r11) goto L_0x024f
            r6 = 1
            goto L_0x0250
        L_0x024f:
            r6 = 0
        L_0x0250:
            boolean r11 = r2.V(r12)
            boolean r18 = r2.V(r13)
            r11 = r11 | r18
            r31 = r4
            java.lang.Object r4 = r2.D()
            if (r11 != 0) goto L_0x0268
            java.lang.Object r11 = r29.a()
            if (r4 != r11) goto L_0x027d
        L_0x0268:
            z4.n$g r4 = new z4.n$g
            r11 = 0
            r37 = r4
            r38 = r13
            r39 = r12
            r40 = r10
            r41 = r5
            r42 = r11
            r37.<init>(r38, r39, r40, r41, r42)
            r2.u(r4)
        L_0x027d:
            nI.p r4 = (nI.p) r4
            r11 = 0
            e.C5289l.a(r6, r4, r2, r11, r11)
            boolean r4 = r2.F(r1)
            boolean r6 = r2.F(r0)
            r4 = r4 | r6
            java.lang.Object r6 = r2.D()
            if (r4 != 0) goto L_0x0298
            java.lang.Object r4 = r29.a()
            if (r6 != r4) goto L_0x02a0
        L_0x0298:
            z4.n$h r6 = new z4.n$h
            r6.<init>(r1, r0)
            r2.u(r6)
        L_0x02a0:
            nI.l r6 = (nI.C17642l) r6
            r4 = 0
            U0.P.c(r0, r6, r2, r4)
            f1.e r0 = f1.C5305g.a(r2, r4)
            TJ.P r6 = r35.R()
            r1 = 1
            r11 = 0
            U0.A1 r6 = U0.p1.b(r6, r11, r2, r4, r1)
            java.lang.Object r1 = r2.D()
            java.lang.Object r4 = r29.a()
            if (r1 != r4) goto L_0x02ca
            z4.n$x r1 = new z4.n$x
            r1.<init>(r6)
            U0.A1 r1 = U0.p1.e(r1)
            r2.u(r1)
        L_0x02ca:
            U0.A1 r1 = (U0.A1) r1
            java.util.List r4 = g(r1)
            java.lang.Object r4 = YH.C16877v.K0(r4)
            x4.l r4 = (x4.C8948l) r4
            java.lang.Object r6 = r2.D()
            java.lang.Object r11 = r29.a()
            if (r6 != r11) goto L_0x02e8
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r2.u(r6)
        L_0x02e8:
            java.util.Map r6 = (java.util.Map) r6
            r11 = 653365120(0x26f18f80, float:1.676163E-15)
            r2.W(r11)
            if (r4 == 0) goto L_0x051b
            boolean r11 = r2.V(r13)
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r3 & r18
            r40 = r0
            r0 = r18 ^ r16
            r32 = r6
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r6) goto L_0x030a
            boolean r0 = r2.V(r9)
            if (r0 != 0) goto L_0x030e
        L_0x030a:
            r0 = r3 & r16
            if (r0 != r6) goto L_0x0310
        L_0x030e:
            r0 = 1
            goto L_0x0311
        L_0x0310:
            r0 = 0
        L_0x0311:
            r0 = r0 | r11
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r3
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r6 != r11) goto L_0x031c
            r6 = 1
            goto L_0x031d
        L_0x031c:
            r6 = 0
        L_0x031d:
            r0 = r0 | r6
            java.lang.Object r6 = r2.D()
            if (r0 != 0) goto L_0x032a
            java.lang.Object r0 = r29.a()
            if (r6 != r0) goto L_0x0332
        L_0x032a:
            z4.n$u r6 = new z4.n$u
            r6.<init>(r13, r9, r7, r5)
            r2.u(r6)
        L_0x0332:
            r0 = r6
            nI.l r0 = (nI.C17642l) r0
            boolean r6 = r2.V(r13)
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r11 = r11 & r3
            r11 = r11 ^ r19
            r44 = r9
            r9 = 8388608(0x800000, float:1.17549435E-38)
            if (r11 <= r9) goto L_0x034a
            boolean r11 = r2.V(r15)
            if (r11 != 0) goto L_0x034e
        L_0x034a:
            r11 = r3 & r19
            if (r11 != r9) goto L_0x0350
        L_0x034e:
            r9 = 1
            goto L_0x0351
        L_0x0350:
            r9 = 0
        L_0x0351:
            r6 = r6 | r9
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r3
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r9 != r11) goto L_0x035b
            r9 = 1
            goto L_0x035c
        L_0x035b:
            r9 = 0
        L_0x035c:
            r6 = r6 | r9
            java.lang.Object r9 = r2.D()
            if (r6 != 0) goto L_0x0369
            java.lang.Object r6 = r29.a()
            if (r9 != r6) goto L_0x0371
        L_0x0369:
            z4.n$v r9 = new z4.n$v
            r9.<init>(r13, r15, r8, r5)
            r2.u(r9)
        L_0x0371:
            r6 = r9
            nI.l r6 = (nI.C17642l) r6
            r9 = 234881024(0xe000000, float:1.5777218E-30)
            r9 = r9 & r3
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 != r11) goto L_0x037d
            r9 = 1
            goto L_0x037e
        L_0x037d:
            r9 = 0
        L_0x037e:
            java.lang.Object r11 = r2.D()
            if (r9 != 0) goto L_0x038a
            java.lang.Object r9 = r29.a()
            if (r11 != r9) goto L_0x0392
        L_0x038a:
            z4.n$w r11 = new z4.n$w
            r11.<init>(r14)
            r2.u(r11)
        L_0x0392:
            r9 = r11
            nI.l r9 = (nI.C17642l) r9
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r16 = r2.V(r13)
            r17 = r14
            java.lang.Object r14 = r2.D()
            if (r16 != 0) goto L_0x03ac
            r16 = r15
            java.lang.Object r15 = r29.a()
            if (r14 != r15) goto L_0x03b6
            goto L_0x03ae
        L_0x03ac:
            r16 = r15
        L_0x03ae:
            z4.n$i r14 = new z4.n$i
            r14.<init>(r1, r13)
            r2.u(r14)
        L_0x03b6:
            nI.l r14 = (nI.C17642l) r14
            r15 = 6
            U0.P.c(r11, r14, r2, r15)
            java.lang.Object r11 = r2.D()
            java.lang.Object r14 = r29.a()
            if (r11 != r14) goto L_0x03ce
            m0.j0 r11 = new m0.j0
            r11.<init>(r4)
            r2.u(r11)
        L_0x03ce:
            m0.j0 r11 = (m0.C5549j0) r11
            int r14 = m0.C5549j0.f25765s
            r14 = r14 | 48
            java.lang.String r15 = "entry"
            r33 = r8
            r8 = 0
            m0.v0 r15 = m0.w0.f(r11, r15, r2, r14, r8)
            boolean r8 = d(r5)
            if (r8 == 0) goto L_0x041f
            r8 = -1218260648(0xffffffffb762d158, float:-1.3519391E-5)
            r2.W(r8)
            float r8 = i(r10)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            boolean r14 = r2.V(r12)
            boolean r18 = r2.F(r11)
            r14 = r14 | r18
            r34 = r7
            java.lang.Object r7 = r2.D()
            if (r14 != 0) goto L_0x0409
            java.lang.Object r14 = r29.a()
            if (r7 != r14) goto L_0x0412
        L_0x0409:
            z4.n$j r7 = new z4.n$j
            r14 = 0
            r7.<init>(r11, r12, r10, r14)
            r2.u(r7)
        L_0x0412:
            nI.p r7 = (nI.p) r7
            r10 = 0
            U0.P.g(r8, r7, r2, r10)
            r2.P()
            r8 = r32
            r7 = 0
            goto L_0x0458
        L_0x041f:
            r34 = r7
            r7 = -1218005611(0xffffffffb766b595, float:-1.3751346E-5)
            r2.W(r7)
            boolean r7 = r2.F(r11)
            boolean r8 = r2.F(r4)
            r7 = r7 | r8
            boolean r8 = r2.V(r15)
            r7 = r7 | r8
            java.lang.Object r8 = r2.D()
            if (r7 != 0) goto L_0x0444
            java.lang.Object r7 = r29.a()
            if (r8 != r7) goto L_0x0442
            goto L_0x0444
        L_0x0442:
            r7 = 0
            goto L_0x044d
        L_0x0444:
            z4.n$k r8 = new z4.n$k
            r7 = 0
            r8.<init>(r11, r4, r15, r7)
            r2.u(r8)
        L_0x044d:
            nI.p r8 = (nI.p) r8
            r10 = 0
            U0.P.g(r4, r8, r2, r10)
            r2.P()
            r8 = r32
        L_0x0458:
            boolean r10 = r2.F(r8)
            boolean r12 = r2.V(r13)
            r10 = r10 | r12
            boolean r12 = r2.V(r0)
            r10 = r10 | r12
            boolean r12 = r2.V(r6)
            r10 = r10 | r12
            boolean r12 = r2.V(r9)
            r10 = r10 | r12
            java.lang.Object r12 = r2.D()
            if (r10 != 0) goto L_0x047c
            java.lang.Object r10 = r29.a()
            if (r12 != r10) goto L_0x0494
        L_0x047c:
            z4.n$l r12 = new z4.n$l
            r21 = r12
            r22 = r8
            r23 = r13
            r24 = r0
            r25 = r6
            r26 = r9
            r27 = r1
            r28 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r2.u(r12)
        L_0x0494:
            r14 = r12
            nI.l r14 = (nI.C17642l) r14
            z4.n$m r0 = z4.n.m.f58332c
            z4.n$n r6 = new z4.n$n
            r37 = r6
            r38 = r11
            r39 = r4
            r41 = r5
            r42 = r1
            r37.<init>(r38, r39, r40, r41, r42)
            r4 = 54
            r5 = 820763100(0x30ebd9dc, float:1.716042E-9)
            r9 = 1
            c1.a r4 = c1.c.e(r5, r9, r6, r2, r4)
            int r5 = r3 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r6 = 221184(0x36000, float:3.09945E-40)
            r5 = r5 | r6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r19 = r5 | r3
            r20 = 0
            r12 = r15
            r5 = r13
            r13 = r31
            r9 = r17
            r3 = r15
            r10 = r16
            r15 = r30
            r16 = r0
            r17 = r4
            r18 = r2
            androidx.compose.animation.a.b(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = r3.i()
            java.lang.Object r4 = r3.p()
            boolean r6 = r2.V(r3)
            r11 = r35
            boolean r12 = r2.F(r11)
            r6 = r6 | r12
            boolean r12 = r2.V(r5)
            r6 = r6 | r12
            boolean r12 = r2.F(r8)
            r6 = r6 | r12
            java.lang.Object r12 = r2.D()
            if (r6 != 0) goto L_0x04fd
            java.lang.Object r6 = r29.a()
            if (r12 != r6) goto L_0x0514
        L_0x04fd:
            z4.n$o r12 = new z4.n$o
            r6 = 0
            r37 = r12
            r38 = r3
            r39 = r35
            r40 = r8
            r41 = r1
            r42 = r5
            r43 = r6
            r37.<init>(r38, r39, r40, r41, r42, r43)
            r2.u(r12)
        L_0x0514:
            nI.p r12 = (nI.p) r12
            r1 = 0
            U0.P.f(r0, r4, r12, r2, r1)
            goto L_0x0526
        L_0x051b:
            r11 = r35
            r34 = r7
            r33 = r8
            r44 = r9
            r9 = r14
            r10 = r15
            r7 = 0
        L_0x0526:
            r2.P()
            x4.J r0 = r35.O()
            java.lang.String r1 = "dialog"
            x4.I r0 = r0.e(r1)
            boolean r1 = r0 instanceof z4.i
            if (r1 == 0) goto L_0x053b
            r5 = r0
            z4.i r5 = (z4.i) r5
            goto L_0x053c
        L_0x053b:
            r5 = r7
        L_0x053c:
            if (r5 != 0) goto L_0x056a
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0547
            U0.C4895p.R()
        L_0x0547:
            U0.Y0 r12 = r2.n()
            if (r12 == 0) goto L_0x0569
            z4.n$t r13 = new z4.n$t
            r0 = r13
            r1 = r35
            r2 = r36
            r3 = r31
            r4 = r30
            r5 = r34
            r6 = r33
            r7 = r44
            r8 = r10
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0569:
            return
        L_0x056a:
            r0 = 0
            z4.g.a(r5, r2, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0577
            U0.C4895p.R()
        L_0x0577:
            r7 = r44
            r8 = r10
            r4 = r30
            r3 = r31
            r6 = r33
            r5 = r34
        L_0x0582:
            U0.Y0 r12 = r2.n()
            if (r12 == 0) goto L_0x0599
            z4.n$p r13 = new z4.n$p
            r0 = r13
            r1 = r35
            r2 = r36
            r10 = r45
            r11 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0599:
            return
        L_0x059a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.n.c(x4.A, x4.x, androidx.compose.ui.d, i1.c, nI.l, nI.l, nI.l, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final boolean d(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void e(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final List<C8948l> f(A1<? extends List<C8948l>> a12) {
        return (List) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final List<C8948l> g(A1<? extends List<C8948l>> a12) {
        return (List) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final List<C8948l> h(A1<? extends List<C8948l>> a12) {
        return (List) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final float i(C4892n0 n0Var) {
        return n0Var.a();
    }

    /* access modifiers changed from: private */
    public static final void j(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i w(x4.v vVar, androidx.compose.animation.d<C8948l> dVar) {
        C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> m02;
        if (vVar instanceof e.b) {
            C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> S10 = ((e.b) vVar).S();
            if (S10 != null) {
                return S10.invoke(dVar);
            }
            return null;
        } else if (!(vVar instanceof d.a) || (m02 = ((d.a) vVar).m0()) == null) {
            return null;
        } else {
            return m02.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k x(x4.v vVar, androidx.compose.animation.d<C8948l> dVar) {
        C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> n02;
        if (vVar instanceof e.b) {
            C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> T10 = ((e.b) vVar).T();
            if (T10 != null) {
                return T10.invoke(dVar);
            }
            return null;
        } else if (!(vVar instanceof d.a) || (n02 = ((d.a) vVar).n0()) == null) {
            return null;
        } else {
            return n02.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i y(x4.v vVar, androidx.compose.animation.d<C8948l> dVar) {
        C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> q02;
        if (vVar instanceof e.b) {
            C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.i> U10 = ((e.b) vVar).U();
            if (U10 != null) {
                return U10.invoke(dVar);
            }
            return null;
        } else if (!(vVar instanceof d.a) || (q02 = ((d.a) vVar).q0()) == null) {
            return null;
        } else {
            return q02.invoke(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k z(x4.v vVar, androidx.compose.animation.d<C8948l> dVar) {
        C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> r02;
        if (vVar instanceof e.b) {
            C17642l<androidx.compose.animation.d<C8948l>, androidx.compose.animation.k> V10 = ((e.b) vVar).V();
            if (V10 != null) {
                return V10.invoke(dVar);
            }
            return null;
        } else if (!(vVar instanceof d.a) || (r02 = ((d.a) vVar).r0()) == null) {
            return null;
        } else {
            return r02.invoke(dVar);
        }
    }
}
