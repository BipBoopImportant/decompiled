package a9;

import com.contentsquare.android.core.features.config.model.JsonConfig;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

public final class B6 extends C17544u implements C17631a<P0> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E f41938c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B6(E e10) {
        super(0);
        this.f41938c = e10;
    }

    public final Object invoke() {
        JsonConfig.SessionReplay o10;
        JsonConfig.ProjectConfiguration b10 = this.f41938c.f41974b.b();
        if ((b10 != null ? b10.g() : 0) != 0) {
            JsonConfig.ProjectConfiguration b11 = this.f41938c.f41974b.b();
            String c10 = (b11 == null || (o10 = b11.o()) == null) ? null : o10.c();
            if (c10 == null) {
                c10 = "";
            }
            if (c10.length() > 0) {
                return P0.EVALUATE;
            }
        }
        return P0.BREAK;
    }
}
