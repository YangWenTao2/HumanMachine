package com.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plus.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "Class对象", description = "用户课程表")
@TableName("userclass")
public class ClassEntity extends BaseEntity {
  @TableId(value = "user_id", type = IdType.AUTO)
  private int userClassId;
  private int userId;
  private String className;
  private String instructor;
  private int weekfrom;
  private int weekto;
  private int lessonfrom;
  private int lessonto;
  private int day;
  private String location;
}
