package Wk;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LWk/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LWk/a$a;", "status", "<init>", "(LWk/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LWk/a$a;", "()LWk/a$a;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final C1886a f88882a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LWk/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "UNAVAILABLE", "NOT_SUPPORTED", "FEATURE_TURNED_OFF", "UNKNOWN", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wk.a$a  reason: collision with other inner class name */
    public enum C1886a {
        UNAVAILABLE,
        NOT_SUPPORTED,
        FEATURE_TURNED_OFF,
        UNKNOWN;

        static {
            C1886a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public a(C1886a aVar) {
        C17542s.j(aVar, "status");
        this.f88882a = aVar;
    }

    public final C1886a a() {
        return this.f88882a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f88882a == ((a) obj).f88882a;
    }

    public int hashCode() {
        return this.f88882a.hashCode();
    }

    public String toString() {
        C1886a aVar = this.f88882a;
        return "AvailabilityError(status=" + aVar + ")";
    }
}
