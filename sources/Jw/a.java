package jw;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Ljw/a;", "", "<init>", "()V", "a", "c", "b", "d", "Ljw/a$a;", "Ljw/a$b;", "Ljw/a$c;", "Ljw/a$d;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ljw/a$a;", "Ljw/a;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jw.a$a  reason: collision with other inner class name */
    public static final class C0396a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f24868a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0396a(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "type");
            this.f24868a = str;
        }

        public final String a() {
            return this.f24868a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0396a) && C17542s.e(this.f24868a, ((C0396a) obj).f24868a);
        }

        public int hashCode() {
            return this.f24868a.hashCode();
        }

        public String toString() {
            String str = this.f24868a;
            return "MessageDismissed(type=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljw/a$b;", "Ljw/a;", "", "id", "type", "", "expanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f24869a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24870b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f24871c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(str2, "type");
            this.f24869a = str;
            this.f24870b = str2;
            this.f24871c = z10;
        }

        public final boolean a() {
            return this.f24871c;
        }

        public final String b() {
            return this.f24869a;
        }

        public final String c() {
            return this.f24870b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f24869a, bVar.f24869a) && C17542s.e(this.f24870b, bVar.f24870b) && this.f24871c == bVar.f24871c;
        }

        public int hashCode() {
            return (((this.f24869a.hashCode() * 31) + this.f24870b.hashCode()) * 31) + Boolean.hashCode(this.f24871c);
        }

        public String toString() {
            String str = this.f24869a;
            String str2 = this.f24870b;
            boolean z10 = this.f24871c;
            return "MessageDisplayed(id=" + str + ", type=" + str2 + ", expanded=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Ljw/a$c;", "Ljw/a;", "", "type", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final String f24872a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24873b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "type");
            C17542s.j(str2, Constants.DEEPLINK);
            this.f24872a = str;
            this.f24873b = str2;
        }

        public final String a() {
            return this.f24873b;
        }

        public final String b() {
            return this.f24872a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f24872a, cVar.f24872a) && C17542s.e(this.f24873b, cVar.f24873b);
        }

        public int hashCode() {
            return (this.f24872a.hashCode() * 31) + this.f24873b.hashCode();
        }

        public String toString() {
            String str = this.f24872a;
            String str2 = this.f24873b;
            return "MessageLinkToClicked(type=" + str + ", deeplink=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljw/a$d;", "Ljw/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f24874a = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1921577158;
        }

        public String toString() {
            return "ToggleExpandable";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
