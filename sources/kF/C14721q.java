package kF;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"LkF/q;", "", "", "text", "Lkotlin/Function1;", "LXH/N;", "action", "<init>", "(Ljava/lang/String;LnI/l;)V", "a", "()Ljava/lang/String;", "b", "()LnI/l;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "LnI/l;", "c", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.q  reason: case insensitive filesystem */
public final class C14721q {

    /* renamed from: a  reason: collision with root package name */
    private final String f128842a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<String, C16807N> f128843b;

    public C14721q(String str, C17642l<? super String, C16807N> lVar) {
        C17542s.j(str, "text");
        C17542s.j(lVar, "action");
        this.f128842a = str;
        this.f128843b = lVar;
    }

    public final String a() {
        return this.f128842a;
    }

    public final C17642l<String, C16807N> b() {
        return this.f128843b;
    }

    public final C17642l<String, C16807N> c() {
        return this.f128843b;
    }

    public final String d() {
        return this.f128842a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14721q)) {
            return false;
        }
        C14721q qVar = (C14721q) obj;
        return C17542s.e(this.f128842a, qVar.f128842a) && C17542s.e(this.f128843b, qVar.f128843b);
    }

    public int hashCode() {
        return (this.f128842a.hashCode() * 31) + this.f128843b.hashCode();
    }

    public String toString() {
        String str = this.f128842a;
        C17642l<String, C16807N> lVar = this.f128843b;
        return "ClickableTextData(text=" + str + ", action=" + lVar + ")";
    }
}
