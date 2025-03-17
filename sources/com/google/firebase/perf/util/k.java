package com.google.firebase.perf.util;

public enum k {
    TERABYTES(1099511627776L) {
    },
    GIGABYTES(1073741824) {
    },
    MEGABYTES(1048576) {
    },
    KILOBYTES(1024) {
    },
    BYTES(1) {
    };
    
    long numBytes;

    public long b(long j10) {
        return (j10 * this.numBytes) / KILOBYTES.numBytes;
    }

    private k(long j10) {
        this.numBytes = j10;
    }
}
