package l5;

import N4.a;
import Q4.g;
import android.content.ContentValues;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll5/b;", "LN4/a;", "<init>", "()V", "LQ4/g;", "db", "LXH/N;", "a", "(LQ4/g;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.b  reason: case insensitive filesystem */
public final class C8506b implements a {
    public void a(g gVar) {
        C17542s.j(gVar, "db");
        gVar.T("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.l2("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
