package com.sugarcube.decorate.v1.internal.v1.toolbar;

import com.google.android.material.button.MaterialButton;
import nI.p;

public final /* synthetic */ class j implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f142229a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f142230b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DraggableToolbar f142231c;

    public /* synthetic */ j(MaterialButton materialButton, long j10, DraggableToolbar draggableToolbar) {
        this.f142229a = materialButton;
        this.f142230b = j10;
        this.f142231c = draggableToolbar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return DraggableToolbar.p0(this.f142229a, this.f142230b, this.f142231c, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }
}
