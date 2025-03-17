package com.ikea.kompassmap.model.product;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ikea/kompassmap/model/product/Quality;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "S1", "S2", "S3", "S4", "S5", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Quality {
    S1("S1"),
    S2("S2"),
    S3("S3"),
    S4("S4"),
    S5("S5");
    
    private final String value;

    static {
        Quality[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private Quality(String str) {
        this.value = str;
    }

    public static C17220a<Quality> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
