package com.codekutter.r2db.driver;

import com.codekutter.zconfig.common.IStateEnum;

public enum EConnectionState implements IStateEnum<EConnectionState> {
    /**
     * Connection state is Unknown
     */
    Unknown,
    /**
     * Connection has been initialized.
     */
    Initialized,
    /**
     * Connection is open and available
     */
    Open,
    /**
     * Connection has been closed.
     */
    Closed,
    /**
     * Connection in error state.
     */
    Error;

    @Override
    public EConnectionState getErrorState() {
        return Error;
    }
}
