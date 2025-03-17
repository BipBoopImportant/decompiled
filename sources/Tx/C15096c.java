package tx;

import androidx.recyclerview.widget.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wx.C15193a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltx/c;", "Landroidx/recyclerview/widget/h$b;", "", "Lwx/a;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "oldItemPosition", "newItemPosition", "", "b", "(II)Z", "e", "()I", "d", "a", "Ljava/util/List;", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tx.c  reason: case insensitive filesystem */
public final class C15096c extends h.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C15193a> f131221a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C15193a> f131222b;

    public C15096c(List<C15193a> list, List<C15193a> list2) {
        C17542s.j(list, "oldList");
        C17542s.j(list2, "newList");
        this.f131221a = list;
        this.f131222b = list2;
    }

    public boolean a(int i10, int i11) {
        return false;
    }

    public boolean b(int i10, int i11) {
        return C17542s.e(this.f131221a.get(i10).a(), this.f131222b.get(i11).a());
    }

    public int d() {
        return this.f131222b.size();
    }

    public int e() {
        return this.f131221a.size();
    }
}
