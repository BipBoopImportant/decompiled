package Wg;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001b"}, d2 = {"LWg/a;", "", "LWg/b;", "errorCode", "LIC/e;", "message", "<init>", "(LWg/b;LIC/e;)V", "", "prefix", "a", "(Ljava/lang/String;)Ljava/lang/String;", "b", "()LIC/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWg/b;", "getErrorCode$common_release", "()LWg/b;", "LIC/e;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f64756c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final b f64757a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f64758b;

    public a(b bVar, C13023e eVar) {
        C17542s.j(bVar, "errorCode");
        C17542s.j(eVar, "message");
        this.f64757a = bVar;
        this.f64758b = eVar;
    }

    public final String a(String str) {
        C17542s.j(str, "prefix");
        String a10 = this.f64757a.a();
        return str + a10;
    }

    public final C13023e b() {
        return this.f64758b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f64757a, aVar.f64757a) && C17542s.e(this.f64758b, aVar.f64758b);
    }

    public int hashCode() {
        return (this.f64757a.hashCode() * 31) + this.f64758b.hashCode();
    }

    public String toString() {
        b bVar = this.f64757a;
        C13023e eVar = this.f64758b;
        return "CheckoutUiError(errorCode=" + bVar + ", message=" + eVar + ")";
    }
}
