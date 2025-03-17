package KK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001f\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LKK/a;", "", "", "name", "", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "", "f", "()J", "LKK/d;", "queue", "LXH/N;", "e", "(LKK/d;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "LKK/d;", "d", "()LKK/d;", "setQueue$okhttp", "J", "g", "(J)V", "nextExecuteNanoTime", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: KK.a  reason: case insensitive filesystem */
public abstract class C15993a {

    /* renamed from: a  reason: collision with root package name */
    private final String f135915a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f135916b;

    /* renamed from: c  reason: collision with root package name */
    private C15996d f135917c;

    /* renamed from: d  reason: collision with root package name */
    private long f135918d;

    public C15993a(String str, boolean z10) {
        C17542s.j(str, "name");
        this.f135915a = str;
        this.f135916b = z10;
        this.f135918d = -1;
    }

    public final boolean a() {
        return this.f135916b;
    }

    public final String b() {
        return this.f135915a;
    }

    public final long c() {
        return this.f135918d;
    }

    public final C15996d d() {
        return this.f135917c;
    }

    public final void e(C15996d dVar) {
        C17542s.j(dVar, "queue");
        C15996d dVar2 = this.f135917c;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f135917c = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues");
        }
    }

    public abstract long f();

    public final void g(long j10) {
        this.f135918d = j10;
    }

    public String toString() {
        return this.f135915a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15993a(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
