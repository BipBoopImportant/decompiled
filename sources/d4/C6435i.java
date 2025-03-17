package D4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LD4/i;", "", "Key", "Value", "a", "b", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.i  reason: case insensitive filesystem */
public abstract class C6435i<Key, Value> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0018*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\b\u0010\u0014¨\u0006\u0019"}, d2 = {"LD4/i$a;", "", "Value", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/List;", "data", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "prevKey", "c", "nextKey", "", "I", "()I", "itemsBefore", "e", "itemsAfter", "f", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.i$a */
    public static final class a<Value> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0549a f34354f = new C0549a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final List<Value> f34355a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f34356b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f34357c;

        /* renamed from: d  reason: collision with root package name */
        private final int f34358d;

        /* renamed from: e  reason: collision with root package name */
        private final int f34359e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD4/i$a$a;", "", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: D4.i$a$a  reason: collision with other inner class name */
        public static final class C0549a {
            public /* synthetic */ C0549a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0549a() {
            }
        }

        public final int a() {
            return this.f34359e;
        }

        public final int b() {
            return this.f34358d;
        }

        public final Object c() {
            return this.f34357c;
        }

        public final Object d() {
            return this.f34356b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f34355a, aVar.f34355a) && C17542s.e(this.f34356b, aVar.f34356b) && C17542s.e(this.f34357c, aVar.f34357c) && this.f34358d == aVar.f34358d && this.f34359e == aVar.f34359e;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"LD4/i$b;", "", "K", "LD4/x;", "type", "key", "", "initialLoadSize", "", "placeholdersEnabled", "pageSize", "<init>", "(LD4/x;Ljava/lang/Object;IZI)V", "a", "LD4/x;", "getType$paging_common", "()LD4/x;", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "I", "getInitialLoadSize", "()I", "d", "Z", "getPlaceholdersEnabled", "()Z", "e", "getPageSize", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.i$b */
    public static final class b<K> {

        /* renamed from: a  reason: collision with root package name */
        private final C6449x f34360a;

        /* renamed from: b  reason: collision with root package name */
        private final K f34361b;

        /* renamed from: c  reason: collision with root package name */
        private final int f34362c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f34363d;

        /* renamed from: e  reason: collision with root package name */
        private final int f34364e;

        public b(C6449x xVar, K k10, int i10, boolean z10, int i11) {
            C17542s.j(xVar, "type");
            this.f34360a = xVar;
            this.f34361b = k10;
            this.f34362c = i10;
            this.f34363d = z10;
            this.f34364e = i11;
            if (xVar != C6449x.REFRESH && k10 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }
    }
}
