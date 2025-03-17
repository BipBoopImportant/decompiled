package TJ;

import UJ.C16611d;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LTJ/I;", "LUJ/d;", "LTJ/G;", "<init>", "()V", "flow", "", "c", "(LTJ/G;)Z", "", "LdI/e;", "LXH/N;", "d", "(LTJ/G;)[LdI/e;", "", "a", "J", "index", "b", "LdI/e;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.I  reason: case insensitive filesystem */
public final class C16512I extends C16611d<C16510G<?>> {

    /* renamed from: a  reason: collision with root package name */
    public long f138564a = -1;

    /* renamed from: b  reason: collision with root package name */
    public C17164e<? super C16807N> f138565b;

    /* renamed from: c */
    public boolean a(C16510G<?> g10) {
        if (this.f138564a >= 0) {
            return false;
        }
        this.f138564a = g10.Y();
        return true;
    }

    /* renamed from: d */
    public C17164e<C16807N>[] b(C16510G<?> g10) {
        long j10 = this.f138564a;
        this.f138564a = -1;
        this.f138565b = null;
        return g10.X(j10);
    }
}
