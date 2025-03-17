package xH;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LxH/c;", "LxH/e;", "Ljava/lang/Class;", "logClass", "fallback", "<init>", "(Ljava/lang/Class;LxH/e;)V", "", "message", "LXH/N;", "log", "(Ljava/lang/String;)V", "b", "LxH/e;", "c", "Ljava/lang/String;", "tag", "Ljava/lang/reflect/Method;", "d", "Ljava/lang/reflect/Method;", "method", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.c  reason: case insensitive filesystem */
final class C18589c implements C18591e {

    /* renamed from: b  reason: collision with root package name */
    private final C18591e f152203b;

    /* renamed from: c  reason: collision with root package name */
    private final String f152204c = "Ktor Client";

    /* renamed from: d  reason: collision with root package name */
    private final Method f152205d;

    public C18589c(Class<?> cls, C18591e eVar) {
        Method method;
        Class<String> cls2 = String.class;
        C17542s.j(cls, "logClass");
        C17542s.j(eVar, "fallback");
        this.f152203b = eVar;
        try {
            method = cls.getDeclaredMethod("i", new Class[]{cls2, cls2});
        } catch (Throwable unused) {
            method = null;
        }
        this.f152205d = method;
    }

    public void log(String str) {
        C17542s.j(str, "message");
        Method method = this.f152205d;
        if (method == null) {
            this.f152203b.log(str);
            return;
        }
        try {
            method.invoke((Object) null, new Object[]{this.f152204c, str});
        } catch (Throwable unused) {
            this.f152203b.log(str);
        }
    }
}
