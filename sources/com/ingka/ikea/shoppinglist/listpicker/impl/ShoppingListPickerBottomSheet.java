package com.ingka.ikea.shoppinglist.listpicker.impl;

import Bx.a;
import Ea.C9072f;
import TC.e;
import U0.A1;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.L;
import U0.M;
import XH.C16807N;
import Xo.d;
import YH.X;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5191t;
import c1.c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ingka.ikea.shoppinglist.listpicker.impl.navigation.ListPickerRoutes$ListSelector;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import dH.C17158b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lB.C14743a;
import nB.C14839a;
import nI.C17631a;
import nI.p;
import oB.C14868a;
import qB.C14935b;
import x4.C8948l;
import x4.O;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010\u0004R\u001a\u0010*\u001a\u00020\u00128\u0016XD¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006;²\u0006\u000e\u00109\u001a\u00020\n8\n@\nX\u0002²\u0006\f\u0010:\u001a\u00020\n8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/impl/ShoppingListPickerBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "", "<init>", "()V", "Lcom/google/android/material/bottomsheet/a;", "bottomSheetDialog", "Landroid/view/View;", "C0", "(Lcom/google/android/material/bottomsheet/a;)Landroid/view/View;", "", "B0", "()I", "Landroid/view/ViewGroup;", "A0", "(Lcom/google/android/material/bottomsheet/a;)Landroid/view/ViewGroup;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "result", "", "requestKey", "LXH/N;", "D0", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onDestroyView", "O", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "", "P", "Z", "hasSetResultValue", "LoB/a;", "Q", "LoB/a;", "z0", "()LoB/a;", "setArgumentMapper", "(LoB/a;)V", "argumentMapper", "R", "a", "offset", "finalOffset", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShoppingListPickerBottomSheet extends a {

    /* renamed from: R  reason: collision with root package name */
    public static final a f120314R = new a((DefaultConstructorMarker) null);

    /* renamed from: S  reason: collision with root package name */
    public static final int f120315S = 8;

    /* renamed from: O  reason: collision with root package name */
    private final String f120316O = "";

    /* renamed from: P  reason: collision with root package name */
    private boolean f120317P;

    /* renamed from: Q  reason: collision with root package name */
    public C14868a f120318Q;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/shoppinglist/listpicker/impl/ShoppingListPickerBottomSheet$a;", "", "<init>", "()V", "", "BOTTOM_SHEET_PEEK_HEIGHT_RATIO", "F", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoppingListPickerBottomSheet f120319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.bottomsheet.a f120320b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BottomSheetBehavior<FrameLayout> f120321c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f120322d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f120323e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14839a f120324f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ShoppingListPickerBottomSheet f120325a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.google.android.material.bottomsheet.a f120326b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ BottomSheetBehavior<FrameLayout> f120327c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f120328d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C8948l f120329e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C14839a f120330f;

            @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/ingka/ikea/shoppinglist/listpicker/impl/ShoppingListPickerBottomSheet$b$a$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "LXH/N;", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet$b$a$a  reason: collision with other inner class name */
            public static final class C3001a extends BottomSheetBehavior.g {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f120331a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BottomSheetBehavior<FrameLayout> f120332b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C4894o0 f120333c;

                C3001a(int i10, BottomSheetBehavior<FrameLayout> bottomSheetBehavior, C4894o0 o0Var) {
                    this.f120331a = i10;
                    this.f120332b = bottomSheetBehavior;
                    this.f120333c = o0Var;
                }

                public void b(View view, float f10) {
                    float f11;
                    C17542s.j(view, "bottomSheet");
                    int height = view.getHeight();
                    int i10 = height - this.f120331a;
                    float f12 = (float) i10;
                    float f13 = f12 * f10;
                    C4894o0 o0Var = this.f120333c;
                    if (height >= this.f120332b.u0()) {
                        int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                        if (i11 < 0) {
                            f11 = f12 + Math.abs(f13);
                        } else if (i11 != 0) {
                            f11 = f12 - f13;
                        }
                        i10 = (int) f11;
                    } else {
                        i10 = 0;
                    }
                    a.n(o0Var, i10);
                }

                public void c(View view, int i10) {
                    C17542s.j(view, "bottomSheet");
                }
            }

            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"com/ingka/ikea/shoppinglist/listpicker/impl/ShoppingListPickerBottomSheet$b$a$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "LXH/N;", "onGlobalLayout", "()V", "Landroid/view/ViewGroup;", "a", "Landroid/view/ViewGroup;", "getBottomSheet", "()Landroid/view/ViewGroup;", "bottomSheet", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet$b$a$b  reason: collision with other inner class name */
            public static final class C3002b implements ViewTreeObserver.OnGlobalLayoutListener {

                /* renamed from: a  reason: collision with root package name */
                private final ViewGroup f120334a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BottomSheetBehavior<FrameLayout> f120335b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f120336c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C4894o0 f120337d;

                C3002b(ShoppingListPickerBottomSheet shoppingListPickerBottomSheet, com.google.android.material.bottomsheet.a aVar, BottomSheetBehavior<FrameLayout> bottomSheetBehavior, int i10, C4894o0 o0Var) {
                    this.f120335b = bottomSheetBehavior;
                    this.f120336c = i10;
                    this.f120337d = o0Var;
                    this.f120334a = shoppingListPickerBottomSheet.A0(aVar);
                }

                public void onGlobalLayout() {
                    if (this.f120335b.v0() == 4 && a.j(this.f120337d) == 0) {
                        int height = this.f120334a.getHeight();
                        a.n(this.f120337d, height >= this.f120335b.u0() ? height - this.f120336c : 0);
                    }
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
                c(Object obj) {
                    super(0, obj, ShoppingListPickerBottomSheet.class, "dismiss", "dismiss()V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    t();
                    return C16807N.f139792a;
                }

                public final void t() {
                    ((ShoppingListPickerBottomSheet) this.receiver).dismiss();
                }
            }

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/shoppinglist/listpicker/impl/ShoppingListPickerBottomSheet$b$a$d", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class d implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ShoppingListPickerBottomSheet f120338a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ com.google.android.material.bottomsheet.a f120339b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C3002b f120340c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ BottomSheetBehavior f120341d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C3001a f120342e;

                public d(ShoppingListPickerBottomSheet shoppingListPickerBottomSheet, com.google.android.material.bottomsheet.a aVar, C3002b bVar, BottomSheetBehavior bottomSheetBehavior, C3001a aVar2) {
                    this.f120338a = shoppingListPickerBottomSheet;
                    this.f120339b = aVar;
                    this.f120340c = bVar;
                    this.f120341d = bottomSheetBehavior;
                    this.f120342e = aVar2;
                }

                public void b() {
                    this.f120338a.A0(this.f120339b).getViewTreeObserver().removeOnGlobalLayoutListener(this.f120340c);
                    this.f120341d.F0(this.f120342e);
                }
            }

            a(ShoppingListPickerBottomSheet shoppingListPickerBottomSheet, com.google.android.material.bottomsheet.a aVar, BottomSheetBehavior<FrameLayout> bottomSheetBehavior, int i10, C8948l lVar, C14839a aVar2) {
                this.f120325a = shoppingListPickerBottomSheet;
                this.f120326b = aVar;
                this.f120327c = bottomSheetBehavior;
                this.f120328d = i10;
                this.f120329e = lVar;
                this.f120330f = aVar2;
            }

            /* access modifiers changed from: private */
            public static final int j(C4894o0 o0Var) {
                return o0Var.e();
            }

            /* access modifiers changed from: private */
            public static final C16807N k(C14839a aVar, ShoppingListPickerBottomSheet shoppingListPickerBottomSheet) {
                aVar.o().b(androidx.navigation.fragment.a.a(shoppingListPickerBottomSheet), a.C2584a.SHOPPING_LIST);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N m(ShoppingListPickerBottomSheet shoppingListPickerBottomSheet, C14935b.c cVar) {
                C17542s.j(cVar, "result");
                String e10 = cVar.e();
                String b10 = cVar.b();
                String c10 = cVar.c();
                shoppingListPickerBottomSheet.D0(new ListPickerNavigation.b.d(C14743a.b(cVar.d()), cVar.a(), b10, c10), e10);
                shoppingListPickerBottomSheet.dismiss();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final void n(C4894o0 o0Var, int i10) {
                o0Var.g(i10);
            }

            /* access modifiers changed from: private */
            public static final int p(C4894o0 o0Var) {
                return j(o0Var);
            }

            private static final int q(A1<Integer> a12) {
                return a12.getValue().intValue();
            }

            /* access modifiers changed from: private */
            public static final L s(ShoppingListPickerBottomSheet shoppingListPickerBottomSheet, com.google.android.material.bottomsheet.a aVar, BottomSheetBehavior bottomSheetBehavior, int i10, C4894o0 o0Var, M m10) {
                C17542s.j(m10, "$this$DisposableEffect");
                ShoppingListPickerBottomSheet shoppingListPickerBottomSheet2 = shoppingListPickerBottomSheet;
                com.google.android.material.bottomsheet.a aVar2 = aVar;
                C3002b bVar = new C3002b(shoppingListPickerBottomSheet2, aVar2, bottomSheetBehavior, i10, o0Var);
                shoppingListPickerBottomSheet.A0(aVar).getViewTreeObserver().addOnGlobalLayoutListener(bVar);
                C3001a aVar3 = new C3001a(i10, bottomSheetBehavior, o0Var);
                bottomSheetBehavior.c0(aVar3);
                return new d(shoppingListPickerBottomSheet2, aVar2, bVar, bottomSheetBehavior, aVar3);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: com.ingka.ikea.shoppinglist.listpicker.impl.c} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: com.ingka.ikea.shoppinglist.listpicker.impl.c} */
            /* JADX WARNING: type inference failed for: r7v7 */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x009b, code lost:
                if (r7 == r2.a()) goto L_0x009d;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void i(U0.C4889m r16, int r17) {
                /*
                    r15 = this;
                    r0 = r15
                    r8 = r16
                    r1 = r17
                    r2 = r1 & 3
                    r3 = 2
                    if (r2 != r3) goto L_0x0016
                    boolean r2 = r16.l()
                    if (r2 != 0) goto L_0x0011
                    goto L_0x0016
                L_0x0011:
                    r16.L()
                    goto L_0x015d
                L_0x0016:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0025
                    r2 = -1
                    java.lang.String r4 = "com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet.renderUi.<anonymous>.<anonymous>.<anonymous> (ShoppingListPickerBottomSheet.kt:86)"
                    r5 = 1631911678(0x6144fefe, float:2.27121E20)
                    U0.C4895p.S(r5, r1, r2, r4)
                L_0x0025:
                    r1 = 1374246269(0x51e9557d, float:1.25270204E11)
                    r8.W(r1)
                    java.lang.Object r1 = r16.D()
                    U0.m$a r2 = U0.C4889m.f14007a
                    java.lang.Object r4 = r2.a()
                    r5 = 0
                    if (r1 != r4) goto L_0x003f
                    U0.o0 r1 = U0.C4877g1.a(r5)
                    r8.u(r1)
                L_0x003f:
                    r14 = r1
                    U0.o0 r14 = (U0.C4894o0) r14
                    r16.P()
                    r1 = 1374248654(0x51e95ece, float:1.25289742E11)
                    r8.W(r1)
                    java.lang.Object r1 = r16.D()
                    java.lang.Object r4 = r2.a()
                    if (r1 != r4) goto L_0x0061
                    com.ingka.ikea.shoppinglist.listpicker.impl.b r1 = new com.ingka.ikea.shoppinglist.listpicker.impl.b
                    r1.<init>(r14)
                    U0.A1 r1 = U0.p1.e(r1)
                    r8.u(r1)
                L_0x0061:
                    U0.A1 r1 = (U0.A1) r1
                    r16.P()
                    XH.N r4 = XH.C16807N.f139792a
                    r6 = 1374255924(0x51e97b34, float:1.25349298E11)
                    r8.W(r6)
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet r6 = r0.f120325a
                    boolean r6 = r8.F(r6)
                    com.google.android.material.bottomsheet.a r7 = r0.f120326b
                    boolean r7 = r8.F(r7)
                    r6 = r6 | r7
                    com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r7 = r0.f120327c
                    boolean r7 = r8.F(r7)
                    r6 = r6 | r7
                    int r7 = r0.f120328d
                    boolean r7 = r8.d(r7)
                    r6 = r6 | r7
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet r10 = r0.f120325a
                    com.google.android.material.bottomsheet.a r11 = r0.f120326b
                    com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout> r12 = r0.f120327c
                    int r13 = r0.f120328d
                    java.lang.Object r7 = r16.D()
                    if (r6 != 0) goto L_0x009d
                    java.lang.Object r6 = r2.a()
                    if (r7 != r6) goto L_0x00a6
                L_0x009d:
                    com.ingka.ikea.shoppinglist.listpicker.impl.c r7 = new com.ingka.ikea.shoppinglist.listpicker.impl.c
                    r9 = r7
                    r9.<init>(r10, r11, r12, r13, r14)
                    r8.u(r7)
                L_0x00a6:
                    nI.l r7 = (nI.C17642l) r7
                    r16.P()
                    r6 = 6
                    U0.P.c(r4, r7, r8, r6)
                    x4.l r4 = r0.f120329e
                    int r6 = q(r1)
                    r1 = 1374365715(0x51eb2813, float:1.26248706E11)
                    r8.W(r1)
                    nB.a r1 = r0.f120330f
                    boolean r1 = r8.F(r1)
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet r7 = r0.f120325a
                    boolean r7 = r8.F(r7)
                    r1 = r1 | r7
                    nB.a r7 = r0.f120330f
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet r9 = r0.f120325a
                    java.lang.Object r10 = r16.D()
                    if (r1 != 0) goto L_0x00d8
                    java.lang.Object r1 = r2.a()
                    if (r10 != r1) goto L_0x00e0
                L_0x00d8:
                    com.ingka.ikea.shoppinglist.listpicker.impl.d r10 = new com.ingka.ikea.shoppinglist.listpicker.impl.d
                    r10.<init>(r7, r9)
                    r8.u(r10)
                L_0x00e0:
                    r7 = r10
                    nI.a r7 = (nI.C17631a) r7
                    r16.P()
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet r1 = r0.f120325a
                    r9 = 1374375749(0x51eb4f45, float:1.26330905E11)
                    r8.W(r9)
                    boolean r9 = r8.F(r1)
                    java.lang.Object r10 = r16.D()
                    if (r9 != 0) goto L_0x00fe
                    java.lang.Object r9 = r2.a()
                    if (r10 != r9) goto L_0x0106
                L_0x00fe:
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet$b$a$c r10 = new com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet$b$a$c
                    r10.<init>(r1)
                    r8.u(r10)
                L_0x0106:
                    uI.h r10 = (uI.C18059h) r10
                    r16.P()
                    r9 = r10
                    nI.a r9 = (nI.C17631a) r9
                    r1 = 1374377957(0x51eb57e5, float:1.26348993E11)
                    r8.W(r1)
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet r1 = r0.f120325a
                    boolean r1 = r8.F(r1)
                    com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet r10 = r0.f120325a
                    java.lang.Object r11 = r16.D()
                    if (r1 != 0) goto L_0x0128
                    java.lang.Object r1 = r2.a()
                    if (r11 != r1) goto L_0x0130
                L_0x0128:
                    com.ingka.ikea.shoppinglist.listpicker.impl.e r11 = new com.ingka.ikea.shoppinglist.listpicker.impl.e
                    r11.<init>(r10)
                    r8.u(r11)
                L_0x0130:
                    r10 = r11
                    nI.l r10 = (nI.C17642l) r10
                    r16.P()
                    androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                    r2 = 1
                    r11 = 0
                    z1.a r2 = androidx.compose.ui.platform.E0.h(r11, r8, r5, r2)
                    androidx.compose.ui.d r11 = androidx.compose.ui.input.nestedscroll.a.b(r1, r2, r11, r3, r11)
                    r12 = 0
                    r13 = 64
                    r14 = 0
                    r1 = r4
                    r2 = r6
                    r3 = r7
                    r4 = r9
                    r5 = r10
                    r6 = r11
                    r7 = r14
                    r8 = r16
                    r9 = r12
                    r10 = r13
                    rB.C14977n.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x015d
                    U0.C4895p.R()
                L_0x015d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet.b.a.i(U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                i((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        b(ShoppingListPickerBottomSheet shoppingListPickerBottomSheet, com.google.android.material.bottomsheet.a aVar, BottomSheetBehavior<FrameLayout> bottomSheetBehavior, int i10, C8948l lVar, C14839a aVar2) {
            this.f120319a = shoppingListPickerBottomSheet;
            this.f120320b = aVar;
            this.f120321c = bottomSheetBehavior;
            this.f120322d = i10;
            this.f120323e = lVar;
            this.f120324f = aVar2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1898138460, i10, -1, "com.ingka.ikea.shoppinglist.listpicker.impl.ShoppingListPickerBottomSheet.renderUi.<anonymous>.<anonymous> (ShoppingListPickerBottomSheet.kt:85)");
                }
                e.e(true, c.e(1631911678, true, new a(this.f120319a, this.f120320b, this.f120321c, this.f120322d, this.f120323e, this.f120324f), mVar, 54), mVar, 54, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final ViewGroup A0(com.google.android.material.bottomsheet.a aVar) {
        View findViewById = aVar.findViewById(C9072f.f59488f);
        C17542s.h(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) findViewById;
    }

    private final int B0() {
        return (int) (((float) d.a(this).getHeight()) * 0.6666667f);
    }

    private final View C0(com.google.android.material.bottomsheet.a aVar) {
        BottomSheetBehavior<FrameLayout> o10 = aVar.o();
        C17542s.i(o10, "getBehavior(...)");
        C8948l H10 = androidx.navigation.fragment.a.a(this).H();
        if (H10 != null) {
            Context requireContext = requireContext();
            C17542s.i(requireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            composeView.setViewCompositionStrategy(s1.d.f19581b);
            int B02 = B0();
            C17158b bVar = C17158b.f142961a;
            C5191t requireActivity = requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            composeView.setContent(c.c(-1898138460, true, new b(this, aVar, o10, B02, H10, (C14839a) C17158b.a(requireActivity, C14839a.class))));
            return composeView;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void D0(ListPickerNavigation.b bVar, String str) {
        if (rw.a.b(this) && !this.f120317P) {
            rw.d.a(this, bVar, str);
            this.f120317P = true;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Dialog requireDialog = requireDialog();
        C17542s.h(requireDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        return C0((com.google.android.material.bottomsheet.a) requireDialog);
    }

    public void onDestroyView() {
        this.f120317P = false;
        super.onDestroyView();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        ListPickerRoutes$ListSelector listPickerRoutes$ListSelector = (ListPickerRoutes$ListSelector) O.a(Xo.b.a(requireArguments()), P.b(ListPickerRoutes$ListSelector.class), X.j());
        ListPickerNavigation.Operation c10 = z0().c(listPickerRoutes$ListSelector.a());
        D0(new ListPickerNavigation.b.a(C14743a.b(c10)), listPickerRoutes$ListSelector.b());
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Dialog requireDialog = requireDialog();
        C17542s.h(requireDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        ((com.google.android.material.bottomsheet.a) requireDialog).o().S0(B0());
    }

    public final C14868a z0() {
        C14868a aVar = this.f120318Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("argumentMapper");
        return null;
    }
}
