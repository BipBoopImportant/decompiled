package OG;

import U0.C4892n0;
import U0.C4899r0;
import com.sugarcube.decorate.v2.internal.RotateControlView;
import nI.C17642l;

/* renamed from: OG.z  reason: case insensitive filesystem */
public final /* synthetic */ class C16157z implements RotateControlView.OnItemRotateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17642l f136900a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C4899r0 f136901b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C4892n0 f136902c;

    public /* synthetic */ C16157z(C17642l lVar, C4899r0 r0Var, C4892n0 n0Var) {
        this.f136900a = lVar;
        this.f136901b = r0Var;
        this.f136902c = n0Var;
    }

    public final void onValueChanged(float f10) {
        P.M0(this.f136900a, this.f136901b, this.f136902c, f10);
    }
}
