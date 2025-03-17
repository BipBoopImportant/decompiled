package U0;

import XH.C16820k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0010X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LU0/D;", "T", "LU0/I0;", "Lkotlin/Function1;", "LU0/w;", "defaultComputation", "<init>", "(LnI/l;)V", "value", "LU0/J0;", "c", "(Ljava/lang/Object;)LU0/J0;", "LU0/E;", "b", "LU0/E;", "g", "()LU0/E;", "defaultValueHolder", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class D<T> extends I0<T> {

    /* renamed from: b  reason: collision with root package name */
    private final E<T> f13740b;

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements C17631a<T> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f13741c = new a();

        a() {
            super(0);
        }

        public final T invoke() {
            C4895p.t("Unexpected call to default provider");
            throw new C16820k();
        }
    }

    public D(C17642l<? super C4908w, ? extends T> lVar) {
        super(a.f13741c);
        this.f13740b = new E<>(lVar);
    }

    public J0<T> c(T t10) {
        return new J0(this, t10, t10 == null, (o1) null, (C4899r0) null, (C17642l) null, true);
    }

    /* renamed from: g */
    public E<T> a() {
        return this.f13740b;
    }
}
