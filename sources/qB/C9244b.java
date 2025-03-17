package Qb;

import Tb.F;
import java.io.File;

/* renamed from: Qb.b  reason: case insensitive filesystem */
final class C9244b extends C {

    /* renamed from: a  reason: collision with root package name */
    private final F f62958a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62959b;

    /* renamed from: c  reason: collision with root package name */
    private final File f62960c;

    C9244b(F f10, String str, File file) {
        if (f10 != null) {
            this.f62958a = f10;
            if (str != null) {
                this.f62959b = str;
                if (file != null) {
                    this.f62960c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public F b() {
        return this.f62958a;
    }

    public File c() {
        return this.f62960c;
    }

    public String d() {
        return this.f62959b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return this.f62958a.equals(c10.b()) && this.f62959b.equals(c10.d()) && this.f62960c.equals(c10.c());
    }

    public int hashCode() {
        return ((((this.f62958a.hashCode() ^ 1000003) * 1000003) ^ this.f62959b.hashCode()) * 1000003) ^ this.f62960c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f62958a + ", sessionId=" + this.f62959b + ", reportFile=" + this.f62960c + "}";
    }
}
