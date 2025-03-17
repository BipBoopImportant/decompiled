package wK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LwK/Q8;", "", "Lkotlin/Function1;", "", "LXH/N;", "onClick", "", "onClickContentDescription", "enabled", "<init>", "(LnI/l;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/l;", "b", "()LnI/l;", "Ljava/lang/String;", "c", "Z", "()Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Q8 {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Boolean, C16807N> f150031a;

    /* renamed from: b  reason: collision with root package name */
    private final String f150032b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f150033c;

    public Q8(C17642l<? super Boolean, C16807N> lVar, String str, boolean z10) {
        C17542s.j(lVar, "onClick");
        this.f150031a = lVar;
        this.f150032b = str;
        this.f150033c = z10;
    }

    public final boolean a() {
        return this.f150033c;
    }

    public final C17642l<Boolean, C16807N> b() {
        return this.f150031a;
    }

    public final String c() {
        return this.f150032b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q8)) {
            return false;
        }
        Q8 q82 = (Q8) obj;
        return C17542s.e(this.f150031a, q82.f150031a) && C17542s.e(this.f150032b, q82.f150032b) && this.f150033c == q82.f150033c;
    }

    public int hashCode() {
        int hashCode = this.f150031a.hashCode() * 31;
        String str = this.f150032b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f150033c);
    }

    public String toString() {
        C17642l<Boolean, C16807N> lVar = this.f150031a;
        String str = this.f150032b;
        boolean z10 = this.f150033c;
        return "SelectInteractionParams(onClick=" + lVar + ", onClickContentDescription=" + str + ", enabled=" + z10 + ")";
    }
}
