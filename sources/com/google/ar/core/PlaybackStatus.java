package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);
    
    final int nativeCode;

    private PlaybackStatus(int i10) {
        this.nativeCode = i10;
    }

    static PlaybackStatus forNumber(int i10) {
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i10) {
                return playbackStatus;
            }
        }
        throw new FatalException(O.b((byte) 50, i10, "Unexpected value for native PlaybackStatus, value="));
    }
}
