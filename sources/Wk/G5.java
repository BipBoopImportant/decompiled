package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LwK/G5;", "", "<init>", "()V", "b", "a", "c", "LwK/G5$a;", "LwK/G5$b;", "LwK/G5$c;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class G5 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f149530a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LwK/G5$a;", "LwK/G5;", "LwK/H5;", "trailingAction", "leadingAction", "<init>", "(LwK/H5;LwK/H5;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LwK/H5;", "()LwK/H5;", "c", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends G5 {

        /* renamed from: b  reason: collision with root package name */
        private final H5 f149531b;

        /* renamed from: c  reason: collision with root package name */
        private final H5 f149532c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(H5 h52, H5 h53) {
            super((DefaultConstructorMarker) null);
            C17542s.j(h52, "trailingAction");
            this.f149531b = h52;
            this.f149532c = h53;
        }

        public final H5 a() {
            return this.f149532c;
        }

        public final H5 b() {
            return this.f149531b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f149531b, aVar.f149531b) && C17542s.e(this.f149532c, aVar.f149532c);
        }

        public int hashCode() {
            int hashCode = this.f149531b.hashCode() * 31;
            H5 h52 = this.f149532c;
            return hashCode + (h52 == null ? 0 : h52.hashCode());
        }

        public String toString() {
            H5 h52 = this.f149531b;
            H5 h53 = this.f149532c;
            return "Floating(trailingAction=" + h52 + ", leadingAction=" + h53 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"LwK/G5$b;", "LwK/G5;", "", "title", "LwK/H5;", "trailingAction", "leadingAction", "<init>", "(Ljava/lang/String;LwK/H5;LwK/H5;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "LwK/H5;", "()LwK/H5;", "d", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends G5 {

        /* renamed from: b  reason: collision with root package name */
        private final String f149533b;

        /* renamed from: c  reason: collision with root package name */
        private final H5 f149534c;

        /* renamed from: d  reason: collision with root package name */
        private final H5 f149535d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, H5 h52, H5 h53) {
            super((DefaultConstructorMarker) null);
            C17542s.j(h52, "trailingAction");
            this.f149533b = str;
            this.f149534c = h52;
            this.f149535d = h53;
        }

        public final H5 a() {
            return this.f149535d;
        }

        public final String b() {
            return this.f149533b;
        }

        public final H5 c() {
            return this.f149534c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f149533b, bVar.f149533b) && C17542s.e(this.f149534c, bVar.f149534c) && C17542s.e(this.f149535d, bVar.f149535d);
        }

        public int hashCode() {
            String str = this.f149533b;
            int i10 = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f149534c.hashCode()) * 31;
            H5 h52 = this.f149535d;
            if (h52 != null) {
                i10 = h52.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f149533b;
            H5 h52 = this.f149534c;
            H5 h53 = this.f149535d;
            return "Regular(title=" + str + ", trailingAction=" + h52 + ", leadingAction=" + h53 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LwK/G5$c;", "LwK/G5;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends G5 {

        /* renamed from: b  reason: collision with root package name */
        public static final c f149536b = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1549303501;
        }

        public String toString() {
            return "Resizeable";
        }
    }

    public /* synthetic */ G5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private G5() {
    }
}
