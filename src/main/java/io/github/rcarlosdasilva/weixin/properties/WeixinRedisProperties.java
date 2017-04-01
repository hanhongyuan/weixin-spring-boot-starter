package io.github.rcarlosdasilva.weixin.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = WeixinRedisProperties.WEIXIN_REDIS_PREFIX)
public class WeixinRedisProperties {

  public static final String WEIXIN_REDIS_PREFIX = "weixin.redis";

  private int database = 0;
  private String host = "localhost";
  private String password;
  private int port = 6379;
  private boolean ssl;
  private int timeout;
  private Pool pool;
  private Sentinel sentinel;
  private Cluster cluster;

  public int getDatabase() {
    return this.database;
  }

  public void setDatabase(int database) {
    this.database = database;
  }

  public String getHost() {
    return this.host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getPort() {
    return this.port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public boolean isSsl() {
    return ssl;
  }

  public void setSsl(boolean ssl) {
    this.ssl = ssl;
  }

  public void setTimeout(int timeout) {
    this.timeout = timeout;
  }

  public int getTimeout() {
    return this.timeout;
  }

  public Sentinel getSentinel() {
    return this.sentinel;
  }

  public void setSentinel(Sentinel sentinel) {
    this.sentinel = sentinel;
  }

  public Pool getPool() {
    return this.pool;
  }

  public void setPool(Pool pool) {
    this.pool = pool;
  }

  public Cluster getCluster() {
    return this.cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public static class Pool {

    private int maxIdle = 8;
    private int minIdle = 0;
    private int maxActive = 8;
    private int maxWait = -1;

    public int getMaxIdle() {
      return this.maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
      this.maxIdle = maxIdle;
    }

    public int getMinIdle() {
      return this.minIdle;
    }

    public void setMinIdle(int minIdle) {
      this.minIdle = minIdle;
    }

    public int getMaxActive() {
      return this.maxActive;
    }

    public void setMaxActive(int maxActive) {
      this.maxActive = maxActive;
    }

    public int getMaxWait() {
      return this.maxWait;
    }

    public void setMaxWait(int maxWait) {
      this.maxWait = maxWait;
    }

  }

  public static class Cluster {

    private List<String> nodes;

    private Integer maxRedirects;

    public List<String> getNodes() {
      return this.nodes;
    }

    public void setNodes(List<String> nodes) {
      this.nodes = nodes;
    }

    public Integer getMaxRedirects() {
      return this.maxRedirects;
    }

    public void setMaxRedirects(Integer maxRedirects) {
      this.maxRedirects = maxRedirects;
    }

  }

  public static class Sentinel {

    private String master;

    private String nodes;

    public String getMaster() {
      return this.master;
    }

    public void setMaster(String master) {
      this.master = master;
    }

    public String getNodes() {
      return this.nodes;
    }

    public void setNodes(String nodes) {
      this.nodes = nodes;
    }

  }

}
