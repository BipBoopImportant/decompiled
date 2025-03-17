package com.google.firebase.messaging;

import android.content.SharedPreferences;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class Z {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f68363a;

    /* renamed from: b  reason: collision with root package name */
    private final String f68364b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68365c;

    /* renamed from: d  reason: collision with root package name */
    final ArrayDeque<String> f68366d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f68367e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f68368f = false;

    private Z(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f68363a = sharedPreferences;
        this.f68364b = str;
        this.f68365c = str2;
        this.f68367e = executor;
    }

    private boolean b(boolean z10) {
        if (z10 && !this.f68368f) {
            i();
        }
        return z10;
    }

    static Z c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        Z z10 = new Z(sharedPreferences, str, str2, executor);
        z10.d();
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f68366d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f68366d     // Catch:{ all -> 0x0033 }
            r1.clear()     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r1 = r6.f68363a     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = r6.f68364b     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0033 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = r6.f68365c     // Catch:{ all -> 0x0033 }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x0021
            goto L_0x004b
        L_0x0021:
            java.lang.String r2 = r6.f68365c     // Catch:{ all -> 0x0033 }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x0035
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0035
        L_0x0033:
            r1 = move-exception
            goto L_0x004d
        L_0x0035:
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0037:
            if (r3 >= r2) goto L_0x0049
            r4 = r1[r3]     // Catch:{ all -> 0x0033 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x0046
            java.util.ArrayDeque<java.lang.String> r5 = r6.f68366d     // Catch:{ all -> 0x0033 }
            r5.add(r4)     // Catch:{ all -> 0x0033 }
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.Z.d():void");
    }

    /* access modifiers changed from: private */
    public void h() {
        synchronized (this.f68366d) {
            this.f68363a.edit().putString(this.f68364b, g()).commit();
        }
    }

    private void i() {
        this.f68367e.execute(new Y(this));
    }

    public String e() {
        String peek;
        synchronized (this.f68366d) {
            peek = this.f68366d.peek();
        }
        return peek;
    }

    public boolean f(Object obj) {
        boolean b10;
        synchronized (this.f68366d) {
            b10 = b(this.f68366d.remove(obj));
        }
        return b10;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f68366d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f68365c);
        }
        return sb2.toString();
    }
}
