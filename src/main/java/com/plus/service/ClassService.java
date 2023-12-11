package com.plus.service;


import com.plus.entity.ClassEntity;
import java.util.List;

public interface ClassService {


  List<ClassEntity> getWeeklyClasses(int userId);
  List<ClassEntity> getDayClass(int useId,int week,int day);
  List<ClassEntity> getDayNextClass(int useId,int week,int day);
}
