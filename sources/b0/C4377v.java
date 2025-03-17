package B0;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import nI.C17642l;
import y1.C6253a;
import y1.C6254b;
import y1.C6256d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Ly1/b;", "", "shortcutModifier", "LB0/u;", "a", "(LnI/l;)LB0/u;", "LB0/u;", "b", "()LB0/u;", "defaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.v  reason: case insensitive filesystem */
public final class C4377v {

    /* renamed from: a  reason: collision with root package name */
    private static final C4376u f5142a = new c(a(b.f5144b));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"B0/v$a", "LB0/u;", "Ly1/b;", "event", "LB0/s;", "a", "(Landroid/view/KeyEvent;)LB0/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.v$a */
    public static final class a implements C4376u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C6254b, Boolean> f5143a;

        a(C17642l<? super C6254b, Boolean> lVar) {
            this.f5143a = lVar;
        }

        public C4374s a(KeyEvent keyEvent) {
            if (!this.f5143a.invoke(C6254b.a(keyEvent)).booleanValue() || !C6256d.g(keyEvent)) {
                if (this.f5143a.invoke(C6254b.a(keyEvent)).booleanValue()) {
                    long a10 = C6256d.a(keyEvent);
                    F f10 = F.f4544a;
                    if (C6253a.t(a10, f10.d()) ? true : C6253a.t(a10, f10.n())) {
                        return C4374s.COPY;
                    }
                    if (C6253a.t(a10, f10.u())) {
                        return C4374s.PASTE;
                    }
                    if (C6253a.t(a10, f10.v())) {
                        return C4374s.CUT;
                    }
                    if (C6253a.t(a10, f10.a())) {
                        return C4374s.SELECT_ALL;
                    }
                    if (C6253a.t(a10, f10.w())) {
                        return C4374s.REDO;
                    }
                    if (C6253a.t(a10, f10.x())) {
                        return C4374s.UNDO;
                    }
                    return null;
                } else if (C6256d.e(keyEvent)) {
                    return null;
                } else {
                    if (C6256d.g(keyEvent)) {
                        long a11 = C6256d.a(keyEvent);
                        F f11 = F.f4544a;
                        if (C6253a.t(a11, f11.i())) {
                            return C4374s.SELECT_LEFT_CHAR;
                        }
                        if (C6253a.t(a11, f11.j())) {
                            return C4374s.SELECT_RIGHT_CHAR;
                        }
                        if (C6253a.t(a11, f11.k())) {
                            return C4374s.SELECT_UP;
                        }
                        if (C6253a.t(a11, f11.h())) {
                            return C4374s.SELECT_DOWN;
                        }
                        if (C6253a.t(a11, f11.r())) {
                            return C4374s.SELECT_PAGE_UP;
                        }
                        if (C6253a.t(a11, f11.q())) {
                            return C4374s.SELECT_PAGE_DOWN;
                        }
                        if (C6253a.t(a11, f11.p())) {
                            return C4374s.SELECT_LINE_START;
                        }
                        if (C6253a.t(a11, f11.o())) {
                            return C4374s.SELECT_LINE_END;
                        }
                        if (C6253a.t(a11, f11.n())) {
                            return C4374s.PASTE;
                        }
                        return null;
                    }
                    long a12 = C6256d.a(keyEvent);
                    F f12 = F.f4544a;
                    if (C6253a.t(a12, f12.i())) {
                        return C4374s.LEFT_CHAR;
                    }
                    if (C6253a.t(a12, f12.j())) {
                        return C4374s.RIGHT_CHAR;
                    }
                    if (C6253a.t(a12, f12.k())) {
                        return C4374s.UP;
                    }
                    if (C6253a.t(a12, f12.h())) {
                        return C4374s.DOWN;
                    }
                    if (C6253a.t(a12, f12.r())) {
                        return C4374s.PAGE_UP;
                    }
                    if (C6253a.t(a12, f12.q())) {
                        return C4374s.PAGE_DOWN;
                    }
                    if (C6253a.t(a12, f12.p())) {
                        return C4374s.LINE_START;
                    }
                    if (C6253a.t(a12, f12.o())) {
                        return C4374s.LINE_END;
                    }
                    if (C6253a.t(a12, f12.l())) {
                        return C4374s.NEW_LINE;
                    }
                    if (C6253a.t(a12, f12.c())) {
                        return C4374s.DELETE_PREV_CHAR;
                    }
                    if (C6253a.t(a12, f12.g())) {
                        return C4374s.DELETE_NEXT_CHAR;
                    }
                    if (C6253a.t(a12, f12.s())) {
                        return C4374s.PASTE;
                    }
                    if (C6253a.t(a12, f12.f())) {
                        return C4374s.CUT;
                    }
                    if (C6253a.t(a12, f12.e())) {
                        return C4374s.COPY;
                    }
                    if (C6253a.t(a12, f12.t())) {
                        return C4374s.TAB;
                    }
                    return null;
                }
            } else if (C6253a.t(C6256d.a(keyEvent), F.f4544a.x())) {
                return C4374s.REDO;
            } else {
                return null;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.v$b */
    /* synthetic */ class b extends G {

        /* renamed from: b  reason: collision with root package name */
        public static final b f5144b = new b();

        b() {
            super(C6256d.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
        }

        public Object get(Object obj) {
            return Boolean.valueOf(C6256d.e(((C6254b) obj).f()));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"B0/v$c", "LB0/u;", "Ly1/b;", "event", "LB0/s;", "a", "(Landroid/view/KeyEvent;)LB0/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.v$c */
    public static final class c implements C4376u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4376u f5145a;

        c(C4376u uVar) {
            this.f5145a = uVar;
        }

        public C4374s a(KeyEvent keyEvent) {
            C4374s sVar = null;
            if (C6256d.g(keyEvent) && C6256d.e(keyEvent)) {
                long a10 = C6256d.a(keyEvent);
                F f10 = F.f4544a;
                if (C6253a.t(a10, f10.i())) {
                    sVar = C4374s.SELECT_LEFT_WORD;
                } else if (C6253a.t(a10, f10.j())) {
                    sVar = C4374s.SELECT_RIGHT_WORD;
                } else if (C6253a.t(a10, f10.k())) {
                    sVar = C4374s.SELECT_PREV_PARAGRAPH;
                } else if (C6253a.t(a10, f10.h())) {
                    sVar = C4374s.SELECT_NEXT_PARAGRAPH;
                }
            } else if (C6256d.e(keyEvent)) {
                long a11 = C6256d.a(keyEvent);
                F f11 = F.f4544a;
                if (C6253a.t(a11, f11.i())) {
                    sVar = C4374s.LEFT_WORD;
                } else if (C6253a.t(a11, f11.j())) {
                    sVar = C4374s.RIGHT_WORD;
                } else if (C6253a.t(a11, f11.k())) {
                    sVar = C4374s.PREV_PARAGRAPH;
                } else if (C6253a.t(a11, f11.h())) {
                    sVar = C4374s.NEXT_PARAGRAPH;
                } else if (C6253a.t(a11, f11.m())) {
                    sVar = C4374s.DELETE_PREV_CHAR;
                } else if (C6253a.t(a11, f11.g())) {
                    sVar = C4374s.DELETE_NEXT_WORD;
                } else if (C6253a.t(a11, f11.c())) {
                    sVar = C4374s.DELETE_PREV_WORD;
                } else if (C6253a.t(a11, f11.b())) {
                    sVar = C4374s.DESELECT;
                }
            } else if (C6256d.g(keyEvent)) {
                long a12 = C6256d.a(keyEvent);
                F f12 = F.f4544a;
                if (C6253a.t(a12, f12.p())) {
                    sVar = C4374s.SELECT_LINE_LEFT;
                } else if (C6253a.t(a12, f12.o())) {
                    sVar = C4374s.SELECT_LINE_RIGHT;
                }
            } else if (C6256d.d(keyEvent)) {
                long a13 = C6256d.a(keyEvent);
                F f13 = F.f4544a;
                if (C6253a.t(a13, f13.c())) {
                    sVar = C4374s.DELETE_FROM_LINE_START;
                } else if (C6253a.t(a13, f13.g())) {
                    sVar = C4374s.DELETE_TO_LINE_END;
                }
            }
            return sVar == null ? this.f5145a.a(keyEvent) : sVar;
        }
    }

    public static final C4376u a(C17642l<? super C6254b, Boolean> lVar) {
        return new a(lVar);
    }

    public static final C4376u b() {
        return f5142a;
    }
}
