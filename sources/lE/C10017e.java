package le;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lle/e;", "LxB/a;", "Lle/e$a;", "saveButton", "deleteButton", "<init>", "(Lle/e$a;Lle/e$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lle/e$a;", "h", "()Lle/e$a;", "b", "g", "", "c", "J", "f", "()J", "stableId", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: le.e  reason: case insensitive filesystem */
public final class C10017e implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final a f75227a;

    /* renamed from: b  reason: collision with root package name */
    private final a f75228b;

    /* renamed from: c  reason: collision with root package name */
    private final long f75229c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lle/e$a;", "", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: le.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f75230a;

        public a(boolean z10) {
            this.f75230a = z10;
        }

        public final boolean a() {
            return this.f75230a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f75230a == ((a) obj).f75230a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f75230a);
        }

        public String toString() {
            boolean z10 = this.f75230a;
            return "Button(isEnabled=" + z10 + ")";
        }
    }

    public C10017e(a aVar, a aVar2) {
        C17542s.j(aVar, "saveButton");
        this.f75227a = aVar;
        this.f75228b = aVar2;
        this.f75229c = (long) Objects.hash(new Object[]{P.b(C10017e.class)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10017e)) {
            return false;
        }
        C10017e eVar = (C10017e) obj;
        return C17542s.e(this.f75227a, eVar.f75227a) && C17542s.e(this.f75228b, eVar.f75228b);
    }

    public long f() {
        return this.f75229c;
    }

    public final a g() {
        return this.f75228b;
    }

    public final a h() {
        return this.f75227a;
    }

    public int hashCode() {
        int hashCode = this.f75227a.hashCode() * 31;
        a aVar = this.f75228b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        a aVar = this.f75227a;
        a aVar2 = this.f75228b;
        return "SaveDeleteButtonsModel(saveButton=" + aVar + ", deleteButton=" + aVar2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10017e(a aVar, a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : aVar2);
    }
}
