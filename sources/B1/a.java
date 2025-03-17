package B1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LB1/a;", "", "", "time", "", "dataPoint", "<init>", "(JF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "d", "(J)V", "F", "()F", "c", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f5158a;

    /* renamed from: b  reason: collision with root package name */
    private float f5159b;

    public a(long j10, float f10) {
        this.f5158a = j10;
        this.f5159b = f10;
    }

    public final float a() {
        return this.f5159b;
    }

    public final long b() {
        return this.f5158a;
    }

    public final void c(float f10) {
        this.f5159b = f10;
    }

    public final void d(long j10) {
        this.f5158a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5158a == aVar.f5158a && Float.compare(this.f5159b, aVar.f5159b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f5158a) * 31) + Float.hashCode(this.f5159b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f5158a + ", dataPoint=" + this.f5159b + ')';
    }
}
