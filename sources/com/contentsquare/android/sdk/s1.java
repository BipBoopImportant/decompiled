package com.contentsquare.android.sdk;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.contentsquare.android.sdk.C7141n1;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class s1 extends C17544u implements C17642l<View, C7141n1.a> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C7141n1 f47618c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f47619d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s1(C7141n1 n1Var, RecyclerView recyclerView) {
        super(1);
        this.f47618c = n1Var;
        this.f47619d = recyclerView;
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        C17542s.j(view, "view");
        view.getLocationOnScreen(this.f47618c.f47544h);
        int m02 = this.f47619d.m0(view);
        int[] iArr = this.f47618c.f47544h;
        int i10 = iArr[0];
        return new C7141n1.a(view, m02, new Rect(i10, iArr[1], view.getWidth() + i10, view.getHeight() + this.f47618c.f47544h[1]));
    }
}
