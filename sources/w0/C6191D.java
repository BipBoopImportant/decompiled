package w0;

import kotlin.Metadata;
import nI.C17642l;
import v0.C6138d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lw0/D;", "", "Lv0/d;", "Lw0/g;", "intervals", "<init>", "(Lv0/d;)V", "", "itemIndex", "", "a", "(I)Z", "Lv0/d;", "getIntervals", "()Lv0/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w0.D  reason: case insensitive filesystem */
public final class C6191D {

    /* renamed from: a  reason: collision with root package name */
    private final C6138d<C6200g> f31130a;

    public C6191D(C6138d<C6200g> dVar) {
        this.f31130a = dVar;
    }

    public final boolean a(int i10) {
        if (i10 < 0 || i10 >= this.f31130a.a()) {
            return false;
        }
        C6138d.a<C6200g> aVar = this.f31130a.get(i10);
        C17642l<Integer, I> b10 = aVar.c().b();
        return b10 != null && b10.invoke(Integer.valueOf(i10 - aVar.b())) == I.f31173b.a();
    }
}
