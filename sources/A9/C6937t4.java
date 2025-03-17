package a9;

import XH.x;
import XH.y;
import com.contentsquare.android.sdk.K0;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import dI.C17170k;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.t4  reason: case insensitive filesystem */
public final class C6937t4 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17164e<W3> f42869a;

    public C6937t4(C17170k kVar) {
        this.f42869a = kVar;
    }

    public final void a(K0.a aVar) {
        C17542s.j(aVar, "result");
        this.f42869a.resumeWith(x.b(aVar));
    }

    public final void b(String str) {
        C17542s.j(str, UiComponentContainer.RESULT_ERROR);
        C17164e<W3> eVar = this.f42869a;
        x.a aVar = x.f139812b;
        eVar.resumeWith(x.b(y.a(new IllegalStateException(str))));
    }
}
