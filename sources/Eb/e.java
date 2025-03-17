package eb;

import android.app.PendingIntent;

final class e extends C9631b {

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f72570a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f72571b;

    e(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            this.f72570a = pendingIntent;
            this.f72571b = z10;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent a() {
        return this.f72570a;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f72571b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9631b) {
            C9631b bVar = (C9631b) obj;
            return this.f72570a.equals(bVar.a()) && this.f72571b == bVar.b();
        }
    }

    public final int hashCode() {
        return ((this.f72570a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f72571b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f72570a.toString();
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + this.f72571b + "}";
    }
}
