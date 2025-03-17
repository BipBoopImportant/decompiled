package s1;

import j0.O;
import j0.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.M0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ls1/a;", "", "<init>", "()V", "Ls1/c;", "graphicsLayer", "", "i", "(Ls1/c;)Z", "a", "Ls1/c;", "dependency", "b", "oldDependency", "Lj0/O;", "c", "Lj0/O;", "dependenciesSet", "d", "oldDependenciesSet", "e", "Z", "trackingInProgress", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.a  reason: case insensitive filesystem */
public final class C5903a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public C5905c f28934a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public C5905c f28935b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public O<C5905c> f28936c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public O<C5905c> f28937d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f28938e;

    public final boolean i(C5905c cVar) {
        if (!this.f28938e) {
            M0.a("Only add dependencies during a tracking");
        }
        O<C5905c> o10 = this.f28936c;
        if (o10 != null) {
            C17542s.g(o10);
            o10.h(cVar);
        } else if (this.f28934a != null) {
            O<C5905c> a10 = a0.a();
            C5905c cVar2 = this.f28934a;
            C17542s.g(cVar2);
            a10.h(cVar2);
            a10.h(cVar);
            this.f28936c = a10;
            this.f28934a = null;
        } else {
            this.f28934a = cVar;
        }
        O<C5905c> o11 = this.f28937d;
        if (o11 != null) {
            C17542s.g(o11);
            return !o11.x(cVar);
        } else if (this.f28935b != cVar) {
            return true;
        } else {
            this.f28935b = null;
            return false;
        }
    }
}
