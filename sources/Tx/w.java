package tx;

import HJ.C15854t;
import YH.C16877v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sugarcube.core.logger.DslKt;
import ds.C11239c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sx.C15052c;
import wx.c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Ltx/w;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ltx/z;", "Lds/c;", "imageLoader", "<init>", "(Lds/c;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "f", "(Landroid/view/ViewGroup;I)Ltx/z;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "LXH/N;", "e", "(Ltx/z;I)V", "", "Lwx/c;", "values", "i", "(Ljava/util/List;)V", "g", "(Ltx/z;)V", "h", "Lds/c;", "", "Ljava/util/List;", "items", "Landroidx/lifecycle/K;", "j", "Landroidx/lifecycle/K;", "_selectedValue", "Landroidx/lifecycle/F;", "k", "Landroidx/lifecycle/F;", "d", "()Landroidx/lifecycle/F;", "selectedValue", "Landroid/view/View$OnClickListener;", "l", "Landroid/view/View$OnClickListener;", "selectedValueClickListener", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends RecyclerView.h<z> {

    /* renamed from: h  reason: collision with root package name */
    private final C11239c f131242h;

    /* renamed from: i  reason: collision with root package name */
    private final List<c> f131243i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final K<c> f131244j;

    /* renamed from: k  reason: collision with root package name */
    private final F<c> f131245k;

    /* renamed from: l  reason: collision with root package name */
    private final View.OnClickListener f131246l;

    public w(C11239c cVar) {
        C17542s.j(cVar, "imageLoader");
        this.f131242h = cVar;
        K<c> k10 = new K<>();
        this.f131244j = k10;
        this.f131245k = k10;
        this.f131246l = new v(this);
    }

    /* access modifiers changed from: private */
    public static final void h(w wVar, View view) {
        Object obj;
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str != null) {
            Iterator it = wVar.f131243i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((c) obj).b(), str)) {
                    break;
                }
            }
            c cVar = (c) obj;
            if (cVar != null) {
                wVar.f131244j.postValue(cVar);
            }
            if (cVar == null) {
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Selected " + str + ", but couldn't find it in " + wVar.f131243i);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, indexOutOfBoundsException);
                        if (a10 != null) {
                            str2 = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    if (str3 == null) {
                        String name = w.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str3;
                    bVar.a(eVar, str4, false, indexOutOfBoundsException, str2);
                    str3 = str4;
                }
            }
        }
    }

    public final F<c> d() {
        return this.f131245k;
    }

    /* renamed from: e */
    public void onBindViewHolder(z zVar, int i10) {
        C17542s.j(zVar, "holder");
        c cVar = this.f131243i.get(i10);
        zVar.c(cVar);
        View view = zVar.itemView;
        view.setOnClickListener(this.f131246l);
        view.setTag(cVar.b());
    }

    /* renamed from: f */
    public z onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i10 == C15052c.f131016c) {
            View inflate = from.inflate(i10, viewGroup, false);
            C17542s.i(inflate, "inflate(...)");
            return new y(inflate);
        }
        View inflate2 = from.inflate(i10, viewGroup, false);
        C17542s.i(inflate2, "inflate(...)");
        return new u(inflate2, this.f131242h);
    }

    /* renamed from: g */
    public void onViewRecycled(z zVar) {
        ImageView d10;
        C17542s.j(zVar, "holder");
        super.onViewRecycled(zVar);
        u uVar = zVar instanceof u ? (u) zVar : null;
        if (uVar != null && (d10 = uVar.d()) != null) {
            this.f131242h.b(d10);
        }
    }

    public int getItemCount() {
        return this.f131243i.size();
    }

    public int getItemViewType(int i10) {
        super.getItemViewType(i10);
        return this.f131243i.get(i10) instanceof wx.e ? C15052c.f131016c : C15052c.f131017d;
    }

    public final void i(List<? extends c> list) {
        C17542s.j(list, "values");
        List t12 = C16877v.t1(this.f131243i);
        this.f131243i.clear();
        this.f131243i.addAll(list);
        h.b(new x(t12, this.f131243i)).c(this);
    }
}
