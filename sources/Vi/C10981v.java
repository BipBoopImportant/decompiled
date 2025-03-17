package Vi;

import Fz.i;
import Fz.z;
import HJ.C15854t;
import Lg.c;
import Vi.m0;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import ds.C11239c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import vg.C10309b;
import vg.g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVi/v;", "LLg/a;", "LVi/w;", "<init>", "()V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LVi/v$a;", "e", "(Landroid/view/ViewGroup;)LVi/v$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.v  reason: case insensitive filesystem */
public final class C10981v extends Lg.a<C10982w> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVi/v$a;", "LLg/c;", "LVi/w;", "LFz/i;", "binding", "<init>", "(LFz/i;)V", "viewModel", "LXH/N;", "l", "(LVi/w;)V", "h", "LFz/i;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vi.v$a */
    public static final class a extends c<C10982w> {

        /* renamed from: h  reason: collision with root package name */
        private final i f88644h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super((X4.a) iVar, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(iVar, "binding");
            this.f88644h = iVar;
        }

        /* renamed from: l */
        public void c(C10982w wVar) {
            C17542s.j(wVar, "viewModel");
            super.c(wVar);
            i iVar = this.f88644h;
            iVar.f110135f.setText(wVar.c());
            iVar.f110132c.setText(wVar.a());
            if (!C15854t.v0(wVar.b())) {
                C10309b bVar = C10309b.f77164a;
                ImageView imageView = iVar.f110134e;
                C17542s.i(imageView, "productImage");
                C11239c.a.d(bVar, imageView, wVar.b(), (g.b) null, (C17642l) null, 12, (Object) null);
            } else {
                iVar.f110134e.setImageDrawable((Drawable) null);
            }
            z zVar = iVar.f110136g;
            C17542s.i(zVar, "productQuantity");
            l0.a(zVar, new m0(false, wVar.d(), m0.a.Info));
        }
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10982w;
    }

    /* renamed from: e */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C17542s.i(from, "from(...)");
        i c10 = i.c(from, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(c10);
    }
}
