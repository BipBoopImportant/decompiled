package Ww;

import U0.C4899r0;
import U0.o1;
import Ww.r;
import android.app.Activity;
import g.C5314c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118V@VX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R/\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001a8V@VX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0013\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010+\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020'8@@@X\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b \u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"LWw/k;", "LWw/r;", "Landroid/app/Activity;", "activity", "", "permission", "<init>", "(Landroid/app/Activity;Ljava/lang/String;)V", "LXH/N;", "b", "()V", "f", "a", "Landroid/app/Activity;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LWw/r$a;", "<set-?>", "c", "LU0/r0;", "i", "()LWw/r$a;", "k", "(LWw/r$a;)V", "status", "LWw/r$b;", "()LWw/r$b;", "h", "(LWw/r$b;)V", "requestResult", "Lg/c;", "e", "Lg/c;", "getLauncher$permissions_release", "()Lg/c;", "g", "(Lg/c;)V", "launcher", "", "()Z", "j", "(Z)V", "showRationaleBeforeCall", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements r {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f117702a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117703b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f117704c;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f117705d = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private C5314c<String> f117706e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f117707f = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);

    public k(Activity activity, String str) {
        C17542s.j(activity, "activity");
        C17542s.j(str, "permission");
        this.f117702a = activity;
        this.f117703b = str;
        this.f117704c = u1.e(q.b(activity, d()), (o1) null, 2, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [Ww.r$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r3 = this;
            r0 = 0
            r3.h(r0)
            Ww.r$a r1 = r3.i()
            boolean r2 = r1 instanceof Ww.r.a.C2905a
            if (r2 == 0) goto L_0x000f
            r0 = r1
            Ww.r$a$a r0 = (Ww.r.a.C2905a) r0
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.a()
            r2 = 1
            if (r0 != r2) goto L_0x001a
            r1 = r2
        L_0x001a:
            r3.j(r1)
            g.c<java.lang.String> r0 = r3.f117706e
            if (r0 == 0) goto L_0x0028
            java.lang.String r1 = r3.d()
            r0.a(r1)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ww.k.b():void");
    }

    public r.b c() {
        return (r.b) this.f117705d.getValue();
    }

    public String d() {
        return this.f117703b;
    }

    public final boolean e() {
        return ((Boolean) this.f117707f.getValue()).booleanValue();
    }

    public final void f() {
        k(q.b(this.f117702a, d()));
    }

    public final void g(C5314c<String> cVar) {
        this.f117706e = cVar;
    }

    public void h(r.b bVar) {
        this.f117705d.setValue(bVar);
    }

    public r.a i() {
        return (r.a) this.f117704c.getValue();
    }

    public final void j(boolean z10) {
        this.f117707f.setValue(Boolean.valueOf(z10));
    }

    public void k(r.a aVar) {
        C17542s.j(aVar, "<set-?>");
        this.f117704c.setValue(aVar);
    }
}
