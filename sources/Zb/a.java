package Zb;

public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f65061a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f65062b;

    /* renamed from: c  reason: collision with root package name */
    private final b f65063c;

    public a(int i10, d... dVarArr) {
        this.f65061a = i10;
        this.f65062b = dVarArr;
        this.f65063c = new b(i10);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f65061a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f65062b) {
            if (stackTraceElementArr2.length <= this.f65061a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f65061a ? this.f65063c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
