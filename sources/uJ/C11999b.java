package uj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u001a\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001d"}, d2 = {"Luj/b;", "Luj/a;", "", "titleRes", "imageRes", "imageDescription", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "e", "c", "d", "()Z", "hasTitle", "hasImage", "hasImageDescription", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uj.b  reason: case insensitive filesystem */
public final class C11999b implements C11998a {

    /* renamed from: a  reason: collision with root package name */
    private final int f103415a;

    /* renamed from: b  reason: collision with root package name */
    private final int f103416b;

    /* renamed from: c  reason: collision with root package name */
    private final int f103417c;

    public C11999b() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public final boolean a() {
        return this.f103416b != 0;
    }

    public final boolean b() {
        return this.f103417c != 0;
    }

    public final boolean c() {
        return this.f103415a != 0;
    }

    public final int d() {
        return this.f103417c;
    }

    public final int e() {
        return this.f103416b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11999b)) {
            return false;
        }
        C11999b bVar = (C11999b) obj;
        return this.f103415a == bVar.f103415a && this.f103416b == bVar.f103416b && this.f103417c == bVar.f103417c;
    }

    public final int f() {
        return this.f103415a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f103415a) * 31) + Integer.hashCode(this.f103416b)) * 31) + Integer.hashCode(this.f103417c);
    }

    public String toString() {
        int i10 = this.f103415a;
        int i11 = this.f103416b;
        int i12 = this.f103417c;
        return "HelpContentImage(titleRes=" + i10 + ", imageRes=" + i11 + ", imageDescription=" + i12 + ")";
    }

    public C11999b(int i10, int i11, int i12) {
        this.f103415a = i10;
        this.f103416b = i11;
        this.f103417c = i12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11999b(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
