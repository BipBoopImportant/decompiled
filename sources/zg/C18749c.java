package zG;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LzG/c;", "", "<init>", "()V", "b", "c", "a", "LzG/c$a;", "LzG/c$b;", "LzG/c$c;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zG.c  reason: case insensitive filesystem */
public abstract class C18749c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LzG/c$a;", "LzG/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.c$a */
    public static final class a extends C18749c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f152770a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1622623202;
        }

        public String toString() {
            return "OnClearSearchTerms";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LzG/c$b;", "LzG/c;", "", "query", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.c$b */
    public static final class b extends C18749c {

        /* renamed from: a  reason: collision with root package name */
        private final String f152771a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "query");
            this.f152771a = str;
        }

        public final String a() {
            return this.f152771a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f152771a, ((b) obj).f152771a);
        }

        public int hashCode() {
            return this.f152771a.hashCode();
        }

        public String toString() {
            String str = this.f152771a;
            return "OnSearch(query=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"LzG/c$c;", "LzG/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "query", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zG.c$c  reason: collision with other inner class name */
    public static final class C4330c extends C18749c {

        /* renamed from: a  reason: collision with root package name */
        private final String f152772a;

        public final String a() {
            return this.f152772a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4330c) && C17542s.e(this.f152772a, ((C4330c) obj).f152772a);
        }

        public int hashCode() {
            return this.f152772a.hashCode();
        }

        public String toString() {
            String str = this.f152772a;
            return "OnSearchFieldValueChange(query=" + str + ")";
        }
    }

    public /* synthetic */ C18749c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18749c() {
    }
}
