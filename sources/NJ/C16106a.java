package NJ;

import PJ.C16209c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\fR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001c"}, d2 = {"LNJ/a;", "V", "", "value", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "h", "(Ljava/lang/Object;)LNJ/a;", "newPrevious", "g", "newNext", "f", "a", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "b", "d", "c", "", "()Z", "hasNext", "hasPrevious", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: NJ.a  reason: case insensitive filesystem */
public final class C16106a<V> {

    /* renamed from: a  reason: collision with root package name */
    private final V f136577a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f136578b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f136579c;

    public C16106a(V v10, Object obj, Object obj2) {
        this.f136577a = v10;
        this.f136578b = obj;
        this.f136579c = obj2;
    }

    public final boolean a() {
        return this.f136579c != C16209c.f137201a;
    }

    public final boolean b() {
        return this.f136578b != C16209c.f137201a;
    }

    public final Object c() {
        return this.f136579c;
    }

    public final Object d() {
        return this.f136578b;
    }

    public final V e() {
        return this.f136577a;
    }

    public final C16106a<V> f(Object obj) {
        return new C16106a<>(this.f136577a, this.f136578b, obj);
    }

    public final C16106a<V> g(Object obj) {
        return new C16106a<>(this.f136577a, obj, this.f136579c);
    }

    public final C16106a<V> h(V v10) {
        return new C16106a<>(v10, this.f136578b, this.f136579c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16106a(V r2) {
        /*
            r1 = this;
            PJ.c r0 = PJ.C16209c.f137201a
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: NJ.C16106a.<init>(java.lang.Object):void");
    }

    public C16106a(V v10, Object obj) {
        this(v10, obj, C16209c.f137201a);
    }
}
