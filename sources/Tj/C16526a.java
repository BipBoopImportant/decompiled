package TJ;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LTJ/a;", "T", "LTJ/g;", "", "<init>", "()V", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "g", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.a  reason: case insensitive filesystem */
public abstract class C16526a<T> implements C16532g<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    /* renamed from: TJ.a$a  reason: collision with other inner class name */
    static final class C3385a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f138616c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f138617d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16526a<T> f138618e;

        /* renamed from: f  reason: collision with root package name */
        int f138619f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3385a(C16526a<T> aVar, C17164e<? super C3385a> eVar) {
            super(eVar);
            this.f138618e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138617d = obj;
            this.f138619f |= Integer.MIN_VALUE;
            return this.f138618e.collect((C16533h) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(TJ.C16533h<? super T> r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof TJ.C16526a.C3385a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            TJ.a$a r0 = (TJ.C16526a.C3385a) r0
            int r1 = r0.f138619f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138619f = r1
            goto L_0x0018
        L_0x0013:
            TJ.a$a r0 = new TJ.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f138617d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138619f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f138616c
            UJ.v r6 = (UJ.C16629v) r6
            XH.y.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            XH.y.b(r7)
            UJ.v r7 = new UJ.v
            dI.i r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f138616c = r7     // Catch:{ all -> 0x0055 }
            r0.f138619f = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.g(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16526a.collect(TJ.h, dI.e):java.lang.Object");
    }

    public abstract Object g(C16533h<? super T> hVar, C17164e<? super C16807N> eVar);
}
