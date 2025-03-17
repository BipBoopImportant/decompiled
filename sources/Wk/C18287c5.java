package wK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"LwK/c5;", "", "LwK/n;", "actionIcon", "", "contentDescription", "LwK/d5;", "clickableItems", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(LwK/n;Ljava/lang/String;LwK/d5;LnI/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/n;", "()LwK/n;", "b", "Ljava/lang/String;", "c", "LwK/d5;", "()LwK/d5;", "d", "LnI/a;", "()LnI/a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.c5  reason: case insensitive filesystem */
public final class C18287c5 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f150666e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C18413n f150667a;

    /* renamed from: b  reason: collision with root package name */
    private final String f150668b;

    /* renamed from: c  reason: collision with root package name */
    private final C18299d5 f150669c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<C16807N> f150670d;

    public C18287c5(C18413n nVar, String str, C18299d5 d5Var, C17631a<C16807N> aVar) {
        C17542s.j(nVar, "actionIcon");
        C17542s.j(str, "contentDescription");
        C17542s.j(d5Var, "clickableItems");
        C17542s.j(aVar, "onClick");
        this.f150667a = nVar;
        this.f150668b = str;
        this.f150669c = d5Var;
        this.f150670d = aVar;
    }

    public final C18413n a() {
        return this.f150667a;
    }

    public final C18299d5 b() {
        return this.f150669c;
    }

    public final String c() {
        return this.f150668b;
    }

    public final C17631a<C16807N> d() {
        return this.f150670d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18287c5)) {
            return false;
        }
        C18287c5 c5Var = (C18287c5) obj;
        return this.f150667a == c5Var.f150667a && C17542s.e(this.f150668b, c5Var.f150668b) && this.f150669c == c5Var.f150669c && C17542s.e(this.f150670d, c5Var.f150670d);
    }

    public int hashCode() {
        return (((((this.f150667a.hashCode() * 31) + this.f150668b.hashCode()) * 31) + this.f150669c.hashCode()) * 31) + this.f150670d.hashCode();
    }

    public String toString() {
        C18413n nVar = this.f150667a;
        String str = this.f150668b;
        C18299d5 d5Var = this.f150669c;
        C17631a<C16807N> aVar = this.f150670d;
        return "MemberCardActionParams(actionIcon=" + nVar + ", contentDescription=" + str + ", clickableItems=" + d5Var + ", onClick=" + aVar + ")";
    }
}
