package SC;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.C18301d7;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0002\b\t¨\u0006\n"}, d2 = {"LSC/Q1;", "", "<init>", "()V", "LwK/d7;", "a", "()LwK/d7;", "b", "LSC/Q1$a;", "LSC/Q1$b;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f115893a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LSC/Q1$a;", "LSC/Q1;", "LSC/O1;", "size", "<init>", "(LSC/O1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LSC/O1;", "()LSC/O1;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Q1 {

        /* renamed from: c  reason: collision with root package name */
        public static final int f115894c = 0;

        /* renamed from: b  reason: collision with root package name */
        private final O1 f115895b;

        public a() {
            this((O1) null, 1, (DefaultConstructorMarker) null);
        }

        public final O1 b() {
            return this.f115895b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f115895b == ((a) obj).f115895b;
        }

        public int hashCode() {
            return this.f115895b.hashCode();
        }

        public String toString() {
            O1 o12 = this.f115895b;
            return "List(size=" + o12 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(O1 o12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? O1.Small : o12);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(O1 o12) {
            super((DefaultConstructorMarker) null);
            C17542s.j(o12, "size");
            this.f115895b = o12;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, d2 = {"LSC/Q1$b;", "LSC/Q1;", "LSC/P1;", "size", "", "placeholder", "", "completePriceLabel", "<init>", "(LSC/P1;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "LSC/P1;", "d", "()LSC/P1;", "c", "Z", "()Z", "Ljava/lang/String;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Q1 {

        /* renamed from: e  reason: collision with root package name */
        public static final int f115896e = 0;

        /* renamed from: b  reason: collision with root package name */
        private final P1 f115897b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f115898c;

        /* renamed from: d  reason: collision with root package name */
        private final String f115899d;

        public b() {
            this((P1) null, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public final String b() {
            return this.f115899d;
        }

        public final boolean c() {
            return this.f115898c;
        }

        public final P1 d() {
            return this.f115897b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f115897b == bVar.f115897b && this.f115898c == bVar.f115898c && C17542s.e(this.f115899d, bVar.f115899d);
        }

        public int hashCode() {
            int hashCode = ((this.f115897b.hashCode() * 31) + Boolean.hashCode(this.f115898c)) * 31;
            String str = this.f115899d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            P1 p12 = this.f115897b;
            boolean z10 = this.f115898c;
            String str = this.f115899d;
            return "Regular(size=" + p12 + ", placeholder=" + z10 + ", completePriceLabel=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(P1 p12, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? P1.Medium : p12, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(P1 p12, boolean z10, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(p12, "size");
            this.f115897b = p12;
            this.f115898c = z10;
            this.f115899d = str;
        }
    }

    public /* synthetic */ Q1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final C18301d7 a() {
        if (this instanceof a) {
            return new C18301d7.a(((a) this).b().b());
        }
        if (this instanceof b) {
            b bVar = (b) this;
            return new C18301d7.b(bVar.d().b(), bVar.c(), bVar.b());
        }
        throw new t();
    }

    private Q1() {
    }
}
