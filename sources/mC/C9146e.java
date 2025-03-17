package Mc;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LMc/e;", "", "LMc/d;", "performance", "crashlytics", "", "sessionSamplingRate", "<init>", "(LMc/d;LMc/d;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMc/d;", "b", "()LMc/d;", "c", "D", "()D", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Mc.e  reason: case insensitive filesystem */
public final class C9146e {

    /* renamed from: a  reason: collision with root package name */
    private final C9145d f61807a;

    /* renamed from: b  reason: collision with root package name */
    private final C9145d f61808b;

    /* renamed from: c  reason: collision with root package name */
    private final double f61809c;

    public C9146e() {
        this((C9145d) null, (C9145d) null, 0.0d, 7, (DefaultConstructorMarker) null);
    }

    public final C9145d a() {
        return this.f61808b;
    }

    public final C9145d b() {
        return this.f61807a;
    }

    public final double c() {
        return this.f61809c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9146e)) {
            return false;
        }
        C9146e eVar = (C9146e) obj;
        return this.f61807a == eVar.f61807a && this.f61808b == eVar.f61808b && Double.compare(this.f61809c, eVar.f61809c) == 0;
    }

    public int hashCode() {
        return (((this.f61807a.hashCode() * 31) + this.f61808b.hashCode()) * 31) + Double.hashCode(this.f61809c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f61807a + ", crashlytics=" + this.f61808b + ", sessionSamplingRate=" + this.f61809c + ')';
    }

    public C9146e(C9145d dVar, C9145d dVar2, double d10) {
        C17542s.j(dVar, "performance");
        C17542s.j(dVar2, "crashlytics");
        this.f61807a = dVar;
        this.f61808b = dVar2;
        this.f61809c = d10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9146e(C9145d dVar, C9145d dVar2, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C9145d.COLLECTION_SDK_NOT_INSTALLED : dVar, (i10 & 2) != 0 ? C9145d.COLLECTION_SDK_NOT_INSTALLED : dVar2, (i10 & 4) != 0 ? 1.0d : d10);
    }
}
