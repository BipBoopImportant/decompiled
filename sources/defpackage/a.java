package defpackage;

import c2.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0000B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0000\u0010\u0006\u001a\u0004\b\u0000\u0010\u0007\u0001\u0001\b¨\u0006\t"}, d2 = {"La;", "", "Lc2/v;", "min", "<init>", "(J)V", "J", "()J", "La$a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: a  reason: default package */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f14964a;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0001\u0010\u0013¨\u0006\u0014"}, d2 = {"La$a;", "La;", "Lc2/v;", "min", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "()J", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: a$a  reason: collision with other inner class name */
    public static final class C0219a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final long f14965b;

        public /* synthetic */ C0219a(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        public long a() {
            return this.f14965b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0219a) && v.e(this.f14965b, ((C0219a) obj).f14965b);
        }

        public int hashCode() {
            return v.i(this.f14965b);
        }

        public String toString() {
            String j10 = v.j(this.f14965b);
            return "Width(min=" + j10 + ")";
        }

        private C0219a(long j10) {
            super(j10, (DefaultConstructorMarker) null);
            this.f14965b = j10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0219a(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? v.f23057b.a() : j10, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ a(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public abstract long a();

    private a(long j10) {
        this.f14964a = j10;
    }
}
