package Zb;

import java.util.Stack;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f65066a;

    /* renamed from: b  reason: collision with root package name */
    public final String f65067b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f65068c;

    /* renamed from: d  reason: collision with root package name */
    public final e f65069d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f65066a = str;
        this.f65067b = str2;
        this.f65068c = stackTraceElementArr;
        this.f65069d = eVar;
    }

    public static e a(Throwable th2, d dVar) {
        Stack stack = new Stack();
        while (th2 != null) {
            stack.push(th2);
            th2 = th2.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            eVar = new e(th3.getLocalizedMessage(), th3.getClass().getName(), dVar.a(th3.getStackTrace()), eVar);
        }
        return eVar;
    }
}
