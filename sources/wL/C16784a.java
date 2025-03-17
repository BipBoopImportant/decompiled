package WL;

import XH.C16807N;
import XH.C16814e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LWL/a;", "", "a", "b", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: WL.a  reason: case insensitive filesystem */
public final class C16784a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3428a f139719a = new C3428a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<b> f139720b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static volatile b[] f139721c = new b[0];

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"LWL/a$a;", "LWL/a$b;", "<init>", "()V", "", "message", "", "", "args", "LXH/N;", "a", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "priority", "tag", "", "t", "g", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "trees", "i", "([LWL/a$b;)V", "treeArray", "[LWL/a$b;", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: WL.a$a  reason: collision with other inner class name */
    public static final class C3428a extends b {
        public /* synthetic */ C3428a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public void a(String str, Object... objArr) {
            C17542s.j(objArr, "args");
            for (b a10 : C16784a.f139721c) {
                a10.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        /* access modifiers changed from: protected */
        public void g(int i10, String str, String str2, Throwable th2) {
            C17542s.j(str2, "message");
            throw new AssertionError();
        }

        public final void i(b... bVarArr) {
            boolean z10;
            C17542s.j(bVarArr, "trees");
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                b bVar = bVarArr[i10];
                i10++;
                if (bVar != null) {
                    if (bVar != this) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        throw new IllegalArgumentException("Cannot plant Timber into itself.");
                    }
                } else {
                    throw new IllegalArgumentException("trees contained null");
                }
            }
            synchronized (C16784a.f139720b) {
                Collections.addAll(C16784a.f139720b, Arrays.copyOf(bVarArr, bVarArr.length));
                Object[] array = C16784a.f139720b.toArray(new b[0]);
                if (array != null) {
                    C16784a.f139721c = (b[]) array;
                    C16807N n10 = C16807N.f139792a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }

        private C3428a() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\nH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001d8@X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\b8PX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LWL/a$b;", "", "<init>", "()V", "", "priority", "", "t", "", "message", "", "args", "LXH/N;", "h", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "c", "(Ljava/lang/Throwable;)Ljava/lang/String;", "a", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "e", "(I)Z", "tag", "f", "(Ljava/lang/String;I)Z", "b", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "g", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "getExplicitTag$timber_release", "()Ljava/lang/ThreadLocal;", "explicitTag", "d", "()Ljava/lang/String;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: WL.a$b */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadLocal<String> f139722a = new ThreadLocal<>();

        private final String c(Throwable th2) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            C17542s.i(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        private final void h(int i10, Throwable th2, String str, Object... objArr) {
            String d10 = d();
            if (f(d10, i10)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = b(str, objArr);
                    }
                    if (th2 != null) {
                        str = str + 10 + c(th2);
                    }
                } else if (th2 != null) {
                    str = c(th2);
                } else {
                    return;
                }
                g(i10, d10, str, th2);
            }
        }

        public void a(String str, Object... objArr) {
            C17542s.j(objArr, "args");
            h(3, (Throwable) null, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* access modifiers changed from: protected */
        public String b(String str, Object[] objArr) {
            C17542s.j(str, "message");
            C17542s.j(objArr, "args");
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            C17542s.i(format, "java.lang.String.format(this, *args)");
            return format;
        }

        public /* synthetic */ String d() {
            String str = this.f139722a.get();
            if (str != null) {
                this.f139722a.remove();
            }
            return str;
        }

        /* access modifiers changed from: protected */
        @C16814e
        public boolean e(int i10) {
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean f(String str, int i10) {
            return e(i10);
        }

        /* access modifiers changed from: protected */
        public abstract void g(int i10, String str, String str2, Throwable th2);
    }

    public static void d(String str, Object... objArr) {
        f139719a.a(str, objArr);
    }

    public static final void e(b... bVarArr) {
        f139719a.i(bVarArr);
    }
}
