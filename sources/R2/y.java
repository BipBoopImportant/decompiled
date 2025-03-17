package R2;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.q;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "LR2/x;", "a", "(LR2/x;LdI/e;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class y {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@"}, d2 = {"T", "LR2/r;", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    static final class a extends l implements q<r<T>, Boolean, C17164e<? super T>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f12507c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f12508d;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        public final Object i(r<T> rVar, boolean z10, C17164e<? super T> eVar) {
            a aVar = new a(eVar);
            aVar.f12508d = rVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((r) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f12507c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f12507c = 1;
                obj = ((r) this.f12508d).c(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public static final <T> Object a(x<T> xVar, C17164e<? super T> eVar) {
        return xVar.b(new a((C17164e<? super a>) null), eVar);
    }
}
