package z4;

import TJ.C16519P;
import U0.C4889m;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.window.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import x4.C;
import x4.C8941e;
import x4.C8948l;
import x4.I;
import x4.v;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001b8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001b8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006%"}, d2 = {"Lz4/i;", "Lx4/I;", "Lz4/i$b;", "<init>", "()V", "Lx4/l;", "backStackEntry", "LXH/N;", "m", "(Lx4/l;)V", "", "entries", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "e", "(Ljava/util/List;Lx4/C;Lx4/I$a;)V", "l", "()Lz4/i$b;", "popUpTo", "", "savedState", "j", "(Lx4/l;Z)V", "entry", "p", "LTJ/P;", "n", "()LTJ/P;", "backStack", "", "o", "transitionInProgress", "c", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("dialog")
public final class i extends I<b> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f58243c = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz4/i$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public void e(List<C8948l> list, C c10, I.a aVar) {
        for (C8948l k10 : list) {
            b().k(k10);
        }
    }

    public void j(C8948l lVar, boolean z10) {
        b().i(lVar, z10);
        int A02 = C16877v.A0(b().c().getValue(), lVar);
        int i10 = 0;
        for (Object next : b().c().getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            C8948l lVar2 = (C8948l) next;
            if (i10 > A02) {
                p(lVar2);
            }
            i10 = i11;
        }
    }

    /* renamed from: l */
    public b a() {
        return new b(this, (h) null, C9011c.f58188a.a(), 2, (DefaultConstructorMarker) null);
    }

    public final void m(C8948l lVar) {
        j(lVar, false);
    }

    public final C16519P<List<C8948l>> n() {
        return b().b();
    }

    public final C16519P<Set<C8948l>> o() {
        return b().c();
    }

    public final void p(C8948l lVar) {
        b().e(lVar);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lz4/i$b;", "Lx4/v;", "Lx4/e;", "Lz4/i;", "navigator", "Landroidx/compose/ui/window/h;", "dialogProperties", "Lkotlin/Function1;", "Lx4/l;", "LXH/N;", "content", "<init>", "(Lz4/i;Landroidx/compose/ui/window/h;LnI/q;)V", "m", "Landroidx/compose/ui/window/h;", "S", "()Landroidx/compose/ui/window/h;", "n", "LnI/q;", "R", "()LnI/q;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends v implements C8941e {

        /* renamed from: m  reason: collision with root package name */
        private final h f58244m;

        /* renamed from: n  reason: collision with root package name */
        private final q<C8948l, C4889m, Integer, C16807N> f58245n;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(i iVar, h hVar, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(iVar, (i10 & 2) != 0 ? new h(false, false, false, 7, (DefaultConstructorMarker) null) : hVar, qVar);
        }

        public final q<C8948l, C4889m, Integer, C16807N> R() {
            return this.f58245n;
        }

        public final h S() {
            return this.f58244m;
        }

        public b(i iVar, h hVar, q<? super C8948l, ? super C4889m, ? super Integer, C16807N> qVar) {
            super((I<? extends v>) iVar);
            this.f58244m = hVar;
            this.f58245n = qVar;
        }
    }
}
