package l5;

import N4.b;
import Q4.g;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll5/u;", "LN4/b;", "Landroid/content/Context;", "mContext", "", "startVersion", "endVersion", "<init>", "(Landroid/content/Context;II)V", "LQ4/g;", "db", "LXH/N;", "migrate", "(LQ4/g;)V", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.u  reason: case insensitive filesystem */
public final class C8524u extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54748a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8524u(Context context, int i10, int i11) {
        super(i10, i11);
        C17542s.j(context, "mContext");
        this.f54748a = context;
    }

    public void migrate(g gVar) {
        C17542s.j(gVar, "db");
        if (this.endVersion >= 10) {
            gVar.w0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f54748a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
