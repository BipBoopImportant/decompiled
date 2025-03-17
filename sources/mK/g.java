package MK;

import GK.C15774B;
import GK.C15776D;
import GK.C15786e;
import GK.C15791j;
import GK.C15804w;
import HK.C15864d;
import LK.c;
import LK.e;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\u0003\u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b0\u0010#R\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b4\u0010\u001dR\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010+¨\u00066"}, d2 = {"LMK/g;", "LGK/w$a;", "LLK/e;", "call", "", "LGK/w;", "interceptors", "", "index", "LLK/c;", "exchange", "LGK/B;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(LLK/e;Ljava/util/List;ILLK/c;LGK/B;III)V", "f", "(ILLK/c;LGK/B;III)LMK/g;", "LGK/j;", "d", "()LGK/j;", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "a", "(ILjava/util/concurrent/TimeUnit;)LGK/w$a;", "n", "()I", "e", "c", "LGK/e;", "()LGK/e;", "t", "()LGK/B;", "LGK/D;", "b", "(LGK/B;)LGK/D;", "LLK/e;", "h", "()LLK/e;", "Ljava/util/List;", "I", "LLK/c;", "j", "()LLK/c;", "LGK/B;", "l", "i", "g", "k", "m", "calls", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements C15804w.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f136461a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C15804w> f136462b;

    /* renamed from: c  reason: collision with root package name */
    private final int f136463c;

    /* renamed from: d  reason: collision with root package name */
    private final c f136464d;

    /* renamed from: e  reason: collision with root package name */
    private final C15774B f136465e;

    /* renamed from: f  reason: collision with root package name */
    private final int f136466f;

    /* renamed from: g  reason: collision with root package name */
    private final int f136467g;

    /* renamed from: h  reason: collision with root package name */
    private final int f136468h;

    /* renamed from: i  reason: collision with root package name */
    private int f136469i;

    public g(e eVar, List<? extends C15804w> list, int i10, c cVar, C15774B b10, int i11, int i12, int i13) {
        C17542s.j(eVar, "call");
        C17542s.j(list, "interceptors");
        C17542s.j(b10, "request");
        this.f136461a = eVar;
        this.f136462b = list;
        this.f136463c = i10;
        this.f136464d = cVar;
        this.f136465e = b10;
        this.f136466f = i11;
        this.f136467g = i12;
        this.f136468h = i13;
    }

    public static /* synthetic */ g g(g gVar, int i10, c cVar, C15774B b10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f136463c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f136464d;
        }
        c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            b10 = gVar.f136465e;
        }
        C15774B b11 = b10;
        if ((i14 & 8) != 0) {
            i11 = gVar.f136466f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f136467g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f136468h;
        }
        return gVar.f(i10, cVar2, b11, i15, i16, i13);
    }

    public C15804w.a a(int i10, TimeUnit timeUnit) {
        C17542s.j(timeUnit, "unit");
        if (this.f136464d == null) {
            return g(this, 0, (c) null, (C15774B) null, C15864d.k("connectTimeout", (long) i10, timeUnit), 0, 0, 55, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public C15776D b(C15774B b10) {
        C17542s.j(b10, "request");
        if (this.f136463c < this.f136462b.size()) {
            this.f136469i++;
            c cVar = this.f136464d;
            if (cVar != null) {
                if (!cVar.j().g(b10.k())) {
                    throw new IllegalStateException(("network interceptor " + this.f136462b.get(this.f136463c - 1) + " must retain the same host and port").toString());
                } else if (this.f136469i != 1) {
                    throw new IllegalStateException(("network interceptor " + this.f136462b.get(this.f136463c - 1) + " must call proceed() exactly once").toString());
                }
            }
            g g10 = g(this, this.f136463c + 1, (c) null, b10, 0, 0, 0, 58, (Object) null);
            C15804w wVar = this.f136462b.get(this.f136463c);
            C15776D intercept = wVar.intercept(g10);
            if (intercept == null) {
                throw new NullPointerException("interceptor " + wVar + " returned null");
            } else if (this.f136464d != null && this.f136463c + 1 < this.f136462b.size() && g10.f136469i != 1) {
                throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
            } else if (intercept.c() != null) {
                return intercept;
            } else {
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public C15804w.a c(int i10, TimeUnit timeUnit) {
        C17542s.j(timeUnit, "unit");
        if (this.f136464d == null) {
            return g(this, 0, (c) null, (C15774B) null, 0, 0, C15864d.k("writeTimeout", (long) i10, timeUnit), 31, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public C15786e call() {
        return this.f136461a;
    }

    public C15791j d() {
        c cVar = this.f136464d;
        if (cVar != null) {
            return cVar.h();
        }
        return null;
    }

    public C15804w.a e(int i10, TimeUnit timeUnit) {
        C17542s.j(timeUnit, "unit");
        if (this.f136464d == null) {
            return g(this, 0, (c) null, (C15774B) null, 0, C15864d.k("readTimeout", (long) i10, timeUnit), 0, 47, (Object) null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    public final g f(int i10, c cVar, C15774B b10, int i11, int i12, int i13) {
        C17542s.j(b10, "request");
        return new g(this.f136461a, this.f136462b, i10, cVar, b10, i11, i12, i13);
    }

    public final e h() {
        return this.f136461a;
    }

    public final int i() {
        return this.f136466f;
    }

    public final c j() {
        return this.f136464d;
    }

    public final int k() {
        return this.f136467g;
    }

    public final C15774B l() {
        return this.f136465e;
    }

    public final int m() {
        return this.f136468h;
    }

    public int n() {
        return this.f136467g;
    }

    public C15774B t() {
        return this.f136465e;
    }
}
