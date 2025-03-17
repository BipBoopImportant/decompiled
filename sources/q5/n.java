package q5;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o5.C8603d;
import u5.C8878b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lq5/n;", "", "Landroid/content/Context;", "context", "Lu5/b;", "taskExecutor", "Lq5/h;", "", "batteryChargingTracker", "Lq5/c;", "batteryNotLowTracker", "Lo5/d;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Lu5/b;Lq5/h;Lq5/c;Lq5/h;Lq5/h;)V", "a", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Lq5/h;", "()Lq5/h;", "Lq5/c;", "()Lq5/c;", "d", "e", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55533a;

    /* renamed from: b  reason: collision with root package name */
    private final h<Boolean> f55534b;

    /* renamed from: c  reason: collision with root package name */
    private final c f55535c;

    /* renamed from: d  reason: collision with root package name */
    private final h<C8603d> f55536d;

    /* renamed from: e  reason: collision with root package name */
    private final h<Boolean> f55537e;

    public n(Context context, C8878b bVar, h<Boolean> hVar, c cVar, h<C8603d> hVar2, h<Boolean> hVar3) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "taskExecutor");
        C17542s.j(hVar, "batteryChargingTracker");
        C17542s.j(cVar, "batteryNotLowTracker");
        C17542s.j(hVar2, "networkStateTracker");
        C17542s.j(hVar3, "storageNotLowTracker");
        this.f55533a = context;
        this.f55534b = hVar;
        this.f55535c = cVar;
        this.f55536d = hVar2;
        this.f55537e = hVar3;
    }

    public final h<Boolean> a() {
        return this.f55534b;
    }

    public final c b() {
        return this.f55535c;
    }

    public final Context c() {
        return this.f55533a;
    }

    public final h<C8603d> d() {
        return this.f55536d;
    }

    public final h<Boolean> e() {
        return this.f55537e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(android.content.Context r8, u5.C8878b r9, q5.h r10, q5.c r11, q5.h r12, q5.h r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L_0x0014
            q5.a r0 = new q5.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.C17542s.i(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L_0x0015
        L_0x0014:
            r3 = r10
        L_0x0015:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0027
            q5.c r0 = new q5.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.C17542s.i(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0039
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.C17542s.i(r0, r1)
            q5.h r0 = q5.k.a(r0, r9)
            r5 = r0
            goto L_0x003a
        L_0x0039:
            r5 = r12
        L_0x003a:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x004c
            q5.l r0 = new q5.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.C17542s.i(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L_0x004d
        L_0x004c:
            r6 = r13
        L_0x004d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.n.<init>(android.content.Context, u5.b, q5.h, q5.c, q5.h, q5.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
