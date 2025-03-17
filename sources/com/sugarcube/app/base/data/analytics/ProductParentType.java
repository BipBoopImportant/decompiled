package com.sugarcube.app.base.data.analytics;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/ProductParentType;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Wall", "Furniture", "Floor", "None", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum ProductParentType {
    Wall("Wall"),
    Furniture("Furniture"),
    Floor("Floor"),
    None("null");
    
    private final String key;

    static {
        ProductParentType[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private ProductParentType(String str) {
        this.key = str;
    }

    public static C17220a<ProductParentType> getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
