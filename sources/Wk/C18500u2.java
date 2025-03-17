package wK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"LwK/u2;", "", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "", "dismissButtonContentDescription", "<init>", "(LnI/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/a;", "b", "()LnI/a;", "Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.u2  reason: case insensitive filesystem */
public final class C18500u2 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f151671c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f151672a;

    /* renamed from: b  reason: collision with root package name */
    private final String f151673b;

    public C18500u2(C17631a<C16807N> aVar, String str) {
        C17542s.j(aVar, "onDismissRequest");
        this.f151672a = aVar;
        this.f151673b = str;
    }

    public final String a() {
        return this.f151673b;
    }

    public final C17631a<C16807N> b() {
        return this.f151672a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18500u2)) {
            return false;
        }
        C18500u2 u2Var = (C18500u2) obj;
        return C17542s.e(this.f151672a, u2Var.f151672a) && C17542s.e(this.f151673b, u2Var.f151673b);
    }

    public int hashCode() {
        int hashCode = this.f151672a.hashCode() * 31;
        String str = this.f151673b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C17631a<C16807N> aVar = this.f151672a;
        String str = this.f151673b;
        return "DismissParams(onDismissRequest=" + aVar + ", dismissButtonContentDescription=" + str + ")";
    }
}
