package gJ;

import DI.C15558e;
import DI.C15565l;
import DI.C15566m;
import DI.C15579z;
import DI.a0;
import DI.m0;
import java.util.Comparator;

/* renamed from: gJ.l  reason: case insensitive filesystem */
public class C17281l implements Comparator<C15566m> {

    /* renamed from: a  reason: collision with root package name */
    public static final C17281l f143309a = new C17281l();

    private C17281l() {
    }

    private static Integer b(C15566m mVar, C15566m mVar2) {
        int c10 = c(mVar2) - c(mVar);
        if (c10 != 0) {
            return Integer.valueOf(c10);
        }
        if (C17278i.B(mVar) && C17278i.B(mVar2)) {
            return 0;
        }
        int j10 = mVar.getName().compareTo(mVar2.getName());
        if (j10 != 0) {
            return Integer.valueOf(j10);
        }
        return null;
    }

    private static int c(C15566m mVar) {
        if (C17278i.B(mVar)) {
            return 8;
        }
        if (mVar instanceof C15565l) {
            return 7;
        }
        if (mVar instanceof a0) {
            return ((a0) mVar).O() == null ? 6 : 5;
        }
        if (mVar instanceof C15579z) {
            return ((C15579z) mVar).O() == null ? 4 : 3;
        }
        if (mVar instanceof C15558e) {
            return 2;
        }
        return mVar instanceof m0 ? 1 : 0;
    }

    /* renamed from: a */
    public int compare(C15566m mVar, C15566m mVar2) {
        Integer b10 = b(mVar, mVar2);
        if (b10 != null) {
            return b10.intValue();
        }
        return 0;
    }
}
