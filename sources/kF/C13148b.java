package KF;

import GK.C15776D;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0017\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001a¨\u0006'"}, d2 = {"LKF/b;", "", "", "success", "", "durationMs", "LGK/D;", "lastApiResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "alreadyUploaded", "<init>", "(ZJLGK/D;Ljava/lang/Exception;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "J", "getDurationMs", "()J", "c", "LGK/D;", "getLastApiResponse", "()LGK/D;", "d", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "e", "getAlreadyUploaded", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: KF.b  reason: case insensitive filesystem */
public final class C13148b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f111646a;

    /* renamed from: b  reason: collision with root package name */
    private final long f111647b;

    /* renamed from: c  reason: collision with root package name */
    private final C15776D f111648c;

    /* renamed from: d  reason: collision with root package name */
    private final Exception f111649d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f111650e;

    public C13148b(boolean z10, long j10, C15776D d10, Exception exc, boolean z11) {
        this.f111646a = z10;
        this.f111647b = j10;
        this.f111648c = d10;
        this.f111649d = exc;
        this.f111650e = z11;
    }

    public final Exception a() {
        return this.f111649d;
    }

    public final boolean b() {
        return this.f111646a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13148b)) {
            return false;
        }
        C13148b bVar = (C13148b) obj;
        return this.f111646a == bVar.f111646a && this.f111647b == bVar.f111647b && C17542s.e(this.f111648c, bVar.f111648c) && C17542s.e(this.f111649d, bVar.f111649d) && this.f111650e == bVar.f111650e;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f111646a) * 31) + Long.hashCode(this.f111647b)) * 31;
        C15776D d10 = this.f111648c;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Exception exc = this.f111649d;
        if (exc != null) {
            i10 = exc.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f111650e);
    }

    public String toString() {
        boolean z10 = this.f111646a;
        long j10 = this.f111647b;
        C15776D d10 = this.f111648c;
        Exception exc = this.f111649d;
        boolean z11 = this.f111650e;
        return "FileUploadResult(success=" + z10 + ", durationMs=" + j10 + ", lastApiResponse=" + d10 + ", exception=" + exc + ", alreadyUploaded=" + z11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13148b(boolean z10, long j10, C15776D d10, Exception exc, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, j10, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : exc, (i10 & 16) != 0 ? false : z11);
    }
}
