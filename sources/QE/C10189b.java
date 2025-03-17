package qe;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lqe/b;", "", "<init>", "()V", "a", "c", "b", "Lqe/b$a;", "Lqe/b$b;", "Lqe/b$c;", "alertmessaging_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qe.b  reason: case insensitive filesystem */
public abstract class C10189b {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\r¨\u0006\u0019"}, d2 = {"Lqe/b$a;", "Lqe/b;", "", "message", "imageUrl", "", "icon", "actionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "I", "alertmessaging_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qe.b$a */
    public static final class a extends C10189b {

        /* renamed from: a  reason: collision with root package name */
        private final String f76045a;

        /* renamed from: b  reason: collision with root package name */
        private final String f76046b;

        /* renamed from: c  reason: collision with root package name */
        private final int f76047c;

        /* renamed from: d  reason: collision with root package name */
        private final int f76048d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, int i10, int i11) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "message");
            this.f76045a = str;
            this.f76046b = str2;
            this.f76047c = i10;
            this.f76048d = i11;
        }

        public final int a() {
            return this.f76048d;
        }

        public final int b() {
            return this.f76047c;
        }

        public final String c() {
            return this.f76046b;
        }

        public final String d() {
            return this.f76045a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f76045a, aVar.f76045a) && C17542s.e(this.f76046b, aVar.f76046b) && this.f76047c == aVar.f76047c && this.f76048d == aVar.f76048d;
        }

        public int hashCode() {
            int hashCode = this.f76045a.hashCode() * 31;
            String str = this.f76046b;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f76047c)) * 31) + Integer.hashCode(this.f76048d);
        }

        public String toString() {
            String str = this.f76045a;
            String str2 = this.f76046b;
            int i10 = this.f76047c;
            int i11 = this.f76048d;
            return "AlertMessage(message=" + str + ", imageUrl=" + str2 + ", icon=" + i10 + ", actionTitle=" + i11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqe/b$b;", "Lqe/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "alertmessaging_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qe.b$b  reason: collision with other inner class name */
    public static final class C1398b extends C10189b {

        /* renamed from: a  reason: collision with root package name */
        public static final C1398b f76049a = new C1398b();

        private C1398b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1398b);
        }

        public int hashCode() {
            return 58456579;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqe/b$c;", "Lqe/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "alertmessaging_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qe.b$c */
    public static final class c extends C10189b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f76050a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -505830447;
        }

        public String toString() {
            return "None";
        }
    }

    public /* synthetic */ C10189b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C10189b() {
    }
}
