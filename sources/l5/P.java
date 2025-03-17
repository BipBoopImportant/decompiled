package l5;

import N4.b;
import Q4.g;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t5.C8792C;
import t5.C8821p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll5/P;", "LN4/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LQ4/g;", "db", "LXH/N;", "migrate", "(LQ4/g;)V", "a", "Landroid/content/Context;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class P extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54647a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P(Context context) {
        super(9, 10);
        C17542s.j(context, "context");
        this.f54647a = context;
    }

    public void migrate(g gVar) {
        C17542s.j(gVar, "db");
        gVar.T("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        C8792C.c(this.f54647a, gVar);
        C8821p.c(this.f54647a, gVar);
    }
}
