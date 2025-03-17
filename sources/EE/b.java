package ee;

import Wd.M;
import XH.C16807N;
import XH.C16818i;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.L;
import cD.C14029a;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import java.util.Map;
import kD.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH&¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0016\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lee/b;", "LWd/M;", "LcD/a;", "repository", "<init>", "(LcD/a;)V", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "f", "(LnI/l;)Landroidx/lifecycle/F;", "", "", "data", "j", "(Ljava/util/Map;LnI/l;)V", "b", "(LnI/l;)V", "c", "a", "LcD/a;", "h", "()LcD/a;", "Landroidx/lifecycle/I;", "Landroidx/lifecycle/I;", "configurationLiveData", "g", "()Landroidx/lifecycle/I;", "configuration", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b implements M {

    /* renamed from: a  reason: collision with root package name */
    private final C14029a f72631a;

    /* renamed from: b  reason: collision with root package name */
    private final I<DynamicFields$Configuration> f72632b;

    /* renamed from: c  reason: collision with root package name */
    private final I<DynamicFields$Configuration> f72633c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f72634a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f72634a = lVar;
        }

        public final C16818i<?> c() {
            return this.f72634a;
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
            this.f72634a.invoke(obj);
        }
    }

    public b(C14029a aVar) {
        C17542s.j(aVar, "repository");
        this.f72631a = aVar;
        I<DynamicFields$Configuration> i10 = new I<>();
        this.f72632b = i10;
        this.f72633c = i10;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(b bVar, DynamicFields$Configuration dynamicFields$Configuration) {
        bVar.f72632b.setValue(dynamicFields$Configuration);
        return C16807N.f139792a;
    }

    public void b(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        this.f72632b.b(f(lVar), new a(new C9648a(this)));
    }

    public void c(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        j(map, lVar);
    }

    public void d(C17642l<? super l, C16807N> lVar) {
        M.a.a(this, lVar);
    }

    public abstract F<DynamicFields$Configuration> f(C17642l<? super l, C16807N> lVar);

    /* renamed from: g */
    public I<DynamicFields$Configuration> a() {
        return this.f72633c;
    }

    /* access modifiers changed from: protected */
    public final C14029a h() {
        return this.f72631a;
    }

    public abstract void j(Map<String, String> map, C17642l<? super l, C16807N> lVar);
}
