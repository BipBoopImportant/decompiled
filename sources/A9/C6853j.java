package a9;

import android.system.Os;
import android.system.OsConstants;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

/* renamed from: a9.j  reason: case insensitive filesystem */
public final class C6853j extends C17544u implements C17631a<Long> {

    /* renamed from: c  reason: collision with root package name */
    public static final C6853j f42615c = new C6853j();

    public C6853j() {
        super(0);
    }

    public final Object invoke() {
        return Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
    }
}
