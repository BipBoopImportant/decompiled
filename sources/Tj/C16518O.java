package TJ;

import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;
import nI.q;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LTJ/O;", "LTJ/L;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "LTJ/P;", "", "subscriptionCount", "LTJ/g;", "LTJ/J;", "a", "(LTJ/P;)LTJ/g;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "J", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.O  reason: case insensitive filesystem */
final class C16518O implements C16515L {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f138582b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f138583c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "LTJ/J;", "", "count", "LXH/N;", "<anonymous>", "(LTJ/h;I)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    /* renamed from: TJ.O$a */
    static final class a extends l implements q<C16533h<? super C16513J>, Integer, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138584c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f138585d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ int f138586e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16518O f138587f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16518O o10, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f138587f = o10;
        }

        public final Object i(C16533h<? super C16513J> hVar, int i10, C17164e<? super C16807N> eVar) {
            a aVar = new a(this.f138587f, eVar);
            aVar.f138585d = hVar;
            aVar.f138586e = i10;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((C16533h) obj, ((Number) obj2).intValue(), (C17164e) obj3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f138584c
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x003c
                if (r1 == r6) goto L_0x0038
                if (r1 == r5) goto L_0x0030
                if (r1 == r4) goto L_0x0028
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                goto L_0x0038
            L_0x0018:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0020:
                java.lang.Object r1 = r9.f138585d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r10)
                goto L_0x008e
            L_0x0028:
                java.lang.Object r1 = r9.f138585d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r10)
                goto L_0x007d
            L_0x0030:
                java.lang.Object r1 = r9.f138585d
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r10)
                goto L_0x0064
            L_0x0038:
                XH.y.b(r10)
                goto L_0x009c
            L_0x003c:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f138585d
                r1 = r10
                TJ.h r1 = (TJ.C16533h) r1
                int r10 = r9.f138586e
                if (r10 <= 0) goto L_0x0053
                TJ.J r10 = TJ.C16513J.START
                r9.f138584c = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x0053:
                TJ.O r10 = r9.f138587f
                long r6 = r10.f138582b
                r9.f138585d = r1
                r9.f138584c = r5
                java.lang.Object r10 = QJ.C16297b0.b(r6, r9)
                if (r10 != r0) goto L_0x0064
                return r0
            L_0x0064:
                TJ.O r10 = r9.f138587f
                long r5 = r10.f138583c
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L_0x008e
                TJ.J r10 = TJ.C16513J.STOP
                r9.f138585d = r1
                r9.f138584c = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x007d
                return r0
            L_0x007d:
                TJ.O r10 = r9.f138587f
                long r4 = r10.f138583c
                r9.f138585d = r1
                r9.f138584c = r3
                java.lang.Object r10 = QJ.C16297b0.b(r4, r9)
                if (r10 != r0) goto L_0x008e
                return r0
            L_0x008e:
                TJ.J r10 = TJ.C16513J.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f138585d = r3
                r9.f138584c = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L_0x009c
                return r0
            L_0x009c:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16518O.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/J;", "it", "", "<anonymous>", "(LTJ/J;)Z"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    /* renamed from: TJ.O$b */
    static final class b extends l implements p<C16513J, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138588c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f138589d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f138589d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16513J j10, C17164e<? super Boolean> eVar) {
            return ((b) create(j10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f138588c == 0) {
                y.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(((C16513J) this.f138589d) != C16513J.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C16518O(long j10, long j11) {
        this.f138582b = j10;
        this.f138583c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        } else if (j11 < 0) {
            throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
        }
    }

    public C16532g<C16513J> a(C16519P<Integer> p10) {
        return C16534i.s(C16534i.v(C16534i.g0(p10, new a(this, (C17164e<? super a>) null)), new b((C17164e<? super b>) null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C16518O) {
            C16518O o10 = (C16518O) obj;
            return this.f138582b == o10.f138582b && this.f138583c == o10.f138583c;
        }
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f138582b) * 31) + Long.hashCode(this.f138583c);
    }

    public String toString() {
        List d10 = C16877v.d(2);
        if (this.f138582b > 0) {
            d10.add("stopTimeout=" + this.f138582b + "ms");
        }
        if (this.f138583c < Long.MAX_VALUE) {
            d10.add("replayExpiration=" + this.f138583c + "ms");
        }
        List a10 = C16877v.a(d10);
        return "SharingStarted.WhileSubscribed(" + C16877v.G0(a10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null) + ')';
    }
}
