package d5;

import XH.t;
import YH.C16870n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ld5/f;", "", "T", "Ld5/h;", "value", "", "tag", "message", "Ld5/g;", "logger", "Ld5/j;", "verificationMode", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ld5/g;Ld5/j;)V", "Lkotlin/Function1;", "", "condition", "c", "(Ljava/lang/String;LnI/l;)Ld5/h;", "a", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getValue", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "d", "getMessage", "e", "Ld5/g;", "getLogger", "()Ld5/g;", "f", "Ld5/j;", "getVerificationMode", "()Ld5/j;", "Ld5/l;", "g", "Ld5/l;", "getException", "()Ld5/l;", "exception", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f50738b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50739c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50740d;

    /* renamed from: e  reason: collision with root package name */
    private final g f50741e;

    /* renamed from: f  reason: collision with root package name */
    private final j f50742f;

    /* renamed from: g  reason: collision with root package name */
    private final l f50743g;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f50744a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                d5.j[] r0 = d5.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                d5.j r1 = d5.j.STRICT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                d5.j r1 = d5.j.LOG     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                d5.j r1 = d5.j.QUIET     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f50744a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d5.f.a.<clinit>():void");
        }
    }

    public f(T t10, String str, String str2, g gVar, j jVar) {
        C17542s.j(t10, "value");
        C17542s.j(str, "tag");
        C17542s.j(str2, "message");
        C17542s.j(gVar, "logger");
        C17542s.j(jVar, "verificationMode");
        this.f50738b = t10;
        this.f50739c = str;
        this.f50740d = str2;
        this.f50741e = gVar;
        this.f50742f = jVar;
        l lVar = new l(b(t10, str2));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        C17542s.i(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) C16870n.c0(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f50743g = lVar;
    }

    public T a() {
        int i10 = a.f50744a[this.f50742f.ordinal()];
        if (i10 == 1) {
            throw this.f50743g;
        } else if (i10 == 2) {
            this.f50741e.a(this.f50739c, b(this.f50738b, this.f50740d));
            return null;
        } else if (i10 == 3) {
            return null;
        } else {
            throw new t();
        }
    }

    public h<T> c(String str, C17642l<? super T, Boolean> lVar) {
        C17542s.j(str, "message");
        C17542s.j(lVar, "condition");
        return this;
    }
}
