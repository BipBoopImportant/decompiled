package LC;

import gs.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LLC/b;", "", "a", "b", "LLC/b$a;", "LLC/b$b;", "image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LC.b  reason: case insensitive filesystem */
public interface C13178b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LLC/b$a;", "LLC/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LC.b$a */
    public static final class a implements C13178b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f111818a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f111819b = 0;

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 826062148;
        }

        public String toString() {
            return "DynamicWidth";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LLC/b$b;", "LLC/b;", "Lgs/h$a;", "imageSize", "<init>", "(Lgs/h$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgs/h$a;", "()Lgs/h$a;", "image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LC.b$b  reason: collision with other inner class name */
    public static final class C2734b implements C13178b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f111820b = 0;

        /* renamed from: a  reason: collision with root package name */
        private final h.a f111821a;

        public C2734b(h.a aVar) {
            C17542s.j(aVar, "imageSize");
            this.f111821a = aVar;
        }

        public final h.a a() {
            return this.f111821a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2734b) && this.f111821a == ((C2734b) obj).f111821a;
        }

        public int hashCode() {
            return this.f111821a.hashCode();
        }

        public String toString() {
            h.a aVar = this.f111821a;
            return "FixedSize(imageSize=" + aVar + ")";
        }
    }
}
