package jK;

import XH.x;
import XH.y;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import mI.C17603a;
import nI.C17631a;
import nI.p;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LjK/u;", "T", "LjK/B0;", "Lkotlin/Function2;", "LuI/d;", "", "", "LuI/q;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(LnI/p;)V", "key", "types", "LXH/x;", "a", "(LuI/d;Ljava/util/List;)Ljava/lang/Object;", "LnI/p;", "LjK/v;", "LjK/A0;", "b", "LjK/v;", "classValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.u  reason: case insensitive filesystem */
final class C17480u<T> implements B0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<C18055d<Object>, List<? extends C18068q>, KSerializer<T>> f144171a;

    /* renamed from: b  reason: collision with root package name */
    private final C17482v<A0<T>> f144172b = new C17482v<>();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jK.u$a */
    public static final class a implements C17631a<T> {
        public final T invoke() {
            return new A0();
        }
    }

    public C17480u(p<? super C18055d<Object>, ? super List<? extends C18068q>, ? extends KSerializer<T>> pVar) {
        C17542s.j(pVar, "compute");
        this.f144171a = pVar;
    }

    public Object a(C18055d<Object> dVar, List<? extends C18068q> list) {
        Object obj;
        C17542s.j(dVar, "key");
        C17542s.j(list, "types");
        Object a10 = this.f144172b.get(C17603a.b(dVar));
        C17542s.i(a10, "get(...)");
        C17468n0 n0Var = (C17468n0) a10;
        T t10 = n0Var.f144141a.get();
        if (t10 == null) {
            t10 = n0Var.a(new a());
        }
        A0 a02 = (A0) t10;
        Iterable<C18068q> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C18068q z10 : iterable) {
            arrayList.add(new Z(z10));
        }
        ConcurrentHashMap a11 = a02.f144008a;
        Object obj2 = a11.get(arrayList);
        if (obj2 == null) {
            try {
                x.a aVar = x.f139812b;
                obj = x.b(this.f144171a.invoke(dVar, list));
            } catch (Throwable th2) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th2));
            }
            x a12 = x.a(obj);
            Object putIfAbsent = a11.putIfAbsent(arrayList, a12);
            obj2 = putIfAbsent == null ? a12 : putIfAbsent;
        }
        C17542s.i(obj2, "getOrPut(...)");
        return ((x) obj2).j();
    }
}
