package androidx.compose.foundation.lazy.layout;

import E1.l0;
import G1.A0;
import G1.B0;
import XH.C16807N;
import YH.C16877v;
import android.os.Trace;
import androidx.compose.foundation.lazy.layout.d;
import c2.C5267b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import v0.M;
import v0.N;
import v0.O;
import v0.P;
import v0.r;
import v0.t;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h;", "", "Lv0/r;", "itemContentFactory", "LE1/l0;", "subcomposeLayoutState", "Lv0/P;", "executor", "<init>", "(Lv0/r;LE1/l0;Lv0/P;)V", "", "index", "Lc2/b;", "constraints", "Lv0/M;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/d$b;", "d", "(IJLv0/M;)Landroidx/compose/foundation/lazy/layout/d$b;", "Lv0/N;", "c", "(IJLv0/M;)Lv0/N;", "a", "Lv0/r;", "b", "LE1/l0;", "Lv0/P;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final r f18368a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l0 f18369b;

    /* renamed from: c  reason: collision with root package name */
    private final P f18370c;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u0013\u0010\u001c\u001a\u00020\u000e*\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R \u0010/\u001a\f\u0018\u00010\u0016R\u00060\u0000R\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0014\u00102\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b&\u00101R\u0014\u00103\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b)\u00101\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a;", "Landroidx/compose/foundation/lazy/layout/d$b;", "Lv0/N;", "", "index", "Lc2/b;", "constraints", "Lv0/M;", "prefetchMetrics", "<init>", "(Landroidx/compose/foundation/lazy/layout/h;IJLv0/M;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lv0/O;", "", "average", "", "i", "(Lv0/O;J)Z", "LXH/N;", "f", "()V", "g", "(J)V", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "Landroidx/compose/foundation/lazy/layout/h;", "h", "()Landroidx/compose/foundation/lazy/layout/h$a$a;", "cancel", "a", "b", "(Lv0/O;)Z", "", "toString", "()Ljava/lang/String;", "I", "J", "c", "Lv0/M;", "LE1/l0$a;", "d", "LE1/l0$a;", "precomposeHandle", "e", "Z", "isMeasured", "isCanceled", "hasResolvedNestedPrefetches", "Landroidx/compose/foundation/lazy/layout/h$a$a;", "nestedPrefetchController", "isUrgent", "()Z", "isComposed", "isValid", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements d.b, N {

        /* renamed from: a  reason: collision with root package name */
        private final int f18371a;

        /* renamed from: b  reason: collision with root package name */
        private final long f18372b;

        /* renamed from: c  reason: collision with root package name */
        private final M f18373c;

        /* renamed from: d  reason: collision with root package name */
        private l0.a f18374d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f18375e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f18376f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f18377g;

        /* renamed from: h  reason: collision with root package name */
        private C0268a f18378h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f18379i;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/h$a$a;", "", "", "Landroidx/compose/foundation/lazy/layout/d;", "states", "<init>", "(Landroidx/compose/foundation/lazy/layout/h$a;Ljava/util/List;)V", "Lv0/O;", "", "a", "(Lv0/O;)Z", "Ljava/util/List;", "", "Lv0/N;", "b", "[Ljava/util/List;", "requestsByState", "", "c", "I", "stateIndex", "d", "requestIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.lazy.layout.h$a$a  reason: collision with other inner class name */
        private final class C0268a {

            /* renamed from: a  reason: collision with root package name */
            private final List<d> f18381a;

            /* renamed from: b  reason: collision with root package name */
            private final List<N>[] f18382b;

            /* renamed from: c  reason: collision with root package name */
            private int f18383c;

            /* renamed from: d  reason: collision with root package name */
            private int f18384d;

            public C0268a(List<d> list) {
                this.f18381a = list;
                this.f18382b = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(O o10) {
                if (this.f18383c >= this.f18381a.size()) {
                    return false;
                }
                if (!a.this.f18376f) {
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (this.f18383c < this.f18381a.size()) {
                        try {
                            if (this.f18382b[this.f18383c] == null) {
                                if (o10.a() <= 0) {
                                    Trace.endSection();
                                    return true;
                                }
                                List<N>[] listArr = this.f18382b;
                                int i10 = this.f18383c;
                                listArr[i10] = this.f18381a.get(i10).b();
                            }
                            List<N> list = this.f18382b[this.f18383c];
                            C17542s.g(list);
                            while (this.f18384d < list.size()) {
                                if (list.get(this.f18384d).b(o10)) {
                                    Trace.endSection();
                                    return true;
                                }
                                this.f18384d++;
                            }
                            this.f18384d = 0;
                            this.f18383c++;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                    Trace.endSection();
                    return false;
                }
                throw new IllegalStateException("Should not execute nested prefetch on canceled request");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/B0;", "it", "LG1/A0;", "a", "(LG1/B0;)LG1/A0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<B0, A0> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.O<List<d>> f18386c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.O<List<d>> o10) {
                super(1);
                this.f18386c = o10;
            }

            /* renamed from: a */
            public final A0 invoke(B0 b02) {
                C17542s.h(b02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d C22 = ((i) b02).C2();
                kotlin.jvm.internal.O<List<d>> o10 = this.f18386c;
                T t10 = (List) o10.f144348a;
                if (t10 != null) {
                    t10.add(C22);
                } else {
                    t10 = C16877v.t(C22);
                }
                o10.f144348a = t10;
                return A0.SkipSubtreeAndContinueTraversal;
            }
        }

        public /* synthetic */ a(h hVar, int i10, long j10, M m10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, j10, m10);
        }

        private final boolean d() {
            return this.f18374d != null;
        }

        private final boolean e() {
            if (!this.f18376f) {
                int a10 = h.this.f18368a.d().invoke().a();
                int i10 = this.f18371a;
                return i10 >= 0 && i10 < a10;
            }
        }

        private final void f() {
            if (!e()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            } else if (this.f18374d == null) {
                t invoke = h.this.f18368a.d().invoke();
                Object d10 = invoke.d(this.f18371a);
                this.f18374d = h.this.f18369b.i(d10, h.this.f18368a.b(this.f18371a, d10, invoke.e(this.f18371a)));
            } else {
                throw new IllegalArgumentException("Request was already composed!");
            }
        }

        private final void g(long j10) {
            if (this.f18376f) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            } else if (!this.f18375e) {
                this.f18375e = true;
                l0.a aVar = this.f18374d;
                if (aVar != null) {
                    int d10 = aVar.d();
                    for (int i10 = 0; i10 < d10; i10++) {
                        aVar.f(i10, j10);
                    }
                    return;
                }
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            } else {
                throw new IllegalArgumentException("Request was already measured!");
            }
        }

        private final C0268a h() {
            l0.a aVar = this.f18374d;
            if (aVar != null) {
                kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
                aVar.e("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new b(o10));
                List list = (List) o10.f144348a;
                if (list != null) {
                    return new C0268a(list);
                }
                return null;
            }
            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
        }

        private final boolean i(O o10, long j10) {
            long a10 = o10.a();
            return (this.f18379i && a10 > 0) || j10 < a10;
        }

        public void a() {
            this.f18379i = true;
        }

        /* JADX INFO: finally extract failed */
        public boolean b(O o10) {
            if (!e()) {
                return false;
            }
            Object e10 = h.this.f18368a.d().invoke().e(this.f18371a);
            if (!d()) {
                if (!i(o10, (e10 == null || !this.f18373c.f().a(e10)) ? this.f18373c.e() : this.f18373c.f().c(e10))) {
                    return true;
                }
                M m10 = this.f18373c;
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    f();
                    C16807N n10 = C16807N.f139792a;
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (e10 != null) {
                        m10.f().p(e10, m10.d(nanoTime2, m10.f().e(e10, 0)));
                    }
                    m10.f30836c = m10.d(nanoTime2, m10.e());
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            if (!this.f18379i) {
                if (!this.f18377g) {
                    if (o10.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f18378h = h();
                        this.f18377g = true;
                        C16807N n11 = C16807N.f139792a;
                    } finally {
                        Trace.endSection();
                    }
                }
                C0268a aVar = this.f18378h;
                if (aVar != null ? aVar.a(o10) : false) {
                    return true;
                }
            }
            if (!this.f18375e && !C5267b.p(this.f18372b)) {
                if (!i(o10, (e10 == null || !this.f18373c.h().a(e10)) ? this.f18373c.g() : this.f18373c.h().c(e10))) {
                    return true;
                }
                M m11 = this.f18373c;
                long nanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    g(this.f18372b);
                    C16807N n12 = C16807N.f139792a;
                    Trace.endSection();
                    long nanoTime4 = System.nanoTime() - nanoTime3;
                    if (e10 != null) {
                        m11.h().p(e10, m11.d(nanoTime4, m11.h().e(e10, 0)));
                    }
                    m11.f30837d = m11.d(nanoTime4, m11.g());
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
            return false;
        }

        public void cancel() {
            if (!this.f18376f) {
                this.f18376f = true;
                l0.a aVar = this.f18374d;
                if (aVar != null) {
                    aVar.b();
                }
                this.f18374d = null;
            }
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.f18371a + ", constraints = " + C5267b.q(this.f18372b) + ", isComposed = " + d() + ", isMeasured = " + this.f18375e + ", isCanceled = " + this.f18376f + " }";
        }

        private a(int i10, long j10, M m10) {
            this.f18371a = i10;
            this.f18372b = j10;
            this.f18373c = m10;
        }
    }

    public h(r rVar, l0 l0Var, P p10) {
        this.f18368a = rVar;
        this.f18369b = l0Var;
        this.f18370c = p10;
    }

    public final N c(int i10, long j10, M m10) {
        return new a(this, i10, j10, m10, (DefaultConstructorMarker) null);
    }

    public final d.b d(int i10, long j10, M m10) {
        a aVar = new a(this, i10, j10, m10, (DefaultConstructorMarker) null);
        this.f18370c.a(aVar);
        return aVar;
    }
}
