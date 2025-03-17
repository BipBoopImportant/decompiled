package q6;

import T5.n;
import T5.u;
import X5.C6721f;
import XH.t;
import android.graphics.drawable.Drawable;
import k6.C8438e;
import k6.C8445l;
import k6.C8454u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.f;
import q6.C8677d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\rB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lq6/b;", "Lq6/d;", "Lq6/e;", "target", "Lk6/l;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lq6/e;Lk6/l;IZ)V", "LXH/N;", "a", "()V", "Lq6/e;", "b", "Lk6/l;", "c", "I", "()I", "d", "Z", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: q6.b  reason: case insensitive filesystem */
public final class C8675b implements C8677d {

    /* renamed from: a  reason: collision with root package name */
    private final C8678e f55551a;

    /* renamed from: b  reason: collision with root package name */
    private final C8445l f55552b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55553c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f55554d;

    public C8675b(C8678e eVar, C8445l lVar, int i10, boolean z10) {
        this.f55551a = eVar;
        this.f55552b = lVar;
        this.f55553c = i10;
        this.f55554d = z10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public void a() {
        Drawable a10 = this.f55551a.a();
        n k10 = this.f55552b.k();
        Drawable a11 = k10 != null ? u.a(k10, this.f55551a.c().getResources()) : null;
        f w10 = this.f55552b.b().w();
        int i10 = this.f55553c;
        C8445l lVar = this.f55552b;
        C8674a aVar = new C8674a(a10, a11, w10, i10, !(lVar instanceof C8454u) || !((C8454u) lVar).c(), this.f55554d);
        C8445l lVar2 = this.f55552b;
        if (lVar2 instanceof C8454u) {
            this.f55551a.d(u.c(aVar));
        } else if (lVar2 instanceof C8438e) {
            this.f55551a.e(u.c(aVar));
        } else {
            throw new t();
        }
    }

    public final int b() {
        return this.f55553c;
    }

    public final boolean c() {
        return this.f55554d;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lq6/b$a;", "Lq6/d$a;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Lq6/e;", "target", "Lk6/l;", "result", "Lq6/d;", "a", "(Lq6/e;Lk6/l;)Lq6/d;", "c", "I", "getDurationMillis", "()I", "d", "Z", "getPreferExactIntrinsicSize", "()Z", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: q6.b$a */
    public static final class a implements C8677d.a {

        /* renamed from: c  reason: collision with root package name */
        private final int f55555c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f55556d;

        public a(int i10, boolean z10) {
            this.f55555c = i10;
            this.f55556d = z10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        public C8677d a(C8678e eVar, C8445l lVar) {
            return !(lVar instanceof C8454u) ? C8677d.a.f55560b.a(eVar, lVar) : ((C8454u) lVar).a() == C6721f.MEMORY_CACHE ? C8677d.a.f55560b.a(eVar, lVar) : new C8675b(eVar, lVar, this.f55555c, this.f55556d);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 200 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
