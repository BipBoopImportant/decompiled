package f1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\t\"\u0004\b\u0000\u0010\u00002&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00012\"\u0010\b\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lkotlin/Function2;", "Lf1/m;", "", "", "", "save", "Lkotlin/Function1;", "restore", "Lf1/k;", "a", "(LnI/p;LnI/l;)Lf1/k;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: f1.b  reason: case insensitive filesystem */
public final class C5300b {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lf1/m;", "it", "", "", "a", "(Lf1/m;Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.b$a */
    static final class a extends C17544u implements p<m, T, List<? extends Object>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<m, T, Map<String, Object>> f23240c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super m, ? super T, ? extends Map<String, ? extends Object>> pVar) {
            super(2);
            this.f23240c = pVar;
        }

        /* renamed from: a */
        public final List<Object> invoke(m mVar, T t10) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.f23240c.invoke(mVar, t10).entrySet()) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "", "list", "a", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: f1.b$b  reason: collision with other inner class name */
    static final class C0374b extends C17544u implements C17642l<List<? extends Object>, T> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Map<String, ? extends Object>, T> f23241c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0374b(C17642l<? super Map<String, ? extends Object>, ? extends T> lVar) {
            super(1);
            this.f23241c = lVar;
        }

        /* renamed from: a */
        public final T invoke(List<? extends Object> list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list.size() % 2 == 0) {
                for (int i10 = 0; i10 < list.size(); i10 += 2) {
                    Object obj = list.get(i10);
                    C17542s.h(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, list.get(i10 + 1));
                }
                return this.f23241c.invoke(linkedHashMap);
            }
            throw new IllegalStateException("non-zero remainder");
        }
    }

    public static final <T> C5309k<T, Object> a(p<? super m, ? super T, ? extends Map<String, ? extends Object>> pVar, C17642l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        return C5299a.a(new a(pVar), new C0374b(lVar));
    }
}
