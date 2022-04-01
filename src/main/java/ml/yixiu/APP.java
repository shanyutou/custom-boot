package ml.yixiu;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class APP {
    public static void main(String[] args) {
        System.out.println("begin custom boot!");

        /**
         * 启动tomcat
         */
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8081);
        tomcat.setBaseDir("webapp");
        tomcat.addWebapp("", "d:\\temp\\");

        tomcat.getConnector();
        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
