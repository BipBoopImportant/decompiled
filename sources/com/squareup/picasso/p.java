package com.squareup.picasso;

public enum p {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    private p(int i10) {
        this.index = i10;
    }

    static boolean a(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    static boolean b(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
