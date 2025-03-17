package Sv;

import IC.C13023e;
import Jv.C6575a;
import Rv.c;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import tK.C18010a;
import xB.C15201a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LSv/b;", "LxB/a;", "a", "b", "d", "c", "LSv/b$c;", "LSv/b$d;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b extends C15201a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LSv/b$b;", "", "", "url", "LJv/a;", "shape", "<init>", "(Ljava/lang/String;LJv/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LJv/a;", "()LJv/a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sv.b$b  reason: collision with other inner class name */
    public static final class C0652b {

        /* renamed from: a  reason: collision with root package name */
        private final String f39942a;

        /* renamed from: b  reason: collision with root package name */
        private final C6575a f39943b;

        public C0652b(String str, C6575a aVar) {
            C17542s.j(str, "url");
            C17542s.j(aVar, "shape");
            this.f39942a = str;
            this.f39943b = aVar;
        }

        public final C6575a a() {
            return this.f39943b;
        }

        public final String b() {
            return this.f39942a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0652b)) {
                return false;
            }
            C0652b bVar = (C0652b) obj;
            return C17542s.e(this.f39942a, bVar.f39942a) && this.f39943b == bVar.f39943b;
        }

        public int hashCode() {
            return (this.f39942a.hashCode() * 31) + this.f39943b.hashCode();
        }

        public String toString() {
            String str = this.f39942a;
            C6575a aVar = this.f39943b;
            return "Image(url=" + str + ", shape=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\u00020*8\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-¨\u0006/"}, d2 = {"LSv/b$c;", "LSv/b;", "LSv/b$a;", "icon", "LIC/e;", "label", "text", "LRv/c$a;", "clickEvent", "LSv/b$b;", "image", "<init>", "(LSv/b$a;LIC/e;LIC/e;LRv/c$a;LSv/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSv/b$a;", "h", "()LSv/b$a;", "b", "LIC/e;", "l", "()LIC/e;", "c", "j", "d", "LRv/c$a;", "g", "()LRv/c$a;", "e", "LSv/b$b;", "i", "()LSv/b$b;", "", "f", "J", "()J", "stableId", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final a f39944a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f39945b;

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f39946c;

        /* renamed from: d  reason: collision with root package name */
        private final c.a f39947d;

        /* renamed from: e  reason: collision with root package name */
        private final C0652b f39948e;

        /* renamed from: f  reason: collision with root package name */
        private final long f39949f;

        public c(a aVar, C13023e eVar, C13023e eVar2, c.a aVar2, C0652b bVar) {
            C17542s.j(aVar, "icon");
            C17542s.j(eVar, "label");
            C17542s.j(eVar2, "text");
            C17542s.j(aVar2, "clickEvent");
            this.f39944a = aVar;
            this.f39945b = eVar;
            this.f39946c = eVar2;
            this.f39947d = aVar2;
            this.f39948e = bVar;
            U u10 = new U(3);
            u10.a(P.b(c.class));
            u10.a(aVar2);
            u10.b(new Object[0]);
            this.f39949f = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f39944a, cVar.f39944a) && C17542s.e(this.f39945b, cVar.f39945b) && C17542s.e(this.f39946c, cVar.f39946c) && C17542s.e(this.f39947d, cVar.f39947d) && C17542s.e(this.f39948e, cVar.f39948e);
        }

        public long f() {
            return this.f39949f;
        }

        public final c.a g() {
            return this.f39947d;
        }

        public final a h() {
            return this.f39944a;
        }

        public int hashCode() {
            int hashCode = ((((((this.f39944a.hashCode() * 31) + this.f39945b.hashCode()) * 31) + this.f39946c.hashCode()) * 31) + this.f39947d.hashCode()) * 31;
            C0652b bVar = this.f39948e;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final C0652b i() {
            return this.f39948e;
        }

        public final C13023e j() {
            return this.f39946c;
        }

        public final C13023e l() {
            return this.f39945b;
        }

        public String toString() {
            a aVar = this.f39944a;
            C13023e eVar = this.f39945b;
            C13023e eVar2 = this.f39946c;
            c.a aVar2 = this.f39947d;
            C0652b bVar = this.f39948e;
            return "Loaded(icon=" + aVar + ", label=" + eVar + ", text=" + eVar2 + ", clickEvent=" + aVar2 + ", image=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LSv/b$d;", "LSv/b;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "", "b", "J", "f", "()J", "stableId", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private final String f39950a;

        /* renamed from: b  reason: collision with root package name */
        private final long f39951b;

        public d(String str) {
            C17542s.j(str, "id");
            this.f39950a = str;
            U u10 = new U(3);
            u10.a(P.b(d.class));
            u10.a(str);
            u10.b(new Object[0]);
            this.f39951b = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f39950a, ((d) obj).f39950a);
        }

        public long f() {
            return this.f39951b;
        }

        public int hashCode() {
            return this.f39950a.hashCode();
        }

        public String toString() {
            String str = this.f39950a;
            return "Loading(id=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"LSv/b$a;", "", "", "resId", "backgroundColor", "tint", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f39939a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39940b;

        /* renamed from: c  reason: collision with root package name */
        private final int f39941c;

        public a(int i10, int i11, int i12) {
            this.f39939a = i10;
            this.f39940b = i11;
            this.f39941c = i12;
        }

        public final int a() {
            return this.f39940b;
        }

        public final int b() {
            return this.f39939a;
        }

        public final int c() {
            return this.f39941c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f39939a == aVar.f39939a && this.f39940b == aVar.f39940b && this.f39941c == aVar.f39941c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f39939a) * 31) + Integer.hashCode(this.f39940b)) * 31) + Integer.hashCode(this.f39941c);
        }

        public String toString() {
            int i10 = this.f39939a;
            int i11 = this.f39940b;
            int i12 = this.f39941c;
            return "Icon(resId=" + i10 + ", backgroundColor=" + i11 + ", tint=" + i12 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i13 & 2) != 0 ? C18010a.f147420d : i11, (i13 & 4) != 0 ? C18010a.f147426j : i12);
        }
    }
}
