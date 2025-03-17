package kr;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lkr/h;", "", "d", "a", "c", "e", "b", "Lkr/h$a;", "Lkr/h$c;", "Lkr/h$d;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkr/h$a;", "Lkr/h;", "<init>", "()V", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final a f99165a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkr/h$b;", "Lkr/h$c;", "LIC/e;", "title", "description", "", "inStoreVoucherCode", "onlineVoucherCode", "<init>", "(LIC/e;LIC/e;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "c", "()LIC/e;", "b", "Ljava/lang/String;", "d", "getOnlineVoucherCode", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: e  reason: collision with root package name */
        public static final int f99166e = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f99167a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f99168b;

        /* renamed from: c  reason: collision with root package name */
        private final String f99169c;

        /* renamed from: d  reason: collision with root package name */
        private final String f99170d;

        public b(C13023e eVar, C13023e eVar2, String str, String str2) {
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "description");
            C17542s.j(str, "inStoreVoucherCode");
            this.f99167a = eVar;
            this.f99168b = eVar2;
            this.f99169c = str;
            this.f99170d = str2;
        }

        public final C13023e a() {
            return this.f99168b;
        }

        public final String b() {
            return this.f99169c;
        }

        public final C13023e c() {
            return this.f99167a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f99167a, bVar.f99167a) && C17542s.e(this.f99168b, bVar.f99168b) && C17542s.e(this.f99169c, bVar.f99169c) && C17542s.e(this.f99170d, bVar.f99170d);
        }

        public int hashCode() {
            int hashCode = ((((this.f99167a.hashCode() * 31) + this.f99168b.hashCode()) * 31) + this.f99169c.hashCode()) * 31;
            String str = this.f99170d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C13023e eVar = this.f99167a;
            C13023e eVar2 = this.f99168b;
            String str = this.f99169c;
            String str2 = this.f99170d;
            return "InStore(title=" + eVar + ", description=" + eVar2 + ", inStoreVoucherCode=" + str + ", onlineVoucherCode=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lkr/h$c;", "Lkr/h;", "Lkr/h$b;", "Lkr/h$e;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c extends h {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkr/h$d;", "Lkr/h;", "<init>", "()V", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final d f99171a = new d();

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lkr/h$e;", "Lkr/h$c;", "", "voucherCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVoucherCode", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        private final String f99172a;

        public e(String str) {
            C17542s.j(str, "voucherCode");
            this.f99172a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && C17542s.e(this.f99172a, ((e) obj).f99172a);
        }

        public int hashCode() {
            return this.f99172a.hashCode();
        }

        public String toString() {
            String str = this.f99172a;
            return "Online(voucherCode=" + str + ")";
        }
    }
}
