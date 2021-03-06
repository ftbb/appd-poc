/*
 *
 *
 *  Copyright (C) 2018 IHS Markit.
 *  All Rights Reserved
 *
 *
 *  NOTICE:  All information contained herein is, and remains
 *  the property of IHS Markit and its suppliers,
 *  if any.  The intellectual and technical concepts contained
 *  herein are proprietary to IHS Markit and its suppliers
 *  and may be covered by U.S. and Foreign Patents, patents in
 *  process, and are protected by trade secret or copyright law.
 *  Dissemination of this information or reproduction of this material
 *  is strictly forbidden unless prior written permission is obtained
 *  from IHS Markit.
 */

package org.fdc3.appd.poc.dao;

import org.fdc3.appd.poc.exceptions.DaoException;
import org.fdc3.appd.server.model.Application;

import java.util.concurrent.ConcurrentMap;

/**
 * @author Frank Tarsillo on 10/12/18.
 */
public interface AppsDAO {
    /**
     * Obtain a singleton instance.  This will also create cache from persist on first call
     *
     * @return instance
     */

    ConcurrentMap<String, Application> getApps();

    void setApps(ConcurrentMap<String, Application> apps);

    Application getApp(String appId) throws DaoException;

    void setApp(Application application) throws DaoException;

    void prime();
}
