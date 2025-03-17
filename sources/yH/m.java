package Yh;

import Ph.c;
import Rh.d;
import Rh.f;
import Rh.g;
import XH.C16807N;
import XH.t;
import Xo.e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ip.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10026c;
import nI.C17642l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0004X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u000f8\u0004X\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0017R\u001a\u0010)\u001a\u00020\u000f8\u0004X\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\u0017¨\u0006+"}, d2 = {"LYh/m;", "Landroidx/recyclerview/widget/RecyclerView$h;", "LYh/m$a;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LYh/m$a;", "i", "m", "o", "r", "", "position", "getItemViewType", "(I)I", "type", "x", "(Landroid/view/ViewGroup;I)LYh/m$a;", "getItemCount", "()I", "holder", "pos", "LXH/N;", "w", "(LYh/m$a;I)V", "", "LZh/a;", "h", "Ljava/util/List;", "t", "()Ljava/util/List;", "items", "I", "u", "paddingBottomLarge", "j", "v", "paddingBottomSmall", "a", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class m extends RecyclerView.h<a> {

    /* renamed from: h  reason: collision with root package name */
    private final List<Zh.a> f65010h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final int f65011i = h.a(e.a(24));

    /* renamed from: j  reason: collision with root package name */
    private final int f65012j = h.a(e.a(8));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LYh/m$a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "LZh/a;", "LXH/N;", "binding", "<init>", "(Landroid/view/View;LnI/l;)V", "pipSectionDataTypeModel", "c", "(LZh/a;)V", "e", "LnI/l;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        private final C17642l<Zh.a, C16807N> f65013e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, C17642l<? super Zh.a, C16807N> lVar) {
            super(view);
            C17542s.j(view, "view");
            C17542s.j(lVar, "binding");
            this.f65013e = lVar;
        }

        public final void c(Zh.a aVar) {
            C17542s.j(aVar, "pipSectionDataTypeModel");
            this.f65013e.invoke(aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f65014a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Yh.f[] r0 = Yh.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yh.f r1 = Yh.f.TITLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Yh.f r1 = Yh.f.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Yh.f r1 = Yh.f.TEXT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Yh.f r1 = Yh.f.SUB_TEXT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Yh.f r1 = Yh.f.DISCLAIMER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Yh.f r1 = Yh.f.DIVIDER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f65014a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yh.m.b.<clinit>():void");
        }
    }

    private final a i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        d c10 = d.c(layoutInflater, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        TextView b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return new a(b10, new j(c10));
    }

    /* access modifiers changed from: private */
    public static final C16807N j(d dVar, Zh.a aVar) {
        C17542s.j(aVar, "viewModel");
        TextView textView = dVar.f63231b;
        textView.setContentDescription(aVar.b());
        C17542s.g(textView);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), aVar.a());
        jp.e.b(textView, aVar.c());
        return C16807N.f139792a;
    }

    private final a k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(c.f62836d, viewGroup, false);
        C17542s.g(inflate);
        return new a(inflate, new i());
    }

    /* access modifiers changed from: private */
    public static final C16807N l(Zh.a aVar) {
        C17542s.j(aVar, "it");
        return C16807N.f139792a;
    }

    private final a m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Rh.e c10 = Rh.e.c(layoutInflater, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        TextView b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return new a(b10, new k(c10));
    }

    /* access modifiers changed from: private */
    public static final C16807N n(Rh.e eVar, Zh.a aVar) {
        C17542s.j(aVar, "viewModel");
        TextView textView = eVar.f63233b;
        C17542s.g(textView);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), aVar.a());
        jp.e.b(textView, aVar.c());
        return C16807N.f139792a;
    }

    private final a o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        f c10 = f.c(layoutInflater, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        TextView b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return new a(b10, new h(c10));
    }

    /* access modifiers changed from: private */
    public static final C16807N p(f fVar, Zh.a aVar) {
        C17542s.j(aVar, "viewModel");
        TextView textView = fVar.f63235b;
        C17542s.g(textView);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), aVar.a());
        f d10 = aVar.d();
        f fVar2 = f.DOCUMENT;
        boolean z10 = true;
        textView.setClickable(d10 == fVar2);
        textView.setMinHeight(textView.isClickable() ? (int) textView.getResources().getDimension(C10026c.f75267a) : 0);
        textView.setOnClickListener(new l(aVar));
        textView.setContentDescription(aVar.b());
        jp.e.b(textView, aVar.c());
        if (aVar.d() != fVar2) {
            z10 = false;
        }
        jp.e.c(textView, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void q(Zh.a aVar, View view) {
        aVar.e();
    }

    private final a r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        g c10 = g.c(layoutInflater, viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        TextView b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return new a(b10, new g(c10));
    }

    /* access modifiers changed from: private */
    public static final C16807N s(g gVar, Zh.a aVar) {
        C17542s.j(aVar, "viewModel");
        TextView textView = gVar.f63237b;
        textView.setContentDescription(aVar.b());
        C17542s.g(textView);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), aVar.a());
        jp.e.b(textView, aVar.c());
        return C16807N.f139792a;
    }

    public final int getItemCount() {
        return this.f65010h.size();
    }

    public final int getItemViewType(int i10) {
        switch (b.f65014a[this.f65010h.get(i10).d().ordinal()]) {
            case 1:
                return c.f62839g;
            case 2:
            case 3:
                return c.f62838f;
            case 4:
                return c.f62837e;
            case 5:
                return c.f62835c;
            case 6:
                return c.f62836d;
            default:
                throw new t();
        }
    }

    /* access modifiers changed from: protected */
    public final List<Zh.a> t() {
        return this.f65010h;
    }

    /* access modifiers changed from: protected */
    public final int u() {
        return this.f65011i;
    }

    /* access modifiers changed from: protected */
    public final int v() {
        return this.f65012j;
    }

    /* renamed from: w */
    public final void onBindViewHolder(a aVar, int i10) {
        C17542s.j(aVar, "holder");
        aVar.c(this.f65010h.get(i10));
    }

    /* renamed from: x */
    public final a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        C17542s.j(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i10 == c.f62839g) {
            C17542s.g(from);
            return r(from, viewGroup);
        } else if (i10 == c.f62838f) {
            C17542s.g(from);
            return o(from, viewGroup);
        } else if (i10 == c.f62837e) {
            C17542s.g(from);
            return m(from, viewGroup);
        } else if (i10 == c.f62835c) {
            C17542s.g(from);
            return i(from, viewGroup);
        } else if (i10 == c.f62836d) {
            C17542s.g(from);
            return k(from, viewGroup);
        } else {
            C17542s.g(from);
            return o(from, viewGroup);
        }
    }
}
