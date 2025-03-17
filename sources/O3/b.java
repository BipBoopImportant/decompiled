package o3;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    private int f26755a;

    /* renamed from: b  reason: collision with root package name */
    private a<D> f26756b;

    /* renamed from: c  reason: collision with root package name */
    private Context f26757c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26758d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26759e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26760f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26761g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26762h = false;

    public interface a<D> {
        void a(b<D> bVar, D d10);
    }

    public b(Context context) {
        this.f26757c = context.getApplicationContext();
    }

    public void a() {
        this.f26759e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f26762h = false;
    }

    public String d(D d10) {
        StringBuilder sb2 = new StringBuilder(64);
        if (d10 == null) {
            sb2.append("null");
        } else {
            Class<?> cls = d10.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void e() {
    }

    public void f(D d10) {
        a<D> aVar = this.f26756b;
        if (aVar != null) {
            aVar.a(this, d10);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f26755a);
        printWriter.print(" mListener=");
        printWriter.println(this.f26756b);
        if (this.f26758d || this.f26761g || this.f26762h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f26758d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f26761g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f26762h);
        }
        if (this.f26759e || this.f26760f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f26759e);
            printWriter.print(" mReset=");
            printWriter.println(this.f26760f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f26759e;
    }

    public boolean j() {
        return this.f26758d;
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        throw null;
    }

    public void m() {
        if (this.f26758d) {
            h();
        } else {
            this.f26761g = true;
        }
    }

    /* access modifiers changed from: protected */
    public void n() {
    }

    /* access modifiers changed from: protected */
    public void o() {
    }

    /* access modifiers changed from: protected */
    public void p() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void q() {
    }

    public void r(int i10, a<D> aVar) {
        if (this.f26756b == null) {
            this.f26756b = aVar;
            this.f26755a = i10;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void s() {
        o();
        this.f26760f = true;
        this.f26758d = false;
        this.f26759e = false;
        this.f26761g = false;
        this.f26762h = false;
    }

    public void t() {
        if (this.f26762h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f26755a);
        sb2.append("}");
        return sb2.toString();
    }

    public final void u() {
        this.f26758d = true;
        this.f26760f = false;
        this.f26759e = false;
        p();
    }

    public void v() {
        this.f26758d = false;
        q();
    }

    public void w(a<D> aVar) {
        a<D> aVar2 = this.f26756b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.f26756b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
