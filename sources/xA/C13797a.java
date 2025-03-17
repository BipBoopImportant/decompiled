package XA;

import Q4.g;
import android.database.SQLException;
import androidx.room.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXA/a;", "Landroidx/room/x$b;", "<init>", "()V", "LQ4/g;", "db", "LXH/N;", "b", "(LQ4/g;)V", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XA.a  reason: case insensitive filesystem */
public final class C13797a extends x.b {
    public void b(g gVar) {
        C17542s.j(gVar, "db");
        super.b(gVar);
        try {
            gVar.T("DROP TABLE ShoppingListChildItems");
        } catch (SQLException unused) {
        }
    }
}
