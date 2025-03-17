package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\bB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00028\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"LwK/x8;", "T", "", "key", "Lr0/m;", "interactionSource", "<init>", "(Ljava/lang/Object;Lr0/m;)V", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "Lr0/m;", "getInteractionSource", "()Lr0/m;", "LwK/x8$a;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.x8  reason: case insensitive filesystem */
public abstract class C18542x8<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f151914a;

    /* renamed from: b  reason: collision with root package name */
    private final m f151915b;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LwK/x8$a;", "T", "LwK/x8;", "key", "", "label", "Lr0/m;", "interactionSource", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Lr0/m;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "d", "Ljava/lang/String;", "e", "Lr0/m;", "a", "()Lr0/m;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.x8$a */
    public static final class a<T> extends C18542x8<T> {

        /* renamed from: c  reason: collision with root package name */
        private final T f151916c;

        /* renamed from: d  reason: collision with root package name */
        private final String f151917d;

        /* renamed from: e  reason: collision with root package name */
        private final m f151918e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(T t10, String str, m mVar) {
            super(t10, mVar, (DefaultConstructorMarker) null);
            C17542s.j(str, "label");
            this.f151916c = t10;
            this.f151917d = str;
            this.f151918e = mVar;
        }

        public m a() {
            return this.f151918e;
        }

        public T b() {
            return this.f151916c;
        }

        public final String c() {
            return this.f151917d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f151916c, aVar.f151916c) && C17542s.e(this.f151917d, aVar.f151917d) && C17542s.e(this.f151918e, aVar.f151918e);
        }

        public int hashCode() {
            T t10 = this.f151916c;
            int i10 = 0;
            int hashCode = (((t10 == null ? 0 : t10.hashCode()) * 31) + this.f151917d.hashCode()) * 31;
            m mVar = this.f151918e;
            if (mVar != null) {
                i10 = mVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            T t10 = this.f151916c;
            String str = this.f151917d;
            m mVar = this.f151918e;
            return "Text(key=" + t10 + ", label=" + str + ", interactionSource=" + mVar + ")";
        }
    }

    public /* synthetic */ C18542x8(Object obj, m mVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, mVar);
    }

    private C18542x8(T t10, m mVar) {
        this.f151914a = t10;
        this.f151915b = mVar;
    }
}
