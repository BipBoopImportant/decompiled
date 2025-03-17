package ed;

import Zc.C9400i;
import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import bd.C9428b;
import ha.C7957a8;
import ha.C7977c8;
import ha.C7995e6;
import ha.C8005f6;
import ha.C8029i0;
import ha.C8115q6;
import ha.C8124r6;
import ha.C8136s8;
import ha.Z7;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ed.c  reason: case insensitive filesystem */
public final class C9635c {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray f72590a;

    /* renamed from: b  reason: collision with root package name */
    private static final SparseArray f72591b;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicReference f72592c = new AtomicReference();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d  reason: collision with root package name */
    private static final Map f72593d;

    static {
        SparseArray sparseArray = new SparseArray();
        f72590a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f72591b = sparseArray2;
        sparseArray.put(-1, C8115q6.FORMAT_UNKNOWN);
        sparseArray.put(1, C8115q6.FORMAT_CODE_128);
        sparseArray.put(2, C8115q6.FORMAT_CODE_39);
        sparseArray.put(4, C8115q6.FORMAT_CODE_93);
        sparseArray.put(8, C8115q6.FORMAT_CODABAR);
        sparseArray.put(16, C8115q6.FORMAT_DATA_MATRIX);
        sparseArray.put(32, C8115q6.FORMAT_EAN_13);
        sparseArray.put(64, C8115q6.FORMAT_EAN_8);
        sparseArray.put(128, C8115q6.FORMAT_ITF);
        sparseArray.put(256, C8115q6.FORMAT_QR_CODE);
        sparseArray.put(512, C8115q6.FORMAT_UPC_A);
        sparseArray.put(1024, C8115q6.FORMAT_UPC_E);
        sparseArray.put(RecyclerView.n.FLAG_MOVED, C8115q6.FORMAT_PDF417);
        sparseArray.put(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT, C8115q6.FORMAT_AZTEC);
        sparseArray2.put(0, C8124r6.TYPE_UNKNOWN);
        sparseArray2.put(1, C8124r6.TYPE_CONTACT_INFO);
        sparseArray2.put(2, C8124r6.TYPE_EMAIL);
        sparseArray2.put(3, C8124r6.TYPE_ISBN);
        sparseArray2.put(4, C8124r6.TYPE_PHONE);
        sparseArray2.put(5, C8124r6.TYPE_PRODUCT);
        sparseArray2.put(6, C8124r6.TYPE_SMS);
        sparseArray2.put(7, C8124r6.TYPE_TEXT);
        sparseArray2.put(8, C8124r6.TYPE_URL);
        sparseArray2.put(9, C8124r6.TYPE_WIFI);
        sparseArray2.put(10, C8124r6.TYPE_GEO);
        sparseArray2.put(11, C8124r6.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, C8124r6.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f72593d = hashMap;
        hashMap.put(1, Z7.CODE_128);
        hashMap.put(2, Z7.CODE_39);
        hashMap.put(4, Z7.CODE_93);
        hashMap.put(8, Z7.CODABAR);
        hashMap.put(16, Z7.DATA_MATRIX);
        hashMap.put(32, Z7.EAN_13);
        hashMap.put(64, Z7.EAN_8);
        hashMap.put(128, Z7.ITF);
        hashMap.put(256, Z7.QR_CODE);
        hashMap.put(512, Z7.UPC_A);
        hashMap.put(1024, Z7.UPC_E);
        hashMap.put(Integer.valueOf(RecyclerView.n.FLAG_MOVED), Z7.PDF417);
        hashMap.put(Integer.valueOf(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT), Z7.AZTEC);
    }

    public static C8115q6 a(int i10) {
        C8115q6 q6Var = (C8115q6) f72590a.get(i10);
        return q6Var == null ? C8115q6.FORMAT_UNKNOWN : q6Var;
    }

    public static C8124r6 b(int i10) {
        C8124r6 r6Var = (C8124r6) f72591b.get(i10);
        return r6Var == null ? C8124r6.TYPE_UNKNOWN : r6Var;
    }

    public static C7977c8 c(C9428b bVar) {
        int a10 = bVar.a();
        C8029i0 i0Var = new C8029i0();
        if (a10 == 0) {
            i0Var.f(f72593d.values());
        } else {
            for (Map.Entry entry : f72593d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & a10) != 0) {
                    i0Var.e((Z7) entry.getValue());
                }
            }
        }
        C7957a8 a8Var = new C7957a8();
        a8Var.b(i0Var.g());
        return a8Var.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static void e(C8136s8 s8Var, C7995e6 e6Var) {
        s8Var.f(new C9634b(e6Var), C8005f6.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f72592c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean b10 = C9645m.b(C9400i.c().b());
        atomicReference.set(Boolean.valueOf(b10));
        return b10;
    }
}
