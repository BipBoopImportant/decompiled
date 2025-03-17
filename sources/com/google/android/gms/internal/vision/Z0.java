package com.google.android.gms.internal.vision;

import java.io.IOException;

public class Z0 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private A1 f49293a = null;

    public Z0(String str) {
        super(str);
    }

    static Z0 a() {
        return new Z0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static Z0 b() {
        return new Z0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static Z0 c() {
        return new Z0("Protocol message contained an invalid tag (zero).");
    }

    static C7474c1 d() {
        return new C7474c1("Protocol message tag had invalid wire type.");
    }

    static Z0 e() {
        return new Z0("Failed to parse the message.");
    }

    static Z0 f() {
        return new Z0("Protocol message had invalid UTF-8.");
    }
}
