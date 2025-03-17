package r6;

import QJ.M;
import T5.C6704h;
import T5.G;
import T5.n;
import X5.C6724i;
import XH.v;
import YH.C16877v;
import Z5.j;
import c6.C7098d;
import c6.C7099e;
import d6.C7747c;
import dI.C17168i;
import java.io.Closeable;
import java.util.List;
import k6.C8438e;
import k6.C8441h;
import k6.C8448o;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import r6.s;
import uI.C18055d;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0002*\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0019\u001a\u00020\u0014*\u00020\u00142\u001c\u0010\u0018\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-\"(\u00104\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0018\u00108\u001a\u00020 *\u0002058@X\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0018\u0010<\u001a\u000209*\u0002058@X\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\" \u0010C\u001a\u0004\u0018\u00010>*\u00020=8@X\u0004¢\u0006\f\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Ljava/io/Closeable;", "Lokio/Closeable;", "LXH/N;", "h", "(Ljava/io/Closeable;)V", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "i", "(Ljava/lang/AutoCloseable;)V", "LT5/h;", "", "data", "Lk6/q;", "options", "Lr6/s;", "logger", "", "tag", "p", "(LT5/h;Ljava/lang/Object;Lk6/q;Lr6/s;Ljava/lang/String;)Ljava/lang/String;", "LT5/h$a;", "LXH/v;", "LZ5/j$a;", "LuI/d;", "pair", "e", "(LT5/h$a;LXH/v;)LT5/h$a;", "LX5/i$a;", "factory", "d", "(LT5/h$a;LX5/i$a;)LT5/h$a;", "", "", "n", "(I)Z", "LT5/G;", "uri", "m", "(LT5/G;)Z", "Lk6/h;", "request", "", "throwable", "Lk6/e;", "c", "(Lk6/h;Ljava/lang/Throwable;)Lk6/e;", "Lkotlin/Function1;", "LT5/n;", "a", "LnI/l;", "k", "()LnI/l;", "EMPTY_IMAGE_FACTORY", "Lc6/d$a;", "o", "(Lc6/d$a;)Z", "isPlaceholderCached", "LT5/j;", "l", "(Lc6/d$a;)LT5/j;", "eventListener", "LdI/i;", "LQJ/M;", "j", "(LdI/i;)LQJ/M;", "getDispatcher$annotations", "(LdI/i;)V", "dispatcher", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class E {

    /* renamed from: a  reason: collision with root package name */
    private static final C17642l<C8441h, n> f55687a = a.f55688a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55688a = new a();

        a() {
        }

        /* renamed from: a */
        public final Void invoke(C8441h hVar) {
            return null;
        }
    }

    public static final C8438e c(C8441h hVar, Throwable th2) {
        n nVar;
        if (th2 instanceof C8448o) {
            nVar = hVar.b();
            if (nVar == null) {
                nVar = hVar.a();
            }
        } else {
            nVar = hVar.a();
        }
        return new C8438e(nVar, hVar, th2);
    }

    public static final C6704h.a d(C6704h.a aVar, C6724i.a aVar2) {
        if (aVar2 != null) {
            aVar.q().add(0, new D(aVar2));
        }
        return aVar;
    }

    public static final C6704h.a e(C6704h.a aVar, v<? extends j.a<?>, ? extends C18055d<?>> vVar) {
        if (vVar != null) {
            aVar.r().add(0, new C8692C(vVar));
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final List f(v vVar) {
        return C16877v.e(vVar);
    }

    /* access modifiers changed from: private */
    public static final List g(C6724i.a aVar) {
        return C16877v.e(aVar);
    }

    public static final void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void i(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final M j(C17168i iVar) {
        return (M) iVar.get(M.f137585a);
    }

    public static final C17642l<C8441h, n> k() {
        return f55687a;
    }

    public static final T5.j l(C7098d.a aVar) {
        return aVar instanceof C7099e ? ((C7099e) aVar).h() : T5.j.f40046b;
    }

    public static final boolean m(G g10) {
        return (g10.c() == null || C17542s.e(g10.c(), "file")) && g10.b() != null && !F.h(g10);
    }

    public static final boolean n(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean o(C7098d.a aVar) {
        return (aVar instanceof C7099e) && ((C7099e) aVar).i();
    }

    public static final String p(C6704h hVar, Object obj, C8450q qVar, s sVar, String str) {
        List<v<C7747c<? extends Object>, C18055d<? extends Object>>> h10 = hVar.h();
        int size = h10.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = h10.get(i10);
            C7747c cVar = (C7747c) vVar.a();
            if (((C18055d) vVar.b()).s(obj)) {
                C17542s.h(cVar, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String a10 = cVar.a(obj, qVar);
                if (a10 != null) {
                    return a10;
                }
                z10 = true;
            }
        }
        if (!z10 && sVar != null) {
            s.a aVar = s.a.Warn;
            if (sVar.a().compareTo(aVar) <= 0) {
                sVar.b(str, aVar, "No keyer is registered for data with type '" + P.b(obj.getClass()).f() + "'. Register Keyer<" + P.b(obj.getClass()).f() + "> in the component registry to cache the output image in the memory cache.", (Throwable) null);
            }
        }
        return null;
    }
}
