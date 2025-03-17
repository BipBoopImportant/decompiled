package UJ;

import TJ.C16533h;
import WJ.K;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R0\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LUJ/C;", "T", "LTJ/h;", "downstream", "LdI/i;", "emitContext", "<init>", "(LTJ/h;LdI/i;)V", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LdI/i;", "", "b", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "LdI/e;", "c", "LnI/p;", "emitRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.C  reason: case insensitive filesystem */
final class C16607C<T> implements C16533h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f139084a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f139085b;

    /* renamed from: c  reason: collision with root package name */
    private final p<T, C17164e<? super C16807N>, Object> f139086c;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    /* renamed from: UJ.C$a */
    static final class a extends l implements p<T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139087c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f139088d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f139089e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16533h<? super T> hVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f139089e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f139089e, eVar);
            aVar.f139088d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(T t10, C17164e<? super C16807N> eVar) {
            return ((a) create(t10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f139087c;
            if (i10 == 0) {
                y.b(obj);
                Object obj2 = this.f139088d;
                C16533h<T> hVar = this.f139089e;
                this.f139087c = 1;
                if (hVar.emit(obj2, this) == f10) {
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

    public C16607C(C16533h<? super T> hVar, C17168i iVar) {
        this.f139084a = iVar;
        this.f139085b = K.g(iVar);
        this.f139086c = new a(hVar, (C17164e<? super a>) null);
    }

    public Object emit(T t10, C17164e<? super C16807N> eVar) {
        Object c10 = C16613f.c(this.f139084a, t10, this.f139085b, this.f139086c, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}
