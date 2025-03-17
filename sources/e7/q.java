package E7;

import C7.f;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class q extends Exception {

    /* renamed from: g  reason: collision with root package name */
    private static final StackTraceElement[] f35187g = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    private final List<Throwable> f35188a;

    /* renamed from: b  reason: collision with root package name */
    private f f35189b;

    /* renamed from: c  reason: collision with root package name */
    private C7.a f35190c;

    /* renamed from: d  reason: collision with root package name */
    private Class<?> f35191d;

    /* renamed from: e  reason: collision with root package name */
    private String f35192e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f35193f;

    public q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    private void a(Throwable th2, List<Throwable> list) {
        if (th2 instanceof q) {
            for (Throwable a10 : ((q) th2).e()) {
                a(a10, list);
            }
            return;
        }
        list.add(th2);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i10);
            if (th2 instanceof q) {
                ((q) th2).h(appendable);
            } else {
                d(th2, appendable);
            }
            i10 = i11;
        }
    }

    private static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.f35188a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f10 = f();
        int size = f10.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), f10.get(i10));
            i10 = i11;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f35192e);
        String str3 = "";
        if (this.f35191d != null) {
            str = ", " + this.f35191d;
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f35190c != null) {
            str2 = ", " + this.f35190c;
        } else {
            str2 = str3;
        }
        sb2.append(str2);
        if (this.f35189b != null) {
            str3 = ", " + this.f35189b;
        }
        sb2.append(str3);
        List<Throwable> f10 = f();
        if (f10.isEmpty()) {
            return sb2.toString();
        }
        if (f10.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(f10.size());
            sb2.append(" root causes:");
        }
        for (Throwable next : f10) {
            sb2.append(10);
            sb2.append(next.getClass().getName());
            sb2.append('(');
            sb2.append(next.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public void i(f fVar, C7.a aVar) {
        j(fVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    public void j(f fVar, C7.a aVar, Class<?> cls) {
        this.f35189b = fVar;
        this.f35190c = aVar;
        this.f35191d = cls;
    }

    public void k(Exception exc) {
        this.f35193f = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public q(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public q(String str, List<Throwable> list) {
        this.f35192e = str;
        setStackTrace(f35187g);
        this.f35188a = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    private static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f35194a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35195b = true;

        a(Appendable appendable) {
            this.f35194a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c10) {
            boolean z10 = false;
            if (this.f35195b) {
                this.f35195b = false;
                this.f35194a.append("  ");
            }
            if (c10 == 10) {
                z10 = true;
            }
            this.f35195b = z10;
            this.f35194a.append(c10);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a10 = a(charSequence);
            return append(a10, 0, a10.length());
        }

        public Appendable append(CharSequence charSequence, int i10, int i11) {
            CharSequence a10 = a(charSequence);
            boolean z10 = false;
            if (this.f35195b) {
                this.f35195b = false;
                this.f35194a.append("  ");
            }
            if (a10.length() > 0 && a10.charAt(i11 - 1) == 10) {
                z10 = true;
            }
            this.f35195b = z10;
            this.f35194a.append(a10, i10, i11);
            return this;
        }
    }
}
