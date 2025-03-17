package yv;

import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0004J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyv/a;", "", "LTJ/g;", "Lyv/a$a;", "a", "()LTJ/g;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.a  reason: case insensitive filesystem */
public interface C8996a {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lyv/a$a;", "", "", "includeBoka", "includeKreativ", "includeFamilyRewards", "includeHomeProjects", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "d", "c", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yv.a$a  reason: collision with other inner class name */
    public static final class C0939a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f58080a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f58081b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f58082c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f58083d;

        public C0939a() {
            this(false, false, false, false, 15, (DefaultConstructorMarker) null);
        }

        public final boolean a() {
            return this.f58080a;
        }

        public final boolean b() {
            return this.f58082c;
        }

        public final boolean c() {
            return this.f58083d;
        }

        public final boolean d() {
            return this.f58081b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0939a)) {
                return false;
            }
            C0939a aVar = (C0939a) obj;
            return this.f58080a == aVar.f58080a && this.f58081b == aVar.f58081b && this.f58082c == aVar.f58082c && this.f58083d == aVar.f58083d;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f58080a) * 31) + Boolean.hashCode(this.f58081b)) * 31) + Boolean.hashCode(this.f58082c)) * 31) + Boolean.hashCode(this.f58083d);
        }

        public String toString() {
            boolean z10 = this.f58080a;
            boolean z11 = this.f58081b;
            boolean z12 = this.f58082c;
            boolean z13 = this.f58083d;
            return "FeatureFlags(includeBoka=" + z10 + ", includeKreativ=" + z11 + ", includeFamilyRewards=" + z12 + ", includeHomeProjects=" + z13 + ")";
        }

        public C0939a(boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f58080a = z10;
            this.f58081b = z11;
            this.f58082c = z12;
            this.f58083d = z13;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0939a(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13);
        }
    }

    C16532g<C0939a> a();
}
