package net.openid.appauth;

import AK.g;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f144978a;

    /* renamed from: b  reason: collision with root package name */
    private String f144979b;

    /* renamed from: c  reason: collision with root package name */
    private i f144980c;

    /* renamed from: d  reason: collision with root package name */
    private g f144981d;

    /* renamed from: e  reason: collision with root package name */
    private r f144982e;

    /* renamed from: f  reason: collision with root package name */
    private d f144983f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f144984g = new Object();

    public i a() {
        g gVar = this.f144981d;
        return gVar != null ? gVar.f145058a.f145021a : this.f144980c;
    }

    public void b(g gVar, d dVar) {
        boolean z10 = false;
        boolean z11 = gVar != null;
        if (dVar != null) {
            z10 = true;
        }
        g.a(z10 ^ z11, "exactly one of authResponse or authException should be non-null");
        if (dVar == null) {
            this.f144981d = gVar;
            this.f144980c = null;
            this.f144982e = null;
            this.f144978a = null;
            this.f144983f = null;
            String str = gVar.f145065h;
            if (str == null) {
                str = gVar.f145058a.f145029i;
            }
            this.f144979b = str;
        } else if (dVar.f144985a == 1) {
            this.f144983f = dVar;
        }
    }
}
