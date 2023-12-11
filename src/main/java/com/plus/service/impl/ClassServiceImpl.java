package com.plus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.plus.common.Condition;
import com.plus.entity.ClassEntity;
import com.plus.entity.User;
import com.plus.mapper.ClassMapper;
import com.plus.service.ClassService;
import com.plus.utils.BeanCopyUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClassServiceImpl implements ClassService {
  protected ClassMapper classMapper;  /**
   * @param userId
   * @return
   */
  @Override
  public List<ClassEntity> getWeeklyClasses(int userId) {

    return  classMapper.getWeeklyClasses(userId);
  }

  /**
   * @param day
   * @return
   */
  @Override
  public List<ClassEntity> getDayClass(int userId,int week,int day) {
    return  classMapper.getDayClass(userId,week,day);
  }

  /**
   * @param useId
   * @param week
   * @param day
   * @return
   */
  @Override
  public List<ClassEntity> getDayNextClass(int userId, int week, int day) {
    return  classMapper.getDayNextClass(userId,week,day);
  }
}
