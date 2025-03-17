package Th;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"LTh/b;", "", "LKJ/c;", "", "footerTexts", "", "addBottomMargin", "<init>", "(LKJ/c;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "b", "()LKJ/c;", "Z", "()Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<String> f63998a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f63999b;

    public b(C15987c<String> cVar, boolean z10) {
        C17542s.j(cVar, "footerTexts");
        this.f63998a = cVar;
        this.f63999b = z10;
    }

    public final boolean a() {
        return this.f63999b;
    }

    public final C15987c<String> b() {
        return this.f63998a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f63998a, bVar.f63998a) && this.f63999b == bVar.f63999b;
    }

    public int hashCode() {
        return (this.f63998a.hashCode() * 31) + Boolean.hashCode(this.f63999b);
    }

    public String toString() {
        C15987c<String> cVar = this.f63998a;
        boolean z10 = this.f63999b;
        return "DisclaimerDelegateModel(footerTexts=" + cVar + ", addBottomMargin=" + z10 + ")";
    }
}
