package A1;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u00020\u00148\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0019\u001a\u00020\u00178\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\fR0\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@@X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8@X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LA1/p;", "", "", "LA1/B;", "changes", "LA1/h;", "internalPointerEvent", "<init>", "(Ljava/util/List;LA1/h;)V", "(Ljava/util/List;)V", "LA1/t;", "a", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "LA1/h;", "d", "()LA1/h;", "LA1/o;", "I", "buttons", "LA1/O;", "e", "keyboardModifiers", "<set-?>", "g", "h", "(I)V", "type", "Landroid/view/MotionEvent;", "f", "()Landroid/view/MotionEvent;", "motionEvent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.p  reason: case insensitive filesystem */
public final class C4349p {

    /* renamed from: a  reason: collision with root package name */
    private final List<B> f4426a;

    /* renamed from: b  reason: collision with root package name */
    private final C4341h f4427b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4428c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4429d;

    /* renamed from: e  reason: collision with root package name */
    private int f4430e;

    public C4349p(List<B> list, C4341h hVar) {
        this.f4426a = list;
        this.f4427b = hVar;
        MotionEvent f10 = f();
        int i10 = 0;
        this.f4428c = C4348o.a(f10 != null ? f10.getButtonState() : 0);
        MotionEvent f11 = f();
        this.f4429d = O.b(f11 != null ? f11.getMetaState() : i10);
        this.f4430e = a();
    }

    private final int a() {
        MotionEvent f10 = f();
        if (f10 != null) {
            int actionMasked = f10.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return C4352t.f4431a.f();
                            case 9:
                                return C4352t.f4431a.a();
                            case 10:
                                return C4352t.f4431a.b();
                            default:
                                return C4352t.f4431a.g();
                        }
                    }
                    return C4352t.f4431a.c();
                }
                return C4352t.f4431a.e();
            }
            return C4352t.f4431a.d();
        }
        List<B> list = this.f4426a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            B b10 = list.get(i10);
            if (C4350q.d(b10)) {
                return C4352t.f4431a.e();
            }
            if (C4350q.b(b10)) {
                return C4352t.f4431a.d();
            }
        }
        return C4352t.f4431a.c();
    }

    public final int b() {
        return this.f4428c;
    }

    public final List<B> c() {
        return this.f4426a;
    }

    public final C4341h d() {
        return this.f4427b;
    }

    public final int e() {
        return this.f4429d;
    }

    public final MotionEvent f() {
        C4341h hVar = this.f4427b;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public final int g() {
        return this.f4430e;
    }

    public final void h(int i10) {
        this.f4430e = i10;
    }

    public C4349p(List<B> list) {
        this(list, (C4341h) null);
    }
}
