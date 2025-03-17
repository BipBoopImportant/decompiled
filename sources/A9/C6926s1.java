package a9;

import android.view.ViewGroup;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

/* renamed from: a9.s1  reason: case insensitive filesystem */
public final class C6926s1 implements C17642l<ViewGroup, String> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42843a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42844b;

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<ViewGroup, String> f42845c;

    public C6926s1(boolean z10, String str, X3 x32) {
        C17542s.j(x32, "wrappedProducer");
        this.f42843a = z10;
        this.f42844b = str;
        this.f42845c = x32;
    }

    public final Object invoke(Object obj) {
        String invoke = this.f42845c.invoke((ViewGroup) obj);
        if (this.f42843a) {
            String str = this.f42844b;
            return str == null ? invoke : str;
        } else if (!C17542s.e(invoke, this.f42844b)) {
            return invoke;
        } else {
            return null;
        }
    }
}
