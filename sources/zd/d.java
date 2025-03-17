package Zd;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LZd/d;", "", "", "title", "", "showAction", "Lkotlin/Function1;", "", "LXH/N;", "onClicked", "<init>", "(Ljava/lang/String;ZLnI/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "LnI/l;", "()LnI/l;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f65156a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f65157b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<Integer, C16807N> f65158c;

    public d(String str, boolean z10, C17642l<? super Integer, C16807N> lVar) {
        C17542s.j(str, "title");
        C17542s.j(lVar, "onClicked");
        this.f65156a = str;
        this.f65157b = z10;
        this.f65158c = lVar;
    }

    public final C17642l<Integer, C16807N> a() {
        return this.f65158c;
    }

    public final boolean b() {
        return this.f65157b;
    }

    public final String c() {
        return this.f65156a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f65156a, dVar.f65156a) && this.f65157b == dVar.f65157b && C17542s.e(this.f65158c, dVar.f65158c);
    }

    public int hashCode() {
        return (((this.f65156a.hashCode() * 31) + Boolean.hashCode(this.f65157b)) * 31) + this.f65158c.hashCode();
    }

    public String toString() {
        String str = this.f65156a;
        boolean z10 = this.f65157b;
        C17642l<Integer, C16807N> lVar = this.f65158c;
        return "AddressHeaderItem(title=" + str + ", showAction=" + z10 + ", onClicked=" + lVar + ")";
    }
}
