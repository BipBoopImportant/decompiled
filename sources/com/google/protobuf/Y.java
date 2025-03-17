package com.google.protobuf;

final class Y implements X {
    Y() {
    }

    public Object a(Object obj) {
        return ((GeneratedMessageLite) obj).newMutableInstance();
    }
}
