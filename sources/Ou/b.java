package ou;

import HJ.C15854t;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0002\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "LTJ/g;", "Lkotlin/Function2;", "", "LdI/e;", "LXH/N;", "", "action", "a", "(LTJ/g;LnI/p;)LTJ/g;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.util.FlowExtensionsKt$catchLogging$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100823c;

        a(C17164e<? super a> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(eVar);
        }

        /* renamed from: i */
        public final Object invoke(Throwable th2, C17164e<? super C16807N> eVar) {
            return ((a) create(th2, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100823c == 0) {
                y.b(obj);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LTJ/h;", "", "e", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.util.FlowExtensionsKt$catchLogging$2", f = "FlowExtensions.kt", l = {16}, m = "invokeSuspend")
    /* renamed from: ou.b$b  reason: collision with other inner class name */
    static final class C2367b extends l implements q<C16533h<? super T>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100824c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f100825d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100826e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<Throwable, C17164e<? super C16807N>, Object> f100827f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2367b(p<? super Throwable, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C2367b> eVar) {
            super(3, eVar);
            this.f100827f = pVar;
        }

        public final Object invoke(C16533h<? super T> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            C2367b bVar = new C2367b(this.f100827f, eVar);
            bVar.f100825d = hVar;
            bVar.f100826e = th2;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16533h hVar;
            Throwable th2;
            Object f10 = C17187b.f();
            int i10 = this.f100824c;
            if (i10 == 0) {
                y.b(obj);
                hVar = (C16533h) this.f100825d;
                Throwable th3 = (Throwable) this.f100826e;
                p<Throwable, C17164e<? super C16807N>, Object> pVar = this.f100827f;
                this.f100825d = hVar;
                this.f100826e = th3;
                this.f100824c = 1;
                if (pVar.invoke(th3, this) == f10) {
                    return f10;
                }
                th2 = th3;
            } else if (i10 == 1) {
                th2 = (Throwable) this.f100826e;
                hVar = (C16533h) this.f100825d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            return C16807N.f139792a;
        }
    }

    public static final <T> C16532g<T> a(C16532g<? extends T> gVar, p<? super Throwable, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(gVar, "<this>");
        C17542s.j(pVar, "action");
        return C16534i.g(gVar, new C2367b(pVar, (C17164e<? super C2367b>) null));
    }

    public static /* synthetic */ C16532g b(C16532g gVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pVar = new a((C17164e<? super a>) null);
        }
        return a(gVar, pVar);
    }
}
