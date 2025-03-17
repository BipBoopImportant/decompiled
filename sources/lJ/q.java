package Lj;

import Lg.d;
import XH.C16807N;
import Xo.e;
import YH.C16877v;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ip.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tI.C17974j;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001:\u0002*.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u0007*\u00060\u0018R\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u0007*\u00060\u0018R\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J/\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00103\u001a\u0014\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010+R&\u00107\u001a\u0014\u0012\b\u0012\u00060\u0018R\u00020\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u0010:\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u00060\u0018R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010;R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0=8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010?R\u0016\u0010C\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010+R\"\u0010J\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006K"}, d2 = {"LLj/q;", "Landroidx/recyclerview/widget/RecyclerView$p;", "LLj/q$a;", "builder", "<init>", "(LLj/q$a;)V", "Lkotlin/Function1;", "LXH/N;", "(LnI/l;)V", "LLg/d;", "adapter", "", "position", "o", "(LLg/d;I)I", "", "q", "(LLg/d;I)Z", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "n", "(Landroidx/recyclerview/widget/RecyclerView;)LLg/d;", "m", "(LLg/d;)V", "LLj/q$b;", "p", "(LLj/q$b;LLg/d;I)V", "l", "(LLj/q$b;)V", "Landroid/graphics/Canvas;", "canvas", "parent", "Landroidx/recyclerview/widget/RecyclerView$C;", "state", "i", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "g", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "a", "I", "lineHeight", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "drawable", "c", "LnI/l;", "drawForItem", "d", "horizontalPadding", "e", "horizontalPaddingLookup", "f", "Landroid/graphics/Rect;", "bounds", "LLj/q$b;", "contentHolder", "", "h", "Ljava/util/Map;", "drawForItemCache", "horizontalPaddingCache", "j", "contentVersion", "k", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    private final int f83247a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f83248b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<b, Boolean> f83249c;

    /* renamed from: d  reason: collision with root package name */
    private final int f83250d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<b, Integer> f83251e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f83252f;

    /* renamed from: g  reason: collision with root package name */
    private final b f83253g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, Boolean> f83254h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<Integer, Integer> f83255i;

    /* renamed from: j  reason: collision with root package name */
    private int f83256j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f83257k;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0014\u0010\nR4\u0010\u001f\u001a\u0014\u0012\b\u0012\u00060\u0017R\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\r\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b!\u0010\nR4\u0010$\u001a\u0014\u0012\b\u0012\u00060\u0017R\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u001c\"\u0004\b#\u0010\u001e¨\u0006%"}, d2 = {"LLj/q$a;", "", "<init>", "()V", "", "a", "I", "f", "()I", "setLineHeight", "(I)V", "lineHeight", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "g", "color", "Lkotlin/Function1;", "LLj/q$b;", "LLj/q;", "", "d", "LnI/l;", "()LnI/l;", "h", "(LnI/l;)V", "drawForItemLookup", "e", "i", "horizontalPadding", "setHorizontalPaddingLookup", "horizontalPaddingLookup", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f83258a = h.a(e.a(1));

        /* renamed from: b  reason: collision with root package name */
        private Drawable f83259b;

        /* renamed from: c  reason: collision with root package name */
        private int f83260c;

        /* renamed from: d  reason: collision with root package name */
        private C17642l<? super b, Boolean> f83261d;

        /* renamed from: e  reason: collision with root package name */
        private int f83262e;

        /* renamed from: f  reason: collision with root package name */
        private C17642l<? super b, Integer> f83263f;

        public final int a() {
            return this.f83260c;
        }

        public final C17642l<b, Boolean> b() {
            return this.f83261d;
        }

        public final Drawable c() {
            return this.f83259b;
        }

        public final int d() {
            return this.f83262e;
        }

        public final C17642l<b, Integer> e() {
            return this.f83263f;
        }

        public final int f() {
            return this.f83258a;
        }

        public final void g(int i10) {
            this.f83260c = i10;
        }

        public final void h(C17642l<? super b, Boolean> lVar) {
            this.f83261d = lVar;
        }

        public final void i(int i10) {
            this.f83262e = i10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00018\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\r\u0010\nR.\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u000f\u0010\n¨\u0006\u0011"}, d2 = {"LLj/q$b;", "", "<init>", "(LLj/q;)V", "value", "a", "Ljava/lang/Object;", "getPrev", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "prev", "b", "c", "item", "d", "next", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private Object f83264a;

        /* renamed from: b  reason: collision with root package name */
        private Object f83265b = C16807N.f139792a;

        /* renamed from: c  reason: collision with root package name */
        private Object f83266c;

        public b() {
        }

        public final Object a() {
            return this.f83265b;
        }

        public final Object b() {
            return this.f83266c;
        }

        public final void c(Object obj) {
            C17542s.j(obj, "<set-?>");
            this.f83265b = obj;
        }

        public final void d(Object obj) {
            this.f83266c = obj;
        }

        public final void e(Object obj) {
            this.f83264a = obj;
        }
    }

    public q(a aVar) {
        C17542s.j(aVar, "builder");
        this.f83247a = aVar.f();
        Drawable c10 = aVar.c();
        this.f83248b = c10 == null ? new ColorDrawable(aVar.a()) : c10;
        this.f83249c = aVar.b();
        this.f83250d = aVar.d();
        this.f83251e = aVar.e();
        this.f83252f = new Rect();
        this.f83253g = new b();
        this.f83254h = new LinkedHashMap();
        this.f83255i = new LinkedHashMap();
        this.f83256j = -1;
        this.f83257k = true;
    }

    private final void l(b bVar) {
        bVar.e((Object) null);
        bVar.c(C16807N.f139792a);
        bVar.d((Object) null);
    }

    private final void m(d dVar) {
        if (dVar.c() != this.f83256j) {
            this.f83254h.clear();
            this.f83255i.clear();
            this.f83256j = dVar.c();
        }
    }

    private final d n(RecyclerView recyclerView) {
        RecyclerView.h adapter = recyclerView.getAdapter();
        d dVar = adapter instanceof d ? (d) adapter : null;
        if (dVar == null) {
            return null;
        }
        m(dVar);
        return dVar;
    }

    private final int o(d dVar, int i10) {
        C17642l<b, Integer> lVar = this.f83251e;
        if (lVar == null) {
            return this.f83250d;
        }
        Map<Integer, Integer> map = this.f83255i;
        Integer valueOf = Integer.valueOf(i10);
        Integer num = map.get(valueOf);
        if (num == null) {
            p(this.f83253g, dVar, i10);
            Number invoke = lVar.invoke(this.f83253g);
            invoke.intValue();
            l(this.f83253g);
            num = Integer.valueOf(invoke.intValue());
            map.put(valueOf, num);
        }
        return num.intValue();
    }

    private final void p(b bVar, d dVar, int i10) {
        bVar.e(C16877v.z0(dVar.e(), i10 - 1));
        bVar.c(dVar.e().get(i10));
        bVar.d(C16877v.z0(dVar.e(), i10 + 1));
    }

    private final boolean q(d dVar, int i10) {
        C17642l<b, Boolean> lVar = this.f83249c;
        if (lVar == null) {
            return true;
        }
        Map<Integer, Boolean> map = this.f83254h;
        Integer valueOf = Integer.valueOf(i10);
        Boolean bool = map.get(valueOf);
        if (bool == null) {
            p(this.f83253g, dVar, i10);
            bool = lVar.invoke(this.f83253g);
            bool.booleanValue();
            l(this.f83253g);
            bool.booleanValue();
            map.put(valueOf, bool);
        }
        return bool.booleanValue();
    }

    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        d n10;
        int m02;
        C17542s.j(rect, "outRect");
        C17542s.j(view, "view");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        if (this.f83257k && (n10 = n(recyclerView)) != null && (m02 = recyclerView.m0(view)) >= 0 && m02 < n10.e().size()) {
            rect.set(0, 0, 0, q(n10, m02) ? this.f83247a : 0);
        }
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        d n10;
        C17542s.j(canvas, "canvas");
        C17542s.j(recyclerView, "parent");
        C17542s.j(c10, "state");
        if (this.f83257k && (n10 = n(recyclerView)) != null) {
            C17974j o10 = C16877v.o(n10.e());
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                int m02 = recyclerView.m0(childAt);
                int p10 = o10.p();
                if (m02 <= o10.q() && p10 <= m02 && q(n10, m02)) {
                    recyclerView.q0(childAt, this.f83252f);
                    int a10 = this.f83252f.bottom + h.a(childAt.getTranslationY());
                    int o11 = o(n10, m02);
                    this.f83248b.setBounds(o11, a10 - this.f83247a, recyclerView.getWidth() - o11, a10);
                    this.f83248b.draw(canvas);
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(nI.C17642l<? super Lj.q.a, XH.C16807N> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            Lj.q$a r0 = new Lj.q$a
            r0.<init>()
            r2.invoke(r0)
            r1.<init>((Lj.q.a) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lj.q.<init>(nI.l):void");
    }
}
