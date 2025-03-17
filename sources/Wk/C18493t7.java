package wK;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LwK/t7;", "", "", "label", "Lkotlin/Function0;", "LXH/N;", "action", "<init>", "(Ljava/lang/String;LnI/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LnI/a;", "()LnI/a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.t7  reason: case insensitive filesystem */
public final class C18493t7 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f151629c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f151630a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f151631b;

    public C18493t7(String str, C17631a<C16807N> aVar) {
        C17542s.j(str, "label");
        C17542s.j(aVar, "action");
        this.f151630a = str;
        this.f151631b = aVar;
    }

    public final C17631a<C16807N> a() {
        return this.f151631b;
    }

    public final String b() {
        return this.f151630a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18493t7)) {
            return false;
        }
        C18493t7 t7Var = (C18493t7) obj;
        return C17542s.e(this.f151630a, t7Var.f151630a) && C17542s.e(this.f151631b, t7Var.f151631b);
    }

    public int hashCode() {
        return (this.f151630a.hashCode() * 31) + this.f151631b.hashCode();
    }

    public String toString() {
        String str = this.f151630a;
        C17631a<C16807N> aVar = this.f151631b;
        return "PromptAction(label=" + str + ", action=" + aVar + ")";
    }
}
