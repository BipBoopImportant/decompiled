package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\u0005\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LwK/M;", "", "<init>", "()V", "LwK/K;", "a", "LwK/K;", "()LwK/K;", "size", "b", "c", "LwK/M$a;", "LwK/M$b;", "LwK/M$c;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.M  reason: case insensitive filesystem */
public abstract class C18244M {

    /* renamed from: b  reason: collision with root package name */
    public static final int f149800b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C18242K f149801a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"LwK/M$a;", "LwK/M;", "", "iconResource", "", "contentDescription", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "d", "Ljava/lang/String;", "b", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.M$a */
    public static final class a extends C18244M {

        /* renamed from: c  reason: collision with root package name */
        private final int f149802c;

        /* renamed from: d  reason: collision with root package name */
        private final String f149803d;

        public a(int i10, String str) {
            super((DefaultConstructorMarker) null);
            this.f149802c = i10;
            this.f149803d = str;
        }

        public final String b() {
            return this.f149803d;
        }

        public final int c() {
            return this.f149802c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f149802c == aVar.f149802c && C17542s.e(this.f149803d, aVar.f149803d);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f149802c) * 31;
            String str = this.f149803d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            int i10 = this.f149802c;
            String str = this.f149803d;
            return "Icon(iconResource=" + i10 + ", contentDescription=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LwK/M$b;", "LwK/M;", "", "label", "LwK/K;", "size", "<init>", "(Ljava/lang/String;LwK/K;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "LwK/K;", "a", "()LwK/K;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.M$b */
    public static final class b extends C18244M {

        /* renamed from: c  reason: collision with root package name */
        private final String f149804c;

        /* renamed from: d  reason: collision with root package name */
        private final C18242K f149805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, C18242K k10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "label");
            C17542s.j(k10, "size");
            this.f149804c = str;
            this.f149805d = k10;
        }

        public C18242K a() {
            return this.f149805d;
        }

        public final String b() {
            return this.f149804c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f149804c, bVar.f149804c) && this.f149805d == bVar.f149805d;
        }

        public int hashCode() {
            return (this.f149804c.hashCode() * 31) + this.f149805d.hashCode();
        }

        public String toString() {
            String str = this.f149804c;
            C18242K k10 = this.f149805d;
            return "Text(label=" + str + ", size=" + k10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"LwK/M$c;", "LwK/M;", "", "label", "", "iconResource", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "d", "I", "b", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.M$c */
    public static final class c extends C18244M {

        /* renamed from: c  reason: collision with root package name */
        private final String f149806c;

        /* renamed from: d  reason: collision with root package name */
        private final int f149807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, int i10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "label");
            this.f149806c = str;
            this.f149807d = i10;
        }

        public final int b() {
            return this.f149807d;
        }

        public final String c() {
            return this.f149806c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f149806c, cVar.f149806c) && this.f149807d == cVar.f149807d;
        }

        public int hashCode() {
            return (this.f149806c.hashCode() * 31) + Integer.hashCode(this.f149807d);
        }

        public String toString() {
            String str = this.f149806c;
            int i10 = this.f149807d;
            return "TextIcon(label=" + str + ", iconResource=" + i10 + ")";
        }
    }

    public /* synthetic */ C18244M(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public C18242K a() {
        return this.f149801a;
    }

    private C18244M() {
        this.f149801a = C18242K.Medium;
    }
}
