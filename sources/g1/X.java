package G1;

import W0.b;
import XH.C16807N;
import java.util.List;
import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LG1/X;", "T", "", "LW0/b;", "vector", "Lkotlin/Function0;", "LXH/N;", "onVectorMutated", "<init>", "(LW0/b;LnI/a;)V", "c", "()V", "", "index", "element", "a", "(ILjava/lang/Object;)V", "g", "(I)Ljava/lang/Object;", "", "b", "()Ljava/util/List;", "d", "LW0/b;", "f", "()LW0/b;", "LnI/a;", "getOnVectorMutated", "()LnI/a;", "e", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class X<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final int f6404c = b.f14622d;

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f6405a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f6406b;

    public X(b<T> bVar, C17631a<C16807N> aVar) {
        this.f6405a = bVar;
        this.f6406b = aVar;
    }

    public final void a(int i10, T t10) {
        this.f6405a.a(i10, t10);
        this.f6406b.invoke();
    }

    public final List<T> b() {
        return this.f6405a.j();
    }

    public final void c() {
        this.f6405a.k();
        this.f6406b.invoke();
    }

    public final T d(int i10) {
        return this.f6405a.q()[i10];
    }

    public final int e() {
        return this.f6405a.r();
    }

    public final b<T> f() {
        return this.f6405a;
    }

    public final T g(int i10) {
        T B10 = this.f6405a.B(i10);
        this.f6406b.invoke();
        return B10;
    }
}
