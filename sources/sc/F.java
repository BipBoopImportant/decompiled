package SC;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.C18244M;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\u0005\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LSC/F;", "", "<init>", "()V", "LwK/M;", "a", "()LwK/M;", "LSC/E;", "LSC/E;", "getSize", "()LSC/E;", "size", "b", "c", "LSC/F$a;", "LSC/F$b;", "LSC/F$c;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    private final E f115710a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"LSC/F$a;", "LSC/F;", "", "iconResource", "", "contentDescription", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/String;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends F {

        /* renamed from: d  reason: collision with root package name */
        public static final int f115711d = 0;

        /* renamed from: b  reason: collision with root package name */
        private final int f115712b;

        /* renamed from: c  reason: collision with root package name */
        private final String f115713c;

        public a(int i10, String str) {
            super((DefaultConstructorMarker) null);
            this.f115712b = i10;
            this.f115713c = str;
        }

        public final String b() {
            return this.f115713c;
        }

        public final int c() {
            return this.f115712b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f115712b == aVar.f115712b && C17542s.e(this.f115713c, aVar.f115713c);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f115712b) * 31;
            String str = this.f115713c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            int i10 = this.f115712b;
            String str = this.f115713c;
            return "Icon(iconResource=" + i10 + ", contentDescription=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LSC/F$b;", "LSC/F;", "", "label", "LSC/E;", "size", "<init>", "(Ljava/lang/String;LSC/E;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "LSC/E;", "()LSC/E;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends F {

        /* renamed from: d  reason: collision with root package name */
        public static final int f115714d = 0;

        /* renamed from: b  reason: collision with root package name */
        private final String f115715b;

        /* renamed from: c  reason: collision with root package name */
        private final E f115716c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, E e10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "label");
            C17542s.j(e10, "size");
            this.f115715b = str;
            this.f115716c = e10;
        }

        public final String b() {
            return this.f115715b;
        }

        public E c() {
            return this.f115716c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f115715b, bVar.f115715b) && this.f115716c == bVar.f115716c;
        }

        public int hashCode() {
            return (this.f115715b.hashCode() * 31) + this.f115716c.hashCode();
        }

        public String toString() {
            String str = this.f115715b;
            E e10 = this.f115716c;
            return "Text(label=" + str + ", size=" + e10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"LSC/F$c;", "LSC/F;", "", "label", "", "iconResource", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "I", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends F {

        /* renamed from: d  reason: collision with root package name */
        public static final int f115717d = 0;

        /* renamed from: b  reason: collision with root package name */
        private final String f115718b;

        /* renamed from: c  reason: collision with root package name */
        private final int f115719c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str, int i10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "label");
            this.f115718b = str;
            this.f115719c = i10;
        }

        public final int b() {
            return this.f115719c;
        }

        public final String c() {
            return this.f115718b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f115718b, cVar.f115718b) && this.f115719c == cVar.f115719c;
        }

        public int hashCode() {
            return (this.f115718b.hashCode() * 31) + Integer.hashCode(this.f115719c);
        }

        public String toString() {
            String str = this.f115718b;
            int i10 = this.f115719c;
            return "TextIcon(label=" + str + ", iconResource=" + i10 + ")";
        }
    }

    public /* synthetic */ F(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final C18244M a() {
        if (this instanceof b) {
            b bVar = (b) this;
            return new C18244M.b(bVar.b(), bVar.c().b());
        } else if (this instanceof a) {
            a aVar = (a) this;
            return new C18244M.a(aVar.c(), aVar.b());
        } else if (this instanceof c) {
            c cVar = (c) this;
            return new C18244M.c(cVar.c(), cVar.b());
        } else {
            throw new t();
        }
    }

    private F() {
        this.f115710a = E.Medium;
    }
}
