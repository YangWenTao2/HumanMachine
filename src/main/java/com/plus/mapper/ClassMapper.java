package com.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.plus.entity.ClassEntity;
import java.util.List;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use;

public interface ClassMapper extends BaseMapper<ClassEntity> {

  List<ClassEntity> getWeeklyClasses(int userId);

  List<ClassEntity> getDayClass(int userId, int week, int day);
  List<ClassEntity> getDayNextClass(int userId, int week, int day);
}
