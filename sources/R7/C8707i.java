package r7;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lr7/i;", "", "", "name", "Ljava/time/Instant;", "endDate", "<init>", "(Ljava/lang/String;Ljava/time/Instant;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/Instant;", "()Ljava/time/Instant;", "c", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: r7.i  reason: case insensitive filesystem */
public final class C8707i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f55772c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f55773a;

    /* renamed from: b  reason: collision with root package name */
    private final Instant f55774b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr7/i$a;", "", "<init>", "()V", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: r7.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C8707i(String str, Instant instant) {
        C17542s.j(str, "name");
        C17542s.j(instant, "endDate");
        this.f55773a = str;
        this.f55774b = instant;
    }

    public final Instant a() {
        return this.f55774b;
    }

    public final String b() {
        return this.f55773a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8707i)) {
            return false;
        }
        C8707i iVar = (C8707i) obj;
        return C17542s.e(this.f55773a, iVar.f55773a) && C17542s.e(this.f55774b, iVar.f55774b);
    }

    public int hashCode() {
        return (this.f55773a.hashCode() * 31) + this.f55774b.hashCode();
    }

    public String toString() {
        return "PreviousOperator(name=" + this.f55773a + ", endDate=" + this.f55774b + ')';
    }
}
