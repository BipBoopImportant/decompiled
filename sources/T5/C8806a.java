package t5;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lt5/a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "processName", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.a  reason: case insensitive filesystem */
final class C8806a {

    /* renamed from: a  reason: collision with root package name */
    public static final C8806a f56605a = new C8806a();

    private C8806a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        C17542s.i(processName, "getProcessName()");
        return processName;
    }
}
