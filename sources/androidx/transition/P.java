package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C7026l;

public abstract class P extends C7026l {

    /* renamed from: R  reason: collision with root package name */
    private static final String[] f44612R = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: Q  reason: collision with root package name */
    private int f44613Q = 3;

    private static class a extends AnimatorListenerAdapter implements C7026l.h {

        /* renamed from: a  reason: collision with root package name */
        private final View f44614a;

        /* renamed from: b  reason: collision with root package name */
        private final int f44615b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f44616c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f44617d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f44618e;

        /* renamed from: f  reason: collision with root package name */
        boolean f44619f = false;

        a(View view, int i10, boolean z10) {
            this.f44614a = view;
            this.f44615b = i10;
            this.f44616c = (ViewGroup) view.getParent();
            this.f44617d = z10;
            b(true);
        }

        private void a() {
            if (!this.f44619f) {
                D.f(this.f44614a, this.f44615b);
                ViewGroup viewGroup = this.f44616c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        private void b(boolean z10) {
            ViewGroup viewGroup;
            if (this.f44617d && this.f44618e != z10 && (viewGroup = this.f44616c) != null) {
                this.f44618e = z10;
                C.b(viewGroup, z10);
            }
        }

        public void d(C7026l lVar) {
            b(true);
            if (!this.f44619f) {
                D.f(this.f44614a, 0);
            }
        }

        public void e(C7026l lVar) {
        }

        public void g(C7026l lVar) {
            b(false);
            if (!this.f44619f) {
                D.f(this.f44614a, this.f44615b);
            }
        }

        public void j(C7026l lVar) {
            lVar.k0(this);
        }

        public void l(C7026l lVar) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f44619f = true;
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationEnd(Animator animator, boolean z10) {
            if (!z10) {
                a();
            }
        }

        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                D.f(this.f44614a, 0);
                ViewGroup viewGroup = this.f44616c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements C7026l.h {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f44620a;

        /* renamed from: b  reason: collision with root package name */
        private final View f44621b;

        /* renamed from: c  reason: collision with root package name */
        private final View f44622c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f44623d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f44620a = viewGroup;
            this.f44621b = view;
            this.f44622c = view2;
        }

        private void a() {
            this.f44622c.setTag(C7021g.f44670a, (Object) null);
            this.f44620a.getOverlay().remove(this.f44621b);
            this.f44623d = false;
        }

        public void d(C7026l lVar) {
        }

        public void e(C7026l lVar) {
        }

        public void g(C7026l lVar) {
        }

        public void j(C7026l lVar) {
            lVar.k0(this);
        }

        public void l(C7026l lVar) {
            if (this.f44623d) {
                a();
            }
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        public void onAnimationPause(Animator animator) {
            this.f44620a.getOverlay().remove(this.f44621b);
        }

        public void onAnimationResume(Animator animator) {
            if (this.f44621b.getParent() == null) {
                this.f44620a.getOverlay().add(this.f44621b);
            } else {
                P.this.cancel();
            }
        }

        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f44622c.setTag(C7021g.f44670a, this.f44621b);
                this.f44620a.getOverlay().add(this.f44621b);
                this.f44623d = true;
            }
        }

        public void onAnimationEnd(Animator animator, boolean z10) {
            if (!z10) {
                a();
            }
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f44625a;

        /* renamed from: b  reason: collision with root package name */
        boolean f44626b;

        /* renamed from: c  reason: collision with root package name */
        int f44627c;

        /* renamed from: d  reason: collision with root package name */
        int f44628d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f44629e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f44630f;

        c() {
        }
    }

    private c A0(y yVar, y yVar2) {
        c cVar = new c();
        cVar.f44625a = false;
        cVar.f44626b = false;
        if (yVar == null || !yVar.f44774a.containsKey("android:visibility:visibility")) {
            cVar.f44627c = -1;
            cVar.f44629e = null;
        } else {
            cVar.f44627c = ((Integer) yVar.f44774a.get("android:visibility:visibility")).intValue();
            cVar.f44629e = (ViewGroup) yVar.f44774a.get("android:visibility:parent");
        }
        if (yVar2 == null || !yVar2.f44774a.containsKey("android:visibility:visibility")) {
            cVar.f44628d = -1;
            cVar.f44630f = null;
        } else {
            cVar.f44628d = ((Integer) yVar2.f44774a.get("android:visibility:visibility")).intValue();
            cVar.f44630f = (ViewGroup) yVar2.f44774a.get("android:visibility:parent");
        }
        if (yVar != null && yVar2 != null) {
            int i10 = cVar.f44627c;
            int i11 = cVar.f44628d;
            if (i10 == i11 && cVar.f44629e == cVar.f44630f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f44626b = false;
                    cVar.f44625a = true;
                } else if (i11 == 0) {
                    cVar.f44626b = true;
                    cVar.f44625a = true;
                }
            } else if (cVar.f44630f == null) {
                cVar.f44626b = false;
                cVar.f44625a = true;
            } else if (cVar.f44629e == null) {
                cVar.f44626b = true;
                cVar.f44625a = true;
            }
        } else if (yVar == null && cVar.f44628d == 0) {
            cVar.f44626b = true;
            cVar.f44625a = true;
        } else if (yVar2 == null && cVar.f44627c == 0) {
            cVar.f44626b = false;
            cVar.f44625a = true;
        }
        return cVar;
    }

    private void z0(y yVar) {
        yVar.f44774a.put("android:visibility:visibility", Integer.valueOf(yVar.f44775b.getVisibility()));
        yVar.f44774a.put("android:visibility:parent", yVar.f44775b.getParent());
        int[] iArr = new int[2];
        yVar.f44775b.getLocationOnScreen(iArr);
        yVar.f44774a.put("android:visibility:screenLocation", iArr);
    }

    public abstract Animator B0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    public Animator C0(ViewGroup viewGroup, y yVar, int i10, y yVar2, int i11) {
        if ((this.f44613Q & 1) != 1 || yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            View view = (View) yVar2.f44775b.getParent();
            if (A0(E(view, false), T(view, false)).f44625a) {
                return null;
            }
        }
        return B0(viewGroup, yVar2.f44775b, yVar, yVar2);
    }

    public abstract Animator D0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r10.f44728w != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator F0(android.view.ViewGroup r11, androidx.transition.y r12, int r13, androidx.transition.y r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.f44613Q
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.f44775b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.f44775b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = androidx.transition.C7021g.f44670a
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = r5
            goto L_0x0088
        L_0x0023:
            if (r2 == 0) goto L_0x003a
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x0036
        L_0x0032:
            r3 = r2
            r6 = r4
            r2 = r1
            goto L_0x003e
        L_0x0036:
            r2 = r1
            r3 = r2
            r6 = r5
            goto L_0x003e
        L_0x003a:
            if (r2 == 0) goto L_0x0036
            r3 = r1
            r6 = r4
        L_0x003e:
            if (r6 == 0) goto L_0x0069
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0085
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0069
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            androidx.transition.y r7 = r10.T(r6, r5)
            androidx.transition.y r8 = r10.E(r6, r5)
            androidx.transition.P$c r7 = r10.A0(r7, r8)
            boolean r7 = r7.f44625a
            if (r7 != 0) goto L_0x006e
            android.view.View r2 = androidx.transition.x.a(r11, r13, r6)
        L_0x0069:
            r6 = r4
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0088
        L_0x006e:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0069
            r6 = -1
            if (r7 == r6) goto L_0x0069
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0069
            boolean r6 = r10.f44728w
            if (r6 == 0) goto L_0x0069
        L_0x0085:
            r2 = r3
            r6 = r4
            r3 = r13
        L_0x0088:
            if (r3 == 0) goto L_0x00e4
            if (r6 != 0) goto L_0x00bc
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.f44774a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            android.view.ViewGroupOverlay r15 = r11.getOverlay()
            r15.add(r3)
        L_0x00bc:
            android.animation.Animator r12 = r10.D0(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00e3
            if (r12 != 0) goto L_0x00cc
            android.view.ViewGroupOverlay r11 = r11.getOverlay()
            r11.remove(r3)
            goto L_0x00e3
        L_0x00cc:
            int r14 = androidx.transition.C7021g.f44670a
            r13.setTag(r14, r3)
            androidx.transition.P$b r14 = new androidx.transition.P$b
            r14.<init>(r11, r3, r13)
            r12.addListener(r14)
            r12.addPauseListener(r14)
            androidx.transition.l r11 = r10.K()
            r11.c(r14)
        L_0x00e3:
            return r12
        L_0x00e4:
            if (r2 == 0) goto L_0x0107
            int r13 = r2.getVisibility()
            androidx.transition.D.f(r2, r4)
            android.animation.Animator r11 = r10.D0(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x0103
            androidx.transition.P$a r12 = new androidx.transition.P$a
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            androidx.transition.l r13 = r10.K()
            r13.c(r12)
            goto L_0x0106
        L_0x0103:
            androidx.transition.D.f(r2, r13)
        L_0x0106:
            return r11
        L_0x0107:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.P.F0(android.view.ViewGroup, androidx.transition.y, int, androidx.transition.y, int):android.animation.Animator");
    }

    public void G0(int i10) {
        if ((i10 & -4) == 0) {
            this.f44613Q = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public String[] S() {
        return f44612R;
    }

    public boolean X(y yVar, y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f44774a.containsKey("android:visibility:visibility") != yVar.f44774a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c A02 = A0(yVar, yVar2);
        if (A02.f44625a) {
            return A02.f44627c == 0 || A02.f44628d == 0;
        }
        return false;
    }

    public void k(y yVar) {
        z0(yVar);
    }

    public void n(y yVar) {
        z0(yVar);
    }

    public Animator u(ViewGroup viewGroup, y yVar, y yVar2) {
        c A02 = A0(yVar, yVar2);
        if (!A02.f44625a) {
            return null;
        }
        if (A02.f44629e == null && A02.f44630f == null) {
            return null;
        }
        if (A02.f44626b) {
            return C0(viewGroup, yVar, A02.f44627c, yVar2, A02.f44628d);
        }
        return F0(viewGroup, yVar, A02.f44627c, yVar2, A02.f44628d);
    }
}
