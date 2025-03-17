package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\t\n\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lrz/K;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "familyCardId", "c", "b", "Lrz/K$a;", "Lrz/K$b;", "Lrz/K$c;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    private final String f130754a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lrz/K$a;", "Lrz/K;", "<init>", "()V", "b", "c", "a", "Lrz/K$a$a;", "Lrz/K$a$b;", "Lrz/K$a$c;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends K {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lrz/K$a$a;", "Lrz/K$a;", "", "familyCardId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rz.K$a$a  reason: collision with other inner class name */
        public static final class C3233a extends a {

            /* renamed from: b  reason: collision with root package name */
            private final String f130755b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3233a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "familyCardId");
                this.f130755b = str;
            }

            public String a() {
                return this.f130755b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3233a) && C17542s.e(this.f130755b, ((C3233a) obj).f130755b);
            }

            public int hashCode() {
                return this.f130755b.hashCode();
            }

            public String toString() {
                String str = this.f130755b;
                return "FamilyMember(familyCardId=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/K$a$b;", "Lrz/K$a;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f130756b = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/K$a$c;", "Lrz/K$a;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final c f130757b = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/K$b;", "Lrz/K;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends K {

        /* renamed from: b  reason: collision with root package name */
        public static final b f130758b = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/K$c;", "Lrz/K;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends K {

        /* renamed from: b  reason: collision with root package name */
        public static final c f130759b = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ K(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String a() {
        return this.f130754a;
    }

    private K() {
        this.f130754a = "";
    }
}
