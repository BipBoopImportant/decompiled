package MI;

import TI.C16503g;
import TI.u;
import cJ.C17065b;
import cJ.C17066c;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: MI.u  reason: case insensitive filesystem */
public interface C16076u {
    C16503g a(a aVar);

    Set<String> b(C17066c cVar);

    u c(C17066c cVar, boolean z10);

    /* renamed from: MI.u$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C17065b f136390a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f136391b;

        /* renamed from: c  reason: collision with root package name */
        private final C16503g f136392c;

        public a(C17065b bVar, byte[] bArr, C16503g gVar) {
            C17542s.j(bVar, "classId");
            this.f136390a = bVar;
            this.f136391b = bArr;
            this.f136392c = gVar;
        }

        public final C17065b a() {
            return this.f136390a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f136390a, aVar.f136390a) && C17542s.e(this.f136391b, aVar.f136391b) && C17542s.e(this.f136392c, aVar.f136392c);
        }

        public int hashCode() {
            int hashCode = this.f136390a.hashCode() * 31;
            byte[] bArr = this.f136391b;
            int i10 = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            C16503g gVar = this.f136392c;
            if (gVar != null) {
                i10 = gVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            return "Request(classId=" + this.f136390a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f136391b) + ", outerClass=" + this.f136392c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C17065b bVar, byte[] bArr, C16503g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }
    }
}
