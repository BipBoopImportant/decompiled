package org.slf4j.impl;

import com.noveogroup.android.log.LoggerManager;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class AndroidLoggerFactory implements ILoggerFactory {
    public Logger getLogger(String str) {
        return new AndroidLoggerAdapter(LoggerManager.getLogger(str));
    }
}
