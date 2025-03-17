package S5;

import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LS5/u;", "", "<init>", "()V", "", "a", "()J", "Lkotlin/Function0;", "b", "LnI/a;", "provider", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f39913a = new u();

    /* renamed from: b  reason: collision with root package name */
    private static C17631a<Long> f39914b = a.f39915a;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39915a = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* renamed from: t */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private u() {
    }

    public final long a() {
        return f39914b.invoke().longValue();
    }
}
