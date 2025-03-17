package vH;

import AH.C15413d;
import MH.C16039a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.slf4j.Logger;
import uH.C18050a;
import uH.C18051b;
import vH.C18184w;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u0018\u0010\u0011\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"LAH/d;", "request", "", "cause", "LuH/a;", "a", "(LAH/d;Ljava/lang/Throwable;)LuH/a;", "LuH/b;", "b", "(LAH/d;Ljava/lang/Throwable;)LuH/b;", "", "timeout", "d", "(J)J", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.x  reason: case insensitive filesystem */
public final class C18185x {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f149035a = C16039a.a("io.ktor.client.plugins.HttpTimeout");

    public static final C18050a a(C15413d dVar, Throwable th2) {
        Object obj;
        C17542s.j(dVar, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connect timeout has expired [url=");
        sb2.append(dVar.h());
        sb2.append(", connect_timeout=");
        C18184w.a aVar = (C18184w.a) dVar.c(C18184w.f149015d);
        if (aVar == null || (obj = aVar.c()) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append(" ms]");
        return new C18050a(sb2.toString(), th2);
    }

    public static final C18051b b(C15413d dVar, Throwable th2) {
        Object obj;
        C17542s.j(dVar, "request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Socket timeout has expired [url=");
        sb2.append(dVar.h());
        sb2.append(", socket_timeout=");
        C18184w.a aVar = (C18184w.a) dVar.c(C18184w.f149015d);
        if (aVar == null || (obj = aVar.e()) == null) {
            obj = "unknown";
        }
        sb2.append(obj);
        sb2.append("] ms");
        return new C18051b(sb2.toString(), th2);
    }

    public static final long d(long j10) {
        if (j10 == Long.MAX_VALUE) {
            return 0;
        }
        return j10;
    }
}
