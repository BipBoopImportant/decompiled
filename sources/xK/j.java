package XK;

import HJ.C15854t;
import WK.C16762E;
import WK.C16775j;
import WK.C16776k;
import WK.C16777l;
import WK.L;
import WK.N;
import WK.y;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import YH.C16877v;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001=B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u0010*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010+J\u001f\u0010.\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020-2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020-2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00105R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R-\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u00108BX\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"LXK/j;", "LWK/l;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLWK/l;)V", "LWK/E;", "path", "U", "(LWK/E;)LWK/E;", "", "o0", "(LWK/E;)Ljava/lang/String;", "", "LXH/v;", "h0", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "i0", "(Ljava/net/URL;)LXH/v;", "j0", "dir", "q", "(LWK/E;)Ljava/util/List;", "file", "LWK/j;", "u", "(LWK/E;)LWK/j;", "mustCreate", "mustExist", "w", "(LWK/E;ZZ)LWK/j;", "LWK/k;", "t", "(LWK/E;)LWK/k;", "LWK/N;", "B", "(LWK/E;)LWK/N;", "LWK/L;", "z", "(LWK/E;Z)LWK/L;", "d", "LXH/N;", "h", "(LWK/E;Z)V", "source", "target", "e", "(LWK/E;LWK/E;)V", "n", "Ljava/lang/ClassLoader;", "f", "LWK/l;", "g", "LXH/o;", "e0", "()Ljava/util/List;", "roots", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends C16777l {

    /* renamed from: h  reason: collision with root package name */
    private static final a f140296h = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final C16762E f140297i = C16762E.a.e(C16762E.f139592b, "/", false, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final ClassLoader f140298e;

    /* renamed from: f  reason: collision with root package name */
    private final C16777l f140299f;

    /* renamed from: g  reason: collision with root package name */
    private final C16824o f140300g;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LXK/j$a;", "", "<init>", "()V", "LWK/E;", "path", "", "c", "(LWK/E;)Z", "base", "d", "(LWK/E;LWK/E;)LWK/E;", "ROOT", "LWK/E;", "b", "()LWK/E;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean c(C16762E e10) {
            return !C15854t.F(e10.v(), ".class", true);
        }

        public final C16762E b() {
            return j.f140297i;
        }

        public final C16762E d(C16762E e10, C16762E e11) {
            C17542s.j(e10, "<this>");
            C17542s.j(e11, "base");
            return b().G(C15854t.P(C15854t.O0(e10.toString(), e11.toString()), '\\', '/', false, 4, (Object) null));
        }

        private a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ClassLoader classLoader, boolean z10, C16777l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? C16777l.f139691b : lVar);
    }

    private final C16762E U(C16762E e10) {
        return f140297i.F(e10, true);
    }

    private final List<v<C16777l, C16762E>> e0() {
        return (List) this.f140300g.getValue();
    }

    /* access modifiers changed from: private */
    public static final List f0(j jVar) {
        return jVar.h0(jVar.f140298e);
    }

    private final List<v<C16777l, C16762E>> h0(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources("");
        C17542s.i(resources, "getResources(...)");
        ArrayList<T> list = Collections.list(resources);
        C17542s.i(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (T t10 : list) {
            C17542s.g(t10);
            v<C16777l, C16762E> i02 = i0(t10);
            if (i02 != null) {
                arrayList.add(i02);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        C17542s.i(resources2, "getResources(...)");
        ArrayList<T> list2 = Collections.list(resources2);
        C17542s.i(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (T t11 : list2) {
            C17542s.g(t11);
            v<C16777l, C16762E> j02 = j0(t11);
            if (j02 != null) {
                arrayList2.add(j02);
            }
        }
        return C16877v.V0(arrayList, arrayList2);
    }

    private final v<C16777l, C16762E> i0(URL url) {
        if (!C17542s.e(url.getProtocol(), "file")) {
            return null;
        }
        return C16796C.a(this.f140299f, C16762E.a.d(C16762E.f139592b, new File(url.toURI()), false, 1, (Object) null));
    }

    private final v<C16777l, C16762E> j0(URL url) {
        int z02;
        String url2 = url.toString();
        C17542s.i(url2, "toString(...)");
        if (!C15854t.W(url2, "jar:file:", false, 2, (Object) null) || (z02 = C15854t.z0(url2, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        C16762E.a aVar = C16762E.f139592b;
        String substring = url2.substring(4, z02);
        C17542s.i(substring, "substring(...)");
        return C16796C.a(p.i(C16762E.a.d(aVar, new File(URI.create(substring)), false, 1, (Object) null), this.f140299f, new i()), f140297i);
    }

    /* access modifiers changed from: private */
    public static final boolean l0(k kVar) {
        C17542s.j(kVar, "entry");
        return f140296h.c(kVar.b());
    }

    private final String o0(C16762E e10) {
        return U(e10).E(f140297i).toString();
    }

    public N B(C16762E e10) {
        C17542s.j(e10, "file");
        if (f140296h.c(e10)) {
            C16762E e11 = f140297i;
            URL resource = this.f140298e.getResource(C16762E.H(e11, e10, false, 2, (Object) null).E(e11).toString());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                C17542s.i(inputStream, "getInputStream(...)");
                return y.l(inputStream);
            }
            throw new FileNotFoundException("file not found: " + e10);
        }
        throw new FileNotFoundException("file not found: " + e10);
    }

    public L d(C16762E e10, boolean z10) {
        C17542s.j(e10, "file");
        throw new IOException(this + " is read-only");
    }

    public void e(C16762E e10, C16762E e11) {
        C17542s.j(e10, "source");
        C17542s.j(e11, "target");
        throw new IOException(this + " is read-only");
    }

    public void h(C16762E e10, boolean z10) {
        C17542s.j(e10, "dir");
        throw new IOException(this + " is read-only");
    }

    public void n(C16762E e10, boolean z10) {
        C17542s.j(e10, "path");
        throw new IOException(this + " is read-only");
    }

    public List<C16762E> q(C16762E e10) {
        C17542s.j(e10, "dir");
        String o02 = o0(e10);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (v next : e0()) {
            C16777l lVar = (C16777l) next.a();
            C16762E e11 = (C16762E) next.b();
            try {
                ArrayList<C16762E> arrayList = new ArrayList<>();
                for (Object next2 : lVar.q(e11.G(o02))) {
                    if (f140296h.c((C16762E) next2)) {
                        arrayList.add(next2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
                for (C16762E d10 : arrayList) {
                    arrayList2.add(f140296h.d(d10, e11));
                }
                C16877v.E(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return C16877v.t1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + e10);
    }

    public C16776k t(C16762E e10) {
        C17542s.j(e10, "path");
        if (!f140296h.c(e10)) {
            return null;
        }
        String o02 = o0(e10);
        for (v next : e0()) {
            C16776k t10 = ((C16777l) next.a()).t(((C16762E) next.b()).G(o02));
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public C16775j u(C16762E e10) {
        C17542s.j(e10, "file");
        if (f140296h.c(e10)) {
            String o02 = o0(e10);
            for (v next : e0()) {
                try {
                    return ((C16777l) next.a()).u(((C16762E) next.b()).G(o02));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + e10);
        }
        throw new FileNotFoundException("file not found: " + e10);
    }

    public C16775j w(C16762E e10, boolean z10, boolean z11) {
        C17542s.j(e10, "file");
        throw new IOException("resources are not writable");
    }

    public L z(C16762E e10, boolean z10) {
        C17542s.j(e10, "file");
        throw new IOException(this + " is read-only");
    }

    public j(ClassLoader classLoader, boolean z10, C16777l lVar) {
        C17542s.j(classLoader, "classLoader");
        C17542s.j(lVar, "systemFileSystem");
        this.f140298e = classLoader;
        this.f140299f = lVar;
        this.f140300g = C16825p.b(new h(this));
        if (z10) {
            e0().size();
        }
    }
}
