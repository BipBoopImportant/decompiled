package com.sugarcube.decorate.v2.internal.manager.engine;

import XH.C16807N;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import dI.C17164e;
import iG.C17353j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineToolbarInteractions;", "", "LXH/N;", "removeSelectedItemFromDesign", "(LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "", "isIncompatible", "LiG/j;", "swapSelectedItemWith", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;ZLdI/e;)Ljava/lang/Object;", "restorePreviouslySelectedVariant", "", "rotation", "rotateSelectedItemBy", "(F)V", "mirrorSelectedItem", "()V", "flipSelectedItem", "focusOnSelectedItem", "unFocusSelectedItem", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EngineToolbarInteractions {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(EngineToolbarInteractions engineToolbarInteractions, CachedCatalogItem cachedCatalogItem, boolean z10, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                return engineToolbarInteractions.swapSelectedItemWith(cachedCatalogItem, z10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: swapSelectedItemWith");
        }
    }

    void flipSelectedItem();

    void focusOnSelectedItem();

    void mirrorSelectedItem();

    Object removeSelectedItemFromDesign(C17164e<? super C16807N> eVar);

    Object restorePreviouslySelectedVariant(C17164e<? super C16807N> eVar);

    void rotateSelectedItemBy(float f10);

    Object swapSelectedItemWith(CachedCatalogItem cachedCatalogItem, boolean z10, C17164e<? super C17353j> eVar);

    void unFocusSelectedItem();
}
