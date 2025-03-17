package W2;

import R2.h;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a>\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LR2/h;", "LW2/f;", "Lkotlin/Function2;", "LW2/c;", "LdI/e;", "LXH/N;", "", "transform", "a", "(LR2/h;LnI/p;LdI/e;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LW2/f;", "it", "<anonymous>", "(LW2/f;)LW2/f;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    static final class a extends l implements p<f, C17164e<? super f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f14660c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f14661d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<c, C17164e<? super C16807N>, Object> f14662e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super c, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f14662e = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f14662e, eVar);
            aVar.f14661d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(f fVar, C17164e<? super f> eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f14660c;
            if (i10 == 0) {
                y.b(obj);
                c c10 = ((f) this.f14661d).c();
                p<c, C17164e<? super C16807N>, Object> pVar = this.f14662e;
                this.f14661d = c10;
                this.f14660c = 1;
                return pVar.invoke(c10, this) == f10 ? f10 : c10;
            } else if (i10 == 1) {
                c cVar = (c) this.f14661d;
                y.b(obj);
                return cVar;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final Object a(h<f> hVar, p<? super c, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super f> eVar) {
        return hVar.a(new a(pVar, (C17164e<? super a>) null), eVar);
    }
}
