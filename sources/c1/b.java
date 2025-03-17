package C1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"LC1/b;", "", "", "verticalScrollPixels", "horizontalScrollPixels", "", "uptimeMillis", "", "inputDeviceId", "<init>", "(FFJI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "getVerticalScrollPixels", "()F", "b", "getHorizontalScrollPixels", "c", "J", "getUptimeMillis", "()J", "d", "I", "getInputDeviceId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final float f5491a;

    /* renamed from: b  reason: collision with root package name */
    private final float f5492b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5493c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5494d;

    public b(float f10, float f11, long j10, int i10) {
        this.f5491a = f10;
        this.f5492b = f11;
        this.f5493c = j10;
        this.f5494d = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            return bVar.f5491a == this.f5491a && bVar.f5492b == this.f5492b && bVar.f5493c == this.f5493c && bVar.f5494d == this.f5494d;
        }
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f5491a) * 31) + Float.hashCode(this.f5492b)) * 31) + Long.hashCode(this.f5493c)) * 31) + Integer.hashCode(this.f5494d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f5491a + ",horizontalScrollPixels=" + this.f5492b + ",uptimeMillis=" + this.f5493c + ",deviceId=" + this.f5494d + ')';
    }
}
