package ns;

import Gs.b;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import js.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import ls.C11565a;
import ms.C11593a;
import os.C11715b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fHB¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lns/b;", "Los/b;", "Ljs/c;", "communicationPostRemoteSource", "Lms/a;", "notificationFeature", "LGs/b;", "inboxRepository", "Lls/a;", "communicationPostToInboxMessageMapper", "<init>", "(Ljs/c;Lms/a;LGs/b;Lls/a;)V", "LXH/x;", "", "LPs/d;", "invoke-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "invoke", "a", "Ljs/c;", "b", "Lms/a;", "c", "LGs/b;", "d", "Lls/a;", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ns.b  reason: case insensitive filesystem */
public final class C11673b implements C11715b {

    /* renamed from: a  reason: collision with root package name */
    private final c f100077a;

    /* renamed from: b  reason: collision with root package name */
    private final C11593a f100078b;

    /* renamed from: c  reason: collision with root package name */
    private final b f100079c;

    /* renamed from: d  reason: collision with root package name */
    private final C11565a f100080d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.communicationpost.impl.usecase.SyncCommunicationPostsToInboxUseCaseImpl", f = "SyncCommunicationPostsToInboxUseCaseImpl.kt", l = {26, 34}, m = "invoke-IoAF18A")
    /* renamed from: ns.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f100081c;

        /* renamed from: d  reason: collision with root package name */
        Object f100082d;

        /* renamed from: e  reason: collision with root package name */
        Object f100083e;

        /* renamed from: f  reason: collision with root package name */
        Object f100084f;

        /* renamed from: g  reason: collision with root package name */
        Object f100085g;

        /* renamed from: h  reason: collision with root package name */
        Object f100086h;

        /* renamed from: i  reason: collision with root package name */
        Object f100087i;

        /* renamed from: j  reason: collision with root package name */
        Object f100088j;

        /* renamed from: k  reason: collision with root package name */
        Object f100089k;

        /* renamed from: l  reason: collision with root package name */
        int f100090l;

        /* renamed from: m  reason: collision with root package name */
        int f100091m;

        /* renamed from: n  reason: collision with root package name */
        int f100092n;

        /* renamed from: o  reason: collision with root package name */
        int f100093o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f100094p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C11673b f100095q;

        /* renamed from: r  reason: collision with root package name */
        int f100096r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11673b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f100095q = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f100094p = obj;
            this.f100096r |= Integer.MIN_VALUE;
            Object r22 = this.f100095q.m11invokeIoAF18A(this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public C11673b(c cVar, C11593a aVar, b bVar, C11565a aVar2) {
        C17542s.j(cVar, "communicationPostRemoteSource");
        C17542s.j(aVar, "notificationFeature");
        C17542s.j(bVar, "inboxRepository");
        C17542s.j(aVar2, "communicationPostToInboxMessageMapper");
        this.f100077a = cVar;
        this.f100078b = aVar;
        this.f100079c = bVar;
        this.f100080d = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6 A[Catch:{ CancellationException -> 0x0061, all -> 0x005e }, LOOP:0: B:29:0x00c0->B:31:0x00c6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0111 A[Catch:{ CancellationException -> 0x0061, all -> 0x005e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m11invokeIoAF18A(dI.C17164e<? super XH.x<? extends java.util.List<Ps.d>>> r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof ns.C11673b.a
            if (r2 == 0) goto L_0x0018
            r2 = r0
            ns.b$a r2 = (ns.C11673b.a) r2
            int r3 = r2.f100096r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f100096r = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            ns.b$a r2 = new ns.b$a
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r8.f100094p
            java.lang.Object r9 = eI.C17187b.f()
            int r3 = r8.f100096r
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x008d
            if (r3 == r5) goto L_0x006c
            if (r3 != r4) goto L_0x0064
            java.lang.Object r0 = r8.f100089k
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r8.f100088j
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r8.f100087i
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r0 = r8.f100086h
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r8.f100085g
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r8.f100084f
            ns.b r0 = (ns.C11673b) r0
            java.lang.Object r0 = r8.f100083e
            ns.b r0 = (ns.C11673b) r0
            java.lang.Object r0 = r8.f100082d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r8.f100081c
            ns.b r0 = (ns.C11673b) r0
            XH.y.b(r2)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            XH.x r2 = (XH.x) r2     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.lang.Object r0 = r2.j()     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            goto L_0x0112
        L_0x005e:
            r0 = move-exception
            goto L_0x011c
        L_0x0061:
            r0 = move-exception
            goto L_0x0127
        L_0x0064:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006c:
            int r0 = r8.f100091m
            int r3 = r8.f100090l
            java.lang.Object r5 = r8.f100084f
            ns.b r5 = (ns.C11673b) r5
            java.lang.Object r7 = r8.f100083e
            ns.b r7 = (ns.C11673b) r7
            java.lang.Object r10 = r8.f100082d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r8.f100081c
            ns.b r11 = (ns.C11673b) r11
            XH.y.b(r2)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r16 = r2
            r2 = r0
            r0 = r10
            r10 = r7
            r7 = r5
            r5 = r3
            r3 = r16
            goto L_0x00af
        L_0x008d:
            XH.y.b(r2)
            XH.x$a r2 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            js.c r2 = r1.f100077a     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100081c = r1     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100082d = r0     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100083e = r1     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100084f = r1     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100090l = r6     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100091m = r6     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100096r = r5     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.lang.Object r2 = r2.a(r8)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            if (r2 != r9) goto L_0x00a9
            return r9
        L_0x00a9:
            r7 = r1
            r10 = r7
            r11 = r10
            r3 = r2
            r2 = r6
            r5 = r2
        L_0x00af:
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r13 = 10
            int r13 = YH.C16877v.y(r3, r13)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r12.<init>(r13)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
        L_0x00c0:
            boolean r14 = r13.hasNext()     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            if (r14 == 0) goto L_0x00e2
            java.lang.Object r14 = r13.next()     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            js.a r14 = (js.C11451a) r14     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            ls.a r15 = r7.f100080d     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            ms.a r4 = r7.f100078b     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.lang.String r6 = r14.c()     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.util.Map r4 = r4.j(r6)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            Ps.c r4 = r15.a(r14, r4)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r12.add(r4)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r4 = 2
            r6 = 0
            goto L_0x00c0
        L_0x00e2:
            Gs.b r4 = r7.f100079c     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            ms.a r6 = r7.f100078b     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            Ps.a r14 = Ps.a.Other     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100081c = r11     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100082d = r0     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100083e = r10     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100084f = r7     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100085g = r3     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100086h = r3     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100087i = r12     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100088j = r13     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100089k = r12     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100090l = r5     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100091m = r2     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r0 = 0
            r8.f100092n = r0     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r8.f100093o = r0     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r0 = 2
            r8.f100096r = r0     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            r7 = 1
            r3 = r4
            r4 = r6
            r5 = r12
            r6 = r14
            java.lang.Object r0 = r3.e(r4, r5, r6, r7, r8)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            if (r0 != r9) goto L_0x0112
            return r9
        L_0x0112:
            XH.y.b(r0)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.util.List r0 = (java.util.List) r0     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0061, all -> 0x005e }
            goto L_0x0126
        L_0x011c:
            XH.x$a r2 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0126:
            return r0
        L_0x0127:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.C11673b.m11invokeIoAF18A(dI.e):java.lang.Object");
    }
}
