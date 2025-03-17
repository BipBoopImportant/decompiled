package z5;

import android.database.AbstractWindowedCursor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz5/g;", "", "<init>", "()V", "Landroid/database/AbstractWindowedCursor;", "", "windowSizeBytes", "LXH/N;", "a", "(Landroid/database/AbstractWindowedCursor;J)V", "sqldelight-android-driver_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z5.g  reason: case insensitive filesystem */
final class C9018g {

    /* renamed from: a  reason: collision with root package name */
    public static final C9018g f58418a = new C9018g();

    private C9018g() {
    }

    public static final void a(AbstractWindowedCursor abstractWindowedCursor, long j10) {
        C17542s.j(abstractWindowedCursor, "<this>");
        abstractWindowedCursor.setWindow(C9017f.a((String) null, j10));
    }
}
