package com.example.user.qrrecoder.data.greendaoauto;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.user.qrrecoder.data.greendao.DeviceItem;
import com.example.user.qrrecoder.data.greendao.User;

import com.example.user.qrrecoder.data.greendaoauto.DeviceItemDao;
import com.example.user.qrrecoder.data.greendaoauto.UserDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig deviceItemDaoConfig;
    private final DaoConfig userDaoConfig;

    private final DeviceItemDao deviceItemDao;
    private final UserDao userDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        deviceItemDaoConfig = daoConfigMap.get(DeviceItemDao.class).clone();
        deviceItemDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        deviceItemDao = new DeviceItemDao(deviceItemDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);

        registerDao(DeviceItem.class, deviceItemDao);
        registerDao(User.class, userDao);
    }
    
    public void clear() {
        deviceItemDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
    }

    public DeviceItemDao getDeviceItemDao() {
        return deviceItemDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

}
