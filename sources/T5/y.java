package T5;

import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.b1;
import T5.C6704h;
import T5.v;
import WK.C16762E;
import X5.C6724i;
import XH.C16796C;
import YH.C16877v;
import Z5.c;
import Z5.g;
import Z5.j;
import Z5.k;
import bI.C17035a;
import d6.C7746b;
import d6.C7748d;
import dI.C17160a;
import dI.C17168i;
import e6.C7791d;
import e6.C7793f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import r6.C8698f;
import r6.h;
import r6.s;
import r6.z;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lr6/s;", "logger", "LQJ/Q;", "c", "(Lr6/s;)LQJ/Q;", "LT5/h$a;", "LT5/v$a;", "options", "f", "(LT5/h$a;LT5/v$a;)LT5/h$a;", "e", "(LT5/h$a;)LT5/h$a;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T5/y$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {
        public a(N.a aVar, s sVar) {
            super(aVar);
        }

        public void handleException(C17168i iVar, Throwable th2) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((h) t11).a()), Integer.valueOf(((h) t10).a()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((C8698f) t11).a()), Integer.valueOf(((C8698f) t10).a()));
        }
    }

    /* access modifiers changed from: private */
    public static final Q c(s sVar) {
        return S.a(b1.b((F0) null, 1, (Object) null).plus(new a(N.f137593c0, sVar)));
    }

    public static final C6704h.a e(C6704h.a aVar) {
        Class<G> cls = G.class;
        return aVar.k(new C7793f(), P.b(String.class)).k(new C7791d(), P.b(C16762E.class)).j(new C7746b(), P.b(cls)).j(new C7748d(), P.b(cls)).h(new k.a(), P.b(cls)).h(new c.a(), P.b(byte[].class)).h(new g.b(), P.b(cls));
    }

    public static final C6704h.a f(C6704h.a aVar, v.a aVar2) {
        if (s.a(aVar2)) {
            aVar.o(new w());
            aVar.n(new x());
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final List g() {
        C18055d type;
        List g12 = C16877v.g1(z.f55717a.f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = g12.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) g12.get(i10);
            C17542s.h(hVar, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            j.a b10 = hVar.b();
            XH.v vVar = null;
            if (!(b10 == null || (type = hVar.type()) == null)) {
                vVar = C16796C.a(b10, type);
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List h() {
        List g12 = C16877v.g1(z.f55717a.e(), new c());
        ArrayList arrayList = new ArrayList();
        int size = g12.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6724i.a b10 = ((C8698f) g12.get(i10)).b();
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return arrayList;
    }
}
