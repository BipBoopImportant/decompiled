package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.d;
import kotlin.Metadata;
import z1.C6271a;
import z1.C6272b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "Lz1/a;", "connection", "Lz1/b;", "dispatcher", "a", "(Landroidx/compose/ui/d;Lz1/a;Lz1/b;)Landroidx/compose/ui/d;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final d a(d dVar, C6271a aVar, C6272b bVar) {
        return dVar.s(new NestedScrollElement(aVar, bVar));
    }

    public static /* synthetic */ d b(d dVar, C6271a aVar, C6272b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        return a(dVar, aVar, bVar);
    }
}
