package com.codekutter.r2db.driver.impl;

import com.codekutter.r2db.driver.AbstractConnection;
import com.codekutter.zconfig.common.ConfigurationException;
import com.codekutter.zconfig.common.model.nodes.AbstractConfigNode;
import org.hibernate.Session;

import javax.annotation.Nonnull;

public class HibernateConnection extends AbstractConnection<Session> {
    @Override
    public boolean hasTransactionSupport() {
        return true;
    }

    @Override
    public void configure(@Nonnull AbstractConfigNode abstractConfigNode) throws ConfigurationException {

    }
}
