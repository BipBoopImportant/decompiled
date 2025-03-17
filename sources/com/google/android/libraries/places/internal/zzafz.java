package com.google.android.libraries.places.internal;

import java.io.IOException;

public final class zzafz extends IOException {
    zzafz() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzafz(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zzafz(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
