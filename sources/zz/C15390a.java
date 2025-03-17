package zz;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lzz/a;", "", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "rating", "", "storeId", "LXH/N;", "a", "(ILjava/lang/String;)V", "LAe/e;", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zz.a  reason: case insensitive filesystem */
public final class C15390a {

    /* renamed from: b  reason: collision with root package name */
    public static final C3281a f132793b = new C3281a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f132794c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f132795a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lzz/a$a;", "", "<init>", "()V", "", "RATING_FROM", "J", "RATING_TO", "", "STARS", "Ljava/lang/String;", "VERSION", "ONLINE_MODE", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zz.a$a  reason: collision with other inner class name */
    public static final class C3281a {
        public /* synthetic */ C3281a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3281a() {
        }
    }

    public C15390a(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f132795a = eVar;
    }

    public final void a(int i10, String str) {
        C17542s.j(str, "storeId");
        this.f132795a.track(j.SHOP_AND_GO_RATING.b(), X.m(C16796C.a("store_id", str), C16796C.a("stars", Integer.valueOf(i10)), C16796C.a("version", "OnlineMode")));
    }
}
