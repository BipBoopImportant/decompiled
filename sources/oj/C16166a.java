package OJ;

import PJ.C16209c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0017"}, d2 = {"LOJ/a;", "", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "newNext", "e", "(Ljava/lang/Object;)LOJ/a;", "newPrevious", "f", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "c", "", "()Z", "hasNext", "hasPrevious", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: OJ.a  reason: case insensitive filesystem */
public final class C16166a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f136918a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f136919b;

    public C16166a(Object obj, Object obj2) {
        this.f136918a = obj;
        this.f136919b = obj2;
    }

    public final boolean a() {
        return this.f136919b != C16209c.f137201a;
    }

    public final boolean b() {
        return this.f136918a != C16209c.f137201a;
    }

    public final Object c() {
        return this.f136919b;
    }

    public final Object d() {
        return this.f136918a;
    }

    public final C16166a e(Object obj) {
        return new C16166a(this.f136918a, obj);
    }

    public final C16166a f(Object obj) {
        return new C16166a(obj, this.f136919b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16166a() {
        /*
            r1 = this;
            PJ.c r0 = PJ.C16209c.f137201a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OJ.C16166a.<init>():void");
    }

    public C16166a(Object obj) {
        this(obj, C16209c.f137201a);
    }
}
