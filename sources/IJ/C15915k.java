package IJ;

import IJ.C15905a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LIJ/k;", "", "LIJ/j;", "a", "()LIJ/j;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: IJ.k  reason: case insensitive filesystem */
public interface C15915k {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LIJ/k$a;", "", "<init>", "()V", "LIJ/k$a$a;", "b", "()J", "", "toString", "()Ljava/lang/String;", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: IJ.k$a */
    public static final class a implements C15915k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f135505a = new a();

        @C17604b
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0001\u0004\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u001a"}, d2 = {"LIJ/k$a$a;", "LIJ/a;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "m", "(J)J", "LIJ/b;", "n", "other", "D", "(JLIJ/a;)J", "C", "(JJ)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: IJ.k$a$a  reason: collision with other inner class name */
        public static final class C3333a implements C15905a {

            /* renamed from: a  reason: collision with root package name */
            private final long f135506a;

            private /* synthetic */ C3333a(long j10) {
                this.f135506a = j10;
            }

            public static int B(long j10) {
                return Long.hashCode(j10);
            }

            public static final long C(long j10, long j11) {
                return C15913i.f135503a.b(j10, j11);
            }

            public static long D(long j10, C15905a aVar) {
                C17542s.j(aVar, "other");
                if (aVar instanceof C3333a) {
                    return C(j10, ((C3333a) aVar).F());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + E(j10) + " and " + aVar);
            }

            public static String E(long j10) {
                return "ValueTimeMark(reading=" + j10 + ')';
            }

            public static final /* synthetic */ C3333a b(long j10) {
                return new C3333a(j10);
            }

            public static long m(long j10) {
                return j10;
            }

            public static long n(long j10) {
                return C15913i.f135503a.c(j10);
            }

            public static boolean v(long j10, Object obj) {
                return (obj instanceof C3333a) && j10 == ((C3333a) obj).F();
            }

            public final /* synthetic */ long F() {
                return this.f135506a;
            }

            public long a() {
                return n(this.f135506a);
            }

            public boolean equals(Object obj) {
                return v(this.f135506a, obj);
            }

            public int hashCode() {
                return B(this.f135506a);
            }

            /* renamed from: j */
            public int compareTo(C15905a aVar) {
                return C15905a.C3332a.a(this, aVar);
            }

            public String toString() {
                return E(this.f135506a);
            }

            public long w(C15905a aVar) {
                C17542s.j(aVar, "other");
                return D(this.f135506a, aVar);
            }
        }

        private a() {
        }

        public /* bridge */ /* synthetic */ C15914j a() {
            return C3333a.b(b());
        }

        public long b() {
            return C15913i.f135503a.d();
        }

        public String toString() {
            return C15913i.f135503a.toString();
        }
    }

    C15914j a();
}
