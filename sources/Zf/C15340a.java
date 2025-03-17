package zF;

import D2.d;
import XH.C16796C;
import XH.t;
import Z4.a;
import androidx.fragment.app.C5187o;
import com.sugarcube.app.base.ui.gallery.GalleryHomeContentFragment;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.app.base.ui.gallery.showrooms.ShowroomsGalleryFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"LzF/a;", "LZ4/a;", "Landroidx/fragment/app/o;", "fragment", "", "Lcom/sugarcube/app/base/ui/gallery/h;", "homeTabs", "<init>", "(Landroidx/fragment/app/o;Ljava/util/List;)V", "", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "itemId", "", "d", "(J)Z", "e", "(I)Landroidx/fragment/app/o;", "", "tabs", "LXH/N;", "z", "(Ljava/util/List;)V", "x", "(I)Lcom/sugarcube/app/base/ui/gallery/h;", "tab", "y", "(Lcom/sugarcube/app/base/ui/gallery/h;)I", "q", "Ljava/util/List;", "w", "()Ljava/util/List;", "setHomeTabs", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zF.a  reason: case insensitive filesystem */
public final class C15340a extends a {

    /* renamed from: q  reason: collision with root package name */
    private List<h> f132555q;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15340a(C5187o oVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, (i10 & 2) != 0 ? new ArrayList() : list);
    }

    public boolean d(long j10) {
        Iterable<h> iterable = this.f132555q;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (h hashCode : iterable) {
            if (((long) hashCode.hashCode()) == j10) {
                return true;
            }
        }
        return false;
    }

    public C5187o e(int i10) {
        h x10 = x(i10);
        if (C17542s.e(x10, h.b.f124418e)) {
            GalleryHomeContentFragment galleryHomeContentFragment = new GalleryHomeContentFragment();
            galleryHomeContentFragment.setArguments(d.b(C16796C.a("tab", this.f132555q.get(i10).b())));
            return galleryHomeContentFragment;
        } else if (C17542s.e(x10, h.c.f124419e)) {
            GalleryHomeContentFragment galleryHomeContentFragment2 = new GalleryHomeContentFragment();
            galleryHomeContentFragment2.setArguments(d.b(C16796C.a("tab", this.f132555q.get(i10).b())));
            return galleryHomeContentFragment2;
        } else if (C17542s.e(x10, h.d.f124420e)) {
            return new ShowroomsGalleryFragment();
        } else {
            throw new t();
        }
    }

    public int getItemCount() {
        return this.f132555q.size();
    }

    public long getItemId(int i10) {
        return (long) this.f132555q.get(i10).hashCode();
    }

    public final List<h> w() {
        return this.f132555q;
    }

    public final h x(int i10) {
        return this.f132555q.get(i10);
    }

    public final int y(h hVar) {
        C17542s.j(hVar, "tab");
        return this.f132555q.indexOf(hVar);
    }

    public final void z(List<? extends h> list) {
        C17542s.j(list, "tabs");
        if (!C17542s.e(this.f132555q, list)) {
            List<h> list2 = this.f132555q;
            list2.clear();
            list2.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15340a(C5187o oVar, List<h> list) {
        super(oVar);
        C17542s.j(oVar, "fragment");
        C17542s.j(list, "homeTabs");
        this.f132555q = list;
    }
}
