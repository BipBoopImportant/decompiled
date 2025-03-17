package SC;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import wK.C18287c5;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LSC/p1;", "", "LSC/t;", "actionIcon", "", "contentDescription", "Lkotlin/Function0;", "LXH/N;", "onClick", "LSC/q1;", "clickableItems", "<init>", "(LSC/t;Ljava/lang/String;LnI/a;LSC/q1;)V", "LwK/c5;", "a", "()LwK/c5;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LSC/t;", "getActionIcon", "()LSC/t;", "b", "Ljava/lang/String;", "getContentDescription", "c", "LnI/a;", "getOnClick", "()LnI/a;", "d", "LSC/q1;", "getClickableItems", "()LSC/q1;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.p1  reason: case insensitive filesystem */
public final class C13625p1 {

    /* renamed from: e  reason: collision with root package name */
    public static final int f116394e = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C13638t f116395a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116396b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f116397c;

    /* renamed from: d  reason: collision with root package name */
    private final C13629q1 f116398d;

    public C13625p1(C13638t tVar, String str, C17631a<C16807N> aVar, C13629q1 q1Var) {
        C17542s.j(tVar, "actionIcon");
        C17542s.j(str, "contentDescription");
        C17542s.j(aVar, "onClick");
        C17542s.j(q1Var, "clickableItems");
        this.f116395a = tVar;
        this.f116396b = str;
        this.f116397c = aVar;
        this.f116398d = q1Var;
    }

    public final C18287c5 a() {
        return new C18287c5(this.f116395a.b(), this.f116396b, this.f116398d.b(), this.f116397c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13625p1)) {
            return false;
        }
        C13625p1 p1Var = (C13625p1) obj;
        return this.f116395a == p1Var.f116395a && C17542s.e(this.f116396b, p1Var.f116396b) && C17542s.e(this.f116397c, p1Var.f116397c) && this.f116398d == p1Var.f116398d;
    }

    public int hashCode() {
        return (((((this.f116395a.hashCode() * 31) + this.f116396b.hashCode()) * 31) + this.f116397c.hashCode()) * 31) + this.f116398d.hashCode();
    }

    public String toString() {
        C13638t tVar = this.f116395a;
        String str = this.f116396b;
        C17631a<C16807N> aVar = this.f116397c;
        C13629q1 q1Var = this.f116398d;
        return "SkapaMemberCardActionParams(actionIcon=" + tVar + ", contentDescription=" + str + ", onClick=" + aVar + ", clickableItems=" + q1Var + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13625p1(C13638t tVar, String str, C17631a aVar, C13629q1 q1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, str, aVar, (i10 & 8) != 0 ? C13629q1.Icon : q1Var);
    }
}
