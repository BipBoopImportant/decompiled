package XH;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"LXH/B;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/Object;", "b", "c", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "d", "e", "f", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.B  reason: case insensitive filesystem */
public final class C16795B<A, B, C> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final A f139768a;

    /* renamed from: b  reason: collision with root package name */
    private final B f139769b;

    /* renamed from: c  reason: collision with root package name */
    private final C f139770c;

    public C16795B(A a10, B b10, C c10) {
        this.f139768a = a10;
        this.f139769b = b10;
        this.f139770c = c10;
    }

    public final A a() {
        return this.f139768a;
    }

    public final B b() {
        return this.f139769b;
    }

    public final C c() {
        return this.f139770c;
    }

    public final A d() {
        return this.f139768a;
    }

    public final B e() {
        return this.f139769b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16795B)) {
            return false;
        }
        C16795B b10 = (C16795B) obj;
        return C17542s.e(this.f139768a, b10.f139768a) && C17542s.e(this.f139769b, b10.f139769b) && C17542s.e(this.f139770c, b10.f139770c);
    }

    public final C f() {
        return this.f139770c;
    }

    public int hashCode() {
        A a10 = this.f139768a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f139769b;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f139770c;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return '(' + this.f139768a + ", " + this.f139769b + ", " + this.f139770c + ')';
    }
}
