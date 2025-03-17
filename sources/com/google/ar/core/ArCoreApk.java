package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.exceptions.FatalException;
import java.util.function.Consumer;

public class ArCoreApk {

    public enum Availability {
        ;
        
        final int nativeCode;

        static Availability forNumber(int i10) {
            for (Availability availability : values()) {
                if (availability.nativeCode == i10) {
                    return availability;
                }
            }
            throw new FatalException(O.b((byte) 48, i10, "Unexpected value for native Availability, value="));
        }

        public boolean isSupported() {
            return false;
        }

        public boolean isTransient() {
            return false;
        }

        public boolean isUnknown() {
            return false;
        }

        public boolean isUnsupported() {
            return false;
        }

        private Availability(int i10) {
            this.nativeCode = i10;
        }
    }

    public enum InstallBehavior {
        REQUIRED(0),
        OPTIONAL(1);
        
        final int nativeCode;

        private InstallBehavior(int i10) {
            this.nativeCode = i10;
        }

        static InstallBehavior forNumber(int i10) {
            for (InstallBehavior installBehavior : values()) {
                if (installBehavior.nativeCode == i10) {
                    return installBehavior;
                }
            }
            throw new FatalException(O.b((byte) 51, i10, "Unexpected value for native InstallBehavior, value="));
        }
    }

    public enum InstallStatus {
        INSTALLED(0),
        INSTALL_REQUESTED(1);
        
        final int nativeCode;

        private InstallStatus(int i10) {
            this.nativeCode = i10;
        }

        static InstallStatus forNumber(int i10) {
            for (InstallStatus installStatus : values()) {
                if (installStatus.nativeCode == i10) {
                    return installStatus;
                }
            }
            throw new FatalException(O.b((byte) 49, i10, "Unexpected value for native InstallStatus, value="));
        }
    }

    public enum UserMessageType {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);
        
        final int nativeCode;

        private UserMessageType(int i10) {
            this.nativeCode = i10;
        }

        static UserMessageType forNumber(int i10) {
            for (UserMessageType userMessageType : values()) {
                if (userMessageType.nativeCode == i10) {
                    return userMessageType;
                }
            }
            throw new FatalException(O.b((byte) 51, i10, "Unexpected value for native UserMessageType, value="));
        }
    }

    protected ArCoreApk() {
    }

    public static ArCoreApk getInstance() {
        return J.a();
    }

    public Availability checkAvailability(Context context) {
        throw new UnsupportedOperationException("Stub");
    }

    public void checkAvailabilityAsync(Context context, Consumer<Availability> consumer) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z10) {
        throw new UnsupportedOperationException("Stub");
    }

    public InstallStatus requestInstall(Activity activity, boolean z10, InstallBehavior installBehavior, UserMessageType userMessageType) {
        throw new UnsupportedOperationException("Stub");
    }
}
