package androidx.compose.ui.viewinterop;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Q;
import f2.C5311a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\f\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0001\u0010\u0010\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0014\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LX4/a;", "T", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "factory", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "LXH/N;", "update", "a", "(LnI/q;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "onReset", "onRelease", "b", "(LnI/q;Landroidx/compose/ui/d;LnI/l;LnI/l;LnI/l;LU0/m;II)V", "Landroid/view/View;", "binding", "h", "(Landroid/view/View;LX4/a;)V", "g", "(Landroid/view/View;)LX4/a;", "viewGroup", "Landroidx/fragment/app/FragmentContainerView;", "action", "f", "(Landroid/view/ViewGroup;LnI/l;)V", "ui-viewbinding_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.a$a  reason: collision with other inner class name */
    static final class C0308a extends C17544u implements C17642l<T, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0308a f19779c = new C0308a();

        C0308a() {
            super(1);
        }

        public final void a(T t10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((X4.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<LayoutInflater, ViewGroup, Boolean, T> f19780c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f19781d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19782e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f19783f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f19784g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar, androidx.compose.ui.d dVar, C17642l<? super T, C16807N> lVar, int i10, int i11) {
            super(2);
            this.f19780c = qVar;
            this.f19781d = dVar;
            this.f19782e = lVar;
            this.f19783f = i10;
            this.f19784g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            a.a(this.f19780c, this.f19781d, this.f19782e, mVar, M0.a(this.f19783f | 1), this.f19784g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements C17642l<T, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f19785c = new c();

        c() {
            super(1);
        }

        public final void a(T t10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((X4.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends C17544u implements C17642l<T, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f19786c = new d();

        d() {
            super(1);
        }

        public final void a(T t10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((X4.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LX4/a;", "T", "Landroid/content/Context;", "context", "Landroid/view/View;", "a", "(Landroid/content/Context;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<Context, View> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f19787c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<LayoutInflater, ViewGroup, Boolean, T> f19788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5187o oVar, q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar) {
            super(1);
            this.f19787c = oVar;
            this.f19788d = qVar;
        }

        /* renamed from: a */
        public final View invoke(Context context) {
            LayoutInflater layoutInflater;
            C5187o oVar = this.f19787c;
            if (oVar == null || (layoutInflater = oVar.getLayoutInflater()) == null) {
                layoutInflater = LayoutInflater.from(context);
            }
            X4.a aVar = (X4.a) this.f19788d.invoke(layoutInflater, new FrameLayout(context), Boolean.FALSE);
            View root = aVar.getRoot();
            a.h(root, aVar);
            return root;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LX4/a;", "T", "Landroid/view/View;", "view", "LXH/N;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<View, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19789c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17642l<? super T, C16807N> lVar) {
            super(1);
            this.f19789c = lVar;
        }

        public final void a(View view) {
            this.f19789c.invoke(a.g(view));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LX4/a;", "T", "Landroid/view/View;", "view", "LXH/N;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<View, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19790c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f19791d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f19792e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LX4/a;", "T", "Landroidx/fragment/app/FragmentContainerView;", "container", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentContainerView;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.viewinterop.a$g$a  reason: collision with other inner class name */
        static final class C0309a extends C17544u implements C17642l<FragmentContainerView, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ FragmentManager f19793c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0309a(FragmentManager fragmentManager) {
                super(1);
                this.f19793c = fragmentManager;
            }

            public final void a(FragmentContainerView fragmentContainerView) {
                FragmentManager fragmentManager = this.f19793c;
                C5187o p02 = fragmentManager != null ? fragmentManager.p0(fragmentContainerView.getId()) : null;
                if (p02 != null && !this.f19793c.b1()) {
                    Q s10 = this.f19793c.s();
                    C17542s.i(s10, "beginTransaction()");
                    s10.r(p02);
                    s10.l();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((FragmentContainerView) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17642l<? super T, C16807N> lVar, C5187o oVar, Context context) {
            super(1);
            this.f19790c = lVar;
            this.f19791d = oVar;
            this.f19792e = context;
        }

        public final void a(View view) {
            FragmentManager childFragmentManager;
            this.f19790c.invoke(a.g(view));
            FragmentManager fragmentManager = null;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                C5187o oVar = this.f19791d;
                Context context = this.f19792e;
                if (oVar == null || (childFragmentManager = oVar.getChildFragmentManager()) == null) {
                    C5191t tVar = context instanceof C5191t ? (C5191t) context : null;
                    if (tVar != null) {
                        fragmentManager = tVar.getSupportFragmentManager();
                    }
                } else {
                    fragmentManager = childFragmentManager;
                }
                a.f(viewGroup, new C0309a(fragmentManager));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LX4/a;", "T", "Landroid/view/View;", "view", "LXH/N;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<View, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19794c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C17642l<? super T, C16807N> lVar) {
            super(1);
            this.f19794c = lVar;
        }

        public final void a(View view) {
            this.f19794c.invoke(a.g(view));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((View) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<LayoutInflater, ViewGroup, Boolean, T> f19795c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f19796d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19797e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19798f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f19799g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f19800h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f19801i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar, androidx.compose.ui.d dVar, C17642l<? super T, C16807N> lVar, C17642l<? super T, C16807N> lVar2, C17642l<? super T, C16807N> lVar3, int i10, int i11) {
            super(2);
            this.f19795c = qVar;
            this.f19796d = dVar;
            this.f19797e = lVar;
            this.f19798f = lVar2;
            this.f19799g = lVar3;
            this.f19800h = i10;
            this.f19801i = i11;
        }

        public final void a(C4889m mVar, int i10) {
            a.b(this.f19795c, this.f19796d, this.f19797e, this.f19798f, this.f19799g, mVar, M0.a(this.f19800h | 1), this.f19801i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final <T extends X4.a> void a(q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar, androidx.compose.ui.d dVar, C17642l<? super T, C16807N> lVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1985291610);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (i14 != 0) {
                lVar = C0308a.f19779c;
            }
            if (C4895p.J()) {
                C4895p.S(-1985291610, i12, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:79)");
            }
            b(qVar, dVar, (C17642l) null, (C17642l) null, lVar, k10, (i12 & 14) | 384 | (i12 & 112) | ((i12 << 6) & 57344), 8);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        C17642l<? super T, C16807N> lVar2 = lVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(qVar, dVar2, lVar2, i10, i11));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.viewinterop.a$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: androidx.compose.ui.viewinterop.a$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends X4.a> void b(nI.q<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T> r17, androidx.compose.ui.d r18, nI.C17642l<? super T, XH.C16807N> r19, nI.C17642l<? super T, XH.C16807N> r20, nI.C17642l<? super T, XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r1 = r17
            r6 = r23
            r0 = 509101952(0x1e584780, float:1.1449731E-20)
            r2 = r22
            U0.m r2 = r2.k(r0)
            r3 = r24 & 1
            r4 = 4
            if (r3 == 0) goto L_0x0015
            r3 = r6 | 6
            goto L_0x0025
        L_0x0015:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0024
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x0021
            r3 = r4
            goto L_0x0022
        L_0x0021:
            r3 = 2
        L_0x0022:
            r3 = r3 | r6
            goto L_0x0025
        L_0x0024:
            r3 = r6
        L_0x0025:
            r5 = r24 & 2
            if (r5 == 0) goto L_0x002e
            r3 = r3 | 48
        L_0x002b:
            r7 = r18
            goto L_0x0040
        L_0x002e:
            r7 = r6 & 48
            if (r7 != 0) goto L_0x002b
            r7 = r18
            boolean r8 = r2.V(r7)
            if (r8 == 0) goto L_0x003d
            r8 = 32
            goto L_0x003f
        L_0x003d:
            r8 = 16
        L_0x003f:
            r3 = r3 | r8
        L_0x0040:
            r8 = r24 & 4
            if (r8 == 0) goto L_0x0049
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0046:
            r9 = r19
            goto L_0x005b
        L_0x0049:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0046
            r9 = r19
            boolean r10 = r2.F(r9)
            if (r10 == 0) goto L_0x0058
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r3 = r3 | r10
        L_0x005b:
            r10 = r24 & 8
            if (r10 == 0) goto L_0x0064
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r12 = r20
            goto L_0x0076
        L_0x0064:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0061
            r12 = r20
            boolean r13 = r2.F(r12)
            if (r13 == 0) goto L_0x0073
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r3 = r3 | r13
        L_0x0076:
            r13 = r24 & 16
            if (r13 == 0) goto L_0x007f
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007c:
            r15 = r21
            goto L_0x0092
        L_0x007f:
            r15 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x007c
            r15 = r21
            boolean r16 = r2.F(r15)
            if (r16 == 0) goto L_0x008e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r3 = r3 | r16
        L_0x0092:
            r14 = r3 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r11) goto L_0x00a7
            boolean r11 = r2.l()
            if (r11 != 0) goto L_0x009f
            goto L_0x00a7
        L_0x009f:
            r2.L()
            r5 = r7
            r3 = r9
            r4 = r12
            goto L_0x01bc
        L_0x00a7:
            if (r5 == 0) goto L_0x00ac
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            goto L_0x00ad
        L_0x00ac:
            r5 = r7
        L_0x00ad:
            r7 = 0
            if (r8 == 0) goto L_0x00b2
            r14 = r7
            goto L_0x00b3
        L_0x00b2:
            r14 = r9
        L_0x00b3:
            if (r10 == 0) goto L_0x00b8
            androidx.compose.ui.viewinterop.a$c r8 = androidx.compose.ui.viewinterop.a.c.f19785c
            r12 = r8
        L_0x00b8:
            if (r13 == 0) goto L_0x00bd
            androidx.compose.ui.viewinterop.a$d r8 = androidx.compose.ui.viewinterop.a.d.f19786c
            r15 = r8
        L_0x00bd:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00c9
            r8 = -1
            java.lang.String r9 = "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:156)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x00c9:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r0 = r2.Q(r0)
            android.view.View r0 = (android.view.View) r0
            boolean r8 = r2.V(r0)
            java.lang.Object r9 = r2.D()
            if (r8 != 0) goto L_0x00e5
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x00ef
        L_0x00e5:
            androidx.fragment.app.o r0 = androidx.fragment.app.d0.a(r0)     // Catch:{ IllegalStateException -> 0x00eb }
            r9 = r0
            goto L_0x00ec
        L_0x00eb:
            r9 = r7
        L_0x00ec:
            r2.u(r9)
        L_0x00ef:
            androidx.fragment.app.o r9 = (androidx.fragment.app.C5187o) r9
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r2.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            boolean r8 = r2.F(r9)
            r10 = r3 & 14
            r11 = 0
            r13 = 1
            if (r10 != r4) goto L_0x0107
            r4 = r13
            goto L_0x0108
        L_0x0107:
            r4 = r11
        L_0x0108:
            r4 = r4 | r8
            java.lang.Object r8 = r2.D()
            if (r4 != 0) goto L_0x0117
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r8 != r4) goto L_0x011f
        L_0x0117:
            androidx.compose.ui.viewinterop.a$e r8 = new androidx.compose.ui.viewinterop.a$e
            r8.<init>(r9, r1)
            r2.u(r8)
        L_0x011f:
            r4 = r8
            nI.l r4 = (nI.C17642l) r4
            if (r14 != 0) goto L_0x012f
            r8 = 1526457000(0x5afbe2a8, float:3.54497152E16)
            r2.W(r8)
            r2.P()
            r10 = r7
            goto L_0x0155
        L_0x012f:
            r7 = 1526457001(0x5afbe2a9, float:3.54497173E16)
            r2.W(r7)
            boolean r7 = r2.V(r14)
            java.lang.Object r8 = r2.D()
            if (r7 != 0) goto L_0x0147
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x014f
        L_0x0147:
            androidx.compose.ui.viewinterop.a$f r8 = new androidx.compose.ui.viewinterop.a$f
            r8.<init>(r14)
            r2.u(r8)
        L_0x014f:
            nI.l r8 = (nI.C17642l) r8
            r2.P()
            r10 = r8
        L_0x0155:
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r8 = 2048(0x800, float:2.87E-42)
            if (r7 != r8) goto L_0x015d
            r7 = r13
            goto L_0x015e
        L_0x015d:
            r7 = r11
        L_0x015e:
            boolean r8 = r2.F(r9)
            r7 = r7 | r8
            boolean r8 = r2.F(r0)
            r7 = r7 | r8
            java.lang.Object r8 = r2.D()
            if (r7 != 0) goto L_0x0176
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x017e
        L_0x0176:
            androidx.compose.ui.viewinterop.a$g r8 = new androidx.compose.ui.viewinterop.a$g
            r8.<init>(r12, r9, r0)
            r2.u(r8)
        L_0x017e:
            r0 = r8
            nI.l r0 = (nI.C17642l) r0
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r3
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r8) goto L_0x018a
            r11 = r13
        L_0x018a:
            java.lang.Object r7 = r2.D()
            if (r11 != 0) goto L_0x0198
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x01a0
        L_0x0198:
            androidx.compose.ui.viewinterop.a$h r7 = new androidx.compose.ui.viewinterop.a$h
            r7.<init>(r15)
            r2.u(r7)
        L_0x01a0:
            r11 = r7
            nI.l r11 = (nI.C17642l) r11
            r13 = r3 & 112(0x70, float:1.57E-43)
            r3 = 0
            r7 = r4
            r8 = r5
            r9 = r10
            r10 = r0
            r0 = r12
            r12 = r2
            r4 = r14
            r14 = r3
            androidx.compose.ui.viewinterop.e.b(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01ba
            U0.C4895p.R()
        L_0x01ba:
            r3 = r4
            r4 = r0
        L_0x01bc:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x01d3
            androidx.compose.ui.viewinterop.a$i r9 = new androidx.compose.ui.viewinterop.a$i
            r0 = r9
            r1 = r17
            r2 = r5
            r5 = r15
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.a.b(nI.q, androidx.compose.ui.d, nI.l, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void f(ViewGroup viewGroup, C17642l<? super FragmentContainerView, C16807N> lVar) {
        if (viewGroup instanceof FragmentContainerView) {
            lVar.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            C17542s.f(childAt, "getChildAt(index)");
            if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt, lVar);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final <T extends X4.a> T g(View view) {
        T tag = view.getTag(C5311a.f23295a);
        C17542s.h(tag, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding");
        return (X4.a) tag;
    }

    /* access modifiers changed from: private */
    public static final <T extends X4.a> void h(View view, T t10) {
        view.setTag(C5311a.f23295a, t10);
    }
}
