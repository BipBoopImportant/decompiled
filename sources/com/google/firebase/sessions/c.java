package com.google.firebase.sessions;

import Fb.m;
import HJ.C15854t;
import Mc.I;
import Mc.y;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8\u0006@BX.¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/c;", "", "LMc/I;", "timeProvider", "Lkotlin/Function0;", "Ljava/util/UUID;", "uuidGenerator", "<init>", "(LMc/I;LnI/a;)V", "", "b", "()Ljava/lang/String;", "LMc/y;", "a", "()LMc/y;", "LMc/I;", "LnI/a;", "c", "Ljava/lang/String;", "firstSessionId", "", "d", "I", "sessionIndex", "<set-?>", "e", "LMc/y;", "currentSession", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final b f68864f = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final I f68865a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<UUID> f68866b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68867c;

    /* renamed from: d  reason: collision with root package name */
    private int f68868d;

    /* renamed from: e  reason: collision with root package name */
    private y f68869e;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<UUID> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f68870a = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        /* renamed from: t */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/c$b;", "", "<init>", "()V", "Lcom/google/firebase/sessions/c;", "a", "()Lcom/google/firebase/sessions/c;", "instance", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            Object j10 = m.a(Fb.c.f60398a).j(c.class);
            C17542s.i(j10, "Firebase.app[SessionGenerator::class.java]");
            return (c) j10;
        }

        private b() {
        }
    }

    public c(I i10, C17631a<UUID> aVar) {
        C17542s.j(i10, "timeProvider");
        C17542s.j(aVar, "uuidGenerator");
        this.f68865a = i10;
        this.f68866b = aVar;
        this.f68867c = b();
        this.f68868d = -1;
    }

    private final String b() {
        String uuid = this.f68866b.invoke().toString();
        C17542s.i(uuid, "uuidGenerator().toString()");
        String lowerCase = C15854t.Q(uuid, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final y a() {
        int i10 = this.f68868d + 1;
        this.f68868d = i10;
        this.f68869e = new y(i10 == 0 ? this.f68867c : b(), this.f68867c, this.f68868d, this.f68865a.a());
        return c();
    }

    public final y c() {
        y yVar = this.f68869e;
        if (yVar != null) {
            return yVar;
        }
        C17542s.z("currentSession");
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(I i10, C17631a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? a.f68870a : aVar);
    }
}
