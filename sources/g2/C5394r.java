package g2;

import E1.H;
import U0.T0;
import XH.C16807N;
import android.os.Handler;
import android.os.Looper;
import g1.C5357z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lg2/r;", "Lg2/q;", "LU0/T0;", "Lg2/n;", "scope", "<init>", "(Lg2/n;)V", "Lg2/X;", "state", "", "LE1/H;", "measurables", "LXH/N;", "a", "(Lg2/X;Ljava/util/List;)V", "", "b", "(Ljava/util/List;)Z", "w0", "()V", "o1", "c1", "Lg2/n;", "h", "()Lg2/n;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Lg1/z;", "c", "Lg1/z;", "observer", "d", "Z", "getKnownDirty", "()Z", "i", "(Z)V", "knownDirty", "Lkotlin/Function1;", "e", "LnI/l;", "onCommitAffectingConstrainLambdas", "", "Lg2/m;", "f", "Ljava/util/List;", "previousDatas", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.r  reason: case insensitive filesystem */
public final class C5394r implements C5393q, T0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5390n f23745a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Handler f23746b;

    /* renamed from: c  reason: collision with root package name */
    private final C5357z f23747c = new C5357z(new b(this));

    /* renamed from: d  reason: collision with root package name */
    private boolean f23748d = true;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<C16807N, C16807N> f23749e = new c(this);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List<C5389m> f23750f = new ArrayList();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g2.r$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<H> f23751c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5394r f23752d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ X f23753e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List<? extends H> list, C5394r rVar, X x10) {
            super(0);
            this.f23751c = list;
            this.f23752d = rVar;
            this.f23753e = x10;
        }

        public final void invoke() {
            List<H> list = this.f23751c;
            C5394r rVar = this.f23752d;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object h10 = list.get(i10).h();
                C5389m mVar = h10 instanceof C5389m ? (C5389m) h10 : null;
                if (mVar != null) {
                    C5384h b10 = mVar.b();
                    mVar.a().invoke(new C5383g(b10.a(), rVar.h().b(b10)));
                }
                rVar.f23750f.add(mVar);
            }
            this.f23752d.h().a(this.f23753e);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "it", "b", "(LnI/a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g2.r$b */
    static final class b extends C17544u implements C17642l<C17631a<? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5394r f23754c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5394r rVar) {
            super(1);
            this.f23754c = rVar;
        }

        /* access modifiers changed from: private */
        public static final void c(C17631a aVar) {
            aVar.invoke();
        }

        public final void b(C17631a<C16807N> aVar) {
            if (C17542s.e(Looper.myLooper(), Looper.getMainLooper())) {
                aVar.invoke();
                return;
            }
            Handler c10 = this.f23754c.f23746b;
            if (c10 == null) {
                c10 = new Handler(Looper.getMainLooper());
                this.f23754c.f23746b = c10;
            }
            c10.post(new C5395s(aVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C17631a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXH/N;", "<anonymous parameter 0>", "a", "(LXH/N;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g2.r$c */
    static final class c extends C17544u implements C17642l<C16807N, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5394r f23755c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5394r rVar) {
            super(1);
            this.f23755c = rVar;
        }

        public final void a(C16807N n10) {
            this.f23755c.i(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C16807N) obj);
            return C16807N.f139792a;
        }
    }

    public C5394r(C5390n nVar) {
        this.f23745a = nVar;
    }

    public void a(X x10, List<? extends H> list) {
        this.f23750f.clear();
        this.f23747c.o(C16807N.f139792a, this.f23749e, new a(list, this, x10));
        this.f23748d = false;
    }

    public boolean b(List<? extends H> list) {
        if (this.f23748d || list.size() != this.f23750f.size()) {
            return true;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object h10 = ((H) list.get(i10)).h();
            if (!C17542s.e(h10 instanceof C5389m ? (C5389m) h10 : null, this.f23750f.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public void c1() {
    }

    public final C5390n h() {
        return this.f23745a;
    }

    public final void i(boolean z10) {
        this.f23748d = z10;
    }

    public void o1() {
        this.f23747c.t();
        this.f23747c.j();
    }

    public void w0() {
        this.f23747c.s();
    }
}
