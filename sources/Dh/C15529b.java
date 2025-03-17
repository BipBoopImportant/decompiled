package DH;

import KH.C15983a;
import QJ.C16315k0;
import WJ.C16753n;
import WJ.C16754o;
import XH.C16807N;
import XH.C16816g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR*\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u0012\u0004\b\u000e\u0010\u0003¨\u0006\u0010"}, d2 = {"LDH/b;", "", "<init>", "()V", "T", "LDH/a;", "definition", "value", "LXH/N;", "a", "(LDH/a;Ljava/lang/Object;)V", "LKH/a;", "LWJ/n;", "LKH/a;", "getHandlers$annotations", "handlers", "ktor-events"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: DH.b  reason: case insensitive filesystem */
public final class C15529b {

    /* renamed from: a  reason: collision with root package name */
    private final C15983a<C15528a<?>, C16753n> f133804a = new C15983a<>();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R)\u0010\f\u001a\u0014\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LDH/b$a;", "LWJ/o;", "LQJ/k0;", "LXH/N;", "b", "()V", "Lkotlin/Function1;", "Lio/ktor/events/EventHandler;", "d", "LnI/l;", "v", "()LnI/l;", "handler", "ktor-events"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: DH.b$a */
    private static final class a extends C16754o implements C16315k0 {

        /* renamed from: d  reason: collision with root package name */
        private final C17642l<?, C16807N> f133805d;

        public void b() {
            s();
        }

        public final C17642l<?, C16807N> v() {
            return this.f133805d;
        }
    }

    public final <T> void a(C15528a<T> aVar, T t10) {
        C16807N n10;
        C17542s.j(aVar, "definition");
        C16753n a10 = this.f133804a.a(aVar);
        Throwable th2 = null;
        if (a10 != null) {
            Object l10 = a10.l();
            C17542s.h(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            Throwable th3 = null;
            for (C16754o oVar = (C16754o) l10; !C17542s.e(oVar, a10); oVar = oVar.m()) {
                if (oVar instanceof a) {
                    try {
                        C17642l<?, C16807N> v10 = ((a) oVar).v();
                        C17542s.h(v10, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        ((C17642l) W.g(v10, 1)).invoke(t10);
                    } catch (Throwable th4) {
                        if (th3 != null) {
                            C16816g.a(th3, th4);
                            n10 = C16807N.f139792a;
                        } else {
                            n10 = null;
                        }
                        if (n10 == null) {
                            th3 = th4;
                        }
                    }
                }
            }
            th2 = th3;
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
