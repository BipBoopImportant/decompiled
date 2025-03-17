package E5;

import E5.o;
import S5.j;
import WK.C16762E;
import WK.C16772g;
import WK.C16777l;
import WK.y;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LE5/n;", "LE5/o;", "LWK/E;", "file", "LWK/l;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "LE5/o$a;", "metadata", "<init>", "(LWK/E;LWK/l;Ljava/lang/String;Ljava/io/Closeable;LE5/o$a;)V", "LXH/N;", "d", "()V", "LWK/g;", "k3", "()LWK/g;", "close", "a", "LWK/E;", "getFile$coil_base_release", "()LWK/E;", "b", "LWK/l;", "r", "()LWK/l;", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/io/Closeable;", "LE5/o$a;", "()LE5/o$a;", "", "f", "Z", "isClosed", "g", "LWK/g;", "source", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends o {

    /* renamed from: a  reason: collision with root package name */
    private final C16762E f34892a;

    /* renamed from: b  reason: collision with root package name */
    private final C16777l f34893b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34894c;

    /* renamed from: d  reason: collision with root package name */
    private final Closeable f34895d;

    /* renamed from: e  reason: collision with root package name */
    private final o.a f34896e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34897f;

    /* renamed from: g  reason: collision with root package name */
    private C16772g f34898g;

    public n(C16762E e10, C16777l lVar, String str, Closeable closeable, o.a aVar) {
        super((DefaultConstructorMarker) null);
        this.f34892a = e10;
        this.f34893b = lVar;
        this.f34894c = str;
        this.f34895d = closeable;
        this.f34896e = aVar;
    }

    private final void d() {
        if (this.f34897f) {
            throw new IllegalStateException("closed");
        }
    }

    public o.a c() {
        return this.f34896e;
    }

    public synchronized void close() {
        try {
            this.f34897f = true;
            C16772g gVar = this.f34898g;
            if (gVar != null) {
                j.d(gVar);
            }
            Closeable closeable = this.f34895d;
            if (closeable != null) {
                j.d(closeable);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final String e() {
        return this.f34894c;
    }

    public synchronized C16772g k3() {
        d();
        C16772g gVar = this.f34898g;
        if (gVar != null) {
            return gVar;
        }
        C16772g d10 = y.d(r().B(this.f34892a));
        this.f34898g = d10;
        return d10;
    }

    public C16777l r() {
        return this.f34893b;
    }
}
