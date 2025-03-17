package O0;

import A0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001b"}, d2 = {"LO0/C0;", "", "LA0/a;", "extraSmall", "small", "medium", "large", "extraLarge", "<init>", "(LA0/a;LA0/a;LA0/a;LA0/a;LA0/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LA0/a;", "b", "()LA0/a;", "e", "c", "d", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f9697a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9698b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9699c;

    /* renamed from: d  reason: collision with root package name */
    private final a f9700d;

    /* renamed from: e  reason: collision with root package name */
    private final a f9701e;

    public C0() {
        this((a) null, (a) null, (a) null, (a) null, (a) null, 31, (DefaultConstructorMarker) null);
    }

    public final a a() {
        return this.f9701e;
    }

    public final a b() {
        return this.f9697a;
    }

    public final a c() {
        return this.f9700d;
    }

    public final a d() {
        return this.f9699c;
    }

    public final a e() {
        return this.f9698b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return C17542s.e(this.f9697a, c02.f9697a) && C17542s.e(this.f9698b, c02.f9698b) && C17542s.e(this.f9699c, c02.f9699c) && C17542s.e(this.f9700d, c02.f9700d) && C17542s.e(this.f9701e, c02.f9701e);
    }

    public int hashCode() {
        return (((((((this.f9697a.hashCode() * 31) + this.f9698b.hashCode()) * 31) + this.f9699c.hashCode()) * 31) + this.f9700d.hashCode()) * 31) + this.f9701e.hashCode();
    }

    public String toString() {
        return "Shapes(extraSmall=" + this.f9697a + ", small=" + this.f9698b + ", medium=" + this.f9699c + ", large=" + this.f9700d + ", extraLarge=" + this.f9701e + ')';
    }

    public C0(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f9697a = aVar;
        this.f9698b = aVar2;
        this.f9699c = aVar3;
        this.f9700d = aVar4;
        this.f9701e = aVar5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C0(A0.a r4, A0.a r5, A0.a r6, A0.a r7, A0.a r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            O0.B0 r4 = O0.B0.f9688a
            A0.a r4 = r4.b()
        L_0x000a:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0014
            O0.B0 r5 = O0.B0.f9688a
            A0.a r5 = r5.e()
        L_0x0014:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001f
            O0.B0 r5 = O0.B0.f9688a
            A0.a r6 = r5.d()
        L_0x001f:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x002a
            O0.B0 r5 = O0.B0.f9688a
            A0.a r7 = r5.c()
        L_0x002a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0035
            O0.B0 r5 = O0.B0.f9688a
            A0.a r8 = r5.a()
        L_0x0035:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C0.<init>(A0.a, A0.a, A0.a, A0.a, A0.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
