package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

final class V {

    /* renamed from: a  reason: collision with root package name */
    boolean f67730a = false;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InstallActivity f67731b;

    V(InstallActivity installActivity) {
        this.f67731b = installActivity;
    }

    public final void a(W w10) {
        synchronized (this.f67731b) {
            try {
                if (!this.f67730a) {
                    this.f67731b.f(w10);
                    ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
                    ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                    int ordinal = w10.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            this.f67731b.c(new UnavailableUserDeclinedInstallationException());
                        } else if (ordinal == 2) {
                            if (!this.f67731b.g() && J.a().f67680d) {
                                this.f67731b.e();
                            }
                            this.f67731b.c((Exception) null);
                        }
                        this.f67730a = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Exception exc) {
        synchronized (this.f67731b) {
            try {
                if (!this.f67730a) {
                    this.f67730a = true;
                    this.f67731b.f(W.CANCELLED);
                    this.f67731b.c(exc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
