package rz;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lrz/U;", "Ljava/io/Serializable;", "<init>", "()V", "", "c", "()I", "selected", "b", "maxAvailable", "a", "max", "Lrz/U$a;", "Lrz/U$b;", "Lrz/U$c;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class U implements Serializable {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lrz/U$a;", "Lrz/U;", "", "min", "max", "maxAvailable", "selected", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends U {

        /* renamed from: a  reason: collision with root package name */
        private final int f130774a;

        /* renamed from: b  reason: collision with root package name */
        private final int f130775b;

        /* renamed from: c  reason: collision with root package name */
        private final int f130776c;

        /* renamed from: d  reason: collision with root package name */
        private final int f130777d;

        public a(int i10, int i11, int i12, int i13) {
            super((DefaultConstructorMarker) null);
            this.f130774a = i10;
            this.f130775b = i11;
            this.f130776c = i12;
            this.f130777d = i13;
        }

        public int a() {
            return this.f130775b;
        }

        public int b() {
            return this.f130776c;
        }

        public int c() {
            return this.f130777d;
        }

        public final int d() {
            return this.f130774a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f130774a == aVar.f130774a && this.f130775b == aVar.f130775b && this.f130776c == aVar.f130776c && this.f130777d == aVar.f130777d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f130774a) * 31) + Integer.hashCode(this.f130775b)) * 31) + Integer.hashCode(this.f130776c)) * 31) + Integer.hashCode(this.f130777d);
        }

        public String toString() {
            int i10 = this.f130774a;
            int i11 = this.f130775b;
            int i12 = this.f130776c;
            int i13 = this.f130777d;
            return "Available(min=" + i10 + ", max=" + i11 + ", maxAvailable=" + i12 + ", selected=" + i13 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lrz/U$b;", "Lrz/U;", "", "max", "maxAvailable", "selected", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends U {

        /* renamed from: a  reason: collision with root package name */
        private final int f130778a;

        /* renamed from: b  reason: collision with root package name */
        private final int f130779b;

        /* renamed from: c  reason: collision with root package name */
        private final int f130780c;

        public b(int i10, int i11, int i12) {
            super((DefaultConstructorMarker) null);
            this.f130778a = i10;
            this.f130779b = i11;
            this.f130780c = i12;
        }

        public int a() {
            return this.f130778a;
        }

        public int b() {
            return this.f130779b;
        }

        public int c() {
            return this.f130780c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f130778a == bVar.f130778a && this.f130779b == bVar.f130779b && this.f130780c == bVar.f130780c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f130778a) * 31) + Integer.hashCode(this.f130779b)) * 31) + Integer.hashCode(this.f130780c);
        }

        public String toString() {
            int i10 = this.f130778a;
            int i11 = this.f130779b;
            int i12 = this.f130780c;
            return "Disabled(max=" + i10 + ", maxAvailable=" + i11 + ", selected=" + i12 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lrz/U$c;", "Lrz/U;", "", "max", "maxAvailable", "selected", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends U {

        /* renamed from: a  reason: collision with root package name */
        private final int f130781a;

        /* renamed from: b  reason: collision with root package name */
        private final int f130782b;

        /* renamed from: c  reason: collision with root package name */
        private final int f130783c;

        public c(int i10, int i11, int i12) {
            super((DefaultConstructorMarker) null);
            this.f130781a = i10;
            this.f130782b = i11;
            this.f130783c = i12;
        }

        public int a() {
            return this.f130781a;
        }

        public int b() {
            return this.f130782b;
        }

        public int c() {
            return this.f130783c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f130781a == cVar.f130781a && this.f130782b == cVar.f130782b && this.f130783c == cVar.f130783c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f130781a) * 31) + Integer.hashCode(this.f130782b)) * 31) + Integer.hashCode(this.f130783c);
        }

        public String toString() {
            int i10 = this.f130781a;
            int i11 = this.f130782b;
            int i12 = this.f130783c;
            return "NotAvailable(max=" + i10 + ", maxAvailable=" + i11 + ", selected=" + i12 + ")";
        }
    }

    public /* synthetic */ U(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    private U() {
    }
}
