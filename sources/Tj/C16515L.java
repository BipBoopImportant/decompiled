package TJ;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LTJ/L;", "", "LTJ/P;", "", "subscriptionCount", "LTJ/g;", "LTJ/J;", "a", "(LTJ/P;)LTJ/g;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.L  reason: case insensitive filesystem */
public interface C16515L {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138570a = a.f138571a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"LTJ/L$a;", "", "<init>", "()V", "", "stopTimeoutMillis", "replayExpirationMillis", "LTJ/L;", "a", "(JJ)LTJ/L;", "b", "LTJ/L;", "c", "()LTJ/L;", "Eagerly", "d", "Lazily", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.L$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f138571a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C16515L f138572b = new C16516M();

        /* renamed from: c  reason: collision with root package name */
        private static final C16515L f138573c = new C16517N();

        private a() {
        }

        public static /* synthetic */ C16515L b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final C16515L a(long j10, long j11) {
            return new C16518O(j10, j11);
        }

        public final C16515L c() {
            return f138572b;
        }

        public final C16515L d() {
            return f138573c;
        }
    }

    C16532g<C16513J> a(C16519P<Integer> p10);
}
