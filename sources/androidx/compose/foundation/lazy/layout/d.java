package androidx.compose.foundation.lazy.layout;

import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import v0.K;
import v0.M;
import v0.N;
import v0.P;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0013B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001b\u0010 \"\u0004\b!\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d;", "", "Lv0/P;", "prefetchScheduler", "Lkotlin/Function1;", "Lv0/K;", "LXH/N;", "onNestedPrefetch", "<init>", "(Lv0/P;LnI/l;)V", "", "index", "Lc2/b;", "constraints", "Landroidx/compose/foundation/lazy/layout/d$b;", "e", "(IJ)Landroidx/compose/foundation/lazy/layout/d$b;", "", "Lv0/N;", "b", "()Ljava/util/List;", "a", "Lv0/P;", "d", "()Lv0/P;", "LnI/l;", "Lv0/M;", "c", "Lv0/M;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/h;", "Landroidx/compose/foundation/lazy/layout/h;", "()Landroidx/compose/foundation/lazy/layout/h;", "f", "(Landroidx/compose/foundation/lazy/layout/h;)V", "prefetchHandleProvider", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final P f18345a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<K, C16807N> f18346b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final M f18347c;

    /* renamed from: d  reason: collision with root package name */
    private h f18348d;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$a;", "Lv0/K;", "<init>", "(Landroidx/compose/foundation/lazy/layout/d;)V", "", "index", "LXH/N;", "a", "(I)V", "Lc2/b;", "constraints", "c", "(IJ)V", "", "Lv0/N;", "Ljava/util/List;", "_requests", "", "b", "()Ljava/util/List;", "requests", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements K {

        /* renamed from: a  reason: collision with root package name */
        private final List<N> f18349a = new ArrayList();

        public a() {
        }

        public void a(int i10) {
            c(i10, e.f18351a);
        }

        public final List<N> b() {
            return this.f18349a;
        }

        public void c(int i10, long j10) {
            h c10 = d.this.c();
            if (c10 != null) {
                this.f18349a.add(c10.c(i10, j10, d.this.f18347c));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004\u0001\u0002\u0006\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/d$b;", "", "LXH/N;", "cancel", "()V", "a", "Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/h$a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void a();

        void cancel();
    }

    public d() {
        this((P) null, (C17642l) null, 3, (DefaultConstructorMarker) null);
    }

    public final List<N> b() {
        C17642l<K, C16807N> lVar = this.f18346b;
        if (lVar == null) {
            return C16877v.n();
        }
        a aVar = new a();
        lVar.invoke(aVar);
        return aVar.b();
    }

    public final h c() {
        return this.f18348d;
    }

    public final P d() {
        return this.f18345a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r0.d(r3, r4, r2.f18347c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.layout.d.b e(int r3, long r4) {
        /*
            r2 = this;
            androidx.compose.foundation.lazy.layout.h r0 = r2.f18348d
            if (r0 == 0) goto L_0x000c
            v0.M r1 = r2.f18347c
            androidx.compose.foundation.lazy.layout.d$b r3 = r0.d(r3, r4, r1)
            if (r3 != 0) goto L_0x000e
        L_0x000c:
            androidx.compose.foundation.lazy.layout.a r3 = androidx.compose.foundation.lazy.layout.a.f18291a
        L_0x000e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.d.e(int, long):androidx.compose.foundation.lazy.layout.d$b");
    }

    public final void f(h hVar) {
        this.f18348d = hVar;
    }

    public d(P p10, C17642l<? super K, C16807N> lVar) {
        this.f18345a = p10;
        this.f18346b = lVar;
        this.f18347c = new M();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(P p10, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : p10, (i10 & 2) != 0 ? null : lVar);
    }
}
