package com.squareup.picasso;

public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    private q(int i10) {
        this.index = i10;
    }

    public static boolean a(int i10) {
        return (i10 & OFFLINE.index) != 0;
    }

    public static boolean b(int i10) {
        return (i10 & NO_CACHE.index) == 0;
    }

    public static boolean j(int i10) {
        return (i10 & NO_STORE.index) == 0;
    }
}
