package v8;

import E8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lv8/b;", "", "LE8/c;", "preferenceStore", "<init>", "(LE8/c;)V", "LXH/N;", "e", "()V", "a", "LE8/c;", "", "b", "I", "lastScreenNumber", "()I", "currentScreenNumber", "", "()J", "currentScreenTimestamp", "", "c", "()Z", "isScreenNumberChanged", "d", "isSentBeforeFirstScreen", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f56960a;

    /* renamed from: b  reason: collision with root package name */
    private int f56961b;

    public b(c cVar) {
        C17542s.j(cVar, "preferenceStore");
        this.f56960a = cVar;
    }

    public final int a() {
        return this.f56960a.d(E8.b.SCREEN_NUMBER, 0);
    }

    public final long b() {
        return this.f56960a.e(E8.b.SCREEN_TIMESTAMP, 0);
    }

    public final boolean c() {
        return a() != this.f56961b;
    }

    public final boolean d() {
        return this.f56960a.d(E8.b.SCREEN_NUMBER, 0) == 0;
    }

    public final void e() {
        this.f56961b = a();
    }
}
