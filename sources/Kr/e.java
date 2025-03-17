package kr;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nr.j;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkr/e;", "", "Lnr/j$a;", "rewardsContent", "", "focusCollectPoints", "Lkr/a;", "navigateTo", "<init>", "(Lnr/j$a;ZLkr/a;)V", "a", "(Lnr/j$a;ZLkr/a;)Lkr/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lnr/j$a;", "e", "()Lnr/j$a;", "b", "Z", "c", "()Z", "Lkr/a;", "d", "()Lkr/a;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final j.a f99119a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f99120b;

    /* renamed from: c  reason: collision with root package name */
    private final C11527a f99121c;

    public e() {
        this((j.a) null, false, (C11527a) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ e b(e eVar, j.a aVar, boolean z10, C11527a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = eVar.f99119a;
        }
        if ((i10 & 2) != 0) {
            z10 = eVar.f99120b;
        }
        if ((i10 & 4) != 0) {
            aVar2 = eVar.f99121c;
        }
        return eVar.a(aVar, z10, aVar2);
    }

    public final e a(j.a aVar, boolean z10, C11527a aVar2) {
        C17542s.j(aVar, "rewardsContent");
        return new e(aVar, z10, aVar2);
    }

    public final boolean c() {
        return this.f99120b;
    }

    public final C11527a d() {
        return this.f99121c;
    }

    public final j.a e() {
        return this.f99119a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f99119a, eVar.f99119a) && this.f99120b == eVar.f99120b && C17542s.e(this.f99121c, eVar.f99121c);
    }

    public int hashCode() {
        int hashCode = ((this.f99119a.hashCode() * 31) + Boolean.hashCode(this.f99120b)) * 31;
        C11527a aVar = this.f99121c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        j.a aVar = this.f99119a;
        boolean z10 = this.f99120b;
        C11527a aVar2 = this.f99121c;
        return "ViewModelState(rewardsContent=" + aVar + ", focusCollectPoints=" + z10 + ", navigateTo=" + aVar2 + ")";
    }

    public e(j.a aVar, boolean z10, C11527a aVar2) {
        C17542s.j(aVar, "rewardsContent");
        this.f99119a = aVar;
        this.f99120b = z10;
        this.f99121c = aVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j.a aVar, boolean z10, C11527a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new j.a(j.a.b.C2315a.f100061a, j.a.C2312a.b.f100060a) : aVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : aVar2);
    }
}
