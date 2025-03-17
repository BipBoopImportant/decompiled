package a9;

import d9.C7754B;
import d9.C7758d;
import d9.C7761g;
import d9.F;
import kotlin.jvm.internal.C17542s;

public final class V extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final long f42334b;

    /* renamed from: c  reason: collision with root package name */
    public final long f42335c;

    /* renamed from: d  reason: collision with root package name */
    public final long f42336d;

    /* renamed from: e  reason: collision with root package name */
    public final String f42337e;

    public V(long j10, long j11, long j12, String str) {
        C17542s.j(str, "errorSource");
        this.f42334b = j10;
        this.f42335c = j11;
        this.f42336d = j12;
        this.f42337e = str;
        b(j10);
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7758d.a aVar = C7758d.f50778b;
        C7754B.a m10 = C7754B.m();
        C17542s.i(m10, "newBuilder()");
        C7758d a11 = aVar.a(m10);
        a11.e(a());
        a11.b(this.f42335c);
        a11.d(this.f42336d);
        a11.c(this.f42337e);
        a10.d(a11.a());
        return a10.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return this.f42334b == v10.f42334b && this.f42335c == v10.f42335c && this.f42336d == v10.f42336d && C17542s.e(this.f42337e, v10.f42337e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f42335c);
        int hashCode2 = Long.hashCode(this.f42336d);
        return this.f42337e.hashCode() + ((hashCode2 + ((hashCode + (Long.hashCode(this.f42334b) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CrashSrEvent(currentTimestamp=" + this.f42334b + ", crashId=" + this.f42335c + ", relativeTime=" + this.f42336d + ", errorSource=" + this.f42337e + ')';
    }
}
