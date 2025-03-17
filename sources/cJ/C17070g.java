package cJ;

import HJ.C15850p;
import kotlin.jvm.internal.C17542s;

/* renamed from: cJ.g  reason: case insensitive filesystem */
public final class C17070g {

    /* renamed from: a  reason: collision with root package name */
    public static final C17070g f141259a = new C17070g();

    /* renamed from: b  reason: collision with root package name */
    private static final C15850p f141260b = new C15850p("[^\\p{L}\\p{Digit}]");

    /* renamed from: c  reason: collision with root package name */
    private static final String f141261c = "$context_receiver";

    private C17070g() {
    }

    public static final C17069f a(int i10) {
        C17069f v10 = C17069f.v(f141261c + '_' + i10);
        C17542s.i(v10, "identifier(...)");
        return v10;
    }

    public static final String b(String str) {
        C17542s.j(str, "name");
        return f141260b.j(str, "_");
    }
}
