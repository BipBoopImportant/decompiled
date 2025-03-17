package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0001\u0001\n¨\u0006\u000b"}, d2 = {"LSC/Z2;", "", "", "enabled", "<init>", "(Z)V", "a", "Z", "getEnabled", "()Z", "LSC/Z2$a;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Z2 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f116096a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"LSC/Z2$a;", "LSC/Z2;", "", "iconId", "", "contentDescription", "", "enabled", "<init>", "(ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/String;", "a", "d", "Z", "()Z", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Z2 {

        /* renamed from: e  reason: collision with root package name */
        public static final int f116097e = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f116098b;

        /* renamed from: c  reason: collision with root package name */
        private final String f116099c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f116100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, boolean z10) {
            super(z10, (DefaultConstructorMarker) null);
            C17542s.j(str, "contentDescription");
            this.f116098b = i10;
            this.f116099c = str;
            this.f116100d = z10;
        }

        public final String a() {
            return this.f116099c;
        }

        public boolean b() {
            return this.f116100d;
        }

        public final int c() {
            return this.f116098b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f116098b == aVar.f116098b && C17542s.e(this.f116099c, aVar.f116099c) && this.f116100d == aVar.f116100d;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f116098b) * 31) + this.f116099c.hashCode()) * 31) + Boolean.hashCode(this.f116100d);
        }

        public String toString() {
            int i10 = this.f116098b;
            String str = this.f116099c;
            boolean z10 = this.f116100d;
            return "Icon(iconId=" + i10 + ", contentDescription=" + str + ", enabled=" + z10 + ")";
        }
    }

    public /* synthetic */ Z2(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10);
    }

    private Z2(boolean z10) {
        this.f116096a = z10;
    }
}
