package Nj;

import XH.x;
import dI.C17164e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.b0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u000bJ@\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦B¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LNj/e;", "", "", "Lrz/b0;", "supportedProducts", "unSupportedProducts", "", "", "favorites", "LXH/x;", "LNj/e$a;", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;LdI/e;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"LNj/e$a;", "", "", "Lrz/b0;", "supportedProducts", "unSupportedProducts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b0> f83790a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b0> f83791b;

        public a(List<b0> list, List<b0> list2) {
            C17542s.j(list, "supportedProducts");
            C17542s.j(list2, "unSupportedProducts");
            this.f83790a = list;
            this.f83791b = list2;
        }

        public final List<b0> a() {
            return this.f83790a;
        }

        public final List<b0> b() {
            return this.f83791b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f83790a, aVar.f83790a) && C17542s.e(this.f83791b, aVar.f83791b);
        }

        public int hashCode() {
            return (this.f83790a.hashCode() * 31) + this.f83791b.hashCode();
        }

        public String toString() {
            List<b0> list = this.f83790a;
            List<b0> list2 = this.f83791b;
            return "UseCaseResult(supportedProducts=" + list + ", unSupportedProducts=" + list2 + ")";
        }
    }

    Object a(List<b0> list, List<b0> list2, Set<String> set, C17164e<? super x<a>> eVar);
}
