package IJ;

import IJ.C15915k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"LIJ/i;", "", "<init>", "()V", "", "e", "()J", "", "toString", "()Ljava/lang/String;", "LIJ/k$a$a;", "d", "timeMark", "LIJ/b;", "c", "(J)J", "one", "another", "b", "(JJ)J", "J", "zero", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: IJ.i  reason: case insensitive filesystem */
public final class C15913i implements C15915k {

    /* renamed from: a  reason: collision with root package name */
    public static final C15913i f135503a = new C15913i();

    /* renamed from: b  reason: collision with root package name */
    private static final long f135504b = System.nanoTime();

    private C15913i() {
    }

    private final long e() {
        return System.nanoTime() - f135504b;
    }

    public /* bridge */ /* synthetic */ C15914j a() {
        return C15915k.a.C3333a.b(d());
    }

    public final long b(long j10, long j11) {
        return C15912h.d(j10, j11, C15909e.NANOSECONDS);
    }

    public final long c(long j10) {
        return C15912h.b(e(), j10, C15909e.NANOSECONDS);
    }

    public long d() {
        return C15915k.a.C3333a.m(e());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
