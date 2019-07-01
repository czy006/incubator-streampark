package com.streamxhub.spark.monitor.core.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
@TableName("t_spark_conf")
public class SparkConf {

    @NotBlank(message = "{required}")
    @TableId(value = "MY_ID", type = IdType.INPUT)
    private String myId;

    @NotBlank(message = "{required}")
    private String appName;

    @NotBlank(message = "{required}")
    private String confVersion;

    @NotBlank(message = "{required}")
    private String conf;

    private transient List<SparkConfRecord> history;

    private Date createTime;
    private Date modifyTime;

    public SparkConf(String id, String appName, String confVersion, String conf) {
        this.myId = id;
        this.appName = appName;
        this.confVersion = confVersion;
        this.conf = conf;
    }

    public SparkConf(){}
}
