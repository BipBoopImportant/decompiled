package jB;

import RA.C13503b;
import TJ.C16532g;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import gB.C14503e;
import gB.C14505g;
import gB.C14507i;
import gB.k;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0014(J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0016\u0010\u000bJ#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\u000bJ'\u0010\u001b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010#\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H¦@¢\u0006\u0004\b(\u0010\u000eJ7\u0010+\u001a\u00020*2\u0006\u0010\b\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b+\u0010,J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0-H¦@¢\u0006\u0004\b.\u0010/J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u00100\u001a\u00020\u0019H¦@¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020*0\u00022\u0006\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b3\u0010\u000bJ\u001b\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0007040\u0002H&¢\u0006\u0004\b5\u0010\u0006J\u0010\u00106\u001a\u00020\fH¦@¢\u0006\u0004\b6\u0010/R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020*0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0006R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0006¨\u0006<"}, d2 = {"LjB/b;", "LRA/b;", "LTJ/g;", "", "LgB/k;", "g", "()LTJ/g;", "", "listId", "LgB/e;", "e", "(Ljava/lang/String;)LTJ/g;", "LXH/N;", "d", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "newName", "c", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "itemNo", "LgB/g;", "b", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "m", "LgB/i;", "q", "", "quantity", "o", "(Ljava/lang/String;Ljava/lang/String;I)V", "LjB/b$b;", "item", "LDe/a;", "component", "LAe/k;", "actionType", "l", "(Ljava/lang/String;LjB/b$b;LDe/a;LAe/k;)V", "n", "(Ljava/lang/String;)V", "listName", "a", "items", "", "j", "(Ljava/lang/String;Ljava/util/List;LDe/a;LAe/k;)Z", "LXH/x;", "h", "(LdI/e;)Ljava/lang/Object;", "limit", "t", "(ILdI/e;)Ljava/lang/Object;", "k", "", "f", "v", "p", "isFetchingLists", "LjB/b$a;", "u", "addToListEvents", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jB.b  reason: case insensitive filesystem */
public interface C14613b extends C13503b {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LjB/b$a;", "", "", "listId", "", "itemNumbers", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getListId", "b", "Ljava/util/List;", "getItemNumbers", "()Ljava/util/List;", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jB.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f127847a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f127848b;

        public a(String str, List<String> list) {
            C17542s.j(str, "listId");
            C17542s.j(list, "itemNumbers");
            this.f127847a = str;
            this.f127848b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f127847a, aVar.f127847a) && C17542s.e(this.f127848b, aVar.f127848b);
        }

        public int hashCode() {
            return (this.f127847a.hashCode() * 31) + this.f127848b.hashCode();
        }

        public String toString() {
            String str = this.f127847a;
            List<String> list = this.f127848b;
            return "AddToListEvent(listId=" + str + ", itemNumbers=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"LjB/b$b;", "", "", "itemNo", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "shoppinglist-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jB.b$b  reason: collision with other inner class name */
    public static final class C3151b {

        /* renamed from: a  reason: collision with root package name */
        private final String f127849a;

        /* renamed from: b  reason: collision with root package name */
        private final int f127850b;

        public C3151b(String str, int i10) {
            C17542s.j(str, "itemNo");
            this.f127849a = str;
            this.f127850b = i10;
        }

        public final String a() {
            return this.f127849a;
        }

        public final int b() {
            return this.f127850b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3151b)) {
                return false;
            }
            C3151b bVar = (C3151b) obj;
            return C17542s.e(this.f127849a, bVar.f127849a) && this.f127850b == bVar.f127850b;
        }

        public int hashCode() {
            return (this.f127849a.hashCode() * 31) + Integer.hashCode(this.f127850b);
        }

        public String toString() {
            String str = this.f127849a;
            int i10 = this.f127850b;
            return "EditItemHolder(itemNo=" + str + ", quantity=" + i10 + ")";
        }
    }

    Object a(String str, C17164e<? super String> eVar);

    C16532g<C14505g> b(String str, String str2);

    Object c(String str, String str2, C17164e<? super C16807N> eVar);

    Object d(String str, C17164e<? super C16807N> eVar);

    C16532g<C14503e> e(String str);

    C16532g<Set<String>> f();

    C16532g<List<k>> g();

    Object h(C17164e<? super x<C16807N>> eVar);

    boolean j(String str, List<C3151b> list, De.a aVar, Ae.k kVar);

    C16532g<Boolean> k(String str);

    void l(String str, C3151b bVar, De.a aVar, Ae.k kVar);

    C16532g<List<C14505g>> m(String str);

    void n(String str);

    void o(String str, String str2, int i10);

    C16532g<Boolean> p();

    C16532g<List<C14507i>> q(String str);

    Object t(int i10, C17164e<? super List<String>> eVar);

    C16532g<a> u();

    Object v(C17164e<? super C16807N> eVar);
}
