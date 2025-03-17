package Lg;

import XH.C16796C;
import XH.C16807N;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import xB.C15201a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001IB\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\b\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u001b\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\f2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J1\u0010#\u001a\u00020\f2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\f2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\f2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b(\u0010'J\u001b\u0010)\u001a\u00020\f2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b)\u0010'J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020\n¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\f2\u0006\u0010*\u001a\u00020\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b0\u00101J?\u00108\u001a\u00020\f2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\b\b\u0002\u00104\u001a\u0002032\u0016\b\u0002\u00107\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\f\u0018\u000105¢\u0006\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\n0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0006¢\u0006\f\n\u0004\b \u0010<\u001a\u0004\b>\u0010?R$\u0010D\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b#\u0010B\u001a\u0004\bC\u0010\u0013R$\u0010G\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040E8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010FR$\u0010H\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u000e0E8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010F¨\u0006J"}, d2 = {"LLg/d;", "Landroidx/recyclerview/widget/RecyclerView$h;", "LLg/c;", "", "LLg/a;", "delegates", "<init>", "(Ljava/util/List;)V", "", "([LLg/a;)V", "", "newList", "LXH/N;", "r", "", "itemViewType", "d", "(I)LLg/a;", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "k", "(Landroid/view/ViewGroup;I)LLg/c;", "vh", "i", "(LLg/c;I)V", "payloads", "j", "(LLg/c;ILjava/util/List;)V", "holder", "l", "(LLg/c;)V", "m", "n", "item", "o", "(Ljava/lang/Object;)V", "payload", "g", "(Ljava/lang/Object;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)I", "newItems", "", "detectMoves", "Lkotlin/Function1;", "LLg/d$a;", "block", "p", "(Ljava/util/List;ZLnI/l;)V", "", "h", "Ljava/util/List;", "_items", "e", "()Ljava/util/List;", "items", "value", "I", "c", "contentVersion", "", "Ljava/util/Map;", "viewTypeToDelegateMap", "delegateToViewTypeMap", "a", "listdelegate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends RecyclerView.h<c<?>> {

    /* renamed from: h  reason: collision with root package name */
    private final List<Object> f61676h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Object> f61677i;

    /* renamed from: j  reason: collision with root package name */
    private int f61678j;

    /* renamed from: k  reason: collision with root package name */
    private final Map<Integer, a<?>> f61679k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<a<?>, Integer> f61680l;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R6\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R6\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R<\u0010'\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 ¨\u0006("}, d2 = {"LLg/d$a;", "Landroidx/recyclerview/widget/h$b;", "", "", "from", "to", "Lkotlin/Function1;", "LXH/N;", "diffBlock", "<init>", "(Ljava/util/List;Ljava/util/List;LnI/l;)V", "", "e", "()I", "d", "old", "new", "", "b", "(II)Z", "a", "c", "(II)Ljava/lang/Object;", "Ljava/util/List;", "getFrom", "()Ljava/util/List;", "getTo", "Lkotlin/Function2;", "LnI/p;", "getAreItemsTheSame", "()LnI/p;", "g", "(LnI/p;)V", "areItemsTheSame", "getAreContentsTheSame", "f", "areContentsTheSame", "getCreateChangePayload", "h", "createChangePayload", "listdelegate_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h.b {

        /* renamed from: a  reason: collision with root package name */
        private final List<Object> f61681a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Object> f61682b;

        /* renamed from: c  reason: collision with root package name */
        private p<Object, Object, Boolean> f61683c;

        /* renamed from: d  reason: collision with root package name */
        private p<Object, Object, Boolean> f61684d;

        /* renamed from: e  reason: collision with root package name */
        private p<Object, Object, ? extends Object> f61685e;

        public a(List<? extends Object> list, List<? extends Object> list2, C17642l<? super a, C16807N> lVar) {
            C17542s.j(list, "from");
            C17542s.j(list2, "to");
            this.f61681a = list;
            this.f61682b = list2;
            if (lVar != null) {
                lVar.invoke(this);
            }
        }

        public boolean a(int i10, int i11) {
            p<Object, Object, Boolean> pVar = this.f61684d;
            return pVar != null ? pVar.invoke(this.f61681a.get(i10), this.f61682b.get(i11)).booleanValue() : C17542s.e(this.f61681a.get(i10), this.f61682b.get(i11));
        }

        public boolean b(int i10, int i11) {
            Object obj = this.f61681a.get(i10);
            Object obj2 = this.f61682b.get(i11);
            p<Object, Object, Boolean> pVar = this.f61683c;
            if (obj.getClass() != obj2.getClass()) {
                return false;
            }
            return pVar != null ? pVar.invoke(obj, obj2).booleanValue() : (!(obj instanceof C15201a) || !(obj2 instanceof C15201a)) ? C17542s.e(obj, obj2) : ((C15201a) obj).f() == ((C15201a) obj2).f();
        }

        public Object c(int i10, int i11) {
            p<Object, Object, ? extends Object> pVar = this.f61685e;
            return pVar != null ? pVar.invoke(C16877v.z0(this.f61681a, i10), C16877v.z0(this.f61682b, i11)) : super.c(i10, i11);
        }

        public int d() {
            return this.f61682b.size();
        }

        public int e() {
            return this.f61681a.size();
        }

        public final void f(p<Object, Object, Boolean> pVar) {
            this.f61684d = pVar;
        }

        public final void g(p<Object, Object, Boolean> pVar) {
            this.f61683c = pVar;
        }

        public final void h(p<Object, Object, ? extends Object> pVar) {
            this.f61685e = pVar;
        }
    }

    public d(List<? extends a<?>> list) {
        C17542s.j(list, "delegates");
        ArrayList arrayList = new ArrayList();
        this.f61676h = arrayList;
        this.f61677i = arrayList;
        this.f61678j = -1;
        Iterable iterable = list;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        int i10 = 0;
        int i11 = 0;
        for (Object next : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            arrayList2.add(C16796C.a(Integer.valueOf(i11), (a) next));
            i11 = i12;
        }
        this.f61679k = X.v(arrayList2);
        ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
        for (Object next2 : iterable) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            arrayList3.add(C16796C.a((a) next2, Integer.valueOf(i10)));
            i10 = i13;
        }
        this.f61680l = X.v(arrayList3);
        setHasStableIds(true);
    }

    private final a<?> d(int i10) {
        a<?> aVar = this.f61679k.get(Integer.valueOf(i10));
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No delegate for view type: " + i10);
    }

    public static /* synthetic */ void h(d dVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        dVar.g(obj, obj2);
    }

    public static /* synthetic */ void q(d dVar, List list, boolean z10, C17642l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        dVar.p(list, z10, lVar);
    }

    private final void r(List<? extends Object> list) {
        this.f61676h.clear();
        this.f61676h.addAll(list);
    }

    public final int c() {
        return this.f61678j;
    }

    public final List<Object> e() {
        return this.f61677i;
    }

    public final int f(Object obj) {
        return C16877v.B0(this.f61676h, obj);
    }

    public final void g(Object obj, Object obj2) {
        C17542s.j(obj, "item");
        int indexOf = this.f61676h.indexOf(obj);
        if (indexOf != -1) {
            if (obj2 != null) {
                notifyItemChanged(indexOf, obj2);
            } else {
                notifyItemChanged(indexOf);
            }
            this.f61678j++;
        }
    }

    public int getItemCount() {
        return this.f61676h.size();
    }

    public long getItemId(int i10) {
        Object obj = this.f61676h.get(i10);
        C15201a aVar = obj instanceof C15201a ? (C15201a) obj : null;
        return aVar != null ? aVar.f() : (long) obj.hashCode();
    }

    public int getItemViewType(int i10) {
        Object obj;
        Iterator it = this.f61680l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a) ((Map.Entry) obj).getKey()).a(this.f61676h.get(i10))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getValue()).intValue();
        }
        Object obj2 = this.f61676h.get(i10);
        throw new IllegalStateException("No delegate for pos:" + i10 + " item:" + obj2);
    }

    /* renamed from: i */
    public void onBindViewHolder(c<?> cVar, int i10) {
        C17542s.j(cVar, "vh");
        d(cVar.getItemViewType()).b(cVar, this.f61676h.get(i10));
    }

    /* renamed from: j */
    public void onBindViewHolder(c<?> cVar, int i10, List<? extends Object> list) {
        C17542s.j(cVar, "vh");
        C17542s.j(list, "payloads");
        d(cVar.getItemViewType()).c(cVar, this.f61676h.get(i10), list);
    }

    /* renamed from: k */
    public c<? extends Object> onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        return d(i10).d(viewGroup);
    }

    /* renamed from: l */
    public void onViewAttachedToWindow(c<?> cVar) {
        C17542s.j(cVar, "holder");
        cVar.h();
    }

    /* renamed from: m */
    public void onViewDetachedFromWindow(c<?> cVar) {
        C17542s.j(cVar, "holder");
        cVar.j();
    }

    /* renamed from: n */
    public void onViewRecycled(c<?> cVar) {
        C17542s.j(cVar, "holder");
        cVar.k();
    }

    public final void o(Object obj) {
        C17542s.j(obj, "item");
        int indexOf = this.f61676h.indexOf(obj);
        if (indexOf != -1) {
            this.f61676h.remove(obj);
            notifyItemRemoved(indexOf);
            this.f61678j++;
        }
    }

    public final void p(List<? extends Object> list, boolean z10, C17642l<? super a, C16807N> lVar) {
        List list2;
        List t12 = C16877v.t1(this.f61676h);
        if (list == null || (list2 = C16877v.t1(list)) == null) {
            list2 = C16877v.n();
        }
        h.e c10 = h.c(new a(t12, list2, lVar), z10);
        C17542s.i(c10, "calculateDiff(...)");
        r(list2);
        c10.c(this);
        this.f61678j++;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(a<?>... aVarArr) {
        this((List<? extends a<?>>) C16870n.c1(aVarArr));
        C17542s.j(aVarArr, "delegates");
    }
}
