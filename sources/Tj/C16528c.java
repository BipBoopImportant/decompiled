package TJ;

import QJ.Q;
import SJ.C16422A;
import SJ.C16428d;
import SJ.C16449y;
import UJ.C16612e;
import UJ.C16633z;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH@¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u000b\u0010*\u001a\u00020)8\u0002X\u0004¨\u0006+"}, d2 = {"LTJ/c;", "T", "LUJ/e;", "LSJ/A;", "channel", "", "consume", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "<init>", "(LSJ/A;ZLdI/i;ILSJ/d;)V", "LXH/N;", "p", "()V", "j", "(LdI/i;ILSJ/d;)LUJ/e;", "LTJ/g;", "k", "()LTJ/g;", "LSJ/y;", "scope", "i", "(LSJ/y;LdI/e;)Ljava/lang/Object;", "LQJ/Q;", "n", "(LQJ/Q;)LSJ/A;", "LTJ/h;", "collector", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "d", "LSJ/A;", "e", "Z", "", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.c  reason: case insensitive filesystem */
final class C16528c<T> extends C16612e<T> {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f138625f = AtomicIntegerFieldUpdater.newUpdater(C16528c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d  reason: collision with root package name */
    private final C16422A<T> f138626d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f138627e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16528c(C16422A a10, boolean z10, C17168i iVar, int i10, C16428d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(a10, z10, (i11 & 4) != 0 ? C17169j.f142968a : iVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? C16428d.SUSPEND : dVar);
    }

    private final void p() {
        if (this.f138627e && f138625f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public Object collect(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
        if (this.f139097b == -3) {
            p();
            Object a10 = C16536k.d(hVar, this.f138626d, this.f138627e, eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
        Object collect = super.collect(hVar, eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public String g() {
        return "channel=" + this.f138626d;
    }

    /* access modifiers changed from: protected */
    public Object i(C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
        Object a10 = C16536k.d(new C16633z(yVar), this.f138626d, this.f138627e, eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public C16612e<T> j(C17168i iVar, int i10, C16428d dVar) {
        return new C16528c(this.f138626d, this.f138627e, iVar, i10, dVar);
    }

    public C16532g<T> k() {
        return new C16528c(this.f138626d, this.f138627e, (C17168i) null, 0, (C16428d) null, 28, (DefaultConstructorMarker) null);
    }

    public C16422A<T> n(Q q10) {
        p();
        return this.f139097b == -3 ? this.f138626d : super.n(q10);
    }

    public C16528c(C16422A<? extends T> a10, boolean z10, C17168i iVar, int i10, C16428d dVar) {
        super(iVar, i10, dVar);
        this.f138626d = a10;
        this.f138627e = z10;
    }
}
