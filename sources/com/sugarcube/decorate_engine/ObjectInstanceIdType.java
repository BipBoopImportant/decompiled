package com.sugarcube.decorate_engine;

import com.sugarcube.app.base.data.source.CatalogRepository;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate_engine/ObjectInstanceIdType;", "", "rawType", "", "(Ljava/lang/String;II)V", "getRawType", "()I", "Model", "Ceiling", "Door", "Floor", "Opening", "StackingSurface", "Wall", "Window", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ObjectInstanceIdType {
    Model(0),
    Ceiling(268435456),
    Door(536870912),
    Floor(805306368),
    Opening(CatalogRepository.FETCH_FLAG_SDB),
    StackingSurface(1342177280),
    Wall(1610612736),
    Window(1879048192);
    
    private final int rawType;

    private ObjectInstanceIdType(int i10) {
        this.rawType = i10;
    }

    public final int getRawType() {
        return this.rawType;
    }
}
