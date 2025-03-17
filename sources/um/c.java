package um;

import IC.C13023e;
import XH.x;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\f\nJ6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H¦B¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lum/c;", "", "", "productTitle", "itemNo", "itemType", "Llm/a$c;", "fulfilmentOption", "LXH/x;", "Lum/c$b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llm/a$c;LdI/e;)Ljava/lang/Object;", "b", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lum/c$a;", "", "<init>", "()V", "b", "c", "a", "Lum/c$a$a;", "Lum/c$a$b;", "Lum/c$a$c;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends Throwable {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lum/c$a$a;", "Lum/c$a;", "LIC/e;", "text", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: um.c$a$a  reason: collision with other inner class name */
        public static final class C2466a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f103849a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2466a(C13023e eVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "text");
                this.f103849a = eVar;
            }

            public final C13023e a() {
                return this.f103849a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2466a) && C17542s.e(this.f103849a, ((C2466a) obj).f103849a);
            }

            public int hashCode() {
                return this.f103849a.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f103849a;
                return "GenericError(text=" + eVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/c$a$b;", "Lum/c$a;", "<init>", "()V", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f103850a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/c$a$c;", "Lum/c$a;", "<init>", "()V", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: um.c$a$c  reason: collision with other inner class name */
        public static final class C2467c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2467c f103851a = new C2467c();

            private C2467c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lum/c$b;", "", "<init>", "()V", "b", "a", "Lum/c$b$a;", "Lum/c$b$b;", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/c$b$a;", "Lum/c$b;", "<init>", "()V", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f103852a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lum/c$b$b;", "Lum/c$b;", "", "resId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: um.c$b$b  reason: collision with other inner class name */
        public static final class C2468b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final int f103853a;

            public C2468b(int i10) {
                super((DefaultConstructorMarker) null);
                this.f103853a = i10;
            }

            public final int a() {
                return this.f103853a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2468b) && this.f103853a == ((C2468b) obj).f103853a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f103853a);
            }

            public String toString() {
                int i10 = this.f103853a;
                return "Subscribed(resId=" + i10 + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    Object a(String str, String str2, String str3, C11550a.c cVar, C17164e<? super x<? extends b>> eVar);
}
