package nts;

import tE.C15075d;

/* renamed from: nts.ᢼ  reason: contains not printable characters */
public class C3986 extends C15075d {
    public C3986(C3675 r42) {
        super(new RuntimeException(r42.getMessage() + " [" + r42.m797() + "]", r42.getCause()));
    }

    public C3986(String str, C3675 r42) {
        super(new RuntimeException(str + "\t" + r42.getMessage() + " [" + r42.m797() + "]", r42.getCause()));
    }
}
