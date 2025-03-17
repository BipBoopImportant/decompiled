package rz;

import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrz/V;", "", "<init>", "()V", "b", "a", "Lrz/V$a;", "Lrz/V$b;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class V {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lrz/V$a;", "Lrz/V;", "", "text", "Lrz/V$a$a;", "type", "", "Lrz/T;", "options", "<init>", "(Ljava/lang/String;Lrz/V$a$a;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "b", "Lrz/V$a$a;", "getType", "()Lrz/V$a$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends V {

        /* renamed from: a  reason: collision with root package name */
        private final String f130784a;

        /* renamed from: b  reason: collision with root package name */
        private final C3234a f130785b;

        /* renamed from: c  reason: collision with root package name */
        private final List<T> f130786c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lrz/V$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "TEXT", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rz.V$a$a  reason: collision with other inner class name */
        public enum C3234a {
            IMAGE,
            TEXT;

            static {
                C3234a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, C3234a aVar, List<T> list) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            C17542s.j(aVar, "type");
            C17542s.j(list, "options");
            this.f130784a = str;
            this.f130785b = aVar;
            this.f130786c = list;
        }

        public final List<T> a() {
            return this.f130786c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f130784a, aVar.f130784a) && this.f130785b == aVar.f130785b && C17542s.e(this.f130786c, aVar.f130786c);
        }

        public int hashCode() {
            return (((this.f130784a.hashCode() * 31) + this.f130785b.hashCode()) * 31) + this.f130786c.hashCode();
        }

        public String toString() {
            String str = this.f130784a;
            C3234a aVar = this.f130785b;
            List<T> list = this.f130786c;
            return "AvailableVariant(text=" + str + ", type=" + aVar + ", options=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/V$b;", "Lrz/V;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends V {

        /* renamed from: a  reason: collision with root package name */
        public static final b f130787a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ V(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private V() {
    }
}
