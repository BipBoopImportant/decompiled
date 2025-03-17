package YE;

import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LYE/b;", "", "<init>", "()V", "LYE/a;", "eventLog", "LXH/N;", "c", "(LYE/a;)V", "", "message", "LYE/e;", "topic", "b", "(Ljava/lang/String;LYE/e;)V", "", "throwIfFalse", "Lkotlin/Function0;", "log", "a", "(ZLnI/a;)V", "Ljava/lang/String;", "DEFAULT_TAG", "EVENTLOG_TAG", "d", "LYE/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YE.b  reason: case insensitive filesystem */
public final class C13868b {

    /* renamed from: a  reason: collision with root package name */
    public static final C13868b f118106a = new C13868b();

    /* renamed from: b  reason: collision with root package name */
    private static String f118107b = AnyKt.SUGARCUBE_TAG;

    /* renamed from: c  reason: collision with root package name */
    private static final String f118108c = null;

    /* renamed from: d  reason: collision with root package name */
    private static C13867a f118109d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f118110e = 8;

    private C13868b() {
    }

    public final void a(boolean z10, C17631a<String> aVar) {
        C17542s.j(aVar, "log");
        if (!z10) {
            String invoke = aVar.invoke();
            Log.e(AnyKt.SUGARCUBE_TAG, "Assertion: " + invoke);
        }
    }

    public final void b(String str, e eVar) {
        C17542s.j(str, "message");
        C17542s.j(eVar, "topic");
        String str2 = f118108c;
        String str3 = str2 == null ? f118107b : str2;
        Log.d(str3, "Event (" + eVar + ") : " + str);
        C13867a aVar = f118109d;
        if (aVar != null) {
            C13867a.d(aVar, str, eVar, false, 4, (Object) null);
        } else {
            Log.e(str2, "eventLog missing, event log dropped!");
        }
    }

    public final void c(C13867a aVar) {
        C17542s.j(aVar, "eventLog");
        f118109d = aVar;
    }
}
