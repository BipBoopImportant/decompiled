package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.m;
import wK.C18542x8;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"LSC/m2;", "T", "", "<init>", "()V", "a", "LSC/m2$a;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.m2  reason: case insensitive filesystem */
public abstract class C13614m2<T> {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e¨\u0006\u001f"}, d2 = {"LSC/m2$a;", "T", "LSC/m2;", "key", "", "label", "Lr0/m;", "interactionSource", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lr0/m;)V", "LwK/x8$a;", "c", "()LwK/x8$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Ljava/lang/String;", "getLabel", "Lr0/m;", "()Lr0/m;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.m2$a */
    public static final class a<T> extends C13614m2<T> {

        /* renamed from: d  reason: collision with root package name */
        public static final int f116365d = 0;

        /* renamed from: a  reason: collision with root package name */
        private final T f116366a;

        /* renamed from: b  reason: collision with root package name */
        private final String f116367b;

        /* renamed from: c  reason: collision with root package name */
        private final m f116368c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Object obj, String str, m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, str, (i10 & 4) != 0 ? null : mVar);
        }

        public m a() {
            return this.f116368c;
        }

        public T b() {
            return this.f116366a;
        }

        public final C18542x8.a<T> c() {
            return new C18542x8.a<>(b(), this.f116367b, a());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f116366a, aVar.f116366a) && C17542s.e(this.f116367b, aVar.f116367b) && C17542s.e(this.f116368c, aVar.f116368c);
        }

        public int hashCode() {
            T t10 = this.f116366a;
            int i10 = 0;
            int hashCode = (((t10 == null ? 0 : t10.hashCode()) * 31) + this.f116367b.hashCode()) * 31;
            m mVar = this.f116368c;
            if (mVar != null) {
                i10 = mVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            T t10 = this.f116366a;
            String str = this.f116367b;
            m mVar = this.f116368c;
            return "Text(key=" + t10 + ", label=" + str + ", interactionSource=" + mVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(T t10, String str, m mVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "label");
            this.f116366a = t10;
            this.f116367b = str;
            this.f116368c = mVar;
        }
    }

    public /* synthetic */ C13614m2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C13614m2() {
    }
}
