package com.sugarcube.core.logger;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/core/logger/Priority;", "", "numeric", "", "<init>", "(Ljava/lang/String;II)V", "getNumeric", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "logger_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Priority {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6);
    
    private final int numeric;

    static {
        Priority[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private Priority(int i10) {
        this.numeric = i10;
    }

    public static C17220a<Priority> getEntries() {
        return $ENTRIES;
    }

    public final int getNumeric() {
        return this.numeric;
    }
}
