package qF;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"LqF/a;", "", "", "postDelay", "", "delayedTextRes", "", "emphasized", "<init>", "(JIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "I", "Z", "()Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qF.a  reason: case insensitive filesystem */
public final class C14954a {

    /* renamed from: a  reason: collision with root package name */
    private final long f130479a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130480b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f130481c;

    public C14954a(long j10, int i10, boolean z10) {
        this.f130479a = j10;
        this.f130480b = i10;
        this.f130481c = z10;
    }

    public final int a() {
        return this.f130480b;
    }

    public final boolean b() {
        return this.f130481c;
    }

    public final long c() {
        return this.f130479a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14954a)) {
            return false;
        }
        C14954a aVar = (C14954a) obj;
        return this.f130479a == aVar.f130479a && this.f130480b == aVar.f130480b && this.f130481c == aVar.f130481c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f130479a) * 31) + Integer.hashCode(this.f130480b)) * 31) + Boolean.hashCode(this.f130481c);
    }

    public String toString() {
        long j10 = this.f130479a;
        int i10 = this.f130480b;
        boolean z10 = this.f130481c;
        return "DelayedText(postDelay=" + j10 + ", delayedTextRes=" + i10 + ", emphasized=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14954a(long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, (i11 & 4) != 0 ? false : z10);
    }
}
