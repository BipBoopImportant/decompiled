package a9;

import a9.C6947u6;
import java.util.concurrent.ThreadFactory;

/* renamed from: a9.t6  reason: case insensitive filesystem */
public final /* synthetic */ class C6939t6 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f42877a;

    public /* synthetic */ C6939t6(String str) {
        this.f42877a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return C6947u6.a.a(this.f42877a, runnable);
    }
}
