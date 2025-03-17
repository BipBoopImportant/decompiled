package WK;

import WK.C16762E;
import XK.C16836c;
import XK.j;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 22\u00060\u0001j\u0002`\u0002:\u00012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bH&¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u000bH&¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u000bH&¢\u0006\u0004\b#\u0010 J\u0015\u0010$\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b$\u0010\"J!\u0010&\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u000bH&¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020%2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H&¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u000bH&¢\u0006\u0004\b/\u0010'J\u0015\u00100\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b0\u0010*J\u000f\u00101\u001a\u00020%H\u0016¢\u0006\u0004\b1\u0010\u0004¨\u00063"}, d2 = {"LWK/l;", "Ljava/io/Closeable;", "Lokio/Closeable;", "<init>", "()V", "LWK/E;", "path", "LWK/k;", "s", "(LWK/E;)LWK/k;", "t", "", "o", "(LWK/E;)Z", "dir", "", "q", "(LWK/E;)Ljava/util/List;", "file", "LWK/j;", "u", "(LWK/E;)LWK/j;", "mustCreate", "mustExist", "w", "(LWK/E;ZZ)LWK/j;", "v", "LWK/N;", "B", "(LWK/E;)LWK/N;", "LWK/L;", "z", "(LWK/E;Z)LWK/L;", "x", "(LWK/E;)LWK/L;", "d", "c", "LXH/N;", "h", "(LWK/E;Z)V", "g", "f", "(LWK/E;)V", "source", "target", "e", "(LWK/E;LWK/E;)V", "n", "l", "close", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.l  reason: case insensitive filesystem */
public abstract class C16777l implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139690a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final C16777l f139691b;

    /* renamed from: c  reason: collision with root package name */
    public static final C16762E f139692c;

    /* renamed from: d  reason: collision with root package name */
    public static final C16777l f139693d;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"LWK/l$a;", "", "<init>", "()V", "LWK/l;", "SYSTEM", "LWK/l;", "LWK/E;", "SYSTEM_TEMPORARY_DIRECTORY", "LWK/E;", "RESOURCES", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C16777l lVar;
        try {
            Class.forName("java.nio.file.Files");
            lVar = new x();
        } catch (ClassNotFoundException unused) {
            lVar = new w();
        }
        f139691b = lVar;
        C16762E.a aVar = C16762E.f139592b;
        String property = System.getProperty("java.io.tmpdir");
        C17542s.i(property, "getProperty(...)");
        f139692c = C16762E.a.e(aVar, property, false, 1, (Object) null);
        ClassLoader classLoader = j.class.getClassLoader();
        C17542s.i(classLoader, "getClassLoader(...)");
        f139693d = new j(classLoader, false, (C16777l) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void i(C16777l lVar, C16762E e10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            lVar.h(e10, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
    }

    public abstract N B(C16762E e10);

    public final L c(C16762E e10) {
        C17542s.j(e10, "file");
        return d(e10, false);
    }

    public void close() {
    }

    public abstract L d(C16762E e10, boolean z10);

    public abstract void e(C16762E e10, C16762E e11);

    public final void f(C16762E e10) {
        C17542s.j(e10, "dir");
        g(e10, false);
    }

    public final void g(C16762E e10, boolean z10) {
        C17542s.j(e10, "dir");
        C16836c.a(this, e10, z10);
    }

    public abstract void h(C16762E e10, boolean z10);

    public final void l(C16762E e10) {
        C17542s.j(e10, "path");
        n(e10, false);
    }

    public abstract void n(C16762E e10, boolean z10);

    public final boolean o(C16762E e10) {
        C17542s.j(e10, "path");
        return C16836c.b(this, e10);
    }

    public abstract List<C16762E> q(C16762E e10);

    public final C16776k s(C16762E e10) {
        C17542s.j(e10, "path");
        return C16836c.c(this, e10);
    }

    public abstract C16776k t(C16762E e10);

    public abstract C16775j u(C16762E e10);

    public final C16775j v(C16762E e10) {
        C17542s.j(e10, "file");
        return w(e10, false, false);
    }

    public abstract C16775j w(C16762E e10, boolean z10, boolean z11);

    public final L x(C16762E e10) {
        C17542s.j(e10, "file");
        return z(e10, false);
    }

    public abstract L z(C16762E e10, boolean z10);
}
