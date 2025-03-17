package U0;

import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LU0/c0;", "", "<init>", "()V", "LXH/N;", "d", "f", "c", "(LdI/e;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "", "LdI/e;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.c0  reason: case insensitive filesystem */
public final class C4864c0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f13929a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<C17164e<C16807N>> f13930b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<C17164e<C16807N>> f13931c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f13932d = true;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: U0.c0$a */
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4864c0 f13933c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16320n<C16807N> f13934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4864c0 c0Var, C16320n<? super C16807N> nVar) {
            super(1);
            this.f13933c = c0Var;
            this.f13934d = nVar;
        }

        public final void a(Throwable th2) {
            Object b10 = this.f13933c.f13929a;
            C4864c0 c0Var = this.f13933c;
            C16320n<C16807N> nVar = this.f13934d;
            synchronized (b10) {
                c0Var.f13930b.remove(nVar);
                C16807N n10 = C16807N.f139792a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public final Object c(C17164e<? super C16807N> eVar) {
        if (e()) {
            return C16807N.f139792a;
        }
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        synchronized (this.f13929a) {
            this.f13930b.add(pVar);
        }
        pVar.K(new a(this, pVar));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    public final void d() {
        synchronized (this.f13929a) {
            this.f13932d = false;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f13929a) {
            z10 = this.f13932d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f13929a) {
            try {
                if (!e()) {
                    List<C17164e<C16807N>> list = this.f13930b;
                    this.f13930b = this.f13931c;
                    this.f13931c = list;
                    this.f13932d = true;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        x.a aVar = x.f139812b;
                        list.get(i10).resumeWith(x.b(C16807N.f139792a));
                    }
                    list.clear();
                    C16807N n10 = C16807N.f139792a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
