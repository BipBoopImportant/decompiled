package N1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LN1/l;", "", "<init>", "()V", "LN1/m;", "a", "()LN1/m;", "linkInteractionListener", "LN1/Q;", "b", "()LN1/Q;", "styles", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.l  reason: case insensitive filesystem */
public abstract class C4677l {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LN1/l$a;", "LN1/l;", "", "tag", "LN1/Q;", "styles", "LN1/m;", "linkInteractionListener", "<init>", "(Ljava/lang/String;LN1/Q;LN1/m;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "LN1/Q;", "()LN1/Q;", "LN1/m;", "()LN1/m;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N1.l$a */
    public static final class a extends C4677l {

        /* renamed from: a  reason: collision with root package name */
        private final String f9471a;

        /* renamed from: b  reason: collision with root package name */
        private final Q f9472b;

        public a(String str, Q q10, C4678m mVar) {
            super((DefaultConstructorMarker) null);
            this.f9471a = str;
            this.f9472b = q10;
        }

        public C4678m a() {
            return null;
        }

        public Q b() {
            return this.f9472b;
        }

        public final String c() {
            return this.f9471a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!C17542s.e(this.f9471a, aVar.f9471a) || !C17542s.e(b(), aVar.b())) {
                return false;
            }
            a();
            aVar.a();
            return C17542s.e((Object) null, (Object) null);
        }

        public int hashCode() {
            int hashCode = this.f9471a.hashCode() * 31;
            Q b10 = b();
            int hashCode2 = (hashCode + (b10 != null ? b10.hashCode() : 0)) * 31;
            a();
            return hashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f9471a + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LN1/l$b;", "LN1/l;", "", "url", "LN1/Q;", "styles", "LN1/m;", "linkInteractionListener", "<init>", "(Ljava/lang/String;LN1/Q;LN1/m;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "b", "LN1/Q;", "()LN1/Q;", "LN1/m;", "()LN1/m;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N1.l$b */
    public static final class b extends C4677l {

        /* renamed from: a  reason: collision with root package name */
        private final String f9473a;

        /* renamed from: b  reason: collision with root package name */
        private final Q f9474b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, Q q10, C4678m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : q10, (i10 & 4) != 0 ? null : mVar);
        }

        public C4678m a() {
            return null;
        }

        public Q b() {
            return this.f9474b;
        }

        public final String c() {
            return this.f9473a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!C17542s.e(this.f9473a, bVar.f9473a) || !C17542s.e(b(), bVar.b())) {
                return false;
            }
            a();
            bVar.a();
            return C17542s.e((Object) null, (Object) null);
        }

        public int hashCode() {
            int hashCode = this.f9473a.hashCode() * 31;
            Q b10 = b();
            int hashCode2 = (hashCode + (b10 != null ? b10.hashCode() : 0)) * 31;
            a();
            return hashCode2;
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f9473a + ')';
        }

        public b(String str, Q q10, C4678m mVar) {
            super((DefaultConstructorMarker) null);
            this.f9473a = str;
            this.f9474b = q10;
        }
    }

    public /* synthetic */ C4677l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C4678m a();

    public abstract Q b();

    private C4677l() {
    }
}
