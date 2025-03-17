package z4;

import androidx.compose.animation.i;
import androidx.compose.animation.k;
import kotlin.Metadata;
import l0.v;
import nI.C17642l;
import x4.C8948l;
import x4.I;
import x4.J;
import x4.x;
import x4.z;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lz4/d;", "Lx4/z;", "Lx4/J;", "navigatorProvider", "<init>", "(Lx4/J;)V", "Lx4/x;", "l", "()Lx4/x;", "a", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("navigation")
public final class d extends z {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R8\u0010\u0010\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR8\u0010\u0015\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR8\u0010\u0019\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR8\u0010\u001d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR8\u0010\"\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Lz4/d$a;", "Lx4/x;", "Lx4/I;", "navGraphNavigator", "<init>", "(Lx4/I;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Lx4/l;", "Landroidx/compose/animation/i;", "r", "LnI/l;", "m0", "()LnI/l;", "setEnterTransition$navigation_compose_release", "(LnI/l;)V", "enterTransition", "Landroidx/compose/animation/k;", "s", "n0", "setExitTransition$navigation_compose_release", "exitTransition", "t", "q0", "setPopEnterTransition$navigation_compose_release", "popEnterTransition", "u", "r0", "setPopExitTransition$navigation_compose_release", "popExitTransition", "Ll0/v;", "v", "s0", "setSizeTransform$navigation_compose_release", "sizeTransform", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends x {

        /* renamed from: r  reason: collision with root package name */
        private C17642l<androidx.compose.animation.d<C8948l>, i> f58191r;

        /* renamed from: s  reason: collision with root package name */
        private C17642l<androidx.compose.animation.d<C8948l>, k> f58192s;

        /* renamed from: t  reason: collision with root package name */
        private C17642l<androidx.compose.animation.d<C8948l>, i> f58193t;

        /* renamed from: u  reason: collision with root package name */
        private C17642l<androidx.compose.animation.d<C8948l>, k> f58194u;

        /* renamed from: v  reason: collision with root package name */
        private C17642l<androidx.compose.animation.d<C8948l>, v> f58195v;

        public a(I<? extends x> i10) {
            super(i10);
        }

        public final C17642l<androidx.compose.animation.d<C8948l>, i> m0() {
            return this.f58191r;
        }

        public final C17642l<androidx.compose.animation.d<C8948l>, k> n0() {
            return this.f58192s;
        }

        public final C17642l<androidx.compose.animation.d<C8948l>, i> q0() {
            return this.f58193t;
        }

        public final C17642l<androidx.compose.animation.d<C8948l>, k> r0() {
            return this.f58194u;
        }

        public final C17642l<androidx.compose.animation.d<C8948l>, v> s0() {
            return this.f58195v;
        }
    }

    public d(J j10) {
        super(j10);
    }

    /* renamed from: l */
    public x a() {
        return new a(this);
    }
}
