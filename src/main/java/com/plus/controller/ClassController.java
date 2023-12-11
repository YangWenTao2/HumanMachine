package com.plus.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.plus.common.R;
import com.plus.dto.ClassQueryRequest;
import com.plus.dto.UserDTO;
import com.plus.entity.ClassEntity;
import com.plus.entity.User;
import com.plus.service.ClassService;
import com.plus.service.IUserService;
import com.plus.utils.Func;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("class")
@Api(description = "课程相关接口")
public class ClassController {

 //可能要加 @Autowired
  private ClassService classService;

  /**
   * 详情
   */

  @GetMapping("/week/{userId}")
  @ApiOperation(value = "课表信息", notes = "传入课表")
  public R<List<ClassEntity>> getWeeklyClasses(@PathVariable Integer userId) {


      List<ClassEntity> weeklyClasses = classService.getWeeklyClasses(userId);
      return R.data(weeklyClasses);

  }
  @PostMapping("/date")
  @ApiOperation(value = "某天课程", notes = "某天课程")
  public R<List<ClassEntity>> getDayClasses(@RequestBody ClassQueryRequest classQueryRequest) {
    int userId=classQueryRequest.getUserId();
    int week=classQueryRequest.getWeek();
    int day=classQueryRequest.getDay();

    List<ClassEntity> dayClass = classService.getDayClass(userId,week,day);
    return R.data(dayClass);

  }

  @PostMapping("/day-and-next")
  @ApiOperation(value = "某天及后一天课程", notes = "传入课表")
  public R<List<ClassEntity>> getDayNextClasses(@RequestBody ClassQueryRequest classQueryRequest) {
    int userId=classQueryRequest.getUserId();
    int week=classQueryRequest.getWeek();
    int day=classQueryRequest.getDay();

    List<ClassEntity> dayClass = classService.getDayNextClass(userId,week,day);
    return R.data(dayClass);

  }


}
