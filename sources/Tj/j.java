package Tj;

import XH.C16807N;
import XH.x;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.I;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ@\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTj/j;", "", "Lrz/I;", "product", "", "qtyToCollect", "", "forceToCollect", "", "storeId", "familyCardId", "LXH/x;", "LXH/N;", "a", "(Lrz/I;IZLjava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LTj/j$a;", "", "<init>", "()V", "a", "LTj/j$a$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends Throwable {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTj/j$a$a;", "LTj/j$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tj.j$a$a  reason: collision with other inner class name */
        public static final class C1824a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1824a f87586a = new C1824a();

            private C1824a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1824a);
            }

            public int hashCode() {
                return -608914006;
            }

            public String toString() {
                return "CollectQuantityDifferent";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    Object a(I i10, int i11, boolean z10, String str, String str2, C17164e<? super x<C16807N>> eVar);
}
