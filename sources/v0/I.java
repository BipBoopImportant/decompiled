package v0;

import W0.b;
import XH.C16807N;
import kotlin.Metadata;
import nI.C17642l;
import v0.C6138d;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u000b0\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\tR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\u0011\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00058\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001d\u0010\"R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006%"}, d2 = {"Lv0/I;", "T", "Lv0/d;", "<init>", "()V", "", "itemIndex", "Lv0/d$a;", "f", "(I)Lv0/d$a;", "index", "LXH/N;", "d", "(I)V", "", "e", "(Lv0/d$a;I)Z", "size", "value", "c", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "b", "(IILnI/l;)V", "get", "LW0/b;", "a", "LW0/b;", "intervals", "<set-?>", "I", "()I", "Lv0/d$a;", "lastInterval", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I<T> implements C6138d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<C6138d.a<T>> f30824a = new b<>(new C6138d.a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private int f30825b;

    /* renamed from: c  reason: collision with root package name */
    private C6138d.a<? extends T> f30826c;

    private final void d(int i10) {
        if (i10 < 0 || i10 >= a()) {
            throw new IndexOutOfBoundsException("Index " + i10 + ", size " + a());
        }
    }

    private final boolean e(C6138d.a<? extends T> aVar, int i10) {
        return i10 < aVar.b() + aVar.a() && aVar.b() <= i10;
    }

    private final C6138d.a<T> f(int i10) {
        C6138d.a<? extends T> aVar = this.f30826c;
        if (aVar != null && e(aVar, i10)) {
            return aVar;
        }
        b<C6138d.a<T>> bVar = this.f30824a;
        C6138d.a<? extends T> aVar2 = (C6138d.a) bVar.q()[C6139e.b(bVar, i10)];
        this.f30826c = aVar2;
        return aVar2;
    }

    public int a() {
        return this.f30825b;
    }

    public void b(int i10, int i11, C17642l<? super C6138d.a<? extends T>, C16807N> lVar) {
        d(i10);
        d(i11);
        if (i11 >= i10) {
            int a10 = C6139e.b(this.f30824a, i10);
            int b10 = ((C6138d.a) this.f30824a.q()[a10]).b();
            while (b10 <= i11) {
                C6138d.a aVar = (C6138d.a) this.f30824a.q()[a10];
                lVar.invoke(aVar);
                b10 += aVar.a();
                a10++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
    }

    public final void c(int i10, T t10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i10).toString());
        } else if (i10 != 0) {
            C6138d.a aVar = new C6138d.a(a(), i10, t10);
            this.f30825b = a() + i10;
            this.f30824a.b(aVar);
        }
    }

    public C6138d.a<T> get(int i10) {
        d(i10);
        return f(i10);
    }
}
