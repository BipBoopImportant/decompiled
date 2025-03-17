package BC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LBC/a;", "", "a", "b", "LBC/a$a;", "LBC/a$b;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: BC.a  reason: case insensitive filesystem */
public interface C12611a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LBC/a$a;", "LBC/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BC.a$a  reason: collision with other inner class name */
    public static final class C2573a implements C12611a {

        /* renamed from: a  reason: collision with root package name */
        public static final C2573a f107793a = new C2573a();

        private C2573a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C2573a);
        }

        public int hashCode() {
            return 152393511;
        }

        public String toString() {
            return "Back";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LBC/a$b;", "LBC/a;", "<init>", "()V", "a", "b", "LBC/a$b$a;", "LBC/a$b$b;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BC.a$b */
    public static abstract class b implements C12611a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LBC/a$b$a;", "LBC/a$b;", "", "timeSlotId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: BC.a$b$a  reason: collision with other inner class name */
        public static final class C2574a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f107794a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2574a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "timeSlotId");
                this.f107794a = str;
            }

            public String a() {
                return this.f107794a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2574a) && C17542s.e(this.f107794a, ((C2574a) obj).f107794a);
            }

            public int hashCode() {
                return this.f107794a.hashCode();
            }

            public String toString() {
                String str = this.f107794a;
                return "FullCheckout(timeSlotId=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LBC/a$b$b;", "LBC/a$b;", "", "timeSlotId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: BC.a$b$b  reason: collision with other inner class name */
        public static final class C2575b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f107795a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2575b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "timeSlotId");
                this.f107795a = str;
            }

            public String a() {
                return this.f107795a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2575b) && C17542s.e(this.f107795a, ((C2575b) obj).f107795a);
            }

            public int hashCode() {
                return this.f107795a.hashCode();
            }

            public String toString() {
                String str = this.f107795a;
                return "PayAhead(timeSlotId=" + str + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
