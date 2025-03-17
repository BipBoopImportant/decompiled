package It;

import Ht.c;
import Op.c1;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIt/t;", "", "b", "a", "LIt/t$a;", "LIt/t$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface t {

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"LIt/t$a;", "LIt/t;", "g", "h", "d", "q", "n", "o", "l", "m", "p", "f", "r", "e", "c", "i", "j", "b", "a", "k", "LIt/t$a$a;", "LIt/t$a$b;", "LIt/t$a$c;", "LIt/t$a$d;", "LIt/t$a$e;", "LIt/t$a$f;", "LIt/t$a$g;", "LIt/t$a$h;", "LIt/t$a$i;", "LIt/t$a$j;", "LIt/t$a$k;", "LIt/t$a$l;", "LIt/t$a$m;", "LIt/t$a$n;", "LIt/t$a$o;", "LIt/t$a$p;", "LIt/t$a$q;", "LIt/t$a$r;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends t {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"LIt/t$a$a;", "LIt/t$a;", "", "productName", "itemNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: It.t$a$a  reason: collision with other inner class name */
        public static final class C1617a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82423a;

            /* renamed from: b  reason: collision with root package name */
            private final String f82424b;

            public C1617a(String str, String str2) {
                C17542s.j(str, "productName");
                C17542s.j(str2, "itemNo");
                this.f82423a = str;
                this.f82424b = str2;
            }

            public final String a() {
                return this.f82424b;
            }

            public final String b() {
                return this.f82423a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1617a)) {
                    return false;
                }
                C1617a aVar = (C1617a) obj;
                return C17542s.e(this.f82423a, aVar.f82423a) && C17542s.e(this.f82424b, aVar.f82424b);
            }

            public int hashCode() {
                return (this.f82423a.hashCode() * 31) + this.f82424b.hashCode();
            }

            public String toString() {
                String str = this.f82423a;
                String str2 = this.f82424b;
                return "AddToShoppingListPicker(productName=" + str + ", itemNo=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/t$a$b;", "LIt/t$a;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82425a;

            public b(String str) {
                C17542s.j(str, "itemNo");
                this.f82425a = str;
            }

            public final String a() {
                return this.f82425a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f82425a, ((b) obj).f82425a);
            }

            public int hashCode() {
                return this.f82425a.hashCode();
            }

            public String toString() {
                String str = this.f82425a;
                return "EnergyLabel(itemNo=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"LIt/t$a$c;", "LIt/t$a;", "", "storeId", "eventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82426a;

            /* renamed from: b  reason: collision with root package name */
            private final String f82427b;

            public c(String str, String str2) {
                C17542s.j(str, "storeId");
                this.f82426a = str;
                this.f82427b = str2;
            }

            public final String a() {
                return this.f82427b;
            }

            public final String b() {
                return this.f82426a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f82426a, cVar.f82426a) && C17542s.e(this.f82427b, cVar.f82427b);
            }

            public int hashCode() {
                int hashCode = this.f82426a.hashCode() * 31;
                String str = this.f82427b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f82426a;
                String str2 = this.f82427b;
                return "Events(storeId=" + str + ", eventId=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$a$d;", "LIt/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f82428a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1568656355;
            }

            public String toString() {
                return "FamilyCard";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/t$a$e;", "LIt/t$a;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82429a;

            public e(String str) {
                C17542s.j(str, "url");
                this.f82429a = str;
            }

            public final String a() {
                return this.f82429a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C17542s.e(this.f82429a, ((e) obj).f82429a);
            }

            public int hashCode() {
                return this.f82429a.hashCode();
            }

            public String toString() {
                String str = this.f82429a;
                return "FoodMobile(url=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$a$f;", "LIt/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final f f82430a = new f();

            private f() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 798898647;
            }

            public String toString() {
                return "Inbox";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$a$g;", "LIt/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class g implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final g f82431a = new g();

            private g() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 801703610;
            }

            public String toString() {
                return "Login";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$a$h;", "LIt/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class h implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final h f82432a = new h();

            private h() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return 2688777;
            }

            public String toString() {
                return "LoginPromotion";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/t$a$i;", "LIt/t$a;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class i implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82433a;

            public i(String str) {
                C17542s.j(str, "storeId");
                this.f82433a = str;
            }

            public final String a() {
                return this.f82433a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && C17542s.e(this.f82433a, ((i) obj).f82433a);
            }

            public int hashCode() {
                return this.f82433a.hashCode();
            }

            public String toString() {
                String str = this.f82433a;
                return "PopularTimes(storeId=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/t$a$j;", "LIt/t$a;", "LOp/c1$b;", "productItemUiEvent", "<init>", "(LOp/c1$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/c1$b;", "()LOp/c1$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class j implements a {

            /* renamed from: b  reason: collision with root package name */
            public static final int f82434b = c1.b.f85096b;

            /* renamed from: a  reason: collision with root package name */
            private final c1.b f82435a;

            public j(c1.b bVar) {
                C17542s.j(bVar, "productItemUiEvent");
                this.f82435a = bVar;
            }

            public final c1.b a() {
                return this.f82435a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && C17542s.e(this.f82435a, ((j) obj).f82435a);
            }

            public int hashCode() {
                return this.f82435a.hashCode();
            }

            public String toString() {
                c1.b bVar = this.f82435a;
                return "ProductConfigurator(productItemUiEvent=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/t$a$k;", "LIt/t$a;", "", "itemNo", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class k implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82436a;

            public k(String str) {
                C17542s.j(str, "itemNo");
                this.f82436a = str;
            }

            public final String a() {
                return this.f82436a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && C17542s.e(this.f82436a, ((k) obj).f82436a);
            }

            public int hashCode() {
                return this.f82436a.hashCode();
            }

            public String toString() {
                String str = this.f82436a;
                return "ProductInformationPage(itemNo=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LIt/t$a$l;", "LIt/t$a;", "LHt/c$a;", "type", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "<init>", "(LHt/c$a;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHt/c$a;", "b", "()LHt/c$a;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class l implements a {

            /* renamed from: a  reason: collision with root package name */
            private final c.a f82437a;

            /* renamed from: b  reason: collision with root package name */
            private final Interaction$Component f82438b;

            public l(c.a aVar, Interaction$Component interaction$Component) {
                C17542s.j(aVar, "type");
                C17542s.j(interaction$Component, "component");
                this.f82437a = aVar;
                this.f82438b = interaction$Component;
            }

            public final Interaction$Component a() {
                return this.f82438b;
            }

            public final c.a b() {
                return this.f82437a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return this.f82437a == lVar.f82437a && this.f82438b == lVar.f82438b;
            }

            public int hashCode() {
                return (this.f82437a.hashCode() * 31) + this.f82438b.hashCode();
            }

            public String toString() {
                c.a aVar = this.f82437a;
                Interaction$Component interaction$Component = this.f82438b;
                return "ProductListPage(type=" + aVar + ", component=" + interaction$Component + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LIt/t$a$m;", "LIt/t$a;", "LAe/l;", "entryPoint", "<init>", "(LAe/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LAe/l;", "()LAe/l;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class m implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Ae.l f82439a;

            public m(Ae.l lVar) {
                C17542s.j(lVar, "entryPoint");
                this.f82439a = lVar;
            }

            public final Ae.l a() {
                return this.f82439a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && this.f82439a == ((m) obj).f82439a;
            }

            public int hashCode() {
                return this.f82439a.hashCode();
            }

            public String toString() {
                Ae.l lVar = this.f82439a;
                return "ScanAndGo(entryPoint=" + lVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/t$a$n;", "LIt/t$a;", "", "listId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class n implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82440a;

            public n(String str) {
                this.f82440a = str;
            }

            public final String a() {
                return this.f82440a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && C17542s.e(this.f82440a, ((n) obj).f82440a);
            }

            public int hashCode() {
                String str = this.f82440a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                String str = this.f82440a;
                return "ShoppingList(listId=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LIt/t$a$o;", "LIt/t$a;", "", "storeId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class o implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82441a;

            public o(String str) {
                C17542s.j(str, "storeId");
                this.f82441a = str;
            }

            public final String a() {
                return this.f82441a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && C17542s.e(this.f82441a, ((o) obj).f82441a);
            }

            public int hashCode() {
                return this.f82441a.hashCode();
            }

            public String toString() {
                String str = this.f82441a;
                return "StoreDetails(storeId=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$a$p;", "LIt/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class p implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final p f82442a = new p();

            private p() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public int hashCode() {
                return 483628896;
            }

            public String toString() {
                return "StorePicker";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$a$q;", "LIt/t$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class q implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final q f82443a = new q();

            private q() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public int hashCode() {
                return 1872151616;
            }

            public String toString() {
                return "UpgradeAccount";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"LIt/t$a$r;", "LIt/t$a;", "", "storeId", "itemNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class r implements a {

            /* renamed from: a  reason: collision with root package name */
            private final String f82444a;

            /* renamed from: b  reason: collision with root package name */
            private final String f82445b;

            public r(String str, String str2) {
                C17542s.j(str, "storeId");
                this.f82444a = str;
                this.f82445b = str2;
            }

            public final String a() {
                return this.f82445b;
            }

            public final String b() {
                return this.f82444a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return C17542s.e(this.f82444a, rVar.f82444a) && C17542s.e(this.f82445b, rVar.f82445b);
            }

            public int hashCode() {
                int hashCode = this.f82444a.hashCode() * 31;
                String str = this.f82445b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f82444a;
                String str2 = this.f82445b;
                return "Wayfinding(storeId=" + str + ", itemNo=" + str2 + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ r(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIt/t$b;", "LIt/t;", "a", "b", "LIt/t$b$a;", "LIt/t$b$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b extends t {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$b$a;", "LIt/t$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f82446a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1688881802;
            }

            public String toString() {
                return "ScrollToTop";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIt/t$b$b;", "LIt/t$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: It.t$b$b  reason: collision with other inner class name */
        public static final class C1618b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1618b f82447a = new C1618b();

            private C1618b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1618b);
            }

            public int hashCode() {
                return 1787681947;
            }

            public String toString() {
                return "ShowShortcutsBottomSheet";
            }
        }
    }
}
