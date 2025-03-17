package xH;

import XH.C16824o;
import XH.C16825p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.helpers.NOPLoggerFactory;
import pH.C17746a;
import xH.C18591e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\"\u001f\u0010\b\u001a\u00020\u0000*\u00020\u00038FX\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"LxH/e;", "b", "()LxH/e;", "LxH/e$a;", "a", "LXH/o;", "getANDROID", "(LxH/e$a;)LxH/e;", "ANDROID", "c", "DEFAULT", "ktor-client-logging"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.f  reason: case insensitive filesystem */
public final class C18592f {

    /* renamed from: a  reason: collision with root package name */
    private static final C16824o f152214a = C16825p.b(a.f152215c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LxH/e;", "b", "()LxH/e;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: xH.f$a */
    static final class a extends C17544u implements C17631a<C18591e> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f152215c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C18591e invoke() {
            return C18592f.b();
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"xH/f$b", "LxH/e;", "", "message", "LXH/N;", "log", "(Ljava/lang/String;)V", "Lorg/slf4j/Logger;", "b", "Lorg/slf4j/Logger;", "delegate", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: xH.f$b */
    public static final class b implements C18591e {

        /* renamed from: b  reason: collision with root package name */
        private final Logger f152216b;

        b() {
            Logger logger = LoggerFactory.getLogger((Class<?>) C17746a.class);
            C17542s.g(logger);
            this.f152216b = logger;
        }

        public void log(String str) {
            C17542s.j(str, "message");
            this.f152216b.info(str);
        }
    }

    /* access modifiers changed from: private */
    public static final C18591e b() {
        C18591e c10 = c(C18591e.f152212a);
        try {
            Class<?> cls = Class.forName("android.util.Log");
            if (!(LoggerFactory.getILoggerFactory() instanceof NOPLoggerFactory)) {
                return new C18596j(0, 0, c10, 3, (DefaultConstructorMarker) null);
            }
            C17542s.i(cls, "logClass");
            return new C18596j(0, 0, new C18589c(cls, c10), 3, (DefaultConstructorMarker) null);
        } catch (ClassNotFoundException unused) {
            return new C18596j(0, 0, c10, 3, (DefaultConstructorMarker) null);
        }
    }

    public static final C18591e c(C18591e.a aVar) {
        C17542s.j(aVar, "<this>");
        return new b();
    }
}
