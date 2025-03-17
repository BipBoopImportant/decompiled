package androidx.compose.foundation.lazy.layout;

import L1.b;
import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "", "LL1/b;", "collectionInfo", "()LL1/b;", "", "index", "LXH/N;", "scrollToItem", "(ILdI/e;)Ljava/lang/Object;", "getViewport", "()I", "viewport", "getContentPadding", "contentPadding", "", "getScrollOffset", "()F", "scrollOffset", "getMaxScrollOffset", "maxScrollOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyLayoutSemanticState {
    b collectionInfo();

    int getContentPadding();

    float getMaxScrollOffset();

    float getScrollOffset();

    int getViewport();

    Object scrollToItem(int i10, C17164e<? super C16807N> eVar);
}
