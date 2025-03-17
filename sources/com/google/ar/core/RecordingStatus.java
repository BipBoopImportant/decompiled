package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;

public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);
    
    final int nativeCode;

    private RecordingStatus(int i10) {
        this.nativeCode = i10;
    }

    static RecordingStatus forNumber(int i10) {
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i10) {
                return recordingStatus;
            }
        }
        throw new FatalException(O.b((byte) 51, i10, "Unexpected value for native RecordingStatus, value="));
    }
}
