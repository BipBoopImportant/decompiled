package com.google.protobuf;

/* renamed from: com.google.protobuf.x  reason: case insensitive filesystem */
class C9590x implements Q {

    /* renamed from: a  reason: collision with root package name */
    private static final C9590x f69425a = new C9590x();

    private C9590x() {
    }

    public static C9590x c() {
        return f69425a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.protobuf.P a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.protobuf.GeneratedMessageLite> r0 = com.google.protobuf.GeneratedMessageLite.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 == 0) goto L_0x0033
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0017 }
            com.google.protobuf.GeneratedMessageLite r0 = com.google.protobuf.GeneratedMessageLite.getDefaultInstance(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r0 = r0.buildMessageInfo()     // Catch:{ Exception -> 0x0017 }
            com.google.protobuf.P r0 = (com.google.protobuf.P) r0     // Catch:{ Exception -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get message info for "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L_0x0033:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported message type: "
            r1.append(r2)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C9590x.a(java.lang.Class):com.google.protobuf.P");
    }

    public boolean b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
