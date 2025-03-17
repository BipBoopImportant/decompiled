package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.C1;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0007B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\u0001\u0001\f¨\u0006\r"}, d2 = {"LSC/j0;", "", "LSC/f0;", "alignment", "<init>", "(LSC/f0;)V", "LwK/C1;", "a", "()LwK/C1;", "LSC/f0;", "getAlignment", "()LSC/f0;", "LSC/j0$a;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.j0  reason: case insensitive filesystem */
public abstract class C13600j0 {

    /* renamed from: a  reason: collision with root package name */
    private final C13584f0 f116303a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LSC/j0$a;", "LSC/j0;", "<init>", "()V", "LwK/C1;", "a", "()LwK/C1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.j0$a */
    public static final class a extends C13600j0 {

        /* renamed from: b  reason: collision with root package name */
        public static final a f116304b = new a();

        private a() {
            super((C13584f0) null, 1, (DefaultConstructorMarker) null);
        }

        public C1 a() {
            return C1.c.f149300c;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -2093400039;
        }

        public String toString() {
            return "None";
        }
    }

    public /* synthetic */ C13600j0(C13584f0 f0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0Var);
    }

    public abstract C1 a();

    private C13600j0(C13584f0 f0Var) {
        this.f116303a = f0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13600j0(C13584f0 f0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C13584f0.Center : f0Var, (DefaultConstructorMarker) null);
    }
}
