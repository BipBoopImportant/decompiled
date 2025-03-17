package tx;

import HJ.C15835a;
import HJ.C15854t;
import YH.C16877v;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.F;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sugarcube.core.logger.DslKt;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
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
import tK.C18010a;
import wx.C15193a;
import wx.c;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00150\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00150\u001e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Ltx/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Ltx/d;", "<init>", "()V", "Lwx/a;", "h", "()Lwx/a;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "g", "(Landroid/view/ViewGroup;I)Ltx/d;", "getItemCount", "()I", "holder", "position", "LXH/N;", "f", "(Ltx/d;I)V", "", "newFacets", "", "i", "(Ljava/util/List;)Z", "Lip/b;", "Lwx/c;", "Lip/b;", "_configList", "Landroidx/lifecycle/F;", "Landroidx/lifecycle/F;", "e", "()Landroidx/lifecycle/F;", "configList", "", "j", "Ljava/lang/String;", "lastSelected", "Landroid/view/View$OnClickListener;", "k", "Landroid/view/View$OnClickListener;", "facetItemClicked", "", "l", "Ljava/util/List;", "items", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tx.b  reason: case insensitive filesystem */
public final class C15095b extends RecyclerView.h<C15097d> {

    /* renamed from: h  reason: collision with root package name */
    private final C11410b<List<c>> f131216h;

    /* renamed from: i  reason: collision with root package name */
    private final F<List<c>> f131217i;

    /* renamed from: j  reason: collision with root package name */
    private String f131218j = "";

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f131219k = new C15094a(this);

    /* renamed from: l  reason: collision with root package name */
    private final List<C15193a> f131220l = new ArrayList();

    public C15095b() {
        C11410b<List<c>> bVar = new C11410b<>();
        this.f131216h = bVar;
        this.f131217i = bVar;
    }

    /* access modifiers changed from: private */
    public static final void d(C15095b bVar, View view) {
        Object tag = view.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            C15193a aVar = (C15193a) C16877v.z0(bVar.f131220l, num.intValue());
            if (aVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Wrong index for the list");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = C15095b.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                return;
            }
            bVar.f131216h.postValue(aVar.b());
            List t12 = C16877v.t1(bVar.f131220l);
            bVar.f131218j = aVar.a();
            bVar.h();
            h.b(new C15096c(t12, bVar.f131220l)).c(bVar);
            return;
        }
        bVar.f131216h.postValue(C16877v.n());
    }

    private final C15193a h() {
        C15193a aVar = null;
        for (C15193a aVar2 : this.f131220l) {
            aVar2.c(false);
            if (C17542s.e(aVar2.a(), this.f131218j)) {
                aVar2.c(true);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public final F<List<c>> e() {
        return this.f131217i;
    }

    /* renamed from: f */
    public void onBindViewHolder(C15097d dVar, int i10) {
        C17542s.j(dVar, "holder");
        dVar.itemView.setTag(Integer.valueOf(i10));
        dVar.itemView.setOnClickListener(this.f131219k);
        C15193a aVar = this.f131220l.get(i10);
        TextView c10 = dVar.c();
        String a10 = aVar.a();
        if (a10.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C15835a.h(a10.charAt(0)));
            String substring = a10.substring(1);
            C17542s.i(substring, "substring(...)");
            sb2.append(substring);
            a10 = sb2.toString();
        }
        c10.setText(a10);
        c10.setTextColor(c10.getResources().getColor(C17542s.e(this.f131218j, aVar.a()) ? C18010a.f147426j : C18010a.f147428l, (Resources.Theme) null));
    }

    /* renamed from: g */
    public C15097d onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C15052c.f131014a, viewGroup, false);
        C17542s.i(inflate, "inflate(...)");
        return new C15097d(inflate);
    }

    public int getItemCount() {
        return this.f131220l.size();
    }

    public final boolean i(List<C15193a> list) {
        List<c> list2;
        String str;
        Object obj;
        C17542s.j(list, "newFacets");
        List t12 = C16877v.t1(this.f131220l);
        this.f131220l.clear();
        Collection collection = list;
        this.f131220l.addAll(collection);
        boolean isEmpty = collection.isEmpty();
        boolean z10 = false;
        if (!isEmpty) {
            if (C15854t.v0(this.f131218j)) {
                str = ((C15193a) C16877v.w0(list)).a();
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((C15193a) obj).a(), this.f131218j)) {
                        break;
                    }
                }
                C15193a aVar = (C15193a) obj;
                if (aVar != null) {
                    str = aVar.a();
                } else {
                    str = ((C15193a) C16877v.w0(list)).a();
                    this.f131218j = str;
                }
            }
            z10 = true;
            this.f131218j = str;
        }
        C11410b<List<c>> bVar = this.f131216h;
        C15193a h10 = h();
        if (h10 == null || (list2 = h10.b()) == null) {
            list2 = C16877v.n();
        }
        bVar.postValue(list2);
        h.b(new C15096c(t12, this.f131220l)).c(this);
        return z10;
    }
}
