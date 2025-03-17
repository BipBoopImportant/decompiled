package com.ingka.ikea.backinstock.notification.ui;

import Ae.e;
import Ae.j;
import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16533h;
import U0.C4889m;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import YH.X;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import e.C5286i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lm.c;
import mm.C11580b;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import um.C12066a;
import um.C12067b;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010<\u001a\u0002078\u0016XD¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/ingka/ikea/backinstock/notification/ui/BackInStockExplanationDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "", "<init>", "()V", "Llm/c$a;", "result", "LXH/N;", "B0", "(Llm/c$a;)V", "Lum/b;", "C0", "(Lum/b;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onStart", "Llm/e;", "P", "Llm/e;", "y0", "()Llm/e;", "setBackInStockNavigation", "(Llm/e;)V", "backInStockNavigation", "LAe/e;", "Q", "LAe/e;", "x0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "Lum/a;", "R", "Lum/a;", "z0", "()Lum/a;", "setCheckNotificationPermissionUseCase", "(Lum/a;)V", "checkNotificationPermissionUseCase", "Lmm/b;", "S", "LXH/o;", "A0", "()Lmm/b;", "viewModel", "", "T", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackInStockExplanationDialogFragment extends Hilt_BackInStockExplanationDialogFragment {

    /* renamed from: P  reason: collision with root package name */
    public lm.e f93138P;

    /* renamed from: Q  reason: collision with root package name */
    public Ae.e f93139Q;

    /* renamed from: R  reason: collision with root package name */
    public C12066a f93140R;

    /* renamed from: S  reason: collision with root package name */
    private final C16824o f93141S;

    /* renamed from: T  reason: collision with root package name */
    private final String f93142T = "backinstock/notification/push?storeId={storeId}&storeName={storeName}&itemNo={itemNo}&itemType={itemType}&clickAndCollect={clickAndCollect}&zipCode={zipCode}&areaCode={areaCode}";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BackInStockExplanationDialogFragment f93143a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ComposeView f93144b;

        a(BackInStockExplanationDialogFragment backInStockExplanationDialogFragment, ComposeView composeView) {
            this.f93143a = backInStockExplanationDialogFragment;
            this.f93144b = composeView;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(BackInStockExplanationDialogFragment backInStockExplanationDialogFragment, Activity activity, boolean z10) {
            C12067b a10 = z10 ? C12067b.c.f103848a : backInStockExplanationDialogFragment.z0().a(activity);
            backInStockExplanationDialogFragment.C0(a10);
            if (a10 instanceof C12067b.c) {
                backInStockExplanationDialogFragment.A0().F();
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(BackInStockExplanationDialogFragment backInStockExplanationDialogFragment) {
            backInStockExplanationDialogFragment.dismiss();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C5286i iVar, ComposeView composeView, BackInStockExplanationDialogFragment backInStockExplanationDialogFragment) {
            if (Build.VERSION.SDK_INT >= 33) {
                iVar.a("android.permission.POST_NOTIFICATIONS");
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("We should not end up here");
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = composeView.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                lm.e y02 = backInStockExplanationDialogFragment.y0();
                Context requireContext = backInStockExplanationDialogFragment.requireContext();
                C17542s.i(requireContext, "requireContext(...)");
                y02.c(requireContext);
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(BackInStockExplanationDialogFragment backInStockExplanationDialogFragment) {
            lm.e y02 = backInStockExplanationDialogFragment.y0();
            Context requireContext = backInStockExplanationDialogFragment.requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            y02.c(requireContext);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(U0.C4889m r8, int r9) {
            /*
                r7 = this;
                r0 = r9 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r8.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r8.L()
                goto L_0x0107
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment.onCreateView.<anonymous>.<anonymous> (BackInStockExplanationDialogFragment.kt:77)"
                r2 = -1278831834(0xffffffffb3c69326, float:-9.2468596E-8)
                U0.C4895p.S(r2, r9, r0, r1)
            L_0x0020:
                U0.I0 r9 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                java.lang.Object r9 = r8.Q(r9)
                android.content.Context r9 = (android.content.Context) r9
                android.app.Activity r9 = Xo.c.a(r9)
                if (r9 == 0) goto L_0x0108
                h.c r0 = new h.c
                r0.<init>()
                r1 = 405282151(0x18281d67, float:2.1728335E-24)
                r8.W(r1)
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r1 = r7.f93143a
                boolean r1 = r8.F(r1)
                boolean r2 = r8.F(r9)
                r1 = r1 | r2
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r2 = r7.f93143a
                java.lang.Object r3 = r8.D()
                if (r1 != 0) goto L_0x0056
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x005e
            L_0x0056:
                com.ingka.ikea.backinstock.notification.ui.a r3 = new com.ingka.ikea.backinstock.notification.ui.a
                r3.<init>(r2, r9)
                r8.u(r3)
            L_0x005e:
                nI.l r3 = (nI.C17642l) r3
                r8.P()
                r9 = 0
                e.i r9 = e.C5280c.a(r0, r3, r8, r9)
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r0 = r7.f93143a
                mm.b r1 = r0.A0()
                r0 = 405300078(0x1828636e, float:2.176369E-24)
                r8.W(r0)
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r0 = r7.f93143a
                boolean r0 = r8.F(r0)
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r2 = r7.f93143a
                java.lang.Object r3 = r8.D()
                if (r0 != 0) goto L_0x008a
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r3 != r0) goto L_0x0092
            L_0x008a:
                com.ingka.ikea.backinstock.notification.ui.b r3 = new com.ingka.ikea.backinstock.notification.ui.b
                r3.<init>(r2)
                r8.u(r3)
            L_0x0092:
                r2 = r3
                nI.a r2 = (nI.C17631a) r2
                r8.P()
                r0 = 405303284(0x18286ff4, float:2.1770013E-24)
                r8.W(r0)
                boolean r0 = r8.F(r9)
                androidx.compose.ui.platform.ComposeView r3 = r7.f93144b
                boolean r3 = r8.F(r3)
                r0 = r0 | r3
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r3 = r7.f93143a
                boolean r3 = r8.F(r3)
                r0 = r0 | r3
                androidx.compose.ui.platform.ComposeView r3 = r7.f93144b
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r4 = r7.f93143a
                java.lang.Object r5 = r8.D()
                if (r0 != 0) goto L_0x00c2
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r5 != r0) goto L_0x00ca
            L_0x00c2:
                com.ingka.ikea.backinstock.notification.ui.c r5 = new com.ingka.ikea.backinstock.notification.ui.c
                r5.<init>(r9, r3, r4)
                r8.u(r5)
            L_0x00ca:
                r3 = r5
                nI.a r3 = (nI.C17631a) r3
                r8.P()
                r9 = 405319103(0x1828adbf, float:2.180121E-24)
                r8.W(r9)
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r9 = r7.f93143a
                boolean r9 = r8.F(r9)
                com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment r0 = r7.f93143a
                java.lang.Object r4 = r8.D()
                if (r9 != 0) goto L_0x00ec
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r4 != r9) goto L_0x00f4
            L_0x00ec:
                com.ingka.ikea.backinstock.notification.ui.d r4 = new com.ingka.ikea.backinstock.notification.ui.d
                r4.<init>(r0)
                r8.u(r4)
            L_0x00f4:
                nI.a r4 = (nI.C17631a) r4
                r8.P()
                r6 = 0
                r5 = r8
                om.f.l(r1, r2, r3, r4, r5, r6)
                boolean r8 = U0.C4895p.J()
                if (r8 == 0) goto L_0x0107
                U0.C4895p.R()
            L_0x0107:
                return
            L_0x0108:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "Required value was null."
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment.a.f(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment$onCreateView$1$2", f = "BackInStockExplanationDialogFragment.kt", l = {115}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93145c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BackInStockExplanationDialogFragment f93146d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment$onCreateView$1$2$1", f = "BackInStockExplanationDialogFragment.kt", l = {116}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f93147c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ BackInStockExplanationDialogFragment f93148d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.backinstock.notification.ui.BackInStockExplanationDialogFragment$b$a$a  reason: collision with other inner class name */
            static final class C2073a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ BackInStockExplanationDialogFragment f93149a;

                C2073a(BackInStockExplanationDialogFragment backInStockExplanationDialogFragment) {
                    this.f93149a = backInStockExplanationDialogFragment;
                }

                /* renamed from: c */
                public final Object emit(c.a aVar, C17164e<? super C16807N> eVar) {
                    if (aVar != null) {
                        BackInStockExplanationDialogFragment backInStockExplanationDialogFragment = this.f93149a;
                        backInStockExplanationDialogFragment.B0(aVar);
                        backInStockExplanationDialogFragment.A0().E();
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(BackInStockExplanationDialogFragment backInStockExplanationDialogFragment, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f93148d = backInStockExplanationDialogFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f93148d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f93147c;
                if (i10 == 0) {
                    y.b(obj);
                    C16519P<c.a> C10 = this.f93148d.A0().C();
                    C2073a aVar = new C2073a(this.f93148d);
                    this.f93147c = 1;
                    if (C10.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y.b(obj);
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BackInStockExplanationDialogFragment backInStockExplanationDialogFragment, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f93146d = backInStockExplanationDialogFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f93146d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93145c;
            if (i10 == 0) {
                y.b(obj);
                BackInStockExplanationDialogFragment backInStockExplanationDialogFragment = this.f93146d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(backInStockExplanationDialogFragment, (C17164e<? super a>) null);
                this.f93145c = 1;
                if (androidx.lifecycle.Q.b(backInStockExplanationDialogFragment, bVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93150c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f93150c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f93150c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93151c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f93151c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f93151c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f93152c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f93152c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f93152c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f93153c = aVar;
            this.f93154d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f93153c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f93154d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93155c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f93155c = oVar;
            this.f93156d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f93156d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f93155c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public BackInStockExplanationDialogFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f93141S = W.b(this, P.b(C11580b.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public final C11580b A0() {
        return (C11580b) this.f93141S.getValue();
    }

    /* access modifiers changed from: private */
    public final void B0(c.a aVar) {
        e.c.c(x0(), j.ACTION_TAP.b(), X.m(C16796C.a("component_value", "PUSH"), C16796C.a("fulfilment", com.ingka.ikea.backinstock.notification.repository.network.b.d(aVar.a()))), Interaction$Component.BACK_IN_STOCK_NOTIFY_ME_CONFIRMATION, (e.b) null, 8, (Object) null);
        rw.d.a(this, aVar, "BackInStockExplanationFragmentRequestKey");
        dismiss();
    }

    /* access modifiers changed from: private */
    public final void C0(C12067b bVar) {
        A0().D(bVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        TC.e.l(composeView, false, c1.c.c(-1278831834, true, new a(this, composeView)), 1, (Object) null);
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        return composeView;
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
        }
        C12066a z02 = z0();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C0(z02.a(requireActivity));
    }

    public final Ae.e x0() {
        Ae.e eVar = this.f93139Q;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final lm.e y0() {
        lm.e eVar = this.f93138P;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("backInStockNavigation");
        return null;
    }

    public final C12066a z0() {
        C12066a aVar = this.f93140R;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("checkNotificationPermissionUseCase");
        return null;
    }
}
