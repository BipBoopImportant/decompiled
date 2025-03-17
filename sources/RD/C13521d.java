package RD;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"LRD/d;", "LRD/c;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LXH/N;", "a", "()V", "LAe/e;", "b", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RD.d  reason: case insensitive filesystem */
public final class C13521d implements C13520c {

    /* renamed from: b  reason: collision with root package name */
    private static final a f115401b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f115402c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f115403a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LRD/d$a;", "", "<init>", "()V", "", "APP_LOCATION", "Ljava/lang/String;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RD.d$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C13521d(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f115403a = eVar;
    }

    public void a() {
        this.f115403a.track(j.ACTION_VIEWED.b(), X.m(C16796C.a("app_location", "fte"), C16796C.a("component", "welcome_message")));
    }
}
