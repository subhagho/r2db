package com.codekutter.r2db.driver;

import com.codekutter.zconfig.common.IConfigurable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
public abstract class AbstractConnection<T> implements IConfigurable {
    @Setter(AccessLevel.NONE)
    private ConnectionState state = new ConnectionState();
    private T connection;
    @Setter(AccessLevel.NONE)
    @SuppressWarnings("rawtypes")
    private List<Class<? extends IEntity>> supportedTypes = new ArrayList<>();

    public abstract boolean hasTransactionSupport();
}