package androidx.lifecycle;

import XH.C16807N;
import XH.C16818i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.O;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"X", "Y", "Landroidx/lifecycle/F;", "Lkotlin/Function1;", "transform", "b", "(Landroidx/lifecycle/F;LnI/l;)Landroidx/lifecycle/F;", "c", "a", "(Landroidx/lifecycle/F;)Landroidx/lifecycle/F;", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "kotlin.jvm.PlatformType", "value", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<X, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ I<X> f22267c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f22268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(I<X> i10, K k10) {
            super(1);
            this.f22267c = i10;
            this.f22268d = k10;
        }

        public final void a(X x10) {
            X value = this.f22267c.getValue();
            if (this.f22268d.f144344a || ((value == null && x10 != null) || (value != null && !C17542s.e(value, x10)))) {
                this.f22268d.f144344a = false;
                this.f22267c.setValue(x10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<X, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ I<Y> f22269c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<X, Y> f22270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(I<Y> i10, C17642l<X, Y> lVar) {
            super(1);
            this.f22269c = i10;
            this.f22270d = lVar;
        }

        public final void a(X x10) {
            this.f22269c.setValue(this.f22270d.invoke(x10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f22271a;

        c(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f22271a = lVar;
        }

        public final C16818i<?> c() {
            return this.f22271a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f22271a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"X", "Y", "value", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<X, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<X, F<Y>> f22272c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O<F<Y>> f22273d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ I<Y> f22274e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<Y, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ I<Y> f22275c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(I<Y> i10) {
                super(1);
                this.f22275c = i10;
            }

            public final void a(Y y10) {
                this.f22275c.setValue(y10);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17642l<X, F<Y>> lVar, O<F<Y>> o10, I<Y> i10) {
            super(1);
            this.f22272c = lVar;
            this.f22273d = o10;
            this.f22274e = i10;
        }

        public final void a(X x10) {
            T t10 = (F) this.f22272c.invoke(x10);
            T t11 = this.f22273d.f144348a;
            if (t11 != t10) {
                if (t11 != null) {
                    I<Y> i10 = this.f22274e;
                    C17542s.g(t11);
                    i10.c((F) t11);
                }
                this.f22273d.f144348a = t10;
                if (t10 != null) {
                    I<Y> i11 = this.f22274e;
                    C17542s.g(t10);
                    i11.b(t10, new c(new a(this.f22274e)));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    public static final <X> F<X> a(F<X> f10) {
        I i10;
        C17542s.j(f10, "<this>");
        K k10 = new K();
        k10.f144344a = true;
        if (f10.isInitialized()) {
            k10.f144344a = false;
            i10 = new I(f10.getValue());
        } else {
            i10 = new I();
        }
        i10.b(f10, new c(new a(i10, k10)));
        return i10;
    }

    public static final <X, Y> F<Y> b(F<X> f10, C17642l<X, Y> lVar) {
        C17542s.j(f10, "<this>");
        C17542s.j(lVar, "transform");
        I i10 = f10.isInitialized() ? new I(lVar.invoke(f10.getValue())) : new I();
        i10.b(f10, new c(new b(i10, lVar)));
        return i10;
    }

    public static final <X, Y> F<Y> c(F<X> f10, C17642l<X, F<Y>> lVar) {
        I i10;
        C17542s.j(f10, "<this>");
        C17542s.j(lVar, "transform");
        O o10 = new O();
        if (f10.isInitialized()) {
            F invoke = lVar.invoke(f10.getValue());
            i10 = (invoke == null || !invoke.isInitialized()) ? new I() : new I(invoke.getValue());
        } else {
            i10 = new I();
        }
        i10.b(f10, new c(new d(lVar, o10, i10)));
        return i10;
    }
}
