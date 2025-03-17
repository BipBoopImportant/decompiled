package An;

import KJ.C15987c;
import com.ingka.ikea.core.model.KeyBenefit;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LAn/n;", "LAn/o;", "", "title", "LKJ/c;", "Lcom/ingka/ikea/core/model/KeyBenefit;", "keyBenefitsList", "<init>", "(Ljava/lang/String;LKJ/c;)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "LKJ/c;", "g", "()LKJ/c;", "", "c", "J", "f", "()J", "stableId", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends o {

    /* renamed from: a  reason: collision with root package name */
    private final String f79023a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<KeyBenefit> f79024b;

    /* renamed from: c  reason: collision with root package name */
    private final long f79025c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, C15987c<KeyBenefit> cVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(cVar, "keyBenefitsList");
        this.f79023a = str;
        this.f79024b = cVar;
        String valueOf = String.valueOf(cVar.hashCode());
        U u10 = new U(3);
        u10.a(P.b(n.class));
        u10.a(valueOf);
        u10.b(new Object[0]);
        this.f79025c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public long f() {
        return this.f79025c;
    }

    public final C15987c<KeyBenefit> g() {
        return this.f79024b;
    }

    public final String h() {
        return this.f79023a;
    }
}
