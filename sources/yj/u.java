package yJ;

import fI.C17221b;

public enum u {
    IN("in"),
    OUT("out"),
    INV("");
    
    private final String presentation;

    static {
        u[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private u(String str) {
        this.presentation = str;
    }

    public String toString() {
        return this.presentation;
    }
}
