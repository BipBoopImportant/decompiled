package JG;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LJG/K;", "", "LJG/a;", "information", "<init>", "(LJG/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJG/a;", "()LJG/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JG.K  reason: case insensitive filesystem */
public final class C15929K {

    /* renamed from: a  reason: collision with root package name */
    private final C15930a f135584a;

    public C15929K() {
        this((C15930a) null, 1, (DefaultConstructorMarker) null);
    }

    public final C15930a a() {
        return this.f135584a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15929K) && C17542s.e(this.f135584a, ((C15929K) obj).f135584a);
    }

    public int hashCode() {
        C15930a aVar = this.f135584a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        C15930a aVar = this.f135584a;
        return "DecorateDialogUIState(information=" + aVar + ")";
    }

    public C15929K(C15930a aVar) {
        this.f135584a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15929K(C15930a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar);
    }
}
