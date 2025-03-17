package Mh;

import ip.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LMh/b;", "", "<init>", "()V", "c", "b", "a", "LMh/b$a;", "LMh/b$b;", "LMh/b$c;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LMh/b$a;", "LMh/b;", "", "LMh/a;", "markers", "", "sheetSections", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final List<a> f61956a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Object> f61957b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<a> list, List<? extends Object> list2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "markers");
            C17542s.j(list2, "sheetSections");
            this.f61956a = list;
            this.f61957b = list2;
        }

        public final List<a> a() {
            return this.f61956a;
        }

        public final List<Object> b() {
            return this.f61957b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f61956a, aVar.f61956a) && C17542s.e(this.f61957b, aVar.f61957b);
        }

        public int hashCode() {
            return (this.f61956a.hashCode() * 31) + this.f61957b.hashCode();
        }

        public String toString() {
            List<a> list = this.f61956a;
            List<Object> list2 = this.f61957b;
            return "Content(markers=" + list + ", sheetSections=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LMh/b$b;", "LMh/b;", "Lip/d;", "", "showError", "<init>", "(Lip/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lip/d;", "()Lip/d;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mh.b$b  reason: collision with other inner class name */
    public static final class C1039b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final d<Boolean> f61958a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1039b(d<Boolean> dVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(dVar, "showError");
            this.f61958a = dVar;
        }

        public final d<Boolean> a() {
            return this.f61958a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1039b) && C17542s.e(this.f61958a, ((C1039b) obj).f61958a);
        }

        public int hashCode() {
            return this.f61958a.hashCode();
        }

        public String toString() {
            d<Boolean> dVar = this.f61958a;
            return "Error(showError=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMh/b$c;", "LMh/b;", "<init>", "()V", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f61959a = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
