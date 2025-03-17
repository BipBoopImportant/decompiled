package ip;

import XH.C16807N;
import XH.C16818i;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lip/b;", "T", "Landroidx/lifecycle/K;", "<init>", "()V", "Landroidx/lifecycle/y;", "owner", "Landroidx/lifecycle/L;", "observer", "LXH/N;", "observe", "(Landroidx/lifecycle/y;Landroidx/lifecycle/L;)V", "data", "e", "(Ljava/lang/Object;)V", "d", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ip.b  reason: case insensitive filesystem */
public final class C11410b<T> extends K<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ip.b$a */
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f98521a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f98521a = lVar;
        }

        public final C16818i<?> c() {
            return this.f98521a;
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
            this.f98521a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(L l10, C11410b bVar, Object obj) {
        if (obj == null) {
            return C16807N.f139792a;
        }
        l10.onChanged(obj);
        bVar.setValue(null);
        return C16807N.f139792a;
    }

    public final void d(T t10) {
        postValue(t10);
    }

    public final void e(T t10) {
        setValue(t10);
    }

    public void observe(C5221y yVar, L<? super T> l10) {
        C17542s.j(yVar, "owner");
        C17542s.j(l10, "observer");
        super.observe(yVar, new a(new C11409a(l10, this)));
    }
}
