package com.webank.cmdb.controller.ui.helper;

import com.webank.cmdb.exception.CmdbException;

public class DataNotFoundException extends CmdbException {
    private static final long serialVersionUID = 1L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
