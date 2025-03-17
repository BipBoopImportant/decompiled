package wK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"LwK/H5;", "", "", "iconResource", "", "contentDescription", "Lkotlin/Function0;", "LXH/N;", "action", "<init>", "(ILjava/lang/String;LnI/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "LnI/a;", "()LnI/a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class H5 {

    /* renamed from: a  reason: collision with root package name */
    private final int f149569a;

    /* renamed from: b  reason: collision with root package name */
    private final String f149570b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f149571c;

    public H5(int i10, String str, C17631a<C16807N> aVar) {
        C17542s.j(aVar, "action");
        this.f149569a = i10;
        this.f149570b = str;
        this.f149571c = aVar;
    }

    public final C17631a<C16807N> a() {
        return this.f149571c;
    }

    public final String b() {
        return this.f149570b;
    }

    public final int c() {
        return this.f149569a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5)) {
            return false;
        }
        H5 h52 = (H5) obj;
        return this.f149569a == h52.f149569a && C17542s.e(this.f149570b, h52.f149570b) && C17542s.e(this.f149571c, h52.f149571c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f149569a) * 31;
        String str = this.f149570b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f149571c.hashCode();
    }

    public String toString() {
        int i10 = this.f149569a;
        String str = this.f149570b;
        C17631a<C16807N> aVar = this.f149571c;
        return "ModalHeaderAction(iconResource=" + i10 + ", contentDescription=" + str + ", action=" + aVar + ")";
    }
}
