package Hz;

import XH.C16807N;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import nI.C17631a;
import xB.C15201a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LHz/a;", "LxB/a;", "", "text", "", "icon", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;LnI/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "c", "LnI/a;", "h", "()LnI/a;", "", "d", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f110906a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f110907b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f110908c;

    /* renamed from: d  reason: collision with root package name */
    private final long f110909d;

    public a(String str, Integer num, C17631a<C16807N> aVar) {
        C17542s.j(str, "text");
        C17542s.j(aVar, "onClick");
        this.f110906a = str;
        this.f110907b = num;
        this.f110908c = aVar;
        U u10 = new U(3);
        u10.a(P.b(a.class));
        u10.a(str);
        u10.b(new Object[]{num});
        this.f110909d = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f110906a, aVar.f110906a) && C17542s.e(this.f110907b, aVar.f110907b) && C17542s.e(this.f110908c, aVar.f110908c);
    }

    public long f() {
        return this.f110909d;
    }

    public final Integer g() {
        return this.f110907b;
    }

    public final C17631a<C16807N> h() {
        return this.f110908c;
    }

    public int hashCode() {
        int hashCode = this.f110906a.hashCode() * 31;
        Integer num = this.f110907b;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f110908c.hashCode();
    }

    public final String i() {
        return this.f110906a;
    }

    public String toString() {
        String str = this.f110906a;
        Integer num = this.f110907b;
        C17631a<C16807N> aVar = this.f110908c;
        return "BannerModel(text=" + str + ", icon=" + num + ", onClick=" + aVar + ")";
    }
}
