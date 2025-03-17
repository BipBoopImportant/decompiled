package sh;

import GK.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tw.h;
import tw.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lsh/d;", "Ltw/h;", "Ltw/l;", "client", "<init>", "(Ltw/l;)V", "T", "Ljava/lang/Class;", "endpoint", "b", "(Ljava/lang/Class;)Ljava/lang/Object;", "a", "Ltw/l;", "LGK/z;", "LGK/z;", "()LGK/z;", "okHttpClient", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final l f76556a;

    /* renamed from: b  reason: collision with root package name */
    private final z f76557b;

    public d(l lVar) {
        C17542s.j(lVar, "client");
        this.f76556a = lVar;
        this.f76557b = lVar.a();
    }

    public z a() {
        return this.f76557b;
    }

    public <T> T b(Class<T> cls) {
        C17542s.j(cls, "endpoint");
        return this.f76556a.b().b(cls);
    }
}
