package rz;

import Sy.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lrz/P;", "", "", "barcode", "LSy/a$b;", "specialType", "<init>", "(Ljava/lang/String;LSy/a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBarcode", "b", "LSy/a$b;", "()LSy/a$b;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class P {

    /* renamed from: a  reason: collision with root package name */
    private final String f130764a;

    /* renamed from: b  reason: collision with root package name */
    private final a.b f130765b;

    public P(String str, a.b bVar) {
        C17542s.j(str, "barcode");
        this.f130764a = str;
        this.f130765b = bVar;
    }

    public final a.b a() {
        return this.f130765b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return C17542s.e(this.f130764a, p10.f130764a) && this.f130765b == p10.f130765b;
    }

    public int hashCode() {
        int hashCode = this.f130764a.hashCode() * 31;
        a.b bVar = this.f130765b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.f130764a;
        a.b bVar = this.f130765b;
        return "ScanTypeModel(barcode=" + str + ", specialType=" + bVar + ")";
    }
}
