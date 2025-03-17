package androidx.compose.animation;

import c2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.i;
import l0.v;
import m0.C5548j;
import m0.N;
import m0.P0;
import m0.v0;
import mI.C17604b;
import nI.C17642l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017J\u001e\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦\u0004¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0001\u0001\u0018ø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/d;", "S", "Lm0/v0$b;", "Ll0/i;", "Ll0/v;", "sizeTransform", "c", "(Ll0/i;Ll0/v;)Ll0/i;", "Landroidx/compose/animation/d$a;", "towards", "Lm0/N;", "Lc2/n;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/i;", "f", "(ILm0/N;LnI/l;)Landroidx/compose/animation/i;", "targetOffset", "Landroidx/compose/animation/k;", "e", "(ILm0/N;LnI/l;)Landroidx/compose/animation/k;", "a", "Landroidx/compose/animation/e;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d<S> extends v0.b<S> {

    @C17604b
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0003\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/d$a;", "", "", "value", "g", "(I)I", "a", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0239a f17332a = new C0239a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final int f17333b = g(0);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final int f17334c = g(1);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f17335d = g(2);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final int f17336e = g(3);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final int f17337f = g(4);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final int f17338g = g(5);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/d$a$a;", "", "<init>", "()V", "Landroidx/compose/animation/d$a;", "Left", "I", "c", "()I", "Right", "d", "Up", "f", "Down", "a", "Start", "e", "End", "b", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.animation.d$a$a  reason: collision with other inner class name */
        public static final class C0239a {
            public /* synthetic */ C0239a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.f17336e;
            }

            public final int b() {
                return a.f17338g;
            }

            public final int c() {
                return a.f17333b;
            }

            public final int d() {
                return a.f17334c;
            }

            public final int e() {
                return a.f17337f;
            }

            public final int f() {
                return a.f17335d;
            }

            private C0239a() {
            }
        }

        public static int g(int i10) {
            return i10;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f17339c = new b();

        b() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Integer, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f17340c = new c();

        c() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ k b(d dVar, int i10, N n10, C17642l lVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                n10 = C5548j.h(0.0f, 0.0f, n.b(P0.c(n.f23044b)), 3, (Object) null);
            }
            if ((i11 & 4) != 0) {
                lVar = c.f17340c;
            }
            return dVar.e(i10, n10, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
    }

    static /* synthetic */ i d(d dVar, int i10, N n10, C17642l lVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                n10 = C5548j.h(0.0f, 0.0f, n.b(P0.c(n.f23044b)), 3, (Object) null);
            }
            if ((i11 & 4) != 0) {
                lVar = b.f17339c;
            }
            return dVar.f(i10, n10, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
    }

    i c(i iVar, v vVar);

    k e(int i10, N<n> n10, C17642l<? super Integer, Integer> lVar);

    i f(int i10, N<n> n10, C17642l<? super Integer, Integer> lVar);
}
