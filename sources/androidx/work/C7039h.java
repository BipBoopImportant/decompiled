package androidx.work;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/work/h;", "Landroidx/work/V;", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "", "e", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Ljava/lang/Void;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.h  reason: case insensitive filesystem */
public final class C7039h extends V {

    /* renamed from: a  reason: collision with root package name */
    public static final C7039h f45202a = new C7039h();

    private C7039h() {
    }

    public /* bridge */ /* synthetic */ C7054x a(Context context, String str, WorkerParameters workerParameters) {
        return (C7054x) e(context, str, workerParameters);
    }

    public Void e(Context context, String str, WorkerParameters workerParameters) {
        C17542s.j(context, "appContext");
        C17542s.j(str, "workerClassName");
        C17542s.j(workerParameters, "workerParameters");
        return null;
    }
}
