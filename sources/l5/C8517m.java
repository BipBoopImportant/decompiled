package l5;

import N4.b;
import Q4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll5/m;", "LN4/b;", "<init>", "()V", "LQ4/g;", "db", "LXH/N;", "migrate", "(LQ4/g;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.m  reason: case insensitive filesystem */
public final class C8517m extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final C8517m f54723a = new C8517m();

    private C8517m() {
        super(4, 5);
    }

    public void migrate(g gVar) {
        C17542s.j(gVar, "db");
        gVar.T("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.T("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
