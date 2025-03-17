package yF;

import AF.C12595o;
import DF.C12754C;
import DF.C12785b;
import QE.a0;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.q;
import com.sugarcube.core.logger.AnyKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LyF/c;", "Landroidx/recyclerview/widget/q;", "LDF/b;", "LAF/o;", "LDF/C;", "viewModel", "Landroid/view/ViewGroup;", "container", "<init>", "(LDF/C;Landroid/view/ViewGroup;)V", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)LAF/o;", "position", "", "getItemId", "(I)J", "holder", "LXH/N;", "c", "(LAF/o;I)V", "", "", "payloads", "d", "(LAF/o;ILjava/util/List;)V", "h", "LDF/C;", "getViewModel", "()LDF/C;", "i", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yF.c  reason: case insensitive filesystem */
public final class C15305c extends q<C12785b, C12595o> {

    /* renamed from: h  reason: collision with root package name */
    private final C12754C f132224h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup f132225i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15305c(C12754C c10, ViewGroup viewGroup) {
        super(new c.a(new C15304b()).a());
        C17542s.j(c10, "viewModel");
        this.f132224h = c10;
        this.f132225i = viewGroup;
    }

    /* renamed from: c */
    public void onBindViewHolder(C12595o oVar, int i10) {
        C17542s.j(oVar, "holder");
        Log.d(AnyKt.SUGARCUBE_TAG, "Vanilla view");
        Object obj = getCurrentList().get(i10);
        C17542s.i(obj, "get(...)");
        oVar.k((C12785b) obj);
    }

    /* renamed from: d */
    public void onBindViewHolder(C12595o oVar, int i10, List<Object> list) {
        C17542s.j(oVar, "holder");
        C17542s.j(list, "payloads");
        C12785b bVar = (C12785b) getCurrentList().get(i10);
        if (list.isEmpty() || !(list.get(0) instanceof Bundle)) {
            Log.d(AnyKt.SUGARCUBE_TAG, "no bundle");
            C17542s.g(bVar);
            oVar.k(bVar);
        }
    }

    /* renamed from: e */
    public C12595o onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        a0 c10 = a0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new C12595o(c10, this.f132224h);
    }

    public long getItemId(int i10) {
        return (long) i10;
    }
}
