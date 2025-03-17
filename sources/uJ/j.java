package Uj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\b\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"LUj/j;", "", "<init>", "()V", "", "a", "()Z", "canAddSelectedQuantityToCart", "b", "c", "LUj/j$a;", "LUj/j$b;", "LUj/j$c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LUj/j$a;", "LUj/j;", "", "canAddSelectedQuantityToCart", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f88114a;

        public a(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f88114a = z10;
        }

        public boolean a() {
            return this.f88114a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f88114a == ((a) obj).f88114a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f88114a);
        }

        public String toString() {
            boolean z10 = this.f88114a;
            return "Disabled(canAddSelectedQuantityToCart=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006 "}, d2 = {"LUj/j$b;", "LUj/j;", "", "min", "max", "selected", "", "canAddSelectedQuantityToCart", "<init>", "(IIIZ)V", "b", "(IIIZ)LUj/j$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "d", "c", "f", "Z", "()Z", "Ljava/lang/String;", "g", "selectedQuantity", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        private final int f88115a;

        /* renamed from: b  reason: collision with root package name */
        private final int f88116b;

        /* renamed from: c  reason: collision with root package name */
        private final int f88117c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f88118d;

        /* renamed from: e  reason: collision with root package name */
        private final String f88119e;

        public b(int i10, int i11, int i12, boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f88115a = i10;
            this.f88116b = i11;
            this.f88117c = i12;
            this.f88118d = z10;
            this.f88119e = String.valueOf(i12);
        }

        public static /* synthetic */ b c(b bVar, int i10, int i11, int i12, boolean z10, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = bVar.f88115a;
            }
            if ((i13 & 2) != 0) {
                i11 = bVar.f88116b;
            }
            if ((i13 & 4) != 0) {
                i12 = bVar.f88117c;
            }
            if ((i13 & 8) != 0) {
                z10 = bVar.f88118d;
            }
            return bVar.b(i10, i11, i12, z10);
        }

        public boolean a() {
            return this.f88118d;
        }

        public final b b(int i10, int i11, int i12, boolean z10) {
            return new b(i10, i11, i12, z10);
        }

        public final int d() {
            return this.f88116b;
        }

        public final int e() {
            return this.f88115a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f88115a == bVar.f88115a && this.f88116b == bVar.f88116b && this.f88117c == bVar.f88117c && this.f88118d == bVar.f88118d;
        }

        public final int f() {
            return this.f88117c;
        }

        public final String g() {
            return this.f88119e;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f88115a) * 31) + Integer.hashCode(this.f88116b)) * 31) + Integer.hashCode(this.f88117c)) * 31) + Boolean.hashCode(this.f88118d);
        }

        public String toString() {
            int i10 = this.f88115a;
            int i11 = this.f88116b;
            int i12 = this.f88117c;
            boolean z10 = this.f88118d;
            return "Inlined(min=" + i10 + ", max=" + i11 + ", selected=" + i12 + ", canAddSelectedQuantityToCart=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\n¨\u0006\u001a"}, d2 = {"LUj/j$c;", "LUj/j;", "", "selected", "", "canAddSelectedQuantityToCart", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getSelected", "b", "Z", "()Z", "c", "Ljava/lang/String;", "selectedQuantity", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends j {

        /* renamed from: a  reason: collision with root package name */
        private final int f88120a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f88121b;

        /* renamed from: c  reason: collision with root package name */
        private final String f88122c;

        public c(int i10, boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f88120a = i10;
            this.f88121b = z10;
            this.f88122c = String.valueOf(i10);
        }

        public boolean a() {
            return this.f88121b;
        }

        public final String b() {
            return this.f88122c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f88120a == cVar.f88120a && this.f88121b == cVar.f88121b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f88120a) * 31) + Boolean.hashCode(this.f88121b);
        }

        public String toString() {
            int i10 = this.f88120a;
            boolean z10 = this.f88121b;
            return "Modal(selected=" + i10 + ", canAddSelectedQuantityToCart=" + z10 + ")";
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a();

    private j() {
    }
}
