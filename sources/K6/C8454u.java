package k6;

import T5.n;
import X5.C6721f;
import f6.C7853d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\r\u0010%R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\u0018\u0010%¨\u0006'"}, d2 = {"Lk6/u;", "Lk6/l;", "LT5/n;", "image", "Lk6/h;", "request", "LX5/f;", "dataSource", "Lf6/d$b;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(LT5/n;Lk6/h;LX5/f;Lf6/d$b;Ljava/lang/String;ZZ)V", "a", "LT5/n;", "k", "()LT5/n;", "b", "Lk6/h;", "()Lk6/h;", "c", "LX5/f;", "()LX5/f;", "d", "Lf6/d$b;", "getMemoryCacheKey", "()Lf6/d$b;", "e", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", "f", "Z", "()Z", "g", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.u  reason: case insensitive filesystem */
public final class C8454u implements C8445l {

    /* renamed from: a  reason: collision with root package name */
    private final n f54263a;

    /* renamed from: b  reason: collision with root package name */
    private final C8441h f54264b;

    /* renamed from: c  reason: collision with root package name */
    private final C6721f f54265c;

    /* renamed from: d  reason: collision with root package name */
    private final C7853d.b f54266d;

    /* renamed from: e  reason: collision with root package name */
    private final String f54267e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f54268f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54269g;

    public C8454u(n nVar, C8441h hVar, C6721f fVar, C7853d.b bVar, String str, boolean z10, boolean z11) {
        this.f54263a = nVar;
        this.f54264b = hVar;
        this.f54265c = fVar;
        this.f54266d = bVar;
        this.f54267e = str;
        this.f54268f = z10;
        this.f54269g = z11;
    }

    public final C6721f a() {
        return this.f54265c;
    }

    public C8441h b() {
        return this.f54264b;
    }

    public final boolean c() {
        return this.f54269g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8454u)) {
            return false;
        }
        C8454u uVar = (C8454u) obj;
        return C17542s.e(this.f54263a, uVar.f54263a) && C17542s.e(this.f54264b, uVar.f54264b) && this.f54265c == uVar.f54265c && C17542s.e(this.f54266d, uVar.f54266d) && C17542s.e(this.f54267e, uVar.f54267e) && this.f54268f == uVar.f54268f && this.f54269g == uVar.f54269g;
    }

    public int hashCode() {
        int hashCode = ((((this.f54263a.hashCode() * 31) + this.f54264b.hashCode()) * 31) + this.f54265c.hashCode()) * 31;
        C7853d.b bVar = this.f54266d;
        int i10 = 0;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f54267e;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + Boolean.hashCode(this.f54268f)) * 31) + Boolean.hashCode(this.f54269g);
    }

    public n k() {
        return this.f54263a;
    }

    public String toString() {
        return "SuccessResult(image=" + this.f54263a + ", request=" + this.f54264b + ", dataSource=" + this.f54265c + ", memoryCacheKey=" + this.f54266d + ", diskCacheKey=" + this.f54267e + ", isSampled=" + this.f54268f + ", isPlaceholderCached=" + this.f54269g + ')';
    }
}
