package a9;

import D8.c;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.e5  reason: case insensitive filesystem */
public final class C6819e5 {

    /* renamed from: a  reason: collision with root package name */
    public static final C6947u6 f42528a = new C6947u6(1);

    /* renamed from: b  reason: collision with root package name */
    public static final c f42529b = new c("CPUThreadPool");

    public static void a(U4 u42) {
        boolean z10;
        C17542s.j(u42, "task");
        C6947u6 u6Var = f42528a;
        synchronized (u6Var) {
            C17542s.j(u42, "task");
            try {
                u6Var.f42890a.execute(u42);
                z10 = true;
            } catch (RejectedExecutionException e10) {
                u6Var.f42891b.g(e10, "addTask failed");
                z10 = false;
            }
        }
        if (!z10) {
            f42529b.h("the CPUThreadPool is full, a task was skipped");
        }
    }
}
