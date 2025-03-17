package com.sugarcube.core.network.models;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/core/network/models/FurnitureType;", "", "<init>", "(Ljava/lang/String;I)V", "SingleItem", "Stackable", "Combinable", "Rug", "WallArt", "WallDecor", "Furniture", "DuvetSet", "AccentPillowCover", "SalesDressedBed", "MorpheusBed", "Companion", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum FurnitureType {
    SingleItem,
    Stackable,
    Combinable,
    Rug,
    WallArt,
    WallDecor,
    Furniture,
    DuvetSet,
    AccentPillowCover,
    SalesDressedBed,
    MorpheusBed;
    
    public static final Companion Companion = null;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/network/models/FurnitureType$Companion;", "", "<init>", "()V", "getFurnitureType", "Lcom/sugarcube/core/network/models/FurnitureType;", "catalogItem", "Lcom/sugarcube/core/network/models/CatalogItem;", "morpheusOn", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FurnitureType getFurnitureType$default(Companion companion, CatalogItem catalogItem, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return companion.getFurnitureType(catalogItem, z10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
            r0 = (r0 = r0.getCombinables()).getSelfMeta();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.sugarcube.core.network.models.FurnitureType getFurnitureType(com.sugarcube.core.network.models.CatalogItem r3, boolean r4) {
            /*
                r2 = this;
                java.lang.String r0 = "catalogItem"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                com.sugarcube.core.network.models.CatalogItemMetadata r0 = r3.getMetadata()
                if (r0 == 0) goto L_0x001c
                com.sugarcube.core.network.models.CatalogCombinableMetadata r0 = r0.getCombinables()
                if (r0 == 0) goto L_0x001c
                com.sugarcube.core.network.models.CatalogCombinableSelfMeta r0 = r0.getSelfMeta()
                if (r0 == 0) goto L_0x001c
                java.lang.String r0 = r0.getCategory()
                goto L_0x001d
            L_0x001c:
                r0 = 0
            L_0x001d:
                java.lang.String r1 = "bed_frame"
                boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r1 == 0) goto L_0x0035
                if (r4 == 0) goto L_0x0031
                boolean r3 = r3.getHasCombinableSockets()
                if (r3 == 0) goto L_0x0031
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.MorpheusBed
                goto L_0x00ae
            L_0x0031:
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.SalesDressedBed
                goto L_0x00ae
            L_0x0035:
                java.lang.String r4 = "duvet_set_duvet"
                boolean r4 = kotlin.jvm.internal.C17542s.e(r0, r4)
                if (r4 == 0) goto L_0x0041
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.DuvetSet
                goto L_0x00ae
            L_0x0041:
                java.lang.String r4 = "accent_pillow"
                boolean r4 = kotlin.jvm.internal.C17542s.e(r0, r4)
                if (r4 == 0) goto L_0x004c
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.AccentPillowCover
                goto L_0x00ae
            L_0x004c:
                boolean r4 = r3.isStackableChild()
                if (r4 == 0) goto L_0x0055
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.Stackable
                goto L_0x00ae
            L_0x0055:
                boolean r4 = r3.isCombinableParent()
                if (r4 == 0) goto L_0x005e
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.Combinable
                goto L_0x00ae
            L_0x005e:
                java.lang.Boolean r4 = r3.isWallPlaceable2D()
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r0)
                if (r4 == 0) goto L_0x006d
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.WallArt
                goto L_0x00ae
            L_0x006d:
                java.lang.Boolean r4 = r3.isWallPlaceable3D()
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r0)
                if (r4 == 0) goto L_0x007a
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.WallDecor
                goto L_0x00ae
            L_0x007a:
                java.util.List r3 = r3.getCategories()
                if (r3 == 0) goto L_0x00ac
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                boolean r4 = r3 instanceof java.util.Collection
                if (r4 == 0) goto L_0x0090
                r4 = r3
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x0090
                goto L_0x00ac
            L_0x0090:
                java.util.Iterator r3 = r3.iterator()
            L_0x0094:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x00ac
                java.lang.Object r4 = r3.next()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r0 = "rug"
                r1 = 1
                boolean r4 = HJ.C15854t.b0(r4, r0, r1)
                if (r4 == 0) goto L_0x0094
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.Rug
                goto L_0x00ae
            L_0x00ac:
                com.sugarcube.core.network.models.FurnitureType r3 = com.sugarcube.core.network.models.FurnitureType.Furniture
            L_0x00ae:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.FurnitureType.Companion.getFurnitureType(com.sugarcube.core.network.models.CatalogItem, boolean):com.sugarcube.core.network.models.FurnitureType");
        }

        private Companion() {
        }
    }

    static {
        FurnitureType[] $values;
        $ENTRIES = C17221b.a($values);
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    public static C17220a<FurnitureType> getEntries() {
        return $ENTRIES;
    }
}
