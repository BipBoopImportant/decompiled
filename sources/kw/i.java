package kw;

import HJ.C15854t;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import cw.d;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkw/i;", "Lkw/h;", "Lcw/d;", "messageCenterRepository", "<init>", "(Lcw/d;)V", "LTJ/g;", "", "Lcw/f;", "invoke", "()LTJ/g;", "a", "Lcw/d;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final d f25260a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcw/f;", "list", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.messaging.impl.domain.GetGlobalWhatsNewMessagesUseCaseImpl$invoke$1", f = "GetGlobalWhatsNewMessagesUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<List<? extends cw.f>, C17164e<? super List<? extends cw.f>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f25261c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f25262d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f25263e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f25263e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f25263e, eVar);
            aVar.f25262d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(List<cw.f> list, C17164e<? super List<cw.f>> eVar) {
            return ((a) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f25261c == 0) {
                y.b(obj);
                List list = (List) this.f25262d;
                i iVar = this.f25263e;
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("GetGlboalWhatsNewMessageUseCase: " + list, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = iVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                if (list == null) {
                    return C16877v.n();
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next2 : list) {
                    cw.f fVar = (cw.f) next2;
                    if (fVar.c() == null && fVar.d() == 0) {
                        arrayList2.add(next2);
                    }
                }
                return arrayList2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public i(d dVar) {
        C17542s.j(dVar, "messageCenterRepository");
        this.f25260a = dVar;
    }

    public C16532g<List<cw.f>> invoke() {
        return C16534i.N(this.f25260a.a(), new a(this, (C17164e<? super a>) null));
    }
}
