package rz;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrz/i;", "", "<init>", "()V", "b", "a", "Lrz/i$a;", "Lrz/i$b;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.i  reason: case insensitive filesystem */
public abstract class C15016i {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrz/i$a;", "Lrz/i;", "", "Lrz/h;", "itemsInStock", "itemsOutOfStock", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.i$a */
    public static final class a extends C15016i {

        /* renamed from: a  reason: collision with root package name */
        private final List<C15015h> f130857a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C15015h> f130858b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List<C15015h> list, List<C15015h> list2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "itemsInStock");
            C17542s.j(list2, "itemsOutOfStock");
            this.f130857a = list;
            this.f130858b = list2;
        }

        public final List<C15015h> a() {
            return this.f130857a;
        }

        public final List<C15015h> b() {
            return this.f130858b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f130857a, aVar.f130857a) && C17542s.e(this.f130858b, aVar.f130858b);
        }

        public int hashCode() {
            return (this.f130857a.hashCode() * 31) + this.f130858b.hashCode();
        }

        public String toString() {
            List<C15015h> list = this.f130857a;
            List<C15015h> list2 = this.f130858b;
            return "Available(itemsInStock=" + list + ", itemsOutOfStock=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrz/i$b;", "Lrz/i;", "<init>", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rz.i$b */
    public static final class b extends C15016i {

        /* renamed from: a  reason: collision with root package name */
        public static final b f130859a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C15016i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C15016i() {
    }
}
