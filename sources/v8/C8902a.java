package v8;

import HJ.C15854t;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0002\u000b\u000eB!\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lv8/a;", "", "Ljava/lang/Class;", "heapClass", "Lkotlin/Function0;", "", "isEnabled", "<init>", "(Ljava/lang/Class;LnI/a;)V", "Ljava/lang/reflect/Method;", "", "a", "(Ljava/lang/reflect/Method;)Ljava/lang/Long;", "Lv8/a$b;", "b", "()Lv8/a$b;", "LnI/a;", "Ljava/lang/reflect/Method;", "getSessionIdMethod", "c", "getUserIdMethod", "d", "getEnvironmentIdMethod", "e", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v8.a  reason: case insensitive filesystem */
public final class C8902a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0917a f56952e = new C0917a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<Boolean> f56953a;

    /* renamed from: b  reason: collision with root package name */
    private Method f56954b;

    /* renamed from: c  reason: collision with root package name */
    private Method f56955c;

    /* renamed from: d  reason: collision with root package name */
    private Method f56956d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lv8/a$a;", "", "<init>", "()V", "", "HEAP_APP_ID", "Ljava/lang/String;", "HEAP_SESSION_ID", "HEAP_USER_ID", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v8.a$a  reason: collision with other inner class name */
    public static final class C0917a {
        private C0917a() {
        }

        public /* synthetic */ C0917a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"Lv8/a$b;", "", "", "sessionId", "userId", "appId", "<init>", "(JJJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "c", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v8.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f56957a;

        /* renamed from: b  reason: collision with root package name */
        private final long f56958b;

        /* renamed from: c  reason: collision with root package name */
        private final long f56959c;

        public b(long j10, long j11, long j12) {
            this.f56957a = j10;
            this.f56958b = j11;
            this.f56959c = j12;
        }

        public final long a() {
            return this.f56959c;
        }

        public final long b() {
            return this.f56957a;
        }

        public final long c() {
            return this.f56958b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56957a == bVar.f56957a && this.f56958b == bVar.f56958b && this.f56959c == bVar.f56959c;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.f56958b);
            return Long.hashCode(this.f56959c) + ((hashCode + (Long.hashCode(this.f56957a) * 31)) * 31);
        }

        public String toString() {
            return "HeapMetadata(sessionId=" + this.f56957a + ", userId=" + this.f56958b + ", appId=" + this.f56959c + ')';
        }
    }

    public C8902a(Class<?> cls, C17631a<Boolean> aVar) {
        C17542s.j(cls, "heapClass");
        C17542s.j(aVar, "isEnabled");
        this.f56953a = aVar;
        this.f56954b = cls.getDeclaredMethod("getSessionId", (Class[]) null);
        this.f56955c = cls.getDeclaredMethod("getUserId", (Class[]) null);
        this.f56956d = cls.getDeclaredMethod("getEnvironmentId", (Class[]) null);
    }

    private final Long a(Method method) {
        Object invoke = method.invoke((Object) null, (Object[]) null);
        String str = invoke instanceof String ? (String) invoke : null;
        if (str != null) {
            return C15854t.v(str);
        }
        return null;
    }

    public final b b() {
        if (!this.f56953a.invoke().booleanValue()) {
            return null;
        }
        Method method = this.f56954b;
        Long a10 = method != null ? a(method) : null;
        Method method2 = this.f56955c;
        Long a11 = method2 != null ? a(method2) : null;
        Method method3 = this.f56956d;
        Long a12 = method3 != null ? a(method3) : null;
        if (a10 == null || a11 == null || a12 == null) {
            return null;
        }
        return new b(a10.longValue(), a11.longValue(), a12.longValue());
    }
}
