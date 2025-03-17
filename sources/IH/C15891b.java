package IH;

import GJ.C15765h;
import HH.C15816g;
import OH.C16158a;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.jvm.javaio.b;
import kK.C17513b;
import kK.C17514c;
import kK.H;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a5\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"LkK/c;", "format", "Lio/ktor/utils/io/g;", "content", "LOH/a;", "typeInfo", "LGJ/h;", "", "a", "(LkK/c;Lio/ktor/utils/io/g;LOH/a;LdI/e;)Ljava/lang/Object;", "ktor-serialization-kotlinx-json"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: IH.b  reason: case insensitive filesystem */
public final class C15891b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "LGJ/h;", "", "<anonymous>", "(LQJ/Q;)LGJ/h;"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", l = {}, m = "invokeSuspend")
    /* renamed from: IH.b$a */
    static final class a extends l implements p<Q, C17164e<? super C15765h<? extends Object>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f135440c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f135441d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16158a f135442e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17514c f135443f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C16158a aVar, C17514c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f135441d = gVar;
            this.f135442e = aVar;
            this.f135443f = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f135441d, this.f135442e, this.f135443f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C15765h<? extends Object>> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f135440c == 0) {
                y.b(obj);
                return H.b(this.f135443f, b.d(this.f135441d, (F0) null, 1, (Object) null), C15816g.d(this.f135443f.a(), f.a(this.f135442e)), (C17513b) null, 4, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Object a(C17514c cVar, g gVar, C16158a aVar, C17164e<? super C15765h<? extends Object>> eVar) {
        return C16310i.g(C16311i0.b(), new a(gVar, aVar, cVar, (C17164e<? super a>) null), eVar);
    }
}
