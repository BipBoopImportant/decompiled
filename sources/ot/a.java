package Ot;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aT\u0010\u0007\u001a\f\u0012\b\u0012\u0006\b\u0002\u0018\u00018\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b9¨\u0006\t"}, d2 = {"T", "LTJ/g;", "Lkotlin/Function3;", "LdI/e;", "LXH/N;", "", "operation", "a", "(LTJ/g;LnI/q;)LTJ/g;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n"}, d2 = {"<anonymous>", "T", "accumulator", "value"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.storeevents.StoreEventsExtensionsKt$scanNotNull$1", f = "StoreEventsExtensions.kt", l = {21}, m = "invokeSuspend")
    /* renamed from: Ot.a$a  reason: collision with other inner class name */
    static final class C1723a extends l implements q<T, T, C17164e<? super T>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f85383c;

        /* renamed from: d  reason: collision with root package name */
        Object f85384d;

        /* renamed from: e  reason: collision with root package name */
        Object f85385e;

        /* renamed from: f  reason: collision with root package name */
        int f85386f;

        /* renamed from: g  reason: collision with root package name */
        int f85387g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f85388h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f85389i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q<T, T, C17164e<? super C16807N>, Object> f85390j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1723a(q<? super T, ? super T, ? super C17164e<? super C16807N>, ? extends Object> qVar, C17164e<? super C1723a> eVar) {
            super(3, eVar);
            this.f85390j = qVar;
        }

        /* renamed from: i */
        public final Object invoke(T t10, T t11, C17164e<? super T> eVar) {
            C1723a aVar = new C1723a(this.f85390j, eVar);
            aVar.f85388h = t10;
            aVar.f85389i = t11;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f85387g;
            if (i10 == 0) {
                y.b(obj);
                Object obj3 = this.f85388h;
                Object obj4 = this.f85389i;
                if (obj3 == null) {
                    return obj4;
                }
                q<T, T, C17164e<? super C16807N>, Object> qVar = this.f85390j;
                this.f85388h = obj3;
                this.f85389i = obj4;
                this.f85383c = obj3;
                this.f85384d = qVar;
                this.f85385e = obj3;
                this.f85386f = 0;
                this.f85387g = 1;
                if (qVar.invoke(obj3, obj4, this) == f10) {
                    return f10;
                }
                obj2 = obj4;
            } else if (i10 == 1) {
                q qVar2 = (q) this.f85384d;
                obj2 = this.f85389i;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj2;
        }
    }

    public static final <T> C16532g<T> a(C16532g<? extends T> gVar, q<? super T, ? super T, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        C17542s.j(gVar, "<this>");
        C17542s.j(qVar, "operation");
        return C16534i.A(C16534i.Y(gVar, null, new C1723a(qVar, (C17164e<? super C1723a>) null)));
    }
}
