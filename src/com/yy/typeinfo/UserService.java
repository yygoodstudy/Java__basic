package com.yy.typeinfo;

/**
 * @Date 2021/6/7 20:06
 */
public interface UserService {
    void insert(String userId);

    void update(String userId);
}

class UserServiceImpl implements UserService {
    @Override
    public void insert(String userId) {
        System.out.println("(insert)插入了userId = " + userId + "的用户");
    }

    @Override
    public void update(String userId) {
        System.out.println("(update)修改了userId = " + userId + "的用户");
    }
}

class SimpleUserServiceProxy implements UserService {
    private UserService userService;

    SimpleUserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void insert(String userId) {
        logBefore("用户ID = " + userId);
        userService.insert(userId);
        logAfter("用户ID = " + userId);
    }

    @Override
    public void update(String userId) {
        logBefore("用户ID = " + userId);
        userService.update(userId);
        logAfter("用户ID = " + userId);
    }

    public void logBefore(String args) {
        System.out.println(args);
    }

    public void logAfter(String args) {
        System.out.println(args);
    }
}

class SimpleUserServiceProxyDemo {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        SimpleUserServiceProxy proxy = new SimpleUserServiceProxy(userService);
        proxy.insert("10001");
        proxy.update("10001");

    }
}