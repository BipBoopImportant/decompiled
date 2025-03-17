package wK;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LwK/T5;", "", "LwK/F5;", "buttonAlignment", "Lkotlin/Function0;", "LXH/N;", "primaryButton", "secondaryButton", "<init>", "(LwK/F5;LnI/p;LnI/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/F5;", "()LwK/F5;", "b", "LnI/p;", "()LnI/p;", "c", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class T5 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f150207d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final F5 f150208a;

    /* renamed from: b  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f150209b;

    /* renamed from: c  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f150210c;

    public T5(F5 f52, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
        C17542s.j(f52, "buttonAlignment");
        C17542s.j(pVar, "primaryButton");
        this.f150208a = f52;
        this.f150209b = pVar;
        this.f150210c = pVar2;
    }

    public final F5 a() {
        return this.f150208a;
    }

    public final p<C4889m, Integer, C16807N> b() {
        return this.f150209b;
    }

    public final p<C4889m, Integer, C16807N> c() {
        return this.f150210c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T5)) {
            return false;
        }
        T5 t52 = (T5) obj;
        return this.f150208a == t52.f150208a && C17542s.e(this.f150209b, t52.f150209b) && C17542s.e(this.f150210c, t52.f150210c);
    }

    public int hashCode() {
        int hashCode = ((this.f150208a.hashCode() * 31) + this.f150209b.hashCode()) * 31;
        p<C4889m, Integer, C16807N> pVar = this.f150210c;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public String toString() {
        F5 f52 = this.f150208a;
        p<C4889m, Integer, C16807N> pVar = this.f150209b;
        p<C4889m, Integer, C16807N> pVar2 = this.f150210c;
        return "ModalsActionFooterParams(buttonAlignment=" + f52 + ", primaryButton=" + pVar + ", secondaryButton=" + pVar2 + ")";
    }
}
