package f1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.W;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aa\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "Lf1/m;", "", "save", "Lkotlin/Function1;", "restore", "Lf1/k;", "", "a", "(LnI/p;LnI/l;)Lf1/k;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: f1.a  reason: case insensitive filesystem */
public final class C5299a {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Original", "Saveable", "Lf1/m;", "it", "", "a", "(Lf1/m;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.a$a  reason: collision with other inner class name */
    static final class C0373a extends C17544u implements p<m, Original, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<m, Original, List<Saveable>> f23239c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0373a(p<? super m, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f23239c = pVar;
        }

        /* renamed from: a */
        public final Object invoke(m mVar, Original original) {
            List invoke = this.f23239c.invoke(mVar, original);
            int size = invoke.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = invoke.get(i10);
                if (obj == null || mVar.a(obj)) {
                    i10++;
                } else {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            Collection collection = invoke;
            if (!collection.isEmpty()) {
                return new ArrayList(collection);
            }
            return null;
        }
    }

    public static final <Original, Saveable> C5309k<Original, Object> a(p<? super m, ? super Original, ? extends List<? extends Saveable>> pVar, C17642l<? super List<? extends Saveable>, ? extends Original> lVar) {
        C0373a aVar = new C0373a(pVar);
        C17542s.h(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return C5310l.a(aVar, (C17642l) W.g(lVar, 1));
    }
}
