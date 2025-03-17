package D4;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00142\u00020\u0001:\u0001\fBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"LD4/L;", "", "", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSize", "maxSize", "jumpThreshold", "<init>", "(IIZIII)V", "a", "I", "b", "c", "Z", "d", "e", "f", "g", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L {

    /* renamed from: g  reason: collision with root package name */
    public static final a f34120g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f34121a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34122b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34123c;

    /* renamed from: d  reason: collision with root package name */
    public final int f34124d;

    /* renamed from: e  reason: collision with root package name */
    public final int f34125e;

    /* renamed from: f  reason: collision with root package name */
    public final int f34126f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD4/L$a;", "", "<init>", "()V", "", "DEFAULT_INITIAL_PAGE_MULTIPLIER", "I", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public L(int i10, int i11, boolean z10, int i12, int i13, int i14) {
        this.f34121a = i10;
        this.f34122b = i11;
        this.f34123c = z10;
        this.f34124d = i12;
        this.f34125e = i13;
        this.f34126f = i14;
        if (!z10 && i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        } else if (i13 != Integer.MAX_VALUE && i13 < (i11 * 2) + i10) {
            throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i10 + ", prefetchDist=" + i11 + ", maxSize=" + i13);
        } else if (i14 != Integer.MIN_VALUE && i14 <= 0) {
            throw new IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i15 & 2) != 0 ? i10 : i11, (i15 & 4) != 0 ? true : z10, (i15 & 8) != 0 ? i10 * 3 : i12, (i15 & 16) != 0 ? Integer.MAX_VALUE : i13, (i15 & 32) != 0 ? Integer.MIN_VALUE : i14);
    }
}
