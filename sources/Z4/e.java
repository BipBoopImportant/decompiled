package z4;

import TJ.C16519P;
import U0.C4889m;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import androidx.compose.animation.d;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C5507b;
import nI.C17642l;
import nI.r;
import x4.C;
import x4.C8948l;
import x4.I;
import x4.v;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lz4/e;", "Lx4/I;", "Lz4/e$b;", "<init>", "()V", "", "Lx4/l;", "entries", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "LXH/N;", "e", "(Ljava/util/List;Lx4/C;Lx4/I$a;)V", "l", "()Lz4/e$b;", "popUpTo", "", "savedState", "j", "(Lx4/l;Z)V", "entry", "p", "(Lx4/l;)V", "o", "LU0/r0;", "c", "LU0/r0;", "n", "()LU0/r0;", "isPop", "LTJ/P;", "m", "()LTJ/P;", "backStack", "d", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("composable")
public final class e extends I<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f58196d = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0<Boolean> f58197c = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz4/e$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR8\u0010\u0018\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R8\u0010\u001d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R8\u0010!\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R8\u0010%\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R8\u0010*\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017¨\u0006+"}, d2 = {"Lz4/e$b;", "Lx4/v;", "Lz4/e;", "navigator", "Lkotlin/Function2;", "Ll0/b;", "Lx4/l;", "LXH/N;", "content", "<init>", "(Lz4/e;LnI/r;)V", "m", "LnI/r;", "R", "()LnI/r;", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Landroidx/compose/animation/i;", "n", "LnI/l;", "S", "()LnI/l;", "X", "(LnI/l;)V", "enterTransition", "Landroidx/compose/animation/k;", "o", "T", "Y", "exitTransition", "p", "U", "Z", "popEnterTransition", "q", "V", "a0", "popExitTransition", "Ll0/v;", "r", "W", "b0", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends v {

        /* renamed from: m  reason: collision with root package name */
        private final r<C5507b, C8948l, C4889m, Integer, C16807N> f58198m;

        /* renamed from: n  reason: collision with root package name */
        private C17642l<d<C8948l>, i> f58199n;

        /* renamed from: o  reason: collision with root package name */
        private C17642l<d<C8948l>, k> f58200o;

        /* renamed from: p  reason: collision with root package name */
        private C17642l<d<C8948l>, i> f58201p;

        /* renamed from: q  reason: collision with root package name */
        private C17642l<d<C8948l>, k> f58202q;

        /* renamed from: r  reason: collision with root package name */
        private C17642l<d<C8948l>, l0.v> f58203r;

        public b(e eVar, r<? super C5507b, C8948l, ? super C4889m, ? super Integer, C16807N> rVar) {
            super((I<? extends v>) eVar);
            this.f58198m = rVar;
        }

        public final r<C5507b, C8948l, C4889m, Integer, C16807N> R() {
            return this.f58198m;
        }

        public final C17642l<d<C8948l>, i> S() {
            return this.f58199n;
        }

        public final C17642l<d<C8948l>, k> T() {
            return this.f58200o;
        }

        public final C17642l<d<C8948l>, i> U() {
            return this.f58201p;
        }

        public final C17642l<d<C8948l>, k> V() {
            return this.f58202q;
        }

        public final C17642l<d<C8948l>, l0.v> W() {
            return this.f58203r;
        }

        public final void X(C17642l<d<C8948l>, i> lVar) {
            this.f58199n = lVar;
        }

        public final void Y(C17642l<d<C8948l>, k> lVar) {
            this.f58200o = lVar;
        }

        public final void Z(C17642l<d<C8948l>, i> lVar) {
            this.f58201p = lVar;
        }

        public final void a0(C17642l<d<C8948l>, k> lVar) {
            this.f58202q = lVar;
        }

        public final void b0(C17642l<d<C8948l>, l0.v> lVar) {
            this.f58203r = lVar;
        }
    }

    public void e(List<C8948l> list, C c10, I.a aVar) {
        for (C8948l l10 : list) {
            b().l(l10);
        }
        this.f58197c.setValue(Boolean.FALSE);
    }

    public void j(C8948l lVar, boolean z10) {
        b().i(lVar, z10);
        this.f58197c.setValue(Boolean.TRUE);
    }

    /* renamed from: l */
    public b a() {
        return new b(this, C9010b.f58185a.a());
    }

    public final C16519P<List<C8948l>> m() {
        return b().b();
    }

    public final C4899r0<Boolean> n() {
        return this.f58197c;
    }

    public final void o(C8948l lVar) {
        b().e(lVar);
    }

    public final void p(C8948l lVar) {
        b().j(lVar);
    }
}
