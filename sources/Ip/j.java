package ip;

import XH.C16807N;
import XH.C16818i;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "Landroidx/lifecycle/F;", "Landroidx/lifecycle/y;", "owner", "Lkotlin/Function1;", "LXH/N;", "observer", "a", "(Landroidx/lifecycle/F;Landroidx/lifecycle/y;LnI/l;)V", "Landroidx/lifecycle/K;", "newValue", "b", "(Landroidx/lifecycle/K;Ljava/lang/Object;)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f98526a;

        a(C17642l<? super T, C16807N> lVar) {
            this.f98526a = lVar;
        }

        public final void a(T t10) {
            if (t10 != null) {
                this.f98526a.invoke(t10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f98527a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f98527a = lVar;
        }

        public final C16818i<?> c() {
            return this.f98527a;
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
            this.f98527a.invoke(obj);
        }
    }

    public static final <T> void a(F<? extends T> f10, C5221y yVar, C17642l<? super T, C16807N> lVar) {
        C17542s.j(f10, "<this>");
        C17542s.j(yVar, "owner");
        C17542s.j(lVar, "observer");
        f10.observe(yVar, new b(new a(lVar)));
    }

    public static final <T> void b(K<T> k10, T t10) {
        C17542s.j(k10, "<this>");
        if (!C17542s.e(k10.getValue(), t10)) {
            k10.setValue(t10);
        }
    }
}
