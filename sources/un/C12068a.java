package un;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lun/a;", "", "Lun/a$a;", "homeDelivery", "", "storeId", "<init>", "(Lun/a$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lun/a$a;", "()Lun/a$a;", "b", "Ljava/lang/String;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: un.a  reason: case insensitive filesystem */
public final class C12068a {

    /* renamed from: a  reason: collision with root package name */
    private final C2469a f103854a;

    /* renamed from: b  reason: collision with root package name */
    private final String f103855b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lun/a$a;", "", "", "zipCode", "areaCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: un.a$a  reason: collision with other inner class name */
    public static final class C2469a {

        /* renamed from: a  reason: collision with root package name */
        private final String f103856a;

        /* renamed from: b  reason: collision with root package name */
        private final String f103857b;

        public C2469a(String str, String str2) {
            C17542s.j(str, "zipCode");
            this.f103856a = str;
            this.f103857b = str2;
        }

        public final String a() {
            return this.f103857b;
        }

        public final String b() {
            return this.f103856a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2469a)) {
                return false;
            }
            C2469a aVar = (C2469a) obj;
            return C17542s.e(this.f103856a, aVar.f103856a) && C17542s.e(this.f103857b, aVar.f103857b);
        }

        public int hashCode() {
            int hashCode = this.f103856a.hashCode() * 31;
            String str = this.f103857b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f103856a;
            String str2 = this.f103857b;
            return "HomeDelivery(zipCode=" + str + ", areaCode=" + str2 + ")";
        }
    }

    public C12068a() {
        this((C2469a) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public final C2469a a() {
        return this.f103854a;
    }

    public final String b() {
        return this.f103855b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12068a)) {
            return false;
        }
        C12068a aVar = (C12068a) obj;
        return C17542s.e(this.f103854a, aVar.f103854a) && C17542s.e(this.f103855b, aVar.f103855b);
    }

    public int hashCode() {
        C2469a aVar = this.f103854a;
        int i10 = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f103855b;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        C2469a aVar = this.f103854a;
        String str = this.f103855b;
        return "PlpAvailabilityParams(homeDelivery=" + aVar + ", storeId=" + str + ")";
    }

    public C12068a(C2469a aVar, String str) {
        this.f103854a = aVar;
        this.f103855b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12068a(C2469a aVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : str);
    }
}
