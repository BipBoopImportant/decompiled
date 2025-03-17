package Tj;

import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"LTj/l;", "", "LTJ/g;", "LTj/l$a;", "invoke", "()LTJ/g;", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\u0005\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LTj/l$a;", "", "<init>", "()V", "", "b", "()I", "totalQuantity", "a", "itemCount", "c", "d", "LTj/l$a$a;", "LTj/l$a$b;", "LTj/l$a$c;", "LTj/l$a$d;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"LTj/l$a$a;", "LTj/l$a;", "", "totalQuantity", "itemCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tj.l$a$a  reason: collision with other inner class name */
        public static final class C1825a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f87617a;

            /* renamed from: b  reason: collision with root package name */
            private final int f87618b;

            public C1825a(int i10, int i11) {
                super((DefaultConstructorMarker) null);
                this.f87617a = i10;
                this.f87618b = i11;
            }

            public int a() {
                return this.f87618b;
            }

            public int b() {
                return this.f87617a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1825a)) {
                    return false;
                }
                C1825a aVar = (C1825a) obj;
                return this.f87617a == aVar.f87617a && this.f87618b == aVar.f87618b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f87617a) * 31) + Integer.hashCode(this.f87618b);
            }

            public String toString() {
                int i10 = this.f87617a;
                int i11 = this.f87618b;
                return "Initial(totalQuantity=" + i10 + ", itemCount=" + i11 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"LTj/l$a$b;", "LTj/l$a;", "", "totalQuantity", "itemCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f87619a;

            /* renamed from: b  reason: collision with root package name */
            private final int f87620b;

            public b(int i10, int i11) {
                super((DefaultConstructorMarker) null);
                this.f87619a = i10;
                this.f87620b = i11;
            }

            public int a() {
                return this.f87620b;
            }

            public int b() {
                return this.f87619a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f87619a == bVar.f87619a && this.f87620b == bVar.f87620b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f87619a) * 31) + Integer.hashCode(this.f87620b);
            }

            public String toString() {
                int i10 = this.f87619a;
                int i11 = this.f87620b;
                return "ProductAdded(totalQuantity=" + i10 + ", itemCount=" + i11 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"LTj/l$a$c;", "LTj/l$a;", "", "totalQuantity", "itemCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f87621a;

            /* renamed from: b  reason: collision with root package name */
            private final int f87622b;

            public c(int i10, int i11) {
                super((DefaultConstructorMarker) null);
                this.f87621a = i10;
                this.f87622b = i11;
            }

            public int a() {
                return this.f87622b;
            }

            public int b() {
                return this.f87621a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f87621a == cVar.f87621a && this.f87622b == cVar.f87622b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f87621a) * 31) + Integer.hashCode(this.f87622b);
            }

            public String toString() {
                int i10 = this.f87621a;
                int i11 = this.f87622b;
                return "ProductRemoved(totalQuantity=" + i10 + ", itemCount=" + i11 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"LTj/l$a$d;", "LTj/l$a;", "", "totalQuantity", "itemCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f87623a;

            /* renamed from: b  reason: collision with root package name */
            private final int f87624b;

            public d(int i10, int i11) {
                super((DefaultConstructorMarker) null);
                this.f87623a = i10;
                this.f87624b = i11;
            }

            public int a() {
                return this.f87624b;
            }

            public int b() {
                return this.f87623a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f87623a == dVar.f87623a && this.f87624b == dVar.f87624b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f87623a) * 31) + Integer.hashCode(this.f87624b);
            }

            public String toString() {
                int i10 = this.f87623a;
                int i11 = this.f87624b;
                return "QuantityChanged(totalQuantity=" + i10 + ", itemCount=" + i11 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        public abstract int b();

        private a() {
        }
    }

    C16532g<a> invoke();
}
