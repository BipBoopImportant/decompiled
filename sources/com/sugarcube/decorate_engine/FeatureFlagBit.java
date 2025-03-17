package com.sugarcube.decorate_engine;

import com.sugarcube.app.base.data.source.CatalogRepository;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/decorate_engine/FeatureFlagBit;", "", "flagBit", "", "(Ljava/lang/String;II)V", "getFlagBit", "()I", "NoFeatures", "CanPlaceOnFloor", "CanPlaceOnWall", "StackableParent", "StackableChild", "CombinableParent", "CombinableChild", "CanRoll", "HasSockets", "HasPlugs", "SubProduct", "Prop", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum FeatureFlagBit {
    NoFeatures(0),
    CanPlaceOnFloor(1),
    CanPlaceOnWall(2),
    StackableParent(4),
    StackableChild(8),
    CombinableParent(16),
    CombinableChild(32),
    CanRoll(64),
    HasSockets(128),
    HasPlugs(256),
    SubProduct(512),
    Prop(CatalogRepository.FETCH_FLAG_SDB);
    
    private final int flagBit;

    private FeatureFlagBit(int i10) {
        this.flagBit = i10;
    }

    public final int getFlagBit() {
        return this.flagBit;
    }
}
