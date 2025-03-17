package androidx.room;

import HJ.C15854t;
import android.database.sqlite.SQLiteConstraintException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/room/l;", "T", "", "Landroidx/room/k;", "insertionAdapter", "Landroidx/room/j;", "updateAdapter", "<init>", "(Landroidx/room/k;Landroidx/room/j;)V", "Landroid/database/sqlite/SQLiteConstraintException;", "ex", "LXH/N;", "a", "(Landroid/database/sqlite/SQLiteConstraintException;)V", "entity", "c", "(Ljava/lang/Object;)V", "", "entities", "b", "(Ljava/lang/Iterable;)V", "Landroidx/room/k;", "Landroidx/room/j;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C7014k<T> f44353a;

    /* renamed from: b  reason: collision with root package name */
    private final C7013j<T> f44354b;

    public l(C7014k<T> kVar, C7013j<T> jVar) {
        C17542s.j(kVar, "insertionAdapter");
        C17542s.j(jVar, "updateAdapter");
        this.f44353a = kVar;
        this.f44354b = jVar;
    }

    private final void a(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        } else if (!C15854t.b0(message, "unique", true) && !C15854t.d0(message, "2067", false, 2, (Object) null) && !C15854t.d0(message, "1555", false, 2, (Object) null)) {
            throw sQLiteConstraintException;
        }
    }

    public final void b(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "entities");
        for (Object next : iterable) {
            try {
                this.f44353a.insert(next);
            } catch (SQLiteConstraintException e10) {
                a(e10);
                this.f44354b.handle(next);
            }
        }
    }

    public final void c(T t10) {
        try {
            this.f44353a.insert(t10);
        } catch (SQLiteConstraintException e10) {
            a(e10);
            this.f44354b.handle(t10);
        }
    }
}
