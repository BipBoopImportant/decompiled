package kF;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001c"}, d2 = {"LkF/P;", "", "", "uri", "contentDescription", "LkF/a;", "aspectRatio", "", "placeholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;LkF/a;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getContentDescription", "LkF/a;", "()LkF/a;", "d", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.P  reason: case insensitive filesystem */
public final class C14695P {

    /* renamed from: a  reason: collision with root package name */
    private final String f128715a;

    /* renamed from: b  reason: collision with root package name */
    private final String f128716b;

    /* renamed from: c  reason: collision with root package name */
    private final C14705a f128717c;

    /* renamed from: d  reason: collision with root package name */
    private final int f128718d;

    public C14695P(String str, String str2, C14705a aVar, int i10) {
        C17542s.j(str, "uri");
        C17542s.j(aVar, "aspectRatio");
        this.f128715a = str;
        this.f128716b = str2;
        this.f128717c = aVar;
        this.f128718d = i10;
    }

    public final C14705a a() {
        return this.f128717c;
    }

    public final int b() {
        return this.f128718d;
    }

    public final String c() {
        return this.f128715a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14695P)) {
            return false;
        }
        C14695P p10 = (C14695P) obj;
        return C17542s.e(this.f128715a, p10.f128715a) && C17542s.e(this.f128716b, p10.f128716b) && this.f128717c == p10.f128717c && this.f128718d == p10.f128718d;
    }

    public int hashCode() {
        int hashCode = this.f128715a.hashCode() * 31;
        String str = this.f128716b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f128717c.hashCode()) * 31) + Integer.hashCode(this.f128718d);
    }

    public String toString() {
        String str = this.f128715a;
        String str2 = this.f128716b;
        C14705a aVar = this.f128717c;
        int i10 = this.f128718d;
        return "VideoParams(uri=" + str + ", contentDescription=" + str2 + ", aspectRatio=" + aVar + ", placeholder=" + i10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14695P(String str, String str2, C14705a aVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? C14705a.RATIO_16_9 : aVar, i10);
    }
}
