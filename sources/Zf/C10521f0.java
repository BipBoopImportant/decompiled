package zf;

import cb.C9449c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0006\t\nR\u0014\u0010\u0005\u001a\u00020\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lzf/f0;", "", "", "getDescription", "()I", "description", "a", "()Ljava/lang/Integer;", "buttonText", "c", "b", "Lzf/f0$a;", "Lzf/f0$b;", "Lzf/f0$c;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zf.f0  reason: case insensitive filesystem */
public interface C10521f0 {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzf/f0$b;", "Lzf/f0;", "", "description", "buttonText", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDescription", "b", "()Ljava/lang/Integer;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f0$b */
    public static final class b implements C10521f0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f78270a;

        /* renamed from: b  reason: collision with root package name */
        private final int f78271b;

        public b() {
            this(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public Integer a() {
            return Integer.valueOf(this.f78271b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f78270a == bVar.f78270a && this.f78271b == bVar.f78271b;
        }

        public int getDescription() {
            return this.f78270a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f78270a) * 31) + Integer.hashCode(this.f78271b);
        }

        public String toString() {
            int i10 = this.f78270a;
            int i11 = this.f78271b;
            return "UpdateDownloaded(description=" + i10 + ", buttonText=" + i11 + ")";
        }

        public b(int i10, int i11) {
            this.f78270a = i10;
            this.f78271b = i11;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? Oo.b.f84561Y3 : i10, (i12 & 2) != 0 ? Oo.b.f84531V3 : i11);
        }
    }

    Integer a();

    int getDescription();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzf/f0$a;", "Lzf/f0;", "Lcb/c$a;", "appUpdateResult", "", "description", "buttonText", "<init>", "(Lcb/c$a;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb/c$a;", "b", "()Lcb/c$a;", "I", "getDescription", "c", "()Ljava/lang/Integer;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f0$a */
    public static final class a implements C10521f0 {

        /* renamed from: a  reason: collision with root package name */
        private final C9449c.a f78267a;

        /* renamed from: b  reason: collision with root package name */
        private final int f78268b;

        /* renamed from: c  reason: collision with root package name */
        private final int f78269c;

        public a(C9449c.a aVar, int i10, int i11) {
            C17542s.j(aVar, "appUpdateResult");
            this.f78267a = aVar;
            this.f78268b = i10;
            this.f78269c = i11;
        }

        public Integer a() {
            return Integer.valueOf(this.f78269c);
        }

        public final C9449c.a b() {
            return this.f78267a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f78267a, aVar.f78267a) && this.f78268b == aVar.f78268b && this.f78269c == aVar.f78269c;
        }

        public int getDescription() {
            return this.f78268b;
        }

        public int hashCode() {
            return (((this.f78267a.hashCode() * 31) + Integer.hashCode(this.f78268b)) * 31) + Integer.hashCode(this.f78269c);
        }

        public String toString() {
            C9449c.a aVar = this.f78267a;
            int i10 = this.f78268b;
            int i11 = this.f78269c;
            return "UpdateAvailable(appUpdateResult=" + aVar + ", description=" + i10 + ", buttonText=" + i11 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C9449c.a aVar, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i12 & 2) != 0 ? Oo.b.f84551X3 : i10, (i12 & 4) != 0 ? Oo.b.f84541W3 : i11);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzf/f0$c;", "Lzf/f0;", "", "percentageDownloaded", "description", "buttonText", "<init>", "(IILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "getDescription", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zf.f0$c */
    public static final class c implements C10521f0 {

        /* renamed from: a  reason: collision with root package name */
        private final int f78272a;

        /* renamed from: b  reason: collision with root package name */
        private final int f78273b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f78274c;

        public c(int i10, int i11, Integer num) {
            this.f78272a = i10;
            this.f78273b = i11;
            this.f78274c = num;
        }

        public Integer a() {
            return this.f78274c;
        }

        public final int b() {
            return this.f78272a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f78272a == cVar.f78272a && this.f78273b == cVar.f78273b && C17542s.e(this.f78274c, cVar.f78274c);
        }

        public int getDescription() {
            return this.f78273b;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f78272a) * 31) + Integer.hashCode(this.f78273b)) * 31;
            Integer num = this.f78274c;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            int i10 = this.f78272a;
            int i11 = this.f78273b;
            Integer num = this.f78274c;
            return "UpdateDownloading(percentageDownloaded=" + i10 + ", description=" + i11 + ", buttonText=" + num + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(int i10, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? Oo.b.f84571Z3 : i11, (i12 & 4) != 0 ? null : num);
        }
    }
}
