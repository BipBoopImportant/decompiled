package androidx.compose.ui.input.key;

import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;
import y1.C6254b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function1;", "Ly1/b;", "", "onKeyEvent", "a", "(Landroidx/compose/ui/d;LnI/l;)Landroidx/compose/ui/d;", "onPreviewKeyEvent", "b", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final d a(d dVar, C17642l<? super C6254b, Boolean> lVar) {
        return dVar.s(new KeyInputElement(lVar, (C17642l<? super C6254b, Boolean>) null));
    }

    public static final d b(d dVar, C17642l<? super C6254b, Boolean> lVar) {
        return dVar.s(new KeyInputElement((C17642l<? super C6254b, Boolean>) null, lVar));
    }
}
