package mL;

import XH.C16807N;
import jL.C17492a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import vL.C18207b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LmL/d;", "T", "LmL/c;", "LjL/a;", "beanDefinition", "<init>", "(LjL/a;)V", "e", "()Ljava/lang/Object;", "LmL/b;", "context", "", "f", "(LmL/b;)Z", "a", "(LmL/b;)Ljava/lang/Object;", "b", "c", "Ljava/lang/Object;", "value", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mL.d  reason: case insensitive filesystem */
public final class C17620d<T> extends C17619c<T> {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public T f144578c;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mL.d$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17620d<T> f144579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17618b f144580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17620d<T> dVar, C17618b bVar) {
            super(0);
            this.f144579c = dVar;
            this.f144580d = bVar;
        }

        public final void invoke() {
            if (!this.f144579c.f(this.f144580d)) {
                C17620d<T> dVar = this.f144579c;
                dVar.f144578c = dVar.a(this.f144580d);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17620d(C17492a<T> aVar) {
        super(aVar);
        C17542s.j(aVar, "beanDefinition");
    }

    private final T e() {
        T t10 = this.f144578c;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    public T a(C17618b bVar) {
        C17542s.j(bVar, "context");
        return this.f144578c == null ? super.a(bVar) : e();
    }

    public T b(C17618b bVar) {
        C17542s.j(bVar, "context");
        C18207b.f149085a.g(this, new a(this, bVar));
        return e();
    }

    public boolean f(C17618b bVar) {
        return this.f144578c != null;
    }
}
