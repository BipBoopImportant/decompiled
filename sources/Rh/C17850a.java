package rH;

import CH.C15489a;
import EH.C15618c;
import EH.C15627l;
import EH.C15638w;
import FH.d;
import QJ.C16342y0;
import XH.C16807N;
import XH.t;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import io.ktor.utils.io.u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BD\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R9\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u000e8\u0002X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010!8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\"R\u0014\u0010&\u001a\u00020$8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"LrH/a;", "LFH/d$c;", "LFH/d;", "delegate", "LdI/i;", "callContext", "Lkotlin/Function3;", "", "LdI/e;", "LXH/N;", "", "listener", "<init>", "(LFH/d;LdI/i;LnI/q;)V", "Lio/ktor/utils/io/g;", "e", "()Lio/ktor/utils/io/g;", "a", "LFH/d;", "b", "LdI/i;", "c", "LnI/q;", "d", "Lio/ktor/utils/io/g;", "getContent$annotations", "()V", "content", "LEH/c;", "()LEH/c;", "contentType", "()Ljava/lang/Long;", "contentLength", "LEH/w;", "()LEH/w;", "status", "LEH/l;", "()LEH/l;", "headers", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: rH.a  reason: case insensitive filesystem */
public final class C17850a extends d.c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f146662a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f146663b;

    /* renamed from: c  reason: collision with root package name */
    private final q<Long, Long, C17164e<? super C16807N>, Object> f146664c;

    /* renamed from: d  reason: collision with root package name */
    private final g f146665d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.content.ObservableContent$content$1", f = "ObservableContent.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: rH.a$a  reason: collision with other inner class name */
    static final class C4267a extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146666c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f146667d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17850a f146668e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4267a(C17850a aVar, C17164e<? super C4267a> eVar) {
            super(2, eVar);
            this.f146668e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C4267a aVar = new C4267a(this.f146668e, eVar);
            aVar.f146667d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((C4267a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f146666c;
            if (i10 == 0) {
                y.b(obj);
                j d10 = ((u) this.f146667d).d();
                this.f146666c = 1;
                if (((d.C3307d) this.f146668e.f146662a).e(d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C17850a(d dVar, C17168i iVar, q<? super Long, ? super Long, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        g gVar;
        C17542s.j(dVar, "delegate");
        C17542s.j(iVar, "callContext");
        C17542s.j(qVar, "listener");
        this.f146662a = dVar;
        this.f146663b = iVar;
        this.f146664c = qVar;
        if (dVar instanceof d.a) {
            gVar = io.ktor.utils.io.d.a(((d.a) dVar).e());
        } else if (dVar instanceof d.b) {
            gVar = g.f143712a.a();
        } else if (dVar instanceof d.c) {
            gVar = ((d.c) dVar).e();
        } else if (dVar instanceof d.C3307d) {
            gVar = io.ktor.utils.io.q.b(C16342y0.f137687a, iVar, true, new C4267a(this, (C17164e<? super C4267a>) null)).d();
        } else {
            throw new t();
        }
        this.f146665d = gVar;
    }

    public Long a() {
        return this.f146662a.a();
    }

    public C15618c b() {
        return this.f146662a.b();
    }

    public C15627l c() {
        return this.f146662a.c();
    }

    public C15638w d() {
        return this.f146662a.d();
    }

    public g e() {
        return C15489a.a(this.f146665d, this.f146663b, a(), this.f146664c);
    }
}
