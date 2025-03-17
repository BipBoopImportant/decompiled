package com.google.firebase.sessions;

import Fb.c;
import Fb.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/a;", "", "", "sessionId", "LXH/N;", "b", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1182a f68860a = C1182a.f68861a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/a$a;", "", "<init>", "()V", "Lcom/google/firebase/sessions/a;", "a", "()Lcom/google/firebase/sessions/a;", "instance", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.a$a  reason: collision with other inner class name */
    public static final class C1182a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C1182a f68861a = new C1182a();

        private C1182a() {
        }

        public final a a() {
            Object j10 = m.a(c.f60398a).j(a.class);
            C17542s.i(j10, "Firebase.app[SessionDatastore::class.java]");
            return (a) j10;
        }
    }

    String a();

    void b(String str);
}
