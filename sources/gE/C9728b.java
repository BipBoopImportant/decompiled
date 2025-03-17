package ge;

import kD.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lge/b;", "", "<init>", "()V", "a", "d", "b", "c", "Lge/b$a;", "Lge/b$b;", "Lge/b$c;", "Lge/b$d;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ge.b  reason: case insensitive filesystem */
public abstract class C9728b {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lge/b$a;", "Lge/b;", "", "isLoyaltyMember", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.b$a */
    public static final class a extends C9728b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f73061a;

        public a(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f73061a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f73061a == ((a) obj).f73061a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f73061a);
        }

        public String toString() {
            boolean z10 = this.f73061a;
            return "Loading(isLoyaltyMember=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lge/b$b;", "Lge/b;", "LkD/h;", "profile", "", "isLoyaltyMember", "<init>", "(LkD/h;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LkD/h;", "getProfile", "()LkD/h;", "b", "Z", "()Z", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.b$b  reason: collision with other inner class name */
    public static final class C1273b extends C9728b {

        /* renamed from: a  reason: collision with root package name */
        private final h f73062a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f73063b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1273b(h hVar, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(hVar, "profile");
            this.f73062a = hVar;
            this.f73063b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1273b)) {
                return false;
            }
            C1273b bVar = (C1273b) obj;
            return C17542s.e(this.f73062a, bVar.f73062a) && this.f73063b == bVar.f73063b;
        }

        public int hashCode() {
            return (this.f73062a.hashCode() * 31) + Boolean.hashCode(this.f73063b);
        }

        public String toString() {
            h hVar = this.f73062a;
            boolean z10 = this.f73063b;
            return "LoggedIn(profile=" + hVar + ", isLoyaltyMember=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lge/b$c;", "Lge/b;", "<init>", "()V", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.b$c */
    public static final class c extends C9728b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f73064a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lge/b$d;", "Lge/b;", "", "isLoyaltyMember", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ge.b$d */
    public static final class d extends C9728b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f73065a;

        public d(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f73065a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f73065a == ((d) obj).f73065a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f73065a);
        }

        public String toString() {
            boolean z10 = this.f73065a;
            return "MissingProfile(isLoyaltyMember=" + z10 + ")";
        }
    }

    public /* synthetic */ C9728b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C9728b() {
    }
}
