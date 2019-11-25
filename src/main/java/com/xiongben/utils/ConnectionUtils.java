package com.xiongben.utils;

import javax.sql.DataSource;
import java.sql.Connection;

public class ConnectionUtils {
    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
    private DataSource dataSource;

    public Connection getThreadConnection(){
        try {
            Connection conn = tl.get();
            if(conn == null){
                conn = dataSource.getConnection();
                tl.set(conn);
            }
            return conn;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public void removeConnection(){
        tl.remove();
    }
}
