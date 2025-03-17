package SC;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"LSC/q0;", "", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "", "dismissButtonContentDescription", "<init>", "(LnI/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/a;", "b", "()LnI/a;", "Ljava/lang/String;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.q0  reason: case insensitive filesystem */
public final class C13628q0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f116408c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f116409a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116410b;

    public C13628q0(C17631a<C16807N> aVar, String str) {
        C17542s.j(aVar, "onDismissRequest");
        this.f116409a = aVar;
        this.f116410b = str;
    }

    public final String a() {
        return this.f116410b;
    }

    public final C17631a<C16807N> b() {
        return this.f116409a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13628q0)) {
            return false;
        }
        C13628q0 q0Var = (C13628q0) obj;
        return C17542s.e(this.f116409a, q0Var.f116409a) && C17542s.e(this.f116410b, q0Var.f116410b);
    }

    public int hashCode() {
        int hashCode = this.f116409a.hashCode() * 31;
        String str = this.f116410b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C17631a<C16807N> aVar = this.f116409a;
        String str = this.f116410b;
        return "SkapaDismissParams(onDismissRequest=" + aVar + ", dismissButtonContentDescription=" + str + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13628q0(C17631a aVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : str);
    }
}
