package com.sugarcube.decorate.v1.internal.v1.toolbar;

import OE.C13315g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.common.R;
import com.sugarcube.decorate.v1.internal.v1.toolbar.u;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import w2.C6214h;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001c\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroid/widget/LinearLayout;", "toolbarLayout", "Lcom/sugarcube/decorate/v1/internal/v1/toolbar/u;", "menuItem", "Lcom/google/android/material/button/MaterialButton;", "g", "(Landroid/widget/LinearLayout;Lcom/sugarcube/decorate/v1/internal/v1/toolbar/u;)Lcom/google/android/material/button/MaterialButton;", "Landroid/content/Context;", "context", "", "buttons", "Landroid/view/View;", "anchorView", "Landroid/widget/PopupWindow;", "c", "(Landroid/content/Context;Ljava/util/List;Landroid/view/View;)Landroid/widget/PopupWindow;", "", "f", "(Landroid/widget/LinearLayout;)I", "", "LXH/N;", "e", "(Landroid/widget/LinearLayout;Ljava/util/List;)V", "id", "k", "(Ljava/util/List;I)V", "", "hidden", "j", "(Ljava/util/List;IZ)V", "i", "(Ljava/util/List;)V", "v1_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    public static final PopupWindow c(Context context, List<u> list, View view) {
        C17542s.j(context, "context");
        C17542s.j(list, "buttons");
        C17542s.j(view, "anchorView");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setBackground(C6214h.e(linearLayout.getResources(), R.drawable.sc_floating_bar_rounded_corner, (Resources.Theme) null));
        linearLayout.setOrientation(0);
        linearLayout.setPadding(2, 2, 2, 2);
        for (u g10 : list) {
            g(linearLayout, g10);
        }
        linearLayout.measure(0, 0);
        PopupWindow popupWindow = new PopupWindow(linearLayout, -2, -2, false);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i10 = iArr[0];
        rect.left = i10;
        rect.top = iArr[1];
        rect.right = i10 + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        int dimensionPixelSize = rect.left - ((context.getResources().getDimensionPixelSize(C13315g.f112817a) * 2) + linearLayout.getMeasuredWidth());
        int i11 = rect.top;
        popupWindow.setOverlapAnchor(false);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        popupWindow.setClippingEnabled(false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.TooltipPopupWindowAnimation);
        if (Build.VERSION.SDK_INT >= 29) {
            popupWindow.setTouchModal(true);
        }
        view.post(new y(popupWindow, view, dimensionPixelSize, i11));
        return popupWindow;
    }

    /* access modifiers changed from: private */
    public static final void d(PopupWindow popupWindow, View view, int i10, int i11) {
        if (popupWindow != null) {
            popupWindow.showAtLocation(view, 8388659, i10, i11);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.sugarcube.decorate.v1.internal.v1.toolbar.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.sugarcube.decorate.v1.internal.v1.toolbar.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.sugarcube.decorate.v1.internal.v1.toolbar.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.sugarcube.decorate.v1.internal.v1.toolbar.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(android.widget.LinearLayout r8, java.util.List<com.sugarcube.decorate.v1.internal.v1.toolbar.u> r9) {
        /*
            java.lang.String r0 = "toolbarLayout"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "buttons"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            i(r9)
            int r0 = r8.getChildCount()
            r1 = 1
            int r0 = r0 - r1
        L_0x0013:
            r2 = 0
            r3 = -1
            if (r3 >= r0) goto L_0x0052
            android.view.View r3 = r8.getChildAt(r0)
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L_0x004f
            r4 = r9
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0028:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.sugarcube.decorate.v1.internal.v1.toolbar.u r6 = (com.sugarcube.decorate.v1.internal.v1.toolbar.u) r6
            int r6 = r6.g()
            boolean r7 = r3 instanceof java.lang.Integer
            if (r7 != 0) goto L_0x003e
            goto L_0x0028
        L_0x003e:
            r7 = r3
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r6 != r7) goto L_0x0028
            r2 = r5
        L_0x0048:
            com.sugarcube.decorate.v1.internal.v1.toolbar.u r2 = (com.sugarcube.decorate.v1.internal.v1.toolbar.u) r2
            if (r2 == 0) goto L_0x004f
            r8.removeViewAt(r0)
        L_0x004f:
            int r0 = r0 + -1
            goto L_0x0013
        L_0x0052:
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x005e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x007d
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.sugarcube.decorate.v1.internal.v1.toolbar.u r6 = (com.sugarcube.decorate.v1.internal.v1.toolbar.u) r6
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x005e
            com.sugarcube.decorate.v1.internal.v1.toolbar.u$a r6 = r6.d()
            com.sugarcube.decorate.v1.internal.v1.toolbar.u$a r7 = com.sugarcube.decorate.v1.internal.v1.toolbar.u.a.MAIN_TOOLBAR
            if (r6 != r7) goto L_0x005e
            r3.add(r5)
            goto L_0x005e
        L_0x007d:
            java.util.Iterator r3 = r3.iterator()
        L_0x0081:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0103
            java.lang.Object r4 = r3.next()
            com.sugarcube.decorate.v1.internal.v1.toolbar.u r4 = (com.sugarcube.decorate.v1.internal.v1.toolbar.u) r4
            com.google.android.material.button.MaterialButton r4 = g(r8, r4)
            int r5 = f(r8)
            if (r5 >= 0) goto L_0x0081
            int r5 = r8.getChildCount()
            if (r5 <= r1) goto L_0x0081
            java.lang.Object r5 = r4.getTag()
            r6 = 0
            if (r5 != 0) goto L_0x00a8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
        L_0x00a8:
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.C17542s.h(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            k(r9, r5)
            r8.removeView(r4)
            int r4 = r8.getChildCount()
            int r4 = r4 - r1
            android.view.View r4 = r8.getChildAt(r4)
            java.lang.Object r5 = r4.getTag()
            if (r5 != 0) goto L_0x00cc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
        L_0x00cc:
            kotlin.jvm.internal.C17542s.h(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            k(r9, r5)
            r8.removeView(r4)
            java.util.Iterator r4 = r0.iterator()
        L_0x00df:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00f9
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.sugarcube.decorate.v1.internal.v1.toolbar.u r6 = (com.sugarcube.decorate.v1.internal.v1.toolbar.u) r6
            int r6 = r6.g()
            com.sugarcube.decorate.v1.internal.v1.toolbar.u$b r7 = com.sugarcube.decorate.v1.internal.v1.toolbar.u.b.SHOW_MORE
            int r7 = r7.b()
            if (r6 != r7) goto L_0x00df
            goto L_0x00fa
        L_0x00f9:
            r5 = r2
        L_0x00fa:
            com.sugarcube.decorate.v1.internal.v1.toolbar.u r5 = (com.sugarcube.decorate.v1.internal.v1.toolbar.u) r5
            if (r5 == 0) goto L_0x0081
            g(r8, r5)
            goto L_0x0081
        L_0x0103:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.toolbar.z.e(android.widget.LinearLayout, java.util.List):void");
    }

    public static final int f(LinearLayout linearLayout) {
        C17542s.j(linearLayout, "<this>");
        int dimensionPixelSize = linearLayout.getResources().getDisplayMetrics().heightPixels - (linearLayout.getResources().getDimensionPixelSize(C13315g.f112817a) * 2);
        if (linearLayout.getHeight() != 0) {
            dimensionPixelSize = linearLayout.getHeight();
        }
        int paddingTop = linearLayout.getPaddingTop() + linearLayout.getPaddingBottom();
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C17542s.h(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            childAt.measure(0, 0);
            paddingTop += childAt.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
        }
        return dimensionPixelSize - paddingTop;
    }

    public static final MaterialButton g(LinearLayout linearLayout, u uVar) {
        C17542s.j(linearLayout, "toolbarLayout");
        C17542s.j(uVar, "menuItem");
        MaterialButton materialButton = (MaterialButton) linearLayout.findViewWithTag(Integer.valueOf(uVar.g()));
        if (materialButton != null) {
            return materialButton;
        }
        MaterialButton materialButton2 = new MaterialButton(linearLayout.getContext(), (AttributeSet) null, R.attr.decorateButtonStyle);
        materialButton2.setText(uVar.h());
        materialButton2.setTag(Integer.valueOf(uVar.g()));
        materialButton2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, C6214h.e(materialButton2.getResources(), uVar.f(), (Resources.Theme) null), (Drawable) null, (Drawable) null);
        materialButton2.setCompoundDrawablePadding(0);
        materialButton2.setOnClickListener(new x(uVar));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(materialButton2, layoutParams);
        materialButton2.measure(0, 0);
        return materialButton2;
    }

    /* access modifiers changed from: private */
    public static final void h(u uVar, View view) {
        uVar.c().invoke();
    }

    public static final void i(List<u> list) {
        C17542s.j(list, "<this>");
        for (u uVar : list) {
            list.set(list.indexOf(uVar), u.b(uVar, 0, (String) null, 0, false, false, u.a.MAIN_TOOLBAR, (C17631a) null, 95, (Object) null));
        }
    }

    public static final void j(List<u> list, int i10, boolean z10) {
        Object obj;
        C17542s.j(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u) obj).g() == i10) {
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar != null) {
            list.set(list.indexOf(uVar), u.b(uVar, 0, (String) null, 0, false, z10, (u.a) null, (C17631a) null, 111, (Object) null));
        }
    }

    private static final void k(List<u> list, int i10) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u) obj).g() == i10) {
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar != null && uVar.g() != u.b.SHOW_MORE.b()) {
            list.set(list.indexOf(uVar), u.b(uVar, 0, (String) null, 0, false, false, u.a.FLOATING_BAR, (C17631a) null, 95, (Object) null));
        }
    }
}
