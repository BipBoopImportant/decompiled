package K9;

import H9.C6530d;
import H9.C6539m;
import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: K9.h  reason: case insensitive filesystem */
public abstract class C6610h<T extends IInterface> extends C6604c<T> implements a.f {

    /* renamed from: F  reason: collision with root package name */
    private final C6607e f37864F;

    /* renamed from: G  reason: collision with root package name */
    private final Set f37865G;

    /* renamed from: H  reason: collision with root package name */
    private final Account f37866H;

    @Deprecated
    protected C6610h(Context context, Looper looper, int i10, C6607e eVar, g.a aVar, g.b bVar) {
        this(context, looper, i10, eVar, (C6530d) aVar, (C6539m) bVar);
    }

    private final Set l0(Set set) {
        Set<Scope> k02 = k0(set);
        for (Scope contains : k02) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return k02;
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> C() {
        return this.f37865G;
    }

    public Set<Scope> i() {
        return g() ? this.f37865G : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final C6607e j0() {
        return this.f37864F;
    }

    /* access modifiers changed from: protected */
    public Set<Scope> k0(Set<Scope> set) {
        return set;
    }

    public final Account u() {
        return this.f37866H;
    }

    /* access modifiers changed from: protected */
    public Executor w() {
        return null;
    }

    protected C6610h(Context context, Looper looper, int i10, C6607e eVar, C6530d dVar, C6539m mVar) {
        this(context, looper, C6611i.b(context), com.google.android.gms.common.a.n(), i10, eVar, (C6530d) C6620s.l(dVar), (C6539m) C6620s.l(mVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C6610h(android.content.Context r11, android.os.Looper r12, K9.C6611i r13, com.google.android.gms.common.a r14, int r15, K9.C6607e r16, H9.C6530d r17, H9.C6539m r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            K9.J r3 = new K9.J
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            K9.K r0 = new K9.K
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.j()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f37864F = r0
            android.accounts.Account r1 = r16.a()
            r9.f37866H = r1
            java.util.Set r0 = r16.d()
            java.util.Set r0 = r10.l0(r0)
            r9.f37865G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.C6610h.<init>(android.content.Context, android.os.Looper, K9.i, com.google.android.gms.common.a, int, K9.e, H9.d, H9.m):void");
    }
}
