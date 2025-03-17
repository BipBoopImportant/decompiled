package oi;

import Kf.C9133b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Loi/a;", "", "c", "a", "b", "Loi/a$a;", "Loi/a$b;", "Loi/a$c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Loi/a$a;", "Loi/a;", "LKf/b$a;", "cartDisplayError", "<init>", "(LKf/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKf/b$a;", "()LKf/b$a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oi.a$a  reason: collision with other inner class name */
    public static final class C1387a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final C9133b.a f75759a;

        public C1387a(C9133b.a aVar) {
            C17542s.j(aVar, "cartDisplayError");
            this.f75759a = aVar;
        }

        public final C9133b.a a() {
            return this.f75759a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1387a) && C17542s.e(this.f75759a, ((C1387a) obj).f75759a);
        }

        public int hashCode() {
            return this.f75759a.hashCode();
        }

        public String toString() {
            C9133b.a aVar = this.f75759a;
            return "AddToCartFailed(cartDisplayError=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi/a$b;", "Loi/a;", "<init>", "()V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f75760a = new b();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Loi/a$c;", "Loi/a;", "", "dynamicLink", "productName", "productDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f75761a;

        /* renamed from: b  reason: collision with root package name */
        private final String f75762b;

        /* renamed from: c  reason: collision with root package name */
        private final String f75763c;

        public c(String str, String str2, String str3) {
            C17542s.j(str, "dynamicLink");
            C17542s.j(str2, "productName");
            C17542s.j(str3, "productDescription");
            this.f75761a = str;
            this.f75762b = str2;
            this.f75763c = str3;
        }

        public final String a() {
            return this.f75761a;
        }

        public final String b() {
            return this.f75763c;
        }

        public final String c() {
            return this.f75762b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f75761a, cVar.f75761a) && C17542s.e(this.f75762b, cVar.f75762b) && C17542s.e(this.f75763c, cVar.f75763c);
        }

        public int hashCode() {
            return (((this.f75761a.hashCode() * 31) + this.f75762b.hashCode()) * 31) + this.f75763c.hashCode();
        }

        public String toString() {
            String str = this.f75761a;
            String str2 = this.f75762b;
            String str3 = this.f75763c;
            return "OpenShareDialog(dynamicLink=" + str + ", productName=" + str2 + ", productDescription=" + str3 + ")";
        }
    }
}
