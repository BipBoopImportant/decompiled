package cI;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "LXH/N;", "block", "Ljava/lang/Thread;", "a", "(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILnI/a;)Ljava/lang/Thread;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cI.a  reason: case insensitive filesystem */
public final class C17063a {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"cI/a$a", "Ljava/lang/Thread;", "LXH/N;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cI.a$a  reason: collision with other inner class name */
    public static final class C3461a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f141232a;

        C3461a(C17631a<C16807N> aVar) {
            this.f141232a = aVar;
        }

        public void run() {
            this.f141232a.invoke();
        }
    }

    public static final Thread a(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, C17631a<C16807N> aVar) {
        C17542s.j(aVar, "block");
        C3461a aVar2 = new C3461a(aVar);
        if (z11) {
            aVar2.setDaemon(true);
        }
        if (i10 > 0) {
            aVar2.setPriority(i10);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z10) {
            aVar2.start();
        }
        return aVar2;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, C17631a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        ClassLoader classLoader2 = (i11 & 4) != 0 ? null : classLoader;
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        return a(z12, z13, classLoader2, str2, i10, aVar);
    }
}
