package j2;

import i2.C5438a;
import java.util.HashMap;
import java.util.HashSet;
import k2.n;
import k2.u;

/* renamed from: j2.a  reason: case insensitive filesystem */
public abstract class C5481a implements u {

    /* renamed from: f  reason: collision with root package name */
    public static int f24727f = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f24728a;

    /* renamed from: b  reason: collision with root package name */
    int f24729b;

    /* renamed from: c  reason: collision with root package name */
    String f24730c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f24731d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, C5438a> f24732e;

    public C5481a() {
        int i10 = f24727f;
        this.f24728a = i10;
        this.f24729b = i10;
    }

    public boolean b(int i10, int i11) {
        if (i10 != 100) {
            return false;
        }
        this.f24728a = i11;
        return true;
    }

    public boolean c(int i10, float f10) {
        return false;
    }

    public boolean d(int i10, boolean z10) {
        return false;
    }

    public boolean e(int i10, String str) {
        if (i10 != 101) {
            return false;
        }
        this.f24730c = str;
        return true;
    }

    public abstract void f(HashMap<String, n> hashMap);

    /* renamed from: g */
    public abstract C5481a clone();

    public C5481a h(C5481a aVar) {
        this.f24728a = aVar.f24728a;
        this.f24729b = aVar.f24729b;
        this.f24730c = aVar.f24730c;
        this.f24731d = aVar.f24731d;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public void j(HashMap<String, Integer> hashMap) {
    }

    /* access modifiers changed from: package-private */
    public float k(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* access modifiers changed from: package-private */
    public int l(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
