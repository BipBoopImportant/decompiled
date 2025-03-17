package com.scottyab.rootbeer;

import LE.C13184a;

public class RootBeerNative {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f122325a = true;

    static {
        try {
            System.loadLibrary("toolChecker");
        } catch (UnsatisfiedLinkError e10) {
            C13184a.b(e10);
        }
    }

    public boolean a() {
        return f122325a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z10);
}
