package W2;

import R2.h;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LW2/d;", "LR2/h;", "LW2/f;", "delegate", "<init>", "(LR2/h;)V", "Lkotlin/Function2;", "LdI/e;", "", "transform", "a", "(LnI/p;LdI/e;)Ljava/lang/Object;", "LR2/h;", "LTJ/g;", "getData", "()LTJ/g;", "data", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements h<f> {

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f14651a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LW2/f;", "it", "<anonymous>", "(LW2/f;)LW2/f;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    static final class a extends l implements p<f, C17164e<? super f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f14652c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f14653d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<f, C17164e<? super f>, Object> f14654e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super f, ? super C17164e<? super f>, ? extends Object> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f14654e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f14654e, eVar);
            aVar.f14653d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(f fVar, C17164e<? super f> eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f14652c;
            if (i10 == 0) {
                y.b(obj);
                p<f, C17164e<? super f>, Object> pVar = this.f14654e;
                this.f14652c = 1;
                obj = pVar.invoke((f) this.f14653d, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = (f) obj;
            C17542s.h(fVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar).g();
            return fVar;
        }
    }

    public d(h<f> hVar) {
        C17542s.j(hVar, "delegate");
        this.f14651a = hVar;
    }

    public Object a(p<? super f, ? super C17164e<? super f>, ? extends Object> pVar, C17164e<? super f> eVar) {
        return this.f14651a.a(new a(pVar, (C17164e<? super a>) null), eVar);
    }

    public C16532g<f> getData() {
        return this.f14651a.getData();
    }
}
