package a9;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16824o;
import XH.C16825p;
import android.os.Process;
import dI.C17164e;
import kotlin.jvm.internal.C17542s;

public final class I implements I1<Float> {

    /* renamed from: g  reason: collision with root package name */
    public static final String f42056g = ("/proc/" + Process.myPid() + "/stat");

    /* renamed from: a  reason: collision with root package name */
    public final String f42057a;

    /* renamed from: b  reason: collision with root package name */
    public float f42058b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f42059c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public final C16824o f42060d = C16825p.b(C6980z.f42979c);

    /* renamed from: e  reason: collision with root package name */
    public final C16824o f42061e = C16825p.b(C6853j.f42615c);

    /* renamed from: f  reason: collision with root package name */
    public final C16532g<Float> f42062f = C16534i.H(new C6924s(this, (C17164e<? super C6924s>) null));

    public I() {
        String str = f42056g;
        C17542s.j(str, "statFilePath");
        this.f42057a = str;
    }

    public final C16532g<Float> a() {
        return this.f42062f;
    }

    public final String getName() {
        return "cpu";
    }
}
