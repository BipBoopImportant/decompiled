package D4;

import D4.C6447v;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"LD4/C;", "", "<init>", "()V", "LD4/w;", "d", "()LD4/w;", "LD4/x;", "loadType", "LD4/v;", "a", "(LD4/x;)LD4/v;", "type", "state", "LXH/N;", "c", "(LD4/x;LD4/v;)V", "states", "b", "(LD4/w;)V", "LD4/v;", "getRefresh", "()LD4/v;", "setRefresh", "(LD4/v;)V", "refresh", "getPrepend", "setPrepend", "prepend", "getAppend", "setAppend", "append", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    private C6447v f33861a;

    /* renamed from: b  reason: collision with root package name */
    private C6447v f33862b;

    /* renamed from: c  reason: collision with root package name */
    private C6447v f33863c;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33864a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                D4.x[] r0 = D4.C6449x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D4.x r1 = D4.C6449x.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D4.x r1 = D4.C6449x.APPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D4.x r1 = D4.C6449x.PREPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f33864a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.C.a.<clinit>():void");
        }
    }

    public C() {
        C6447v.c.a aVar = C6447v.c.f34457b;
        this.f33861a = aVar.b();
        this.f33862b = aVar.b();
        this.f33863c = aVar.b();
    }

    public final C6447v a(C6449x xVar) {
        C17542s.j(xVar, "loadType");
        int i10 = a.f33864a[xVar.ordinal()];
        if (i10 == 1) {
            return this.f33861a;
        }
        if (i10 == 2) {
            return this.f33863c;
        }
        if (i10 == 3) {
            return this.f33862b;
        }
        throw new t();
    }

    public final void b(C6448w wVar) {
        C17542s.j(wVar, "states");
        this.f33861a = wVar.f();
        this.f33863c = wVar.d();
        this.f33862b = wVar.e();
    }

    public final void c(C6449x xVar, C6447v vVar) {
        C17542s.j(xVar, "type");
        C17542s.j(vVar, "state");
        int i10 = a.f33864a[xVar.ordinal()];
        if (i10 == 1) {
            this.f33861a = vVar;
        } else if (i10 == 2) {
            this.f33863c = vVar;
        } else if (i10 == 3) {
            this.f33862b = vVar;
        } else {
            throw new t();
        }
    }

    public final C6448w d() {
        return new C6448w(this.f33861a, this.f33862b, this.f33863c);
    }
}
