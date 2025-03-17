package M8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"LM8/b;", "", "", "duration", "", "durationLevel", "requestSizeLevel", "responseSizeLevel", "<init>", "(JILjava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getDuration", "()J", "b", "I", "getDurationLevel", "c", "Ljava/lang/Integer;", "getRequestSizeLevel", "()Ljava/lang/Integer;", "d", "getResponseSizeLevel", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final long f38635a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38636b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f38637c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f38638d;

    public b(long j10, int i10, Integer num, Integer num2) {
        this.f38635a = j10;
        this.f38636b = i10;
        this.f38637c = num;
        this.f38638d = num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f38635a == bVar.f38635a && this.f38636b == bVar.f38636b && C17542s.e(this.f38637c, bVar.f38637c) && C17542s.e(this.f38638d, bVar.f38638d);
    }

    public int hashCode() {
        int hashCode = (Integer.hashCode(this.f38636b) + (Long.hashCode(this.f38635a) * 31)) * 31;
        Integer num = this.f38637c;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f38638d;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "ApiErrorCollectionDuration(duration=" + this.f38635a + ", durationLevel=" + this.f38636b + ", requestSizeLevel=" + this.f38637c + ", responseSizeLevel=" + this.f38638d + ')';
    }
}
