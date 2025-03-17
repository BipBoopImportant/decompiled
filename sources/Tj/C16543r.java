package TJ;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"$\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"T", "LTJ/g;", "e", "(LTJ/g;)LTJ/g;", "K", "Lkotlin/Function1;", "keySelector", "f", "(LTJ/g;LnI/l;)LTJ/g;", "", "Lkotlin/Function2;", "", "areEquivalent", "g", "(LTJ/g;LnI/l;LnI/p;)LTJ/g;", "a", "LnI/l;", "defaultKeySelector", "b", "LnI/p;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.r  reason: case insensitive filesystem */
final /* synthetic */ class C16543r {

    /* renamed from: a  reason: collision with root package name */
    private static final C17642l<Object, Object> f138685a = new C16541p();

    /* renamed from: b  reason: collision with root package name */
    private static final p<Object, Object, Boolean> f138686b = new C16542q();

    /* access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return C17542s.e(obj, obj2);
    }

    /* access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    public static final <T> C16532g<T> e(C16532g<? extends T> gVar) {
        return gVar instanceof C16519P ? gVar : g(gVar, f138685a, f138686b);
    }

    public static final <T, K> C16532g<T> f(C16532g<? extends T> gVar, C17642l<? super T, ? extends K> lVar) {
        return g(gVar, lVar, f138686b);
    }

    private static final <T> C16532g<T> g(C16532g<? extends T> gVar, C17642l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        if (gVar instanceof C16530e) {
            C16530e eVar = (C16530e) gVar;
            if (eVar.f138630b == lVar && eVar.f138631c == pVar) {
                return gVar;
            }
        }
        return new C16530e(gVar, lVar, pVar);
    }
}
