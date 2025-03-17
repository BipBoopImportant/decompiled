package E5;

import E5.o;
import S5.j;
import WK.C16762E;
import WK.C16772g;
import WK.C16777l;
import WK.y;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LE5/t;", "LE5/o;", "LWK/g;", "source", "Lkotlin/Function0;", "Ljava/io/File;", "cacheDirectoryFactory", "LE5/o$a;", "metadata", "<init>", "(LWK/g;LnI/a;LE5/o$a;)V", "LXH/N;", "d", "()V", "k3", "()LWK/g;", "close", "a", "LE5/o$a;", "c", "()LE5/o$a;", "", "b", "Z", "isClosed", "LWK/g;", "LnI/a;", "LWK/E;", "e", "LWK/E;", "file", "LWK/l;", "r", "()LWK/l;", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.a f34904a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34905b;

    /* renamed from: c  reason: collision with root package name */
    private C16772g f34906c;

    /* renamed from: d  reason: collision with root package name */
    private C17631a<? extends File> f34907d;

    /* renamed from: e  reason: collision with root package name */
    private C16762E f34908e;

    public t(C16772g gVar, C17631a<? extends File> aVar, o.a aVar2) {
        super((DefaultConstructorMarker) null);
        this.f34904a = aVar2;
        this.f34906c = gVar;
        this.f34907d = aVar;
    }

    private final void d() {
        if (this.f34905b) {
            throw new IllegalStateException("closed");
        }
    }

    public o.a c() {
        return this.f34904a;
    }

    public synchronized void close() {
        try {
            this.f34905b = true;
            C16772g gVar = this.f34906c;
            if (gVar != null) {
                j.d(gVar);
            }
            C16762E e10 = this.f34908e;
            if (e10 != null) {
                r().l(e10);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized C16772g k3() {
        d();
        C16772g gVar = this.f34906c;
        if (gVar != null) {
            return gVar;
        }
        C16777l r10 = r();
        C16762E e10 = this.f34908e;
        C17542s.g(e10);
        C16772g d10 = y.d(r10.B(e10));
        this.f34906c = d10;
        return d10;
    }

    public C16777l r() {
        return C16777l.f139691b;
    }
}
