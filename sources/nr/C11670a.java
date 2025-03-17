package nr;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnr/a;", "", "", "id", "Lnr/a$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nr.a  reason: case insensitive filesystem */
public interface C11670a {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lnr/a$a;", "", "<init>", "()V", "c", "b", "a", "Lnr/a$a$a;", "Lnr/a$a$b;", "Lnr/a$a$c;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nr.a$a  reason: collision with other inner class name */
    public static abstract class C2304a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnr/a$a$a;", "Lnr/a$a;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.a$a$a  reason: collision with other inner class name */
        public static final class C2305a extends C2304a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f99990a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2305a(Throwable th2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(th2, "throwable");
                this.f99990a = th2;
            }

            public final Throwable a() {
                return this.f99990a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2305a) && C17542s.e(this.f99990a, ((C2305a) obj).f99990a);
            }

            public int hashCode() {
                return this.f99990a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f99990a;
                return "Error(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lnr/a$a$b;", "Lnr/a$a;", "", "id", "", "reasonCode", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.a$a$b */
        public static final class b extends C2304a {

            /* renamed from: a  reason: collision with root package name */
            private final String f99991a;

            /* renamed from: b  reason: collision with root package name */
            private final int f99992b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "id");
                this.f99991a = str;
                this.f99992b = i10;
            }

            public final String a() {
                return this.f99991a;
            }

            public final int b() {
                return this.f99992b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f99991a, bVar.f99991a) && this.f99992b == bVar.f99992b;
            }

            public int hashCode() {
                return (this.f99991a.hashCode() * 31) + Integer.hashCode(this.f99992b);
            }

            public String toString() {
                String str = this.f99991a;
                int i10 = this.f99992b;
                return "Failure(id=" + str + ", reasonCode=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lnr/a$a$c;", "Lnr/a$a;", "", "id", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nr.a$a$c */
        public static final class c extends C2304a {

            /* renamed from: a  reason: collision with root package name */
            private final String f99993a;

            /* renamed from: b  reason: collision with root package name */
            private final String f99994b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str, String str2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "id");
                C17542s.j(str2, "category");
                this.f99993a = str;
                this.f99994b = str2;
            }

            public final String a() {
                return this.f99994b;
            }

            public final String b() {
                return this.f99993a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f99993a, cVar.f99993a) && C17542s.e(this.f99994b, cVar.f99994b);
            }

            public int hashCode() {
                return (this.f99993a.hashCode() * 31) + this.f99994b.hashCode();
            }

            public String toString() {
                String str = this.f99993a;
                String str2 = this.f99994b;
                return "Success(id=" + str + ", category=" + str2 + ")";
            }
        }

        public /* synthetic */ C2304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2304a() {
        }
    }

    Object a(String str, C17164e<? super C2304a> eVar);
}
