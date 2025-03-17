package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class U4 extends IOException {
    public U4(String str) {
        super(str);
    }

    static T4 a() {
        return new T4("Protocol message tag had invalid wire type.");
    }

    static U4 b() {
        return new U4("Protocol message contained an invalid tag (zero).");
    }

    static U4 c() {
        return new U4("Protocol message had invalid UTF-8.");
    }

    static U4 d() {
        return new U4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static U4 e() {
        return new U4("Failed to parse the message.");
    }

    static U4 f() {
        return new U4("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static U4 g() {
        return new U4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
