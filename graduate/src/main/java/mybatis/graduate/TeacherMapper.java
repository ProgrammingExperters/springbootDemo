/*
 * (c) 2018 Thunisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package mybatis.graduate;

import com.thunisoft.graduate.common.model.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p> Description: 教师信息 Mybatis数据访问映射接口</p>
 *
 * <p> CreationTime: 2018-12-24 16:30:40
 * <br>Copyright: &copy;2018 <a href="http://www.thunisoft.com">Thunisoft</a>
 * <br>Email: <a href="mailto:liuye@thunisoft.com">liuye@thunisoft.com</a></p>
 * @version 1.0
 * @author 由stage工具自动生成
 * @author liuye
 */
public interface TeacherMapper {

    /**
     * 获取教师信息列表
     * @param firstResult 首记录索引，从0开始
     * @param maxResults 获取记录数量
     * @return 教师信息列表
     */
    List<Teacher> getTeachers(@Param("firstResult") int firstResult, @Param("maxResults") int maxResults);
    
    /**
     * 获取教师信息的数量
     * @return 教师信息数量
     */
    int getTeachersCount();
    
    /**
     * 根据 工号 获取教师信息
     * @param id 教师信息 工号
     * @return 教师信息
     */
    Teacher getTeacherById(Integer id);
    
    /**
     * 添加教师信息
     * @param teacher 教师信息
     */
    void addTeacher(Teacher teacher);
    
    /**
     * 更新教师信息
     * @param teacher 教师信息
     */
    void updateTeacher(Teacher teacher);
    
    /**
     * 删除教师信息
     * @param id 教师信息 工号
     */
    void deleteTeacherById(Integer id);
}
