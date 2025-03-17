package D4;

import D4.d0;
import YH.C16877v;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17974j;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\b\u0018\u0000 !*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\rJ5\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001bR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b&\u0010%¨\u0006)"}, d2 = {"LD4/a0;", "", "T", "", "originalPageOffsets", "", "data", "", "hintOriginalPageOffset", "hintOriginalIndices", "<init>", "([ILjava/util/List;ILjava/util/List;)V", "originalPageOffset", "(ILjava/util/List;)V", "index", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "LD4/d0$a;", "f", "(IIIII)LD4/d0$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "[I", "e", "()[I", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "I", "d", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f34266e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final a0<Object> f34267f = new a0<>(0, C16877v.n());

    /* renamed from: a  reason: collision with root package name */
    private final int[] f34268a;

    /* renamed from: b  reason: collision with root package name */
    private final List<T> f34269b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34270c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Integer> f34271d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LD4/a0$a;", "", "<init>", "()V", "LD4/a0;", "EMPTY_INITIAL_PAGE", "LD4/a0;", "a", "()LD4/a0;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0<Object> a() {
            return a0.f34267f;
        }

        private a() {
        }
    }

    public a0(int[] iArr, List<? extends T> list, int i10, List<Integer> list2) {
        C17542s.j(iArr, "originalPageOffsets");
        C17542s.j(list, "data");
        this.f34268a = iArr;
        this.f34269b = list;
        this.f34270c = i10;
        this.f34271d = list2;
        if (iArr.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        } else if (list2 != null && list2.size() != list.size()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("If originalIndices (size = ");
            C17542s.g(list2);
            sb2.append(list2.size());
            sb2.append(") is provided, it must be same length as data (size = ");
            sb2.append(list.size());
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
    }

    public final List<T> b() {
        return this.f34269b;
    }

    public final List<Integer> c() {
        return this.f34271d;
    }

    public final int d() {
        return this.f34270c;
    }

    public final int[] e() {
        return this.f34268a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(a0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        a0 a0Var = (a0) obj;
        return Arrays.equals(this.f34268a, a0Var.f34268a) && C17542s.e(this.f34269b, a0Var.f34269b) && this.f34270c == a0Var.f34270c && C17542s.e(this.f34271d, a0Var.f34271d);
    }

    public final d0.a f(int i10, int i11, int i12, int i13, int i14) {
        C17974j o10;
        int i15 = this.f34270c;
        List<Integer> list = this.f34271d;
        if (!(list == null || (o10 = C16877v.o(list)) == null || !o10.A(i10))) {
            i10 = this.f34271d.get(i10).intValue();
        }
        return new d0.a(i15, i10, i11, i12, i13, i14);
    }

    public int hashCode() {
        int hashCode = ((((Arrays.hashCode(this.f34268a) * 31) + this.f34269b.hashCode()) * 31) + this.f34270c) * 31;
        List<Integer> list = this.f34271d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f34268a) + ", data=" + this.f34269b + ", hintOriginalPageOffset=" + this.f34270c + ", hintOriginalIndices=" + this.f34271d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a0(int i10, List<? extends T> list) {
        this(new int[]{i10}, list, i10, (List<Integer>) null);
        C17542s.j(list, "data");
    }
}
