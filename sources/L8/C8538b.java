package l8;

import D8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ll8/b;", "Ll8/d;", "", "key", "", "value", "<init>", "(Ljava/lang/String;J)V", "d", "J", "c", "()J", "e", "a", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l8.b  reason: case insensitive filesystem */
public final class C8538b extends C8540d {

    /* renamed from: e  reason: collision with root package name */
    public static final a f54801e = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final long f54802d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ll8/b$a;", "", "<init>", "()V", "", "MAX_VALUE", "J", "MIN_VALUE", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l8.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8538b(String str, long j10) {
        super(str);
        c a10;
        String str2;
        C17542s.j(str, "key");
        long j11 = 0;
        if (j10 < 0) {
            a10 = C8540d.f54805b.a();
            str2 = "Dynamic Variable value is negative. Dynamic Variable is sent but the value is set to 0";
        } else {
            j11 = 4294967295L;
            if (j10 > 4294967295L) {
                a10 = C8540d.f54805b.a();
                str2 = "Dynamic Variable value is too big: the current input has a size of " + j10 + " while the limit is 4294967295. Dynamic Variable is sent but the value truncated";
            } else {
                this.f54802d = j10;
                return;
            }
        }
        a10.j(str2);
        this.f54802d = j11;
    }

    public final long c() {
        return this.f54802d;
    }
}
