package MF;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0011\u0010\r¨\u0006\u0017"}, d2 = {"LMF/a;", "", "", "settled", "", "numSetsPending", "numSetsFailed", "<init>", "(ZII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: MF.a  reason: case insensitive filesystem */
public final class C13207a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f112023a;

    /* renamed from: b  reason: collision with root package name */
    private final int f112024b;

    /* renamed from: c  reason: collision with root package name */
    private final int f112025c;

    public C13207a(boolean z10, int i10, int i11) {
        this.f112023a = z10;
        this.f112024b = i10;
        this.f112025c = i11;
    }

    public final int a() {
        return this.f112025c;
    }

    public final int b() {
        return this.f112024b;
    }

    public final boolean c() {
        return this.f112023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13207a)) {
            return false;
        }
        C13207a aVar = (C13207a) obj;
        return this.f112023a == aVar.f112023a && this.f112024b == aVar.f112024b && this.f112025c == aVar.f112025c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f112023a) * 31) + Integer.hashCode(this.f112024b)) * 31) + Integer.hashCode(this.f112025c);
    }

    public String toString() {
        boolean z10 = this.f112023a;
        int i10 = this.f112024b;
        int i11 = this.f112025c;
        return "UploadDataState(settled=" + z10 + ", numSetsPending=" + i10 + ", numSetsFailed=" + i11 + ")";
    }
}
