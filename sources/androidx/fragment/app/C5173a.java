package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Q;
import androidx.lifecycle.r;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a  reason: case insensitive filesystem */
final class C5173a extends Q implements FragmentManager.k, FragmentManager.q {

    /* renamed from: t  reason: collision with root package name */
    final FragmentManager f21994t;

    /* renamed from: u  reason: collision with root package name */
    boolean f21995u;

    /* renamed from: v  reason: collision with root package name */
    int f21996v;

    /* renamed from: w  reason: collision with root package name */
    boolean f21997w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5173a(FragmentManager fragmentManager) {
        super(fragmentManager.E0(), fragmentManager.H0() != null ? fragmentManager.H0().f().getClassLoader() : null);
        this.f21996v = -1;
        this.f21997w = false;
        this.f21994t = fragmentManager;
    }

    public Q A(C5187o oVar) {
        FragmentManager fragmentManager;
        if (oVar == null || (fragmentManager = oVar.mFragmentManager) == null || fragmentManager == this.f21994t) {
            return super.A(oVar);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void C(int i10) {
        if (this.f21935i) {
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f21929c.size();
            for (int i11 = 0; i11 < size; i11++) {
                Q.a aVar = this.f21929c.get(i11);
                C5187o oVar = aVar.f21947b;
                if (oVar != null) {
                    oVar.mBackStackNesting += i10;
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f21947b + " to " + aVar.f21947b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        int size = this.f21929c.size() - 1;
        while (size >= 0) {
            Q.a aVar = this.f21929c.get(size);
            if (aVar.f21948c) {
                if (aVar.f21946a == 8) {
                    aVar.f21948c = false;
                    this.f21929c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f21947b.mContainerId;
                    aVar.f21946a = 2;
                    aVar.f21948c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        Q.a aVar2 = this.f21929c.get(i11);
                        if (aVar2.f21948c && aVar2.f21947b.mContainerId == i10) {
                            this.f21929c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    public int E(boolean z10, boolean z11) {
        if (!this.f21995u) {
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
                F("  ", printWriter);
                printWriter.close();
            }
            this.f21995u = true;
            if (this.f21935i) {
                this.f21996v = this.f21994t.p();
            } else {
                this.f21996v = -1;
            }
            if (z11) {
                this.f21994t.f0(this, z10);
            }
            return this.f21996v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void F(String str, PrintWriter printWriter) {
        G(str, printWriter, true);
    }

    public void G(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f21937k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f21996v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f21995u);
            if (this.f21934h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f21934h));
            }
            if (!(this.f21930d == 0 && this.f21931e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21930d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21931e));
            }
            if (!(this.f21932f == 0 && this.f21933g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21932f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21933g));
            }
            if (!(this.f21938l == 0 && this.f21939m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21938l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f21939m);
            }
            if (!(this.f21940n == 0 && this.f21941o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21940n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f21941o);
            }
        }
        if (!this.f21929c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f21929c.size();
            for (int i10 = 0; i10 < size; i10++) {
                Q.a aVar = this.f21929c.get(i10);
                switch (aVar.f21946a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f21946a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f21947b);
                if (z10) {
                    if (!(aVar.f21949d == 0 && aVar.f21950e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f21949d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f21950e));
                    }
                    if (aVar.f21951f != 0 || aVar.f21952g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f21951f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f21952g));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        int size = this.f21929c.size();
        for (int i10 = 0; i10 < size; i10++) {
            Q.a aVar = this.f21929c.get(i10);
            C5187o oVar = aVar.f21947b;
            if (oVar != null) {
                oVar.mBeingSaved = this.f21997w;
                oVar.setPopDirection(false);
                oVar.setNextTransition(this.f21934h);
                oVar.setSharedElementNames(this.f21942p, this.f21943q);
            }
            switch (aVar.f21946a) {
                case 1:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.O1(oVar, false);
                    this.f21994t.l(oVar);
                    break;
                case 3:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.B1(oVar);
                    break;
                case 4:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.R0(oVar);
                    break;
                case 5:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.O1(oVar, false);
                    this.f21994t.V1(oVar);
                    break;
                case 6:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.D(oVar);
                    break;
                case 7:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.O1(oVar, false);
                    this.f21994t.r(oVar);
                    break;
                case 8:
                    this.f21994t.T1(oVar);
                    break;
                case 9:
                    this.f21994t.T1((C5187o) null);
                    break;
                case 10:
                    this.f21994t.S1(oVar, aVar.f21954i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f21946a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        for (int size = this.f21929c.size() - 1; size >= 0; size--) {
            Q.a aVar = this.f21929c.get(size);
            C5187o oVar = aVar.f21947b;
            if (oVar != null) {
                oVar.mBeingSaved = this.f21997w;
                oVar.setPopDirection(true);
                oVar.setNextTransition(FragmentManager.I1(this.f21934h));
                oVar.setSharedElementNames(this.f21943q, this.f21942p);
            }
            switch (aVar.f21946a) {
                case 1:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.O1(oVar, true);
                    this.f21994t.B1(oVar);
                    break;
                case 3:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.l(oVar);
                    break;
                case 4:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.V1(oVar);
                    break;
                case 5:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.O1(oVar, true);
                    this.f21994t.R0(oVar);
                    break;
                case 6:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.r(oVar);
                    break;
                case 7:
                    oVar.setAnimations(aVar.f21949d, aVar.f21950e, aVar.f21951f, aVar.f21952g);
                    this.f21994t.O1(oVar, true);
                    this.f21994t.D(oVar);
                    break;
                case 8:
                    this.f21994t.T1((C5187o) null);
                    break;
                case 9:
                    this.f21994t.T1(oVar);
                    break;
                case 10:
                    this.f21994t.S1(oVar, aVar.f21953h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f21946a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C5187o J(ArrayList<C5187o> arrayList, C5187o oVar) {
        ArrayList<C5187o> arrayList2 = arrayList;
        C5187o oVar2 = oVar;
        int i10 = 0;
        while (i10 < this.f21929c.size()) {
            Q.a aVar = this.f21929c.get(i10);
            int i11 = aVar.f21946a;
            if (i11 != 1) {
                if (i11 == 2) {
                    C5187o oVar3 = aVar.f21947b;
                    int i12 = oVar3.mContainerId;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C5187o oVar4 = arrayList2.get(size);
                        if (oVar4.mContainerId == i12) {
                            if (oVar4 == oVar3) {
                                z10 = true;
                            } else {
                                if (oVar4 == oVar2) {
                                    this.f21929c.add(i10, new Q.a(9, oVar4, true));
                                    i10++;
                                    oVar2 = null;
                                }
                                Q.a aVar2 = new Q.a(3, oVar4, true);
                                aVar2.f21949d = aVar.f21949d;
                                aVar2.f21951f = aVar.f21951f;
                                aVar2.f21950e = aVar.f21950e;
                                aVar2.f21952g = aVar.f21952g;
                                this.f21929c.add(i10, aVar2);
                                arrayList2.remove(oVar4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f21929c.remove(i10);
                        i10--;
                    } else {
                        aVar.f21946a = 1;
                        aVar.f21948c = true;
                        arrayList2.add(oVar3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList2.remove(aVar.f21947b);
                    C5187o oVar5 = aVar.f21947b;
                    if (oVar5 == oVar2) {
                        this.f21929c.add(i10, new Q.a(9, oVar5));
                        i10++;
                        oVar2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f21929c.add(i10, new Q.a(9, oVar2, true));
                        aVar.f21948c = true;
                        i10++;
                        oVar2 = aVar.f21947b;
                    }
                }
                i10++;
            }
            arrayList2.add(aVar.f21947b);
            i10++;
        }
        return oVar2;
    }

    public void K() {
        if (this.f21945s != null) {
            for (int i10 = 0; i10 < this.f21945s.size(); i10++) {
                this.f21945s.get(i10).run();
            }
            this.f21945s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public C5187o L(ArrayList<C5187o> arrayList, C5187o oVar) {
        for (int size = this.f21929c.size() - 1; size >= 0; size--) {
            Q.a aVar = this.f21929c.get(size);
            int i10 = aVar.f21946a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            oVar = null;
                            break;
                        case 9:
                            oVar = aVar.f21947b;
                            break;
                        case 10:
                            aVar.f21954i = aVar.f21953h;
                            break;
                    }
                }
                arrayList.add(aVar.f21947b);
            }
            arrayList.remove(aVar.f21947b);
        }
        return oVar;
    }

    public boolean a(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f21935i) {
            return true;
        }
        this.f21994t.k(this);
        return true;
    }

    public String getName() {
        return this.f21937k;
    }

    public int j() {
        return E(false, true);
    }

    public int k() {
        return E(true, true);
    }

    public void l() {
        o();
        this.f21994t.i0(this, false);
    }

    public void m() {
        o();
        this.f21994t.i0(this, true);
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, C5187o oVar, String str, int i11) {
        super.p(i10, oVar, str, i11);
        oVar.mFragmentManager = this.f21994t;
    }

    public boolean q() {
        return this.f21929c.isEmpty();
    }

    public Q r(C5187o oVar) {
        FragmentManager fragmentManager = oVar.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f21994t) {
            return super.r(oVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f21996v >= 0) {
            sb2.append(" #");
            sb2.append(this.f21996v);
        }
        if (this.f21937k != null) {
            sb2.append(" ");
            sb2.append(this.f21937k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public Q z(C5187o oVar, r.b bVar) {
        if (oVar.mFragmentManager != this.f21994t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f21994t);
        } else if (bVar == r.b.INITIALIZED && oVar.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        } else if (bVar != r.b.DESTROYED) {
            return super.z(oVar, bVar);
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5173a(C5173a aVar) {
        super(aVar.f21994t.E0(), aVar.f21994t.H0() != null ? aVar.f21994t.H0().f().getClassLoader() : null, aVar);
        this.f21996v = -1;
        this.f21997w = false;
        this.f21994t = aVar.f21994t;
        this.f21995u = aVar.f21995u;
        this.f21996v = aVar.f21996v;
        this.f21997w = aVar.f21997w;
    }
}
