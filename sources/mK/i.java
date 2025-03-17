package MK;

import GK.C15774B;
import GK.C15803v;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LMK/i;", "", "<init>", "()V", "LGK/B;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "(LGK/B;Ljava/net/Proxy$Type;)Z", "", "a", "(LGK/B;Ljava/net/Proxy$Type;)Ljava/lang/String;", "LGK/v;", "url", "c", "(LGK/v;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f136473a = new i();

    private i() {
    }

    private final boolean b(C15774B b10, Proxy.Type type) {
        return !b10.g() && type == Proxy.Type.HTTP;
    }

    public final String a(C15774B b10, Proxy.Type type) {
        C17542s.j(b10, "request");
        C17542s.j(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b10.h());
        sb2.append(' ');
        i iVar = f136473a;
        if (iVar.b(b10, type)) {
            sb2.append(b10.k());
        } else {
            sb2.append(iVar.c(b10.k()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String c(C15803v vVar) {
        C17542s.j(vVar, "url");
        String d10 = vVar.d();
        String f10 = vVar.f();
        if (f10 == null) {
            return d10;
        }
        return d10 + '?' + f10;
    }
}
